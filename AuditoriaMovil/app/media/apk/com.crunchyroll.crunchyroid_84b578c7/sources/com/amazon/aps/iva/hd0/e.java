package com.amazon.aps.iva.hd0;

import com.amazon.aps.iva.hd0.b;
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes4.dex */
public final class e extends b.a {
    public final /* synthetic */ b.c b;

    public e(b.c cVar) {
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.hd0.b.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            b.this.h = strArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
    }
}
