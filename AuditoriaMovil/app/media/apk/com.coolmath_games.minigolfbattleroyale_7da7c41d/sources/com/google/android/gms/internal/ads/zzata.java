package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    private final void zzo(long j, byte[] bArr, int i) {
        zzp(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zze.zza);
            int min = Math.min(i - i2, 65536 - i3);
            zzatw zzatwVar = this.zze.zzd;
            System.arraycopy(zzatwVar.zza, i3, bArr, i2, min);
            j += min;
            i2 += min;
            if (j == this.zze.zzb) {
                this.zzl.zzd(zzatwVar);
                zzasy zzasyVar = this.zze;
                zzasyVar.zzd = null;
                this.zze = zzasyVar.zze;
            }
        }
    }

    private final void zzp(long j) {
        while (true) {
            zzasy zzasyVar = this.zze;
            if (j < zzasyVar.zzb) {
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
            int i = (zzasyVar2.zzc ? 1 : 0) + (((int) (zzasyVar2.zza - zzasyVar.zza)) / 65536);
            zzatw[] zzatwVarArr = new zzatw[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzatwVarArr[i2] = zzasyVar.zzd;
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

    private final int zzt(int i) {
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
        return Math.min(i, 65536 - this.zzj);
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
    public final void zzb(zzaux zzauxVar, int i) {
        if (zzq()) {
            while (i > 0) {
                int zzt = zzt(i);
                zzauxVar.zzk(this.zzf.zzd.zza, this.zzj, zzt);
                this.zzj += zzt;
                this.zzi += zzt;
                i -= zzt;
            }
            zzr();
            return;
        }
        zzauxVar.zzj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final void zzc(long j, int i, int i2, int i3, zzapw zzapwVar) {
        if (zzq()) {
            try {
                this.zza.zzk(j, i, this.zzi - i2, i2, zzapwVar);
                return;
            } finally {
                zzr();
            }
        }
        this.zza.zzl(j);
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final int zzd(zzapn zzapnVar, int i, boolean z) throws IOException, InterruptedException {
        if (!zzq()) {
            int zzc = zzapnVar.zzc(i);
            if (zzc != -1) {
                return zzc;
            }
            throw new EOFException();
        }
        try {
            int zza = zzapnVar.zza(this.zzf.zzd.zza, this.zzj, zzt(i));
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

    public final boolean zzl(long j, boolean z) {
        long zzi = this.zza.zzi(j, z);
        if (zzi == -1) {
            return false;
        }
        zzp(zzi);
        return true;
    }

    public final int zzm(zzann zzannVar, zzapg zzapgVar, boolean z, boolean z2, long j) {
        int zzg = this.zza.zzg(zzannVar, zzapgVar, z, z2, this.zzg, this.zzb);
        if (zzg == -5) {
            this.zzg = zzannVar.zza;
            return -5;
        } else if (zzg != -4) {
            return -3;
        } else {
            if (!zzapgVar.zzc()) {
                if (zzapgVar.zzc < j) {
                    zzapgVar.zzf(Integer.MIN_VALUE);
                }
                if (zzapgVar.zzi()) {
                    zzasw zzaswVar = this.zzb;
                    long j2 = zzaswVar.zzb;
                    int i = 1;
                    this.zzc.zza(1);
                    zzo(j2, this.zzc.zza, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzc.zza[0];
                    int i2 = b & ByteCompanionObject.MIN_VALUE;
                    int i3 = b & ByteCompanionObject.MAX_VALUE;
                    zzape zzapeVar = zzapgVar.zza;
                    if (zzapeVar.zza == null) {
                        zzapeVar.zza = new byte[16];
                    }
                    zzo(j3, zzapeVar.zza, i3);
                    long j4 = j3 + i3;
                    if (i2 != 0) {
                        this.zzc.zza(2);
                        zzo(j4, this.zzc.zza, 2);
                        j4 += 2;
                        i = this.zzc.zzm();
                    }
                    int i4 = i;
                    zzape zzapeVar2 = zzapgVar.zza;
                    int[] iArr = zzapeVar2.zzd;
                    if (iArr == null || iArr.length < i4) {
                        iArr = new int[i4];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzapeVar2.zze;
                    if (iArr3 == null || iArr3.length < i4) {
                        iArr3 = new int[i4];
                    }
                    int[] iArr4 = iArr3;
                    if (i2 != 0) {
                        int i5 = i4 * 6;
                        this.zzc.zza(i5);
                        zzo(j4, this.zzc.zza, i5);
                        j4 += i5;
                        this.zzc.zzi(0);
                        for (int i6 = 0; i6 < i4; i6++) {
                            iArr2[i6] = this.zzc.zzm();
                            iArr4[i6] = this.zzc.zzu();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzaswVar.zza - ((int) (j4 - zzaswVar.zzb));
                    }
                    zzapw zzapwVar = zzaswVar.zzd;
                    zzape zzapeVar3 = zzapgVar.zza;
                    byte[] bArr = zzapwVar.zzb;
                    byte[] bArr2 = zzapeVar3.zza;
                    int i7 = zzapwVar.zza;
                    zzapeVar3.zza(i4, iArr2, iArr4, bArr, bArr2, 1);
                    long j5 = zzaswVar.zzb;
                    int i8 = (int) (j4 - j5);
                    zzaswVar.zzb = j5 + i8;
                    zzaswVar.zza -= i8;
                }
                zzapgVar.zzh(this.zzb.zza);
                zzasw zzaswVar2 = this.zzb;
                long j6 = zzaswVar2.zzb;
                ByteBuffer byteBuffer = zzapgVar.zzb;
                int i9 = zzaswVar2.zza;
                zzp(j6);
                while (i9 > 0) {
                    int i10 = (int) (j6 - this.zze.zza);
                    int min = Math.min(i9, 65536 - i10);
                    zzatw zzatwVar = this.zze.zzd;
                    byteBuffer.put(zzatwVar.zza, i10, min);
                    j6 += min;
                    i9 -= min;
                    if (j6 == this.zze.zzb) {
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
