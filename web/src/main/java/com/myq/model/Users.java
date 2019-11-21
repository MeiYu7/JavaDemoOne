package com.myq.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "com.myq.model.User")
public class Users implements Serializable {

    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "name")
    private String name;

    @ApiModelProperty(value = "account")
    private String account;

    @ApiModelProperty(value = "password")
    private String password;

    @ApiModelProperty(value = "sex")
    private int sex;

    @ApiModelProperty(value = "info")
    private String info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", sex=").append(sex);
        sb.append(", info=").append(info);
        sb.append("]");
        return sb.toString();


    }


}
