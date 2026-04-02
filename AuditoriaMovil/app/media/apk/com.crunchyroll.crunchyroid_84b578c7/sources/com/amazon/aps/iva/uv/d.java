package com.amazon.aps.iva.uv;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.t;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.Date;
/* compiled from: OfflineContentAvailabilityProviderImpl.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.at.c implements com.amazon.aps.iva.gg.a {
    public final com.amazon.aps.iva.zv.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.zv.a aVar, com.amazon.aps.iva.xb0.a<? extends Date> aVar2) {
        super(new t(aVar) { // from class: com.amazon.aps.iva.uv.d.a
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Boolean.valueOf(((com.amazon.aps.iva.zv.a) this.receiver).r());
            }
        }, aVar2);
        j.f(aVar, "benefitsProvider");
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.gg.a
    public final boolean c(PlayableAsset playableAsset) {
        boolean a2;
        j.f(playableAsset, "asset");
        String a3 = a(playableAsset);
        if (j.a(a3, "unavailable")) {
            a2 = true;
        } else {
            a2 = j.a(a3, "comingSoon");
        }
        if (a2) {
            return false;
        }
        return playableAsset.isAvailableOffline();
    }

    @Override // com.amazon.aps.iva.at.c
    public final boolean j(PlayableAsset playableAsset) {
        j.f(playableAsset, "asset");
        return !this.c.r();
    }
}
