package com.amazon.aps.iva.hv;

import com.amazon.aps.iva.ab.x;
import com.ellation.crunchyroll.model.search.SearchResponse;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
/* compiled from: CrunchylistSearchViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.crunchylistsearch.CrunchylistSearchViewModelImpl$createFactory$1", f = "CrunchylistSearchViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<Integer, com.amazon.aps.iva.ob0.d<? super SearchResponse>, Object> {
    public int h;
    public /* synthetic */ int i;
    public final /* synthetic */ o j;
    public final /* synthetic */ com.amazon.aps.iva.kv.e k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, com.amazon.aps.iva.kv.e eVar, com.amazon.aps.iva.ob0.d<? super n> dVar) {
        super(2, dVar);
        this.j = oVar;
        this.k = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        n nVar = new n(this.j, this.k, dVar);
        nVar.i = ((Number) obj).intValue();
        return nVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(Integer num, com.amazon.aps.iva.ob0.d<? super SearchResponse> dVar) {
        return ((n) create(Integer.valueOf(num.intValue()), dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            int i2 = this.i;
            o oVar = this.j;
            c cVar = oVar.b;
            String d = oVar.d.d();
            com.amazon.aps.iva.yb0.j.c(d);
            int i3 = this.k.b;
            this.h = 1;
            obj = cVar.G(d, i3, i2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
