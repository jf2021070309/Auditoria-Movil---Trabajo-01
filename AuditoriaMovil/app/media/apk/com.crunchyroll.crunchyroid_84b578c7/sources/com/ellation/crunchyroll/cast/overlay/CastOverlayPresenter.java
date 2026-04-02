package com.ellation.crunchyroll.cast.overlay;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.df.a;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.f;
import kotlin.Metadata;
/* compiled from: CastOverlayPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/cast/overlay/CastOverlayPresenter;", "Lcom/amazon/aps/iva/wy/k;", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastOverlayPresenter extends k {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastOverlayPresenter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/cast/overlay/CastOverlayPresenter$Companion;", "", "Lcom/ellation/crunchyroll/cast/overlay/InternalCastOverlayView;", "view", "Lcom/amazon/aps/iva/df/a;", "viewModel", "Lcom/amazon/aps/iva/ye/f;", "castStateProvider", "Lcom/ellation/crunchyroll/cast/overlay/CastOverlayPresenter;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastOverlayPresenter create(InternalCastOverlayView internalCastOverlayView, a aVar, f fVar) {
            j.f(internalCastOverlayView, "view");
            j.f(aVar, "viewModel");
            j.f(fVar, "castStateProvider");
            return new CastOverlayPresenterImpl(internalCastOverlayView, aVar, fVar);
        }
    }

    /* compiled from: CastOverlayPresenter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(CastOverlayPresenter castOverlayPresenter, int i, int i2, Intent intent) {
        }

        public static void onConfigurationChanged(CastOverlayPresenter castOverlayPresenter, Configuration configuration) {
        }

        public static void onCreate(CastOverlayPresenter castOverlayPresenter) {
        }

        public static void onDestroy(CastOverlayPresenter castOverlayPresenter) {
        }

        public static void onNewIntent(CastOverlayPresenter castOverlayPresenter, Intent intent) {
            j.f(intent, "intent");
        }

        public static void onPause(CastOverlayPresenter castOverlayPresenter) {
        }

        public static void onResume(CastOverlayPresenter castOverlayPresenter) {
        }

        public static void onStart(CastOverlayPresenter castOverlayPresenter) {
        }

        public static void onStop(CastOverlayPresenter castOverlayPresenter) {
        }
    }

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
