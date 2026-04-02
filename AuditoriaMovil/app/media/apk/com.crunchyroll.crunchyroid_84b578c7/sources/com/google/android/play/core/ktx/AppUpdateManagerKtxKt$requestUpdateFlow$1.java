package com.google.android.play.core.ktx;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.ue0.o;
import com.amazon.aps.iva.ue0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.ktx.AppUpdateResult;
import kotlin.Metadata;
/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/ue0/q;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1", f = "AppUpdateManagerKtx.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AppUpdateManagerKtxKt$requestUpdateFlow$1 extends i implements p<q<? super AppUpdateResult>, d<? super com.amazon.aps.iva.kb0.q>, Object> {
    final /* synthetic */ AppUpdateManager $this_requestUpdateFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends l implements a<com.amazon.aps.iva.kb0.q> {
        final /* synthetic */ AppUpdatePassthroughListener $globalUpdateListener;
        final /* synthetic */ AppUpdateManager $this_requestUpdateFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AppUpdateManager appUpdateManager, AppUpdatePassthroughListener appUpdatePassthroughListener) {
            super(0);
            this.$this_requestUpdateFlow = appUpdateManager;
            this.$globalUpdateListener = appUpdatePassthroughListener;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke() {
            invoke2();
            return com.amazon.aps.iva.kb0.q.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_requestUpdateFlow.unregisterListener(this.$globalUpdateListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateManagerKtxKt$requestUpdateFlow$1(AppUpdateManager appUpdateManager, d<? super AppUpdateManagerKtxKt$requestUpdateFlow$1> dVar) {
        super(2, dVar);
        this.$this_requestUpdateFlow = appUpdateManager;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<com.amazon.aps.iva.kb0.q> create(Object obj, d<?> dVar) {
        AppUpdateManagerKtxKt$requestUpdateFlow$1 appUpdateManagerKtxKt$requestUpdateFlow$1 = new AppUpdateManagerKtxKt$requestUpdateFlow$1(this.$this_requestUpdateFlow, dVar);
        appUpdateManagerKtxKt$requestUpdateFlow$1.L$0 = obj;
        return appUpdateManagerKtxKt$requestUpdateFlow$1;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(q<? super AppUpdateResult> qVar, d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((AppUpdateManagerKtxKt$requestUpdateFlow$1) create(qVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            final q qVar = (q) this.L$0;
            final AppUpdateManager appUpdateManager = this.$this_requestUpdateFlow;
            final AppUpdatePassthroughListener appUpdatePassthroughListener = new AppUpdatePassthroughListener(new InstallStateUpdatedListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$1
                @Override // com.google.android.play.core.listener.StateUpdatedListener
                public final void onStateUpdate(InstallState installState) {
                    j.f(installState, "installState");
                    if (installState.installStatus() == 11) {
                        AppUpdateManagerKtxKt.tryOffer(qVar, new AppUpdateResult.Downloaded(appUpdateManager));
                    } else {
                        AppUpdateManagerKtxKt.tryOffer(qVar, new AppUpdateResult.InProgress(installState));
                    }
                }
            }, new AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(qVar));
            Task<AppUpdateInfo> appUpdateInfo = this.$this_requestUpdateFlow.getAppUpdateInfo();
            final AppUpdateManager appUpdateManager2 = this.$this_requestUpdateFlow;
            appUpdateInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1.1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(AppUpdateInfo appUpdateInfo2) {
                    int updateAvailability = appUpdateInfo2.updateAvailability();
                    if (updateAvailability == 0) {
                        qVar.r(new InstallException(-2));
                    } else if (updateAvailability == 1) {
                        AppUpdateManagerKtxKt.tryOffer(qVar, AppUpdateResult.NotAvailable.INSTANCE);
                        qVar.r(null);
                    } else if (updateAvailability == 2 || updateAvailability == 3) {
                        if (appUpdateInfo2.installStatus() == 11) {
                            AppUpdateManagerKtxKt.tryOffer(qVar, new AppUpdateResult.Downloaded(appUpdateManager2));
                            qVar.r(null);
                            return;
                        }
                        appUpdateManager2.registerListener(appUpdatePassthroughListener);
                        AppUpdateManagerKtxKt.tryOffer(qVar, new AppUpdateResult.Available(appUpdateManager2, appUpdateInfo2));
                    }
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1.2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    j.f(exc, "exception");
                    qVar.r(exc);
                }
            });
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_requestUpdateFlow, appUpdatePassthroughListener);
            this.label = 1;
            if (o.a(qVar, anonymousClass3, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
