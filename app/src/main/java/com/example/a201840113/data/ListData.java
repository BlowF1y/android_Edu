package com.example.a201840113.data;

public class ListData {
    private String name;
    private String number;
    private Boolean ok;



    public ListData(String name, String number, Boolean ok) {
        this.name = name;
        this.number = number;
        this.ok = ok;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }
}
