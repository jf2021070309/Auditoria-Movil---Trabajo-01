package com.amazon.aps.iva.ve0;

import com.google.zxing.aztec.encoder.Encoder;
/* compiled from: Zip.kt */
@com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {Encoder.DEFAULT_EC_PERCENT, Encoder.DEFAULT_EC_PERCENT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class d0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<g<Object>, Object[], com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ g i;
    public /* synthetic */ Object[] j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<Object, Object, com.amazon.aps.iva.ob0.d<Object>, Object> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(com.amazon.aps.iva.xb0.q<Object, Object, ? super com.amazon.aps.iva.ob0.d<Object>, ? extends Object> qVar, com.amazon.aps.iva.ob0.d<? super d0> dVar) {
        super(3, dVar);
        this.k = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(g<Object> gVar, Object[] objArr, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        d0 d0Var = new d0(this.k, dVar);
        d0Var.i = gVar;
        d0Var.j = objArr;
        return d0Var.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        g gVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    return com.amazon.aps.iva.kb0.q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = this.i;
            com.amazon.aps.iva.ab.x.i0(obj);
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            gVar = this.i;
            Object[] objArr = this.j;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.i = gVar;
            this.h = 1;
            obj = this.k.invoke(obj2, obj3, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.i = null;
        this.h = 2;
        if (gVar.a(obj, this) == aVar) {
            return aVar;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
