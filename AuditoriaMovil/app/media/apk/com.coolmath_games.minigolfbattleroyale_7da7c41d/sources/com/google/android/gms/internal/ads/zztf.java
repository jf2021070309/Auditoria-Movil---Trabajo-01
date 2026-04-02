package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zztf {
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
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
            if (r5 == r2) goto L12
            if (r5 != r1) goto L10
            r5 = r1
            goto L12
        L10:
            r1 = r0
            goto L13
        L12:
            r1 = r3
        L13:
            r4.zzb = r1
            if (r5 != r2) goto L18
            goto L19
        L18:
            r3 = r0
        L19:
            r4.zzc = r3
            r4.zzf = r0
            r4.zzh = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztf.zzb(int, long):void");
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        if (this.zzc) {
            int i3 = this.zzf;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.zzf = i3 + (i2 - i);
                return;
            }
            this.zzd = ((bArr[i4] & 192) >> 6) == 0;
            this.zzc = false;
        }
    }

    public final void zzd(long j, int i, boolean z) {
        if (this.zze == 182 && z && this.zzb) {
            long j2 = this.zzh;
            if (j2 != -9223372036854775807L) {
                long j3 = this.zzg;
                this.zza.zzv(j2, this.zzd ? 1 : 0, (int) (j - j3), i, null);
            }
        }
        if (this.zze != 179) {
            this.zzg = j;
        }
    }
}
