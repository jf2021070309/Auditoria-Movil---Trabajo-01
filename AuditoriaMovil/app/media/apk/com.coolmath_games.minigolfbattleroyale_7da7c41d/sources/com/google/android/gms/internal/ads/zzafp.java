package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzafp implements Handler.Callback, zzhd, zzjy, zzagy, zzaeb, zzahq {
    private boolean zzA;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private zzafo zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    private zzaeg zzL;
    private final zzadz zzM;
    private final zzahv[] zza;
    private final Set<zzahv> zzb;
    private final zzahw[] zzc;
    private final zzjz zzd;
    private final zzka zze;
    private final zzafy zzf;
    private final zzki zzg;
    private final zzalg zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzaip zzk;
    private final zzain zzl;
    private final long zzm;
    private final zzaec zzn;
    private final ArrayList<zzafl> zzo;
    private final zzaku zzp;
    private final zzafn zzq;
    private final zzags zzr;
    private final zzagz zzs;
    private zzahz zzt;
    private zzahd zzu;
    private zzafm zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzB = 0;
    private boolean zzC = false;
    private boolean zzx = false;

    public zzafp(zzahv[] zzahvVarArr, zzjz zzjzVar, zzka zzkaVar, zzafy zzafyVar, zzki zzkiVar, int i, boolean z, zzcy zzcyVar, zzahz zzahzVar, zzadz zzadzVar, long j, boolean z2, Looper looper, zzaku zzakuVar, zzafn zzafnVar, byte[] bArr) {
        this.zzq = zzafnVar;
        this.zza = zzahvVarArr;
        this.zzd = zzjzVar;
        this.zze = zzkaVar;
        this.zzf = zzafyVar;
        this.zzg = zzkiVar;
        this.zzt = zzahzVar;
        this.zzM = zzadzVar;
        this.zzp = zzakuVar;
        this.zzm = zzafyVar.zzd();
        zzafyVar.zze();
        this.zzu = zzahd.zza(zzkaVar);
        this.zzv = new zzafm(this.zzu);
        this.zzc = new zzahw[2];
        for (int i2 = 0; i2 < 2; i2++) {
            zzahvVarArr[i2].zzae(i2);
            this.zzc[i2] = zzahvVarArr[i2].zzad();
        }
        this.zzn = new zzaec(this, zzakuVar);
        this.zzo = new ArrayList<>();
        this.zzb = Collections.newSetFromMap(new IdentityHashMap());
        this.zzk = new zzaip();
        this.zzl = new zzain();
        zzjzVar.zzk(this, zzkiVar);
        this.zzK = true;
        Handler handler = new Handler(looper);
        this.zzr = new zzags(zzcyVar, handler);
        this.zzs = new zzagz(this, zzcyVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzi = handlerThread;
        handlerThread.start();
        Looper looper2 = this.zzi.getLooper();
        this.zzj = looper2;
        this.zzh = zzakuVar.zza(looper2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[LOOP:0: B:30:0x009c->B:37:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009b -> B:30:0x009c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzA() throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafp.zzA():void");
    }

    private final long zzB(zzaiq zzaiqVar, Object obj, long j) {
        zzaiqVar.zzf(zzaiqVar.zzy(obj, this.zzl).zzc, this.zzk, 0L);
        zzaip zzaipVar = this.zzk;
        if (zzaipVar.zze != -9223372036854775807L && zzaipVar.zzb()) {
            zzaip zzaipVar2 = this.zzk;
            if (zzaipVar2.zzh) {
                return zzadx.zzb(zzamq.zzab(zzaipVar2.zzf) - this.zzk.zze) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final boolean zzC(zzaiq zzaiqVar, zzhf zzhfVar) {
        if (!zzhfVar.zzb() && !zzaiqVar.zzt()) {
            zzaiqVar.zzf(zzaiqVar.zzy(zzhfVar.zza, this.zzl).zzc, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzaip zzaipVar = this.zzk;
                if (zzaipVar.zzh && zzaipVar.zze != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void zzD(long j, long j2) {
        this.zzh.zzh(2);
        this.zzh.zzg(2, j + j2);
    }

    private final long zzE(zzhf zzhfVar, long j, boolean z) throws zzaeg {
        return zzF(zzhfVar, j, this.zzr.zzh() != this.zzr.zzi(), z);
    }

    private final long zzF(zzhf zzhfVar, long j, boolean z, boolean z2) throws zzaeg {
        zzz();
        this.zzz = false;
        if (z2 || this.zzu.zze == 3) {
            zzu(2);
        }
        zzagp zzh = this.zzr.zzh();
        zzagp zzagpVar = zzh;
        while (zzagpVar != null && !zzhfVar.equals(zzagpVar.zzf.zza)) {
            zzagpVar = zzagpVar.zzo();
        }
        if (z || zzh != zzagpVar || (zzagpVar != null && zzagpVar.zza() + j < 0)) {
            zzahv[] zzahvVarArr = this.zza;
            for (int i = 0; i < 2; i++) {
                zzL(zzahvVarArr[i]);
            }
            if (zzagpVar != null) {
                while (this.zzr.zzh() != zzagpVar) {
                    this.zzr.zzk();
                }
                this.zzr.zzl(zzagpVar);
                zzagpVar.zzb(0L);
                zzW();
            }
        }
        if (zzagpVar != null) {
            this.zzr.zzl(zzagpVar);
            if (!zzagpVar.zzd) {
                zzagpVar.zzf = zzagpVar.zzf.zza(j);
            } else if (zzagpVar.zze) {
                j = zzagpVar.zza.zzi(j);
                zzagpVar.zza.zze(j - this.zzm, false);
            }
            zzG(j);
            zzS();
        } else {
            this.zzr.zzm();
            zzG(j);
        }
        zzY(false);
        this.zzh.zzf(2);
        return j;
    }

    private final void zzG(long j) throws zzaeg {
        zzjg[] zzjgVarArr;
        zzagp zzh = this.zzr.zzh();
        if (zzh != null) {
            j += zzh.zza();
        }
        this.zzI = j;
        this.zzn.zzc(j);
        zzahv[] zzahvVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzahv zzahvVar = zzahvVarArr[i];
            if (zzaf(zzahvVar)) {
                zzahvVar.zzap(this.zzI);
            }
        }
        for (zzagp zzh2 = this.zzr.zzh(); zzh2 != null; zzh2 = zzh2.zzo()) {
            for (zzjg zzjgVar : zzh2.zzq().zzd) {
            }
        }
    }

    private final void zzH(boolean z, boolean z2) {
        zzI(z || !this.zzD, false, true, false);
        this.zzv.zzb(z2 ? 1 : 0);
        this.zzf.zzb();
        zzu(1);
    }

    private final void zzI(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        zzhf zzhfVar;
        boolean z5;
        long j2;
        long j3;
        this.zzh.zzh(2);
        this.zzL = null;
        this.zzz = false;
        this.zzn.zzb();
        this.zzI = 0L;
        zzahv[] zzahvVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            try {
                zzL(zzahvVarArr[i]);
            } catch (zzaeg | RuntimeException e) {
                zzaln.zzb("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            zzahv[] zzahvVarArr2 = this.zza;
            for (int i2 = 0; i2 < 2; i2++) {
                zzahv zzahvVar = zzahvVarArr2[i2];
                if (this.zzb.remove(zzahvVar)) {
                    try {
                        zzahvVar.zzas();
                    } catch (RuntimeException e2) {
                        zzaln.zzb("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.zzG = 0;
        zzahd zzahdVar = this.zzu;
        zzhf zzhfVar2 = zzahdVar.zzb;
        long j4 = zzahdVar.zzs;
        if (this.zzu.zzb.zzb() || zzad(this.zzu, this.zzl)) {
            j = this.zzu.zzc;
        } else {
            j = this.zzu.zzs;
        }
        if (z2) {
            this.zzH = null;
            Pair<zzhf, Long> zzJ = zzJ(this.zzu.zza);
            zzhf zzhfVar3 = (zzhf) zzJ.first;
            long longValue = ((Long) zzJ.second).longValue();
            if (zzhfVar3.equals(this.zzu.zzb)) {
                zzhfVar = zzhfVar3;
                z5 = false;
            } else {
                z5 = true;
                zzhfVar = zzhfVar3;
            }
            j2 = longValue;
            j3 = -9223372036854775807L;
        } else {
            zzhfVar = zzhfVar2;
            z5 = false;
            j2 = j4;
            j3 = j;
        }
        this.zzr.zzm();
        this.zzA = false;
        zzahd zzahdVar2 = this.zzu;
        zzaiq zzaiqVar = zzahdVar2.zza;
        int i3 = zzahdVar2.zze;
        zzaeg zzaegVar = z4 ? null : zzahdVar2.zzf;
        zzs zzsVar = z5 ? zzs.zza : zzahdVar2.zzh;
        zzka zzkaVar = z5 ? this.zze : this.zzu.zzi;
        List zzi = z5 ? zzfoj.zzi() : this.zzu.zzj;
        zzahd zzahdVar3 = this.zzu;
        this.zzu = new zzahd(zzaiqVar, zzhfVar, j3, j2, i3, zzaegVar, false, zzsVar, zzkaVar, zzi, zzhfVar, zzahdVar3.zzl, zzahdVar3.zzm, zzahdVar3.zzn, j2, 0L, j2, this.zzF, false);
        if (z3) {
            this.zzs.zzg();
        }
    }

    private final Pair<zzhf, Long> zzJ(zzaiq zzaiqVar) {
        long j = 0;
        if (zzaiqVar.zzt()) {
            return Pair.create(zzahd.zzb(), 0L);
        }
        Pair<Object, Long> zzv = zzaiqVar.zzv(this.zzk, this.zzl, zzaiqVar.zze(this.zzC), -9223372036854775807L);
        zzhf zzp = this.zzr.zzp(zzaiqVar, zzv.first, 0L);
        long longValue = ((Long) zzv.second).longValue();
        if (zzp.zzb()) {
            zzaiqVar.zzy(zzp.zza, this.zzl);
            if (zzp.zzc == this.zzl.zzc(zzp.zzb)) {
                this.zzl.zzi();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzp, Long.valueOf(j));
    }

    private final void zzK(zzaiq zzaiqVar, zzaiq zzaiqVar2) {
        if (zzaiqVar.zzt() && zzaiqVar2.zzt()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size >= 0) {
            zzafl zzaflVar = this.zzo.get(size);
            Object obj = zzaflVar.zzb;
            zzahs zzahsVar = zzaflVar.zza;
            zzadx.zzb(-9223372036854775807L);
            zzahs zzahsVar2 = zzaflVar.zza;
            throw null;
        }
        Collections.sort(this.zzo);
    }

    private final void zzL(zzahv zzahvVar) throws zzaeg {
        if (zzaf(zzahvVar)) {
            this.zzn.zze(zzahvVar);
            zzah(zzahvVar);
            zzahvVar.zzar();
            this.zzG--;
        }
    }

    private final boolean zzM() {
        zzagp zzh = this.zzr.zzh();
        long j = zzh.zzf.zze;
        if (zzh.zzd) {
            if (j == -9223372036854775807L || this.zzu.zzs < j) {
                return true;
            }
            return !zzac();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0361 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzain] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.google.android.gms.internal.ads.zzafo] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.zzaiq] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.internal.ads.zzaiq] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzN(com.google.android.gms.internal.ads.zzaiq r29, boolean r30) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafp.zzN(com.google.android.gms.internal.ads.zzaiq, boolean):void");
    }

    private final void zzO(zzaiq zzaiqVar, zzhf zzhfVar, zzaiq zzaiqVar2, zzhf zzhfVar2, long j) {
        if (zzaiqVar.zzt() || !zzC(zzaiqVar, zzhfVar)) {
            float f = this.zzn.zzA().zzb;
            zzahf zzahfVar = this.zzu.zzn;
            if (f != zzahfVar.zzb) {
                this.zzn.zzz(zzahfVar);
                return;
            }
            return;
        }
        zzaiqVar.zzf(zzaiqVar.zzy(zzhfVar.zza, this.zzl).zzc, this.zzk, 0L);
        zzadz zzadzVar = this.zzM;
        zzagh zzaghVar = this.zzk.zzj;
        int i = zzamq.zza;
        zzadzVar.zza(zzaghVar);
        if (j != -9223372036854775807L) {
            this.zzM.zzb(zzB(zzaiqVar, zzhfVar.zza, j));
            return;
        }
        if (zzamq.zzc(!zzaiqVar2.zzt() ? zzaiqVar2.zzf(zzaiqVar2.zzy(zzhfVar2.zza, this.zzl).zzc, this.zzk, 0L).zzb : null, this.zzk.zzb)) {
            return;
        }
        this.zzM.zzb(-9223372036854775807L);
    }

    private final void zzP() {
        zzagp zzh = this.zzr.zzh();
        boolean z = false;
        if (zzh != null && zzh.zzf.zzh && this.zzx) {
            z = true;
        }
        this.zzy = z;
    }

    private final void zzQ(zzahf zzahfVar, boolean z) throws zzaeg {
        zzR(zzahfVar, zzahfVar.zzb, true, z);
    }

    private final void zzR(zzahf zzahfVar, float f, boolean z, boolean z2) throws zzaeg {
        int i;
        zzafp zzafpVar = this;
        if (z) {
            if (z2) {
                zzafpVar.zzv.zzb(1);
            }
            zzahd zzahdVar = zzafpVar.zzu;
            zzafpVar = this;
            zzafpVar.zzu = new zzahd(zzahdVar.zza, zzahdVar.zzb, zzahdVar.zzc, zzahdVar.zzd, zzahdVar.zze, zzahdVar.zzf, zzahdVar.zzg, zzahdVar.zzh, zzahdVar.zzi, zzahdVar.zzj, zzahdVar.zzk, zzahdVar.zzl, zzahdVar.zzm, zzahfVar, zzahdVar.zzq, zzahdVar.zzr, zzahdVar.zzs, zzahdVar.zzo, zzahdVar.zzp);
        }
        float f2 = zzahfVar.zzb;
        zzagp zzh = zzafpVar.zzr.zzh();
        while (true) {
            i = 0;
            if (zzh == null) {
                break;
            }
            zzjg[] zzjgVarArr = zzh.zzq().zzd;
            int length = zzjgVarArr.length;
            while (i < length) {
                zzjg zzjgVar = zzjgVarArr[i];
                i++;
            }
            zzh = zzh.zzo();
        }
        zzahv[] zzahvVarArr = zzafpVar.zza;
        while (i < 2) {
            zzahv zzahvVar = zzahvVarArr[i];
            if (zzahvVar != null) {
                zzahvVar.zzM(f, zzahfVar.zzb);
            }
            i++;
        }
    }

    private final void zzS() {
        long zza;
        long j;
        boolean zzf;
        if (zzT()) {
            zzagp zzg = this.zzr.zzg();
            long zzaa = zzaa(zzg.zzf());
            if (zzg == this.zzr.zzh()) {
                zza = this.zzI;
                j = zzg.zza();
            } else {
                zza = this.zzI - zzg.zza();
                j = zzg.zzf.zzb;
            }
            zzf = this.zzf.zzf(zza - j, zzaa, this.zzn.zzA().zzb);
        } else {
            zzf = false;
        }
        this.zzA = zzf;
        if (zzf) {
            this.zzr.zzg().zzi(this.zzI);
        }
        zzU();
    }

    private final boolean zzT() {
        zzagp zzg = this.zzr.zzg();
        return (zzg == null || zzg.zzf() == Long.MIN_VALUE) ? false : true;
    }

    private final void zzU() {
        zzagp zzg = this.zzr.zzg();
        boolean z = this.zzA || (zzg != null && zzg.zza.zzm());
        zzahd zzahdVar = this.zzu;
        if (z != zzahdVar.zzg) {
            this.zzu = new zzahd(zzahdVar.zza, zzahdVar.zzb, zzahdVar.zzc, zzahdVar.zzd, zzahdVar.zze, zzahdVar.zzf, z, zzahdVar.zzh, zzahdVar.zzi, zzahdVar.zzj, zzahdVar.zzk, zzahdVar.zzl, zzahdVar.zzm, zzahdVar.zzn, zzahdVar.zzq, zzahdVar.zzr, zzahdVar.zzs, zzahdVar.zzo, zzahdVar.zzp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzahd zzV(com.google.android.gms.internal.ads.zzhf r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            r5 = r20
            boolean r1 = r0.zzK
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.zzahd r1 = r0.zzu
            long r7 = r1.zzs
            int r1 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.zzahd r1 = r0.zzu
            com.google.android.gms.internal.ads.zzhf r1 = r1.zzb
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r1 = r3
            goto L22
        L21:
            r1 = r4
        L22:
            r0.zzK = r1
            r16.zzP()
            com.google.android.gms.internal.ads.zzahd r1 = r0.zzu
            com.google.android.gms.internal.ads.zzs r7 = r1.zzh
            com.google.android.gms.internal.ads.zzka r8 = r1.zzi
            java.util.List<com.google.android.gms.internal.ads.zzaiv> r1 = r1.zzj
            com.google.android.gms.internal.ads.zzagz r9 = r0.zzs
            boolean r9 = r9.zzc()
            if (r9 == 0) goto L96
            com.google.android.gms.internal.ads.zzags r1 = r0.zzr
            com.google.android.gms.internal.ads.zzagp r1 = r1.zzh()
            if (r1 != 0) goto L42
            com.google.android.gms.internal.ads.zzs r7 = com.google.android.gms.internal.ads.zzs.zza
            goto L46
        L42:
            com.google.android.gms.internal.ads.zzs r7 = r1.zzp()
        L46:
            if (r1 != 0) goto L4b
            com.google.android.gms.internal.ads.zzka r8 = r0.zze
            goto L4f
        L4b:
            com.google.android.gms.internal.ads.zzka r8 = r1.zzq()
        L4f:
            com.google.android.gms.internal.ads.zzjg[] r9 = r8.zzd
            com.google.android.gms.internal.ads.zzfog r10 = new com.google.android.gms.internal.ads.zzfog
            r10.<init>()
            int r11 = r9.length
            r12 = r3
            r13 = r12
        L59:
            if (r12 >= r11) goto L79
            r14 = r9[r12]
            if (r14 == 0) goto L76
            com.google.android.gms.internal.ads.zzafv r14 = r14.zzd(r3)
            com.google.android.gms.internal.ads.zzaiv r14 = r14.zzj
            if (r14 != 0) goto L72
            com.google.android.gms.internal.ads.zzaiv r14 = new com.google.android.gms.internal.ads.zzaiv
            com.google.android.gms.internal.ads.zzaiu[] r15 = new com.google.android.gms.internal.ads.zzaiu[r3]
            r14.<init>(r15)
            r10.zze(r14)
            goto L76
        L72:
            r10.zze(r14)
            r13 = r4
        L76:
            int r12 = r12 + 1
            goto L59
        L79:
            if (r13 == 0) goto L80
            com.google.android.gms.internal.ads.zzfoj r3 = r10.zzf()
            goto L84
        L80:
            com.google.android.gms.internal.ads.zzfoj r3 = com.google.android.gms.internal.ads.zzfoj.zzi()
        L84:
            if (r1 == 0) goto L94
            com.google.android.gms.internal.ads.zzagq r4 = r1.zzf
            long r9 = r4.zzc
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 == 0) goto L94
            com.google.android.gms.internal.ads.zzagq r4 = r4.zzb(r5)
            r1.zzf = r4
        L94:
            r13 = r3
            goto Lad
        L96:
            com.google.android.gms.internal.ads.zzahd r3 = r0.zzu
            com.google.android.gms.internal.ads.zzhf r3 = r3.zzb
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lac
            com.google.android.gms.internal.ads.zzs r1 = com.google.android.gms.internal.ads.zzs.zza
            com.google.android.gms.internal.ads.zzka r3 = r0.zze
            com.google.android.gms.internal.ads.zzfoj r4 = com.google.android.gms.internal.ads.zzfoj.zzi()
            r11 = r1
            r12 = r3
            r13 = r4
            goto Laf
        Lac:
            r13 = r1
        Lad:
            r11 = r7
            r12 = r8
        Laf:
            if (r24 == 0) goto Lb8
            com.google.android.gms.internal.ads.zzafm r1 = r0.zzv
            r3 = r25
            r1.zzd(r3)
        Lb8:
            com.google.android.gms.internal.ads.zzahd r1 = r0.zzu
            long r9 = r16.zzZ()
            r2 = r17
            r3 = r18
            r5 = r20
            r7 = r22
            com.google.android.gms.internal.ads.zzahd r1 = r1.zzc(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafp.zzV(com.google.android.gms.internal.ads.zzhf, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzahd");
    }

    private final void zzW() throws zzaeg {
        zzX(new boolean[2]);
    }

    private final void zzX(boolean[] zArr) throws zzaeg {
        zzagp zzi = this.zzr.zzi();
        zzka zzq = zzi.zzq();
        for (int i = 0; i < 2; i++) {
            if (!zzq.zza(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzas();
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzq.zza(i2)) {
                boolean z = zArr[i2];
                zzahv zzahvVar = this.zza[i2];
                if (!zzaf(zzahvVar)) {
                    zzagp zzi2 = this.zzr.zzi();
                    boolean z2 = zzi2 == this.zzr.zzh();
                    zzka zzq2 = zzi2.zzq();
                    zzahx zzahxVar = zzq2.zzb[i2];
                    zzafv[] zzaj = zzaj(zzq2.zzd[i2]);
                    boolean z3 = zzac() && this.zzu.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzG++;
                    this.zzb.add(zzahvVar);
                    zzahvVar.zzag(zzahxVar, zzaj, zzi2.zzc[i2], this.zzI, z4, z2, zzi2.zzc(), zzi2.zza());
                    zzahvVar.zzE(11, new zzafh(this));
                    this.zzn.zzd(zzahvVar);
                    if (z3) {
                        zzahvVar.zzah();
                    }
                }
            }
        }
        zzi.zzg = true;
    }

    private final void zzY(boolean z) {
        long zze;
        zzagp zzg = this.zzr.zzg();
        zzhf zzhfVar = zzg == null ? this.zzu.zzb : zzg.zzf.zza;
        boolean z2 = !this.zzu.zzk.equals(zzhfVar);
        if (z2) {
            this.zzu = this.zzu.zzg(zzhfVar);
        }
        zzahd zzahdVar = this.zzu;
        if (zzg == null) {
            zze = zzahdVar.zzs;
        } else {
            zze = zzg.zze();
        }
        zzahdVar.zzq = zze;
        this.zzu.zzr = zzZ();
        if ((z2 || z) && zzg != null && zzg.zzd) {
            zzab(zzg.zzp(), zzg.zzq());
        }
    }

    private final long zzZ() {
        return zzaa(this.zzu.zzq);
    }

    private final long zzaa(long j) {
        zzagp zzg = this.zzr.zzg();
        if (zzg == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzI - zzg.zza()));
    }

    private final void zzab(zzs zzsVar, zzka zzkaVar) {
        this.zzf.zzi(this.zza, zzsVar, zzkaVar.zzd);
    }

    private final boolean zzac() {
        zzahd zzahdVar = this.zzu;
        return zzahdVar.zzl && zzahdVar.zzm == 0;
    }

    private static boolean zzad(zzahd zzahdVar, zzain zzainVar) {
        zzhf zzhfVar = zzahdVar.zzb;
        zzaiq zzaiqVar = zzahdVar.zza;
        return zzaiqVar.zzt() || zzaiqVar.zzy(zzhfVar.zza, zzainVar).zzf;
    }

    private static Pair<Object, Long> zzae(zzaiq zzaiqVar, zzafo zzafoVar, boolean z, int i, boolean z2, zzaip zzaipVar, zzain zzainVar) {
        Pair<Object, Long> zzv;
        zzaiq zzaiqVar2 = zzafoVar.zza;
        if (zzaiqVar.zzt()) {
            return null;
        }
        zzaiq zzaiqVar3 = true == zzaiqVar2.zzt() ? zzaiqVar : zzaiqVar2;
        try {
            zzv = zzaiqVar3.zzv(zzaipVar, zzainVar, zzafoVar.zzb, zzafoVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzaiqVar.equals(zzaiqVar3)) {
            return zzv;
        }
        if (zzaiqVar.zzi(zzv.first) != -1) {
            return (zzaiqVar3.zzy(zzv.first, zzainVar).zzf && zzaiqVar3.zzf(zzainVar.zzc, zzaipVar, 0L).zzn == zzaiqVar3.zzi(zzv.first)) ? zzaiqVar.zzv(zzaipVar, zzainVar, zzaiqVar.zzy(zzv.first, zzainVar).zzc, zzafoVar.zzc) : zzv;
        }
        Object zzm = zzm(zzaipVar, zzainVar, i, z2, zzv.first, zzaiqVar3, zzaiqVar);
        if (zzm != null) {
            return zzaiqVar.zzv(zzaipVar, zzainVar, zzaiqVar.zzy(zzm, zzainVar).zzc, -9223372036854775807L);
        }
        return null;
    }

    private static boolean zzaf(zzahv zzahvVar) {
        return zzahvVar.zzaf() != 0;
    }

    private static final void zzag(zzahs zzahsVar) throws zzaeg {
        zzahsVar.zzh();
        try {
            zzahsVar.zza().zzE(zzahsVar.zzc(), zzahsVar.zze());
        } finally {
            zzahsVar.zzi(true);
        }
    }

    private static final void zzah(zzahv zzahvVar) throws zzaeg {
        if (zzahvVar.zzaf() == 2) {
            zzahvVar.zzaq();
        }
    }

    private static final void zzai(zzahv zzahvVar, long j) {
        zzahvVar.zzam();
        if (zzahvVar instanceof zzaks) {
            zzaks zzaksVar = (zzaks) zzahvVar;
            throw null;
        }
    }

    private static zzafv[] zzaj(zzjg zzjgVar) {
        int zzc = zzjgVar != null ? zzjgVar.zzc() : 0;
        zzafv[] zzafvVarArr = new zzafv[zzc];
        for (int i = 0; i < zzc; i++) {
            zzafvVarArr[i] = zzjgVar.zzd(i);
        }
        return zzafvVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzd(zzafp zzafpVar, boolean z) {
        zzafpVar.zzE = true;
        return true;
    }

    static Object zzm(zzaip zzaipVar, zzain zzainVar, int i, boolean z, Object obj, zzaiq zzaiqVar, zzaiq zzaiqVar2) {
        int zzi = zzaiqVar.zzi(obj);
        int zzg = zzaiqVar.zzg();
        int i2 = 0;
        int i3 = zzi;
        int i4 = -1;
        while (true) {
            if (i2 >= zzg || i4 != -1) {
                break;
            }
            i3 = zzaiqVar.zzu(i3, zzainVar, zzaipVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzaiqVar2.zzi(zzaiqVar.zzj(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return zzaiqVar2.zzj(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzr(zzahs zzahsVar) {
        try {
            zzag(zzahsVar);
        } catch (zzaeg e) {
            zzaln.zzb("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final void zzs(IOException iOException, int i) {
        zzaeg zza = zzaeg.zza(iOException, i);
        zzagp zzh = this.zzr.zzh();
        if (zzh != null) {
            zza = zza.zzd(zzh.zzf.zza);
        }
        zzaln.zzb("ExoPlayerImplInternal", "Playback error", zza);
        zzH(false, false);
        this.zzu = this.zzu.zzf(zza);
    }

    private final synchronized void zzt(zzfmj<Boolean> zzfmjVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z = false;
        for (long j2 = 500; !zzfmjVar.zza().booleanValue() && j2 > 0; j2 = elapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                wait(j2);
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final void zzu(int i) {
        zzahd zzahdVar = this.zzu;
        if (zzahdVar.zze != i) {
            this.zzu = zzahdVar.zze(i);
        }
    }

    private final void zzv() {
        boolean z;
        this.zzv.zzc(this.zzu);
        z = this.zzv.zzg;
        if (z) {
            this.zzq.zza(this.zzv);
            this.zzv = new zzafm(this.zzu);
        }
    }

    private final void zzw(boolean z, int i, boolean z2, int i2) throws zzaeg {
        zzjg[] zzjgVarArr;
        this.zzv.zzb(z2 ? 1 : 0);
        this.zzv.zze(i2);
        this.zzu = this.zzu.zzh(z, i);
        this.zzz = false;
        for (zzagp zzh = this.zzr.zzh(); zzh != null; zzh = zzh.zzo()) {
            for (zzjg zzjgVar : zzh.zzq().zzd) {
            }
        }
        if (!zzac()) {
            zzz();
            zzA();
            return;
        }
        int i3 = this.zzu.zze;
        if (i3 == 3) {
            zzy();
            this.zzh.zzf(2);
        } else if (i3 == 2) {
            this.zzh.zzf(2);
        }
    }

    private final void zzx(boolean z) throws zzaeg {
        zzhf zzhfVar = this.zzr.zzh().zzf.zza;
        long zzF = zzF(zzhfVar, this.zzu.zzs, true, false);
        if (zzF != this.zzu.zzs) {
            zzahd zzahdVar = this.zzu;
            this.zzu = zzV(zzhfVar, zzF, zzahdVar.zzc, zzahdVar.zzd, z, 5);
        }
    }

    private final void zzy() throws zzaeg {
        this.zzz = false;
        this.zzn.zza();
        zzahv[] zzahvVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzahv zzahvVar = zzahvVarArr[i];
            if (zzaf(zzahvVar)) {
                zzahvVar.zzah();
            }
        }
    }

    private final void zzz() throws zzaeg {
        this.zzn.zzb();
        zzahv[] zzahvVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzahv zzahvVar = zzahvVarArr[i];
            if (zzaf(zzahvVar)) {
                zzah(zzahvVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:422:0x0867, code lost:
        if (zzM() != false) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x08f6, code lost:
        if (r2 == false) goto L571;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0452 A[Catch: all -> 0x04f0, TryCatch #0 {all -> 0x04f0, blocks: (B:181:0x0448, B:183:0x0452, B:185:0x0457, B:187:0x045e, B:188:0x0461, B:190:0x0468, B:192:0x0472, B:194:0x047a, B:198:0x0482, B:200:0x048c, B:202:0x049c, B:205:0x04a5, B:211:0x04b7, B:215:0x04c1), top: B:572:0x0448 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0816 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x097d A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0989 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x09c8 A[Catch: RuntimeException -> 0x0a72, IOException -> 0x0a9c, zzgj -> 0x0aa4, zzak -> 0x0aac, zzaha -> 0x0ab4, zzey -> 0x0acb, zzaeg -> 0x0ad4, TryCatch #6 {zzaeg -> 0x0ad4, zzaha -> 0x0ab4, zzak -> 0x0aac, zzey -> 0x0acb, zzgj -> 0x0aa4, IOException -> 0x0a9c, RuntimeException -> 0x0a72, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:9:0x001d, B:13:0x0024, B:15:0x0028, B:20:0x0035, B:21:0x003b, B:22:0x0042, B:26:0x0049, B:28:0x0052, B:30:0x0060, B:31:0x0067, B:32:0x0071, B:33:0x0084, B:34:0x009c, B:35:0x00b8, B:37:0x00c7, B:38:0x00cb, B:39:0x00dc, B:41:0x00eb, B:42:0x0107, B:43:0x011a, B:44:0x0123, B:46:0x0135, B:47:0x0141, B:48:0x0151, B:50:0x015d, B:53:0x0168, B:54:0x016f, B:55:0x017c, B:59:0x0183, B:61:0x018b, B:63:0x018f, B:65:0x0194, B:67:0x019c, B:69:0x01a4, B:70:0x01a7, B:72:0x01ac, B:79:0x01b9, B:80:0x01ba, B:84:0x01c1, B:86:0x01cf, B:87:0x01d2, B:88:0x01d7, B:90:0x01e7, B:91:0x01ea, B:92:0x01ef, B:94:0x0206, B:96:0x020a, B:98:0x0218, B:102:0x0222, B:104:0x0227, B:106:0x022d, B:110:0x0235, B:112:0x023d, B:114:0x0260, B:118:0x0269, B:120:0x028b, B:121:0x028e, B:122:0x0291, B:124:0x0295, B:126:0x02a5, B:128:0x02ab, B:129:0x02af, B:131:0x02b3, B:132:0x02b8, B:133:0x02bd, B:137:0x02de, B:139:0x02e9, B:134:0x02c1, B:136:0x02cb, B:140:0x02f6, B:142:0x0302, B:143:0x030e, B:145:0x031a, B:147:0x0342, B:148:0x0362, B:149:0x0367, B:150:0x0379, B:157:0x0384, B:158:0x0385, B:159:0x038c, B:160:0x0394, B:161:0x03a9, B:163:0x03cb, B:223:0x04e2, B:208:0x04b2, B:207:0x04ae, B:228:0x04f5, B:229:0x0506, B:165:0x03f2, B:169:0x0406, B:171:0x0416, B:173:0x042d, B:175:0x0436, B:230:0x0507, B:232:0x0515, B:235:0x051f, B:237:0x052e, B:239:0x053a, B:241:0x0569, B:242:0x0570, B:243:0x0574, B:245:0x0578, B:247:0x0585, B:316:0x0696, B:318:0x069e, B:320:0x06a6, B:323:0x06ab, B:324:0x06b7, B:326:0x06bc, B:328:0x06c4, B:332:0x06d5, B:334:0x06db, B:335:0x06f5, B:337:0x06fb, B:339:0x0700, B:341:0x0705, B:343:0x0709, B:345:0x070f, B:347:0x0713, B:349:0x071b, B:351:0x0721, B:353:0x072b, B:356:0x0731, B:357:0x0734, B:250:0x058f, B:252:0x0595, B:255:0x059b, B:258:0x05a6, B:260:0x05ab, B:263:0x05b9, B:265:0x05bf, B:266:0x05c8, B:267:0x05cb, B:269:0x05d3, B:271:0x05e1, B:273:0x05f3, B:275:0x05fd, B:278:0x0607, B:280:0x060f, B:281:0x0612, B:285:0x0619, B:287:0x0623, B:289:0x062d, B:291:0x063e, B:293:0x0644, B:294:0x064f, B:295:0x0652, B:297:0x0658, B:300:0x065d, B:302:0x0662, B:304:0x066a, B:306:0x0670, B:308:0x0676, B:312:0x0684, B:314:0x0690, B:315:0x0693, B:246:0x0582, B:358:0x0781, B:363:0x0790, B:365:0x079a, B:366:0x07a1, B:368:0x07b1, B:369:0x07c6, B:371:0x07cb, B:401:0x0819, B:374:0x07d4, B:376:0x07db, B:380:0x07e4, B:382:0x07ee, B:388:0x07fd, B:390:0x0803, B:400:0x0816, B:403:0x0824, B:405:0x082a, B:409:0x0832, B:411:0x083a, B:413:0x083e, B:414:0x0849, B:416:0x084f, B:469:0x092a, B:472:0x0932, B:474:0x0936, B:476:0x093e, B:478:0x094c, B:479:0x0953, B:480:0x0957, B:482:0x095d, B:484:0x0966, B:487:0x096d, B:488:0x0974, B:489:0x0975, B:491:0x097d, B:492:0x0983, B:494:0x0989, B:498:0x0997, B:500:0x099b, B:504:0x09ab, B:512:0x09c2, B:514:0x09c8, B:515:0x0a23, B:503:0x09a3, B:496:0x0990, B:505:0x09ae, B:509:0x09b5, B:510:0x09bb, B:417:0x0858, B:419:0x085f, B:421:0x0863, B:448:0x08d5, B:450:0x08e0, B:426:0x0870, B:428:0x0874, B:430:0x0886, B:431:0x088c, B:433:0x089a, B:437:0x08a3, B:439:0x08ad, B:445:0x08b8, B:451:0x08e4, B:453:0x08eb, B:455:0x08ef, B:459:0x08f8, B:461:0x0906, B:463:0x090e, B:465:0x0918, B:466:0x091d, B:467:0x0922, B:468:0x0927, B:402:0x081d, B:516:0x0a2b, B:517:0x0a33, B:521:0x0a3a, B:522:0x0a42, B:526:0x0a60), top: B:579:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0819 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzki, com.google.android.gms.internal.ads.zzay] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r49) {
        /*
            Method dump skipped, instructions count: 2914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafp.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zza() {
        this.zzh.zzf(10);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzb(zzahf zzahfVar) {
        this.zzh.zzc(16, zzahfVar).zza();
    }

    public final void zze() {
        this.zzh.zzb(0).zza();
    }

    public final void zzf(boolean z, int i) {
        this.zzh.zzd(1, z ? 1 : 0, i).zza();
    }

    public final void zzg(zzaiq zzaiqVar, int i, long j) {
        this.zzh.zzc(3, new zzafo(zzaiqVar, i, j)).zza();
    }

    public final void zzh() {
        this.zzh.zzb(6).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzahq
    public final synchronized void zzi(zzahs zzahsVar) {
        if (!this.zzw && this.zzi.isAlive()) {
            this.zzh.zzc(14, zzahsVar).zza();
            return;
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzahsVar.zzi(false);
    }

    public final synchronized boolean zzj() {
        if (!this.zzw && this.zzi.isAlive()) {
            this.zzh.zzf(7);
            zzt(new zzfmj(this) { // from class: com.google.android.gms.internal.ads.zzaff
                private final zzafp zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzfmj
                public final Object zza() {
                    return this.zza.zzo();
                }
            }, 500L);
            return this.zzw;
        }
        return true;
    }

    public final Looper zzk() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final void zzl() {
        this.zzh.zzf(22);
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzn(zzhe zzheVar) {
        this.zzh.zzc(8, zzheVar).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zzo() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final /* bridge */ /* synthetic */ void zzp(zzhe zzheVar) {
        this.zzh.zzc(9, zzheVar).zza();
    }

    public final void zzq(List<zzagx> list, int i, long j, zzix zzixVar) {
        this.zzh.zzc(17, new zzafi(list, zzixVar, i, j, null, null)).zza();
    }
}
