package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzavx {
    private final Handler zza;
    private final zzavy zzb;

    public zzavx(Handler handler, zzavy zzavyVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzavyVar;
    }

    public final void zzb(zzapf zzapfVar) {
        this.zza.post(new zzavq(this, zzapfVar));
    }

    public final void zzc(String str, long j2, long j3) {
        this.zza.post(new zzavr(this, str, j2, j3));
    }

    public final void zzd(zzanm zzanmVar) {
        this.zza.post(new zzavs(this, zzanmVar));
    }

    public final void zze(int i2, long j2) {
        this.zza.post(new zzavt(this, i2, j2));
    }

    public final void zzf(int i2, int i3, int i4, float f2) {
        this.zza.post(new zzavu(this, i2, i3, i4, f2));
    }

    public final void zzg(Surface surface) {
        this.zza.post(new zzavv(this, surface));
    }

    public final void zzh(zzapf zzapfVar) {
        this.zza.post(new zzavw(this, zzapfVar));
    }
}
