package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$getSeasonPausedAssets$1$1", f = "InternalDownloadsManager.kt", l = {693}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public ArrayList h;
    public int i;
    public final /* synthetic */ List<com.ellation.crunchyroll.downloading.e0> j;
    public final /* synthetic */ DownloadsManagerImpl k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<? extends PlayableAsset>, com.amazon.aps.iva.kb0.q> n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(List<? extends com.ellation.crunchyroll.downloading.e0> list, DownloadsManagerImpl downloadsManagerImpl, String str, String str2, com.amazon.aps.iva.xb0.l<? super List<? extends PlayableAsset>, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.ob0.d<? super m0> dVar) {
        super(2, dVar);
        this.j = list;
        this.k = downloadsManagerImpl;
        this.l = str;
        this.m = str2;
        this.n = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new m0(this.j, this.k, this.l, this.m, this.n, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((m0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.i;
        if (i != 0) {
            if (i == 1) {
                arrayList = this.h;
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            List<com.ellation.crunchyroll.downloading.e0> list = this.j;
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
            for (com.ellation.crunchyroll.downloading.e0 e0Var : list) {
                arrayList2.add(e0Var.e());
            }
            u1 u1Var = this.k.b;
            this.h = arrayList2;
            this.i = 1;
            obj = u1Var.C(this.l, this.m, this);
            if (obj == aVar) {
                return aVar;
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (arrayList.contains(((PlayableAsset) obj2).getId())) {
                arrayList3.add(obj2);
            }
        }
        this.n.invoke(arrayList3);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
