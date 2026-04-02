package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgl implements zziu {
    public final zziu zza;
    final /* synthetic */ zzgm zzb;
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
    public final int zzd(zzafw zzafwVar, zzaf zzafVar, int i) {
        if (this.zzb.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzafVar.zzf(4);
            return -4;
        }
        int zzd = this.zza.zzd(zzafwVar, zzafVar, i);
        if (zzd != -5) {
            zzgm zzgmVar = this.zzb;
            long j = zzgmVar.zzb;
            if (j == Long.MIN_VALUE || ((zzd != -4 || zzafVar.zzd < j) && !(zzd == -3 && zzgmVar.zzh() == Long.MIN_VALUE && !zzafVar.zzc))) {
                return zzd;
            }
            zzafVar.zza();
            zzafVar.zzf(4);
            this.zzc = true;
            return -4;
        }
        zzafv zzafvVar = zzafwVar.zza;
        if (zzafvVar != null) {
            int i2 = zzafvVar.zzB;
            if (i2 == 0) {
                if (zzafvVar.zzC != 0) {
                    i2 = 0;
                }
                return -5;
            }
            int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzafvVar.zzC : 0;
            zzaft zza = zzafvVar.zza();
            zza.zzad(i2);
            zza.zzae(i3);
            zzafwVar.zza = zza.zzah();
            return -5;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final int zze(long j) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j);
    }
}
