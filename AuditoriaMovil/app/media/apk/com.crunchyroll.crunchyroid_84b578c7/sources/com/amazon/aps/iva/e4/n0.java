package com.amazon.aps.iva.e4;
/* compiled from: MapFieldSchemas.java */
/* loaded from: classes.dex */
public final class n0 {
    public static final l0 a;
    public static final m0 b;

    static {
        l0 l0Var;
        try {
            l0Var = (l0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            l0Var = null;
        }
        a = l0Var;
        b = new m0();
    }
}
