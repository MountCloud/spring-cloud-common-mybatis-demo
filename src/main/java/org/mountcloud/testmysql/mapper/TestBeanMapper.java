package org.mountcloud.testmysql.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mountcloud.springcloud.common.mybatis.mapper.BaseMapper;
import org.mountcloud.testmysql.entity.TestBean;
import org.mountcloud.testmysql.entity.TestBeanExample;

public interface TestBeanMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testbean
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    long countByExample(TestBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testbean
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    int deleteByExample(TestBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testbean
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testbean
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    int insert(TestBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testbean
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    int insertSelective(TestBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testbean
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    List<TestBean> selectByExample(TestBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testbean
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    TestBean selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testbean
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") TestBean record, @Param("example") TestBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testbean
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    int updateByExample(@Param("record") TestBean record, @Param("example") TestBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testbean
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    int updateByPrimaryKeySelective(TestBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testbean
     *
     * @mbg.generated Sat Jan 18 21:14:46 CST 2020
     */
    int updateByPrimaryKey(TestBean record);

    /**
      * 
      * This method was generated by MyBatis Generator.
      * This method corresponds to the database table testbean
      * 
      */
    List selectCustomByExample(TestBeanExample example);
}