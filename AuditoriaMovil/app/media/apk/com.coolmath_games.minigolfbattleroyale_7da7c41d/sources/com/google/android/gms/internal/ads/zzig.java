package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

        /* JADX INFO: Access modifiers changed from: package-private */
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

        /* JADX INFO: Access modifiers changed from: package-private */
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

    public zzig(Uri uri, zzaj zzajVar, zzhx zzhxVar, zzff zzffVar, zzfa zzfaVar, zzku zzkuVar, zzho zzhoVar, zzic zzicVar, zzko zzkoVar, String str, int i, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzajVar;
        this.zzf = zzffVar;
        this.zzh = zzfaVar;
        this.zzM = zzkuVar;
        this.zzg = zzhoVar;
        this.zzi = zzicVar;
        this.zzN = zzkoVar;
        this.zzj = i;
        this.zzl = zzhxVar;
    }

    private final void zzN(int i) {
        zzX();
        zzif zzifVar = this.zzx;
        boolean[] zArr = zzifVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzafv zza = zzifVar.zza.zza(i).zza(0);
        this.zzg.zzl(zzalt.zzf(zza.zzl), zza, 0, null, this.zzG);
        zArr[i] = true;
    }

    private final void zzO(int i) {
        zzX();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzk(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzit zzitVar : this.zzs) {
                zzitVar.zzb(false);
            }
            zzhd zzhdVar = this.zzq;
            if (zzhdVar != null) {
                zzhdVar.zzp(this);
                return;
            }
            throw null;
        }
    }

    private final boolean zzP() {
        return this.zzD || zzW();
    }

    private final zzox zzQ(zzie zzieVar) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zzieVar.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzko zzkoVar = this.zzN;
        Looper looper = this.zzp.getLooper();
        zzff zzffVar = this.zzf;
        zzfa zzfaVar = this.zzh;
        if (looper != null) {
            if (zzffVar != null) {
                zzit zzitVar = new zzit(zzkoVar, looper, zzffVar, zzfaVar, null);
                zzitVar.zzr(this);
                int i2 = length + 1;
                zzie[] zzieVarArr = (zzie[]) Arrays.copyOf(this.zzt, i2);
                zzieVarArr[length] = zzieVar;
                this.zzt = (zzie[]) zzamq.zze(zzieVarArr);
                zzit[] zzitVarArr = (zzit[]) Arrays.copyOf(this.zzs, i2);
                zzitVarArr[length] = zzitVar;
                this.zzs = (zzit[]) zzamq.zze(zzitVarArr);
                return zzitVar;
            }
            throw null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzR */
    public final void zzM() {
        zzaiv zzd;
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
        for (int i = 0; i < length; i++) {
            zzafv zzh = this.zzs[i].zzh();
            if (zzh != null) {
                String str = zzh.zzl;
                boolean zza = zzalt.zza(str);
                boolean z = zza || zzalt.zzb(str);
                zArr[i] = z;
                this.zzw = z | this.zzw;
                zzajg zzajgVar = this.zzr;
                if (zzajgVar != null) {
                    if (zza || this.zzt[i].zzb) {
                        zzaiv zzaivVar = zzh.zzj;
                        if (zzaivVar == null) {
                            zzd = new zzaiv(zzajgVar);
                        } else {
                            zzd = zzaivVar.zzd(zzajgVar);
                        }
                        zzaft zza2 = zzh.zza();
                        zza2.zzL(zzd);
                        zzh = zza2.zzah();
                    }
                    if (zza && zzh.zzf == -1 && zzh.zzg == -1 && zzajgVar.zza != -1) {
                        zzaft zza3 = zzh.zza();
                        zza3.zzI(zzajgVar.zza);
                        zzh = zza3.zzah();
                    }
                }
                zzqVarArr[i] = new zzq(zzh.zzb(this.zzf.zza(zzh)));
            } else {
                throw null;
            }
        }
        this.zzx = new zzif(new zzs(zzqVarArr), zArr);
        this.zzv = true;
        zzhd zzhdVar = this.zzq;
        if (zzhdVar != null) {
            zzhdVar.zzn(this);
            return;
        }
        throw null;
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
            long j = this.zzz;
            if (j == -9223372036854775807L || this.zzH <= j) {
                zzot zzotVar = this.zzy;
                if (zzotVar != null) {
                    zzib.zzi(zzibVar, zzotVar.zzf(this.zzH).zza.zzc, this.zzH);
                    for (zzit zzitVar : this.zzs) {
                        zzitVar.zzc(this.zzH);
                    }
                    this.zzH = -9223372036854775807L;
                } else {
                    throw null;
                }
            } else {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
        }
        this.zzJ = zzU();
        long zzh = this.zzk.zzh(zzibVar, this, zzku.zza(this.zzB));
        zzan zze = zzib.zze(zzibVar);
        this.zzg.zzd(new zzgx(zzib.zzb(zzibVar), zze, zze.zza, Collections.emptyMap(), zzh, 0L, 0L), 1, -1, null, 0, null, zzib.zzd(zzibVar), this.zzz);
    }

    private final int zzU() {
        int i = 0;
        for (zzit zzitVar : this.zzs) {
            i += zzitVar.zzd();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzV() {
        long j = Long.MIN_VALUE;
        for (zzit zzitVar : this.zzs) {
            j = Math.max(j, zzitVar.zzi());
        }
        return j;
    }

    private final boolean zzW() {
        return this.zzH != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzX() {
        zzakt.zzd(this.zzv);
        if (this.zzx == null) {
            throw null;
        }
        if (this.zzy == null) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzA(int i, long j) {
        if (zzP()) {
            return 0;
        }
        zzN(i);
        zzit zzitVar = this.zzs[i];
        int zzn = zzitVar.zzn(j, this.zzK);
        zzitVar.zzo(zzn);
        if (zzn == 0) {
            zzO(i);
            return 0;
        }
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final zzox zzB(int i, int i2) {
        return zzQ(new zzie(i, false));
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

            /* JADX INFO: Access modifiers changed from: package-private */
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

    /* JADX INFO: Access modifiers changed from: package-private */
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
    public final /* bridge */ /* synthetic */ void zzI(zzlc zzlcVar, long j, long j2, boolean z) {
        zzib zzibVar = (zzib) zzlcVar;
        zzlp zzc2 = zzib.zzc(zzibVar);
        zzgx zzgxVar = new zzgx(zzib.zzb(zzibVar), zzib.zze(zzibVar), zzc2.zzc(), zzc2.zzd(), j, j2, zzc2.zzb());
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
            if (zzhdVar != null) {
                zzhdVar.zzp(this);
                return;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkz
    public final /* bridge */ /* synthetic */ void zzJ(zzlc zzlcVar, long j, long j2) {
        zzot zzotVar;
        if (this.zzz == -9223372036854775807L && (zzotVar = this.zzy) != null) {
            boolean zze = zzotVar.zze();
            long zzV = zzV();
            long j3 = zzV == Long.MIN_VALUE ? 0L : zzV + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzz = j3;
            this.zzi.zzb(j3, zze, this.zzA);
        }
        zzib zzibVar = (zzib) zzlcVar;
        zzlp zzc2 = zzib.zzc(zzibVar);
        zzgx zzgxVar = new zzgx(zzib.zzb(zzibVar), zzib.zze(zzibVar), zzc2.zzc(), zzc2.zzd(), j, j2, zzc2.zzb());
        zzib.zzb(zzibVar);
        this.zzg.zzf(zzgxVar, 1, -1, null, 0, null, zzib.zzd(zzibVar), this.zzz);
        zzS(zzibVar);
        this.zzK = true;
        zzhd zzhdVar = this.zzq;
        if (zzhdVar != null) {
            zzhdVar.zzp(this);
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzb(zzhd zzhdVar, long j) {
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
    public final void zze(long j, boolean z) {
        zzX();
        if (zzW()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            this.zzs[i].zzp(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final void zzf(long j) {
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
        long j;
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
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.zzs[i].zzj()) {
                    j = Math.min(j, this.zzs[i].zzi());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            j = zzV();
        }
        return j == Long.MIN_VALUE ? this.zzG : j;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzi(long j) {
        int i;
        zzX();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zze()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzW()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            for (i = 0; i < length; i = i + 1) {
                i = (this.zzs[i].zzm(j, false) || (!zArr[i] && this.zzw)) ? i + 1 : 0;
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
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
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzj(long j, zzahz zzahzVar) {
        zzX();
        if (this.zzy.zze()) {
            zzor zzf = this.zzy.zzf(j);
            long j2 = zzf.zza.zzb;
            long j3 = zzf.zzb.zzb;
            long j4 = zzahzVar.zzf;
            if (j4 == 0 && zzahzVar.zzg == 0) {
                return j;
            }
            long zzB = zzamq.zzB(j, j4, Long.MIN_VALUE);
            long zzA = zzamq.zzA(j, zzahzVar.zzg, LongCompanionObject.MAX_VALUE);
            boolean z = true;
            boolean z2 = zzB <= j2 && j2 <= zzA;
            if (zzB > j3 || j3 > zzA) {
                z = false;
            }
            if (z2 && z) {
                if (Math.abs(j2 - j) > Math.abs(j3 - j)) {
                    return j3;
                }
            } else if (!z2) {
                return z ? j3 : zzB;
            }
            return j2;
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
    public final boolean zzl(long j) {
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
    public final long zzq(zzjg[] zzjgVarArr, boolean[] zArr, zziu[] zziuVarArr, boolean[] zArr2, long j) {
        zzjg zzjgVar;
        int i;
        zzX();
        zzif zzifVar = this.zzx;
        zzs zzsVar = zzifVar.zza;
        boolean[] zArr3 = zzifVar.zzc;
        int i2 = this.zzE;
        int i3 = 0;
        for (int i4 = 0; i4 < zzjgVarArr.length; i4++) {
            zziu zziuVar = zziuVarArr[i4];
            if (zziuVar != null && (zzjgVarArr[i4] == null || !zArr[i4])) {
                i = ((zzid) zziuVar).zzb;
                zzakt.zzd(zArr3[i]);
                this.zzE--;
                zArr3[i] = false;
                zziuVarArr[i4] = null;
            }
        }
        boolean z = !this.zzC ? j == 0 : i2 != 0;
        for (int i5 = 0; i5 < zzjgVarArr.length; i5++) {
            if (zziuVarArr[i5] == null && (zzjgVar = zzjgVarArr[i5]) != null) {
                zzakt.zzd(zzjgVar.zzc() == 1);
                zzakt.zzd(zzjgVar.zze(0) == 0);
                int zzb2 = zzsVar.zzb(zzjgVar.zzb());
                zzakt.zzd(!zArr3[zzb2]);
                this.zzE++;
                zArr3[zzb2] = true;
                zziuVarArr[i5] = new zzid(this, zzb2);
                zArr2[i5] = true;
                if (!z) {
                    zzit zzitVar = this.zzs[zzb2];
                    z = (zzitVar.zzm(j, true) || zzitVar.zzg() == 0) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zzi()) {
                zzit[] zzitVarArr = this.zzs;
                int length = zzitVarArr.length;
                while (i3 < length) {
                    zzitVarArr[i3].zzq();
                    i3++;
                }
                this.zzk.zzj();
            } else {
                for (zzit zzitVar2 : this.zzs) {
                    zzitVar2.zzb(false);
                }
            }
        } else if (z) {
            j = zzi(j);
            while (i3 < zziuVarArr.length) {
                if (zziuVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.zzC = true;
        return j;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzw(int i) {
        return !zzP() && this.zzs[i].zzk(this.zzK);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzx(int i) throws IOException {
        this.zzs[i].zzf();
        zzy();
    }

    final void zzy() throws IOException {
        this.zzk.zzl(zzku.zza(this.zzB));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzz(int i, zzafw zzafwVar, zzaf zzafVar, int i2) {
        if (zzP()) {
            return -3;
        }
        zzN(i);
        int zzl = this.zzs[i].zzl(zzafwVar, zzafVar, i2, this.zzK);
        if (zzl == -3) {
            zzO(i);
        }
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzL() {
        if (this.zzL) {
            return;
        }
        zzhd zzhdVar = this.zzq;
        if (zzhdVar != null) {
            zzhdVar.zzp(this);
            return;
        }
        throw null;
    }
}
