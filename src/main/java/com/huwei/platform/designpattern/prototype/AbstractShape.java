package com.huwei.platform.designpattern.prototype;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public abstract class AbstractShape implements Cloneable {

    private String id;
    protected String type;

    /**
     * 画图
     */
    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
