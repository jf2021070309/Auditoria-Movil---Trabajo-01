package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.h.c;
import com.amazon.aps.iva.h.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallState;
import kotlin.Metadata;
/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult;", "", "()V", "Available", "Downloaded", "InProgress", "NotAvailable", "Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class AppUpdateResult {

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Lcom/amazon/aps/iva/kb0/q;", "completeUpdate", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "<init>", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;)V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Downloaded extends AppUpdateResult {
        private final AppUpdateManager appUpdateManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloaded(AppUpdateManager appUpdateManager) {
            super(null);
            j.f(appUpdateManager, "appUpdateManager");
            this.appUpdateManager = appUpdateManager;
        }

        public final Object completeUpdate(d<? super q> dVar) {
            Object requestCompleteUpdate = AppUpdateManagerKtxKt.requestCompleteUpdate(this.appUpdateManager, dVar);
            if (requestCompleteUpdate == a.COROUTINE_SUSPENDED) {
                return requestCompleteUpdate;
            }
            return q.a;
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "installState", "Lcom/google/android/play/core/install/InstallState;", "(Lcom/google/android/play/core/install/InstallState;)V", "getInstallState", "()Lcom/google/android/play/core/install/InstallState;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class InProgress extends AppUpdateResult {
        private final InstallState installState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(InstallState installState) {
            super(null);
            j.f(installState, "installState");
            this.installState = installState;
        }

        public final InstallState getInstallState() {
            return this.installState;
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "()V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class NotAvailable extends AppUpdateResult {
        public static final NotAvailable INSTANCE = new NotAvailable();

        private NotAvailable() {
            super(null);
        }
    }

    private AppUpdateResult() {
    }

    public /* synthetic */ AppUpdateResult(e eVar) {
        this();
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0014\u0010\r\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Lcom/amazon/aps/iva/h/c;", "Lcom/amazon/aps/iva/h/g;", "activityResultLauncher", "", "startFlexibleUpdate", "Landroid/app/Activity;", "activity", "", "requestCode", "Landroidx/fragment/app/Fragment;", "fragment", "startImmediateUpdate", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "updateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "getUpdateInfo", "()Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "<init>", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Available extends AppUpdateResult {
        private final AppUpdateManager appUpdateManager;
        private final AppUpdateInfo updateInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo) {
            super(null);
            j.f(appUpdateManager, "appUpdateManager");
            j.f(appUpdateInfo, "updateInfo");
            this.appUpdateManager = appUpdateManager;
            this.updateInfo = appUpdateInfo;
        }

        public final AppUpdateInfo getUpdateInfo() {
            return this.updateInfo;
        }

        public final boolean startFlexibleUpdate(c<g> cVar) {
            j.f(cVar, "activityResultLauncher");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, cVar, AppUpdateOptions.newBuilder(0).build());
        }

        public final boolean startImmediateUpdate(c<g> cVar) {
            j.f(cVar, "activityResultLauncher");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, cVar, AppUpdateOptions.newBuilder(1).build());
        }

        public final boolean startFlexibleUpdate(Activity activity, int i) {
            j.f(activity, "activity");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activity, AppUpdateOptions.newBuilder(0).build(), i);
        }

        public final boolean startImmediateUpdate(Activity activity, int i) {
            j.f(activity, "activity");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activity, AppUpdateOptions.newBuilder(1).build(), i);
        }

        public final boolean startFlexibleUpdate(Fragment fragment, int i) {
            j.f(fragment, "fragment");
            AppUpdateManager appUpdateManager = this.appUpdateManager;
            AppUpdateInfo appUpdateInfo = this.updateInfo;
            AppUpdateOptions build = AppUpdateOptions.newBuilder(0).build();
            j.e(build, "newBuilder(AppUpdateType.FLEXIBLE).build()");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(appUpdateManager, appUpdateInfo, fragment, build, i);
        }

        public final boolean startImmediateUpdate(Fragment fragment, int i) {
            j.f(fragment, "fragment");
            AppUpdateManager appUpdateManager = this.appUpdateManager;
            AppUpdateInfo appUpdateInfo = this.updateInfo;
            AppUpdateOptions build = AppUpdateOptions.newBuilder(1).build();
            j.e(build, "newBuilder(AppUpdateType.IMMEDIATE).build()");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(appUpdateManager, appUpdateInfo, fragment, build, i);
        }
    }
}
