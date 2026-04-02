package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeom implements zzgla<zzeoh<zzeob>> {
    private final zzgln<zzeoa> zza;
    private final zzgln<Clock> zzb;

    public zzeom(zzgln<zzeoa> zzglnVar, zzgln<Clock> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeoh(((zzeoc) this.zza).zzb(), WorkRequest.MIN_BACKOFF_MILLIS, this.zzb.zzb());
    }
}
