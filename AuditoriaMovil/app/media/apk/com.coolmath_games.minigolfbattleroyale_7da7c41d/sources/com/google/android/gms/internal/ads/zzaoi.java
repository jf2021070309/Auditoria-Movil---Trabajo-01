package com.google.android.gms.internal.ads;

import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaoi {
    private final Handler zza;
    private final zzaoj zzb;

    public zzaoi(Handler handler, zzaoj zzaojVar) {
        if (handler == null) {
            throw null;
        }
        this.zza = handler;
        this.zzb = zzaojVar;
    }

    public final void zzb(zzapf zzapfVar) {
        this.zza.post(new zzaoc(this, zzapfVar));
    }

    public final void zzc(String str, long j, long j2) {
        this.zza.post(new zzaod(this, str, j, j2));
    }

    public final void zzd(zzanm zzanmVar) {
        this.zza.post(new zzaoe(this, zzanmVar));
    }

    public final void zze(int i, long j, long j2) {
        this.zza.post(new zzaof(this, i, j, j2));
    }

    public final void zzf(zzapf zzapfVar) {
        this.zza.post(new zzaog(this, zzapfVar));
    }

    public final void zzg(int i) {
        this.zza.post(new zzaoh(this, i));
    }
}
