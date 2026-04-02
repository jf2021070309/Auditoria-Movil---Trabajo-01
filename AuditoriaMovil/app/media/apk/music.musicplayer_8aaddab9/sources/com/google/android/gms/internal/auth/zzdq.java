package com.google.android.gms.internal.auth;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzdq {
    public static int zza(byte[] bArr, int i2, zzdp zzdpVar) throws zzew {
        int zzj = zzj(bArr, i2, zzdpVar);
        int i3 = zzdpVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - zzj) {
                if (i3 == 0) {
                    zzdpVar.zzc = zzeb.zzb;
                    return zzj;
                }
                zzdpVar.zzc = zzeb.zzk(bArr, zzj, i3);
                return zzj + i3;
            }
            throw zzew.zzf();
        }
        throw zzew.zzc();
    }

    public static int zzb(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int zzc(zzgb zzgbVar, byte[] bArr, int i2, int i3, int i4, zzdp zzdpVar) throws IOException {
        zzft zzftVar = (zzft) zzgbVar;
        Object zzd = zzftVar.zzd();
        int zzb = zzftVar.zzb(zzd, bArr, i2, i3, i4, zzdpVar);
        zzftVar.zze(zzd);
        zzdpVar.zzc = zzd;
        return zzb;
    }

    public static int zzd(zzgb zzgbVar, byte[] bArr, int i2, int i3, zzdp zzdpVar) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = zzk(i5, bArr, i4, zzdpVar);
            i5 = zzdpVar.zza;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw zzew.zzf();
        }
        Object zzd = zzgbVar.zzd();
        int i7 = i5 + i6;
        zzgbVar.zzg(zzd, bArr, i6, i7, zzdpVar);
        zzgbVar.zze(zzd);
        zzdpVar.zzc = zzd;
        return i7;
    }

    public static int zze(zzgb<?> zzgbVar, int i2, byte[] bArr, int i3, int i4, zzeu<?> zzeuVar, zzdp zzdpVar) throws IOException {
        int zzd = zzd(zzgbVar, bArr, i3, i4, zzdpVar);
        zzeuVar.add(zzdpVar.zzc);
        while (zzd < i4) {
            int zzj = zzj(bArr, zzd, zzdpVar);
            if (i2 != zzdpVar.zza) {
                break;
            }
            zzd = zzd(zzgbVar, bArr, zzj, i4, zzdpVar);
            zzeuVar.add(zzdpVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i2, zzeu<?> zzeuVar, zzdp zzdpVar) throws IOException {
        zzer zzerVar = (zzer) zzeuVar;
        int zzj = zzj(bArr, i2, zzdpVar);
        int i3 = zzdpVar.zza + zzj;
        while (zzj < i3) {
            zzj = zzj(bArr, zzj, zzdpVar);
            zzerVar.zze(zzdpVar.zza);
        }
        if (zzj == i3) {
            return zzj;
        }
        throw zzew.zzf();
    }

    public static int zzg(byte[] bArr, int i2, zzdp zzdpVar) throws zzew {
        int zzj = zzj(bArr, i2, zzdpVar);
        int i3 = zzdpVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzdpVar.zzc = "";
                return zzj;
            }
            zzdpVar.zzc = new String(bArr, zzj, i3, zzev.zza);
            return zzj + i3;
        }
        throw zzew.zzc();
    }

    public static int zzh(byte[] bArr, int i2, zzdp zzdpVar) throws zzew {
        int zzj = zzj(bArr, i2, zzdpVar);
        int i3 = zzdpVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzdpVar.zzc = "";
                return zzj;
            }
            zzdpVar.zzc = zzhd.zzb(bArr, zzj, i3);
            return zzj + i3;
        }
        throw zzew.zzc();
    }

    public static int zzi(int i2, byte[] bArr, int i3, int i4, zzgq zzgqVar, zzdp zzdpVar) throws zzew {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int zzm = zzm(bArr, i3, zzdpVar);
                zzgqVar.zzf(i2, Long.valueOf(zzdpVar.zzb));
                return zzm;
            } else if (i5 == 1) {
                zzgqVar.zzf(i2, Long.valueOf(zzn(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int zzj = zzj(bArr, i3, zzdpVar);
                int i6 = zzdpVar.zza;
                if (i6 >= 0) {
                    if (i6 <= bArr.length - zzj) {
                        if (i6 == 0) {
                            zzgqVar.zzf(i2, zzeb.zzb);
                        } else {
                            zzgqVar.zzf(i2, zzeb.zzk(bArr, zzj, i6));
                        }
                        return zzj + i6;
                    }
                    throw zzew.zzf();
                }
                throw zzew.zzc();
            } else if (i5 != 3) {
                if (i5 == 5) {
                    zzgqVar.zzf(i2, Integer.valueOf(zzb(bArr, i3)));
                    return i3 + 4;
                }
                throw zzew.zza();
            } else {
                int i7 = (i2 & (-8)) | 4;
                zzgq zzc = zzgq.zzc();
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i3, zzdpVar);
                    int i9 = zzdpVar.zza;
                    if (i9 == i7) {
                        i8 = i9;
                        i3 = zzj2;
                        break;
                    }
                    i8 = i9;
                    i3 = zzi(i9, bArr, zzj2, i4, zzc, zzdpVar);
                }
                if (i3 > i4 || i8 != i7) {
                    throw zzew.zzd();
                }
                zzgqVar.zzf(i2, zzc);
                return i3;
            }
        }
        throw zzew.zza();
    }

    public static int zzj(byte[] bArr, int i2, zzdp zzdpVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            zzdpVar.zza = b2;
            return i3;
        }
        return zzk(b2, bArr, i3, zzdpVar);
    }

    public static int zzk(int i2, byte[] bArr, int i3, zzdp zzdpVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzdpVar.zza = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            zzdpVar.zza = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzdpVar.zza = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzdpVar.zza = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzdpVar.zza = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int zzl(int i2, byte[] bArr, int i3, int i4, zzeu<?> zzeuVar, zzdp zzdpVar) {
        zzer zzerVar = (zzer) zzeuVar;
        int zzj = zzj(bArr, i3, zzdpVar);
        zzerVar.zze(zzdpVar.zza);
        while (zzj < i4) {
            int zzj2 = zzj(bArr, zzj, zzdpVar);
            if (i2 != zzdpVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzdpVar);
            zzerVar.zze(zzdpVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i2, zzdp zzdpVar) {
        byte b2;
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzdpVar.zzb = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        long j3 = (j2 & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b3 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (b2 & Byte.MAX_VALUE) << i5;
            b3 = bArr[i4];
            i4 = i6;
        }
        zzdpVar.zzb = j3;
        return i4;
    }

    public static long zzn(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }
}
