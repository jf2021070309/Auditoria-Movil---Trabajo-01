package com.amazon.aps.iva.pb0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.h0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes4.dex */
public final class c extends com.amazon.aps.iva.qb0.c {
    public int h;
    public final /* synthetic */ l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.ob0.d dVar, g gVar, l lVar) {
        super(dVar, gVar);
        this.i = lVar;
        j.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                this.h = 2;
                x.i0(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.h = 1;
        x.i0(obj);
        l lVar = this.i;
        j.d(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
        h0.e(1, lVar);
        return lVar.invoke(this);
    }
}
