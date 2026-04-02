package com.ellation.crunchyroll.cast.stateoverlay;

import com.amazon.aps.iva.ds.a;
import com.amazon.aps.iva.fs.b;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
import kotlin.Metadata;
/* compiled from: CastContentStateAnalytics.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateAnalytics;", "", "Lcom/amazon/aps/iva/fs/b;", "clickedView", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "asset", "", "status", "Lcom/amazon/aps/iva/kb0/q;", "onActionClick", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastContentStateAnalytics {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastContentStateAnalytics.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateAnalytics$Companion;", "", "Lcom/amazon/aps/iva/ds/a;", "analytics", "Lkotlin/Function0;", "", "hasPremiumBenefit", "Lcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateAnalytics;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastContentStateAnalytics create(a aVar, com.amazon.aps.iva.xb0.a<Boolean> aVar2) {
            j.f(aVar, "analytics");
            j.f(aVar2, "hasPremiumBenefit");
            return new CastContentStateAnalyticsImpl(aVar, aVar2);
        }
    }

    void onActionClick(b bVar, PlayableAsset playableAsset, String str);
}
