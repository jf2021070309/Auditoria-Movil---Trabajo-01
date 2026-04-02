package com.amazon.aps.iva.m0;

import java.util.Map;
/* compiled from: AnchoredDraggable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<f, Map<Object, ? extends Float>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ f h;
    public /* synthetic */ Map i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Object obj, com.amazon.aps.iva.ob0.d<? super i> dVar) {
        super(3, dVar);
        this.j = obj;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(f fVar, Map<Object, ? extends Float> map, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        i iVar = new i(this.j, dVar);
        iVar.h = fVar;
        iVar.i = map;
        return iVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        f fVar = this.h;
        Float f = (Float) this.i.get(this.j);
        if (f != null) {
            fVar.a(f.floatValue(), 0.0f);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
