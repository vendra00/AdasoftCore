package com.adasoft.ftpc.i18n;

public enum AppMode {
    STANDARD,
    JUNIT_BASIC,
    JUNIT_PC;
    private static AppMode mode = STANDARD;

    public static AppMode getMode() {
        return mode;
    }
    public static void setMode(AppMode mode) {
        mode = mode;
    }
}
