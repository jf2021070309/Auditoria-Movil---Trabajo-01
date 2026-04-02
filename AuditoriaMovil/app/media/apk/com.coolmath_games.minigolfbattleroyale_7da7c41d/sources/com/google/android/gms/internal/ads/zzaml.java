package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaml implements zzalg {
    private static final List<zzamk> zza = new ArrayList(50);
    private final Handler zzb;

    public zzaml(Handler handler) {
        this.zzb = handler;
    }

    public static /* synthetic */ void zzk(zzamk zzamkVar) {
        synchronized (zza) {
            if (zza.size() < 50) {
                zza.add(zzamkVar);
            }
        }
    }

    private static zzamk zzl() {
        zzamk zzamkVar;
        synchronized (zza) {
            zzamkVar = zza.isEmpty() ? new zzamk(null) : zza.remove(zza.size() - 1);
        }
        return zzamkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zza(int i) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final zzalf zzb(int i) {
        zzamk zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final zzalf zzc(int i, Object obj) {
        zzamk zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i, obj), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final zzalf zzd(int i, int i2, int i3) {
        zzamk zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(1, i2, i3), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zze(zzalf zzalfVar) {
        return ((zzamk) zzalfVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zzf(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zzg(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final void zzh(int i) {
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
