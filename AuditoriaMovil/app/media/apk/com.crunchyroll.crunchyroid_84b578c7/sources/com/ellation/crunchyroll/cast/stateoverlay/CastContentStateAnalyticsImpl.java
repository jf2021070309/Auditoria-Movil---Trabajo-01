package com.ellation.crunchyroll.cast.stateoverlay;

import com.amazon.aps.iva.ds.a;
import com.amazon.aps.iva.fs.b;
import com.amazon.aps.iva.us.u;
import com.amazon.aps.iva.us.v;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastContentStateAnalytics.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J \u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateAnalyticsImpl;", "Lcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateAnalytics;", "Lcom/amazon/aps/iva/us/u;", "Lcom/amazon/aps/iva/fs/b;", "clickedView", "Lcom/amazon/aps/iva/ls/a;", "screen", "Lcom/amazon/aps/iva/vw/a;", "experimentObjectConfig", "Lcom/amazon/aps/iva/kb0/q;", "onUpsellFlowEntryPointClick", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "asset", "", "status", "onActionClick", "Lcom/amazon/aps/iva/ds/a;", "analytics", "Lcom/amazon/aps/iva/ds/a;", "getAnalytics", "()Lcom/amazon/aps/iva/ds/a;", "Lkotlin/Function0;", "", "hasPremiumBenefit", "<init>", "(Lcom/amazon/aps/iva/ds/a;Lcom/amazon/aps/iva/xb0/a;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastContentStateAnalyticsImpl implements CastContentStateAnalytics, u {
    private final /* synthetic */ u $$delegate_0;
    private final a analytics;

    public CastContentStateAnalyticsImpl(a aVar, com.amazon.aps.iva.xb0.a<Boolean> aVar2) {
        j.f(aVar, "analytics");
        j.f(aVar2, "hasPremiumBenefit");
        this.analytics = aVar;
        com.amazon.aps.iva.ls.a aVar3 = com.amazon.aps.iva.ls.a.CHROMECAST;
        j.f(aVar3, "screen");
        this.$$delegate_0 = new v(aVar, aVar3, aVar2);
    }

    public final a getAnalytics() {
        return this.analytics;
    }

    @Override // com.ellation.crunchyroll.cast.stateoverlay.CastContentStateAnalytics
    public void onActionClick(b bVar, PlayableAsset playableAsset, String str) {
        j.f(bVar, "clickedView");
        j.f(playableAsset, "asset");
        j.f(str, "status");
        if (j.a(str, "premium")) {
            u.a.a(this, bVar, playableAsset, 4);
        }
    }

    @Override // com.amazon.aps.iva.us.u
    public void onUpsellFlowEntryPointClick(b bVar, com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.vw.a aVar2) {
        j.f(bVar, "clickedView");
        j.f(aVar, "screen");
        this.$$delegate_0.onUpsellFlowEntryPointClick(bVar, aVar, aVar2);
    }

    @Override // com.amazon.aps.iva.us.u
    public void onUpsellFlowEntryPointClick(b bVar, PlayableAsset playableAsset, com.amazon.aps.iva.vw.a aVar) {
        j.f(bVar, "clickedView");
        this.$$delegate_0.onUpsellFlowEntryPointClick(bVar, playableAsset, aVar);
    }
}
