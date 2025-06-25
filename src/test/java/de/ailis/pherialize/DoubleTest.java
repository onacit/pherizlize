package de.ailis.pherialize;

import java.math.BigDecimal;
import java.util.Map;
import junit.framework.TestCase;

public class DoubleTest extends TestCase {

    public void testUnSerializeDoubleWithManyDecimalPlaces() {
        // The value from the issue description
        String serialized = "a:2:{s:6:\"volume\";d:1.1999999999999999555910790149937383830547332763671875;s:8:\"protocol\";s:3:\"nfs\";}";
        var unserialized = Pherialize.unserialize(serialized).toArray();

        assertEquals("1.1999999999999999555910790149937383830547332763671875",
            unserialized.get("volume").toString());
    }

    public void testSerializeDoubleWithManyDecimalPlaces() {
        Map<String, Object> data = Map.of(
            "volume", new BigDecimal("1.1999999999999999555910790149937383830547332763671875"),
            "protocol", "nfs"
        );

        String serialized = Pherialize.serialize(data);
        assertEquals("a:2:{s:6:\"volume\";d:1.1999999999999999555910790149937383830547332763671875;s:8:\"protocol\";s:3:\"nfs\";}", serialized);
    }
}
