package com.yinlei;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseDao<T> {

	// ���浱ǰ������������е�ʵ�ʵ�����
	private Class clz;

	// ����
	private String tableName;

	// ���캯�� 1����ȡ��ǰ������Ĳ���������
	// 2����ȡ������������ʵ�ʵĶ���(class)
	public BaseDao() {
		// this ��ʾ��ǰ������
		// this.getClass();//��ǰ��������ֽ���
		// this.getClass().getGenericSuperclass(); ��ǰ������ĸ���
		Type type = this.getClass().getGenericSuperclass();
		// ǿ��ת��Ϊ�����������͡�
		ParameterizedType pt = (ParameterizedType) type;
		// ��ȡ�����������й���ʵ�����͵Ķ���
		Type types[] = pt.getActualTypeArguments();
		// ��ȡ�����еĵ�һ��Ԫ��
		clz = (Class) types[0];
		// ���� ��������һ����
		tableName = clz.getSimpleName();
	}

	/**
	 * ������ѯ
	 * 
	 * @param id
	 *            ����
	 * @return ��װ��Ķ���
	 */
	public T findById(int id) {

		String sql = "select * from" + tableName + " where id =?";
		
		return null;
	}
}
