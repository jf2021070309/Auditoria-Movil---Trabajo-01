package com.amazon.aps.iva.ei;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.google.android.gms.ads.AdRequest;
/* compiled from: FeaturedMusicListAdapter.kt */
/* loaded from: classes.dex */
public final class b extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ d h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(2);
        this.h = dVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            d dVar = this.h;
            int i = this.i;
            int itemViewType = dVar.getItemViewType(i);
            if (itemViewType != 100) {
                if (itemViewType != 101) {
                    iVar2.s(839571102);
                    iVar2.G();
                } else {
                    iVar2.s(839570496);
                    g.a(null, iVar2, 0, 1);
                    iVar2.G();
                }
            } else {
                iVar2.s(839570560);
                Object obj = dVar.a.f.get(i);
                com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type com.crunchyroll.music.featuredmusic.list.MusicMediaCardDataItem");
                com.amazon.aps.iva.fi.a aVar = ((h) obj).a;
                com.amazon.aps.iva.ci.a.c(aVar, x.m0(dVar.c.a(aVar)), dVar.d, dVar.e, new a(dVar, aVar), null, iVar2, Image.$stable | 0 | 0 | LabelUiModel.$stable | AdRequest.MAX_CONTENT_URL_LENGTH | 0, 32);
                iVar2.G();
            }
        }
        return q.a;
    }
}
