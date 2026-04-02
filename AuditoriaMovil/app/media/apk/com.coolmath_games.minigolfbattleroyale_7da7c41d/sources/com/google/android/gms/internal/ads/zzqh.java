package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzqh {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zznv zznvVar) throws IOException {
        if (this.zzb) {
            return;
        }
        ((zznp) zznvVar).zzh(this.zza, 0, 10, false);
        zznvVar.zzl();
        byte[] bArr = this.zza;
        int i = zzna.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    @RequiresNonNull({"#1.output"})
    public final void zzc(zzqg zzqgVar, long j, int i, int i2, int i3) {
        if (this.zzb) {
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zzd(zzqgVar);
            }
        }
    }

    @RequiresNonNull({"#1.output"})
    public final void zzd(zzqg zzqgVar) {
        if (this.zzc > 0) {
            zzqgVar.zzV.zzv(this.zzd, this.zze, this.zzf, this.zzg, zzqgVar.zzi);
            this.zzc = 0;
        }
    }
}
