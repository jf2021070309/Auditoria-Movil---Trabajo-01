package com.amazon.aps.iva.p3;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: View.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {414, 416}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m0 extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ne0.j<? super View>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(View view, com.amazon.aps.iva.ob0.d<? super m0> dVar) {
        super(dVar);
        this.k = view;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        m0 m0Var = new m0(this.k, dVar);
        m0Var.j = obj;
        return m0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.ne0.j<? super View> jVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((m0) create(jVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.ne0.j jVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.i;
        View view = this.k;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    return com.amazon.aps.iva.kb0.q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (com.amazon.aps.iva.ne0.j) this.j;
            com.amazon.aps.iva.ab.x.i0(obj);
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            jVar = (com.amazon.aps.iva.ne0.j) this.j;
            this.j = jVar;
            this.i = 1;
            if (jVar.b(view, this) == aVar) {
                return aVar;
            }
        }
        if (view instanceof ViewGroup) {
            l0 l0Var = new l0((ViewGroup) view, null);
            this.j = null;
            this.i = 2;
            jVar.getClass();
            com.amazon.aps.iva.ne0.i iVar = new com.amazon.aps.iva.ne0.i();
            iVar.e = com.amazon.aps.iva.a60.b.o(l0Var, iVar, iVar);
            Object g = jVar.g(iVar, this);
            if (g != aVar) {
                g = com.amazon.aps.iva.kb0.q.a;
            }
            if (g == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
