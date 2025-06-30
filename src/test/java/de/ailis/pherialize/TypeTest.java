package de.ailis.pherialize;

import junit.framework.TestCase;

public class TypeTest extends TestCase {

    public void testUnserializeType() {
        String serialized = "a:3:{s:6:\"String\";s:14:\"This is String\";s:7:\"Integer\";i:5;s:13:\"String Number\";s:1:\"5\";}";
        MixedArray unserialized = Pherialize.unserialize(serialized).toArray();

        assertEquals("5", unserialized.get("String Number"));
        assertEquals(5, unserialized.get("Integer"));
    }
}
