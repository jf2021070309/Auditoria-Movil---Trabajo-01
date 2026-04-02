package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgw implements zzaj {
    private final zzaj zza;
    private final int zzb;
    private final zzgv zzc;
    private final byte[] zzd;
    private int zze;

    public zzgw(zzaj zzajVar, int i, zzgv zzgvVar) {
        zzakt.zza(i > 0);
        this.zza = zzajVar;
        this.zzb = i;
        this.zzc = zzgvVar;
        this.zzd = new byte[1];
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Map<String, List<String>> zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zze;
        if (i3 == 0) {
            int i4 = 0;
            if (this.zza.zzg(this.zzd, 0, 1) != -1) {
                int i5 = (this.zzd[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int zzg = this.zza.zzg(bArr2, i4, i6);
                        if (zzg != -1) {
                            i4 += zzg;
                            i6 -= zzg;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.zzc.zza(new zzamf(bArr2, i5));
                    }
                }
                i3 = this.zzb;
                this.zze = i3;
            }
            return -1;
        }
        int zzg2 = this.zza.zzg(bArr, i, Math.min(i3, i2));
        if (zzg2 != -1) {
            this.zze -= zzg2;
        }
        return zzg2;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zza(zzay zzayVar) {
        if (zzayVar != null) {
            this.zza.zza(zzayVar);
            return;
        }
        throw null;
    }
}
