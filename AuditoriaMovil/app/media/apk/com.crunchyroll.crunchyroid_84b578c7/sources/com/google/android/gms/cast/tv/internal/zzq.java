package com.google.android.gms.cast.tv.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.cast_tv.zzct;
import com.google.android.gms.internal.cast_tv.zzef;
import com.google.android.gms.internal.cast_tv.zzem;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
final class zzq extends zzem {
    final /* synthetic */ TaskCompletionSource zza;

    public zzq(zzs zzsVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzen
    public final void zzb(zzef zzefVar) {
        ApiException generateApiExceptionForErrorReason;
        zzct zza = zzefVar.zza();
        if (zza.zze()) {
            TaskCompletionSource taskCompletionSource = this.zza;
            generateApiExceptionForErrorReason = CastTvHostService.generateApiExceptionForErrorReason(zza.zza());
            taskCompletionSource.setException(generateApiExceptionForErrorReason);
            return;
        }
        this.zza.setResult(zza.zzd());
    }
}
