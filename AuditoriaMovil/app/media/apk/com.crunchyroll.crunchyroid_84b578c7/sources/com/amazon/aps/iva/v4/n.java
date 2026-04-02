package com.amazon.aps.iva.v4;
/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes.dex */
public final class n {
    public static final Class<?> a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
