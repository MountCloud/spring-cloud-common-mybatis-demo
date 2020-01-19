package org.mountcloud.testmysql.service;

import org.mountcloud.mybatisplugin.MybatisUtil;
import org.mountcloud.springcloud.common.mybatis.service.BaseMybatisService;
import org.mountcloud.testmysql.dao.TestBeanDao;
import org.mountcloud.testmysql.entity.TestBean;
import org.mountcloud.testmysql.entity.TestBeanExample;
import org.springframework.stereotype.Service;

/**
 * @author zhanghaishan
 * @version V1.0
 * TODO:
 * 2020/1/17.
 */
@Service
public class TestBeanService extends BaseMybatisService<TestBean, TestBeanDao> {
    @Override
    public TestBeanExample getExample(TestBean bean) {
        TestBeanExample testBeanExample = new TestBeanExample();
        TestBeanExample.Criteria criteria = testBeanExample.createCriteria();
        MybatisUtil.setAutoExample(criteria,bean);
        return testBeanExample;
    }
}
