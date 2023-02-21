package ThreadLocal;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("name", "线程1");
        Thread thread = new Thread(new ThreadLocalDemo(map), "线程1");
        thread.run();

        Map<String, String> map1 = new HashMap<>();
        map1.put("A","11");
        map1.put("B","22");
        map1.put("C","33");
        map1.put("name","线程2");
        Thread thread1 = new Thread(new ThreadLocalDemo(map1), "线程2");
        thread1.run();
    }
}
