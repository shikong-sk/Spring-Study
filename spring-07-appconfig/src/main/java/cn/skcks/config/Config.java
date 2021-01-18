package cn.skcks.config;

import cn.skcks.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 也会被 Spring 托管, 注册到容器中, 本身也是一个 @Component
// @Configuration 代表这是一个配置类, 相当于 beans.xml
@Configuration
// 扫描包路径
@ComponentScan("cn.skcks.pojo")
// 相当于 import 标签
@Import(Config2.class)
public class Config {

	// 注册一个 Bean, 相当于 bean 标签
	// 方法名 就是 bean 中的 id
	// 返回值 就是 bean 中的 class
	@Bean
	public User user(){
		return new User();
	}
}