package com.amazon.aps.iva.od0;
/* compiled from: WireFormat.java */
/* loaded from: classes4.dex */
public enum z {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(c.b),
    ENUM(null),
    MESSAGE(null);
    
    private final Object defaultDefault;

    z(Object obj) {
        this.defaultDefault = obj;
    }
}
