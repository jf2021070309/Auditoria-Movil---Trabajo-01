package com.amazon.aps.iva.qw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.qw.g;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.wv.n0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.model.Subtitle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SubtitlesDownloader.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.subtitle.SubtitlesDownloaderImpl$saveToRepository$1", f = "SubtitlesDownloader.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ h i;
    public final /* synthetic */ List<g.a> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, List<g.a> list, com.amazon.aps.iva.ob0.d<? super l> dVar) {
        super(2, dVar);
        this.i = hVar;
        this.j = list;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new l(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((l) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            n0 n0Var = this.i.b;
            List<g.a> list = this.j;
            ArrayList arrayList = new ArrayList(r.Y(list));
            for (g.a aVar2 : list) {
                arrayList.add(new Subtitle(aVar2.c, aVar2.d, aVar2.e, aVar2.f, null, null, null, 96, null));
                i2 = 1;
            }
            this.h = i2;
            if (n0Var.saveItems(arrayList, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
