package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
    private final void zzE(long j) {
        zzgy zzgyVar = this.zzf;
        int zzi = this.zze.zzi(zzgyVar.zza.zza);
        if (zzi == -1) {
            return;
        }
        zzgz zzgzVar = this.zze;
        zzain zzainVar = this.zzd;
        zzgzVar.zzh(zzi, zzainVar, false);
        long j2 = zzainVar.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzgyVar.zzo(j);
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
    public final zzgy zzC(zzhf zzhfVar, zzko zzkoVar, long j) {
        zzgy zzgyVar = new zzgy(zzhfVar, zzkoVar, j, null);
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void zzv(java.lang.Void r12, com.google.android.gms.internal.ads.zzhh r13, com.google.android.gms.internal.ads.zzaiq r14) {
        /*
            r11 = this;
            java.lang.Void r12 = (java.lang.Void) r12
            boolean r12 = r11.zzh
            r13 = 0
            if (r12 == 0) goto L1d
            com.google.android.gms.internal.ads.zzgz r12 = r11.zze
            com.google.android.gms.internal.ads.zzgz r12 = r12.zzn(r14)
            r11.zze = r12
            com.google.android.gms.internal.ads.zzgy r12 = r11.zzf
            if (r12 == 0) goto L1a
            long r0 = r12.zzr()
            r11.zzE(r0)
        L1a:
            r12 = r13
            goto La0
        L1d:
            boolean r12 = r14.zzt()
            if (r12 == 0) goto L39
            boolean r12 = r11.zzi
            if (r12 == 0) goto L2e
            com.google.android.gms.internal.ads.zzgz r12 = r11.zze
            com.google.android.gms.internal.ads.zzgz r12 = r12.zzn(r14)
            goto L36
        L2e:
            java.lang.Object r12 = com.google.android.gms.internal.ads.zzaip.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgz.zzb
            com.google.android.gms.internal.ads.zzgz r12 = com.google.android.gms.internal.ads.zzgz.zzm(r14, r12, r0)
        L36:
            r11.zze = r12
            goto L1a
        L39:
            com.google.android.gms.internal.ads.zzaip r12 = r11.zzc
            r0 = 0
            r1 = 0
            r14.zzf(r0, r12, r1)
            com.google.android.gms.internal.ads.zzaip r12 = r11.zzc
            java.lang.Object r12 = r12.zzb
            com.google.android.gms.internal.ads.zzgy r3 = r11.zzf
            if (r3 == 0) goto L67
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
            if (r0 == 0) goto L67
            r9 = r3
            goto L68
        L67:
            r9 = r1
        L68:
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
            if (r0 == 0) goto L87
            com.google.android.gms.internal.ads.zzgz r12 = r11.zze
            com.google.android.gms.internal.ads.zzgz r12 = r12.zzn(r14)
            goto L8b
        L87:
            com.google.android.gms.internal.ads.zzgz r12 = com.google.android.gms.internal.ads.zzgz.zzm(r14, r12, r1)
        L8b:
            r11.zze = r12
            com.google.android.gms.internal.ads.zzgy r12 = r11.zzf
            if (r12 == 0) goto L1a
            r11.zzE(r2)
            com.google.android.gms.internal.ads.zzhf r12 = r12.zza
            java.lang.Object r14 = r12.zza
            java.lang.Object r14 = r11.zzD(r14)
            com.google.android.gms.internal.ads.zzhf r12 = r12.zzc(r14)
        La0:
            r14 = 1
            r11.zzi = r14
            r11.zzh = r14
            com.google.android.gms.internal.ads.zzgz r14 = r11.zze
            r11.zze(r14)
            if (r12 == 0) goto Lb5
            com.google.android.gms.internal.ads.zzgy r14 = r11.zzf
            if (r14 == 0) goto Lb4
            r14.zzt(r12)
            return
        Lb4:
            throw r13
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhb.zzv(java.lang.Object, com.google.android.gms.internal.ads.zzhh, com.google.android.gms.internal.ads.zzaiq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    protected final /* bridge */ /* synthetic */ zzhf zzx(Void r2, zzhf zzhfVar) {
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
