package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class zzata implements zzapx {
    private zzasy zze;
    private zzasy zzf;
    private zzanm zzg;
    private zzanm zzh;
    private long zzi;
    private zzasz zzk;
    private final zzauc zzl;
    private final zzasx zza = new zzasx();
    private final zzasw zzb = new zzasw();
    private final zzaux zzc = new zzaux(32);
    private final AtomicInteger zzd = new AtomicInteger();
    private int zzj = 65536;

    public zzata(zzauc zzaucVar, byte[] bArr) {
        this.zzl = zzaucVar;
        zzasy zzasyVar = new zzasy(0L, 65536);
        this.zze = zzasyVar;
        this.zzf = zzasyVar;
    }

    private final void zzo(long j2, byte[] bArr, int i2) {
        zzp(j2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (int) (j2 - this.zze.zza);
            int min = Math.min(i2 - i3, 65536 - i4);
            zzatw zzatwVar = this.zze.zzd;
            System.arraycopy(zzatwVar.zza, i4, bArr, i3, min);
            j2 += min;
            i3 += min;
            if (j2 == this.zze.zzb) {
                this.zzl.zzd(zzatwVar);
                zzasy zzasyVar = this.zze;
                zzasyVar.zzd = null;
                this.zze = zzasyVar.zze;
            }
        }
    }

    private final void zzp(long j2) {
        while (true) {
            zzasy zzasyVar = this.zze;
            if (j2 < zzasyVar.zzb) {
                return;
            }
            this.zzl.zzd(zzasyVar.zzd);
            zzasy zzasyVar2 = this.zze;
            zzasyVar2.zzd = null;
            this.zze = zzasyVar2.zze;
        }
    }

    private final boolean zzq() {
        return this.zzd.compareAndSet(0, 1);
    }

    private final void zzr() {
        if (this.zzd.compareAndSet(1, 0)) {
            return;
        }
        zzs();
    }

    private final void zzs() {
        this.zza.zza();
        zzasy zzasyVar = this.zze;
        if (zzasyVar.zzc) {
            zzasy zzasyVar2 = this.zzf;
            int i2 = (((int) (zzasyVar2.zza - zzasyVar.zza)) / 65536) + (zzasyVar2.zzc ? 1 : 0);
            zzatw[] zzatwVarArr = new zzatw[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                zzatwVarArr[i3] = zzasyVar.zzd;
                zzasyVar.zzd = null;
                zzasyVar = zzasyVar.zze;
            }
            this.zzl.zze(zzatwVarArr);
        }
        zzasy zzasyVar3 = new zzasy(0L, 65536);
        this.zze = zzasyVar3;
        this.zzf = zzasyVar3;
        this.zzi = 0L;
        this.zzj = 65536;
        this.zzl.zzf();
    }

    private final int zzt(int i2) {
        if (this.zzj == 65536) {
            this.zzj = 0;
            zzasy zzasyVar = this.zzf;
            if (zzasyVar.zzc) {
                this.zzf = zzasyVar.zze;
            }
            zzasy zzasyVar2 = this.zzf;
            zzatw zzc = this.zzl.zzc();
            zzasy zzasyVar3 = new zzasy(this.zzf.zzb, 65536);
            zzasyVar2.zzd = zzc;
            zzasyVar2.zze = zzasyVar3;
            zzasyVar2.zzc = true;
        }
        return Math.min(i2, 65536 - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final void zza(zzanm zzanmVar) {
        zzanm zzanmVar2 = zzanmVar == null ? null : zzanmVar;
        boolean zzj = this.zza.zzj(zzanmVar2);
        this.zzh = zzanmVar;
        zzasz zzaszVar = this.zzk;
        if (zzaszVar == null || !zzj) {
            return;
        }
        zzaszVar.zzw(zzanmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final void zzb(zzaux zzauxVar, int i2) {
        if (!zzq()) {
            zzauxVar.zzj(i2);
            return;
        }
        while (i2 > 0) {
            int zzt = zzt(i2);
            zzauxVar.zzk(this.zzf.zzd.zza, this.zzj, zzt);
            this.zzj += zzt;
            this.zzi += zzt;
            i2 -= zzt;
        }
        zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final void zzc(long j2, int i2, int i3, int i4, zzapw zzapwVar) {
        if (!zzq()) {
            this.zza.zzl(j2);
            return;
        }
        try {
            this.zza.zzk(j2, i2, this.zzi - i3, i3, zzapwVar);
        } finally {
            zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final int zzd(zzapn zzapnVar, int i2, boolean z) throws IOException, InterruptedException {
        if (!zzq()) {
            int zzc = zzapnVar.zzc(i2);
            if (zzc != -1) {
                return zzc;
            }
            throw new EOFException();
        }
        try {
            int zza = zzapnVar.zza(this.zzf.zzd.zza, this.zzj, zzt(i2));
            if (zza != -1) {
                this.zzj += zza;
                this.zzi += zza;
                return zza;
            }
            throw new EOFException();
        } finally {
            zzr();
        }
    }

    public final void zze(boolean z) {
        int andSet = this.zzd.getAndSet(true != z ? 2 : 0);
        zzs();
        this.zza.zzb();
        if (andSet == 2) {
            this.zzg = null;
        }
    }

    public final int zzf() {
        return this.zza.zzc();
    }

    public final void zzg() {
        if (this.zzd.getAndSet(2) == 0) {
            zzs();
        }
    }

    public final boolean zzh() {
        return this.zza.zzd();
    }

    public final zzanm zzi() {
        return this.zza.zze();
    }

    public final long zzj() {
        return this.zza.zzf();
    }

    public final void zzk() {
        long zzh = this.zza.zzh();
        if (zzh != -1) {
            zzp(zzh);
        }
    }

    public final boolean zzl(long j2, boolean z) {
        long zzi = this.zza.zzi(j2, z);
        if (zzi == -1) {
            return false;
        }
        zzp(zzi);
        return true;
    }

    public final int zzm(zzann zzannVar, zzapg zzapgVar, boolean z, boolean z2, long j2) {
        int i2;
        int zzg = this.zza.zzg(zzannVar, zzapgVar, z, z2, this.zzg, this.zzb);
        if (zzg == -5) {
            this.zzg = zzannVar.zza;
            return -5;
        } else if (zzg != -4) {
            return -3;
        } else {
            if (!zzapgVar.zzc()) {
                if (zzapgVar.zzc < j2) {
                    zzapgVar.zzf(Level.ALL_INT);
                }
                if (zzapgVar.zzi()) {
                    zzasw zzaswVar = this.zzb;
                    long j3 = zzaswVar.zzb;
                    this.zzc.zza(1);
                    zzo(j3, this.zzc.zza, 1);
                    long j4 = j3 + 1;
                    byte b2 = this.zzc.zza[0];
                    int i3 = b2 & 128;
                    int i4 = b2 & Byte.MAX_VALUE;
                    zzape zzapeVar = zzapgVar.zza;
                    if (zzapeVar.zza == null) {
                        zzapeVar.zza = new byte[16];
                    }
                    zzo(j4, zzapeVar.zza, i4);
                    long j5 = j4 + i4;
                    if (i3 != 0) {
                        this.zzc.zza(2);
                        zzo(j5, this.zzc.zza, 2);
                        j5 += 2;
                        i2 = this.zzc.zzm();
                    } else {
                        i2 = 1;
                    }
                    zzape zzapeVar2 = zzapgVar.zza;
                    int[] iArr = zzapeVar2.zzd;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzapeVar2.zze;
                    if (iArr3 == null || iArr3.length < i2) {
                        iArr3 = new int[i2];
                    }
                    int[] iArr4 = iArr3;
                    if (i3 != 0) {
                        int i5 = i2 * 6;
                        this.zzc.zza(i5);
                        zzo(j5, this.zzc.zza, i5);
                        j5 += i5;
                        this.zzc.zzi(0);
                        for (int i6 = 0; i6 < i2; i6++) {
                            iArr2[i6] = this.zzc.zzm();
                            iArr4[i6] = this.zzc.zzu();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzaswVar.zza - ((int) (j5 - zzaswVar.zzb));
                    }
                    zzapw zzapwVar = zzaswVar.zzd;
                    zzape zzapeVar3 = zzapgVar.zza;
                    zzapeVar3.zza(i2, iArr2, iArr4, zzapwVar.zzb, zzapeVar3.zza, 1);
                    long j6 = zzaswVar.zzb;
                    int i7 = (int) (j5 - j6);
                    zzaswVar.zzb = j6 + i7;
                    zzaswVar.zza -= i7;
                }
                zzapgVar.zzh(this.zzb.zza);
                zzasw zzaswVar2 = this.zzb;
                long j7 = zzaswVar2.zzb;
                ByteBuffer byteBuffer = zzapgVar.zzb;
                int i8 = zzaswVar2.zza;
                zzp(j7);
                while (i8 > 0) {
                    int i9 = (int) (j7 - this.zze.zza);
                    int min = Math.min(i8, 65536 - i9);
                    zzatw zzatwVar = this.zze.zzd;
                    byteBuffer.put(zzatwVar.zza, i9, min);
                    j7 += min;
                    i8 -= min;
                    if (j7 == this.zze.zzb) {
                        this.zzl.zzd(zzatwVar);
                        zzasy zzasyVar = this.zze;
                        zzasyVar.zzd = null;
                        this.zze = zzasyVar.zze;
                    }
                }
                zzp(this.zzb.zzc);
            }
            return -4;
        }
    }

    public final void zzn(zzasz zzaszVar) {
        this.zzk = zzaszVar;
    }
}
