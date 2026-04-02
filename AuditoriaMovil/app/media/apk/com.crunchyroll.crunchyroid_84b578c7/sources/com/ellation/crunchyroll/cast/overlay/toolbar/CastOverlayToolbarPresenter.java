package com.ellation.crunchyroll.cast.overlay.toolbar;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.df.a;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: CastOverlayToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarPresenter;", "Lcom/amazon/aps/iva/wy/k;", "Lcom/amazon/aps/iva/kb0/q;", "onBackButtonClick", "onSkipToNext", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastOverlayToolbarPresenter extends k {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastOverlayToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarPresenter$Companion;", "", "Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarView;", "view", "Lcom/amazon/aps/iva/df/a;", "viewModel", "Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarPresenter;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastOverlayToolbarPresenter create(CastOverlayToolbarView castOverlayToolbarView, a aVar) {
            j.f(castOverlayToolbarView, "view");
            j.f(aVar, "viewModel");
            return new CastOverlayToolbarPresenterImpl(castOverlayToolbarView, aVar);
        }
    }

    /* compiled from: CastOverlayToolbarPresenter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(CastOverlayToolbarPresenter castOverlayToolbarPresenter, int i, int i2, Intent intent) {
        }

        public static void onConfigurationChanged(CastOverlayToolbarPresenter castOverlayToolbarPresenter, Configuration configuration) {
        }

        public static void onCreate(CastOverlayToolbarPresenter castOverlayToolbarPresenter) {
        }

        public static void onDestroy(CastOverlayToolbarPresenter castOverlayToolbarPresenter) {
        }

        public static void onNewIntent(CastOverlayToolbarPresenter castOverlayToolbarPresenter, Intent intent) {
            j.f(intent, "intent");
        }

        public static void onPause(CastOverlayToolbarPresenter castOverlayToolbarPresenter) {
        }

        public static void onResume(CastOverlayToolbarPresenter castOverlayToolbarPresenter) {
        }

        public static void onStart(CastOverlayToolbarPresenter castOverlayToolbarPresenter) {
        }

        public static void onStop(CastOverlayToolbarPresenter castOverlayToolbarPresenter) {
        }
    }

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onActivityResult(int i, int i2, Intent intent);

    void onBackButtonClick();

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

    void onSkipToNext();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onStart();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onStop();
}
