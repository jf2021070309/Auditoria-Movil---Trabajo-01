package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzclq implements zzaj {
    private final zzaj zza;
    private final long zzb;
    private final zzaj zzc;
    private long zzd;
    private Uri zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzclq(zzaj zzajVar, int i, zzaj zzajVar2) {
        this.zza = zzajVar;
        this.zzb = i;
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
    public final int zzg(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zzg = this.zza.zzg(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zzg;
            this.zzd = j3;
            i3 = zzg;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.zzb) {
            int zzg2 = this.zzc.zzg(bArr, i + i3, i2 - i3);
            this.zzd += zzg2;
            return i3 + zzg2;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws IOException {
        zzan zzanVar2;
        this.zze = zzanVar.zza;
        long j = zzanVar.zzf;
        long j2 = this.zzb;
        zzan zzanVar3 = null;
        if (j >= j2) {
            zzanVar2 = null;
        } else {
            long j3 = zzanVar.zzg;
            zzanVar2 = new zzan(zzanVar.zza, null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null, 0);
        }
        long j4 = zzanVar.zzg;
        if (j4 == -1 || zzanVar.zzf + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzanVar.zzf);
            long j5 = zzanVar.zzg;
            zzanVar3 = new zzan(zzanVar.zza, null, max, max, j5 != -1 ? Math.min(j5, (zzanVar.zzf + j5) - this.zzb) : -1L, null, 0);
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
