package ThreadLocal;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class ThreadLocalDemo implements Runnable {

    /**
     * 线程变量 Map<String, String>
     */
    private static ThreadLocal<Map<String, String>> threadLocal = new ThreadLocal<>();

    /**
     * 构造函数
     */
    public ThreadLocalDemo(Map<String, String> map) {
        //变量赋值
        ThreadLocal<Map<String, String>> objectThreadLocal = new ThreadLocal<>();
        objectThreadLocal.set(map);
        ThreadLocalDemo.threadLocal = objectThreadLocal;
    }

    @Override
    public void run() {
        System.out.println("\n\n                     开始测试");
        //测试
        if (threadLocal != null) {
            Map<String, String> strMap = threadLocal.get();
            if (!Objects.isNull(strMap)) {
                System.out.println(strMap.get("name") + "：线程池map变量打印开始>>>>>>>");
                int hashCode = strMap.hashCode();
                System.out.println(strMap.get("name") + "：线程池map变量hashCode：" + hashCode);
                Set<String> strings = strMap.keySet();
                System.out.println(strMap.get("name") + "：线程池map变量key的set集合：" + strings.toString());
                for (String str : strings) {
                    System.out.println(strMap.get("name") + "：线程池map变量key：" + str +"，value：" + strMap.get(str));
                }
                System.out.println(strMap.get("name") + "：线程池map变量打印结束>>>>>>>");
            }
        }
    }

}
