package org.mountcloud.testmysql.entity;

import org.mountcloud.springproject.common.entity.BaseEntity;

public class TestBean extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column testbean.name
     *
     * @mbg.generated Sat Jan 18 21:14:38 CST 2020
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column testbean.name
     *
     * @return the value of testbean.name
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column testbean.name
     *
     * @param name the value for testbean.name
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }
}