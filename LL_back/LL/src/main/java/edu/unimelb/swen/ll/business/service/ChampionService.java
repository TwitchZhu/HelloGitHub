package edu.unimelb.swen.ll.business.service;

import edu.unimelb.swen.ll.business.dao.ChampionDao;
import edu.unimelb.swen.ll.business.pojo.po.BaseChampion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: twitch zhu
 * @Date: 2024/8/8
 * @description: champion relative
 */
@Slf4j
@Service
public class ChampionService {

    @Autowired
    private ChampionDao championDao;

    public List<BaseChampion> getChampionInfo(Integer championId) throws Exception {
        int test = 1;
        try {
            return championDao.getChampionByChampionId(championId);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("getChampionInfo error!" + e.getMessage());
        }
    }
}
