package com.ellation.crunchyroll.cast.castbutton;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.i;
import com.ellation.crunchyroll.cast.CastContextProxy;
import com.google.android.gms.cast.framework.CastStateListener;
import kotlin.Metadata;
/* compiled from: CastButtonPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButtonPresenter;", "Lcom/amazon/aps/iva/wy/k;", "Lcom/google/android/gms/cast/framework/CastStateListener;", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastButtonPresenter extends k, CastStateListener {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastButtonPresenter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButtonPresenter$Companion;", "", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonView;", "view", "Lcom/ellation/crunchyroll/cast/CastContextProxy;", "castContext", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonMediaRouter;", "castButtonMediaRouter", "Lcom/amazon/aps/iva/ye/i;", "playServicesStatusChecker", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonPresenter;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastButtonPresenter create(CastButtonView castButtonView, CastContextProxy castContextProxy, CastButtonMediaRouter castButtonMediaRouter, i iVar) {
            j.f(castButtonView, "view");
            j.f(castContextProxy, "castContext");
            j.f(castButtonMediaRouter, "castButtonMediaRouter");
            j.f(iVar, "playServicesStatusChecker");
            return new CastButtonPresenterImpl(castButtonView, castContextProxy, castButtonMediaRouter, iVar);
        }
    }

    /* compiled from: CastButtonPresenter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(CastButtonPresenter castButtonPresenter, int i, int i2, Intent intent) {
        }

        public static void onConfigurationChanged(CastButtonPresenter castButtonPresenter, Configuration configuration) {
        }

        public static void onCreate(CastButtonPresenter castButtonPresenter) {
        }

        public static void onDestroy(CastButtonPresenter castButtonPresenter) {
        }

        public static void onNewIntent(CastButtonPresenter castButtonPresenter, Intent intent) {
            j.f(intent, "intent");
        }

        public static void onPause(CastButtonPresenter castButtonPresenter) {
        }

        public static void onResume(CastButtonPresenter castButtonPresenter) {
        }

        public static void onStart(CastButtonPresenter castButtonPresenter) {
        }

        public static void onStop(CastButtonPresenter castButtonPresenter) {
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
