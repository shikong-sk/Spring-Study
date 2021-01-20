package cn.skcks.custom;

// 自定义切面
public class CustomPointCut {

	public void before(){
		System.out.println("================ 方法执行前 ================");
	}

	public void after(){
		System.out.println("================ 方法执行后 ================");
	}

}