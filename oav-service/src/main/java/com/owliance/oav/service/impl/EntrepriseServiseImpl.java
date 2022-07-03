package com.owliance.oav.service.impl;


import com.google.common.base.Preconditions;
import com.owliance.oav.vo.EntrepriseVo;
import service.BaseService;
import com.owliance.oav.bvo.EntrepriseBvo;
import com.owliance.oav.bvo.Token;
import com.owliance.oav.dto.EntrepriseINSEE;
import com.owliance.oav.repository.EntrepriseRepositoryDao;
import com.owliance.oav.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Service
public class EntrepriseServiseImpl extends BaseService implements EntrepriseService {

    @Autowired
    private EntrepriseRepositoryDao entrepriseRepositoryDao;

    private RestTemplate restTemplate = new RestTemplate();

    private Token getToken() {
        String url = "https://api.insee.fr/token";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Basic YXlXUGtWd1BOX00yQ1pCWk1pbzJfdmZSbkZFYTphNzZYa1dWNmFlRmRJMHphMTVJbWdIQWJxUjhh");
        httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("grant_type", "client_credentials");
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, httpHeaders);
        ResponseEntity<Token> responseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, new ParameterizedTypeReference<Token>() {
        });
        return responseEntity.getBody();
    }

    @Override
    public List<EntrepriseBvo> getAllEntreprises() {
        return listVoToBvo(entrepriseRepositoryDao.findAll(), EntrepriseBvo.class);
    }

    @Override
    public EntrepriseINSEE getEntreprise(String siretInfo) {
        Token tokenRes = getToken();
        String accessToken = tokenRes.getAccessToken();
        String url = "https://api.insee.fr/entreprises/sirene/V3/siret";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type","application/json");
        httpHeaders.set("Accept","application/json");
        httpHeaders.set("Authorization","Bearer "+accessToken);
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url).queryParam("q", "siret:"+siretInfo);
        URI uri = builder.build().toUri();
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(httpHeaders);
        ResponseEntity<EntrepriseINSEE> responseEntity = restTemplate.exchange(uri,HttpMethod.GET,entity,new ParameterizedTypeReference<EntrepriseINSEE>(){});
        return responseEntity.getBody();
    }

    @Override
    public EntrepriseBvo createEntreprise(EntrepriseBvo entrepriseBvo) {
        return voToBvo(entrepriseRepositoryDao.saveAndFlush(bvoToVo(entrepriseBvo, EntrepriseVo.class)),EntrepriseBvo.class);
    }

    @Override
    public EntrepriseBvo updateEntreprise(EntrepriseBvo entrepriseBvo) {
        Preconditions.checkNotNull(entrepriseBvo.getApe());
        Preconditions.checkArgument(entrepriseBvo.getApe().length() > 0);
        Preconditions.checkNotNull(entrepriseBvo.getRaisonSociale());
        Preconditions.checkArgument(entrepriseBvo.getRaisonSociale().length() > 0);
        EntrepriseVo entityToBePersisted = bvoToVo(entrepriseBvo, EntrepriseVo.class);
        return voToBvo(entrepriseRepositoryDao.saveAndFlush(entityToBePersisted), EntrepriseBvo.class);
    }



}
