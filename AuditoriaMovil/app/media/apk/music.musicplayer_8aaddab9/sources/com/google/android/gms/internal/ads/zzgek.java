package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzgek {
    public static int zza(byte[] bArr, int i2, zzgej zzgejVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            zzgejVar.zza = b2;
            return i3;
        }
        return zzb(b2, bArr, i3, zzgejVar);
    }

    public static int zzb(int i2, byte[] bArr, int i3, zzgej zzgejVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzgejVar.zza = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            zzgejVar.zza = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzgejVar.zza = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzgejVar.zza = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzgejVar.zza = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int zzc(byte[] bArr, int i2, zzgej zzgejVar) {
        byte b2;
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzgejVar.zzb = j2;
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
        zzgejVar.zzb = j3;
        return i4;
    }

    public static int zzd(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long zze(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public static int zzf(byte[] bArr, int i2, zzgej zzgejVar) throws zzggm {
        int zza = zza(bArr, i2, zzgejVar);
        int i3 = zzgejVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzgejVar.zzc = "";
                return zza;
            }
            zzgejVar.zzc = new String(bArr, zza, i3, zzggk.zza);
            return zza + i3;
        }
        throw zzggm.zze();
    }

    public static int zzg(byte[] bArr, int i2, zzgej zzgejVar) throws zzggm {
        int zza = zza(bArr, i2, zzgejVar);
        int i3 = zzgejVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzgejVar.zzc = "";
                return zza;
            }
            zzgejVar.zzc = zzgjd.zzj(bArr, zza, i3);
            return zza + i3;
        }
        throw zzggm.zze();
    }

    public static int zzh(byte[] bArr, int i2, zzgej zzgejVar) throws zzggm {
        int zza = zza(bArr, i2, zzgejVar);
        int i3 = zzgejVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - zza) {
                if (i3 == 0) {
                    zzgejVar.zzc = zzgex.zzb;
                    return zza;
                }
                zzgejVar.zzc = zzgex.zzs(bArr, zza, i3);
                return zza + i3;
            }
            throw zzggm.zzd();
        }
        throw zzggm.zze();
    }

    public static int zzi(zzghz zzghzVar, byte[] bArr, int i2, int i3, zzgej zzgejVar) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = zzb(i5, bArr, i4, zzgejVar);
            i5 = zzgejVar.zza;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw zzggm.zzd();
        }
        Object zza = zzghzVar.zza();
        int i7 = i5 + i6;
        zzghzVar.zzi(zza, bArr, i6, i7, zzgejVar);
        zzghzVar.zzj(zza);
        zzgejVar.zzc = zza;
        return i7;
    }

    public static int zzj(zzghz zzghzVar, byte[] bArr, int i2, int i3, int i4, zzgej zzgejVar) throws IOException {
        zzghl zzghlVar = (zzghl) zzghzVar;
        Object zza = zzghlVar.zza();
        int zzh = zzghlVar.zzh(zza, bArr, i2, i3, i4, zzgejVar);
        zzghlVar.zzj(zza);
        zzgejVar.zzc = zza;
        return zzh;
    }

    public static int zzk(int i2, byte[] bArr, int i3, int i4, zzggj<?> zzggjVar, zzgej zzgejVar) {
        zzggb zzggbVar = (zzggb) zzggjVar;
        int zza = zza(bArr, i3, zzgejVar);
        zzggbVar.zzh(zzgejVar.zza);
        while (zza < i4) {
            int zza2 = zza(bArr, zza, zzgejVar);
            if (i2 != zzgejVar.zza) {
                break;
            }
            zza = zza(bArr, zza2, zzgejVar);
            zzggbVar.zzh(zzgejVar.zza);
        }
        return zza;
    }

    public static int zzl(byte[] bArr, int i2, zzggj<?> zzggjVar, zzgej zzgejVar) throws IOException {
        zzggb zzggbVar = (zzggb) zzggjVar;
        int zza = zza(bArr, i2, zzgejVar);
        int i3 = zzgejVar.zza + zza;
        while (zza < i3) {
            zza = zza(bArr, zza, zzgejVar);
            zzggbVar.zzh(zzgejVar.zza);
        }
        if (zza == i3) {
            return zza;
        }
        throw zzggm.zzd();
    }

    public static int zzm(zzghz<?> zzghzVar, int i2, byte[] bArr, int i3, int i4, zzggj<?> zzggjVar, zzgej zzgejVar) throws IOException {
        int zzi = zzi(zzghzVar, bArr, i3, i4, zzgejVar);
        zzggjVar.add(zzgejVar.zzc);
        while (zzi < i4) {
            int zza = zza(bArr, zzi, zzgejVar);
            if (i2 != zzgejVar.zza) {
                break;
            }
            zzi = zzi(zzghzVar, bArr, zza, i4, zzgejVar);
            zzggjVar.add(zzgejVar.zzc);
        }
        return zzi;
    }

    public static int zzn(int i2, byte[] bArr, int i3, int i4, zzgip zzgipVar, zzgej zzgejVar) throws zzggm {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int zzc = zzc(bArr, i3, zzgejVar);
                zzgipVar.zzh(i2, Long.valueOf(zzgejVar.zzb));
                return zzc;
            } else if (i5 == 1) {
                zzgipVar.zzh(i2, Long.valueOf(zze(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int zza = zza(bArr, i3, zzgejVar);
                int i6 = zzgejVar.zza;
                if (i6 >= 0) {
                    if (i6 <= bArr.length - zza) {
                        if (i6 == 0) {
                            zzgipVar.zzh(i2, zzgex.zzb);
                        } else {
                            zzgipVar.zzh(i2, zzgex.zzs(bArr, zza, i6));
                        }
                        return zza + i6;
                    }
                    throw zzggm.zzd();
                }
                throw zzggm.zze();
            } else if (i5 != 3) {
                if (i5 == 5) {
                    zzgipVar.zzh(i2, Integer.valueOf(zzd(bArr, i3)));
                    return i3 + 4;
                }
                throw zzggm.zzg();
            } else {
                int i7 = (i2 & (-8)) | 4;
                zzgip zzb = zzgip.zzb();
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int zza2 = zza(bArr, i3, zzgejVar);
                    int i9 = zzgejVar.zza;
                    if (i9 == i7) {
                        i8 = i9;
                        i3 = zza2;
                        break;
                    }
                    i8 = i9;
                    i3 = zzn(i9, bArr, zza2, i4, zzb, zzgejVar);
                }
                if (i3 > i4 || i8 != i7) {
                    throw zzggm.zzk();
                }
                zzgipVar.zzh(i2, zzb);
                return i3;
            }
        }
        throw zzggm.zzg();
    }
}
