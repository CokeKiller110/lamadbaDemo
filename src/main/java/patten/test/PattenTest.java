package patten.test;

import patten.interfacePackage.PattenTestInterface;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式测试
 */
public class PattenTest {
    public static void main(String[] args) {
        PattenTestInterface pattenTestInterface = () -> {
            Scanner scanner = new Scanner(System.in);
            String next = "";
            System.out.println("输入正则表达式：");
            String next1 = scanner.next();
            Pattern p = Pattern.compile(next1);
            System.out.println("测试是否满足[" + next1 + "]此规则");
            do {
                System.out.println("请输入要匹配正则表达式的文本(输入'end'结束测试)：");
                if (scanner.hasNext()) {
                    next = scanner.next();
                }
                if ("end".equals(next)) {
                    break;
                }
                Matcher m = p.matcher(next);
                boolean b = m.matches();
                System.out.println("运算结果：" + b);
            } while (true);
        };
        pattenTestInterface.test();
    }
}
