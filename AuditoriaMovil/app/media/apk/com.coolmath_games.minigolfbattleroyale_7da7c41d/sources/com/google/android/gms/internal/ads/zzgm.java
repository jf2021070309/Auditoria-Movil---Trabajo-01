package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgm implements zzhe, zzhd {
    public final zzhe zza;
    long zzb;
    private zzhd zzc;
    private zzgl[] zzd = new zzgl[0];
    private long zze = 0;

    public zzgm(zzhe zzheVar, boolean z, long j, long j2) {
        this.zza = zzheVar;
        this.zzb = j2;
    }

    public final void zza(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzb(zzhd zzhdVar, long j) {
        this.zzc = zzhdVar;
        this.zza.zzb(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final zzs zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zze(long j, boolean z) {
        this.zza.zze(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final void zzf(long j) {
        this.zza.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzg() {
        if (zzo()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long zzg = zzg();
            return zzg != -9223372036854775807L ? zzg : j;
        }
        long zzg2 = this.zza.zzg();
        if (zzg2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        zzakt.zzd(zzg2 >= 0);
        long j2 = this.zzb;
        if (j2 == Long.MIN_VALUE || zzg2 <= j2) {
            z = true;
        }
        zzakt.zzd(z);
        return zzg2;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        long zzh = this.zza.zzh();
        if (zzh != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzh < j) {
                return zzh;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0 > r3) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzi(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zze = r0
            com.google.android.gms.internal.ads.zzgl[] r0 = r7.zzd
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.zza()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.zzhe r0 = r7.zza
            long r0 = r0.zzi(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L35
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L36
            long r3 = r7.zzb
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L35
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L36
        L35:
            r2 = r9
        L36:
            com.google.android.gms.internal.ads.zzakt.zzd(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgm.zzi(long):long");
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzj(long j, zzahz zzahzVar) {
        if (j != 0) {
            long zzy = zzamq.zzy(zzahzVar.zzf, 0L, j);
            long j2 = zzahzVar.zzg;
            long j3 = this.zzb;
            long zzy2 = zzamq.zzy(j2, 0L, j3 == Long.MIN_VALUE ? LongCompanionObject.MAX_VALUE : j3 - j);
            if (zzy != zzahzVar.zzf || zzy2 != zzahzVar.zzg) {
                zzahzVar = new zzahz(zzy, zzy2);
            }
            return this.zza.zzj(j, zzahzVar);
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        long zzk = this.zza.zzk();
        if (zzk != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzk < j) {
                return zzk;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j) {
        return this.zza.zzl(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzm() {
        return this.zza.zzm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzo() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final /* bridge */ /* synthetic */ void zzp(zzhe zzheVar) {
        zzhd zzhdVar = this.zzc;
        if (zzhdVar != null) {
            zzhdVar.zzp(this);
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r4 > r8) goto L19;
     */
    @Override // com.google.android.gms.internal.ads.zzhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzq(com.google.android.gms.internal.ads.zzjg[] r15, boolean[] r16, com.google.android.gms.internal.ads.zziu[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.zzgl[] r3 = new com.google.android.gms.internal.ads.zzgl[r2]
            r0.zzd = r3
            com.google.android.gms.internal.ads.zziu[] r2 = new com.google.android.gms.internal.ads.zziu[r2]
            r3 = 0
            r4 = r3
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.zzgl[] r5 = r0.zzd
            r6 = r1[r4]
            com.google.android.gms.internal.ads.zzgl r6 = (com.google.android.gms.internal.ads.zzgl) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.zziu r11 = r6.zza
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.zzhe r4 = r0.zza
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.zzq(r5, r6, r7, r8, r9)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zze = r6
            int r6 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            r7 = 1
            if (r6 == 0) goto L4f
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 < 0) goto L4e
            long r8 = r0.zzb
            r12 = -9223372036854775808
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L4f
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L4e
            goto L4f
        L4e:
            r7 = r3
        L4f:
            com.google.android.gms.internal.ads.zzakt.zzd(r7)
        L52:
            int r6 = r1.length
            if (r3 >= r6) goto L78
            r6 = r2[r3]
            if (r6 != 0) goto L5e
            com.google.android.gms.internal.ads.zzgl[] r6 = r0.zzd
            r6[r3] = r11
            goto L6f
        L5e:
            com.google.android.gms.internal.ads.zzgl[] r7 = r0.zzd
            r8 = r7[r3]
            if (r8 == 0) goto L68
            com.google.android.gms.internal.ads.zziu r8 = r8.zza
            if (r8 == r6) goto L6f
        L68:
            com.google.android.gms.internal.ads.zzgl r8 = new com.google.android.gms.internal.ads.zzgl
            r8.<init>(r14, r6)
            r7[r3] = r8
        L6f:
            com.google.android.gms.internal.ads.zzgl[] r6 = r0.zzd
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L52
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgm.zzq(com.google.android.gms.internal.ads.zzjg[], boolean[], com.google.android.gms.internal.ads.zziu[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzn(zzhe zzheVar) {
        zzhd zzhdVar = this.zzc;
        if (zzhdVar != null) {
            zzhdVar.zzn(this);
            return;
        }
        throw null;
    }
}
