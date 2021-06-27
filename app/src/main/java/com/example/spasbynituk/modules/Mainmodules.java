package com.example.spasbynituk.modules;

public class Mainmodules {
    String cname , ccode , ccredit;

    public Mainmodules(String cname, String ccode, String ccredit) {
        this.cname = cname;
        this.ccode = ccode;
        this.ccredit = ccredit;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getCcredit() {
        return ccredit;
    }

    public void setCcredit(String ccredit) {
        this.ccredit = ccredit;
    }
}
