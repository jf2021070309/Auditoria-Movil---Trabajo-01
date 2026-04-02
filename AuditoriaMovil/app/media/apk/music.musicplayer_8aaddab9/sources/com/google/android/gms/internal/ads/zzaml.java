package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzaml implements zzalg {
    private static final List<zzamk> zza = new ArrayList(50);
    private final Handler zzb;

    public zzaml(Handler handler) {
        this.zzb = handler;
    }

    public static /* synthetic */ void zzk(zzamk zzamkVar) {
        List<zzamk> list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzamkVar);
            }
        }
    }

    private static zzamk zzl() {
        zzamk zzamkVar;
        List<zzamk> list = zza;
        synchronized (list) {
            zzamkVar = list.isEmpty() ? new zzamk(null) : list.remove(list.size() - 1);
        }
        return zzamkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zza(int i2) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final zzalf zzb(int i2) {
        zzamk zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i2), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final zzalf zzc(int i2, Object obj) {
        zzamk zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i2, obj), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final zzalf zzd(int i2, int i3, int i4) {
        zzamk zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(1, i3, i4), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zze(zzalf zzalfVar) {
        return ((zzamk) zzalfVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zzf(int i2) {
        return this.zzb.sendEmptyMessage(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zzg(int i2, long j2) {
        return this.zzb.sendEmptyMessageAtTime(2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final void zzh(int i2) {
        this.zzb.removeMessages(2);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final void zzi(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zzj(Runnable runnable) {
        return this.zzb.post(runnable);
    }
}
