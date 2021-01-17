package cn.skcks.pojo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等同于 <bean id="user" class="cn.skcks.pojo.User"/>
@Component
// @Scope("singleton") // 单例
@Scope("prototype") // 原型
public class User {
	// 相当于 <property name="name" value="Shikong"/>
	@Value("Shikong")
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}