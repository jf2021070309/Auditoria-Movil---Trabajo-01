package com.amazon.aps.iva.uv;

import com.amazon.aps.iva.hg.g;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: BulkDownloadAvailabilityProvider.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.at.a a;

    public b(com.amazon.aps.iva.gg.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.uv.a
    public final c a(g gVar) {
        boolean z;
        boolean z2;
        c cVar;
        j.f(gVar, "input");
        List<PlayableAsset> list = gVar.d;
        List<PlayableAsset> list2 = list;
        boolean z3 = list2 instanceof Collection;
        boolean z4 = true;
        com.amazon.aps.iva.at.a aVar = this.a;
        if (!z3 || !list2.isEmpty()) {
            for (PlayableAsset playableAsset : list2) {
                if (!j.a(aVar.a(playableAsset), "unavailable")) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return new c((PlayableAsset) x.t0(list), "unavailable");
        }
        if (!z3 || !list2.isEmpty()) {
            for (PlayableAsset playableAsset2 : list2) {
                if (j.a(aVar.a(playableAsset2), "matureBlocked")) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            for (PlayableAsset playableAsset3 : list2) {
                if (j.a(aVar.a(playableAsset3), "matureBlocked")) {
                    cVar = new c(playableAsset3, "matureBlocked");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (!z3 || !list2.isEmpty()) {
            for (PlayableAsset playableAsset4 : list2) {
                if (j.a(aVar.a(playableAsset4), "premium")) {
                    break;
                }
            }
        }
        z4 = false;
        if (z4) {
            for (PlayableAsset playableAsset5 : list2) {
                if (j.a(aVar.a(playableAsset5), "premium")) {
                    cVar = new c(playableAsset5, "premium");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return new c((PlayableAsset) x.t0(list), "available");
        return cVar;
    }
}
