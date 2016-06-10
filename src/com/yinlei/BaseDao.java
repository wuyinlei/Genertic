package com.yinlei;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseDao<T> {

	// 保存当前运行类的类型中的实际的类型
	private Class clz;

	// 表名
	private String tableName;

	// 构造函数 1、获取当前运行类的参数化类型
	// 2、获取参数化类型中实际的定义(class)
	public BaseDao() {
		// this 表示当前运行类
		// this.getClass();//当前运行类的字节码
		// this.getClass().getGenericSuperclass(); 当前运行类的父类
		Type type = this.getClass().getGenericSuperclass();
		// 强制转换为‘参数化类型’
		ParameterizedType pt = (ParameterizedType) type;
		// 获取参数化类型中关于实际类型的定义
		Type types[] = pt.getActualTypeArguments();
		// 获取数据中的第一个元素
		clz = (Class) types[0];
		// 表名 与类名是一样的
		tableName = clz.getSimpleName();
	}

	/**
	 * 主键查询
	 * 
	 * @param id
	 *            主键
	 * @return 封装后的对象
	 */
	public T findById(int id) {

		String sql = "select * from" + tableName + " where id =?";
		
		return null;
	}
}
