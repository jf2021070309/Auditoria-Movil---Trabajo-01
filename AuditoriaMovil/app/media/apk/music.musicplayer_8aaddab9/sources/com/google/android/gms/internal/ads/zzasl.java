package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.io.IOException;
/* loaded from: classes.dex */
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

    public zzasl(Uri uri, zzatz zzatzVar, zzapo[] zzapoVarArr, int i2, Handler handler, zzasm zzasmVar, zzasq zzasqVar, zzauc zzaucVar, String str, int i3, byte[] bArr) {
        this.zza = uri;
        this.zzb = zzatzVar;
        this.zzc = i2;
        this.zzd = handler;
        this.zze = zzasmVar;
        this.zzf = zzasqVar;
        this.zzG = zzaucVar;
        this.zzg = i3;
        this.zzi = new zzasj(zzapoVarArr, this);
    }

    private final void zzC(zzasi zzasiVar) {
        long j2;
        if (this.zzA == -1) {
            j2 = zzasiVar.zzj;
            this.zzA = j2;
        }
    }

    private final void zzD() {
        zzapv zzapvVar;
        zzasi zzasiVar = new zzasi(this, this.zza, this.zzb, this.zzi, this.zzj);
        if (this.zzr) {
            zzaup.zzd(zzG());
            long j2 = this.zzw;
            if (j2 != -9223372036854775807L && this.zzC >= j2) {
                this.zzE = true;
                this.zzC = -9223372036854775807L;
                return;
            }
            zzasiVar.zzb(this.zzp.zzc(this.zzC), this.zzC);
            this.zzC = -9223372036854775807L;
        }
        this.zzD = zzE();
        int i2 = this.zzc;
        if (i2 == -1) {
            i2 = (this.zzr && this.zzA == -1 && ((zzapvVar = this.zzp) == null || zzapvVar.zzb() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzh.zze(zzasiVar, this, i2);
    }

    private final int zzE() {
        int size = this.zzn.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.zzn.valueAt(i3).zzf();
        }
        return i2;
    }

    private final long zzF() {
        int size = this.zzn.size();
        long j2 = Long.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = Math.max(j2, this.zzn.valueAt(i2).zzj());
        }
        return j2;
    }

    private final boolean zzG() {
        return this.zzC != -9223372036854775807L;
    }

    public static /* synthetic */ void zzx(zzasl zzaslVar) {
        if (zzaslVar.zzF || zzaslVar.zzr || zzaslVar.zzp == null || !zzaslVar.zzq) {
            return;
        }
        int size = zzaslVar.zzn.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (zzaslVar.zzn.valueAt(i2).zzi() == null) {
                return;
            }
        }
        zzaslVar.zzj.zzb();
        zzatf[] zzatfVarArr = new zzatf[size];
        zzaslVar.zzy = new boolean[size];
        zzaslVar.zzx = new boolean[size];
        zzaslVar.zzw = zzaslVar.zzp.zzb();
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                zzaslVar.zzv = new zzatg(zzatfVarArr);
                zzaslVar.zzr = true;
                zzaslVar.zzf.zzi(new zzate(zzaslVar.zzw, zzaslVar.zzp.zza()), null);
                zzaslVar.zzo.zzj(zzaslVar);
                return;
            }
            zzanm zzi = zzaslVar.zzn.valueAt(i3).zzi();
            zzatfVarArr[i3] = new zzatf(zzi);
            String str = zzi.zzf;
            if (!zzauu.zzb(str) && !zzauu.zza(str)) {
                z = false;
            }
            zzaslVar.zzy[i3] = z;
            zzaslVar.zzz = z | zzaslVar.zzz;
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final /* bridge */ /* synthetic */ void zzA(zzaul zzaulVar, long j2, long j3) {
        zzC((zzasi) zzaulVar);
        this.zzE = true;
        if (this.zzw == -9223372036854775807L) {
            long zzF = zzF();
            long j4 = zzF == Long.MIN_VALUE ? 0L : zzF + AbstractComponentTracker.LINGERING_TIMEOUT;
            this.zzw = j4;
            this.zzf.zzi(new zzate(j4, this.zzp.zza()), null);
        }
        this.zzo.zzbh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzB(zzatk[] zzatkVarArr, boolean[] zArr, zzatb[] zzatbVarArr, boolean[] zArr2, long j2) {
        zzatk zzatkVar;
        int i2;
        zzaup.zzd(this.zzr);
        for (int i3 = 0; i3 < zzatkVarArr.length; i3++) {
            zzatb zzatbVar = zzatbVarArr[i3];
            if (zzatbVar != null && (zzatkVarArr[i3] == null || !zArr[i3])) {
                i2 = ((zzask) zzatbVar).zzb;
                zzaup.zzd(this.zzx[i2]);
                this.zzu--;
                this.zzx[i2] = false;
                this.zzn.valueAt(i2).zzg();
                zzatbVarArr[i3] = null;
            }
        }
        boolean z = false;
        for (int i4 = 0; i4 < zzatkVarArr.length; i4++) {
            if (zzatbVarArr[i4] == null && (zzatkVar = zzatkVarArr[i4]) != null) {
                zzatkVar.zzb();
                zzaup.zzd(zzatkVar.zzd(0) == 0);
                int zzb = this.zzv.zzb(zzatkVar.zza());
                zzaup.zzd(!this.zzx[zzb]);
                this.zzu++;
                this.zzx[zzb] = true;
                zzatbVarArr[i4] = new zzask(this, zzb);
                zArr2[i4] = true;
                z = true;
            }
        }
        if (!this.zzs) {
            int size = this.zzn.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (!this.zzx[i5]) {
                    this.zzn.valueAt(i5).zzg();
                }
            }
        }
        if (this.zzu == 0) {
            this.zzt = false;
            if (this.zzh.zzf()) {
                this.zzh.zzg();
            }
        } else if (!this.zzs ? j2 != 0 : z) {
            j2 = zzr(j2);
            for (int i6 = 0; i6 < zzatbVarArr.length; i6++) {
                if (zzatbVarArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.zzs = true;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzasp, com.google.android.gms.internal.ads.zzatd
    public final long zza() {
        if (this.zzu == 0) {
            return Long.MIN_VALUE;
        }
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzasp, com.google.android.gms.internal.ads.zzatd
    public final boolean zzb(long j2) {
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
    public final zzapx zzbf(int i2, int i3) {
        zzata zzataVar = this.zzn.get(i2);
        if (zzataVar == null) {
            zzata zzataVar2 = new zzata(this.zzG, null);
            zzataVar2.zzn(this);
            this.zzn.put(i2, zzataVar2);
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
    public final void zzl(zzaso zzasoVar, long j2) {
        this.zzo = zzasoVar;
        this.zzj.zza();
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzm() throws IOException {
        this.zzh.zzi(Level.ALL_INT);
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final zzatg zzn() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzo(long j2) {
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
            zzF = Long.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                if (this.zzy[i2]) {
                    zzF = Math.min(zzF, this.zzn.valueAt(i2).zzj());
                }
            }
        } else {
            zzF = zzF();
        }
        return zzF == Long.MIN_VALUE ? this.zzB : zzF;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzr(long j2) {
        if (true != this.zzp.zza()) {
            j2 = 0;
        }
        this.zzB = j2;
        int size = this.zzn.size();
        boolean zzG = true ^ zzG();
        int i2 = 0;
        while (true) {
            if (!zzG) {
                this.zzC = j2;
                this.zzE = false;
                if (this.zzh.zzf()) {
                    this.zzh.zzg();
                } else {
                    for (int i3 = 0; i3 < size; i3++) {
                        this.zzn.valueAt(i3).zze(this.zzx[i3]);
                    }
                }
            } else if (i2 >= size) {
                break;
            } else {
                if (this.zzx[i2]) {
                    zzG = this.zzn.valueAt(i2).zzl(j2, false);
                }
                i2++;
            }
        }
        this.zzt = false;
        return j2;
    }

    public final boolean zzs(int i2) {
        return this.zzE || (!zzG() && this.zzn.valueAt(i2).zzh());
    }

    public final void zzt() throws IOException {
        this.zzh.zzi(Level.ALL_INT);
    }

    public final int zzu(int i2, zzann zzannVar, zzapg zzapgVar, boolean z) {
        if (this.zzt || zzG()) {
            return -3;
        }
        return this.zzn.valueAt(i2).zzm(zzannVar, zzapgVar, z, this.zzE, this.zzB);
    }

    public final void zzv(int i2, long j2) {
        zzata valueAt = this.zzn.valueAt(i2);
        if (!this.zzE || j2 <= valueAt.zzj()) {
            valueAt.zzl(j2, true);
        } else {
            valueAt.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasz
    public final void zzw(zzanm zzanmVar) {
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final /* bridge */ /* synthetic */ int zzy(zzaul zzaulVar, long j2, long j3, IOException iOException) {
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
        int i2 = this.zzD;
        if (this.zzA == -1 && ((zzapvVar = this.zzp) == null || zzapvVar.zzb() == -9223372036854775807L)) {
            this.zzB = 0L;
            this.zzt = this.zzr;
            int size = this.zzn.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.zzn.valueAt(i3).zze(!this.zzr || this.zzx[i3]);
            }
            zzasiVar.zzb(0L, 0L);
        }
        this.zzD = zzE();
        return zzE <= i2 ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final /* bridge */ /* synthetic */ void zzz(zzaul zzaulVar, long j2, long j3, boolean z) {
        zzC((zzasi) zzaulVar);
        if (z || this.zzu <= 0) {
            return;
        }
        int size = this.zzn.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zzn.valueAt(i2).zze(this.zzx[i2]);
        }
        this.zzo.zzbh(this);
    }
}
