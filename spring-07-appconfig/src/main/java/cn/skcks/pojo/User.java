package cn.skcks.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 表明这个类被 Spring 托管, 注册到了容器中
@Component
public class User {
	private String name;

	public String getName() {
		return name;
	}

	@Value("Shikong") // 属性注入值
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}