# spring 自定义xml标签

# 参考文档

https://docs.spring.io/spring/docs/4.3.x/spring-framework-reference/html/xml-custom.html

# 在线xml生成schema

http://xml.mherman.org/

# 测试用例
src/test/java/com.github.yanglikun.TestMain


#说明
+ AbstractSingleBeanDefinitionParser：
    + 创建单一Bean
    + 任意复杂的xml配置
+ AbstractSimpleBeanDefinitionParser：
    + 创建单一Bean
    + 相对简单的xml配置
    + xml属性和bean属性自动匹配
    + 应该是我们的首选，比较简单
+ AbstractBeanDefinitionParser
    + 创建一个或多个Bean
    + 解析复杂的xml
    + 实在没办法再用这个，因为解析过程要完全自己写，比较复杂
