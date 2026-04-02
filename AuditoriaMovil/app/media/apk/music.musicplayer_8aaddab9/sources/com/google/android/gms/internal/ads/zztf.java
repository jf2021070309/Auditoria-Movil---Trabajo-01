package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zztf {
    private final zzox zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zztf(zzox zzoxVar) {
        this.zza = zzoxVar;
    }

    public final void zza() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(int r5, long r6) {
        /*
            r4 = this;
            r4.zze = r5
            r0 = 0
            r4.zzd = r0
            r1 = 179(0xb3, float:2.51E-43)
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 1
            if (r5 == r2) goto L13
            if (r5 != r1) goto L11
            r5 = 179(0xb3, float:2.51E-43)
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            r4.zzb = r1
            if (r5 != r2) goto L19
            goto L1a
        L19:
            r3 = 0
        L1a:
            r4.zzc = r3
            r4.zzf = r0
            r4.zzh = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztf.zzb(int, long):void");
    }

    public final void zzc(byte[] bArr, int i2, int i3) {
        if (this.zzc) {
            int i4 = this.zzf;
            int i5 = (i2 + 1) - i4;
            if (i5 >= i3) {
                this.zzf = (i3 - i2) + i4;
                return;
            }
            this.zzd = ((bArr[i5] & 192) >> 6) == 0;
            this.zzc = false;
        }
    }

    public final void zzd(long j2, int i2, boolean z) {
        if (this.zze == 182 && z && this.zzb) {
            long j3 = this.zzh;
            if (j3 != -9223372036854775807L) {
                long j4 = this.zzg;
                this.zza.zzv(j3, this.zzd ? 1 : 0, (int) (j2 - j4), i2, null);
            }
        }
        if (this.zze != 179) {
            this.zzg = j2;
        }
    }
}
