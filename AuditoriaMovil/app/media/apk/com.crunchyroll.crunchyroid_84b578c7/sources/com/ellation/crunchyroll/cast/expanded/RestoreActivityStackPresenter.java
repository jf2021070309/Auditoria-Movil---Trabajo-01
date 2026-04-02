package com.ellation.crunchyroll.cast.expanded;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.k50.i;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: RestoreActivityStackPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/RestoreActivityStackPresenter;", "Lcom/amazon/aps/iva/wy/k;", "", "isTaskRoot", "Lcom/amazon/aps/iva/kb0/q;", "restoreActivityStack", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface RestoreActivityStackPresenter extends k {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: RestoreActivityStackPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/RestoreActivityStackPresenter$Companion;", "", "Lcom/amazon/aps/iva/wy/h;", "view", "Lcom/amazon/aps/iva/k50/i;", "startupFlowRouter", "Lcom/ellation/crunchyroll/cast/expanded/RestoreActivityStackPresenter;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final RestoreActivityStackPresenter create(h hVar, i iVar) {
            j.f(hVar, "view");
            j.f(iVar, "startupFlowRouter");
            return new RestoreActivityStackPresenterImpl(hVar, iVar);
        }
    }

    /* compiled from: RestoreActivityStackPresenter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(RestoreActivityStackPresenter restoreActivityStackPresenter, int i, int i2, Intent intent) {
        }

        public static void onConfigurationChanged(RestoreActivityStackPresenter restoreActivityStackPresenter, Configuration configuration) {
        }

        public static void onCreate(RestoreActivityStackPresenter restoreActivityStackPresenter) {
        }

        public static void onDestroy(RestoreActivityStackPresenter restoreActivityStackPresenter) {
        }

        public static void onNewIntent(RestoreActivityStackPresenter restoreActivityStackPresenter, Intent intent) {
            j.f(intent, "intent");
        }

        public static void onPause(RestoreActivityStackPresenter restoreActivityStackPresenter) {
        }

        public static void onResume(RestoreActivityStackPresenter restoreActivityStackPresenter) {
        }

        public static void onStart(RestoreActivityStackPresenter restoreActivityStackPresenter) {
        }

        public static void onStop(RestoreActivityStackPresenter restoreActivityStackPresenter) {
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

    void restoreActivityStack(boolean z);
}
