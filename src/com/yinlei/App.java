package com.yinlei;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class App {

	@Test
	public void testInfo() throws Exception {
		// ��ȫ��
		String className = "com.yinlei.Admin";
		// �õ�����ֽ���
		Class<?> clazz = Class.forName(className);
		// �������� //
		// Admin admin = (Admin) clazz.newInstance();

		// �������� ͨ������������
		Constructor<?> constructor = clazz.getDeclaredConstructor();
		Admin admin = (Admin) constructor.newInstance();

	}

	@Test
	// 2. ��ȡ�������ơ�ֵ
	public void testField() throws Exception {

		// ��ȫ��
		String className = "com.yinlei.Admin";
		// �õ����ֽ���
		Class<?> clazz = Class.forName(className);
		// ����
		Admin admin = (Admin) clazz.newInstance();

		// ��ȡ���е���������
		Field[] fs = clazz.getDeclaredFields();
		// ���������ÿһ���������ơ�ֵ
		for (Field f : fs) {
			// ����ǿ�Ʒ���
			f.setAccessible(true);
			// ����
			String name = f.getName();
			// ֵ
			Object value = f.get(admin);

			System.out.println(name + value);
		}
	}
	
	@Test
	//3. �����ȡ����
	public void testMethod() throws Exception {
		
		// ��ȫ��
		String className = "com.yinlei.Admin";
		// �õ����ֽ���
		Class<?> clazz = Class.forName(className);
		// ����
		Admin admin =  (Admin) clazz.newInstance();
		
		// ��ȡ��������    public int getId() {
		Method m = clazz.getDeclaredMethod("getId");
		// ���÷���
		Object r_value = m.invoke(admin);
		
		System.out.println(r_value);
	}
	
}
