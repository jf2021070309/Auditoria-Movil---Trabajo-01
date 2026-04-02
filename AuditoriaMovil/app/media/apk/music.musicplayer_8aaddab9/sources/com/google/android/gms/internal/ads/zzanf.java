package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class zzanf implements zzanc {
    private final zzanr[] zza;
    private final zzatu zzb;
    private final zzats zzc;
    private final Handler zzd;
    private final zzank zze;
    private final CopyOnWriteArraySet<zzamz> zzf;
    private final zzanw zzg;
    private final zzanv zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzanx zzo;
    private Object zzp;
    private zzatg zzq;
    private zzats zzr;
    private zzanq zzs;
    private zzanh zzt;
    private long zzu;

    @SuppressLint({"HandlerLeak"})
    public zzanf(zzanr[] zzanrVarArr, zzatu zzatuVar, zzcjy zzcjyVar, byte[] bArr) {
        String.valueOf(zzave.zze).length();
        this.zza = zzanrVarArr;
        Objects.requireNonNull(zzatuVar);
        this.zzb = zzatuVar;
        this.zzj = false;
        this.zzk = 1;
        this.zzf = new CopyOnWriteArraySet<>();
        zzats zzatsVar = new zzats(new zzatk[2], null);
        this.zzc = zzatsVar;
        this.zzo = zzanx.zza;
        this.zzg = new zzanw();
        this.zzh = new zzanv();
        this.zzq = zzatg.zza;
        this.zzr = zzatsVar;
        this.zzs = zzanq.zza;
        zzane zzaneVar = new zzane(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.zzd = zzaneVar;
        zzanh zzanhVar = new zzanh(0, 0L);
        this.zzt = zzanhVar;
        this.zze = new zzank(zzanrVarArr, zzatuVar, zzcjyVar, this.zzj, 0, zzaneVar, zzanhVar, this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zza(zzamz zzamzVar) {
        this.zzf.add(zzamzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzb(zzamz zzamzVar) {
        this.zzf.remove(zzamzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final int zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzd(zzasr zzasrVar) {
        if (!this.zzo.zzf() || this.zzp != null) {
            this.zzo = zzanx.zza;
            this.zzp = null;
            Iterator<zzamz> it = this.zzf.iterator();
            while (it.hasNext()) {
                it.next().zza(this.zzo, this.zzp);
            }
        }
        if (this.zzi) {
            this.zzi = false;
            this.zzq = zzatg.zza;
            this.zzr = this.zzc;
            this.zzb.zze(null);
            Iterator<zzamz> it2 = this.zzf.iterator();
            while (it2.hasNext()) {
                it2.next().zzb(this.zzq, this.zzr);
            }
        }
        this.zzm++;
        this.zze.zzb(zzasrVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zze(boolean z) {
        if (this.zzj != z) {
            this.zzj = z;
            this.zze.zzc(z);
            Iterator<zzamz> it = this.zzf.iterator();
            while (it.hasNext()) {
                it.next().zzd(z, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final boolean zzf() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzg(long j2) {
        zzr();
        if (!this.zzo.zzf() && this.zzo.zza() <= 0) {
            throw new zzano(this.zzo, 0, j2);
        }
        this.zzl++;
        if (!this.zzo.zzf()) {
            this.zzo.zzg(0, this.zzg, false);
            long zzb = zzamx.zzb(j2);
            long j3 = this.zzo.zzd(0, this.zzh, false).zzc;
            if (j3 != -9223372036854775807L) {
                int i2 = (zzb > j3 ? 1 : (zzb == j3 ? 0 : -1));
            }
        }
        this.zzu = j2;
        this.zze.zzd(this.zzo, 0, zzamx.zzb(j2));
        Iterator<zzamz> it = this.zzf.iterator();
        while (it.hasNext()) {
            it.next().zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzh() {
        this.zze.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzi() {
        this.zze.zzh();
        this.zzd.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzj(zzanb... zzanbVarArr) {
        this.zze.zzf(zzanbVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzk(zzanb... zzanbVarArr) {
        this.zze.zzg(zzanbVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final long zzl() {
        if (this.zzo.zzf()) {
            return -9223372036854775807L;
        }
        zzanx zzanxVar = this.zzo;
        zzr();
        return zzamx.zza(zzanxVar.zzg(0, this.zzg, false).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final long zzm() {
        if (this.zzo.zzf() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzamx.zza(this.zzt.zzc) + zzamx.zza(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final long zzn() {
        if (this.zzo.zzf() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzamx.zza(this.zzt.zzd) + zzamx.zza(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzo() {
        this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzp(int i2) {
        this.zze.zzl(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzq(int i2) {
        this.zze.zzm(i2);
    }

    public final int zzr() {
        if (!this.zzo.zzf() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
        }
        return 0;
    }

    public final void zzs(Message message) {
        switch (message.what) {
            case 0:
                this.zzm--;
                return;
            case 1:
                this.zzk = message.arg1;
                Iterator<zzamz> it = this.zzf.iterator();
                while (it.hasNext()) {
                    it.next().zzd(this.zzj, this.zzk);
                }
                return;
            case 2:
                this.zzn = message.arg1 != 0;
                Iterator<zzamz> it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    it2.next().zzc(this.zzn);
                }
                return;
            case 3:
                if (this.zzm == 0) {
                    zzatv zzatvVar = (zzatv) message.obj;
                    this.zzi = true;
                    this.zzq = zzatvVar.zza;
                    this.zzr = zzatvVar.zzb;
                    this.zzb.zze(zzatvVar.zzc);
                    Iterator<zzamz> it3 = this.zzf.iterator();
                    while (it3.hasNext()) {
                        it3.next().zzb(this.zzq, this.zzr);
                    }
                    return;
                }
                return;
            case 4:
                int i2 = this.zzl - 1;
                this.zzl = i2;
                if (i2 == 0) {
                    this.zzt = (zzanh) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzamz> it4 = this.zzf.iterator();
                        while (it4.hasNext()) {
                            it4.next().zzf();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzl == 0) {
                    this.zzt = (zzanh) message.obj;
                    Iterator<zzamz> it5 = this.zzf.iterator();
                    while (it5.hasNext()) {
                        it5.next().zzf();
                    }
                    return;
                }
                return;
            case 6:
                zzanj zzanjVar = (zzanj) message.obj;
                this.zzl -= zzanjVar.zzd;
                if (this.zzm == 0) {
                    this.zzo = zzanjVar.zza;
                    this.zzp = zzanjVar.zzb;
                    this.zzt = zzanjVar.zzc;
                    Iterator<zzamz> it6 = this.zzf.iterator();
                    while (it6.hasNext()) {
                        it6.next().zza(this.zzo, this.zzp);
                    }
                    return;
                }
                return;
            case 7:
                zzanq zzanqVar = (zzanq) message.obj;
                if (this.zzs.equals(zzanqVar)) {
                    return;
                }
                this.zzs = zzanqVar;
                Iterator<zzamz> it7 = this.zzf.iterator();
                while (it7.hasNext()) {
                    it7.next().zzg(zzanqVar);
                }
                return;
            case 8:
                zzamy zzamyVar = (zzamy) message.obj;
                Iterator<zzamz> it8 = this.zzf.iterator();
                while (it8.hasNext()) {
                    it8.next().zze(zzamyVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
