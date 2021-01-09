package io.github.jonesun.sample.test;

/**
 * 通用返回类
 *
 * @author jone.sun
 * @date 2021-01-09 11:28
 */
public class Result {

    /**
     * 成功CODE
     */
    public static final String SUCCESS_CODE = "200";
    /**
     * 成功MSG
     */
    public static final String SUCCESS_MSG = "SUCCESS!";
    /**
     * code
     */
    private String code;
    /**
     * msg
     */
    private String msg;
    /**
     * data
     */
    private Object data;

    public static Result ok(Object obj) {
        Result result = new Result();
        result.code = SUCCESS_CODE;
        result.msg = SUCCESS_MSG;
        result.data = obj;
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
