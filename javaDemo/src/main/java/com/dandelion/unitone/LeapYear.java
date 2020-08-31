package com.dandelion.unitone;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 判断某一年是否为闰年
 * @author wx
 * @since 2020/08/31
 */
public class LeapYear {

    /*
    需求：地球绕太阳运行周期为365天5小时48分46秒，比平年的365天多了0.2422日，所余下的时间约为四年累计一天，于第四年第二月份加上1天，使当年
        的天数变为366。现行公历中每400年约有97个闰年。

     计算公式：非整百年份能被4整除的为闰年，整百年份能被400整除的为闰年
     year % 4 ==0 && year % 100 != 0 || year % 400 == 0
     前面的公式 year % 4 == 0 $$ year % 100 != 0 可以看做是第一步，当year%4==0说明输入的年份可以被四整除，但是还需要确定这个年份是不是
     整百年份，如果是整百年份，就不行，这时候出现了第二步，year % 100 != 0,这个公式指定了年份不能是被100整除的数。当前面两个不成立的时候，
     这个时候就用第三个公式year % 400 == 0,整百年份能够被400整除
     */

    public static void main(String[] args) {
        /*//创建扫描器对象
        Scanner  scanner = new Scanner(System.in);
        //提示要进行年份的输入
        System.out.print("请输入年份：");
        //从控制台上面输入一个年份传入变量中
        Long year = scanner.nextLong();
        //进行变量year得判断，利用公式year % 4 ==0 && year % 100 != 0 || year % 400 == 0来进行判断输入是否为闰年
        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }*/

    }

    /**
     * 请判断某一年的的某月某日到某年的某月某日一共经历了多少天
     */
    @Test
    public void LearYear1() throws ParseException {
        String oldYear = "2010-05-04";
        String newYear = "2020-08-31";
        //将传入的年月日以“-”的形式进行切割，将年月日单独的切割开
        String[] oldYearSplits = oldYear.split("-");
        String[] newYearSplits = newYear.split("-");
        //单独获取年月日
        Integer year1 = Integer.parseInt(oldYearSplits[0]);
        Integer month1 = Integer.parseInt(oldYearSplits[1]);
        Integer day1 = Integer.parseInt(oldYearSplits[2]);
        Integer year2 = Integer.parseInt(newYearSplits[0]);
        Integer month2 = Integer.parseInt(newYearSplits[1]);
        Integer day2 = Integer.parseInt(newYearSplits[2]);

        System.out.println(month1);

        Integer daySum = 0;

        //判断从几月几号到12月31号总共存在多少天
        switch (month1) {
            case 12:
                daySum += 0 + (31 - day1);
                break;
            case 11:
                daySum += 31 + (30 - day1);
                break;
            case 10:
                //先不考虑是平年还是闰年，先算出来总共的天数，然后再判断是否为闰年，如果是闰年就在原来的基础上面加上1
                daySum += 31 + 28 + (31 - day1);
                break;
            case 9:
                daySum  += 31 + 28 + 31 + (30 - day1);
                break;
            case 8:
                daySum += 31 + 28 + 31 + 30 + (31 - day1);
                break;
            case 7:
                daySum += 31 + 28 + 31 + 30 + 31 + (30 - day1);
                break;
            case 6:
                daySum += 31 + 28 + 31 + 30 + 31 + 30 + (31 - day1);
                break;
            case 5:
                daySum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + (30 - day1);
                break;
            case 4:
                daySum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31+ (31 - day1);
                break;
            case 3:
                daySum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30+ (30 - day1);
                break;
            case 2:
                daySum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31+ (31 - day1);
                break;
            case 1:
                daySum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30+ (30 - day1);
                break;
        }
    }


    /**
     * 从控制台输入指定的身份证号码
     */
    @Test
    public void InputCode() {
        //获取扫描器对象
//        Scanner scanner = new Scanner(System.in);
        //提示用户进行输入
        System.out.println("请输入你的身份证信息：");
        //接收输入的一行的数据，但是使用扫描器的时候就不能够用junit单元测试进行测试了，这样是测试不出来的
//        String line = scanner.nextLine();
        String line = "43052519990706851x";
        //获取身份证中上面的前4位
        String left = line.substring(0, 4);
        //获取身份证上面的后四位的数字
        String right = line.substring(line.length() - 4, line.length());
        System.out.println("左边:" + left);
        System.out.println("右边:" + right);
        System.out.println(line);
        System.out.println(left + "*******" + right);
        System.err.println("你的身份证号码原来是" + line.length() + "位啊!!!");
    }

    /**
     * 为员工获取hash值
     */
    @Test
    public void Example() {
        System.out.println("请输入你的名字");
        String name = "张三";
        System.out.println("请输入新员工应聘的编程语言");
        //将填写的编程语言进行大写
        String languager = "java".toUpperCase();
        switch (languager) {
            case "JAVA":
                System.out.println("员工" + name + "被分配到java程序开发部门；");
                break;
            case "C#":
                System.out.println("员工" + name + "被分配到c#项目维护组；");
                break;
            case "ASP":
                System.out.println("员工" + name + "被分配到ASP程序测试部门；");
                break;
            default:
                System.out.println("本公司不需要" + languager + "语言的程序开发人员");
        }
        System.out.println((char)97203215);
    }

    /**
     * 重定向输出流实现系统日志,有问题
     */
    @Test
    public void RedirectOutputStream() {
        try {
            //保存原有的输入流
            PrintStream out = System.out;
            //创建新的文件输入流
            PrintStream newOut = new PrintStream(new FileOutputStream("./log.txt"));
            System.setOut(newOut);
            int age = 18;
            System.out.println("年龄变量成功定义，初始值为18");
            String gender = "男";
            System.out.println("性别变量成功定义，初始值为男");
            String info = "这是个" + gender + "孩子,应该有" + age + "岁了";
            System.out.println("整合两个变量为info字符串的变量，其结果是：" + info);
            //恢复原有输出流
            System.setOut(out);
            System.out.println("程序执行完毕");
            newOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
