package com.coderbd.entity;

public class TargetEmail {
    private Long id;
    private String toAddress;
    private boolean isSent;

    public TargetEmail() {
    }

    public TargetEmail(Long id, String toAddress, boolean isSent) {
        this.id = id;
        this.toAddress = toAddress;
        this.isSent = isSent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public boolean isIsSent() {
        return isSent;
    }

    public void setIsSent(boolean isSent) {
        this.isSent = isSent;
    }

}
