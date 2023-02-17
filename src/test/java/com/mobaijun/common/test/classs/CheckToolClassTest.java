package com.mobaijun.common.test.classs;

import com.mobaijun.common.collection.CollectionUtil;
import com.mobaijun.common.util.classs.CheckToolClass;

import java.util.Collection;
import java.util.Map;

/**
 * software：IntelliJ IDEA 2022.2.3
 * class name: CheckToolClassTest
 * class description: CheckToolClassTest测试类
 *
 * @author MoBaiJun 2022/11/22 15:07
 */
public class CheckToolClassTest {

    public static void main(String[] args) {
        CheckToolClass.assertTrue(true, "非空字符串 ！！！");

        // 集合非空校验,返回默认容量 10 ArrayList集合
        Collection<Object> objects = CheckToolClass.assertListIsNull(CollectionUtil.newArrayList());

        // 字符串空校验
        CheckToolClass.assertNotEmpty("", "参数为空！");

        // 数据空校验
        // CheckToolClass.assertNotNull("", "参数是空的！");

        // 判断 map 是否为 null ，返回空 map
        Map<String, String> map = CollectionUtil.newHashMap();
        Map<String, String> isMapNull = CheckToolClass.assertIsMapNull(map);
    }
}
