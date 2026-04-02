package com.amazon.aps.iva.k0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.j0.w0;
import com.amazon.aps.iva.p1.f0;
/* compiled from: SelectionController.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$1", f = "SelectionController.kt", l = {256}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<f0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ k j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.j = kVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        j jVar = new j(this.j, dVar);
        jVar.i = obj;
        return jVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(f0 f0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((j) create(f0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            this.h = 1;
            if (w0.a((f0) this.i, this.j, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
