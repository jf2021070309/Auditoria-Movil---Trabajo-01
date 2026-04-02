package com.google.android.gms.internal.cast;

import com.google.android.gms.common.util.DefaultClock;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzab {
    final int zza;
    final long zzb = DefaultClock.getInstance().currentTimeMillis();
    private long zzc;

    public zzab(zzaa zzaaVar) {
        this.zza = zzaaVar.zza;
    }

    public final zzny zza() {
        zznx zza = zzny.zza();
        zza.zza((int) (this.zzb - this.zzc));
        int i = this.zza;
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    i2 = 1;
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 3;
            }
        }
        zza.zzb(i2);
        return (zzny) zza.zzq();
    }

    public final void zzb(long j) {
        this.zzc = j;
    }
}
