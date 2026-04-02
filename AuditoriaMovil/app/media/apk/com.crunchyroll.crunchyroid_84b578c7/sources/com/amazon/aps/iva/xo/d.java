package com.amazon.aps.iva.xo;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.qo.w;
import com.amazon.aps.iva.so.i;
import com.amazon.aps.iva.so.n;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xo.c;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import java.util.Collection;
import java.util.List;
/* compiled from: WatchScreenDownloadingViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.ez.b implements com.amazon.aps.iva.xo.a {
    public final w b;
    public final i c;
    public final boolean d;
    public final c e;
    public final v<com.amazon.aps.iva.ez.d<q>> f;

    /* compiled from: WatchScreenDownloadingViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.i5.w, f {
        public final /* synthetic */ l a;

        public a(c.a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.a, ((f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w wVar, n nVar, com.amazon.aps.iva.fg.c cVar, boolean z) {
        super(new com.amazon.aps.iva.wy.j[0]);
        j.f(cVar, "downloadsManager");
        this.b = wVar;
        this.c = nVar;
        this.d = z;
        this.e = new c(this, cVar);
        this.f = new v<>();
    }

    @Override // com.amazon.aps.iva.qg.a
    public final void G2(String str) {
        g.c a2;
        com.amazon.aps.iva.no.b bVar;
        PlayableAsset playableAsset;
        String str2;
        j.f(str, "assetId");
        String str3 = null;
        w wVar = this.b;
        boolean z = this.d;
        if (!z) {
            PlayableAsset currentAsset = wVar.getCurrentAsset();
            if (currentAsset != null) {
                str2 = currentAsset.getId();
            } else {
                str2 = null;
            }
            if (j.a(str, str2)) {
                this.f.i(new com.amazon.aps.iva.ez.d<>(q.a));
            }
        }
        if (!z) {
            g gVar = (g) wVar.L8().getValue();
            if (gVar != null && (a2 = gVar.a()) != null && (bVar = (com.amazon.aps.iva.no.b) a2.a) != null && (playableAsset = bVar.a) != null) {
                str3 = playableAsset.getId();
            }
            if (j.a(str, str3)) {
                wVar.U3();
                this.c.x4();
            }
        }
    }

    @Override // com.amazon.aps.iva.xo.a
    public final v M8() {
        return this.f;
    }

    public final com.amazon.aps.iva.hg.g P() {
        PlayableAsset currentAsset = this.b.getCurrentAsset();
        String str = null;
        if (currentAsset == null) {
            return null;
        }
        if (currentAsset instanceof Episode) {
            str = ((Episode) currentAsset).getSeasonId();
        }
        return new com.amazon.aps.iva.hg.g(currentAsset.getParentId(), str, f1.J(currentAsset), a0.b);
    }

    @Override // com.amazon.aps.iva.qg.a
    public final void X6(com.amazon.aps.iva.qg.b... bVarArr) {
        com.amazon.aps.iva.qg.b bVar;
        boolean z;
        j.f(bVarArr, "states");
        PlayableAsset currentAsset = this.b.getCurrentAsset();
        if (currentAsset != null) {
            int length = bVarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    bVar = bVarArr[i];
                    j.f(bVar, "<this>");
                    String id = currentAsset.getId();
                    String str = bVar.a;
                    boolean z2 = true;
                    if (!j.a(str, id)) {
                        List<PlayableAssetVersion> versions = currentAsset.getVersions();
                        if (!(versions instanceof Collection) || !versions.isEmpty()) {
                            for (PlayableAssetVersion playableAssetVersion : versions) {
                                if (j.a(str, playableAssetVersion.getAssetId())) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    i++;
                } else {
                    bVar = null;
                    break;
                }
            }
            if (bVar != null) {
                this.e.i(bVar.b);
            }
        }
    }

    @Override // com.amazon.aps.iva.xo.a
    public final c s2() {
        return this.e;
    }
}
