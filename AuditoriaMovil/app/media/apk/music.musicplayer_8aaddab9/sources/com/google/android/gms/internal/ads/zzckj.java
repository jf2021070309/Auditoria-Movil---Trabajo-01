package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzckj implements zzatz {
    private final zzatz zza;
    private final long zzb;
    private final zzatz zzc;
    private long zzd;
    private Uri zze;

    public zzckj(zzatz zzatzVar, int i2, zzatz zzatzVar2) {
        this.zza = zzatzVar;
        this.zzb = i2;
        this.zzc = zzatzVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final long zza(zzaub zzaubVar) throws IOException {
        zzaub zzaubVar2;
        this.zze = zzaubVar.zza;
        long j2 = zzaubVar.zzc;
        long j3 = this.zzb;
        zzaub zzaubVar3 = null;
        if (j2 >= j3) {
            zzaubVar2 = null;
        } else {
            long j4 = zzaubVar.zzd;
            zzaubVar2 = new zzaub(zzaubVar.zza, null, j2, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null, 0);
        }
        long j5 = zzaubVar.zzd;
        if (j5 == -1 || zzaubVar.zzc + j5 > this.zzb) {
            long max = Math.max(this.zzb, zzaubVar.zzc);
            long j6 = zzaubVar.zzd;
            zzaubVar3 = new zzaub(zzaubVar.zza, null, max, max, j6 != -1 ? Math.min(j6, (zzaubVar.zzc + j6) - this.zzb) : -1L, null, 0);
        }
        long zza = zzaubVar2 != null ? this.zza.zza(zzaubVar2) : 0L;
        long zza2 = zzaubVar3 != null ? this.zzc.zza(zzaubVar3) : 0L;
        this.zzd = zzaubVar.zzc;
        if (zza2 == -1) {
            return -1L;
        }
        return zza + zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final int zzb(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long j2 = this.zzd;
        long j3 = this.zzb;
        if (j2 < j3) {
            int zzb = this.zza.zzb(bArr, i2, (int) Math.min(i3, j3 - j2));
            long j4 = this.zzd + zzb;
            this.zzd = j4;
            i4 = zzb;
            j2 = j4;
        } else {
            i4 = 0;
        }
        if (j2 >= this.zzb) {
            int zzb2 = this.zzc.zzb(bArr, i2 + i4, i3 - i4);
            this.zzd += zzb2;
            return i4 + zzb2;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }
}
