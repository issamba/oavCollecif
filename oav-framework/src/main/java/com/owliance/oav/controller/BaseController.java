package com.owliance.oav.controller;

import com.owliance.oav.entity.BaseBVO;
import com.owliance.oav.entity.BaseWVO;
import org.dozer.Mapper;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


public abstract class BaseController {

    @Resource
    private Mapper mapper;

    public <T extends BaseBVO, S extends BaseWVO> T wvoToBvo(S  wvo, Class<? extends BaseBVO> bvoClass) {

        if (wvo != null) {
            return (T) mapper.map(wvo, bvoClass);
        } else {
            return null;
        }
    }

    /**
     * Convert a BVO to a WVO.
     *
     * @param <T>      the type parameter
     * @param <S>      the type parameter
     * @param bvo      the bvo
     * @param wvoClass the wvo class
     * @return {@link BaseWVO}
     * <p>
     * Example : TarifWVO wvo = bvoToWvo(bvo, TarifWVO.class);
     * <p>
     * Created : 21 dec. 2016 by fmartinez (version 0.3.2-Alpha) 10:02:18 by hbenizid
     */

    public <T extends BaseWVO, S extends BaseBVO> T bvoToWvo(S bvo, Class<? extends BaseWVO> wvoClass) {

        if (bvo != null) {
            return (T) mapper.map(bvo, wvoClass);
        } else {
            return null;
        }
    }


    public <T extends BaseBVO, S extends BaseWVO> List<T> listWvoToBvo(List<S> wvoList,
                                                                       Class<? extends BaseBVO> bvoClass) {

        List<T> list = new ArrayList<>();

        if (wvoList != null) {
            //logger.info("Class is :  {} | Size is : {}", bvoClass.getSimpleName(), wvoList.size());
            for (S wvo : wvoList) {
                if (wvo != null) {
                    list.add((T) wvoToBvo((S) wvo, bvoClass));
                }
            }
        }
        return list;
    }

    /**
     * Convert a BVO list to a WVO list.
     *
     * @param <T>      the type parameter
     * @param <S>      the type parameter
     * @param bvoList  the bvo list
     * @param wvoClass the wvo class
     * @return {@link List} of {@link BaseWVO}
     * <p>
     * Example : return listBvoToWvo(tarifsBVO, TarifWVO.class);
     * <p>
     * Created : 21 dec. 2016 by fmartinez (version 0.3.2-Alpha) 10:05:22 by hbenizid
     */
    @SuppressWarnings("unchecked")
    public <T extends BaseWVO, S extends BaseBVO> List<T> listBvoToWvo(List<S> bvoList,
                                                                       Class<? extends BaseWVO> wvoClass) {

        List<T> list = new ArrayList<>();
        if (bvoList != null) {
//            logger.info("Class is :  {} | Size is : {}", wvoClass.getSimpleName(), bvoList.size());
            for (S bvo : bvoList) {
                if (bvo != null) {
                    list.add((T) bvoToWvo((S) bvo, wvoClass));
                }
            }
        }
        return list;
    }
}
