package com.yinlei;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解(描述一个作者)
 * 
 * @author wuyin
 *
 */
@Target({TYPE, //类型
	FIELD,//字段
	METHOD, //方法
	PARAMETER,//参数
	CONSTRUCTOR,//构造器
	LOCAL_VARIABLE})//局部变量
//元注解2、指定注解的生命周期
//@Retention(RetentionPolicy.SOURCE) //注解只在源码级别有效
@Retention(RetentionPolicy.RUNTIME) //注解只在运行时期有效
//@Retention(RetentionPolicy.CLASS) //注解只在字节码级别有效
public @interface Author {

	/**
	 * 注解属性
	 * 	1、修饰符默认或者public
	 *  2、不能有主体
	 */

	String name();
	int age() default 30 ;
	
	//(就一个value属性)如果注解的名称是value，则可以不用写value
	//String value();
}
