package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class zzhb extends zzgq<Void> {
    private final zzhh zza;
    private final boolean zzb;
    private final zzaip zzc;
    private final zzain zzd;
    private zzgz zze;
    private zzgy zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzhb(zzhh zzhhVar, boolean z) {
        boolean z2;
        this.zza = zzhhVar;
        if (z) {
            zzhhVar.zzt();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzaip();
        this.zzd = new zzain();
        zzhhVar.zzs();
        this.zze = zzgz.zzl(zzhhVar.zzz());
    }

    private final Object zzD(Object obj) {
        return (zzgz.zzk(this.zze) == null || !obj.equals(zzgz.zzb)) ? obj : zzgz.zzk(this.zze);
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzE(long j2) {
        zzgy zzgyVar = this.zzf;
        int zzi = this.zze.zzi(zzgyVar.zza.zza);
        if (zzi == -1) {
            return;
        }
        zzgz zzgzVar = this.zze;
        zzain zzainVar = this.zzd;
        zzgzVar.zzh(zzi, zzainVar, false);
        long j3 = zzainVar.zzd;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        zzgyVar.zzo(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzA(zzhe zzheVar) {
        ((zzgy) zzheVar).zzu();
        if (zzheVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    /* renamed from: zzB */
    public final zzgy zzC(zzhf zzhfVar, zzko zzkoVar, long j2) {
        zzgy zzgyVar = new zzgy(zzhfVar, zzkoVar, j2, null);
        zzgyVar.zzs(this.zza);
        if (this.zzh) {
            zzgyVar.zzt(zzhfVar.zzc(zzD(zzhfVar.zza)));
        } else {
            this.zzf = zzgyVar;
            if (!this.zzg) {
                this.zzg = true;
                zzw(null, this.zza);
            }
        }
        return zzgyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgi
    public final void zza(zzay zzayVar) {
        super.zza(zzayVar);
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzw(null, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzhh
    public final void zzu() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    @Override // com.google.android.gms.internal.ads.zzgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzv(java.lang.Void r12, com.google.android.gms.internal.ads.zzhh r13, com.google.android.gms.internal.ads.zzaiq r14) {
        /*
            r11 = this;
            java.lang.Void r12 = (java.lang.Void) r12
            boolean r12 = r11.zzh
            r13 = 0
            if (r12 == 0) goto L1c
            com.google.android.gms.internal.ads.zzgz r12 = r11.zze
            com.google.android.gms.internal.ads.zzgz r12 = r12.zzn(r14)
            r11.zze = r12
            com.google.android.gms.internal.ads.zzgy r12 = r11.zzf
            if (r12 == 0) goto L9f
            long r0 = r12.zzr()
            r11.zzE(r0)
            goto L9f
        L1c:
            boolean r12 = r14.zzt()
            if (r12 == 0) goto L38
            boolean r12 = r11.zzi
            if (r12 == 0) goto L2d
            com.google.android.gms.internal.ads.zzgz r12 = r11.zze
            com.google.android.gms.internal.ads.zzgz r12 = r12.zzn(r14)
            goto L35
        L2d:
            java.lang.Object r12 = com.google.android.gms.internal.ads.zzaip.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgz.zzb
            com.google.android.gms.internal.ads.zzgz r12 = com.google.android.gms.internal.ads.zzgz.zzm(r14, r12, r0)
        L35:
            r11.zze = r12
            goto L9f
        L38:
            com.google.android.gms.internal.ads.zzaip r12 = r11.zzc
            r0 = 0
            r1 = 0
            r14.zzf(r0, r12, r1)
            com.google.android.gms.internal.ads.zzaip r12 = r11.zzc
            java.lang.Object r12 = r12.zzb
            com.google.android.gms.internal.ads.zzgy r3 = r11.zzf
            if (r3 == 0) goto L66
            long r3 = r3.zza()
            com.google.android.gms.internal.ads.zzgz r5 = r11.zze
            com.google.android.gms.internal.ads.zzgy r6 = r11.zzf
            com.google.android.gms.internal.ads.zzhf r6 = r6.zza
            java.lang.Object r6 = r6.zza
            com.google.android.gms.internal.ads.zzain r7 = r11.zzd
            r5.zzy(r6, r7)
            com.google.android.gms.internal.ads.zzgz r5 = r11.zze
            com.google.android.gms.internal.ads.zzaip r6 = r11.zzc
            r5.zzf(r0, r6, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L66
            r9 = r3
            goto L67
        L66:
            r9 = r1
        L67:
            com.google.android.gms.internal.ads.zzaip r6 = r11.zzc
            com.google.android.gms.internal.ads.zzain r7 = r11.zzd
            r8 = 0
            r5 = r14
            android.util.Pair r0 = r5.zzv(r6, r7, r8, r9)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r11.zzi
            if (r0 == 0) goto L86
            com.google.android.gms.internal.ads.zzgz r12 = r11.zze
            com.google.android.gms.internal.ads.zzgz r12 = r12.zzn(r14)
            goto L8a
        L86:
            com.google.android.gms.internal.ads.zzgz r12 = com.google.android.gms.internal.ads.zzgz.zzm(r14, r12, r1)
        L8a:
            r11.zze = r12
            com.google.android.gms.internal.ads.zzgy r12 = r11.zzf
            if (r12 == 0) goto L9f
            r11.zzE(r2)
            com.google.android.gms.internal.ads.zzhf r12 = r12.zza
            java.lang.Object r13 = r12.zza
            java.lang.Object r13 = r11.zzD(r13)
            com.google.android.gms.internal.ads.zzhf r13 = r12.zzc(r13)
        L9f:
            r12 = 1
            r11.zzi = r12
            r11.zzh = r12
            com.google.android.gms.internal.ads.zzgz r12 = r11.zze
            r11.zze(r12)
            if (r13 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzgy r12 = r11.zzf
            java.util.Objects.requireNonNull(r12)
            r12.zzt(r13)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhb.zzv(java.lang.Object, com.google.android.gms.internal.ads.zzhh, com.google.android.gms.internal.ads.zzaiq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final /* bridge */ /* synthetic */ zzhf zzx(Void r2, zzhf zzhfVar) {
        Object obj = zzhfVar.zza;
        if (zzgz.zzk(this.zze) != null && zzgz.zzk(this.zze).equals(obj)) {
            obj = zzgz.zzb;
        }
        return zzhfVar.zzc(obj);
    }

    public final zzaiq zzy() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzagk zzz() {
        return this.zza.zzz();
    }
}
