package com.guo.offer.testmath;

/**
 * @author Dale java�е��Զ�װ������� ��һ��˵��װ������Զ���������������ת��Ϊ��װ�����ͣ�
 * ��������Զ�����װ������ת��Ϊ�����������͡�
 */
public class Number {
	public static void main(String[] args) {

		Integer i3 = 128; // װ�䣬�൱�� Integer.valueOf(128);
		int t = i3; // �൱�� i1.intValue() ����
		System.out.println(t);

		/**
		 * ���ڨC128��127��Ĭ����127��֮���ֵ,��װ��󣬻ᱻ�����ڴ���������� ����������������ֵ,
		 * ϵͳ������new һ������
		 */
		Integer i1 = 200;
		Integer i2 = 200;

		/**
		 * ע�� == �� equals������ == ���Ƚϵ��Ƕ���ĵ�ַ equlas �Ƚϵ��Ƕ��������
		 */
		if (i1 == i2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}