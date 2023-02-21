import java.util.ArrayList;

/**
 * 测试类
 */
public class LamadbaTestClass {

    public static void main(String[] args) {
        //无参无返回值
        LamadbaTestInterface lamadbaTestInterface = () -> {
            System.out.println("》》》》》》》》》lamadbaTestInterface测试开始");
            System.out.println("lamadba表达式Override接口中的无参无返回值方法。");
            System.out.println("》》》》》》》》》lamadbaTestInterface测试结束");
            System.out.println();
        };
        lamadbaTestInterface.test();

        //有参无返回值
        TwoLamadbaTestInterface twoLamadbaTestInterface = (int a) -> {
            System.out.println("》》》》》》》》》twoLamadbaTestInterface测试开始");
            System.out.println("lamadba表达式Override接口中的有参无返回值方法");
            System.out.println("年龄：" + a);
            System.out.println("》》》》》》》》》twoLamadbaTestInterface测试结束");
            System.out.println();
        };
        twoLamadbaTestInterface.test(24);

        //有参有返回值
        ThreeLamadbaTestInterface threeLamadbaTestInterface = (String name, int age) -> {
            System.out.println("》》》》》》》》》threeLamadbaTestInterface测试开始");
            System.out.println("lamadba表达式Override接口中的有参有返回值方法");
            String str = "我是中科软的一名员工，姓名：" + name + "，今年" + age + "岁。";
            return str;
        };
        String str = threeLamadbaTestInterface.test("陈永思", 24);
        System.out.println("threeLamadbaTestInterface中方法返回值：" + str);
        System.out.println("》》》》》》》》》threeLamadbaTestInterface测试结束");
        System.out.println();

        //循环
        FourLamadbaTestInterface fourLamadbaTestInterface = () -> {
            System.out.println("》》》》》》》》》fourLamadbaTestInterface测试开始");
            ArrayList<String> Strings = new ArrayList<>();
            Strings.add("a");
            Strings.add("b");
            Strings.add("c");
            Strings.forEach(o -> {
                System.out.print(o + ",");
            });
            System.out.println("\n》》》》》》》》》fourLamadbaTestInterface测试结束");
        };
        fourLamadbaTestInterface.test();
    }
}
