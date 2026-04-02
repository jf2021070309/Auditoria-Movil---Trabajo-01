package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class zzaie extends zzadu implements zzahp {
    private float zzA;
    private boolean zzB;
    private List zzC;
    private boolean zzD;
    private boolean zzE;
    private zzaee zzF;
    private zzy zzG;
    public final zzahv[] zzb;
    private final zzakw zzc;
    private final Context zzd;
    private final zzafe zze;
    private final zzaib zzf;
    private final zzaic zzg;
    private final CopyOnWriteArraySet<zzahl> zzh;
    private final zzcy zzi;
    private final zzadp zzj;
    private final zzadt zzk;
    private final zzaij zzl;
    private final zzair zzm;
    private final zzais zzn;
    private zzafv zzo;
    private zzafv zzp;
    private AudioTrack zzq;
    private Object zzr;
    private Surface zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private zzaz zzw;
    private zzaz zzx;
    private int zzy;
    private zzg zzz;

    public zzaie(zzaia zzaiaVar) {
        zzaie zzaieVar;
        Context context;
        zzcy zzcyVar;
        zzg zzgVar;
        Looper looper;
        zzahy zzahyVar;
        zzjz zzjzVar;
        zzhq zzhqVar;
        zzafy zzafyVar;
        zzki zzkiVar;
        zzahz zzahzVar;
        zzadz zzadzVar;
        zzaku zzakuVar;
        Looper looper2;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        zzakw zzakwVar = new zzakw(zzaku.zza);
        this.zzc = zzakwVar;
        try {
            context = zzaiaVar.zza;
            Context applicationContext = context.getApplicationContext();
            this.zzd = applicationContext;
            zzcyVar = zzaiaVar.zzh;
            this.zzi = zzcyVar;
            zzgVar = zzaiaVar.zzj;
            this.zzz = zzgVar;
            this.zzt = 1;
            this.zzB = false;
            zzaib zzaibVar = new zzaib(this, null);
            this.zzf = zzaibVar;
            zzaic zzaicVar = new zzaic(null);
            this.zzg = zzaicVar;
            this.zzh = new CopyOnWriteArraySet<>();
            looper = zzaiaVar.zzi;
            Handler handler = new Handler(looper);
            zzahyVar = zzaiaVar.zzb;
            zzahv[] zza = zzahyVar.zza(handler, zzaibVar, zzaibVar, zzaibVar, zzaibVar);
            this.zzb = zza;
            this.zzA = 1.0f;
            if (zzamq.zza < 21) {
                AudioTrack audioTrack = this.zzq;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.zzq.release();
                    this.zzq = null;
                }
                if (this.zzq == null) {
                    this.zzq = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzy = this.zzq.getAudioSessionId();
            } else {
                this.zzy = zzadx.zzc(applicationContext);
            }
            this.zzC = Collections.emptyList();
            this.zzD = true;
            zzahh zzahhVar = new zzahh();
            int[] iArr = new int[8];
            iArr[0] = 20;
            iArr[1] = 21;
            iArr[2] = 22;
            iArr[3] = 23;
            try {
                iArr[4] = 24;
                iArr[5] = 25;
                iArr[6] = 26;
                iArr[7] = 27;
                zzahhVar.zzc(iArr);
                zzahi zze = zzahhVar.zze();
                zzjzVar = zzaiaVar.zzd;
                zzhqVar = zzaiaVar.zze;
                zzafyVar = zzaiaVar.zzf;
                zzkiVar = zzaiaVar.zzg;
                zzahzVar = zzaiaVar.zzk;
                zzadzVar = zzaiaVar.zzm;
                zzakuVar = zzaiaVar.zzc;
                looper2 = zzaiaVar.zzi;
                zzafe zzafeVar = new zzafe(zza, zzjzVar, zzhqVar, zzafyVar, zzkiVar, zzcyVar, true, zzahzVar, 5000L, 15000L, zzadzVar, 500L, false, zzakuVar, looper2, this, zze, null);
                zzaieVar = this;
                try {
                    zzaieVar.zze = zzafeVar;
                    zzafeVar.zzg(zzaibVar);
                    zzafeVar.zzh(zzaibVar);
                    context2 = zzaiaVar.zza;
                    zzaieVar.zzj = new zzadp(context2, handler, zzaibVar);
                    context3 = zzaiaVar.zza;
                    zzaieVar.zzk = new zzadt(context3, handler, zzaibVar);
                    zzamq.zzc(null, null);
                    context4 = zzaiaVar.zza;
                    zzaij zzaijVar = new zzaij(context4, handler, zzaibVar);
                    zzaieVar.zzl = zzaijVar;
                    int i2 = zzaieVar.zzz.zzb;
                    zzaijVar.zzb(3);
                    context5 = zzaiaVar.zza;
                    zzaieVar.zzm = new zzair(context5);
                    context6 = zzaiaVar.zza;
                    zzaieVar.zzn = new zzais(context6);
                    zzaieVar.zzF = zzah(zzaijVar);
                    zzaieVar.zzG = zzy.zza;
                    zzaieVar.zzag(1, 10, Integer.valueOf(zzaieVar.zzy));
                    zzaieVar.zzag(2, 10, Integer.valueOf(zzaieVar.zzy));
                    zzaieVar.zzag(1, 3, zzaieVar.zzz);
                    zzaieVar.zzag(2, 4, Integer.valueOf(zzaieVar.zzt));
                    zzaieVar.zzag(2, 5, 0);
                    zzaieVar.zzag(1, 9, Boolean.valueOf(zzaieVar.zzB));
                    zzaieVar.zzag(2, 7, zzaicVar);
                    zzaieVar.zzag(6, 8, zzaicVar);
                    zzakwVar.zza();
                } catch (Throwable th) {
                    th = th;
                    zzaieVar.zzc.zza();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zzaieVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            zzaieVar = this;
        }
    }

    public static /* synthetic */ void zzS(zzaie zzaieVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzaieVar.zzab(surface);
        zzaieVar.zzs = surface;
    }

    public static /* synthetic */ void zzT(zzaie zzaieVar, Object obj) {
        zzaieVar.zzab(null);
    }

    public static /* synthetic */ void zzU(zzaie zzaieVar, int i2, int i3) {
        zzaieVar.zzac(i2, i3);
    }

    public static /* synthetic */ void zzW(zzaie zzaieVar) {
        zzaieVar.zzi.zzn(zzaieVar.zzB);
        Iterator<zzahl> it = zzaieVar.zzh.iterator();
        while (it.hasNext()) {
            it.next().zzn(zzaieVar.zzB);
        }
    }

    public static /* synthetic */ void zzY(zzaie zzaieVar) {
        int zzI = zzaieVar.zzI();
        if (zzI == 2 || zzI == 3) {
            zzaieVar.zzaf();
            zzaieVar.zze.zze();
            zzaieVar.zzM();
            zzaieVar.zzM();
        }
    }

    public static /* synthetic */ zzaee zzZ(zzaij zzaijVar) {
        return zzah(zzaijVar);
    }

    public final void zzab(Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        zzahv[] zzahvVarArr = this.zzb;
        int length = zzahvVarArr.length;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= 2) {
                break;
            }
            zzahv zzahvVar = zzahvVarArr[i2];
            if (zzahvVar.zzac() == 2) {
                zzahs zzt = this.zze.zzt(zzahvVar);
                zzt.zzb(1);
                zzt.zzd(obj);
                zzt.zzg();
                arrayList.add(zzt);
            }
            i2++;
        }
        Object obj2 = this.zzr;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzahs) it.next()).zzj(2000L);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.zzr;
            Surface surface = this.zzs;
            if (obj3 == surface) {
                surface.release();
                this.zzs = null;
            }
        }
        this.zzr = obj;
        if (z) {
            this.zze.zzr(false, zzaeg.zzc(new zzafr(3), 1003));
        }
    }

    public final void zzac(int i2, int i3) {
        if (i2 == this.zzu && i3 == this.zzv) {
            return;
        }
        this.zzu = i2;
        this.zzv = i3;
        this.zzi.zzB(i2, i3);
        Iterator<zzahl> it = this.zzh.iterator();
        while (it.hasNext()) {
            it.next().zzB(i2, i3);
        }
    }

    public final void zzad() {
        zzag(1, 2, Float.valueOf(this.zzk.zza() * this.zzA));
    }

    public final void zzae(boolean z, int i2, int i3) {
        int i4 = 1;
        boolean z2 = z && i2 != -1;
        this.zze.zzl(z2, (!z2 || i2 == 1) ? 0 : 0, i3);
    }

    private final void zzaf() {
        this.zzc.zzd();
        if (Thread.currentThread() != this.zze.zzf().getThread()) {
            String zzv = zzamq.zzv("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zze.zzf().getThread().getName());
            if (this.zzD) {
                throw new IllegalStateException(zzv);
            }
            zzaln.zza("SimpleExoPlayer", zzv, this.zzE ? null : new IllegalStateException());
            this.zzE = true;
        }
    }

    private final void zzag(int i2, int i3, Object obj) {
        zzahv[] zzahvVarArr = this.zzb;
        int length = zzahvVarArr.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzahv zzahvVar = zzahvVarArr[i4];
            if (zzahvVar.zzac() == i2) {
                zzahs zzt = this.zze.zzt(zzahvVar);
                zzt.zzb(i3);
                zzt.zzd(obj);
                zzt.zzg();
            }
        }
    }

    public static zzaee zzah(zzaij zzaijVar) {
        return new zzaee(0, zzaijVar.zzc(), zzaijVar.zzd());
    }

    public static int zzai(boolean z, int i2) {
        return (!z || i2 == 1) ? 1 : 2;
    }

    public static /* synthetic */ CopyOnWriteArraySet zze(zzaie zzaieVar) {
        return zzaieVar.zzh;
    }

    public static /* synthetic */ zzcy zzf(zzaie zzaieVar) {
        return zzaieVar.zzi;
    }

    public static /* synthetic */ zzaij zzg(zzaie zzaieVar) {
        return zzaieVar.zzl;
    }

    public static /* synthetic */ zzafv zzh(zzaie zzaieVar, zzafv zzafvVar) {
        zzaieVar.zzo = zzafvVar;
        return zzafvVar;
    }

    public static /* synthetic */ zzafv zzi(zzaie zzaieVar, zzafv zzafvVar) {
        zzaieVar.zzp = zzafvVar;
        return zzafvVar;
    }

    public static /* synthetic */ Object zzj(zzaie zzaieVar) {
        return zzaieVar.zzr;
    }

    public static /* synthetic */ zzaz zzk(zzaie zzaieVar, zzaz zzazVar) {
        zzaieVar.zzw = zzazVar;
        return zzazVar;
    }

    public static /* synthetic */ zzaz zzl(zzaie zzaieVar, zzaz zzazVar) {
        zzaieVar.zzx = zzazVar;
        return zzazVar;
    }

    public static /* synthetic */ boolean zzm(zzaie zzaieVar) {
        return zzaieVar.zzB;
    }

    public static /* synthetic */ boolean zzr(zzaie zzaieVar, boolean z) {
        zzaieVar.zzB = z;
        return z;
    }

    public static /* synthetic */ zzaee zzs(zzaie zzaieVar) {
        return zzaieVar.zzF;
    }

    public static /* synthetic */ zzaee zzt(zzaie zzaieVar, zzaee zzaeeVar) {
        zzaieVar.zzF = zzaeeVar;
        return zzaeeVar;
    }

    public static /* synthetic */ zzy zzw(zzaie zzaieVar, zzy zzyVar) {
        zzaieVar.zzG = zzyVar;
        return zzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final boolean zzA() {
        zzaf();
        return this.zze.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzB() {
        zzaf();
        return this.zze.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzC() {
        zzaf();
        return this.zze.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzD() {
        zzaf();
        return this.zze.zzD();
    }

    public final void zzE(float f2) {
        zzaf();
        float zzz = zzamq.zzz(f2, 0.0f, 1.0f);
        if (this.zzA == zzz) {
            return;
        }
        this.zzA = zzz;
        zzad();
        this.zzi.zzq(zzz);
        Iterator<zzahl> it = this.zzh.iterator();
        while (it.hasNext()) {
            it.next().zzq(zzz);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final zzaiq zzF() {
        zzaf();
        return this.zze.zzF();
    }

    public final void zzG(zzda zzdaVar) {
        this.zzi.zza(zzdaVar);
    }

    public final void zzH(zzda zzdaVar) {
        this.zzi.zzb(zzdaVar);
    }

    public final int zzI() {
        zzaf();
        return this.zze.zzi();
    }

    public final void zzJ() {
        zzaf();
        boolean zzM = zzM();
        int zzb = this.zzk.zzb(zzM, 2);
        zzae(zzM, zzb, zzai(zzM, zzb));
        this.zze.zzj();
    }

    public final void zzK(zzhh zzhhVar) {
        zzaf();
        this.zze.zzk(Collections.singletonList(zzhhVar), true);
    }

    public final void zzL(boolean z) {
        zzaf();
        int zzb = this.zzk.zzb(z, zzI());
        zzae(z, zzb, zzai(z, zzb));
    }

    public final boolean zzM() {
        zzaf();
        return this.zze.zzm();
    }

    public final void zzN() {
        AudioTrack audioTrack;
        zzaf();
        if (zzamq.zza < 21 && (audioTrack = this.zzq) != null) {
            audioTrack.release();
            this.zzq = null;
        }
        this.zzl.zze();
        this.zzk.zzc();
        this.zze.zzs();
        this.zzi.zzd();
        Surface surface = this.zzs;
        if (surface != null) {
            surface.release();
            this.zzs = null;
        }
        this.zzC = Collections.emptyList();
    }

    public final int zzO() {
        zzaf();
        this.zze.zzE();
        return 2;
    }

    public final long zzP() {
        zzaf();
        return this.zze.zzw();
    }

    public final long zzQ() {
        zzaf();
        return this.zze.zzy();
    }

    @Deprecated
    public final void zzR(boolean z) {
        this.zzD = false;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzn() {
        zzaf();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final boolean zzo() {
        zzaf();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final void zzp(int i2, long j2) {
        zzaf();
        this.zzi.zzf();
        this.zze.zzp(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    @Deprecated
    public final void zzq(boolean z) {
        zzaf();
        this.zzk.zzb(zzM(), 1);
        this.zze.zzr(false, null);
        this.zzC = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzu() {
        zzaf();
        return this.zze.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzv() {
        zzaf();
        return this.zze.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzx() {
        zzaf();
        return this.zze.zzx();
    }

    public final void zzy(Surface surface) {
        zzaf();
        zzab(surface);
        int i2 = surface == null ? 0 : -1;
        zzac(i2, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzz() {
        zzaf();
        return this.zze.zzz();
    }
}
