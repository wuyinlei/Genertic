package utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;

/**
 * ����һ���ֶ�
 */
@Target({FIELD})
@Retention(RetentionPolicy.RUNTIME)  // ָ��ע��������ʱ����Ч
public @interface Column {

	String columnName();
}
