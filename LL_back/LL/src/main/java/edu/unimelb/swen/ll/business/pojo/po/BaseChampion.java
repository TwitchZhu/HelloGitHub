package edu.unimelb.swen.ll.business.pojo.po;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author: twitch zhu
 * @Date: 2024/8/4
 * @description: Champion
 */
@Data
@Table(name = "student")
public class BaseChampion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 请在此描述字段名称以及作用
    private String description;

    // 请在此描述字段名称以及作用
    private Integer value;
}
