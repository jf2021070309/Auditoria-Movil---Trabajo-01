package com.amazon.aps.iva.hd0;

import com.amazon.aps.iva.hd0.b;
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes4.dex */
public final class d extends b.a {
    public final /* synthetic */ b.C0336b b;

    public d(b.C0336b c0336b) {
        this.b = c0336b;
    }

    @Override // com.amazon.aps.iva.hd0.b.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            b.this.e = strArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
    }
}
