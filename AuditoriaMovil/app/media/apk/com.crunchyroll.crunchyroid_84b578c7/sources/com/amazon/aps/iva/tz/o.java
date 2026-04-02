package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.kb0.k;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import java.util.List;
import java.util.Map;
/* compiled from: BrowseAllInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.browse.BrowseAllInteractorImpl$getPanelsRange$1", f = "BrowseAllInteractor.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<v0, com.amazon.aps.iva.kb0.q> j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> k;
    public final /* synthetic */ q l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Map<String, String> o;
    public final /* synthetic */ List<com.amazon.aps.iva.l10.a> p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(com.amazon.aps.iva.xb0.l<? super v0, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar2, q qVar, int i, int i2, Map<String, String> map, List<com.amazon.aps.iva.l10.a> list, com.amazon.aps.iva.ob0.d<? super o> dVar) {
        super(2, dVar);
        this.j = lVar;
        this.k = lVar2;
        this.l = qVar;
        this.m = i;
        this.n = i2;
        this.o = map;
        this.p = list;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        o oVar = new o(this.j, this.k, this.l, this.m, this.n, this.o, this.p, dVar);
        oVar.i = obj;
        return oVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((o) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                int i2 = this.m;
                int i3 = this.n;
                Map<String, String> map = this.o;
                List<com.amazon.aps.iva.l10.a> list = this.p;
                EtpContentService etpContentService = qVar.b;
                Integer num = new Integer(i2);
                Integer num2 = new Integer(i3);
                String m = q.m(qVar, list);
                this.h = 1;
                obj = EtpContentService.DefaultImpls.getBrowseAll$default(etpContentService, num, num2, null, map, m, null, this, 32, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ContentApiResponse contentApiResponse = (ContentApiResponse) obj;
            H = new v0(contentApiResponse.getData(), contentApiResponse.getTotal());
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
