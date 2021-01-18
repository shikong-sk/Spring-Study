package cn.skcks.config;

import cn.skcks.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 也会被 Spring 托管, 注册到容器中, 本身也是一个 @Component
// @Configuration 代表这是一个配置类, 相当于 beans.xml
@Configuration
public class Config2 {

	// 注册一个 Bean, 相当于 bean 标签
	// 方法名 就是 bean 中的 id
	// 返回值 就是 bean 中的 class
	@Bean
	public User user(){
		return new User();
	}
}