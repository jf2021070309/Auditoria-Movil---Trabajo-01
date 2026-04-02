package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes2.dex */
public final class zzew {
    public final /* synthetic */ zzfa zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzew(zzfa zzfaVar, String str, long j2) {
        this.zza = zzfaVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j2;
    }

    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long j2) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putLong(this.zzb, j2);
        edit.apply();
        this.zze = j2;
    }
}
