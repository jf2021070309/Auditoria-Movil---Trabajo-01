package com.amazon.aps.iva.bm;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: SelectedProfileCachingStrategy.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.data.strategies.SelectedProfileCachingStrategyImpl$refreshProfileFromToken$2", f = "SelectedProfileCachingStrategy.kt", l = {87, 89}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements p<String, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ j j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(2, dVar);
        this.j = jVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        h hVar = new h(this.j, dVar);
        hVar.i = obj;
        return hVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(String str, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((h) create(str, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        try {
        } catch (Throwable th) {
            x.H(th);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    x.i0(obj);
                    q qVar = q.a;
                    return q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) this.i;
            x.i0(obj);
        } else {
            x.i0(obj);
            String str = (String) this.i;
            jVar = this.j;
            com.amazon.aps.iva.am.b bVar = jVar.d;
            this.i = jVar;
            this.h = 1;
            obj = bVar.a(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.amazon.aps.iva.em.a aVar2 = (com.amazon.aps.iva.em.a) obj;
        jVar.setValue(new g.c(aVar2, null));
        com.amazon.aps.iva.am.g gVar = jVar.c;
        this.i = null;
        this.h = 2;
        if (gVar.b(aVar2, this) == aVar) {
            return aVar;
        }
        q qVar2 = q.a;
        return q.a;
    }
}
