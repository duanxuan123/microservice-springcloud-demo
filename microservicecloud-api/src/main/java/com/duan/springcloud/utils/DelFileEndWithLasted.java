package com.duan.springcloud.utils;

import java.io.File;

public class DelFileEndWithLasted {
	public static void main(String[] args) {
		File file = new File("C:\\Tools\\apache-maven-repository");
		File file2 = new File("C:\\Tools\\.gradle");
		// 需要使用递归的方法
		deleteFile(file);
	}

	private static void deleteFile(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File file2 : files) {
				deleteFile(file2);
			}
		} else {
			if (file.getName().endsWith("lastUpdated")) {
				file.delete();
				System.out.println(file.getName());
			}
		}
	}

}
