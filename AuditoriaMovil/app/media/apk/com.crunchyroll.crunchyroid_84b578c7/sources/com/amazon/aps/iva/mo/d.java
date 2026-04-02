package com.amazon.aps.iva.mo;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.cj.i;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.oo.f;
import com.amazon.aps.iva.oo.m;
import com.amazon.aps.iva.qo.g;
import com.amazon.aps.iva.qo.w;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ye.j;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenCastViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends f0 implements com.amazon.aps.iva.df.a, com.amazon.aps.iva.af.a {
    public final i b;
    public final w c;
    public final f d;
    public final com.amazon.aps.iva.ef.a e;
    public final com.amazon.aps.iva.ye.f f;
    public final j g;
    public final androidx.lifecycle.c h;
    public final androidx.lifecycle.c i;
    public Long j;

    public d(i iVar, w wVar, m mVar, com.amazon.aps.iva.ef.a aVar, com.amazon.aps.iva.ye.f fVar, j jVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "player");
        com.amazon.aps.iva.yb0.j.f(aVar, "castMediaLoader");
        com.amazon.aps.iva.yb0.j.f(fVar, "castStateProvider");
        com.amazon.aps.iva.yb0.j.f(jVar, "sessionManager");
        this.b = iVar;
        this.c = wVar;
        this.d = mVar;
        this.e = aVar;
        this.f = fVar;
        this.g = jVar;
        this.h = com.amazon.aps.iva.i5.j.b(new c(com.amazon.aps.iva.xy.m.a(wVar.L8())), com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        this.i = com.amazon.aps.iva.i5.j.b(new b(com.amazon.aps.iva.xy.m.a(wVar.k2())), com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        com.amazon.aps.iva.dg.b.A(com.amazon.aps.iva.e.w.D(this), new a0(com.amazon.aps.iva.xy.m.a(wVar.k2()), new a(this)));
    }

    @Override // com.amazon.aps.iva.df.a
    public final LiveData<com.amazon.aps.iva.cf.b> A6() {
        return this.i;
    }

    public final void N8(g gVar) {
        long j;
        ContentContainer contentContainer = gVar.a;
        com.amazon.aps.iva.no.b bVar = gVar.b;
        PlayableAsset playableAsset = bVar.a;
        if (this.f.isTryingToCast()) {
            if (!this.g.isCastingVideo(playableAsset.getId())) {
                Long l = this.j;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = bVar.e;
                }
                this.e.load(contentContainer, playableAsset, j);
            }
        }
    }

    @Override // com.amazon.aps.iva.df.a
    public final void i4(String str) {
        this.c.i5(str);
    }

    @Override // com.amazon.aps.iva.af.a
    public final void onCastMetadataUpdated(PlayableAsset playableAsset, long j) {
        w wVar;
        PlayableAsset currentAsset;
        if (playableAsset != null && (currentAsset = (wVar = this.c).getCurrentAsset()) != null && !com.amazon.aps.iva.yb0.j.a(currentAsset.getId(), playableAsset.getId()) && com.amazon.aps.iva.yb0.j.a(currentAsset.getParentId(), playableAsset.getParentId())) {
            wVar.c8(playableAsset, new Playhead(0L, false, null, null, 14, null));
        }
    }

    @Override // com.amazon.aps.iva.af.a
    public final void onCastSessionStarted() {
        g.c<com.amazon.aps.iva.qo.g> a;
        com.amazon.aps.iva.qo.g gVar;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.qo.g> value = this.c.k2().getValue();
        if (value != null && (a = value.a()) != null && (gVar = a.a) != null) {
            N8(gVar);
        }
    }

    @Override // com.amazon.aps.iva.af.a
    public final void onCastSessionStarting() {
        i iVar = this.b;
        this.j = Long.valueOf(iVar.T());
        iVar.stop();
    }

    @Override // com.amazon.aps.iva.af.a
    public final void onCastSessionStopped(Long l) {
        i iVar = this.b;
        if (com.amazon.aps.iva.yb0.j.a(iVar.P().d(), Boolean.FALSE)) {
            if (l != null) {
                this.d.O1(l.longValue());
            }
            iVar.O(false);
        }
    }

    @Override // com.amazon.aps.iva.af.a
    public final void onConnectedToCast(com.amazon.aps.iva.ye.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "session");
    }

    @Override // com.amazon.aps.iva.df.a
    public final LiveData<String> t4() {
        return this.h;
    }
}
