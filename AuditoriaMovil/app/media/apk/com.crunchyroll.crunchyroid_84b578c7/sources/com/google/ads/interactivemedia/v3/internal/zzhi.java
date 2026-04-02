package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzhi implements SecureSignalsInitializeCallback {
    final /* synthetic */ zzhk zza;

    public zzhi(zzhk zzhkVar) {
        this.zza = zzhkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback
    public final void onFailure(Exception exc) {
        TaskCompletionSource taskCompletionSource;
        taskCompletionSource = this.zza.zzd;
        taskCompletionSource.trySetException(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback
    public final void onSuccess() {
        TaskCompletionSource taskCompletionSource;
        taskCompletionSource = this.zza.zzd;
        taskCompletionSource.trySetResult(null);
    }
}
