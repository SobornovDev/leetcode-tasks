package solutions.my_own_implementation.hash_map;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author : Sobornov Vladimir
 * @since : 19.01.2023
 **/
public class HashMapTest {
    private final MyOwnHashMap<String, String> map = new MyOwnHashMap<>();

    @Test
    public void mapTest() {
        map.put("Moscow", "Russia");
        map.put("Rome", "Turkey");
        map.put("Berlin", "Germany");
        map.put("Rome", "Italy");
        map.put("London", "UK");
        map.put("Washington", "USA");
        map.put("Pekin", "China");
        map.put("Rome", "Italy");
        map.put("Rome", "Italy");
        map.put("Rome", "Italy");
        Assert.assertEquals("Germany", map.get("Berlin"));
        Assert.assertEquals("Russia", map.get("Moscow"));
        Assert.assertEquals("Italy", map.get("Rome"));
        Assert.assertNull(map.get("Paris"));
        map.put("Paris", "France");
        Assert.assertEquals("France", map.get("Paris"));
        map.delete("Paris");
        Assert.assertNull(map.get("Paris"));

    }

    @Test
    public void concurrentMapTest() {
        Runnable testThread1 = () -> {
            map.put("London", "UK");
            map.put("Washington", "USA");
            map.put("Pekin", "China");
            map.put("Rome", "Italy");
            map.put("Boston", "USA");
        };

        Runnable testThread2 = () -> {
            map.put("Moscow", "Russia");
            map.put("Boston", "USA");
            map.put("Rome", "Turkey");
            map.put("Berlin", "Germany");
            map.delete("Boston");
            map.put("Rome", "Italy");
        };

        testThread2.run();
        testThread1.run();


        Assert.assertEquals("UK", map.get("London"));
        Assert.assertEquals("USA", map.get("Washington"));
        Assert.assertEquals("China", map.get("Pekin"));
        Assert.assertEquals("Italy", map.get("Rome"));
        Assert.assertEquals("Russia", map.get("Moscow"));
        Assert.assertEquals("Germany", map.get("Berlin"));
        Assert.assertEquals("USA", map.get("Boston"));


    }
}
