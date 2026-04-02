package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzgip {
    private static final zzgip zza = new zzgip(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgip() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgip(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgip zza() {
        return zza;
    }

    public static zzgip zzb() {
        return new zzgip(0, new int[8], new Object[8], true);
    }

    public static zzgip zzc(zzgip zzgipVar, zzgip zzgipVar2) {
        int i2 = zzgipVar.zzb + zzgipVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgipVar.zzc, i2);
        System.arraycopy(zzgipVar2.zzc, 0, copyOf, zzgipVar.zzb, zzgipVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgipVar.zzd, i2);
        System.arraycopy(zzgipVar2.zzd, 0, copyOf2, zzgipVar.zzb, zzgipVar2.zzb);
        return new zzgip(i2, copyOf, copyOf2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzgip)) {
            zzgip zzgipVar = (zzgip) obj;
            int i2 = this.zzb;
            if (i2 == zzgipVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzgipVar.zzc;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzgipVar.zzd;
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

    public final void zzd() {
        this.zzf = false;
    }

    public final int zze() {
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                int zzx = zzgfh.zzx(8);
                int zzc = ((zzgex) this.zzd[i4]).zzc();
                i3 += zzgfh.zzx(zzc) + zzc + zzgfh.zzx(24) + zzgfh.zzx(i5 >>> 3) + zzgfh.zzx(16) + zzx + zzx;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final int zzf() {
        int zzx;
        int zzy;
        int zzx2;
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
                        zzx2 = zzgfh.zzx(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int zzx3 = zzgfh.zzx(i6 << 3);
                        int zzc = ((zzgex) this.zzd[i4]).zzc();
                        i3 = zzgfh.zzx(zzc) + zzc + zzx3 + i3;
                    } else if (i7 == 3) {
                        int zzv = zzgfh.zzv(i6);
                        zzx = zzv + zzv;
                        zzy = ((zzgip) this.zzd[i4]).zzf();
                    } else if (i7 != 5) {
                        throw new IllegalStateException(zzggm.zzi());
                    } else {
                        ((Integer) this.zzd[i4]).intValue();
                        zzx2 = zzgfh.zzx(i6 << 3) + 4;
                    }
                    i3 = zzx2 + i3;
                } else {
                    long longValue = ((Long) this.zzd[i4]).longValue();
                    zzx = zzgfh.zzx(i6 << 3);
                    zzy = zzgfh.zzy(longValue);
                }
                i3 = zzy + zzx + i3;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final void zzg(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzghk.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
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

    public final void zzi(zzgfi zzgfiVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    zzgfiVar.zzc(i4, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    zzgfiVar.zzj(i4, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    zzgfiVar.zzn(i4, (zzgex) obj);
                } else if (i5 == 3) {
                    zzgfiVar.zzt(i4);
                    ((zzgip) obj).zzi(zzgfiVar);
                    zzgfiVar.zzu(i4);
                } else if (i5 != 5) {
                    throw new RuntimeException(zzggm.zzi());
                } else {
                    zzgfiVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
