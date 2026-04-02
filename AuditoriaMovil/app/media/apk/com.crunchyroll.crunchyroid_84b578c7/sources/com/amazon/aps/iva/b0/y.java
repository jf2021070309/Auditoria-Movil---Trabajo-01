package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.b0.g;
/* compiled from: Draggable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DraggableNode", f = "Draggable.kt", l = {433, 436, 438}, m = "processDragStart")
/* loaded from: classes.dex */
public final class y extends com.amazon.aps.iva.qb0.c {
    public w h;
    public com.amazon.aps.iva.se0.g0 i;
    public g.c j;
    public com.amazon.aps.iva.c0.b k;
    public /* synthetic */ Object l;
    public final /* synthetic */ w m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w wVar, com.amazon.aps.iva.ob0.d<? super y> dVar) {
        super(dVar);
        this.m = wVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return w.v1(this.m, null, null, this);
    }
}
