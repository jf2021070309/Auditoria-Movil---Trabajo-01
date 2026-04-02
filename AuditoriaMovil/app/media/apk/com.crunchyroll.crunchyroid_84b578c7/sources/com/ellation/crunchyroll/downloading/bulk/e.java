package com.ellation.crunchyroll.downloading.bulk;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.vv.j;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: BulkDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl$restartDubs$1", f = "BulkDownloadsManager.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ BulkDownloadsManagerImpl i;
    public final /* synthetic */ com.amazon.aps.iva.hg.g j;
    public final /* synthetic */ String k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BulkDownloadsManagerImpl bulkDownloadsManagerImpl, com.amazon.aps.iva.hg.g gVar, String str, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
        super(2, dVar);
        this.i = bulkDownloadsManagerImpl;
        this.j = gVar;
        this.k = str;
        this.l = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new e(this.i, this.j, this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((e) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        com.amazon.aps.iva.xg.a k0;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        com.amazon.aps.iva.hg.g gVar = this.j;
        BulkDownloadsManagerImpl bulkDownloadsManagerImpl = this.i;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            BulkDownloadsManagerImpl.b bVar = bulkDownloadsManagerImpl.g;
            bVar.getClass();
            t.e0(bVar.a, new com.amazon.aps.iva.hg.a[]{gVar});
            bulkDownloadsManagerImpl.notify(j.h);
            String[] strArr = (String[]) w.z(gVar.d).toArray(new String[0]);
            InternalDownloadsManager internalDownloadsManager = bulkDownloadsManagerImpl.b;
            internalDownloadsManager.A2((String[]) Arrays.copyOf(strArr, strArr.length));
            String[] strArr2 = (String[]) w.z(gVar.d).toArray(new String[0]);
            this.h = 1;
            if (internalDownloadsManager.R3((String[]) Arrays.copyOf(strArr2, strArr2.length), this) == aVar) {
                return aVar;
            }
        }
        bulkDownloadsManagerImpl.g.a(gVar);
        String str = this.k;
        com.amazon.aps.iva.yb0.j.f(str, "audioLocale");
        List<PlayableAsset> list = gVar.d;
        ArrayList arrayList = new ArrayList(r.Y(list));
        for (PlayableAsset playableAsset : list) {
            Iterator<T> it = playableAsset.getVersions().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (com.amazon.aps.iva.yb0.j.a(((PlayableAssetVersion) obj2).getAudioLocale(), str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            PlayableAssetVersion playableAssetVersion = (PlayableAssetVersion) obj2;
            if (playableAssetVersion != null) {
                k0 = x.l0(playableAsset, playableAssetVersion);
            } else {
                k0 = x.k0(playableAsset);
            }
            arrayList.add(k0);
        }
        bulkDownloadsManagerImpl.b.S5(arrayList, this.l);
        return q.a;
    }
}
