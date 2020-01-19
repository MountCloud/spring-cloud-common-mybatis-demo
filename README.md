# spring-cloud-common-mybatis-demo

This project is https://github.com/MountCloud/spring-cloud-common-mybatis demo.

Configuration file information in config server:

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
