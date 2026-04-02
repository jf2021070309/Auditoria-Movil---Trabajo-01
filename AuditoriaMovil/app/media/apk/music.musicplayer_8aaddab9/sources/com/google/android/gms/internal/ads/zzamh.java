package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class zzamh implements zzalp {
    private final zzaku zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzahf zze = zzahf.zza;

    public zzamh(zzaku zzakuVar) {
        this.zza = zzakuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final zzahf zzA() {
        return this.zze;
    }

    public final void zza() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zzb() {
        if (this.zzb) {
            zzc(zzy());
            this.zzb = false;
        }
    }

    public final void zzc(long j2) {
        this.zzc = j2;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final long zzy() {
        long j2 = this.zzc;
        if (this.zzb) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
            zzahf zzahfVar = this.zze;
            return j2 + (zzahfVar.zzb == 1.0f ? zzadx.zzb(elapsedRealtime) : zzahfVar.zza(elapsedRealtime));
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzz(zzahf zzahfVar) {
        if (this.zzb) {
            zzc(zzy());
        }
        this.zze = zzahfVar;
    }
}
