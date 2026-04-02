package com.amazon.aps.iva.e4;
/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes.dex */
public final class y0 {
    public static final w0 a;
    public static final x0 b;

    static {
        w0 w0Var;
        try {
            w0Var = (w0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            w0Var = null;
        }
        a = w0Var;
        b = new x0();
    }
}
