/*
 * Decompiled with CFR 0.152.
 */
package com.marctron.transformersmod.init;

public enum EItemBasic {
    BULLET("bullet");

    public String name;
    public static final String[] allNames;

    private EItemBasic(String name) {
        this.name = name;
    }

    static {
        allNames = new String[EItemBasic.values().length];
        for (EItemBasic e : EItemBasic.values()) {
            EItemBasic.allNames[e.ordinal()] = e.name;
        }
    }
}

