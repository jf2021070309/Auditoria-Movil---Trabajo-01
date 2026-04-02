package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzasl implements zzasp, zzapp, zzauj, zzasz {
    private long zzB;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private final zzauc zzG;
    private final Uri zza;
    private final zzatz zzb;
    private final int zzc;
    private final Handler zzd;
    private final zzasm zze;
    private final zzasq zzf;
    private final long zzg;
    private final zzasj zzi;
    private zzaso zzo;
    private zzapv zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzu;
    private zzatg zzv;
    private long zzw;
    private boolean[] zzx;
    private boolean[] zzy;
    private boolean zzz;
    private final zzaun zzh = new zzaun("Loader:ExtractorMediaPeriod");
    private final zzaur zzj = new zzaur();
    private final Runnable zzk = new zzase(this);
    private final Runnable zzl = new zzasf(this);
    private final Handler zzm = new Handler();
    private long zzC = -9223372036854775807L;
    private final SparseArray<zzata> zzn = new SparseArray<>();
    private long zzA = -1;

    public zzasl(Uri uri, zzatz zzatzVar, zzapo[] zzapoVarArr, int i, Handler handler, zzasm zzasmVar, zzasq zzasqVar, zzauc zzaucVar, String str, int i2, byte[] bArr) {
        this.zza = uri;
        this.zzb = zzatzVar;
        this.zzc = i;
        this.zzd = handler;
        this.zze = zzasmVar;
        this.zzf = zzasqVar;
        this.zzG = zzaucVar;
        this.zzg = i2;
        this.zzi = new zzasj(zzapoVarArr, this);
    }

    private final void zzC(zzasi zzasiVar) {
        long j;
        if (this.zzA == -1) {
            j = zzasiVar.zzj;
            this.zzA = j;
        }
    }

    private final void zzD() {
        zzapv zzapvVar;
        zzasi zzasiVar = new zzasi(this, this.zza, this.zzb, this.zzi, this.zzj);
        if (this.zzr) {
            zzaup.zzd(zzG());
            long j = this.zzw;
            if (j == -9223372036854775807L || this.zzC < j) {
                zzasiVar.zzb(this.zzp.zzc(this.zzC), this.zzC);
                this.zzC = -9223372036854775807L;
            } else {
                this.zzE = true;
                this.zzC = -9223372036854775807L;
                return;
            }
        }
        this.zzD = zzE();
        int i = this.zzc;
        if (i == -1) {
            i = (this.zzr && this.zzA == -1 && ((zzapvVar = this.zzp) == null || zzapvVar.zzb() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzh.zze(zzasiVar, this, i);
    }

    private final int zzE() {
        int size = this.zzn.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.zzn.valueAt(i2).zzf();
        }
        return i;
    }

    private final long zzF() {
        int size = this.zzn.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.zzn.valueAt(i).zzj());
        }
        return j;
    }

    private final boolean zzG() {
        return this.zzC != -9223372036854775807L;
    }

    public static /* synthetic */ void zzx(zzasl zzaslVar) {
        if (zzaslVar.zzF || zzaslVar.zzr || zzaslVar.zzp == null || !zzaslVar.zzq) {
            return;
        }
        int size = zzaslVar.zzn.size();
        for (int i = 0; i < size; i++) {
            if (zzaslVar.zzn.valueAt(i).zzi() == null) {
                return;
            }
        }
        zzaslVar.zzj.zzb();
        zzatf[] zzatfVarArr = new zzatf[size];
        zzaslVar.zzy = new boolean[size];
        zzaslVar.zzx = new boolean[size];
        zzaslVar.zzw = zzaslVar.zzp.zzb();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < size) {
                zzanm zzi = zzaslVar.zzn.valueAt(i2).zzi();
                zzatfVarArr[i2] = new zzatf(zzi);
                String str = zzi.zzf;
                if (!zzauu.zzb(str) && !zzauu.zza(str)) {
                    z = false;
                }
                zzaslVar.zzy[i2] = z;
                zzaslVar.zzz = z | zzaslVar.zzz;
                i2++;
            } else {
                zzaslVar.zzv = new zzatg(zzatfVarArr);
                zzaslVar.zzr = true;
                zzaslVar.zzf.zzi(new zzate(zzaslVar.zzw, zzaslVar.zzp.zza()), null);
                zzaslVar.zzo.zzj(zzaslVar);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final /* bridge */ /* synthetic */ void zzA(zzaul zzaulVar, long j, long j2) {
        zzC((zzasi) zzaulVar);
        this.zzE = true;
        if (this.zzw == -9223372036854775807L) {
            long zzF = zzF();
            long j3 = zzF == Long.MIN_VALUE ? 0L : zzF + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzw = j3;
            this.zzf.zzi(new zzate(j3, this.zzp.zza()), null);
        }
        this.zzo.zzbh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzB(zzatk[] zzatkVarArr, boolean[] zArr, zzatb[] zzatbVarArr, boolean[] zArr2, long j) {
        zzatk zzatkVar;
        int i;
        zzaup.zzd(this.zzr);
        for (int i2 = 0; i2 < zzatkVarArr.length; i2++) {
            zzatb zzatbVar = zzatbVarArr[i2];
            if (zzatbVar != null && (zzatkVarArr[i2] == null || !zArr[i2])) {
                i = ((zzask) zzatbVar).zzb;
                zzaup.zzd(this.zzx[i]);
                this.zzu--;
                this.zzx[i] = false;
                this.zzn.valueAt(i).zzg();
                zzatbVarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < zzatkVarArr.length; i3++) {
            if (zzatbVarArr[i3] == null && (zzatkVar = zzatkVarArr[i3]) != null) {
                zzatkVar.zzb();
                zzaup.zzd(zzatkVar.zzd(0) == 0);
                int zzb = this.zzv.zzb(zzatkVar.zza());
                zzaup.zzd(!this.zzx[zzb]);
                this.zzu++;
                this.zzx[zzb] = true;
                zzatbVarArr[i3] = new zzask(this, zzb);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.zzs) {
            int size = this.zzn.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.zzx[i4]) {
                    this.zzn.valueAt(i4).zzg();
                }
            }
        }
        if (this.zzu == 0) {
            this.zzt = false;
            if (this.zzh.zzf()) {
                this.zzh.zzg();
            }
        } else if (!this.zzs ? j != 0 : z) {
            j = zzr(j);
            for (int i5 = 0; i5 < zzatbVarArr.length; i5++) {
                if (zzatbVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.zzs = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzasp, com.google.android.gms.internal.ads.zzatd
    public final long zza() {
        if (this.zzu == 0) {
            return Long.MIN_VALUE;
        }
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzasp, com.google.android.gms.internal.ads.zzatd
    public final boolean zzb(long j) {
        if (this.zzE) {
            return false;
        }
        if (this.zzr && this.zzu == 0) {
            return false;
        }
        boolean zza = this.zzj.zza();
        if (this.zzh.zzf()) {
            return zza;
        }
        zzD();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final zzapx zzbf(int i, int i2) {
        zzata zzataVar = this.zzn.get(i);
        if (zzataVar == null) {
            zzata zzataVar2 = new zzata(this.zzG, null);
            zzataVar2.zzn(this);
            this.zzn.put(i, zzataVar2);
            return zzataVar2;
        }
        return zzataVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzbg() {
        this.zzq = true;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzc(zzapv zzapvVar) {
        this.zzp = zzapvVar;
        this.zzm.post(this.zzk);
    }

    public final void zzk() {
        this.zzh.zzh(new zzasg(this, this.zzi));
        this.zzm.removeCallbacksAndMessages(null);
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzl(zzaso zzasoVar, long j) {
        this.zzo = zzasoVar;
        this.zzj.zza();
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzm() throws IOException {
        this.zzh.zzi(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final zzatg zzn() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzo(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzp() {
        if (this.zzt) {
            this.zzt = false;
            return this.zzB;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzq() {
        long zzF;
        if (this.zzE) {
            return Long.MIN_VALUE;
        }
        if (zzG()) {
            return this.zzC;
        }
        if (this.zzz) {
            int size = this.zzn.size();
            zzF = LongCompanionObject.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.zzy[i]) {
                    zzF = Math.min(zzF, this.zzn.valueAt(i).zzj());
                }
            }
        } else {
            zzF = zzF();
        }
        return zzF == Long.MIN_VALUE ? this.zzB : zzF;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzr(long j) {
        if (true != this.zzp.zza()) {
            j = 0;
        }
        this.zzB = j;
        int size = this.zzn.size();
        boolean zzG = true ^ zzG();
        int i = 0;
        while (true) {
            if (!zzG) {
                this.zzC = j;
                this.zzE = false;
                if (this.zzh.zzf()) {
                    this.zzh.zzg();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        this.zzn.valueAt(i2).zze(this.zzx[i2]);
                    }
                }
            } else if (i >= size) {
                break;
            } else {
                if (this.zzx[i]) {
                    zzG = this.zzn.valueAt(i).zzl(j, false);
                }
                i++;
            }
        }
        this.zzt = false;
        return j;
    }

    public final boolean zzs(int i) {
        return this.zzE || (!zzG() && this.zzn.valueAt(i).zzh());
    }

    public final void zzt() throws IOException {
        this.zzh.zzi(Integer.MIN_VALUE);
    }

    public final int zzu(int i, zzann zzannVar, zzapg zzapgVar, boolean z) {
        if (this.zzt || zzG()) {
            return -3;
        }
        return this.zzn.valueAt(i).zzm(zzannVar, zzapgVar, z, this.zzE, this.zzB);
    }

    public final void zzv(int i, long j) {
        zzata valueAt = this.zzn.valueAt(i);
        if (!this.zzE || j <= valueAt.zzj()) {
            valueAt.zzl(j, true);
        } else {
            valueAt.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasz
    public final void zzw(zzanm zzanmVar) {
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final /* bridge */ /* synthetic */ int zzy(zzaul zzaulVar, long j, long j2, IOException iOException) {
        zzapv zzapvVar;
        zzasi zzasiVar = (zzasi) zzaulVar;
        zzC(zzasiVar);
        Handler handler = this.zzd;
        if (handler != null) {
            handler.post(new zzash(this, iOException));
        }
        if (iOException instanceof zzath) {
            return 3;
        }
        int zzE = zzE();
        int i = this.zzD;
        if (this.zzA == -1 && ((zzapvVar = this.zzp) == null || zzapvVar.zzb() == -9223372036854775807L)) {
            this.zzB = 0L;
            this.zzt = this.zzr;
            int size = this.zzn.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.zzn.valueAt(i2).zze(!this.zzr || this.zzx[i2]);
            }
            zzasiVar.zzb(0L, 0L);
        }
        this.zzD = zzE();
        return zzE <= i ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final /* bridge */ /* synthetic */ void zzz(zzaul zzaulVar, long j, long j2, boolean z) {
        zzC((zzasi) zzaulVar);
        if (z || this.zzu <= 0) {
            return;
        }
        int size = this.zzn.size();
        for (int i = 0; i < size; i++) {
            this.zzn.valueAt(i).zze(this.zzx[i]);
        }
        this.zzo.zzbh(this);
    }
}
