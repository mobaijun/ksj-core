package com.mobaijun.common.test.collection;

import com.mobaijun.common.collection.MapUtil;
import com.mobaijun.common.model.Model;
import com.mobaijun.common.util.PrintUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * software：IntelliJ IDEA 2022.2.3
 * class name: MapUtilTest
 * class description: map工具测试类
 *
 * @author MoBaiJun 2023/2/15 22:46
 */
public class MapUtilTest {

    @Test
    public void getCollection1() {
        Map<Integer, String> map = new HashMap<>(10);
        map.put(1, "1");
        map.put(2, "1");
        map.put(3, "1");
        map.put(4, "1");
        map.put(5, "1");
        map.put(6, "1");
        map.put(7, "1");
        map.put(8, "1");
        // 批量取出Map中的值
        List<String> collection = MapUtil.getCollection(map, 1, 2, 3, 4, 5, 6, 10, 11);
        PrintUtil.print(collection); // [1, 1, 1, 1, 1, 1, null, null]
    }

    @Test
    public void getCollection2() {
        Map<String, String> map = new HashMap<>(10);
        map.put("a", "apple");
        map.put("b", "banana");
        map.put("c", "cat");

        List<String> result = MapUtil.getCollection(map, Arrays.asList("a", "b", "d"));
        PrintUtil.println(result);  // Output: [apple, banana]
    }

    @Test
    public void getCollection3() {
        Map<String, Integer> map = new HashMap<>(10);
        map.put("foo", 1);
        map.put("bar", 2);
        map.put("baz", 3);

        List<Integer> values = MapUtil.getCollection(map, Arrays.asList("baz", "foo", "qux"), Comparator.reverseOrder());
        PrintUtil.println(values); // prints [3, 1]
    }

    @Test
    public void mapToList() {
        Map<String, Integer> map = new HashMap<>(10);
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        List<Model<String, Integer>> list = MapUtil.mapToList(map);
        PrintUtil.println(list); // 输出 Model 对象

        list = MapUtil.mapToList(map, Comparator.comparing(Model::getValue)); // 根据值排序
        PrintUtil.println(list); // 输出排序后的 Model 对象
    }

    @Test
    public void transMap() {
        Map<String, String> map = new HashMap<>(10);
        map.put("apple", "1");
        map.put("banana", "2");
        map.put("orange", "3");
        Map<String, Integer> newMap = MapUtil.transMap(map, Integer::parseInt);
        System.out.println(newMap); // 输出: {orange=3, banana=2, apple=1}
    }

    @Test
    public void egtObj() {
        Map<String, Integer> map = new HashMap<>(10);
        map.put("A", 1);
        map.put("B", 2);

        // 取值，如果不存在返回指定的默认值
        Integer value2 = MapUtil.getObj(map, "C", 0);
        System.out.println(value2); // 0

        // 取值，如果存在则返回对应的值
        Integer value3 = MapUtil.getObj(map, "A", 0);
        System.out.println(value3); // 1
    }
}