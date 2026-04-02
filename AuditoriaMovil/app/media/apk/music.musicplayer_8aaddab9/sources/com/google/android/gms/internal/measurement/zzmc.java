package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class zzmc {
    private static final zzmc zza = new zzmc(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmc() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmc(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzmc zzc() {
        return zza;
    }

    public static zzmc zzd(zzmc zzmcVar, zzmc zzmcVar2) {
        int i2 = zzmcVar.zzb + zzmcVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmcVar.zzc, i2);
        System.arraycopy(zzmcVar2.zzc, 0, copyOf, zzmcVar.zzb, zzmcVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmcVar.zzd, i2);
        System.arraycopy(zzmcVar2.zzd, 0, copyOf2, zzmcVar.zzb, zzmcVar2.zzb);
        return new zzmc(i2, copyOf, copyOf2, true);
    }

    public static zzmc zze() {
        return new zzmc(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzmc)) {
            zzmc zzmcVar = (zzmc) obj;
            int i2 = this.zzb;
            if (i2 == zzmcVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzmcVar.zzc;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzmcVar.zzd;
                        int i4 = this.zzb;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (objArr[i5].equals(objArr2[i5])) {
                            }
                        }
                        return true;
                    } else if (iArr[i3] != iArr2[i3]) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.zzc;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.zzd;
        int i8 = this.zzb;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int zzA2;
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.zzd[i4]).longValue();
                        zzA2 = zzje.zzA(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int zzA3 = zzje.zzA(i6 << 3);
                        int zzd = ((zzix) this.zzd[i4]).zzd();
                        i3 = zzje.zzA(zzd) + zzd + zzA3 + i3;
                    } else if (i7 == 3) {
                        int zzz = zzje.zzz(i6);
                        zzA = zzz + zzz;
                        zzB = ((zzmc) this.zzd[i4]).zza();
                    } else if (i7 != 5) {
                        throw new IllegalStateException(zzkh.zza());
                    } else {
                        ((Integer) this.zzd[i4]).intValue();
                        zzA2 = zzje.zzA(i6 << 3) + 4;
                    }
                    i3 = zzA2 + i3;
                } else {
                    long longValue = ((Long) this.zzd[i4]).longValue();
                    zzA = zzje.zzA(i6 << 3);
                    zzB = zzje.zzB(longValue);
                }
                i3 = zzB + zzA + i3;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                int zzA = zzje.zzA(8);
                int zzd = ((zzix) this.zzd[i4]).zzd();
                i3 += zzje.zzA(zzd) + zzd + zzje.zzA(24) + zzje.zzA(i5 >>> 3) + zzje.zzA(16) + zzA + zzA;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzle.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    public final void zzh(int i2, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.zzb;
        int[] iArr = this.zzc;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.zzc = Arrays.copyOf(iArr, i4);
            this.zzd = Arrays.copyOf(this.zzd, i4);
        }
        int[] iArr2 = this.zzc;
        int i5 = this.zzb;
        iArr2[i5] = i2;
        this.zzd[i5] = obj;
        this.zzb = i5 + 1;
    }

    public final void zzi(zzjf zzjfVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    zzjfVar.zzt(i4, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    zzjfVar.zzm(i4, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    zzjfVar.zzd(i4, (zzix) obj);
                } else if (i5 == 3) {
                    zzjfVar.zzE(i4);
                    ((zzmc) obj).zzi(zzjfVar);
                    zzjfVar.zzh(i4);
                } else if (i5 != 5) {
                    throw new RuntimeException(zzkh.zza());
                } else {
                    zzjfVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
