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
 * �Զ���ע��(����һ������)
 * 
 * @author wuyin
 *
 */
@Target({TYPE, //����
	FIELD,//�ֶ�
	METHOD, //����
	PARAMETER,//����
	CONSTRUCTOR,//������
	LOCAL_VARIABLE})//�ֲ�����
//Ԫע��2��ָ��ע�����������
//@Retention(RetentionPolicy.SOURCE) //ע��ֻ��Դ�뼶����Ч
@Retention(RetentionPolicy.RUNTIME) //ע��ֻ������ʱ����Ч
//@Retention(RetentionPolicy.CLASS) //ע��ֻ���ֽ��뼶����Ч
public @interface Author {

	/**
	 * ע������
	 * 	1�����η�Ĭ�ϻ���public
	 *  2������������
	 */

	String name();
	int age() default 30 ;
	
	//(��һ��value����)���ע���������value������Բ���дvalue
	//String value();
}
