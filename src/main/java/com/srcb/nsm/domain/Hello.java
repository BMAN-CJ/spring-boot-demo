package com.srcb.nsm.domain;


public class Hello {

    private int id;
    private String name;

    public Hello(int id, String name) {
        this.id = id;
        this.name = name;
	}
	/**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
