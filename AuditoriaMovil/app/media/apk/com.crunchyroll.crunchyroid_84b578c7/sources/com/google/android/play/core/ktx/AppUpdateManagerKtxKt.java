package com.google.android.play.core.ktx;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.dg.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.ob0.h;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.se0.n;
import com.amazon.aps.iva.ue0.e;
import com.amazon.aps.iva.ue0.i;
import com.amazon.aps.iva.ue0.w;
import com.amazon.aps.iva.ve0.f;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import kotlin.Metadata;
/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u0000\u001a*\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u001a'\u0010\u001c\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0016\u0010!\u001a\u00020\u0015*\u00020\u001e8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0016\u0010$\u001a\u00020\u0015*\u00020\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0016\u0010$\u001a\u00020\u0015*\u00020\u001e8Ç\u0002¢\u0006\u0006\u001a\u0004\b\"\u0010 \"\u0016\u0010&\u001a\u00020\u0015*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b%\u0010#\"\u0016\u0010*\u001a\u00020'*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0016\u0010*\u001a\u00020'*\u00020\u001e8Æ\u0002¢\u0006\u0006\u001a\u0004\b(\u0010+\"\u0016\u0010-\u001a\u00020'*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b,\u0010)\"\u0016\u0010-\u001a\u00020'*\u00020\u001e8Æ\u0002¢\u0006\u0006\u001a\u0004\b,\u0010+\"\u0018\u00100\u001a\u0004\u0018\u00010\u0015*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0016\u00104\u001a\u000201*\u00020\u001e8Æ\u0002¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0016\u00107\u001a\u00020\u0017*\u00020\u001e8Æ\u0002¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0016\u00108\u001a\u00020\u0017*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0016\u0010:\u001a\u00020\u0017*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b:\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lcom/google/android/play/core/appupdate/AppUpdateManager;", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "requestAppUpdateInfo", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/amazon/aps/iva/kb0/q;", "requestCompleteUpdate", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/android/gms/tasks/Task;", "task", "Lkotlin/Function0;", "onCanceled", "runTask", "(Lcom/google/android/gms/tasks/Task;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/amazon/aps/iva/ve0/f;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "requestUpdateFlow", "appUpdateInfo", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/google/android/play/core/appupdate/AppUpdateOptions;", "options", "", "requestCode", "", "startUpdateFlowForResult", "E", "Lcom/amazon/aps/iva/ue0/w;", "element", "tryOffer", "(Lcom/amazon/aps/iva/ue0/w;Ljava/lang/Object;)Z", "Lcom/google/android/play/core/install/InstallState;", "getInstallErrorCode", "(Lcom/google/android/play/core/install/InstallState;)I", "installErrorCode", "getInstallStatus", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)I", "installStatus", "getUpdatePriority", "updatePriority", "", "getBytesDownloaded", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)J", "bytesDownloaded", "(Lcom/google/android/play/core/install/InstallState;)J", "getTotalBytesToDownload", "totalBytesToDownload", "getClientVersionStalenessDays", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)Ljava/lang/Integer;", "clientVersionStalenessDays", "", "getPackageName", "(Lcom/google/android/play/core/install/InstallState;)Ljava/lang/String;", "packageName", "getHasTerminalStatus", "(Lcom/google/android/play/core/install/InstallState;)Z", "hasTerminalStatus", "isFlexibleUpdateAllowed", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)Z", "isImmediateUpdateAllowed", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class AppUpdateManagerKtxKt {
    public static final long getBytesDownloaded(AppUpdateInfo appUpdateInfo) {
        j.f(appUpdateInfo, "<this>");
        return appUpdateInfo.bytesDownloaded();
    }

    public static final Integer getClientVersionStalenessDays(AppUpdateInfo appUpdateInfo) {
        j.f(appUpdateInfo, "<this>");
        return appUpdateInfo.clientVersionStalenessDays();
    }

    public static final boolean getHasTerminalStatus(InstallState installState) {
        j.f(installState, "<this>");
        int installStatus = installState.installStatus();
        if (installStatus != 0 && installStatus != 11 && installStatus != 5 && installStatus != 6) {
            return false;
        }
        return true;
    }

    @InstallErrorCode
    public static final int getInstallErrorCode(InstallState installState) {
        j.f(installState, "<this>");
        return installState.installErrorCode();
    }

    @InstallStatus
    public static final int getInstallStatus(AppUpdateInfo appUpdateInfo) {
        j.f(appUpdateInfo, "<this>");
        return appUpdateInfo.installStatus();
    }

    public static final String getPackageName(InstallState installState) {
        j.f(installState, "<this>");
        String packageName = installState.packageName();
        j.e(packageName, "packageName()");
        return packageName;
    }

    public static final long getTotalBytesToDownload(AppUpdateInfo appUpdateInfo) {
        j.f(appUpdateInfo, "<this>");
        return appUpdateInfo.totalBytesToDownload();
    }

    public static final int getUpdatePriority(AppUpdateInfo appUpdateInfo) {
        j.f(appUpdateInfo, "<this>");
        return appUpdateInfo.updatePriority();
    }

    public static final boolean isFlexibleUpdateAllowed(AppUpdateInfo appUpdateInfo) {
        j.f(appUpdateInfo, "<this>");
        return appUpdateInfo.isUpdateTypeAllowed(0);
    }

    public static final boolean isImmediateUpdateAllowed(AppUpdateInfo appUpdateInfo) {
        j.f(appUpdateInfo, "<this>");
        return appUpdateInfo.isUpdateTypeAllowed(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object requestAppUpdateInfo(com.google.android.play.core.appupdate.AppUpdateManager r4, com.amazon.aps.iva.ob0.d<? super com.google.android.play.core.appupdate.AppUpdateInfo> r5) {
        /*
            boolean r0 = r5 instanceof com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1
            if (r0 == 0) goto L13
            r0 = r5
            com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1 r0 = (com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1 r0 = new com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            com.amazon.aps.iva.ab.x.i0(r5)
            com.google.android.gms.tasks.Task r4 = r4.getAppUpdateInfo()
            java.lang.String r5 = "appUpdateInfo"
            com.amazon.aps.iva.yb0.j.e(r4, r5)
            r0.label = r3
            r5 = 0
            r2 = 2
            java.lang.Object r5 = runTask$default(r4, r5, r0, r2, r5)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.String r4 = "runTask(appUpdateInfo)"
            com.amazon.aps.iva.yb0.j.e(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.requestAppUpdateInfo(com.google.android.play.core.appupdate.AppUpdateManager, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final Object requestCompleteUpdate(AppUpdateManager appUpdateManager, d<? super q> dVar) {
        Task<Void> completeUpdate = appUpdateManager.completeUpdate();
        j.e(completeUpdate, "completeUpdate()");
        Object runTask$default = runTask$default(completeUpdate, null, dVar, 2, null);
        if (runTask$default == a.COROUTINE_SUSPENDED) {
            return runTask$default;
        }
        return q.a;
    }

    public static final f<AppUpdateResult> requestUpdateFlow(AppUpdateManager appUpdateManager) throws InstallException {
        j.f(appUpdateManager, "<this>");
        return b.i(new com.amazon.aps.iva.ve0.b(new AppUpdateManagerKtxKt$requestUpdateFlow$1(appUpdateManager, null), h.b, -2, e.SUSPEND), -1);
    }

    public static final <T> Object runTask(Task<T> task, com.amazon.aps.iva.xb0.a<q> aVar, d<? super T> dVar) {
        final n nVar = new n(1, com.amazon.aps.iva.a60.b.s(dVar));
        nVar.r();
        nVar.w(new AppUpdateManagerKtxKt$runTask$3$1(aVar));
        if (task.isComplete()) {
            if (task.isSuccessful()) {
                nVar.resumeWith(task.getResult());
            } else {
                Exception exception = task.getException();
                j.c(exception);
                nVar.resumeWith(x.H(exception));
            }
        } else {
            task.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$3$2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(T t) {
                    nVar.resumeWith(t);
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    j.f(exc, "exception");
                    nVar.resumeWith(x.H(exc));
                }
            });
        }
        Object q = nVar.q();
        a aVar2 = a.COROUTINE_SUSPENDED;
        return q;
    }

    public static /* synthetic */ Object runTask$default(Task task, com.amazon.aps.iva.xb0.a aVar, d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = AppUpdateManagerKtxKt$runTask$2.INSTANCE;
        }
        return runTask(task, aVar, dVar);
    }

    public static final boolean startUpdateFlowForResult(AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo, final Fragment fragment, AppUpdateOptions appUpdateOptions, int i) throws IntentSender.SendIntentException {
        j.f(appUpdateManager, "<this>");
        j.f(appUpdateInfo, "appUpdateInfo");
        j.f(fragment, "fragment");
        j.f(appUpdateOptions, "options");
        return appUpdateManager.startUpdateFlowForResult(appUpdateInfo, new IntentSenderForResultStarter() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$startUpdateFlowForResult$1
            @Override // com.google.android.play.core.common.IntentSenderForResultStarter
            public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
                j.f(intentSender, "p0");
                Fragment.this.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
            }
        }, appUpdateOptions, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(w<? super E> wVar, E e) {
        j.f(wVar, "<this>");
        return !(wVar.h(e) instanceof i.b);
    }

    public static final long getBytesDownloaded(InstallState installState) {
        j.f(installState, "<this>");
        return installState.bytesDownloaded();
    }

    @InstallStatus
    public static final int getInstallStatus(InstallState installState) {
        j.f(installState, "<this>");
        return installState.installStatus();
    }

    public static final long getTotalBytesToDownload(InstallState installState) {
        j.f(installState, "<this>");
        return installState.totalBytesToDownload();
    }
}
