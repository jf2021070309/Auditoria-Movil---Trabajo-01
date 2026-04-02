package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class zzafe extends zzadu {
    private zzahd zzA;
    private int zzB;
    private long zzC;
    private zzix zzD;
    public final zzka zzb;
    public final zzahi zzc;
    private final zzahv[] zzd;
    private final zzjz zze;
    private final zzalg zzf;
    private final zzafn zzg;
    private final zzafp zzh;
    private final zzalm<zzahj> zzi;
    private final CopyOnWriteArraySet<zzaeh> zzj;
    private final zzain zzk;
    private final List<zzafd> zzl;
    private final boolean zzm;
    private final zzhq zzn;
    private final zzcy zzo;
    private final Looper zzp;
    private final zzki zzq;
    private final zzaku zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private int zzv;
    private zzahz zzw;
    private zzahi zzx;
    private zzago zzy;
    private zzago zzz;

    @SuppressLint({"HandlerLeak"})
    public zzafe(zzahv[] zzahvVarArr, zzjz zzjzVar, zzhq zzhqVar, zzafy zzafyVar, zzki zzkiVar, zzcy zzcyVar, boolean z, zzahz zzahzVar, long j2, long j3, zzadz zzadzVar, long j4, boolean z2, zzaku zzakuVar, Looper looper, final zzahp zzahpVar, zzahi zzahiVar, byte[] bArr) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzamq.zze;
        String.valueOf(hexString).length();
        String.valueOf(str).length();
        int length = zzahvVarArr.length;
        this.zzd = zzahvVarArr;
        Objects.requireNonNull(zzjzVar);
        this.zze = zzjzVar;
        this.zzn = zzhqVar;
        this.zzq = zzkiVar;
        this.zzo = zzcyVar;
        this.zzm = true;
        this.zzw = zzahzVar;
        this.zzp = looper;
        this.zzr = zzakuVar;
        zzalm<zzahj> zzalmVar = new zzalm<>(looper, zzakuVar, new zzalk(zzahpVar) { // from class: com.google.android.gms.internal.ads.zzaej
            private final zzahp zza;

            {
                this.zza = zzahpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalk
            public final void zza(Object obj, zzale zzaleVar) {
                zzahj zzahjVar = (zzahj) obj;
                new zzahk(zzaleVar);
            }
        });
        this.zzi = zzalmVar;
        this.zzj = new CopyOnWriteArraySet<>();
        this.zzl = new ArrayList();
        this.zzD = new zzix(0);
        zzka zzkaVar = new zzka(new zzahx[2], new zzjg[2], null, null);
        this.zzb = zzkaVar;
        this.zzk = new zzain();
        zzahh zzahhVar = new zzahh();
        zzahhVar.zzc(1, 2, 12, 13, 14, 15, 16, 17, 18, 19);
        zzahhVar.zzb(28, true);
        zzahhVar.zzd(zzahiVar);
        zzahi zze = zzahhVar.zze();
        this.zzc = zze;
        zzahh zzahhVar2 = new zzahh();
        zzahhVar2.zzd(zze);
        zzahhVar2.zza(3);
        zzahhVar2.zza(9);
        this.zzx = zzahhVar2.zze();
        zzago zzagoVar = zzago.zza;
        this.zzy = zzagoVar;
        this.zzz = zzagoVar;
        this.zzB = -1;
        this.zzf = zzakuVar.zza(looper, null);
        zzafn zzafnVar = new zzafn(this) { // from class: com.google.android.gms.internal.ads.zzaeu
            private final zzafe zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzafn
            public final void zza(zzafm zzafmVar) {
                this.zza.zzI(zzafmVar);
            }
        };
        this.zzg = zzafnVar;
        this.zzA = zzahd.zza(zzkaVar);
        zzcyVar.zzc(zzahpVar, looper);
        zzalmVar.zzb(zzcyVar);
        zzkiVar.zze(new Handler(looper), zzcyVar);
        this.zzh = new zzafp(zzahvVarArr, zzjzVar, zzkaVar, zzafyVar, zzkiVar, 0, false, zzcyVar, zzahzVar, zzadzVar, 500L, false, looper, zzakuVar, zzafnVar, null);
    }

    private final int zzK() {
        if (this.zzA.zza.zzt()) {
            return this.zzB;
        }
        zzahd zzahdVar = this.zzA;
        return zzahdVar.zza.zzy(zzahdVar.zzb.zza, this.zzk).zzc;
    }

    private final long zzL(zzahd zzahdVar) {
        if (zzahdVar.zza.zzt()) {
            return zzadx.zzb(this.zzC);
        }
        if (zzahdVar.zzb.zzb()) {
            return zzahdVar.zzs;
        }
        zzaiq zzaiqVar = zzahdVar.zza;
        zzhf zzhfVar = zzahdVar.zzb;
        long j2 = zzahdVar.zzs;
        zzQ(zzaiqVar, zzhfVar, j2);
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x041e, code lost:
        if (r4.zzf(zzv(), r40.zza, 0).zzh != false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04b6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzM(final com.google.android.gms.internal.ads.zzahd r41, final int r42, final int r43, boolean r44, boolean r45, final int r46, long r47, int r49) {
        /*
            Method dump skipped, instructions count: 1207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafe.zzM(com.google.android.gms.internal.ads.zzahd, int, int, boolean, boolean, int, long, int):void");
    }

    private static long zzN(zzahd zzahdVar) {
        zzaip zzaipVar = new zzaip();
        zzain zzainVar = new zzain();
        zzahdVar.zza.zzy(zzahdVar.zzb.zza, zzainVar);
        long j2 = zzahdVar.zzc;
        if (j2 == -9223372036854775807L) {
            long j3 = zzahdVar.zza.zzf(zzainVar.zzc, zzaipVar, 0L).zzl;
            return 0L;
        }
        return j2;
    }

    private final zzahd zzO(zzahd zzahdVar, zzaiq zzaiqVar, Pair<Object, Long> pair) {
        zzhf zzhfVar;
        zzka zzkaVar;
        zzahd zzc;
        zzakt.zza(zzaiqVar.zzt() || pair != null);
        zzaiq zzaiqVar2 = zzahdVar.zza;
        zzahd zzd = zzahdVar.zzd(zzaiqVar);
        if (zzaiqVar.zzt()) {
            zzhf zzb = zzahd.zzb();
            long zzb2 = zzadx.zzb(this.zzC);
            zzahd zzg = zzd.zzc(zzb, zzb2, zzb2, zzb2, 0L, zzs.zza, this.zzb, zzfoj.zzi()).zzg(zzb);
            zzg.zzq = zzg.zzs;
            return zzg;
        }
        Object obj = zzd.zzb.zza;
        int i2 = zzamq.zza;
        boolean z = !obj.equals(pair.first);
        zzhf zzhfVar2 = z ? new zzhf(pair.first) : zzd.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzb3 = zzadx.zzb(zzD());
        if (!zzaiqVar2.zzt()) {
            zzaiqVar2.zzy(obj, this.zzk);
        }
        if (z || longValue < zzb3) {
            zzakt.zzd(!zzhfVar2.zzb());
            zzs zzsVar = z ? zzs.zza : zzd.zzh;
            if (z) {
                zzhfVar = zzhfVar2;
                zzkaVar = this.zzb;
            } else {
                zzhfVar = zzhfVar2;
                zzkaVar = zzd.zzi;
            }
            zzahd zzg2 = zzd.zzc(zzhfVar, longValue, longValue, longValue, 0L, zzsVar, zzkaVar, z ? zzfoj.zzi() : zzd.zzj).zzg(zzhfVar);
            zzg2.zzq = longValue;
            return zzg2;
        }
        if (longValue == zzb3) {
            int zzi = zzaiqVar.zzi(zzd.zzk.zza);
            if (zzi != -1 && zzaiqVar.zzh(zzi, this.zzk, false).zzc == zzaiqVar.zzy(zzhfVar2.zza, this.zzk).zzc) {
                return zzd;
            }
            zzaiqVar.zzy(zzhfVar2.zza, this.zzk);
            long zzh = zzhfVar2.zzb() ? this.zzk.zzh(zzhfVar2.zzb, zzhfVar2.zzc) : this.zzk.zzd;
            zzc = zzd.zzc(zzhfVar2, zzd.zzs, zzd.zzs, zzd.zzd, zzh - zzd.zzs, zzd.zzh, zzd.zzi, zzd.zzj).zzg(zzhfVar2);
            zzc.zzq = zzh;
        } else {
            zzakt.zzd(!zzhfVar2.zzb());
            long max = Math.max(0L, zzd.zzr - (longValue - zzb3));
            long j2 = zzd.zzq;
            if (zzd.zzk.equals(zzd.zzb)) {
                j2 = longValue + max;
            }
            zzc = zzd.zzc(zzhfVar2, longValue, longValue, longValue, max, zzd.zzh, zzd.zzi, zzd.zzj);
            zzc.zzq = j2;
        }
        return zzc;
    }

    private final Pair<Object, Long> zzP(zzaiq zzaiqVar, int i2, long j2) {
        if (zzaiqVar.zzt()) {
            this.zzB = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.zzC = j2;
            return null;
        }
        if (i2 == -1 || i2 >= zzaiqVar.zza()) {
            i2 = zzaiqVar.zze(false);
            long j3 = zzaiqVar.zzf(i2, this.zza, 0L).zzl;
            j2 = zzadx.zza(0L);
        }
        return zzaiqVar.zzv(this.zza, this.zzk, i2, zzadx.zzb(j2));
    }

    private final long zzQ(zzaiq zzaiqVar, zzhf zzhfVar, long j2) {
        zzaiqVar.zzy(zzhfVar.zza, this.zzk);
        return j2;
    }

    private static boolean zzR(zzahd zzahdVar) {
        return zzahdVar.zze == 3 && zzahdVar.zzl && zzahdVar.zzm == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final boolean zzA() {
        return this.zzA.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzB() {
        if (zzA()) {
            return this.zzA.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzC() {
        if (zzA()) {
            return this.zzA.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzD() {
        if (zzA()) {
            zzahd zzahdVar = this.zzA;
            zzahdVar.zza.zzy(zzahdVar.zzb.zza, this.zzk);
            zzahd zzahdVar2 = this.zzA;
            if (zzahdVar2.zzc == -9223372036854775807L) {
                long j2 = zzahdVar2.zza.zzf(zzv(), this.zza, 0L).zzl;
                return zzadx.zza(0L);
            }
            return zzadx.zza(0L) + zzadx.zza(this.zzA.zzc);
        }
        return zzx();
    }

    public final int zzE() {
        int length = this.zzd.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final zzaiq zzF() {
        return this.zzA.zza;
    }

    public final /* synthetic */ void zzG(zzahj zzahjVar) {
        zzahjVar.zzL(this.zzx);
    }

    public final /* synthetic */ void zzI(final zzafm zzafmVar) {
        this.zzf.zzj(new Runnable(this, zzafmVar) { // from class: com.google.android.gms.internal.ads.zzaez
            private final zzafe zza;
            private final zzafm zzb;

            {
                this.zza = this;
                this.zzb = zzafmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzJ(this.zzb);
            }
        });
    }

    public final /* synthetic */ void zzJ(zzafm zzafmVar) {
        long j2;
        boolean z;
        long j3;
        int i2 = this.zzs - zzafmVar.zzb;
        this.zzs = i2;
        boolean z2 = true;
        if (zzafmVar.zzc) {
            this.zzt = zzafmVar.zzd;
            this.zzu = true;
        }
        if (zzafmVar.zze) {
            this.zzv = zzafmVar.zzf;
        }
        if (i2 == 0) {
            zzaiq zzaiqVar = zzafmVar.zza.zza;
            if (!this.zzA.zza.zzt() && zzaiqVar.zzt()) {
                this.zzB = -1;
                this.zzC = 0L;
            }
            if (!zzaiqVar.zzt()) {
                List<zzaiq> zzs = ((zzaht) zzaiqVar).zzs();
                zzakt.zzd(zzs.size() == this.zzl.size());
                for (int i3 = 0; i3 < zzs.size(); i3++) {
                    this.zzl.get(i3).zzb = zzs.get(i3);
                }
            }
            if (this.zzu) {
                if (zzafmVar.zza.zzb.equals(this.zzA.zzb) && zzafmVar.zza.zzd == this.zzA.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (zzaiqVar.zzt() || zzafmVar.zza.zzb.zzb()) {
                        j3 = zzafmVar.zza.zzd;
                    } else {
                        zzahd zzahdVar = zzafmVar.zza;
                        zzhf zzhfVar = zzahdVar.zzb;
                        j3 = zzahdVar.zzd;
                        zzQ(zzaiqVar, zzhfVar, j3);
                    }
                    z = z2;
                    j2 = j3;
                } else {
                    j2 = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j2 = -9223372036854775807L;
                z = false;
            }
            this.zzu = false;
            zzM(zzafmVar.zza, 1, this.zzv, false, z, this.zzt, j2, -1);
        }
    }

    public final boolean zze() {
        return this.zzA.zzp;
    }

    public final Looper zzf() {
        return this.zzp;
    }

    public final void zzg(zzahj zzahjVar) {
        this.zzi.zzb(zzahjVar);
    }

    public final void zzh(zzaeh zzaehVar) {
        this.zzj.add(zzaehVar);
    }

    public final int zzi() {
        return this.zzA.zze;
    }

    public final void zzj() {
        zzahd zzahdVar = this.zzA;
        if (zzahdVar.zze != 1) {
            return;
        }
        zzahd zzf = zzahdVar.zzf(null);
        zzahd zze = zzf.zze(true != zzf.zza.zzt() ? 2 : 4);
        this.zzs++;
        this.zzh.zze();
        zzM(zze, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void zzk(List<zzhh> list, boolean z) {
        zzK();
        zzx();
        this.zzs++;
        if (!this.zzl.isEmpty()) {
            int size = this.zzl.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                this.zzl.remove(i2);
            }
            this.zzD = this.zzD.zzg(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzagx zzagxVar = new zzagx(list.get(i3), this.zzm);
            arrayList.add(zzagxVar);
            this.zzl.add(i3, new zzafd(zzagxVar.zzb, zzagxVar.zza.zzy()));
        }
        this.zzD = this.zzD.zzf(0, arrayList.size());
        zzaht zzahtVar = new zzaht(this.zzl, this.zzD, null);
        if (!zzahtVar.zzt() && zzahtVar.zza() < 0) {
            throw new zzafx(zzahtVar, -1, -9223372036854775807L);
        }
        int zze = zzahtVar.zze(false);
        zzahd zzO = zzO(this.zzA, zzahtVar, zzP(zzahtVar, zze, -9223372036854775807L));
        int i4 = zzO.zze;
        if (zze != -1 && i4 != 1) {
            i4 = (zzahtVar.zzt() || zze >= zzahtVar.zza()) ? 4 : 2;
        }
        zzahd zze2 = zzO.zze(i4);
        this.zzh.zzq(arrayList, zze, zzadx.zzb(-9223372036854775807L), this.zzD);
        zzM(zze2, 0, 1, false, (this.zzA.zzb.zza.equals(zze2.zzb.zza) || this.zzA.zza.zzt()) ? false : true, 4, zzL(zze2), -1);
    }

    public final void zzl(boolean z, int i2, int i3) {
        zzahd zzahdVar = this.zzA;
        if (zzahdVar.zzl == z && zzahdVar.zzm == i2) {
            return;
        }
        this.zzs++;
        zzahd zzh = zzahdVar.zzh(z, i2);
        this.zzh.zzf(z, i2);
        zzM(zzh, 0, i3, false, false, 5, -9223372036854775807L, -1);
    }

    public final boolean zzm() {
        return this.zzA.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzn() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final boolean zzo() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final void zzp(int i2, long j2) {
        zzaiq zzaiqVar = this.zzA.zza;
        if (i2 < 0 || (!zzaiqVar.zzt() && i2 >= zzaiqVar.zza())) {
            throw new zzafx(zzaiqVar, i2, j2);
        }
        this.zzs++;
        if (zzA()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zzafm zzafmVar = new zzafm(this.zzA);
            zzafmVar.zzb(1);
            this.zzg.zza(zzafmVar);
            return;
        }
        int i3 = this.zzA.zze != 1 ? 2 : 1;
        int zzv = zzv();
        zzahd zzO = zzO(this.zzA.zze(i3), zzaiqVar, zzP(zzaiqVar, i2, j2));
        this.zzh.zzg(zzaiqVar, i2, zzadx.zzb(j2));
        zzM(zzO, 0, 1, true, true, 1, zzL(zzO), zzv);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final void zzq(boolean z) {
        throw null;
    }

    public final void zzr(boolean z, zzaeg zzaegVar) {
        zzahd zzahdVar = this.zzA;
        zzahd zzg = zzahdVar.zzg(zzahdVar.zzb);
        zzg.zzq = zzg.zzs;
        zzg.zzr = 0L;
        zzahd zze = zzg.zze(1);
        if (zzaegVar != null) {
            zze = zze.zzf(zzaegVar);
        }
        zzahd zzahdVar2 = zze;
        this.zzs++;
        this.zzh.zzh();
        zzM(zzahdVar2, 0, 1, false, zzahdVar2.zza.zzt() && !this.zzA.zza.zzt(), 4, zzL(zzahdVar2), -1);
    }

    public final void zzs() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzamq.zze;
        String zza = zzafq.zza();
        String.valueOf(hexString).length();
        String.valueOf(str).length();
        String.valueOf(zza).length();
        if (!this.zzh.zzj()) {
            zzalm<zzahj> zzalmVar = this.zzi;
            zzalmVar.zzd(10, zzafa.zza);
            zzalmVar.zze();
        }
        this.zzi.zzf();
        this.zzf.zzi(null);
        zzcy zzcyVar = this.zzo;
        if (zzcyVar != null) {
            this.zzq.zzf(zzcyVar);
        }
        zzahd zze = this.zzA.zze(1);
        this.zzA = zze;
        zzahd zzg = zze.zzg(zze.zzb);
        this.zzA = zzg;
        zzg.zzq = zzg.zzs;
        this.zzA.zzr = 0L;
    }

    public final zzahs zzt(zzahr zzahrVar) {
        return new zzahs(this.zzh, zzahrVar, this.zzA.zza, zzv(), this.zzr, this.zzh.zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzu() {
        if (this.zzA.zza.zzt()) {
            return 0;
        }
        zzahd zzahdVar = this.zzA;
        return zzahdVar.zza.zzi(zzahdVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzv() {
        int zzK = zzK();
        if (zzK == -1) {
            return 0;
        }
        return zzK;
    }

    public final long zzw() {
        if (zzA()) {
            zzahd zzahdVar = this.zzA;
            zzhf zzhfVar = zzahdVar.zzb;
            zzahdVar.zza.zzy(zzhfVar.zza, this.zzk);
            return zzadx.zza(this.zzk.zzh(zzhfVar.zzb, zzhfVar.zzc));
        }
        zzaiq zzaiqVar = this.zzA.zza;
        if (zzaiqVar.zzt()) {
            return -9223372036854775807L;
        }
        return zzadx.zza(zzaiqVar.zzf(zzv(), this.zza, 0L).zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzx() {
        return zzadx.zza(zzL(this.zzA));
    }

    public final long zzy() {
        if (zzA()) {
            zzahd zzahdVar = this.zzA;
            return zzahdVar.zzk.equals(zzahdVar.zzb) ? zzadx.zza(this.zzA.zzq) : zzw();
        } else if (this.zzA.zza.zzt()) {
            return this.zzC;
        } else {
            zzahd zzahdVar2 = this.zzA;
            long j2 = 0;
            if (zzahdVar2.zzk.zzd != zzahdVar2.zzb.zzd) {
                return zzadx.zza(zzahdVar2.zza.zzf(zzv(), this.zza, 0L).zzm);
            }
            long j3 = zzahdVar2.zzq;
            if (this.zzA.zzk.zzb()) {
                zzahd zzahdVar3 = this.zzA;
                zzahdVar3.zza.zzy(zzahdVar3.zzk.zza, this.zzk).zzb(this.zzA.zzk.zzb);
            } else {
                j2 = j3;
            }
            zzahd zzahdVar4 = this.zzA;
            zzQ(zzahdVar4.zza, zzahdVar4.zzk, j2);
            return zzadx.zza(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzz() {
        return zzadx.zza(this.zzA.zzr);
    }
}
