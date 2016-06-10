package com.yinlei;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * 测试，自定义注解的语法
 * 
 * @author wuyin
 *
 */
public class App_01 {

	// /**
	// *
	// */
	// @Author(name = "若兰明月", age = 10)
	// public void save(){
	//
	// }

	@Test
	@Author(name = "zhangs", age = 20)
	public void save() throws Exception {
		// 获取注解信息： name/age/id
		// 1. 先获取代表方法的Method类型;
		Class clazz = App_01.class;
		Method m = clazz.getMethod("save");
		// 2.再获取方法上的注解
		Author author = m.getAnnotation(Author.class);
		// 获取输出注解的信息
		System.out.println(author.age());
		System.out.println(author.name());
	}

	public void testMain() throws Exception {

	}
}
