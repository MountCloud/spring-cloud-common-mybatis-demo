package org.mountcloud.testmysql.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author zhanghaishan
 * @version V1.0
 * TODO:
 * 2020/1/17.
 */
//@AutoConfigureAfter(JdbcConfig.class)
@EnableConfigurationProperties
public class TestConfig {

//    @Bean
//    public TestBean getBean(){
//        return new TestBean();
//    }


//    @Value("${mybatis.mapper.basePackage}")
//    private String basePackage;


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {

        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("org.mountcloud.testmysql.mapper.**");
        return mapperScannerConfigurer;
    }


}
