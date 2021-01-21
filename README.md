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