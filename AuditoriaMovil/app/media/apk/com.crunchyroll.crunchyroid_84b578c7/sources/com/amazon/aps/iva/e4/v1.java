package com.amazon.aps.iva.e4;
/* compiled from: WireFormat.java */
/* loaded from: classes.dex */
public enum v1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(i.c),
    ENUM(null),
    MESSAGE(null);
    
    private final Object defaultDefault;

    v1(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
