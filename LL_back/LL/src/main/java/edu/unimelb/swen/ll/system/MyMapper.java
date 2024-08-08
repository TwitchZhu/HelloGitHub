package edu.unimelb.swen.ll.system;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author: twitch
 * @Date: 2024/8/4
 * @description: common mapper
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper {
}
