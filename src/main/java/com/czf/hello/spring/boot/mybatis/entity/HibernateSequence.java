package com.czf.hello.spring.boot.mybatis.entity;

import javax.persistence.*;

@Table(name = "hibernate_sequence")
public class HibernateSequence {
    @Column(name = "next_val")
    private Long nextVal;

    /**
     * @return next_val
     */
    public Long getNextVal() {
        return nextVal;
    }

    /**
     * @param nextVal
     */
    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }
}