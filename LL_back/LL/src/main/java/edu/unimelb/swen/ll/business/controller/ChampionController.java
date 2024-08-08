package edu.unimelb.swen.ll.business.controller;

import edu.unimelb.swen.ll.business.pojo.po.BaseChampion;
import edu.unimelb.swen.ll.business.service.ChampionService;
import edu.unimelb.swen.ll.system.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author: twitch zhu
 * @Date: 2024/8/4
 * @description: champion
 */
@Api("英雄")
@RestController
@RequestMapping("/champion")
public class ChampionController {

    @Autowired
    private ChampionService championService;

    /**
     * get info about champion by championId
     * @param: championId
     * @return: ResultData<List<BaseChampion>>
     */
    @PostMapping("/getChampionInfo")
    @ApiOperation("获取英雄基本信息")
    public ResultData<List<BaseChampion>> getChampionInfoById(@RequestParam Integer championId) throws Exception {
        return new ResultData<>(0, "保存成功", championService.getChampionInfo(championId));
    }

}
