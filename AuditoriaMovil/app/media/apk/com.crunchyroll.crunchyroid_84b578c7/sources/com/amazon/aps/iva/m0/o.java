package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.m0.p;
import java.util.Map;
/* compiled from: AnchoredDraggable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<f, Map<Object, ? extends Float>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ p i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.b0.k, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, com.amazon.aps.iva.xb0.p pVar2, com.amazon.aps.iva.ob0.d dVar) {
        super(3, dVar);
        this.i = pVar;
        this.j = pVar2;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(f fVar, Map<Object, ? extends Float> map, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return new o(this.i, this.j, dVar).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            p.a aVar2 = this.i.a;
            this.h = 1;
            if (this.j.invoke(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
