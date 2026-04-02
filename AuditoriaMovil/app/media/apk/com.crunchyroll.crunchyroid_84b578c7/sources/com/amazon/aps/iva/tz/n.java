package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.kb0.k;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import java.util.List;
import java.util.Map;
/* compiled from: BrowseAllInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.browse.BrowseAllInteractorImpl$getPanels$1", f = "BrowseAllInteractor.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<a1, com.amazon.aps.iva.kb0.q> j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> k;
    public final /* synthetic */ q l;
    public final /* synthetic */ Map<String, String> m;
    public final /* synthetic */ List<com.amazon.aps.iva.l10.a> n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(com.amazon.aps.iva.xb0.l<? super a1, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar2, q qVar, Map<String, String> map, List<com.amazon.aps.iva.l10.a> list, com.amazon.aps.iva.ob0.d<? super n> dVar) {
        super(2, dVar);
        this.j = lVar;
        this.k = lVar2;
        this.l = qVar;
        this.m = map;
        this.n = list;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        n nVar = new n(this.j, this.k, this.l, this.m, this.n, dVar);
        nVar.i = obj;
        return nVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((n) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object H;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.i;
                q qVar = this.l;
                Map<String, String> map = this.m;
                List<com.amazon.aps.iva.l10.a> list = this.n;
                EtpContentService etpContentService = qVar.b;
                String m = q.m(qVar, list);
                this.h = 1;
                obj = etpContentService.getBrowseIndex(map, m, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ContentApiResponse contentApiResponse = (ContentApiResponse) obj;
            H = new a1(contentApiResponse.getData(), contentApiResponse.getTotal());
        } catch (Throwable th) {
            H = com.amazon.aps.iva.ab.x.H(th);
        }
        if (!(H instanceof k.a)) {
            this.j.invoke(H);
        }
        Throwable a = com.amazon.aps.iva.kb0.k.a(H);
        if (a != null) {
            this.k.invoke(a);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
