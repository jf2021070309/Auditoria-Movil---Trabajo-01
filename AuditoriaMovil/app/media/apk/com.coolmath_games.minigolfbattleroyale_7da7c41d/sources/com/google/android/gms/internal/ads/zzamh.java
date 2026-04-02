package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    public final void zzc(long j) {
        this.zzc = j;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final long zzy() {
        long zza;
        long j = this.zzc;
        if (this.zzb) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
            zzahf zzahfVar = this.zze;
            if (zzahfVar.zzb == 1.0f) {
                zza = zzadx.zzb(elapsedRealtime);
            } else {
                zza = zzahfVar.zza(elapsedRealtime);
            }
            return j + zza;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzz(zzahf zzahfVar) {
        if (this.zzb) {
            zzc(zzy());
        }
        this.zze = zzahfVar;
    }
}
