package org.mountcloud.testmysql.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author zhanghaishan
 * @version V1.0
 * TODO:
 * 2020/1/17.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({TestConfig.class})
public @interface EnableTestConfig {
}
