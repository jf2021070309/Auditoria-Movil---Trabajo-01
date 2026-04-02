package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzdl implements ResultCallback {
    final /* synthetic */ zzdm zza;
    private final long zzb;

    public zzdl(zzdm zzdmVar, long j) {
        this.zza = zzdmVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(Result result) {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        Status status = (Status) result;
        if (!status.isSuccess()) {
            zzdm zzdmVar = this.zza;
            long j = this.zzb;
            zzaqVar = zzdmVar.zza.zzb;
            zzaqVar.zzP(j, status.getStatusCode());
        }
    }
}
