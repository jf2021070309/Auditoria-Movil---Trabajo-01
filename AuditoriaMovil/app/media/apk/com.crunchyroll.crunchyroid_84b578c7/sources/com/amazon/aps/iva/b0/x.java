package com.amazon.aps.iva.b0;
/* compiled from: Draggable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DraggableNode", f = "Draggable.kt", l = {451, 454}, m = "processDragCancel")
/* loaded from: classes.dex */
public final class x extends com.amazon.aps.iva.qb0.c {
    public w h;
    public com.amazon.aps.iva.se0.g0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ w k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w wVar, com.amazon.aps.iva.ob0.d<? super x> dVar) {
        super(dVar);
        this.k = wVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return w.u1(this.k, this, null);
    }
}
