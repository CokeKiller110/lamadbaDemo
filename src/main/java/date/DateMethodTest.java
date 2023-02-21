package date;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 日期时间方法测试类
 */
public class DateMethodTest {
    public static void main(String[] args) {
        // 获取今年的天数
        int daysOfThisYear = LocalDate.now().lengthOfYear();
        System.out.println("今年的天数：" + daysOfThisYear);

        // 获取指定某年的天数
        int daysOfAnyYear = LocalDate.of(2020, 1, 1).lengthOfYear();
        System.out.println("指定年份的天数：" + daysOfAnyYear);

        //集合转数组
        transListToArray();

        //循环删除集合元素
        removeListElement();

    }

    /**
     * 集合转数组
     * new String[0]入参说明：
     * 1） 等于 0，动态创建与 size 相同的数组，性能最好。
     * 2） 大于 0 但小于 size，重新创建大小等于 size 的数组，增加 GC 负担。
     * 3） 等于 size，在高并发情况下，数组创建完成之后，size 正在变大的情况下，负面影响与 2 相同。
     * 4） 大于 size，空间浪费，且在 size 处插入 null 值，存在 NPE 隐患。
     * @return Array
     */
    private static void transListToArray(){
        System.out.println("==============测试集合转数组============");
        List<String> list = new ArrayList<>(2);
        list.add("guan");
        list.add("bao");
        String[] array = list.toArray(new String[0]);
        System.out.println("元素：" + Arrays.toString(array) + "，长度：" +array.length);
        if (array.length == list.size()) {
            System.out.println("数组长度与集合一致");
        }
    }

    /**
     * 循环删除集合元素
     * 1）Iterator.remove()方法可以成功删除集合元素
     * 2）foreach循环，remove元素，程序出现并发修改异常：ConcurrentModificationException
     *
     */
    private static void removeListElement(){
        System.out.println("==============循环删除集合元素============");
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("1".equals(item)) {
                iterator.remove();
            }
        }
        System.out.println("使用Iterator循环删除[1]元素后，list剩余元素：" + list.toString());

        // foreach循环删除集合中第一个、最后一个元素时，系统抛出ConcurrentModificationException并发修改异常，不能使用此方式
//        List<String> list1 = new ArrayList<>();
//        list1.add("1");
//        list1.add("2");
//        list1.add("3");
//        list1.add("4");
//        for (String list1Item : list1) {
//            if ("4".equals(list1Item)) {
//                list1.remove(list1Item);
//            }
//        }
//        System.out.println("使用foreach循环删除[4]元素后，list剩余元素：" + list1.toString());
    }

}
