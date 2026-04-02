package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzgw implements zzaj {
    private final zzaj zza;
    private final int zzb;
    private final zzgv zzc;
    private final byte[] zzd;
    private int zze;

    public zzgw(zzaj zzajVar, int i2, zzgv zzgvVar) {
        zzakt.zza(i2 > 0);
        this.zza = zzajVar;
        this.zzb = i2;
        this.zzc = zzgvVar;
        this.zzd = new byte[1];
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zza(zzay zzayVar) {
        Objects.requireNonNull(zzayVar);
        this.zza.zza(zzayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Map<String, List<String>> zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.zze;
        if (i4 == 0) {
            int i5 = 0;
            if (this.zza.zzg(this.zzd, 0, 1) != -1) {
                int i6 = (this.zzd[0] & 255) << 4;
                if (i6 != 0) {
                    byte[] bArr2 = new byte[i6];
                    int i7 = i6;
                    while (i7 > 0) {
                        int zzg = this.zza.zzg(bArr2, i5, i7);
                        if (zzg != -1) {
                            i5 += zzg;
                            i7 -= zzg;
                        }
                    }
                    while (i6 > 0) {
                        int i8 = i6 - 1;
                        if (bArr2[i8] != 0) {
                            break;
                        }
                        i6 = i8;
                    }
                    if (i6 > 0) {
                        this.zzc.zza(new zzamf(bArr2, i6));
                    }
                }
                i4 = this.zzb;
                this.zze = i4;
            }
            return -1;
        }
        int zzg2 = this.zza.zzg(bArr, i2, Math.min(i4, i3));
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
}
