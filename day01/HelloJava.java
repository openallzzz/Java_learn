/*
1. java规范的三种注释方法
   @1 单行注释
   @2 多行注释
   @3 文档注释(java特有)

2. 单行注释和多行注释的作用
   @1 对所写的程序进行解释说明，增强可读性，方便自己与他人阅读。
   @2 可以调试所写代码

3. 特点
   @1 单行注释和多行注释不参与编译，即编译生成的以.class结尾的字
	  节码文件中不包含注释中的信息

4. 文档注释的使用：
	注释内容可以被JDK提供的 javadoc 所解析，生成一套以网页文件形式体现的该程序的说明文档

5. 多行注释不可以嵌套使用
*/

/**
文档注释
@author Zy
@version v1.0
这是我的第一个java程序！
*/
public class HelloJava 
{
	/* 
	多行注释：
	单行注释: 如下main方法表示程序的入口
	main的格式是固定的

	*/
	public static void main(String[] args) 
	{
		// 单行注释：如下语句表示输出到控制台的意思
		System.out.println("Hello World!");
	}
}
