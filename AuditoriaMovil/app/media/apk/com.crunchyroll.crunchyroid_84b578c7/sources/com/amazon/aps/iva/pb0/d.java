package com.amazon.aps.iva.pb0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.qb0.g;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.h0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes4.dex */
public final class d extends g {
    public int h;
    public final /* synthetic */ p i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, Object obj, com.amazon.aps.iva.ob0.d dVar) {
        super(dVar);
        this.i = pVar;
        this.j = obj;
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
        p pVar = this.i;
        j.d(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        h0.e(2, pVar);
        return pVar.invoke(this.j, this);
    }
}
