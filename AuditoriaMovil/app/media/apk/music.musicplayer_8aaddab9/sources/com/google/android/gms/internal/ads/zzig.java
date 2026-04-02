package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class zzig implements zzhe, zznx, zzkz, zzle, zzis {
    private static final Map<String, String> zzb;
    private static final zzafv zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzku zzM;
    private final zzko zzN;
    private final Uri zzd;
    private final zzaj zze;
    private final zzff zzf;
    private final zzho zzg;
    private final zzfa zzh;
    private final zzic zzi;
    private final long zzj;
    private final zzhx zzl;
    private zzhd zzq;
    private zzajg zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zzif zzx;
    private zzot zzy;
    private final zzlh zzk = new zzlh("ProgressiveMediaPeriod");
    private final zzakw zzm = new zzakw(zzaku.zza);
    private final Runnable zzn = new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzhy
        private final zzig zza;

        {
            this.zza = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzM();
        }
    };
    private final Runnable zzo = new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzhz
        private final zzig zza;

        {
            this.zza = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzL();
        }
    };
    private final Handler zzp = zzamq.zzh(null);
    private zzie[] zzt = new zzie[0];
    private zzit[] zzs = new zzit[0];
    private long zzH = -9223372036854775807L;
    private long zzF = -1;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD("icy");
        zzaftVar.zzN("application/x-icy");
        zzc = zzaftVar.zzah();
    }

    public zzig(Uri uri, zzaj zzajVar, zzhx zzhxVar, zzff zzffVar, zzfa zzfaVar, zzku zzkuVar, zzho zzhoVar, zzic zzicVar, zzko zzkoVar, String str, int i2, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzajVar;
        this.zzf = zzffVar;
        this.zzh = zzfaVar;
        this.zzM = zzkuVar;
        this.zzg = zzhoVar;
        this.zzi = zzicVar;
        this.zzN = zzkoVar;
        this.zzj = i2;
        this.zzl = zzhxVar;
    }

    private final void zzN(int i2) {
        zzX();
        zzif zzifVar = this.zzx;
        boolean[] zArr = zzifVar.zzd;
        if (zArr[i2]) {
            return;
        }
        zzafv zza = zzifVar.zza.zza(i2).zza(0);
        this.zzg.zzl(zzalt.zzf(zza.zzl), zza, 0, null, this.zzG);
        zArr[i2] = true;
    }

    private final void zzO(int i2) {
        zzX();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i2] && !this.zzs[i2].zzk(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzit zzitVar : this.zzs) {
                zzitVar.zzb(false);
            }
            zzhd zzhdVar = this.zzq;
            Objects.requireNonNull(zzhdVar);
            zzhdVar.zzp(this);
        }
    }

    private final boolean zzP() {
        return this.zzD || zzW();
    }

    private final zzox zzQ(zzie zzieVar) {
        int length = this.zzs.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (zzieVar.equals(this.zzt[i2])) {
                return this.zzs[i2];
            }
        }
        zzko zzkoVar = this.zzN;
        Looper looper = this.zzp.getLooper();
        zzff zzffVar = this.zzf;
        zzfa zzfaVar = this.zzh;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(zzffVar);
        zzit zzitVar = new zzit(zzkoVar, looper, zzffVar, zzfaVar, null);
        zzitVar.zzr(this);
        int i3 = length + 1;
        zzie[] zzieVarArr = (zzie[]) Arrays.copyOf(this.zzt, i3);
        zzieVarArr[length] = zzieVar;
        this.zzt = (zzie[]) zzamq.zze(zzieVarArr);
        zzit[] zzitVarArr = (zzit[]) Arrays.copyOf(this.zzs, i3);
        zzitVarArr[length] = zzitVar;
        this.zzs = (zzit[]) zzamq.zze(zzitVarArr);
        return zzitVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzR */
    public final void zzM() {
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zzit zzitVar : this.zzs) {
            if (zzitVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzb();
        int length = this.zzs.length;
        zzq[] zzqVarArr = new zzq[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzafv zzh = this.zzs[i2].zzh();
            Objects.requireNonNull(zzh);
            String str = zzh.zzl;
            boolean zza = zzalt.zza(str);
            boolean z = zza || zzalt.zzb(str);
            zArr[i2] = z;
            this.zzw = z | this.zzw;
            zzajg zzajgVar = this.zzr;
            if (zzajgVar != null) {
                if (zza || this.zzt[i2].zzb) {
                    zzaiv zzaivVar = zzh.zzj;
                    zzaiv zzaivVar2 = zzaivVar == null ? new zzaiv(zzajgVar) : zzaivVar.zzd(zzajgVar);
                    zzaft zza2 = zzh.zza();
                    zza2.zzL(zzaivVar2);
                    zzh = zza2.zzah();
                }
                if (zza && zzh.zzf == -1 && zzh.zzg == -1 && zzajgVar.zza != -1) {
                    zzaft zza3 = zzh.zza();
                    zza3.zzI(zzajgVar.zza);
                    zzh = zza3.zzah();
                }
            }
            zzqVarArr[i2] = new zzq(zzh.zzb(this.zzf.zza(zzh)));
        }
        this.zzx = new zzif(new zzs(zzqVarArr), zArr);
        this.zzv = true;
        zzhd zzhdVar = this.zzq;
        Objects.requireNonNull(zzhdVar);
        zzhdVar.zzn(this);
    }

    private final void zzS(zzib zzibVar) {
        if (this.zzF == -1) {
            this.zzF = zzib.zzf(zzibVar);
        }
    }

    private final void zzT() {
        zzib zzibVar = new zzib(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzakt.zzd(zzW());
            long j2 = this.zzz;
            if (j2 != -9223372036854775807L && this.zzH > j2) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzot zzotVar = this.zzy;
            Objects.requireNonNull(zzotVar);
            zzib.zzi(zzibVar, zzotVar.zzf(this.zzH).zza.zzc, this.zzH);
            for (zzit zzitVar : this.zzs) {
                zzitVar.zzc(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzU();
        long zzh = this.zzk.zzh(zzibVar, this, zzku.zza(this.zzB));
        zzan zze = zzib.zze(zzibVar);
        this.zzg.zzd(new zzgx(zzib.zzb(zzibVar), zze, zze.zza, Collections.emptyMap(), zzh, 0L, 0L), 1, -1, null, 0, null, zzib.zzd(zzibVar), this.zzz);
    }

    private final int zzU() {
        int i2 = 0;
        for (zzit zzitVar : this.zzs) {
            i2 += zzitVar.zzd();
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzV() {
        long j2 = Long.MIN_VALUE;
        for (zzit zzitVar : this.zzs) {
            j2 = Math.max(j2, zzitVar.zzi());
        }
        return j2;
    }

    private final boolean zzW() {
        return this.zzH != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzX() {
        zzakt.zzd(this.zzv);
        Objects.requireNonNull(this.zzx);
        Objects.requireNonNull(this.zzy);
    }

    public final int zzA(int i2, long j2) {
        if (zzP()) {
            return 0;
        }
        zzN(i2);
        zzit zzitVar = this.zzs[i2];
        int zzn = zzitVar.zzn(j2, this.zzK);
        zzitVar.zzo(zzn);
        if (zzn == 0) {
            zzO(i2);
            return 0;
        }
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final zzox zzB(int i2, int i3) {
        return zzQ(new zzie(i2, false));
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final void zzD(final zzot zzotVar) {
        this.zzp.post(new Runnable(this, zzotVar) { // from class: com.google.android.gms.internal.ads.zzia
            private final zzig zza;
            private final zzot zzb;

            {
                this.zza = this;
                this.zzb = zzotVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK(this.zzb);
            }
        });
    }

    public final zzox zzE() {
        return zzQ(new zzie(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public final void zzF(zzafv zzafvVar) {
        this.zzp.post(this.zzn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    @Override // com.google.android.gms.internal.ads.zzkz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzla zzH(com.google.android.gms.internal.ads.zzlc r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzig.zzH(com.google.android.gms.internal.ads.zzlc, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzla");
    }

    @Override // com.google.android.gms.internal.ads.zzkz
    public final /* bridge */ /* synthetic */ void zzI(zzlc zzlcVar, long j2, long j3, boolean z) {
        zzib zzibVar = (zzib) zzlcVar;
        zzlp zzc2 = zzib.zzc(zzibVar);
        zzgx zzgxVar = new zzgx(zzib.zzb(zzibVar), zzib.zze(zzibVar), zzc2.zzc(), zzc2.zzd(), j2, j3, zzc2.zzb());
        zzib.zzb(zzibVar);
        this.zzg.zzh(zzgxVar, 1, -1, null, 0, null, zzib.zzd(zzibVar), this.zzz);
        if (z) {
            return;
        }
        zzS(zzibVar);
        for (zzit zzitVar : this.zzs) {
            zzitVar.zzb(false);
        }
        if (this.zzE > 0) {
            zzhd zzhdVar = this.zzq;
            Objects.requireNonNull(zzhdVar);
            zzhdVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkz
    public final /* bridge */ /* synthetic */ void zzJ(zzlc zzlcVar, long j2, long j3) {
        zzot zzotVar;
        if (this.zzz == -9223372036854775807L && (zzotVar = this.zzy) != null) {
            boolean zze = zzotVar.zze();
            long zzV = zzV();
            long j4 = zzV == Long.MIN_VALUE ? 0L : zzV + AbstractComponentTracker.LINGERING_TIMEOUT;
            this.zzz = j4;
            this.zzi.zzb(j4, zze, this.zzA);
        }
        zzib zzibVar = (zzib) zzlcVar;
        zzlp zzc2 = zzib.zzc(zzibVar);
        zzgx zzgxVar = new zzgx(zzib.zzb(zzibVar), zzib.zze(zzibVar), zzc2.zzc(), zzc2.zzd(), j2, j3, zzc2.zzb());
        zzib.zzb(zzibVar);
        this.zzg.zzf(zzgxVar, 1, -1, null, 0, null, zzib.zzd(zzibVar), this.zzz);
        zzS(zzibVar);
        this.zzK = true;
        zzhd zzhdVar = this.zzq;
        Objects.requireNonNull(zzhdVar);
        zzhdVar.zzp(this);
    }

    public final /* synthetic */ void zzK(zzot zzotVar) {
        this.zzy = this.zzr == null ? zzotVar : new zzos(-9223372036854775807L, 0L);
        this.zzz = zzotVar.zzg();
        boolean z = false;
        if (this.zzF == -1 && zzotVar.zzg() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zzb(this.zzz, zzotVar.zze(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzM();
    }

    public final /* synthetic */ void zzL() {
        if (this.zzL) {
            return;
        }
        zzhd zzhdVar = this.zzq;
        Objects.requireNonNull(zzhdVar);
        zzhdVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzb(zzhd zzhdVar, long j2) {
        this.zzq = zzhdVar;
        this.zzm.zza();
        zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzc() throws IOException {
        zzy();
        if (this.zzK && !this.zzv) {
            throw zzaha.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final zzs zzd() {
        zzX();
        return this.zzx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zze(long j2, boolean z) {
        zzX();
        if (zzW()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.zzs[i2].zzp(j2, false, zArr[i2]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final void zzf(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzg() {
        if (this.zzD) {
            if (this.zzK || zzU() > this.zzJ) {
                this.zzD = false;
                return this.zzG;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        long j2;
        zzX();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzK) {
            return Long.MIN_VALUE;
        }
        if (zzW()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.zzs[i2].zzj()) {
                    j2 = Math.min(j2, this.zzs[i2].zzi());
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = zzV();
        }
        return j2 == Long.MIN_VALUE ? this.zzG : j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzi(long j2) {
        int i2;
        zzX();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zze()) {
            j2 = 0;
        }
        this.zzD = false;
        this.zzG = j2;
        if (zzW()) {
            this.zzH = j2;
            return j2;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            while (i2 < length) {
                i2 = (this.zzs[i2].zzm(j2, false) || (!zArr[i2] && this.zzw)) ? i2 + 1 : 0;
            }
            return j2;
        }
        this.zzI = false;
        this.zzH = j2;
        this.zzK = false;
        if (this.zzk.zzi()) {
            for (zzit zzitVar : this.zzs) {
                zzitVar.zzq();
            }
            this.zzk.zzj();
        } else {
            this.zzk.zzg();
            for (zzit zzitVar2 : this.zzs) {
                zzitVar2.zzb(false);
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzj(long j2, zzahz zzahzVar) {
        zzX();
        if (this.zzy.zze()) {
            zzor zzf = this.zzy.zzf(j2);
            long j3 = zzf.zza.zzb;
            long j4 = zzf.zzb.zzb;
            long j5 = zzahzVar.zzf;
            if (j5 == 0 && zzahzVar.zzg == 0) {
                return j2;
            }
            long zzB = zzamq.zzB(j2, j5, Long.MIN_VALUE);
            long zzA = zzamq.zzA(j2, zzahzVar.zzg, Long.MAX_VALUE);
            boolean z = true;
            boolean z2 = zzB <= j3 && j3 <= zzA;
            z = (zzB > j4 || j4 > zzA) ? false : false;
            if (z2 && z) {
                if (Math.abs(j3 - j2) > Math.abs(j4 - j2)) {
                    return j4;
                }
            } else if (!z2) {
                return z ? j4 : zzB;
            }
            return j3;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        if (this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j2) {
        if (this.zzK || this.zzk.zzf() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zza = this.zzm.zza();
        if (this.zzk.zzi()) {
            return zza;
        }
        zzT();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzm() {
        return this.zzk.zzi() && this.zzm.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzq(zzjg[] zzjgVarArr, boolean[] zArr, zziu[] zziuVarArr, boolean[] zArr2, long j2) {
        zzjg zzjgVar;
        int i2;
        zzX();
        zzif zzifVar = this.zzx;
        zzs zzsVar = zzifVar.zza;
        boolean[] zArr3 = zzifVar.zzc;
        int i3 = this.zzE;
        int i4 = 0;
        for (int i5 = 0; i5 < zzjgVarArr.length; i5++) {
            zziu zziuVar = zziuVarArr[i5];
            if (zziuVar != null && (zzjgVarArr[i5] == null || !zArr[i5])) {
                i2 = ((zzid) zziuVar).zzb;
                zzakt.zzd(zArr3[i2]);
                this.zzE--;
                zArr3[i2] = false;
                zziuVarArr[i5] = null;
            }
        }
        boolean z = !this.zzC ? j2 == 0 : i3 != 0;
        for (int i6 = 0; i6 < zzjgVarArr.length; i6++) {
            if (zziuVarArr[i6] == null && (zzjgVar = zzjgVarArr[i6]) != null) {
                zzakt.zzd(zzjgVar.zzc() == 1);
                zzakt.zzd(zzjgVar.zze(0) == 0);
                int zzb2 = zzsVar.zzb(zzjgVar.zzb());
                zzakt.zzd(!zArr3[zzb2]);
                this.zzE++;
                zArr3[zzb2] = true;
                zziuVarArr[i6] = new zzid(this, zzb2);
                zArr2[i6] = true;
                if (!z) {
                    zzit zzitVar = this.zzs[zzb2];
                    z = (zzitVar.zzm(j2, true) || zzitVar.zzg() == 0) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zzi()) {
                zzit[] zzitVarArr = this.zzs;
                int length = zzitVarArr.length;
                while (i4 < length) {
                    zzitVarArr[i4].zzq();
                    i4++;
                }
                this.zzk.zzj();
            } else {
                for (zzit zzitVar2 : this.zzs) {
                    zzitVar2.zzb(false);
                }
            }
        } else if (z) {
            j2 = zzi(j2);
            while (i4 < zziuVarArr.length) {
                if (zziuVarArr[i4] != null) {
                    zArr2[i4] = true;
                }
                i4++;
            }
        }
        this.zzC = true;
        return j2;
    }

    public final void zzu() {
        if (this.zzv) {
            for (zzit zzitVar : this.zzs) {
                zzitVar.zze();
            }
        }
        this.zzk.zzk(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzv() {
        for (zzit zzitVar : this.zzs) {
            zzitVar.zza();
        }
        this.zzl.zzb();
    }

    public final boolean zzw(int i2) {
        return !zzP() && this.zzs[i2].zzk(this.zzK);
    }

    public final void zzx(int i2) throws IOException {
        this.zzs[i2].zzf();
        zzy();
    }

    public final void zzy() throws IOException {
        this.zzk.zzl(zzku.zza(this.zzB));
    }

    public final int zzz(int i2, zzafw zzafwVar, zzaf zzafVar, int i3) {
        if (zzP()) {
            return -3;
        }
        zzN(i2);
        int zzl = this.zzs[i2].zzl(zzafwVar, zzafVar, i3, this.zzK);
        if (zzl == -3) {
            zzO(i2);
        }
        return zzl;
    }
}
