package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.b0.g;
/* compiled from: Draggable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DraggableNode", f = "Draggable.kt", l = {443, 446}, m = "processDragStop")
/* loaded from: classes.dex */
public final class z extends com.amazon.aps.iva.qb0.c {
    public w h;
    public com.amazon.aps.iva.se0.g0 i;
    public g.d j;
    public /* synthetic */ Object k;
    public final /* synthetic */ w l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(w wVar, com.amazon.aps.iva.ob0.d<? super z> dVar) {
        super(dVar);
        this.l = wVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return w.w1(this.l, null, null, this);
    }
}
