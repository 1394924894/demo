## 启动步骤
1. eureka-server
2. zuul-server
3. 在启动紫的服务
# demo
demo
借鉴：https://github.com/xuejian0616/spring-boot-cloud-zuul-eureka-swagger-demo

笔记：namespace 要具体到com.jie.demo.mapper.UserMapper
yml 配置
mybatis:
  configuration:
    map-underscore-to-camel-case: true
    use-generated-keys: true
  mapper-locations: classpath*:mappers/*.xml
  #配置Mapper扫描的实体类包
  typeAliasesPackage: com.jie.demo.model

 routes:
     login-server:
       path: /login/**
     xx-server:
              path: /login/**
 @Id 注明是主键 
 @Param(value="username")String username 在此注明之后就不用在 mapper.xml中 写parameterType参数
 
http://localhost:8096/swagger-ui.html
 
  githup  https://github.com/1394924894/demo.git
 
 base 参考 https://blog.csdn.net/qq_36599564/article/details/102976591
 
 
 分页
 // https://www.cnblogs.com/zhenghengbin/p/9368518.html
 <dependency>
             <groupId>com.github.pagehelper</groupId>
             <artifactId>pagehelper</artifactId>
             <version>5.1.2</version>
         </dependency>
         <dependency>
             <groupId>com.github.pagehelper</groupId>
             <artifactId>pagehelper-spring-boot-autoconfigure</artifactId>
             <version>1.3.0</version>
         </dependency>
         <dependency>
             <groupId>com.github.pagehelper</groupId>
             <artifactId>pagehelper-spring-boot-starter</artifactId>
             <version>1.2.3</version>
         </dependency>
         
         
     忽略提交不必要的文件
     https://www.cnblogs.com/jpfss/p/11880553.html