package com.amazon.aps.iva.qc0;

import com.amazon.aps.iva.ce0.o;
import com.amazon.aps.iva.yb0.j;
/* compiled from: PlatformDependentDeclarationFilter.kt */
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* loaded from: classes4.dex */
    public static final class a implements c {
        public static final a a = new a();

        @Override // com.amazon.aps.iva.qc0.c
        public final boolean b(com.amazon.aps.iva.ce0.d dVar, o oVar) {
            j.f(dVar, "classDescriptor");
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* loaded from: classes4.dex */
    public static final class b implements c {
        public static final b a = new b();

        @Override // com.amazon.aps.iva.qc0.c
        public final boolean b(com.amazon.aps.iva.ce0.d dVar, o oVar) {
            j.f(dVar, "classDescriptor");
            return !oVar.getAnnotations().A(d.a);
        }
    }

    boolean b(com.amazon.aps.iva.ce0.d dVar, o oVar);
}
