package com.ellation.crunchyroll.cast.mini;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.i;
import com.ellation.crunchyroll.cast.PlayServicesStatusCheckerInternal;
import kotlin.Metadata;
/* compiled from: CastMiniControllerPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerPresenter;", "Lcom/amazon/aps/iva/wy/k;", "Lcom/amazon/aps/iva/kb0/q;", "onInit", "Factory", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastMiniControllerPresenter extends k {

    /* compiled from: CastMiniControllerPresenter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(CastMiniControllerPresenter castMiniControllerPresenter, int i, int i2, Intent intent) {
        }

        public static void onConfigurationChanged(CastMiniControllerPresenter castMiniControllerPresenter, Configuration configuration) {
        }

        public static void onCreate(CastMiniControllerPresenter castMiniControllerPresenter) {
        }

        public static void onDestroy(CastMiniControllerPresenter castMiniControllerPresenter) {
        }

        public static void onNewIntent(CastMiniControllerPresenter castMiniControllerPresenter, Intent intent) {
            j.f(intent, "intent");
        }

        public static void onPause(CastMiniControllerPresenter castMiniControllerPresenter) {
        }

        public static void onResume(CastMiniControllerPresenter castMiniControllerPresenter) {
        }

        public static void onStart(CastMiniControllerPresenter castMiniControllerPresenter) {
        }

        public static void onStop(CastMiniControllerPresenter castMiniControllerPresenter) {
        }
    }

    /* compiled from: CastMiniControllerPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerPresenter$Factory;", "", "Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerView;", "view", "Lcom/amazon/aps/iva/ye/i;", "playServices", "Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerPresenter;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Factory {
        public static final int $stable = 0;
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        public static /* synthetic */ CastMiniControllerPresenter create$default(Factory factory, CastMiniControllerView castMiniControllerView, i iVar, int i, Object obj) {
            if ((i & 2) != 0) {
                iVar = PlayServicesStatusCheckerInternal.Holder.get();
            }
            return factory.create(castMiniControllerView, iVar);
        }

        public final CastMiniControllerPresenter create(CastMiniControllerView castMiniControllerView, i iVar) {
            j.f(castMiniControllerView, "view");
            j.f(iVar, "playServices");
            return new CastMiniControllerPresenterImpl(castMiniControllerView, iVar);
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

    void onInit();

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
