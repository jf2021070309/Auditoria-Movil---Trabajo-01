package com.ellation.crunchyroll.ui.toolbarmenu.dialog;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: ToolbarMenuDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0014\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogPresenter;", "Lcom/amazon/aps/iva/wy/k;", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/amazon/aps/iva/kb0/q;", "onCreate", "onLayoutUpdate", "onCancel", "Companion", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface ToolbarMenuDialogPresenter extends k {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ToolbarMenuDialogPresenter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogPresenter$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogPresenter;", "view", "Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogView;", "isRtl", "Lkotlin/Function0;", "", "isTablet", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ToolbarMenuDialogPresenter create(ToolbarMenuDialogView toolbarMenuDialogView, a<Boolean> aVar, a<Boolean> aVar2) {
            j.f(toolbarMenuDialogView, "view");
            j.f(aVar, "isRtl");
            j.f(aVar2, "isTablet");
            return new ToolbarMenuDialogPresenterImpl(toolbarMenuDialogView, aVar, aVar2);
        }
    }

    /* compiled from: ToolbarMenuDialogPresenter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(ToolbarMenuDialogPresenter toolbarMenuDialogPresenter, int i, int i2, Intent intent) {
        }

        public static void onConfigurationChanged(ToolbarMenuDialogPresenter toolbarMenuDialogPresenter, Configuration configuration) {
        }

        public static void onCreate(ToolbarMenuDialogPresenter toolbarMenuDialogPresenter) {
        }

        public static /* synthetic */ void onCreate$default(ToolbarMenuDialogPresenter toolbarMenuDialogPresenter, Bundle bundle, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    bundle = null;
                }
                toolbarMenuDialogPresenter.onCreate(bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCreate");
        }

        public static void onDestroy(ToolbarMenuDialogPresenter toolbarMenuDialogPresenter) {
        }

        public static void onNewIntent(ToolbarMenuDialogPresenter toolbarMenuDialogPresenter, Intent intent) {
            j.f(intent, "intent");
        }

        public static void onPause(ToolbarMenuDialogPresenter toolbarMenuDialogPresenter) {
        }

        public static void onResume(ToolbarMenuDialogPresenter toolbarMenuDialogPresenter) {
        }

        public static void onStart(ToolbarMenuDialogPresenter toolbarMenuDialogPresenter) {
        }

        public static void onStop(ToolbarMenuDialogPresenter toolbarMenuDialogPresenter) {
        }
    }

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onActivityResult(int i, int i2, Intent intent);

    void onCancel();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onCreate();

    void onCreate(Bundle bundle);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onDestroy();

    void onLayoutUpdate();

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
