package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzsw implements zznu {
    public static final zzoa zza = zzsv.zza;
    private final zzsx zzb;
    private final zzamf zzc;
    private final zzamf zzd;
    private final zzame zze;
    private zznx zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzsw() {
        this(0);
    }

    public zzsw(int i2) {
        this.zzb = new zzsx(true, null);
        this.zzc = new zzamf((int) ThrowableProxyConverter.BUILDER_CAPACITY);
        this.zzh = -1L;
        zzamf zzamfVar = new zzamf(10);
        this.zzd = zzamfVar;
        byte[] zzi = zzamfVar.zzi();
        this.zze = new zzame(zzi, zzi.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
        r10.zzl();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
        if ((r4 - r1) >= 8192) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zznv r10) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.gms.internal.ads.zzamf r2 = r9.zzd
            byte[] r2 = r2.zzi()
            r3 = r10
            com.google.android.gms.internal.ads.zznp r3 = (com.google.android.gms.internal.ads.zznp) r3
            r4 = 10
            r3.zzh(r2, r0, r4, r0)
            com.google.android.gms.internal.ads.zzamf r2 = r9.zzd
            r2.zzh(r0)
            com.google.android.gms.internal.ads.zzamf r2 = r9.zzd
            int r2 = r2.zzr()
            r4 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r4) goto L90
            r10.zzl()
            r2 = r10
            com.google.android.gms.internal.ads.zznp r2 = (com.google.android.gms.internal.ads.zznp) r2
            r2.zzj(r1, r0)
            long r3 = r9.zzh
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L34
            long r3 = (long) r1
            r9.zzh = r3
        L34:
            r4 = r1
        L35:
            r3 = 0
            r5 = 0
        L37:
            com.google.android.gms.internal.ads.zzamf r6 = r9.zzd
            byte[] r6 = r6.zzi()
            r7 = 2
            r2.zzh(r6, r0, r7, r0)
            com.google.android.gms.internal.ads.zzamf r6 = r9.zzd
            r6.zzh(r0)
            com.google.android.gms.internal.ads.zzamf r6 = r9.zzd
            int r6 = r6.zzo()
            boolean r6 = com.google.android.gms.internal.ads.zzsx.zzf(r6)
            if (r6 != 0) goto L62
            r10.zzl()
            int r4 = r4 + 1
            int r3 = r4 - r1
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r3 >= r5) goto L61
            r2.zzj(r4, r0)
            goto L35
        L61:
            return r0
        L62:
            r6 = 1
            int r3 = r3 + r6
            r7 = 4
            if (r3 < r7) goto L6d
            r8 = 188(0xbc, float:2.63E-43)
            if (r5 > r8) goto L6c
            goto L6d
        L6c:
            return r6
        L6d:
            com.google.android.gms.internal.ads.zzamf r6 = r9.zzd
            byte[] r6 = r6.zzi()
            r2.zzh(r6, r0, r7, r0)
            com.google.android.gms.internal.ads.zzame r6 = r9.zze
            r7 = 14
            r6.zzd(r7)
            com.google.android.gms.internal.ads.zzame r6 = r9.zze
            r7 = 13
            int r6 = r6.zzh(r7)
            r7 = 6
            if (r6 > r7) goto L89
            return r0
        L89:
            int r7 = r6 + (-6)
            r2.zzj(r7, r0)
            int r5 = r5 + r6
            goto L37
        L90:
            com.google.android.gms.internal.ads.zzamf r2 = r9.zzd
            r4 = 3
            r2.zzk(r4)
            com.google.android.gms.internal.ads.zzamf r2 = r9.zzd
            int r2 = r2.zzA()
            int r4 = r2 + 10
            int r1 = r1 + r4
            r3.zzj(r2, r0)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsw.zza(com.google.android.gms.internal.ads.zznv):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzf = zznxVar;
        this.zzb.zzb(zznxVar, new zzun(Level.ALL_INT, 0, 1));
        zznxVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        zzakt.zze(this.zzf);
        int zzg = zznvVar.zzg(this.zzc.zzi(), 0, ThrowableProxyConverter.BUILDER_CAPACITY);
        if (!this.zzj) {
            this.zzf.zzD(new zzos(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (zzg == -1) {
            return -1;
        }
        this.zzc.zzh(0);
        this.zzc.zzf(zzg);
        if (!this.zzi) {
            this.zzb.zzc(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zzd(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j2, long j3) {
        this.zzi = false;
        this.zzb.zza();
        this.zzg = j3;
    }
}
