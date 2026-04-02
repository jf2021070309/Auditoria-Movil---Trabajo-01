package com.ellation.crunchyroll.downloading;

import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$getDownloadIds$1", f = "InternalDownloadsManager.kt", l = {563}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super List<? extends String>>, Object> {
    public int h;
    public final /* synthetic */ DownloadsManagerImpl i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DownloadsManagerImpl downloadsManagerImpl, String str, String str2, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.i = downloadsManagerImpl;
        this.j = str;
        this.k = str2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new g(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super List<? extends String>> dVar) {
        return ((g) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        String str = this.k;
        String str2 = this.j;
        DownloadsManagerImpl downloadsManagerImpl = this.i;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            this.h = 1;
            obj = downloadsManagerImpl.C(str2, str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Iterable<PlayableAsset> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable));
        for (PlayableAsset playableAsset : iterable) {
            arrayList.add(playableAsset.getId());
        }
        ArrayList F6 = downloadsManagerImpl.l.F6();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : F6) {
            e0.a aVar2 = (e0.a) obj2;
            if (com.amazon.aps.iva.yb0.j.a(aVar2.p(), str2) && com.amazon.aps.iva.yb0.j.a(aVar2.r(), str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((e0.a) it.next()).e());
        }
        ArrayList L0 = com.amazon.aps.iva.lb0.x.L0(arrayList3, arrayList);
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = L0.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add((String) next)) {
                arrayList4.add(next);
            }
        }
        return arrayList4;
    }
}
