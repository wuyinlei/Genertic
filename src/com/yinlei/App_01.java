package com.yinlei;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * ���ԣ��Զ���ע����﷨
 * 
 * @author wuyin
 *
 */
public class App_01 {

	// /**
	// *
	// */
	// @Author(name = "��������", age = 10)
	// public void save(){
	//
	// }

	@Test
	@Author(name = "zhangs", age = 20)
	public void save() throws Exception {
		// ��ȡע����Ϣ�� name/age/id
		// 1. �Ȼ�ȡ��������Method����;
		Class clazz = App_01.class;
		Method m = clazz.getMethod("save");
		// 2.�ٻ�ȡ�����ϵ�ע��
		Author author = m.getAnnotation(Author.class);
		// ��ȡ���ע�����Ϣ
		System.out.println(author.age());
		System.out.println(author.name());
	}

	public void testMain() throws Exception {

	}
}
