package com.google.android.play.core.ktx;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import kotlin.Metadata;
/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdatePassthroughListener;", "Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "Lcom/google/android/play/core/install/InstallState;", "state", "Lcom/amazon/aps/iva/kb0/q;", "onStateUpdate", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "getListener", "()Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "Lkotlin/Function1;", "disposeAction", "Lcom/amazon/aps/iva/xb0/l;", "getDisposeAction", "()Lcom/amazon/aps/iva/xb0/l;", "<init>", "(Lcom/google/android/play/core/install/InstallStateUpdatedListener;Lcom/amazon/aps/iva/xb0/l;)V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
final class AppUpdatePassthroughListener implements InstallStateUpdatedListener {
    private final l<AppUpdatePassthroughListener, q> disposeAction;
    private final InstallStateUpdatedListener listener;

    /* JADX WARN: Multi-variable type inference failed */
    public AppUpdatePassthroughListener(InstallStateUpdatedListener installStateUpdatedListener, l<? super AppUpdatePassthroughListener, q> lVar) {
        j.f(installStateUpdatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        j.f(lVar, "disposeAction");
        this.listener = installStateUpdatedListener;
        this.disposeAction = lVar;
    }

    public final l<AppUpdatePassthroughListener, q> getDisposeAction() {
        return this.disposeAction;
    }

    public final InstallStateUpdatedListener getListener() {
        return this.listener;
    }

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public final void onStateUpdate(InstallState installState) {
        j.f(installState, "state");
        this.listener.onStateUpdate(installState);
        int installStatus = installState.installStatus();
        if (installStatus == 0 || installStatus == 11 || installStatus == 5 || installStatus == 6) {
            this.disposeAction.invoke(this);
        }
    }
}
