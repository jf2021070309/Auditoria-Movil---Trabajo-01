package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzta implements zztb {
    private final List<zzuk> zza;
    private final zzox[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzta(List<zzuk> list) {
        this.zza = list;
        this.zzb = new zzox[list.size()];
    }

    private final boolean zzf(zzamf zzamfVar, int i2) {
        if (zzamfVar.zzd() == 0) {
            return false;
        }
        if (zzamfVar.zzn() != i2) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        for (int i2 = 0; i2 < this.zzb.length; i2++) {
            zzuk zzukVar = this.zza.get(i2);
            zzunVar.zza();
            zzox zzB = zznxVar.zzB(zzunVar.zzb(), 3);
            zzaft zzaftVar = new zzaft();
            zzaftVar.zzD(zzunVar.zzc());
            zzaftVar.zzN("application/dvbsubs");
            zzaftVar.zzP(Collections.singletonList(zzukVar.zzb));
            zzaftVar.zzG(zzukVar.zza);
            zzB.zzs(zzaftVar.zzah());
            this.zzb[i2] = zzB;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j2 != -9223372036854775807L) {
            this.zzf = j2;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) {
        zzox[] zzoxVarArr;
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzamfVar, 32)) {
                if (this.zzd != 1 || zzf(zzamfVar, 0)) {
                    int zzg = zzamfVar.zzg();
                    int zzd = zzamfVar.zzd();
                    for (zzox zzoxVar : this.zzb) {
                        zzamfVar.zzh(zzg);
                        zzoxVar.zzy(zzamfVar, zzd);
                    }
                    this.zze += zzd;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzox zzoxVar : this.zzb) {
                    zzoxVar.zzv(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }
}
