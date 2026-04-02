package com.amazon.aps.iva.jf0;

import java.lang.annotation.Annotation;
/* compiled from: SkipCallbackExecutorImpl.java */
/* loaded from: classes4.dex */
public final class e0 implements d0 {
    public static final e0 a = new e0();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return d0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof d0;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + d0.class.getName() + "()";
    }
}
