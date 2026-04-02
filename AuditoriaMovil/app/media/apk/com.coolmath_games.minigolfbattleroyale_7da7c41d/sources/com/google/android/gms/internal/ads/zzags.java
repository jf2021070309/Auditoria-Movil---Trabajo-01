package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzags {
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

    private final long zzB(zzaiq zzaiqVar, Object obj, int i) {
        zzaiqVar.zzy(obj, this.zza);
        this.zza.zzb(i);
        this.zza.zzk(i);
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

            /* JADX INFO: Access modifiers changed from: package-private */
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

    private static zzhf zzt(zzaiq zzaiqVar, Object obj, long j, long j2, zzain zzainVar) {
        zzaiqVar.zzy(obj, zzainVar);
        int zze = zzainVar.zze(j);
        if (zze == -1) {
            return new zzhf(obj, j2, zzainVar.zzf(j));
        }
        return new zzhf(obj, zze, zzainVar.zzc(zze), j2);
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

    private final zzagq zzv(zzaiq zzaiqVar, zzagp zzagpVar, long j) {
        long j2;
        zzagq zzagqVar = zzagpVar.zzf;
        long zza = (zzagpVar.zza() + zzagqVar.zze) - j;
        if (zzagqVar.zzg) {
            long j3 = 0;
            int zzu = zzaiqVar.zzu(zzaiqVar.zzi(zzagqVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzu == -1) {
                return null;
            }
            int i = zzaiqVar.zzh(zzu, this.zza, true).zzc;
            Object obj = this.zza.zzb;
            long j4 = zzagqVar.zza.zzd;
            if (zzaiqVar.zzf(i, this.zzb, 0L).zzn == zzu) {
                Pair<Object, Long> zzw = zzaiqVar.zzw(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, zza));
                if (zzw == null) {
                    return null;
                }
                obj = zzw.first;
                long longValue = ((Long) zzw.second).longValue();
                zzagp zzo = zzagpVar.zzo();
                if (zzo != null && zzo.zzb.equals(obj)) {
                    j4 = zzo.zzf.zza.zzd;
                } else {
                    j4 = this.zze;
                    this.zze = 1 + j4;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return zzw(zzaiqVar, zzt(zzaiqVar, obj, j2, j4, this.zza), j3, j2);
        }
        zzhf zzhfVar = zzagqVar.zza;
        zzaiqVar.zzy(zzhfVar.zza, this.zza);
        if (zzhfVar.zzb()) {
            int i2 = zzhfVar.zzb;
            if (this.zza.zzg(i2) == -1) {
                return null;
            }
            int zzd = this.zza.zzd(i2, zzhfVar.zzc);
            if (zzd < 0) {
                return zzx(zzaiqVar, zzhfVar.zza, i2, zzd, zzagqVar.zzc, zzhfVar.zzd);
            }
            long j5 = zzagqVar.zzc;
            if (j5 == -9223372036854775807L) {
                zzaip zzaipVar = this.zzb;
                zzain zzainVar = this.zza;
                Pair<Object, Long> zzw2 = zzaiqVar.zzw(zzaipVar, zzainVar, zzainVar.zzc, -9223372036854775807L, Math.max(0L, zza));
                if (zzw2 == null) {
                    return null;
                }
                j5 = ((Long) zzw2.second).longValue();
            }
            zzB(zzaiqVar, zzhfVar.zza, zzhfVar.zzb);
            return zzy(zzaiqVar, zzhfVar.zza, Math.max(0L, j5), zzagqVar.zzc, zzhfVar.zzd);
        }
        int zzc = this.zza.zzc(zzhfVar.zze);
        if (zzc == this.zza.zzg(zzhfVar.zze)) {
            zzB(zzaiqVar, zzhfVar.zza, zzhfVar.zze);
            return zzy(zzaiqVar, zzhfVar.zza, 0L, zzagqVar.zze, zzhfVar.zzd);
        }
        return zzx(zzaiqVar, zzhfVar.zza, zzhfVar.zze, zzc, zzagqVar.zze, zzhfVar.zzd);
    }

    private final zzagq zzw(zzaiq zzaiqVar, zzhf zzhfVar, long j, long j2) {
        zzaiqVar.zzy(zzhfVar.zza, this.zza);
        if (zzhfVar.zzb()) {
            return zzx(zzaiqVar, zzhfVar.zza, zzhfVar.zzb, zzhfVar.zzc, j, zzhfVar.zzd);
        }
        return zzy(zzaiqVar, zzhfVar.zza, j2, j, zzhfVar.zzd);
    }

    private final zzagq zzx(zzaiq zzaiqVar, Object obj, int i, int i2, long j, long j2) {
        zzhf zzhfVar = new zzhf(obj, i, i2, j2);
        long zzh = zzaiqVar.zzy(zzhfVar.zza, this.zza).zzh(zzhfVar.zzb, zzhfVar.zzc);
        if (i2 == this.zza.zzc(i)) {
            this.zza.zzi();
        }
        this.zza.zzj(zzhfVar.zzb);
        return new zzagq(zzhfVar, (zzh == -9223372036854775807L || zzh > 0) ? 0L : Math.max(0L, (-1) + zzh), j, -9223372036854775807L, zzh, false, false, false, false);
    }

    private final zzagq zzy(zzaiq zzaiqVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5 = j;
        zzaiqVar.zzy(obj, this.zza);
        int zzf = this.zza.zzf(j5);
        zzhf zzhfVar = new zzhf(obj, j3, zzf);
        boolean zzC = zzC(zzhfVar);
        boolean zzz = zzz(zzaiqVar, zzhfVar);
        boolean zzA = zzA(zzaiqVar, zzhfVar, zzC);
        if (zzf != -1) {
            this.zza.zzj(zzf);
        }
        if (zzf != -1) {
            this.zza.zzb(zzf);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j6 = j4 != -9223372036854775807L ? j4 : this.zza.zzd;
        if (j6 != -9223372036854775807L && j5 >= j6) {
            j5 = Math.max(0L, (-1) + j6);
        }
        return new zzagq(zzhfVar, j5, j2, j4, j6, false, zzC, zzz, zzA);
    }

    private final boolean zzz(zzaiq zzaiqVar, zzhf zzhfVar) {
        if (zzC(zzhfVar)) {
            return zzaiqVar.zzf(zzaiqVar.zzy(zzhfVar.zza, this.zza).zzc, this.zzb, 0L).zzo == zzaiqVar.zzi(zzhfVar.zza);
        }
        return false;
    }

    public final boolean zza(zzaiq zzaiqVar, int i) {
        this.zzf = i;
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

    public final void zzd(long j) {
        zzagp zzagpVar = this.zzj;
        if (zzagpVar != null) {
            zzagpVar.zzh(j);
        }
    }

    public final boolean zze() {
        zzagp zzagpVar = this.zzj;
        if (zzagpVar != null) {
            if (zzagpVar.zzf.zzi || !zzagpVar.zzd() || this.zzj.zzf.zze == -9223372036854775807L) {
                return false;
            }
            return this.zzk < 100;
        }
        return true;
    }

    public final zzagq zzf(long j, zzahd zzahdVar) {
        zzagp zzagpVar = this.zzj;
        return zzagpVar == null ? zzw(zzahdVar.zza, zzahdVar.zzb, zzahdVar.zzc, zzahdVar.zzs) : zzv(zzahdVar.zza, zzagpVar, j);
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
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
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

    public final boolean zzn(zzaiq zzaiqVar, long j, long j2) {
        zzagq zzagqVar;
        boolean z;
        zzagp zzagpVar = null;
        for (zzagp zzagpVar2 = this.zzh; zzagpVar2 != null; zzagpVar2 = zzagpVar2.zzo()) {
            zzagq zzagqVar2 = zzagpVar2.zzf;
            if (zzagpVar == null) {
                zzagqVar = zzo(zzaiqVar, zzagqVar2);
            } else {
                zzagq zzv = zzv(zzaiqVar, zzagpVar, j);
                if (zzv == null) {
                    return !zzl(zzagpVar);
                } else if (zzagqVar2.zzb != zzv.zzb || !zzagqVar2.zza.equals(zzv.zza)) {
                    return !zzl(zzagpVar);
                } else {
                    zzagqVar = zzv;
                }
            }
            zzagpVar2.zzf = zzagqVar.zzb(zzagqVar2.zzc);
            long j3 = zzagqVar2.zze;
            long j4 = zzagqVar.zze;
            if (j3 == -9223372036854775807L || j3 == j4) {
                zzagpVar = zzagpVar2;
            } else {
                zzagpVar2.zzr();
                long j5 = zzagqVar.zze;
                long zza = j5 == -9223372036854775807L ? LongCompanionObject.MAX_VALUE : j5 + zzagpVar2.zza();
                if (zzagpVar2 == this.zzi) {
                    boolean z2 = zzagpVar2.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= zza) {
                        z = true;
                        return zzl(zzagpVar2) && !z;
                    }
                }
                z = false;
                if (zzl(zzagpVar2)) {
                }
            }
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

    public final zzhf zzp(zzaiq zzaiqVar, Object obj, long j) {
        long j2;
        int zzi;
        int i = zzaiqVar.zzy(obj, this.zza).zzc;
        Object obj2 = this.zzl;
        if (obj2 == null || (zzi = zzaiqVar.zzi(obj2)) == -1 || zzaiqVar.zzh(zzi, this.zza, false).zzc != i) {
            zzagp zzagpVar = this.zzh;
            while (true) {
                if (zzagpVar == null) {
                    zzagp zzagpVar2 = this.zzh;
                    while (true) {
                        if (zzagpVar2 != null) {
                            int zzi2 = zzaiqVar.zzi(zzagpVar2.zzb);
                            if (zzi2 != -1 && zzaiqVar.zzh(zzi2, this.zza, false).zzc == i) {
                                j2 = zzagpVar2.zzf.zza.zzd;
                                break;
                            }
                            zzagpVar2 = zzagpVar2.zzo();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                } else if (zzagpVar.zzb.equals(obj)) {
                    j2 = zzagpVar.zzf.zza.zzd;
                    break;
                } else {
                    zzagpVar = zzagpVar.zzo();
                }
            }
        } else {
            j2 = this.zzm;
        }
        return zzt(zzaiqVar, obj, j, j2, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(zzfog zzfogVar, zzhf zzhfVar) {
        this.zzc.zze(zzfogVar.zzf(), zzhfVar);
    }

    public final zzagp zzr(zzahw[] zzahwVarArr, zzjz zzjzVar, zzko zzkoVar, zzagz zzagzVar, zzagq zzagqVar, zzka zzkaVar) {
        long zza;
        zzagp zzagpVar = this.zzj;
        if (zzagpVar == null) {
            if (zzagqVar.zza.zzb()) {
                long j = zzagqVar.zzc;
                if (j != -9223372036854775807L) {
                    zza = j;
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
