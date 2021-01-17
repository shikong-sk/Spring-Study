package cn.skcks.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class People {
	// 如果定义 required 为 false 说明这个对象可以为 null, 否则不允许为空
//	@Autowired(required = false)
	@Resource // 默认通过 byName 查找 若找不到则通过 byType 查找
	private Cat cat;

	@Autowired
	@Qualifier("dogTest") // 当 Autowired 无法完成时可尝试 Qualifier 指定 id
	private Dog dog;

	@Nullable // 表示这个字段可以为空
	private String name;

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "People{" +
				"cat=" + cat +
				", dog=" + dog +
				", name='" + name + '\'' +
				'}';
	}
}