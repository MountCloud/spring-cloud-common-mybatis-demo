# spring-cloud-common-mybatis-demo

This project is https://github.com/MountCloud/spring-cloud-common-mybatis demo.

## Configuration file information in config server:
## 配置中心的配置文件内容：

```
mybatis:
   db:
      minIdle: 10
      validationQuery: SELECT 1
      initialSize: 1
      maxWait: 60000
      filters: stat
      url: jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&tinyInt1isBit=false&serverTimezone=UTC
      username: root
      password: 123456
      logAbandoned: true
      maxIdle: 15
      testWhileIdle: true
      maxOpenPreparedStatements: 20
      testOnBorrow: false
      removeAbandoned: true
      timeBetweenEvictionRunsMillis: 60000
      minEvictableIdleTimeMillis: 300000
      testOnReturn: false
      removeAbandonedTimeout: 1800
      driverClassName: com.mysql.cj.jdbc.Driver
      maxActive: 200
   mapper:
      resource: classpath:org/mountcloud/testmysql/mapper/*.xml
      package: org.mountcloud.testmysql.mapper.**
```

## You need to see the following in this demo
## 你需要查看这个demo中的以下内容：

1：pom.xml plugins-插件列表，resources-资源列表

```
    <build>
        <plugins>
            <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>1.3.5</version>
                <configuration>
                    <configurationFile>src/main/resources/mybatis/generatorConfig.xml</configurationFile>
                    <verbose>true</verbose>
                    <overwrite>true</overwrite>
                </configuration>
                <executions>
                    <execution>
                        <id>Generate MyBatis Artifacts</id>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                    </execution>
                </executions>
                <dependencies>
                    <!--  需要依赖的jar required!必须！ -->
                    <dependency>
                        <groupId>org.mountcloud</groupId>
                        <artifactId>spring-project-common</artifactId>
                        <version>1.1.1</version>
                    </dependency>
                    <!--  需要依赖的jar required!必须！ -->
                    <dependency>
                        <groupId>org.mountcloud</groupId>
                        <artifactId>mybatisplugin</artifactId>
                        <version>1.2</version>
                    </dependency>
                    <!-- MYSQL JDBC required!必须！ -->
                    <dependency>
                        <groupId>mysql</groupId>
                        <artifactId>mysql-connector-java</artifactId>
                        <version>8.0.18</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
        <!-- 必须！必须！必须！required!required!required! -->
        <resources>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
                <filtering>false</filtering>
            </resource>
        </resources>
    </build>
```

2：generatorConfig.xml  ,is generator mysql table mybatis class.用来生成mybatis的数据库类。

```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE generatorConfiguration PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd" >
<generatorConfiguration>

    <context id="context1">
        <plugin type="org.mountcloud.mybatisplugin.MyBatisKeyPlugin"></plugin>
        <plugin type="org.mountcloud.mybatisplugin.MybatisExampleRootPlugin">
            <property name="exampleRootClass" value="org.mountcloud.springcloud.common.mybatis.entity.BaseExample"/>
        </plugin>
        <plugin type="org.mountcloud.mybatisplugin.MybatisGroupOrderPlugin"></plugin>
        <plugin type="org.mountcloud.mybatisplugin.MybatisMySqlLimitPlugin"></plugin>
        <commentGenerator>
            <!-- 是否去除自动生成的注释 true：是 ： false:否 -->
            <property name="suppressAllComments" value="false"/>
        </commentGenerator>
        <jdbcConnection driverClass="com.mysql.cj.jdbc.Driver"
                        connectionURL="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&amp;characterEncoding=UTF-8&amp;tinyInt1isBit=false&amp;serverTimezone=UTC"
                        userId="root"
                        password="123456"/>

        <!-- 类型转换 -->
        <javaTypeResolver>
            <!-- 是否使用bigDecimal， false可自动转化以下类型（Long, Integer, Short, etc.） -->
            <property name="forceBigDecimals" value="false"/>
        </javaTypeResolver>

        <!-- 生成mapxml文件 -->
        <javaModelGenerator targetPackage="org.mountcloud.testmysql.entity" targetProject="src/main/java">
            <property name="rootClass" value="org.mountcloud.springproject.common.entity.BaseEntity"/>
        </javaModelGenerator>
        <sqlMapGenerator targetPackage="org.mountcloud.testmysql.mapper" targetProject="src/main/java"/>

        <!-- 生成mapxml对应client，也就是接口dao -->
        <javaClientGenerator targetPackage="org.mountcloud.testmysql.mapper" targetProject="src/main/java"
                             type="XMLMAPPER">
            <property name="rootInterface" value="org.mountcloud.springcloud.common.mybatis.mapper.BaseMapper"/>
        </javaClientGenerator>

        <!-- 我们自己的表 -->
        <table schema="test" tableName="testbean" domainObjectName="TestBean">
        </table>
    </context>
</generatorConfiguration>
```
