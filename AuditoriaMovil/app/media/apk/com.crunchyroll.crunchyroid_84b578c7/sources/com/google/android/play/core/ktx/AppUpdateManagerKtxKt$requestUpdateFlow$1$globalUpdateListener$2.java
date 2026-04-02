package com.google.android.play.core.ktx;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdatePassthroughListener;", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/google/android/play/core/ktx/AppUpdatePassthroughListener;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2 extends l implements com.amazon.aps.iva.xb0.l<AppUpdatePassthroughListener, q> {
    final /* synthetic */ com.amazon.aps.iva.ue0.q<AppUpdateResult> $$this$callbackFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(com.amazon.aps.iva.ue0.q<? super AppUpdateResult> qVar) {
        super(1);
        this.$$this$callbackFlow = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final /* bridge */ /* synthetic */ q invoke(AppUpdatePassthroughListener appUpdatePassthroughListener) {
        invoke2(appUpdatePassthroughListener);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AppUpdatePassthroughListener appUpdatePassthroughListener) {
        j.f(appUpdatePassthroughListener, "$this$$receiver");
        this.$$this$callbackFlow.r(null);
    }
}
