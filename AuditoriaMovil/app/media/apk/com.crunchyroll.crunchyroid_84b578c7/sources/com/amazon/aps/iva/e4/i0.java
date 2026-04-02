package com.amazon.aps.iva.e4;

import java.nio.charset.Charset;
/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes.dex */
public final class i0 {
    public static final a b = new a();
    public final p0 a;

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes.dex */
    public static class a implements p0 {
        @Override // com.amazon.aps.iva.e4.p0
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.amazon.aps.iva.e4.p0
        public final o0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes.dex */
    public static class b implements p0 {
        public final p0[] a;

        public b(p0... p0VarArr) {
            this.a = p0VarArr;
        }

        @Override // com.amazon.aps.iva.e4.p0
        public final boolean isSupported(Class<?> cls) {
            for (p0 p0Var : this.a) {
                if (p0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.amazon.aps.iva.e4.p0
        public final o0 messageInfoFor(Class<?> cls) {
            p0[] p0VarArr;
            for (p0 p0Var : this.a) {
                if (p0Var.isSupported(cls)) {
                    return p0Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public i0() {
        p0 p0Var;
        p0[] p0VarArr = new p0[2];
        p0VarArr[0] = w.a;
        try {
            p0Var = (p0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            p0Var = b;
        }
        p0VarArr[1] = p0Var;
        b bVar = new b(p0VarArr);
        Charset charset = z.a;
        this.a = bVar;
    }
}
