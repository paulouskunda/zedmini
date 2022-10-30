package com.zedmini.lib;

public class ZedMiniFactory {
    private ZedMiniFactory(){}

    public static ZedMini createZedMini(){
        return new ZedMiniImpl();
    }
}
