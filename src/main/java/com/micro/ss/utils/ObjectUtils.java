package com.micro.ss.utils;

import java.lang.reflect.Method;

/**
 * @author micro
 * @date 2017年7月12日
 * @description :
 */
public class ObjectUtils {

	/**
	 * 自己造轮子
	 */
	public static void mergeObjectPropertiesByOldObjectProprioty(Object o1, Object o2) {
		if (!o1.getClass().equals(o2.getClass())) {
			return;
		}
		Method[] methods = o2.getClass().getMethods();
		try {
			for (Method method : methods) {
				String name = method.getName();
				if (name.startsWith("get")) {
					Object o1Value = method.invoke(o1, null);
					Object o2Value = method.invoke(o2, null);
					if (o2Value != null && !o2Value.equals(o1Value)) {
						// 获取setter
						String property = name.substring(3, name.length());
						String setter = "set" + property;
						for (Method m : methods) {
							if (m.getName().equals(setter)) {
								m.invoke(o1, o2Value);
							}
						}
					}
				}
			}
		} catch (Exception ex) {
			// TODO record log
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User();
		u1.setId(1L);
		u1.setName("micro");
		u2.setId(4L);
		u2.setName("micro");
		mergeObjectPropertiesByOldObjectProprioty(u1, u2);
		System.out.println(u1);
		System.out.println(u2);
	}

	public static class User {
		private Long id;
		private String name;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + "]";
		}

	}
}
