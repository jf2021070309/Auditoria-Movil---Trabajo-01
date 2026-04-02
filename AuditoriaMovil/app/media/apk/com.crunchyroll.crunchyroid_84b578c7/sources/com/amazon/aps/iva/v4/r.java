package com.amazon.aps.iva.v4;
/* compiled from: ExtensionSchemas.java */
/* loaded from: classes.dex */
public final class r {
    public static final q a = new q();
    public static final p<?> b;

    static {
        p<?> pVar;
        try {
            pVar = (p) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            pVar = null;
        }
        b = pVar;
    }
}
