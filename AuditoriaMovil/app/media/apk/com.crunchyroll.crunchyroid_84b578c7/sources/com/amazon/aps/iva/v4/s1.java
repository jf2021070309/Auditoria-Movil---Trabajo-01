package com.amazon.aps.iva.v4;
/* compiled from: WireFormat.java */
/* loaded from: classes.dex */
public enum s1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(h.c),
    ENUM(null),
    MESSAGE(null);
    
    private final Object defaultDefault;

    s1(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
