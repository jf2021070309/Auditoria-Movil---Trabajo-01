package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzgl implements zziu {
    public final zziu zza;
    public final /* synthetic */ zzgm zzb;
    private boolean zzc;

    public zzgl(zzgm zzgmVar, zziu zziuVar) {
        this.zzb = zzgmVar;
        this.zza = zziuVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final int zzd(zzafw zzafwVar, zzaf zzafVar, int i2) {
        if (this.zzb.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzafVar.zzf(4);
            return -4;
        }
        int zzd = this.zza.zzd(zzafwVar, zzafVar, i2);
        if (zzd == -5) {
            zzafv zzafvVar = zzafwVar.zza;
            Objects.requireNonNull(zzafvVar);
            int i3 = zzafvVar.zzB;
            if (i3 == 0) {
                if (zzafvVar.zzC != 0) {
                    i3 = 0;
                }
                return -5;
            }
            int i4 = this.zzb.zzb == Long.MIN_VALUE ? zzafvVar.zzC : 0;
            zzaft zza = zzafvVar.zza();
            zza.zzad(i3);
            zza.zzae(i4);
            zzafwVar.zza = zza.zzah();
            return -5;
        }
        zzgm zzgmVar = this.zzb;
        long j2 = zzgmVar.zzb;
        if (j2 == Long.MIN_VALUE || ((zzd != -4 || zzafVar.zzd < j2) && !(zzd == -3 && zzgmVar.zzh() == Long.MIN_VALUE && !zzafVar.zzc))) {
            return zzd;
        }
        zzafVar.zza();
        zzafVar.zzf(4);
        this.zzc = true;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final int zze(long j2) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j2);
    }
}
