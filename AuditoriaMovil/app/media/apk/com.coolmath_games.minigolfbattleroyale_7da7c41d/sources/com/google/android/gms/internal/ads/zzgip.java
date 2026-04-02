package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    private zzgip(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgip zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgip zzb() {
        return new zzgip(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgip zzc(zzgip zzgipVar, zzgip zzgipVar2) {
        int i = zzgipVar.zzb + zzgipVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgipVar.zzc, i);
        System.arraycopy(zzgipVar2.zzc, 0, copyOf, zzgipVar.zzb, zzgipVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgipVar.zzd, i);
        System.arraycopy(zzgipVar2.zzd, 0, copyOf2, zzgipVar.zzb, zzgipVar2.zzb);
        return new zzgip(i, copyOf, copyOf2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzgip)) {
            zzgip zzgipVar = (zzgip) obj;
            int i = this.zzb;
            if (i == zzgipVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzgipVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzgipVar.zzd;
                        int i3 = this.zzb;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzd() {
        this.zzf = false;
    }

    public final int zze() {
        int i = this.zze;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzb; i3++) {
                int i4 = this.zzc[i3];
                int zzx = zzgfh.zzx(8);
                int zzc = ((zzgex) this.zzd[i3]).zzc();
                i2 += zzx + zzx + zzgfh.zzx(16) + zzgfh.zzx(i4 >>> 3) + zzgfh.zzx(24) + zzgfh.zzx(zzc) + zzc;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    public final int zzf() {
        int zzx;
        int zzy;
        int i;
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
                        i = zzgfh.zzx(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int zzx2 = zzgfh.zzx(i6 << 3);
                        int zzc = ((zzgex) this.zzd[i4]).zzc();
                        i3 += zzx2 + zzgfh.zzx(zzc) + zzc;
                    } else if (i7 == 3) {
                        int zzv = zzgfh.zzv(i6);
                        zzx = zzv + zzv;
                        zzy = ((zzgip) this.zzd[i4]).zzf();
                    } else if (i7 == 5) {
                        ((Integer) this.zzd[i4]).intValue();
                        i = zzgfh.zzx(i6 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzggm.zzi());
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.zzd[i4]).longValue();
                    zzx = zzgfh.zzx(i6 << 3);
                    zzy = zzgfh.zzy(longValue);
                }
                i = zzx + zzy;
                i3 += i;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzghk.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(int i, Object obj) {
        if (this.zzf) {
            int i2 = this.zzb;
            int[] iArr = this.zzc;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.zzc = Arrays.copyOf(iArr, i3);
                this.zzd = Arrays.copyOf(this.zzd, i3);
            }
            int[] iArr2 = this.zzc;
            int i4 = this.zzb;
            iArr2[i4] = i;
            this.zzd[i4] = obj;
            this.zzb = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzi(zzgfi zzgfiVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zzgfiVar.zzc(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzgfiVar.zzj(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzgfiVar.zzn(i3, (zzgex) obj);
                } else if (i4 == 3) {
                    zzgfiVar.zzt(i3);
                    ((zzgip) obj).zzi(zzgfiVar);
                    zzgfiVar.zzu(i3);
                } else if (i4 == 5) {
                    zzgfiVar.zzk(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzggm.zzi());
                }
            }
        }
    }
}
