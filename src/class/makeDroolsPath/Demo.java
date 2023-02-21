package makeDroolsPath;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.Scanner;

/**
 * 创建日期 2022-08-17
 *
 * @author xuchen
 */
public class Demo {

    public static void main(String[] args) {

        do {
            System.out.println("请输入文件Id，多个文件Id以逗号分割：");
            Scanner scanner = new Scanner(System.in);
            String fileName = "";

            if (scanner.hasNextLine()) {
                fileName = scanner.nextLine();
            }
            if (StringUtils.isNotBlank(fileName)) {
                String[] split = fileName.split(",");
                System.out.println("===================分割后元素：" + split.toString());
                for (String str : split) {
                    char[] ids = StringUtils.right("0000000000000000000" + str, 20).toCharArray();
                    StringBuilder path = new StringBuilder();
                    path.append("ncwebapps_fujian/policy");
                    for (int i = 0; i < ids.length; i += 2) {
                        path.append(File.separator).append(ids[i]).append(ids[i + 1]);
                    }
                    System.out.println("当前文件Id：" + str + "，文件路径：" + path);
                }
            } else {
                System.out.println("未输入文件Id，是否要终止本次进程：yes/no");
                if (scanner.hasNext() && "yes".equals(scanner.nextLine())) {
                    break;
                }
            }
            System.out.println("结束循环请输入【end】，继续循环输入【1】：");
            String s = scanner.nextLine();
            if ("end".equals(s)) {
                break;
            }
        } while (true);
    }

}
