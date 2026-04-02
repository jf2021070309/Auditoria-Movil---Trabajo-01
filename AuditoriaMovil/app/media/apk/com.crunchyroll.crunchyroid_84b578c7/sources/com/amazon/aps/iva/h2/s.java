package com.amazon.aps.iva.h2;

import com.amazon.aps.iva.se0.e2;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* loaded from: classes.dex */
public final class s {
    public static final a c = new a();
    public final f a;
    public final com.amazon.aps.iva.xe0.d b;

    public s(f fVar) {
        com.amazon.aps.iva.ob0.h hVar = com.amazon.aps.iva.ob0.h.b;
        com.amazon.aps.iva.yb0.j.f(fVar, "asyncTypefaceCache");
        this.a = fVar;
        this.b = com.amazon.aps.iva.e.z.i(c.plus(hVar).plus(new e2(null)));
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.ob0.a implements CoroutineExceptionHandler {
        public a() {
            super(CoroutineExceptionHandler.a.b);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(com.amazon.aps.iva.ob0.g gVar, Throwable th) {
        }
    }
}
