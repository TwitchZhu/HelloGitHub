package edu.unimelb.swen.ll.business.dao;

import edu.unimelb.swen.ll.business.pojo.po.BaseChampion;
import edu.unimelb.swen.ll.system.MyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: twitch zhu
 * @Date: 2024/8/4
 * @description: get info from database; this Dao is all about Champion
 */
@Mapper
public interface ChampionDao extends MyMapper<BaseChampion> {

    /**
     * @param: championId
     * @return: List<BaseChampion>
     * @description: sear the champion by its id
     */
    List<BaseChampion> getChampionByChampionId(Integer championId);

}
