package com.xupeng.allsearch.example;

public class AipResult {
    private Boolean success;

    private Object object;

    public AipResult(Boolean success, Object object) {
        this.success = success;
        this.object = object;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
