package com.example.api_recyclar_stringbuilder;

public class JsonModel {
    StringBuilder id,name,mobile,dateinfo,password,email;

    public JsonModel(StringBuilder id, StringBuilder name, StringBuilder mobile, StringBuilder dateinfo, StringBuilder password, StringBuilder email) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.dateinfo = dateinfo;
        this.password = password;
        this.email = email;
    }

    public StringBuilder getId() {
        return id;
    }

    public void setId(StringBuilder id) {
        this.id = id;
    }

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public StringBuilder getMobile() {
        return mobile;
    }

    public void setMobile(StringBuilder mobile) {
        this.mobile = mobile;
    }

    public StringBuilder getDateinfo() {
        return dateinfo;
    }

    public void setDateinfo(StringBuilder dateinfo) {
        this.dateinfo = dateinfo;
    }

    public StringBuilder getPassword() {
        return password;
    }

    public void setPassword(StringBuilder password) {
        this.password = password;
    }

    public StringBuilder getEmail() {
        return email;
    }

    public void setEmail(StringBuilder email) {
        this.email = email;
    }
}