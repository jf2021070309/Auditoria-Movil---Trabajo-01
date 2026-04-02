package com.ellation.crunchyroll.cast.mini;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.at.a;
import com.amazon.aps.iva.at.c;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.CastFeature;
import com.ellation.crunchyroll.model.PlayableAsset;
import kotlin.Metadata;
/* compiled from: CastMiniContentStatePresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStatePresenter;", "Lcom/amazon/aps/iva/wy/k;", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "asset", "Lcom/amazon/aps/iva/kb0/q;", "bind", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastMiniContentStatePresenter extends k {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastMiniContentStatePresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStatePresenter$Companion;", "", "Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStateView;", "view", "Lcom/amazon/aps/iva/at/a;", "contentAvailabilityProvider", "Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStatePresenter;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ CastMiniContentStatePresenter create$default(Companion companion, CastMiniContentStateView castMiniContentStateView, a aVar, int i, Object obj) {
            if ((i & 2) != 0) {
                aVar = new c(CastFeature.Companion.getDependencies$cast_release().getHasPremiumBenefit());
            }
            return companion.create(castMiniContentStateView, aVar);
        }

        public final CastMiniContentStatePresenter create(CastMiniContentStateView castMiniContentStateView, a aVar) {
            j.f(castMiniContentStateView, "view");
            j.f(aVar, "contentAvailabilityProvider");
            return new CastMiniContentStatePresenterImpl(castMiniContentStateView, aVar);
        }
    }

    /* compiled from: CastMiniContentStatePresenter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(CastMiniContentStatePresenter castMiniContentStatePresenter, int i, int i2, Intent intent) {
        }

        public static void onConfigurationChanged(CastMiniContentStatePresenter castMiniContentStatePresenter, Configuration configuration) {
        }

        public static void onCreate(CastMiniContentStatePresenter castMiniContentStatePresenter) {
        }

        public static void onDestroy(CastMiniContentStatePresenter castMiniContentStatePresenter) {
        }

        public static void onNewIntent(CastMiniContentStatePresenter castMiniContentStatePresenter, Intent intent) {
            j.f(intent, "intent");
        }

        public static void onPause(CastMiniContentStatePresenter castMiniContentStatePresenter) {
        }

        public static void onResume(CastMiniContentStatePresenter castMiniContentStatePresenter) {
        }

        public static void onStart(CastMiniContentStatePresenter castMiniContentStatePresenter) {
        }

        public static void onStop(CastMiniContentStatePresenter castMiniContentStatePresenter) {
        }
    }

    void bind(PlayableAsset playableAsset);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onActivityResult(int i, int i2, Intent intent);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onCreate();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onDestroy();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onNewIntent(Intent intent);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onPause();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onPreDestroy();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onResume();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onStart();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onStop();
}
