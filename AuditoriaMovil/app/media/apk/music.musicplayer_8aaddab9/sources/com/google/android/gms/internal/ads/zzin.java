package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzin {
    private final zzamf zza = new zzamf(32);
    private zzim zzb;
    private zzim zzc;
    private zzim zzd;
    private long zze;
    private final zzko zzf;

    public zzin(zzko zzkoVar, byte[] bArr) {
        this.zzf = zzkoVar;
        zzim zzimVar = new zzim(0L, 65536);
        this.zzb = zzimVar;
        this.zzc = zzimVar;
        this.zzd = zzimVar;
    }

    private final int zzi(int i2) {
        zzim zzimVar = this.zzd;
        if (!zzimVar.zzc) {
            zzkb zzc = this.zzf.zzc();
            zzim zzimVar2 = new zzim(this.zzd.zzb, 65536);
            zzimVar.zzd = zzc;
            zzimVar.zze = zzimVar2;
            zzimVar.zzc = true;
        }
        return Math.min(i2, (int) (this.zzd.zzb - this.zze));
    }

    private final void zzj(int i2) {
        long j2 = this.zze + i2;
        this.zze = j2;
        zzim zzimVar = this.zzd;
        if (j2 == zzimVar.zzb) {
            this.zzd = zzimVar.zze;
        }
    }

    private static zzim zzk(zzim zzimVar, zzaf zzafVar, zziq zziqVar, zzamf zzamfVar) {
        zzim zzimVar2;
        int i2;
        if (zzafVar.zzj()) {
            long j2 = zziqVar.zzb;
            zzamfVar.zza(1);
            zzim zzm = zzm(zzimVar, j2, zzamfVar.zzi(), 1);
            long j3 = j2 + 1;
            byte b2 = zzamfVar.zzi()[0];
            int i3 = b2 & 128;
            int i4 = b2 & Byte.MAX_VALUE;
            zzac zzacVar = zzafVar.zza;
            byte[] bArr = zzacVar.zza;
            if (bArr == null) {
                zzacVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zzimVar2 = zzm(zzm, j3, zzacVar.zza, i4);
            long j4 = j3 + i4;
            if (i3 != 0) {
                zzamfVar.zza(2);
                zzimVar2 = zzm(zzimVar2, j4, zzamfVar.zzi(), 2);
                j4 += 2;
                i2 = zzamfVar.zzo();
            } else {
                i2 = 1;
            }
            int[] iArr = zzacVar.zzc;
            if (iArr == null || iArr.length < i2) {
                iArr = new int[i2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzacVar.zzd;
            if (iArr3 == null || iArr3.length < i2) {
                iArr3 = new int[i2];
            }
            int[] iArr4 = iArr3;
            if (i3 != 0) {
                int i5 = i2 * 6;
                zzamfVar.zza(i5);
                zzimVar2 = zzm(zzimVar2, j4, zzamfVar.zzi(), i5);
                j4 += i5;
                zzamfVar.zzh(0);
                for (int i6 = 0; i6 < i2; i6++) {
                    iArr2[i6] = zzamfVar.zzo();
                    iArr4[i6] = zzamfVar.zzB();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zziqVar.zza - ((int) (j4 - zziqVar.zzb));
            }
            zzow zzowVar = zziqVar.zzc;
            int i7 = zzamq.zza;
            zzacVar.zza(i2, iArr2, iArr4, zzowVar.zzb, zzacVar.zza, zzowVar.zza, zzowVar.zzc, zzowVar.zzd);
            long j5 = zziqVar.zzb;
            int i8 = (int) (j4 - j5);
            zziqVar.zzb = j5 + i8;
            zziqVar.zza -= i8;
        } else {
            zzimVar2 = zzimVar;
        }
        if (!zzafVar.zze()) {
            zzafVar.zzi(zziqVar.zza);
            return zzl(zzimVar2, zziqVar.zzb, zzafVar.zzb, zziqVar.zza);
        }
        zzamfVar.zza(4);
        zzim zzm2 = zzm(zzimVar2, zziqVar.zzb, zzamfVar.zzi(), 4);
        int zzB = zzamfVar.zzB();
        zziqVar.zzb += 4;
        zziqVar.zza -= 4;
        zzafVar.zzi(zzB);
        zzim zzl = zzl(zzm2, zziqVar.zzb, zzafVar.zzb, zzB);
        zziqVar.zzb += zzB;
        int i9 = zziqVar.zza - zzB;
        zziqVar.zza = i9;
        ByteBuffer byteBuffer = zzafVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            zzafVar.zze = ByteBuffer.allocate(i9);
        } else {
            zzafVar.zze.clear();
        }
        return zzl(zzl, zziqVar.zzb, zzafVar.zze, zziqVar.zza);
    }

    private static zzim zzl(zzim zzimVar, long j2, ByteBuffer byteBuffer, int i2) {
        zzim zzn = zzn(zzimVar, j2);
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzn.zzb - j2));
            byteBuffer.put(zzn.zzd.zza, zzn.zza(j2), min);
            i2 -= min;
            j2 += min;
            if (j2 == zzn.zzb) {
                zzn = zzn.zze;
            }
        }
        return zzn;
    }

    private static zzim zzm(zzim zzimVar, long j2, byte[] bArr, int i2) {
        zzim zzn = zzn(zzimVar, j2);
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (zzn.zzb - j2));
            System.arraycopy(zzn.zzd.zza, zzn.zza(j2), bArr, i2 - i3, min);
            i3 -= min;
            j2 += min;
            if (j2 == zzn.zzb) {
                zzn = zzn.zze;
            }
        }
        return zzn;
    }

    private static zzim zzn(zzim zzimVar, long j2) {
        while (j2 >= zzimVar.zzb) {
            zzimVar = zzimVar.zze;
        }
        return zzimVar;
    }

    public final void zza() {
        zzim zzimVar = this.zzb;
        if (zzimVar.zzc) {
            zzim zzimVar2 = this.zzd;
            int i2 = (((int) (zzimVar2.zza - zzimVar.zza)) / 65536) + (zzimVar2.zzc ? 1 : 0);
            zzkb[] zzkbVarArr = new zzkb[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                zzkbVarArr[i3] = zzimVar.zzd;
                zzimVar = zzimVar.zzb();
            }
            this.zzf.zze(zzkbVarArr);
        }
        zzim zzimVar3 = new zzim(0L, 65536);
        this.zzb = zzimVar3;
        this.zzc = zzimVar3;
        this.zzd = zzimVar3;
        this.zze = 0L;
        this.zzf.zzf();
    }

    public final void zzb() {
        this.zzc = this.zzb;
    }

    public final void zzc(zzaf zzafVar, zziq zziqVar) {
        this.zzc = zzk(this.zzc, zzafVar, zziqVar, this.zza);
    }

    public final void zzd(zzaf zzafVar, zziq zziqVar) {
        zzk(this.zzc, zzafVar, zziqVar, this.zza);
    }

    public final void zze(long j2) {
        zzim zzimVar;
        if (j2 != -1) {
            while (true) {
                zzimVar = this.zzb;
                if (j2 < zzimVar.zzb) {
                    break;
                }
                this.zzf.zzd(zzimVar.zzd);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzimVar.zza) {
                this.zzc = zzimVar;
            }
        }
    }

    public final long zzf() {
        return this.zze;
    }

    public final int zzg(zzah zzahVar, int i2, boolean z) throws IOException {
        int zzi = zzi(i2);
        zzim zzimVar = this.zzd;
        int zzg = zzahVar.zzg(zzimVar.zzd.zza, zzimVar.zza(this.zze), zzi);
        if (zzg != -1) {
            zzj(zzg);
            return zzg;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void zzh(zzamf zzamfVar, int i2) {
        while (i2 > 0) {
            int zzi = zzi(i2);
            zzim zzimVar = this.zzd;
            zzamfVar.zzm(zzimVar.zzd.zza, zzimVar.zza(this.zze), zzi);
            i2 -= zzi;
            zzj(zzi);
        }
    }
}
