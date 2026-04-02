package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzava implements zzaut {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzanq zzd = zzanq.zza;

    @Override // com.google.android.gms.internal.ads.zzaut
    public final long zzP() {
        long zza;
        long j = this.zzb;
        if (this.zza) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
            zzanq zzanqVar = this.zzd;
            if (zzanqVar.zzb == 1.0f) {
                zza = zzamx.zzb(elapsedRealtime);
            } else {
                zza = zzanqVar.zza(elapsedRealtime);
            }
            return j + zza;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final zzanq zzQ(zzanq zzanqVar) {
        if (this.zza) {
            zzc(zzP());
        }
        this.zzd = zzanqVar;
        return zzanqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final zzanq zzR() {
        throw null;
    }

    public final void zza() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzb() {
        if (this.zza) {
            zzc(zzP());
            this.zza = false;
        }
    }

    public final void zzc(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    public final void zzd(zzaut zzautVar) {
        zzc(zzautVar.zzP());
        this.zzd = zzautVar.zzR();
    }
}
