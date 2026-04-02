package com.amazon.aps.iva.hd0;

import com.amazon.aps.iva.hd0.b;
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes4.dex */
public final class g extends b.a {
    public final /* synthetic */ b.d b;

    public g(b.d dVar) {
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.hd0.b.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            b.this.e = strArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
    }
}
