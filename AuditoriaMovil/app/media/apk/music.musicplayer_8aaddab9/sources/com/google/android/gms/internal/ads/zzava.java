package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class zzava implements zzaut {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzanq zzd = zzanq.zza;

    @Override // com.google.android.gms.internal.ads.zzaut
    public final long zzP() {
        long j2 = this.zzb;
        if (this.zza) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
            zzanq zzanqVar = this.zzd;
            return j2 + (zzanqVar.zzb == 1.0f ? zzamx.zzb(elapsedRealtime) : zzanqVar.zza(elapsedRealtime));
        }
        return j2;
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

    public final void zzc(long j2) {
        this.zzb = j2;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    public final void zzd(zzaut zzautVar) {
        zzc(zzautVar.zzP());
        this.zzd = zzautVar.zzR();
    }
}
