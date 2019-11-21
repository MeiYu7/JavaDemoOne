package com.myq.pojo;

import java.io.Serializable;


public class VoResponse implements Serializable {

    private static final long serialVersionUID = 7476675749169643736L;
    //请求是否成功
    public boolean isSuccess;
    //返回url
    public String retUrl;
    //提示信息
    public String info;
    /**
     * 数据
     */
    public Object data;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getRetUrl() {
        return retUrl;
    }

    public void setRetUrl(String retUrl) {
        this.retUrl = retUrl;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static VoResponse getVoResponse(Object data){
        VoResponse voResponse = new VoResponse();
        voResponse.setData(data);
        voResponse.setSuccess(true);

        return voResponse;
    }

    public static VoResponse getVoResponse(){
        VoResponse voResponse = new VoResponse();
        voResponse.setSuccess(true);

        return voResponse;
    }

    public static VoResponse getFailVoResponse(){
        VoResponse voResponse = new VoResponse();
        voResponse.setSuccess(false);

        return voResponse;
    }
}