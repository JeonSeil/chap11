package test0304;

/*
* ������ ���� �������� �������� �ڵ带 �ϼ��Ͻÿ�
* [���]
fullPath=c:/jdk11/work/PathSeparateTest.java
path=c:/jdk11/work
fileName=PathSeparateTest.java
*/
public class Test3 {
public static void main(String[] args) {
 String fullPath = "c:/jdk11/work/PathSeparateTest.java";
 String path = "";
 String fileName = "";
 int idx = fullPath.lastIndexOf("/");
 path = fullPath.substring(0,idx);
 fileName = fullPath.substring(idx+1);
 System.out.println("fullPath=" + fullPath);
 System.out.println("path=" + path);
 System.out.println("fileName=" + fileName);
}
}
