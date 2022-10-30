package com.zedmini.lib;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZedMiniImplTest  {

    @Test
    public void testNrcFormatter() {
        ZedMiniImpl zedMini = new ZedMiniImpl();
        assertEquals(zedMini.nrcFormatter("298384101"), "298384/10/1");
    }
}