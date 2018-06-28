# project1
简单的注册登录留言功能  :javaBean+jsp+servlet+mysql

遇到的一些问题:

1.利用jquery重定向和跳转

:https://blog.csdn.net/rentian1/article/details/77880828

2.报错：Cannot call sendRedirect() after the response has been committed/HTTP Status 405:

https://blog.csdn.net/theblackbeard/article/details/53355372

3.JSP实现界面的自动跳转的几种方式：

https://blog.csdn.net/marksinoberg/article/details/50445747

4.报错：can't write duplicate key in table #‘sql_XXXXX’

外键重名了

5.多线程使用同一个数据库connection的后果:

https://www.aliyun.com/jiaocheng/295485.html

6.由于外键的存在引发的一个mysql问题 Cannot change column 'id': used in a foreign key constraint:

http://www.cnblogs.com/jiqing9006/p/5019947.html

7.java.util.Date和java.sql.Date的区别和相互转化:

https://blog.csdn.net/qin_zhimou/article/details/55509769

8.Maven创建的Web项目无法使用EL表达式:

https://blog.csdn.net/yuguiyang1990/article/details/10419759

9.解决maven工程在tomcat部署后WEB-INF下没有lib目录:

https://blog.csdn.net/zhongyangjian/article/details/70170389

10.EL表达式类对象访问私有属性:

EL表达式类对象访问私有属性

11.富文本编辑器:UEditor

http://fex.baidu.com/ueditor/

12.时间格式转化时java.text.ParseException: Unparseable date: ""异常:

https://blog.csdn.net/zzq900503/article/details/11906105

13.MySQL外键 Cannot add or update a child row错误的实例解释:

https://blog.csdn.net/garcon1986/article/details/5337336

14.数据库如何给含有外键的表中插入数据？:

https://blog.csdn.net/kxx535943581/article/details/47816109（其实只是关闭了检查，最简单的方法是外键删掉，反正不会用，还不如删掉）

15.报错:The JSP specification requires that an attribute name is preceded by whitespace

https://blog.csdn.net/xinmashang/article/details/38492349

16.把js  new Date转换成想要的时间 yyyy-mm-dd  hh-min:
https://www.jianshu.com/p/15ffa504b877<br/>
1７.换成了ubuntu的系统,以前的项目都没有了,把这个导入现在的系统,发生报错:```org.apache.jasper.JasperException: Failed to load or instantiate TagLibraryV``` 一看就是jar包冲突了,于是我按报错找到jstl.jar把它删了，又报错```java.lang.NoClassDefFoundError: javax/servlet/jsp/jstl/core/ConditionalTagSupport```,wtf,刚删找不到???,后来一百度，原来有人和我一样:<br/>https://blog.csdn.net/xlgen157387/article/details/51345220
18.还有一个报错```Unknown system variable 'query_cache_size'```原来是我原先装的mysql5的版本,现在装的mysql8的版本,将mysql-connection调高就好了<br/>
https://www.cnblogs.com/nicknailo/articles/9074804.html

