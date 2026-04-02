package com.amazon.aps.iva.v4;

import java.nio.charset.Charset;
/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes.dex */
public final class h0 {
    public static final a b = new a();
    public final o0 a;

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes.dex */
    public static class a implements o0 {
        @Override // com.amazon.aps.iva.v4.o0
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.amazon.aps.iva.v4.o0
        public final n0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes.dex */
    public static class b implements o0 {
        public final o0[] a;

        public b(o0... o0VarArr) {
            this.a = o0VarArr;
        }

        @Override // com.amazon.aps.iva.v4.o0
        public final boolean isSupported(Class<?> cls) {
            for (o0 o0Var : this.a) {
                if (o0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.amazon.aps.iva.v4.o0
        public final n0 messageInfoFor(Class<?> cls) {
            o0[] o0VarArr;
            for (o0 o0Var : this.a) {
                if (o0Var.isSupported(cls)) {
                    return o0Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public h0() {
        o0 o0Var;
        o0[] o0VarArr = new o0[2];
        o0VarArr[0] = v.a;
        try {
            o0Var = (o0) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            o0Var = b;
        }
        o0VarArr[1] = o0Var;
        b bVar = new b(o0VarArr);
        Charset charset = y.a;
        this.a = bVar;
    }
}
