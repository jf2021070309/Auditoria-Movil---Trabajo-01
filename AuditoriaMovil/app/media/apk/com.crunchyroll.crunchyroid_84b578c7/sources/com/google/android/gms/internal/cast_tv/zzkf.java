package com.google.android.gms.internal.cast_tv;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzkf {
    private static final zzkf zza = new zzkf(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzkf(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzkf zzc() {
        return zza;
    }

    public static zzkf zze(zzkf zzkfVar, zzkf zzkfVar2) {
        int i = zzkfVar.zzb + zzkfVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzkfVar.zzc, i);
        System.arraycopy(zzkfVar2.zzc, 0, copyOf, zzkfVar.zzb, zzkfVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzkfVar.zzd, i);
        System.arraycopy(zzkfVar2.zzd, 0, copyOf2, zzkfVar.zzb, zzkfVar2.zzb);
        return new zzkf(i, copyOf, copyOf2, true);
    }

    public static zzkf zzf() {
        return new zzkf(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzkf)) {
            return false;
        }
        zzkf zzkfVar = (zzkf) obj;
        int i = this.zzb;
        if (i == zzkfVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzkfVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzkfVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    public final int zza() {
        int zzz;
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
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.zzd[i4]).intValue();
                                    i = zzhc.zzy(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzie.zza());
                                }
                            } else {
                                int i8 = i6 << 3;
                                int i9 = zzhc.zzb;
                                zzz = ((zzkf) this.zzd[i4]).zza();
                                int zzy2 = zzhc.zzy(i8);
                                zzy = zzy2 + zzy2;
                            }
                        } else {
                            int i10 = zzhc.zzb;
                            int zzd = ((zzgu) this.zzd[i4]).zzd();
                            i = zzhc.zzy(i6 << 3) + zzhc.zzy(zzd) + zzd;
                        }
                    } else {
                        ((Long) this.zzd[i4]).longValue();
                        i = zzhc.zzy(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    int i11 = i6 << 3;
                    zzz = zzhc.zzz(((Long) this.zzd[i4]).longValue());
                    zzy = zzhc.zzy(i11);
                }
                i = zzy + zzz;
                i3 += i;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzb; i3++) {
                int i4 = zzhc.zzb;
                int zzd = ((zzgu) this.zzd[i3]).zzd();
                int zzy = zzhc.zzy(zzd) + zzd;
                int zzy2 = zzhc.zzy(16);
                int zzy3 = zzhc.zzy(this.zzc[i3] >>> 3);
                int zzy4 = zzhc.zzy(8);
                i2 += zzhc.zzy(24) + zzy + zzy2 + zzy3 + zzy4 + zzy4;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    public final zzkf zzd(zzkf zzkfVar) {
        if (zzkfVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzkfVar.zzb;
        zzl(i);
        System.arraycopy(zzkfVar.zzc, 0, this.zzc, this.zzb, zzkfVar.zzb);
        System.arraycopy(zzkfVar.zzd, 0, this.zzd, this.zzb, zzkfVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzje.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzkw zzkwVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    zzkwVar.zzk(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzie.zza());
                                }
                            } else {
                                zzkwVar.zzF(i4);
                                ((zzkf) obj).zzk(zzkwVar);
                                zzkwVar.zzh(i4);
                            }
                        } else {
                            zzkwVar.zzd(i4, (zzgu) obj);
                        }
                    } else {
                        zzkwVar.zzm(i4, ((Long) obj).longValue());
                    }
                } else {
                    zzkwVar.zzt(i4, ((Long) obj).longValue());
                }
            }
        }
    }

    private zzkf() {
        this(0, new int[8], new Object[8], true);
    }
}
