package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.VersionInfo;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsAdapter;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzhj implements SecureSignalsCollectSignalsCallback {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzhk zzb;

    public zzhj(zzhk zzhkVar, TaskCompletionSource taskCompletionSource) {
        this.zzb = zzhkVar;
        this.zza = taskCompletionSource;
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback
    public final void onFailure(Exception exc) {
        this.zza.trySetException(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback
    public final void onSuccess(String str) {
        SecureSignalsAdapter secureSignalsAdapter;
        SecureSignalsAdapter secureSignalsAdapter2;
        secureSignalsAdapter = this.zzb.zza;
        VersionInfo version = secureSignalsAdapter.getVersion();
        secureSignalsAdapter2 = this.zzb.zza;
        this.zza.trySetResult(com.google.ads.interactivemedia.v3.impl.data.zzbo.createBy3rdPartyData(version, secureSignalsAdapter2.getSDKVersion(), this.zzb.zze(), str));
    }
}
