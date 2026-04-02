package com.amazon.aps.iva.uc0;

import java.lang.annotation.Annotation;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes4.dex */
public final class g extends f implements com.amazon.aps.iva.ed0.c {
    public final Annotation b;

    public g(com.amazon.aps.iva.nd0.f fVar, Annotation annotation) {
        super(fVar);
        this.b = annotation;
    }

    @Override // com.amazon.aps.iva.ed0.c
    public final e a() {
        return new e(this.b);
    }
}
