package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzclq implements zzaj {
    private final zzaj zza;
    private final long zzb;
    private final zzaj zzc;
    private long zzd;
    private Uri zze;

    public zzclq(zzaj zzajVar, int i2, zzaj zzajVar2) {
        this.zza = zzajVar;
        this.zzb = i2;
        this.zzc = zzajVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zza(zzay zzayVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Map<String, List<String>> zzf() {
        return zzfon.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long j2 = this.zzd;
        long j3 = this.zzb;
        if (j2 < j3) {
            int zzg = this.zza.zzg(bArr, i2, (int) Math.min(i3, j3 - j2));
            long j4 = this.zzd + zzg;
            this.zzd = j4;
            i4 = zzg;
            j2 = j4;
        } else {
            i4 = 0;
        }
        if (j2 >= this.zzb) {
            int zzg2 = this.zzc.zzg(bArr, i2 + i4, i3 - i4);
            this.zzd += zzg2;
            return i4 + zzg2;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws IOException {
        zzan zzanVar2;
        this.zze = zzanVar.zza;
        long j2 = zzanVar.zzf;
        long j3 = this.zzb;
        zzan zzanVar3 = null;
        if (j2 >= j3) {
            zzanVar2 = null;
        } else {
            long j4 = zzanVar.zzg;
            zzanVar2 = new zzan(zzanVar.zza, null, j2, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null, 0);
        }
        long j5 = zzanVar.zzg;
        if (j5 == -1 || zzanVar.zzf + j5 > this.zzb) {
            long max = Math.max(this.zzb, zzanVar.zzf);
            long j6 = zzanVar.zzg;
            zzanVar3 = new zzan(zzanVar.zza, null, max, max, j6 != -1 ? Math.min(j6, (zzanVar.zzf + j6) - this.zzb) : -1L, null, 0);
        }
        long zzh = zzanVar2 != null ? this.zza.zzh(zzanVar2) : 0L;
        long zzh2 = zzanVar3 != null ? this.zzc.zzh(zzanVar3) : 0L;
        this.zzd = zzanVar.zzf;
        if (zzh == -1 || zzh2 == -1) {
            return -1L;
        }
        return zzh + zzh2;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() throws IOException {
        this.zza.zzj();
        this.zzc.zzj();
    }
}
