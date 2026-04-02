package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
/* loaded from: classes.dex */
public final class zzags {
    private final zzain zza = new zzain();
    private final zzaip zzb = new zzaip();
    private final zzcy zzc;
    private final Handler zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzagp zzh;
    private zzagp zzi;
    private zzagp zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzags(zzcy zzcyVar, Handler handler) {
        this.zzc = zzcyVar;
        this.zzd = handler;
    }

    private final boolean zzA(zzaiq zzaiqVar, zzhf zzhfVar, boolean z) {
        int zzi = zzaiqVar.zzi(zzhfVar.zza);
        return !zzaiqVar.zzf(zzaiqVar.zzh(zzi, this.zza, false).zzc, this.zzb, 0L).zzh && zzaiqVar.zzu(zzi, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    private final long zzB(zzaiq zzaiqVar, Object obj, int i2) {
        zzaiqVar.zzy(obj, this.zza);
        this.zza.zzb(i2);
        this.zza.zzk(i2);
        return 0L;
    }

    private static final boolean zzC(zzhf zzhfVar) {
        return !zzhfVar.zzb() && zzhfVar.zze == -1;
    }

    private final void zzs() {
        final zzfog zzu = zzfoj.zzu();
        for (zzagp zzagpVar = this.zzh; zzagpVar != null; zzagpVar = zzagpVar.zzo()) {
            zzu.zze((zzfog) zzagpVar.zzf.zza);
        }
        zzagp zzagpVar2 = this.zzi;
        final zzhf zzhfVar = zzagpVar2 == null ? null : zzagpVar2.zzf.zza;
        this.zzd.post(new Runnable(this, zzu, zzhfVar) { // from class: com.google.android.gms.internal.ads.zzagr
            private final zzags zza;
            private final zzfog zzb;
            private final zzhf zzc;

            {
                this.zza = this;
                this.zzb = zzu;
                this.zzc = zzhfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzq(this.zzb, this.zzc);
            }
        });
    }

    private static zzhf zzt(zzaiq zzaiqVar, Object obj, long j2, long j3, zzain zzainVar) {
        zzaiqVar.zzy(obj, zzainVar);
        int zze = zzainVar.zze(j2);
        return zze == -1 ? new zzhf(obj, j3, zzainVar.zzf(j2)) : new zzhf(obj, zze, zzainVar.zzc(zze), j3);
    }

    private final boolean zzu(zzaiq zzaiqVar) {
        zzagp zzagpVar = this.zzh;
        if (zzagpVar == null) {
            return true;
        }
        int zzi = zzaiqVar.zzi(zzagpVar.zzb);
        while (true) {
            zzi = zzaiqVar.zzu(zzi, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzagpVar.zzo() != null && !zzagpVar.zzf.zzg) {
                zzagpVar = zzagpVar.zzo();
            }
            zzagp zzo = zzagpVar.zzo();
            if (zzi == -1 || zzo == null || zzaiqVar.zzi(zzo.zzb) != zzi) {
                break;
            }
            zzagpVar = zzo;
        }
        boolean zzl = zzl(zzagpVar);
        zzagpVar.zzf = zzo(zzaiqVar, zzagpVar.zzf);
        return !zzl;
    }

    private final zzagq zzv(zzaiq zzaiqVar, zzagp zzagpVar, long j2) {
        long j3;
        zzagq zzagqVar = zzagpVar.zzf;
        long zza = (zzagpVar.zza() + zzagqVar.zze) - j2;
        if (zzagqVar.zzg) {
            long j4 = 0;
            int zzu = zzaiqVar.zzu(zzaiqVar.zzi(zzagqVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzu == -1) {
                return null;
            }
            int i2 = zzaiqVar.zzh(zzu, this.zza, true).zzc;
            Object obj = this.zza.zzb;
            long j5 = zzagqVar.zza.zzd;
            if (zzaiqVar.zzf(i2, this.zzb, 0L).zzn == zzu) {
                Pair<Object, Long> zzw = zzaiqVar.zzw(this.zzb, this.zza, i2, -9223372036854775807L, Math.max(0L, zza));
                if (zzw == null) {
                    return null;
                }
                obj = zzw.first;
                long longValue = ((Long) zzw.second).longValue();
                zzagp zzo = zzagpVar.zzo();
                if (zzo == null || !zzo.zzb.equals(obj)) {
                    j5 = this.zze;
                    this.zze = 1 + j5;
                } else {
                    j5 = zzo.zzf.zza.zzd;
                }
                j3 = longValue;
                j4 = -9223372036854775807L;
            } else {
                j3 = 0;
            }
            return zzw(zzaiqVar, zzt(zzaiqVar, obj, j3, j5, this.zza), j4, j3);
        }
        zzhf zzhfVar = zzagqVar.zza;
        zzaiqVar.zzy(zzhfVar.zza, this.zza);
        if (!zzhfVar.zzb()) {
            int zzc = this.zza.zzc(zzhfVar.zze);
            if (zzc == this.zza.zzg(zzhfVar.zze)) {
                zzB(zzaiqVar, zzhfVar.zza, zzhfVar.zze);
                return zzy(zzaiqVar, zzhfVar.zza, 0L, zzagqVar.zze, zzhfVar.zzd);
            }
            return zzx(zzaiqVar, zzhfVar.zza, zzhfVar.zze, zzc, zzagqVar.zze, zzhfVar.zzd);
        }
        int i3 = zzhfVar.zzb;
        if (this.zza.zzg(i3) == -1) {
            return null;
        }
        int zzd = this.zza.zzd(i3, zzhfVar.zzc);
        if (zzd < 0) {
            return zzx(zzaiqVar, zzhfVar.zza, i3, zzd, zzagqVar.zzc, zzhfVar.zzd);
        }
        long j6 = zzagqVar.zzc;
        if (j6 == -9223372036854775807L) {
            zzaip zzaipVar = this.zzb;
            zzain zzainVar = this.zza;
            Pair<Object, Long> zzw2 = zzaiqVar.zzw(zzaipVar, zzainVar, zzainVar.zzc, -9223372036854775807L, Math.max(0L, zza));
            if (zzw2 == null) {
                return null;
            }
            j6 = ((Long) zzw2.second).longValue();
        }
        zzB(zzaiqVar, zzhfVar.zza, zzhfVar.zzb);
        return zzy(zzaiqVar, zzhfVar.zza, Math.max(0L, j6), zzagqVar.zzc, zzhfVar.zzd);
    }

    private final zzagq zzw(zzaiq zzaiqVar, zzhf zzhfVar, long j2, long j3) {
        zzaiqVar.zzy(zzhfVar.zza, this.zza);
        return zzhfVar.zzb() ? zzx(zzaiqVar, zzhfVar.zza, zzhfVar.zzb, zzhfVar.zzc, j2, zzhfVar.zzd) : zzy(zzaiqVar, zzhfVar.zza, j3, j2, zzhfVar.zzd);
    }

    private final zzagq zzx(zzaiq zzaiqVar, Object obj, int i2, int i3, long j2, long j3) {
        zzhf zzhfVar = new zzhf(obj, i2, i3, j3);
        long zzh = zzaiqVar.zzy(zzhfVar.zza, this.zza).zzh(zzhfVar.zzb, zzhfVar.zzc);
        if (i3 == this.zza.zzc(i2)) {
            this.zza.zzi();
        }
        this.zza.zzj(zzhfVar.zzb);
        long j4 = 0;
        if (zzh != -9223372036854775807L && zzh <= 0) {
            j4 = Math.max(0L, (-1) + zzh);
        }
        return new zzagq(zzhfVar, j4, j2, -9223372036854775807L, zzh, false, false, false, false);
    }

    private final zzagq zzy(zzaiq zzaiqVar, Object obj, long j2, long j3, long j4) {
        long j5;
        long j6 = j2;
        zzaiqVar.zzy(obj, this.zza);
        int zzf = this.zza.zzf(j6);
        zzhf zzhfVar = new zzhf(obj, j4, zzf);
        boolean zzC = zzC(zzhfVar);
        boolean zzz = zzz(zzaiqVar, zzhfVar);
        boolean zzA = zzA(zzaiqVar, zzhfVar, zzC);
        if (zzf != -1) {
            this.zza.zzj(zzf);
        }
        if (zzf != -1) {
            this.zza.zzb(zzf);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        long j7 = j5 != -9223372036854775807L ? j5 : this.zza.zzd;
        if (j7 != -9223372036854775807L && j6 >= j7) {
            j6 = Math.max(0L, (-1) + j7);
        }
        return new zzagq(zzhfVar, j6, j3, j5, j7, false, zzC, zzz, zzA);
    }

    private final boolean zzz(zzaiq zzaiqVar, zzhf zzhfVar) {
        if (zzC(zzhfVar)) {
            return zzaiqVar.zzf(zzaiqVar.zzy(zzhfVar.zza, this.zza).zzc, this.zzb, 0L).zzo == zzaiqVar.zzi(zzhfVar.zza);
        }
        return false;
    }

    public final boolean zza(zzaiq zzaiqVar, int i2) {
        this.zzf = i2;
        return zzu(zzaiqVar);
    }

    public final boolean zzb(zzaiq zzaiqVar, boolean z) {
        this.zzg = z;
        return zzu(zzaiqVar);
    }

    public final boolean zzc(zzhe zzheVar) {
        zzagp zzagpVar = this.zzj;
        return zzagpVar != null && zzagpVar.zza == zzheVar;
    }

    public final void zzd(long j2) {
        zzagp zzagpVar = this.zzj;
        if (zzagpVar != null) {
            zzagpVar.zzh(j2);
        }
    }

    public final boolean zze() {
        zzagp zzagpVar = this.zzj;
        if (zzagpVar != null) {
            return !zzagpVar.zzf.zzi && zzagpVar.zzd() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    public final zzagq zzf(long j2, zzahd zzahdVar) {
        zzagp zzagpVar = this.zzj;
        return zzagpVar == null ? zzw(zzahdVar.zza, zzahdVar.zzb, zzahdVar.zzc, zzahdVar.zzs) : zzv(zzahdVar.zza, zzagpVar, j2);
    }

    public final zzagp zzg() {
        return this.zzj;
    }

    public final zzagp zzh() {
        return this.zzh;
    }

    public final zzagp zzi() {
        return this.zzi;
    }

    public final zzagp zzj() {
        zzagp zzagpVar = this.zzi;
        boolean z = false;
        if (zzagpVar != null && zzagpVar.zzo() != null) {
            z = true;
        }
        zzakt.zzd(z);
        this.zzi = this.zzi.zzo();
        zzs();
        return this.zzi;
    }

    public final zzagp zzk() {
        zzagp zzagpVar = this.zzh;
        if (zzagpVar == null) {
            return null;
        }
        if (zzagpVar == this.zzi) {
            this.zzi = zzagpVar.zzo();
        }
        this.zzh.zzm();
        int i2 = this.zzk - 1;
        this.zzk = i2;
        if (i2 == 0) {
            this.zzj = null;
            zzagp zzagpVar2 = this.zzh;
            this.zzl = zzagpVar2.zzb;
            this.zzm = zzagpVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzo();
        zzs();
        return this.zzh;
    }

    public final boolean zzl(zzagp zzagpVar) {
        boolean z = false;
        zzakt.zzd(zzagpVar != null);
        if (zzagpVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzagpVar;
        while (zzagpVar.zzo() != null) {
            zzagpVar = zzagpVar.zzo();
            if (zzagpVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzagpVar.zzm();
            this.zzk--;
        }
        this.zzj.zzn(null);
        zzs();
        return z;
    }

    public final void zzm() {
        if (this.zzk == 0) {
            return;
        }
        zzagp zzagpVar = this.zzh;
        zzakt.zze(zzagpVar);
        this.zzl = zzagpVar.zzb;
        this.zzm = zzagpVar.zzf.zza.zzd;
        while (zzagpVar != null) {
            zzagpVar.zzm();
            zzagpVar = zzagpVar.zzo();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzs();
    }

    public final boolean zzn(zzaiq zzaiqVar, long j2, long j3) {
        zzagq zzagqVar;
        boolean z;
        zzagp zzagpVar = null;
        for (zzagp zzagpVar2 = this.zzh; zzagpVar2 != null; zzagpVar2 = zzagpVar2.zzo()) {
            zzagq zzagqVar2 = zzagpVar2.zzf;
            if (zzagpVar == null) {
                zzagqVar = zzo(zzaiqVar, zzagqVar2);
            } else {
                zzagq zzv = zzv(zzaiqVar, zzagpVar, j2);
                if (zzv == null) {
                    return !zzl(zzagpVar);
                } else if (zzagqVar2.zzb != zzv.zzb || !zzagqVar2.zza.equals(zzv.zza)) {
                    return !zzl(zzagpVar);
                } else {
                    zzagqVar = zzv;
                }
            }
            zzagpVar2.zzf = zzagqVar.zzb(zzagqVar2.zzc);
            long j4 = zzagqVar2.zze;
            long j5 = zzagqVar.zze;
            if (j4 != -9223372036854775807L && j4 != j5) {
                zzagpVar2.zzr();
                long j6 = zzagqVar.zze;
                long zza = j6 == -9223372036854775807L ? Long.MAX_VALUE : j6 + zzagpVar2.zza();
                if (zzagpVar2 == this.zzi) {
                    boolean z2 = zzagpVar2.zzf.zzf;
                    if (j3 == Long.MIN_VALUE || j3 >= zza) {
                        z = true;
                        return zzl(zzagpVar2) && !z;
                    }
                }
                z = false;
                if (zzl(zzagpVar2)) {
                }
            }
            zzagpVar = zzagpVar2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzagq zzo(com.google.android.gms.internal.ads.zzaiq r19, com.google.android.gms.internal.ads.zzagq r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzhf r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzz(r1, r3)
            boolean r14 = r0.zzA(r1, r3, r12)
            com.google.android.gms.internal.ads.zzhf r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzain r5 = r0.zza
            r1.zzy(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L36
            int r1 = r3.zze
            if (r1 != r4) goto L2e
            goto L36
        L2e:
            com.google.android.gms.internal.ads.zzain r7 = r0.zza
            r7.zzb(r1)
            r7 = 0
            goto L37
        L36:
            r7 = r5
        L37:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L49
            com.google.android.gms.internal.ads.zzain r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzh(r5, r6)
        L47:
            r9 = r5
            goto L54
        L49:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L4f
            r9 = r7
            goto L54
        L4f:
            com.google.android.gms.internal.ads.zzain r1 = r0.zza
            long r5 = r1.zzd
            goto L47
        L54:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L62
            com.google.android.gms.internal.ads.zzain r1 = r0.zza
            int r4 = r3.zzb
            r1.zzj(r4)
            goto L6b
        L62:
            int r1 = r3.zze
            if (r1 == r4) goto L6b
            com.google.android.gms.internal.ads.zzain r4 = r0.zza
            r4.zzj(r1)
        L6b:
            com.google.android.gms.internal.ads.zzagq r15 = new com.google.android.gms.internal.ads.zzagq
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzags.zzo(com.google.android.gms.internal.ads.zzaiq, com.google.android.gms.internal.ads.zzagq):com.google.android.gms.internal.ads.zzagq");
    }

    public final zzhf zzp(zzaiq zzaiqVar, Object obj, long j2) {
        long j3;
        int zzi;
        int i2 = zzaiqVar.zzy(obj, this.zza).zzc;
        Object obj2 = this.zzl;
        if (obj2 == null || (zzi = zzaiqVar.zzi(obj2)) == -1 || zzaiqVar.zzh(zzi, this.zza, false).zzc != i2) {
            zzagp zzagpVar = this.zzh;
            while (true) {
                if (zzagpVar == null) {
                    zzagp zzagpVar2 = this.zzh;
                    while (true) {
                        if (zzagpVar2 != null) {
                            int zzi2 = zzaiqVar.zzi(zzagpVar2.zzb);
                            if (zzi2 != -1 && zzaiqVar.zzh(zzi2, this.zza, false).zzc == i2) {
                                j3 = zzagpVar2.zzf.zza.zzd;
                                break;
                            }
                            zzagpVar2 = zzagpVar2.zzo();
                        } else {
                            j3 = this.zze;
                            this.zze = 1 + j3;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j3;
                            }
                        }
                    }
                } else if (zzagpVar.zzb.equals(obj)) {
                    j3 = zzagpVar.zzf.zza.zzd;
                    break;
                } else {
                    zzagpVar = zzagpVar.zzo();
                }
            }
        } else {
            j3 = this.zzm;
        }
        return zzt(zzaiqVar, obj, j2, j3, this.zza);
    }

    public final /* synthetic */ void zzq(zzfog zzfogVar, zzhf zzhfVar) {
        this.zzc.zze(zzfogVar.zzf(), zzhfVar);
    }

    public final zzagp zzr(zzahw[] zzahwVarArr, zzjz zzjzVar, zzko zzkoVar, zzagz zzagzVar, zzagq zzagqVar, zzka zzkaVar) {
        long zza;
        zzagp zzagpVar = this.zzj;
        if (zzagpVar == null) {
            if (zzagqVar.zza.zzb()) {
                long j2 = zzagqVar.zzc;
                if (j2 != -9223372036854775807L) {
                    zza = j2;
                }
            }
            zza = 0;
        } else {
            zza = (zzagpVar.zza() + this.zzj.zzf.zze) - zzagqVar.zzb;
        }
        zzagp zzagpVar2 = new zzagp(zzahwVarArr, zza, zzjzVar, zzkoVar, zzagzVar, zzagqVar, zzkaVar, null);
        zzagp zzagpVar3 = this.zzj;
        if (zzagpVar3 != null) {
            zzagpVar3.zzn(zzagpVar2);
        } else {
            this.zzh = zzagpVar2;
            this.zzi = zzagpVar2;
        }
        this.zzl = null;
        this.zzj = zzagpVar2;
        this.zzk++;
        zzs();
        return zzagpVar2;
    }
}
