package com.noandroid.familycontacts.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "RECORD".
 */
public class Record {

    private Long id;
    /** Not-null value. */
    private java.util.Date time;
    private int status;
    /** Not-null value. */
    private String telephoneNumber;

    public Record() {
    }

    public Record(Long id) {
        this.id = id;
    }

    public Record(Long id, java.util.Date time, int status, String telephoneNumber) {
        this.id = id;
        this.time = time;
        this.status = status;
        this.telephoneNumber = telephoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public java.util.Date getTime() {
        return time;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTime(java.util.Date time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /** Not-null value. */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

}
