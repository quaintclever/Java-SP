package com.quaint.algorithm.year2019.philosopher;

/**
 * @Description:
 * @author: qi cong
 * @Date: Created in 2019/10/24 11:49
 */
public class Chopsticks {

    // 谁拿的
    private String name;
    // 有没有被拿
    private boolean status;

    public Chopsticks(String name,boolean status) {
        this.name = name;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
