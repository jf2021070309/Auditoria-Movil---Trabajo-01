package com.amazon.aps.iva.xy;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: FlowExtensions.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.mvp.flow.FlowExtensionsKt$onFirst$2", f = "FlowExtensions.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements p<Object, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ p<Object, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(p<Object, ? super com.amazon.aps.iva.ob0.d<? super Boolean>, ? extends Object> pVar, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.j = pVar;
        this.k = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        j jVar = new j(this.j, this.k, dVar);
        jVar.i = obj;
        return jVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(Object obj, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
        return ((j) create(obj, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            Object obj2 = this.i;
            this.h = 1;
            obj = this.j.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.k.invoke();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
