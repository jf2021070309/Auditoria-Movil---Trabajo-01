package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzafe extends zzadu {
    private zzahd zzA;
    private int zzB;
    private long zzC;
    private zzix zzD;
    final zzka zzb;
    final zzahi zzc;
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

    public zzafe(zzahv[] zzahvVarArr, zzjz zzjzVar, zzhq zzhqVar, zzafy zzafyVar, zzki zzkiVar, zzcy zzcyVar, boolean z, zzahz zzahzVar, long j, long j2, zzadz zzadzVar, long j3, boolean z2, zzaku zzakuVar, Looper looper, final zzahp zzahpVar, zzahi zzahiVar, byte[] bArr) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzamq.zze;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.15.0] [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        int length = zzahvVarArr.length;
        if (zzahvVarArr == null) {
            throw null;
        }
        this.zzd = zzahvVarArr;
        if (zzjzVar != null) {
            this.zze = zzjzVar;
            this.zzn = zzhqVar;
            this.zzq = zzkiVar;
            this.zzo = zzcyVar;
            this.zzm = true;
            this.zzw = zzahzVar;
            this.zzp = looper;
            this.zzr = zzakuVar;
            this.zzi = new zzalm<>(looper, zzakuVar, new zzalk(zzahpVar) { // from class: com.google.android.gms.internal.ads.zzaej
                private final zzahp zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzahpVar;
                }

                @Override // com.google.android.gms.internal.ads.zzalk
                public final void zza(Object obj, zzale zzaleVar) {
                    zzahj zzahjVar = (zzahj) obj;
                    new zzahk(zzaleVar);
                }
            });
            this.zzj = new CopyOnWriteArraySet<>();
            this.zzl = new ArrayList();
            this.zzD = new zzix(0);
            this.zzb = new zzka(new zzahx[2], new zzjg[2], null, null);
            this.zzk = new zzain();
            zzahh zzahhVar = new zzahh();
            zzahhVar.zzc(1, 2, 12, 13, 14, 15, 16, 17, 18, 19);
            zzahhVar.zzb(28, true);
            zzahhVar.zzd(zzahiVar);
            this.zzc = zzahhVar.zze();
            zzahh zzahhVar2 = new zzahh();
            zzahhVar2.zzd(this.zzc);
            zzahhVar2.zza(3);
            zzahhVar2.zza(9);
            this.zzx = zzahhVar2.zze();
            this.zzy = zzago.zza;
            this.zzz = zzago.zza;
            this.zzB = -1;
            this.zzf = zzakuVar.zza(looper, null);
            this.zzg = new zzafn(this) { // from class: com.google.android.gms.internal.ads.zzaeu
                private final zzafe zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzafn
                public final void zza(zzafm zzafmVar) {
                    this.zza.zzI(zzafmVar);
                }
            };
            this.zzA = zzahd.zza(this.zzb);
            zzcyVar.zzc(zzahpVar, looper);
            this.zzi.zzb(zzcyVar);
            zzkiVar.zze(new Handler(looper), zzcyVar);
            this.zzh = new zzafp(zzahvVarArr, zzjzVar, this.zzb, zzafyVar, zzkiVar, 0, false, zzcyVar, zzahzVar, zzadzVar, 500L, false, looper, zzakuVar, this.zzg, null);
            return;
        }
        throw null;
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
        long j = zzahdVar.zzs;
        zzQ(zzaiqVar, zzhfVar, j);
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0421, code lost:
        if (r4.zzf(zzv(), r40.zza, 0).zzh != false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04b9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzM(final com.google.android.gms.internal.ads.zzahd r41, final int r42, final int r43, boolean r44, boolean r45, final int r46, long r47, int r49) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafe.zzM(com.google.android.gms.internal.ads.zzahd, int, int, boolean, boolean, int, long, int):void");
    }

    private static long zzN(zzahd zzahdVar) {
        zzaip zzaipVar = new zzaip();
        zzain zzainVar = new zzain();
        zzahdVar.zza.zzy(zzahdVar.zzb.zza, zzainVar);
        long j = zzahdVar.zzc;
        if (j == -9223372036854775807L) {
            long j2 = zzahdVar.zza.zzf(zzainVar.zzc, zzaipVar, 0L).zzl;
            return 0L;
        }
        return j;
    }

    private final zzahd zzO(zzahd zzahdVar, zzaiq zzaiqVar, Pair<Object, Long> pair) {
        zzhf zzhfVar;
        zzka zzkaVar;
        int i;
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
        if (i == 0) {
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
            long j = zzd.zzq;
            if (zzd.zzk.equals(zzd.zzb)) {
                j = longValue + max;
            }
            zzc = zzd.zzc(zzhfVar2, longValue, longValue, longValue, max, zzd.zzh, zzd.zzi, zzd.zzj);
            zzc.zzq = j;
        }
        return zzc;
    }

    private final Pair<Object, Long> zzP(zzaiq zzaiqVar, int i, long j) {
        if (zzaiqVar.zzt()) {
            this.zzB = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzC = j;
            return null;
        }
        if (i == -1 || i >= zzaiqVar.zza()) {
            i = zzaiqVar.zze(false);
            long j2 = zzaiqVar.zzf(i, this.zza, 0L).zzl;
            j = zzadx.zza(0L);
        }
        return zzaiqVar.zzv(this.zza, this.zzk, i, zzadx.zzb(j));
    }

    private final long zzQ(zzaiq zzaiqVar, zzhf zzhfVar, long j) {
        zzaiqVar.zzy(zzhfVar.zza, this.zzk);
        return j;
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
            if (zzahdVar2.zzc != -9223372036854775807L) {
                return zzadx.zza(0L) + zzadx.zza(this.zzA.zzc);
            }
            long j = zzahdVar2.zza.zzf(zzv(), this.zza, 0L).zzl;
            return zzadx.zza(0L);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(zzahj zzahjVar) {
        zzahjVar.zzL(this.zzx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzI(final zzafm zzafmVar) {
        this.zzf.zzj(new Runnable(this, zzafmVar) { // from class: com.google.android.gms.internal.ads.zzaez
            private final zzafe zza;
            private final zzafm zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(zzafm zzafmVar) {
        long j;
        boolean z;
        long j2;
        int i = this.zzs - zzafmVar.zzb;
        this.zzs = i;
        boolean z2 = true;
        if (zzafmVar.zzc) {
            this.zzt = zzafmVar.zzd;
            this.zzu = true;
        }
        if (zzafmVar.zze) {
            this.zzv = zzafmVar.zzf;
        }
        if (i == 0) {
            zzaiq zzaiqVar = zzafmVar.zza.zza;
            if (!this.zzA.zza.zzt() && zzaiqVar.zzt()) {
                this.zzB = -1;
                this.zzC = 0L;
            }
            if (!zzaiqVar.zzt()) {
                List<zzaiq> zzs = ((zzaht) zzaiqVar).zzs();
                zzakt.zzd(zzs.size() == this.zzl.size());
                for (int i2 = 0; i2 < zzs.size(); i2++) {
                    this.zzl.get(i2).zzb = zzs.get(i2);
                }
            }
            if (this.zzu) {
                if (zzafmVar.zza.zzb.equals(this.zzA.zzb) && zzafmVar.zza.zzd == this.zzA.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (zzaiqVar.zzt() || zzafmVar.zza.zzb.zzb()) {
                        j2 = zzafmVar.zza.zzd;
                    } else {
                        zzahd zzahdVar = zzafmVar.zza;
                        zzhf zzhfVar = zzahdVar.zzb;
                        j2 = zzahdVar.zzd;
                        zzQ(zzaiqVar, zzhfVar, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzu = false;
            zzM(zzafmVar.zza, 1, this.zzv, false, z, this.zzt, j, -1);
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
            for (int i = size - 1; i >= 0; i--) {
                this.zzl.remove(i);
            }
            this.zzD = this.zzD.zzg(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzagx zzagxVar = new zzagx(list.get(i2), this.zzm);
            arrayList.add(zzagxVar);
            this.zzl.add(i2, new zzafd(zzagxVar.zzb, zzagxVar.zza.zzy()));
        }
        this.zzD = this.zzD.zzf(0, arrayList.size());
        zzaht zzahtVar = new zzaht(this.zzl, this.zzD, null);
        if (zzahtVar.zzt() || zzahtVar.zza() >= 0) {
            int zze = zzahtVar.zze(false);
            zzahd zzO = zzO(this.zzA, zzahtVar, zzP(zzahtVar, zze, -9223372036854775807L));
            int i3 = zzO.zze;
            if (zze != -1 && i3 != 1) {
                i3 = (zzahtVar.zzt() || zze >= zzahtVar.zza()) ? 4 : 2;
            }
            zzahd zze2 = zzO.zze(i3);
            this.zzh.zzq(arrayList, zze, zzadx.zzb(-9223372036854775807L), this.zzD);
            zzM(zze2, 0, 1, false, (this.zzA.zzb.zza.equals(zze2.zzb.zza) || this.zzA.zza.zzt()) ? false : true, 4, zzL(zze2), -1);
            return;
        }
        throw new zzafx(zzahtVar, -1, -9223372036854775807L);
    }

    public final void zzl(boolean z, int i, int i2) {
        zzahd zzahdVar = this.zzA;
        if (zzahdVar.zzl == z && zzahdVar.zzm == i) {
            return;
        }
        this.zzs++;
        zzahd zzh = zzahdVar.zzh(z, i);
        this.zzh.zzf(z, i);
        zzM(zzh, 0, i2, false, false, 5, -9223372036854775807L, -1);
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
    public final void zzp(int i, long j) {
        zzaiq zzaiqVar = this.zzA.zza;
        if (i >= 0 && (zzaiqVar.zzt() || i < zzaiqVar.zza())) {
            this.zzs++;
            if (!zzA()) {
                int i2 = this.zzA.zze != 1 ? 2 : 1;
                int zzv = zzv();
                zzahd zzO = zzO(this.zzA.zze(i2), zzaiqVar, zzP(zzaiqVar, i, j));
                this.zzh.zzg(zzaiqVar, i, zzadx.zzb(j));
                zzM(zzO, 0, 1, true, true, 1, zzL(zzO), zzv);
                return;
            }
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zzafm zzafmVar = new zzafm(this.zzA);
            zzafmVar.zzb(1);
            this.zzg.zza(zzafmVar);
            return;
        }
        throw new zzafx(zzaiqVar, i, j);
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
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(zza).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.15.0] [");
        sb.append(str);
        sb.append("] [");
        sb.append(zza);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
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
        if (!zzA()) {
            zzaiq zzaiqVar = this.zzA.zza;
            if (zzaiqVar.zzt()) {
                return -9223372036854775807L;
            }
            return zzadx.zza(zzaiqVar.zzf(zzv(), this.zza, 0L).zzm);
        }
        zzahd zzahdVar = this.zzA;
        zzhf zzhfVar = zzahdVar.zzb;
        zzahdVar.zza.zzy(zzhfVar.zza, this.zzk);
        return zzadx.zza(this.zzk.zzh(zzhfVar.zzb, zzhfVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzx() {
        return zzadx.zza(zzL(this.zzA));
    }

    public final long zzy() {
        if (!zzA()) {
            if (this.zzA.zza.zzt()) {
                return this.zzC;
            }
            zzahd zzahdVar = this.zzA;
            long j = 0;
            if (zzahdVar.zzk.zzd != zzahdVar.zzb.zzd) {
                return zzadx.zza(zzahdVar.zza.zzf(zzv(), this.zza, 0L).zzm);
            }
            long j2 = zzahdVar.zzq;
            if (this.zzA.zzk.zzb()) {
                zzahd zzahdVar2 = this.zzA;
                zzahdVar2.zza.zzy(zzahdVar2.zzk.zza, this.zzk).zzb(this.zzA.zzk.zzb);
            } else {
                j = j2;
            }
            zzahd zzahdVar3 = this.zzA;
            zzQ(zzahdVar3.zza, zzahdVar3.zzk, j);
            return zzadx.zza(j);
        }
        zzahd zzahdVar4 = this.zzA;
        if (zzahdVar4.zzk.equals(zzahdVar4.zzb)) {
            return zzadx.zza(this.zzA.zzq);
        }
        return zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzz() {
        return zzadx.zza(this.zzA.zzr);
    }
}
