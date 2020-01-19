package org.mountcloud.testmysql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mountcloud.springproject.common.util.GsonUtil;
import org.mountcloud.testmysql.entity.TestBean;
import org.mountcloud.testmysql.service.TestBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zhanghaishan
 * @version V1.0
 * TODO:
 * 2020/1/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestMySqlApplication.class})// 指定启动类
public class TestMybatis {

    @Autowired
    private TestBeanService service;

    @Test
    public void testSave(){
        TestBean testBean = new TestBean();
        testBean.setName("123");
        testBean = service.save(testBean);
        System.out.println(GsonUtil.GsonString(testBean));
    }

    @Test
    public void testFind(){
        TestBean testBean = new TestBean();
        testBean.setName("123");
        List<TestBean> list = service.findList(testBean);
        TestBean one = service.findOne(testBean);
        Long size = service.listCount(testBean);
        System.out.println(list.size()+","+one.getId()+","+size);
    }

    @Test
    public void testUpdate(){
        TestBean testBean = new TestBean();
        testBean.setId(1L);
        testBean.setName("hehe");
        testBean = service.update(testBean);
        System.out.println(GsonUtil.GsonString(testBean));
    }

    @Test
    public void testDelete(){
        TestBean testBean = new TestBean();
        testBean.setId(1L);
        boolean b1 = service.delete(testBean);
        boolean b2 = service.delete(2L);
        System.out.println(b1+","+b2);
    }
}
