package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzus implements zzut {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, FacebookMediationAdapter.ERROR_NULL_CONTEXT, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zznx zzc;
    private final zzox zzd;
    private final zzuw zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzamf zzh;
    private final int zzi;
    private final zzafv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzus(zznx zznxVar, zzox zzoxVar, zzuw zzuwVar) throws zzaha {
        this.zzc = zznxVar;
        this.zzd = zzoxVar;
        this.zze = zzuwVar;
        int max = Math.max(1, zzuwVar.zzc / 10);
        this.zzi = max;
        zzamf zzamfVar = new zzamf(zzuwVar.zzf);
        zzamfVar.zzp();
        int zzp = zzamfVar.zzp();
        this.zzf = zzp;
        int i2 = zzuwVar.zzb;
        int i3 = (((zzuwVar.zzd - (i2 * 4)) * 8) / (zzuwVar.zze * i2)) + 1;
        if (zzp != i3) {
            throw zzaha.zzb(a.S(56, "Expected frames per block: ", i3, "; got: ", zzp), null);
        }
        int zzw = zzamq.zzw(max, zzp);
        this.zzg = new byte[zzuwVar.zzd * zzw];
        this.zzh = new zzamf((zzp + zzp) * i2 * zzw);
        int i4 = ((zzuwVar.zzc * zzuwVar.zzd) * 8) / zzp;
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN("audio/raw");
        zzaftVar.zzI(i4);
        zzaftVar.zzJ(i4);
        zzaftVar.zzO((max + max) * i2);
        zzaftVar.zzaa(zzuwVar.zzb);
        zzaftVar.zzab(zzuwVar.zzc);
        zzaftVar.zzac(2);
        this.zzj = zzaftVar.zzah();
    }

    private final void zzd(int i2) {
        long j2 = this.zzl;
        long zzH = zzamq.zzH(this.zzn, 1000000L, this.zze.zzc);
        int zzf = zzf(i2);
        this.zzd.zzv(j2 + zzH, 1, zzf, this.zzm - zzf, null);
        this.zzn += i2;
        this.zzm -= zzf;
    }

    private final int zze(int i2) {
        int i3 = this.zze.zzb;
        return i2 / (i3 + i3);
    }

    private final int zzf(int i2) {
        return (i2 + i2) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza(long j2) {
        this.zzk = 0;
        this.zzl = j2;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(int i2, long j2) {
        this.zzc.zzD(new zzuz(this.zze, this.zzf, i2, j2));
        this.zzd.zzs(this.zzj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zznv r20, long r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzus.zzc(com.google.android.gms.internal.ads.zznv, long):boolean");
    }
}
