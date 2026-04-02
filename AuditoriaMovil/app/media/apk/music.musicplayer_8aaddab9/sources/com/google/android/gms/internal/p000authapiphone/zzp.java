package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzp  reason: invalid package */
/* loaded from: classes.dex */
public final class zzp extends zzd {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzp(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zze
    public final void zzb(Status status, int i2) {
        TaskUtil.setResultOrApiException(status, Integer.valueOf(i2), this.zza);
    }
}
