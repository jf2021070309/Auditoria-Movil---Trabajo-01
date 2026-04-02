package com.amazon.aps.iva.qo;

import com.ellation.crunchyroll.api.etp.playback.model.SkipEvents;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: WatchScreenViewModel.kt */
/* loaded from: classes2.dex */
public final class g {
    public final ContentContainer a;
    public final com.amazon.aps.iva.no.b b;

    static {
        int i = SkipEvents.$stable;
        int i2 = PlayableAsset.$stable;
        int i3 = ContentContainer.$stable;
    }

    public g(ContentContainer contentContainer, com.amazon.aps.iva.no.b bVar) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.yb0.j.f(bVar, "currentUpNext");
        this.a = contentContainer;
        this.b = bVar;
    }
}
