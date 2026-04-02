package com.amazon.aps.iva.p1;

import com.amazon.aps.iva.p1.n0;
/* compiled from: SuspendingPointerInputFilter.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {699}, m = "withTimeoutOrNull")
/* loaded from: classes.dex */
public final class o0<T> extends com.amazon.aps.iva.qb0.c {
    public /* synthetic */ Object h;
    public final /* synthetic */ n0.a<Object> i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(n0.a<Object> aVar, com.amazon.aps.iva.ob0.d<? super o0> dVar) {
        super(dVar);
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.R(0L, null, this);
    }
}
