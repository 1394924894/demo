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
 
 @Id 注明是主键 