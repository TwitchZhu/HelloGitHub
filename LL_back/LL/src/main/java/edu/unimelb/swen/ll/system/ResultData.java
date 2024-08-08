package edu.unimelb.swen.ll.system;

import lombok.Data;

/**
 * @author: twitch
 * @Date: 2024/8/4
 * @description: every data from back end should be contained in ResultData.data .When the front end
 * get the json, please check the code first.
 */
@Data
public class ResultData<T> {

    // result code: 1-success 0-fail  BaseConstants.ResultDataCodeSuccess
    private Integer code = 1;
    // result message: "Success" or "Fail"
    private String message = "Success";
    // result data
    private T data;

    public ResultData() {
    }

    public ResultData(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultData(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public ResultData(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultData(T data) {
        this.data = data;
    }

}
