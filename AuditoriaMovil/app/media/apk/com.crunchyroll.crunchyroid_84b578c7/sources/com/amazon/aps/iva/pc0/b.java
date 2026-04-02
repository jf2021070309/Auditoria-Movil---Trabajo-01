package com.amazon.aps.iva.pc0;
/* compiled from: AnnotatedImpl.java */
/* loaded from: classes4.dex */
public class b implements a {
    public final h b;

    public b(h hVar) {
        if (hVar != null) {
            this.b = hVar;
        } else {
            d0(0);
            throw null;
        }
    }

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        if (i != 1) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 1) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // com.amazon.aps.iva.pc0.a
    public h getAnnotations() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar;
        }
        d0(1);
        throw null;
    }
}
