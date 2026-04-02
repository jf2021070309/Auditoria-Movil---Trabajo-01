package com.amazon.aps.iva.e4;
/* compiled from: ExtensionSchemas.java */
/* loaded from: classes.dex */
public final class s {
    public static final r a = new r();
    public static final q<?> b;

    static {
        q<?> qVar;
        try {
            qVar = (q) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            qVar = null;
        }
        b = qVar;
    }
}
