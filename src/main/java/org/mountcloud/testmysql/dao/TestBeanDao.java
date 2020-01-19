package org.mountcloud.testmysql.dao;

import org.mountcloud.springcloud.common.mybatis.dao.BaseDao;
import org.mountcloud.testmysql.entity.TestBean;
import org.mountcloud.testmysql.mapper.TestBeanMapper;
import org.springframework.stereotype.Repository;

/**
 * @author zhanghaishan
 * @version V1.0
 * TODO:
 * 2020/1/17.
 */
@Repository
public class TestBeanDao extends BaseDao<TestBean, TestBeanMapper> {
}
