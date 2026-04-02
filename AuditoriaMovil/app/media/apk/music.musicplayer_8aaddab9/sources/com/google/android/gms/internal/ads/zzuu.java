package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzuu implements zzut {
    private final zznx zza;
    private final zzox zzb;
    private final zzuw zzc;
    private final zzafv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzuu(zznx zznxVar, zzox zzoxVar, zzuw zzuwVar, String str, int i2) throws zzaha {
        this.zza = zznxVar;
        this.zzb = zzoxVar;
        this.zzc = zzuwVar;
        int i3 = (zzuwVar.zzb * zzuwVar.zze) / 8;
        int i4 = zzuwVar.zzd;
        if (i4 != i3) {
            throw zzaha.zzb(a.S(50, "Expected block size: ", i3, "; got: ", i4), null);
        }
        int i5 = zzuwVar.zzc * i3;
        int i6 = i5 * 8;
        int max = Math.max(i3, i5 / 10);
        this.zze = max;
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN(str);
        zzaftVar.zzI(i6);
        zzaftVar.zzJ(i6);
        zzaftVar.zzO(max);
        zzaftVar.zzaa(zzuwVar.zzb);
        zzaftVar.zzab(zzuwVar.zzc);
        zzaftVar.zzac(i2);
        this.zzd = zzaftVar.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza(long j2) {
        this.zzf = j2;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(int i2, long j2) {
        this.zza.zzD(new zzuz(this.zzc, 1, i2, j2));
        this.zzb.zzs(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final boolean zzc(zznv zznvVar, long j2) throws IOException {
        zzuw zzuwVar;
        long j3;
        int i2;
        int i3;
        long j4 = j2;
        while (j4 > 0 && (i2 = this.zzg) < (i3 = this.zze)) {
            int zza = zzov.zza(this.zzb, zznvVar, (int) Math.min(i3 - i2, j4), true);
            if (zza == -1) {
                j4 = 0;
            } else {
                this.zzg += zza;
                j4 -= zza;
            }
        }
        int i4 = this.zzc.zzd;
        int i5 = this.zzg / i4;
        if (i5 > 0) {
            long j5 = this.zzf;
            long zzH = zzamq.zzH(this.zzh, 1000000L, zzuwVar.zzc);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zzv(j5 + zzH, 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
            j3 = 0;
        } else {
            j3 = 0;
        }
        return j4 <= j3;
    }
}
