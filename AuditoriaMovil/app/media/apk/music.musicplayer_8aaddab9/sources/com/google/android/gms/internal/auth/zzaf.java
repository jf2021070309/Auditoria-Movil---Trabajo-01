package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class zzaf extends zzah {
    public final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    public final void zzc(boolean z) {
        this.zza.setResult((zzag) new zzak(z ? Status.RESULT_SUCCESS : zzal.zza));
    }
}
