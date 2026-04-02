package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzil {
    public static int zza(byte[] bArr, int i2, zzik zzikVar) throws zzkh {
        int zzj = zzj(bArr, i2, zzikVar);
        int i3 = zzikVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - zzj) {
                if (i3 == 0) {
                    zzikVar.zzc = zzix.zzb;
                    return zzj;
                }
                zzikVar.zzc = zzix.zzl(bArr, zzj, i3);
                return zzj + i3;
            }
            throw zzkh.zzf();
        }
        throw zzkh.zzd();
    }

    public static int zzb(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int zzc(zzln zzlnVar, byte[] bArr, int i2, int i3, int i4, zzik zzikVar) throws IOException {
        zzlf zzlfVar = (zzlf) zzlnVar;
        Object zze = zzlfVar.zze();
        int zzc = zzlfVar.zzc(zze, bArr, i2, i3, i4, zzikVar);
        zzlfVar.zzf(zze);
        zzikVar.zzc = zze;
        return zzc;
    }

    public static int zzd(zzln zzlnVar, byte[] bArr, int i2, int i3, zzik zzikVar) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = zzk(i5, bArr, i4, zzikVar);
            i5 = zzikVar.zza;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw zzkh.zzf();
        }
        Object zze = zzlnVar.zze();
        int i7 = i5 + i6;
        zzlnVar.zzh(zze, bArr, i6, i7, zzikVar);
        zzlnVar.zzf(zze);
        zzikVar.zzc = zze;
        return i7;
    }

    public static int zze(zzln<?> zzlnVar, int i2, byte[] bArr, int i3, int i4, zzke<?> zzkeVar, zzik zzikVar) throws IOException {
        int zzd = zzd(zzlnVar, bArr, i3, i4, zzikVar);
        zzkeVar.add(zzikVar.zzc);
        while (zzd < i4) {
            int zzj = zzj(bArr, zzd, zzikVar);
            if (i2 != zzikVar.zza) {
                break;
            }
            zzd = zzd(zzlnVar, bArr, zzj, i4, zzikVar);
            zzkeVar.add(zzikVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i2, zzke<?> zzkeVar, zzik zzikVar) throws IOException {
        zzjy zzjyVar = (zzjy) zzkeVar;
        int zzj = zzj(bArr, i2, zzikVar);
        int i3 = zzikVar.zza + zzj;
        while (zzj < i3) {
            zzj = zzj(bArr, zzj, zzikVar);
            zzjyVar.zzh(zzikVar.zza);
        }
        if (zzj == i3) {
            return zzj;
        }
        throw zzkh.zzf();
    }

    public static int zzg(byte[] bArr, int i2, zzik zzikVar) throws zzkh {
        int zzj = zzj(bArr, i2, zzikVar);
        int i3 = zzikVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzikVar.zzc = "";
                return zzj;
            }
            zzikVar.zzc = new String(bArr, zzj, i3, zzkf.zzb);
            return zzj + i3;
        }
        throw zzkh.zzd();
    }

    public static int zzh(byte[] bArr, int i2, zzik zzikVar) throws zzkh {
        int zzj = zzj(bArr, i2, zzikVar);
        int i3 = zzikVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzikVar.zzc = "";
                return zzj;
            }
            zzikVar.zzc = zzmq.zzd(bArr, zzj, i3);
            return zzj + i3;
        }
        throw zzkh.zzd();
    }

    public static int zzi(int i2, byte[] bArr, int i3, int i4, zzmc zzmcVar, zzik zzikVar) throws zzkh {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int zzm = zzm(bArr, i3, zzikVar);
                zzmcVar.zzh(i2, Long.valueOf(zzikVar.zzb));
                return zzm;
            } else if (i5 == 1) {
                zzmcVar.zzh(i2, Long.valueOf(zzn(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int zzj = zzj(bArr, i3, zzikVar);
                int i6 = zzikVar.zza;
                if (i6 >= 0) {
                    if (i6 <= bArr.length - zzj) {
                        if (i6 == 0) {
                            zzmcVar.zzh(i2, zzix.zzb);
                        } else {
                            zzmcVar.zzh(i2, zzix.zzl(bArr, zzj, i6));
                        }
                        return zzj + i6;
                    }
                    throw zzkh.zzf();
                }
                throw zzkh.zzd();
            } else if (i5 != 3) {
                if (i5 == 5) {
                    zzmcVar.zzh(i2, Integer.valueOf(zzb(bArr, i3)));
                    return i3 + 4;
                }
                throw zzkh.zzb();
            } else {
                int i7 = (i2 & (-8)) | 4;
                zzmc zze = zzmc.zze();
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i3, zzikVar);
                    int i9 = zzikVar.zza;
                    if (i9 == i7) {
                        i8 = i9;
                        i3 = zzj2;
                        break;
                    }
                    i8 = i9;
                    i3 = zzi(i9, bArr, zzj2, i4, zze, zzikVar);
                }
                if (i3 > i4 || i8 != i7) {
                    throw zzkh.zze();
                }
                zzmcVar.zzh(i2, zze);
                return i3;
            }
        }
        throw zzkh.zzb();
    }

    public static int zzj(byte[] bArr, int i2, zzik zzikVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            zzikVar.zza = b2;
            return i3;
        }
        return zzk(b2, bArr, i3, zzikVar);
    }

    public static int zzk(int i2, byte[] bArr, int i3, zzik zzikVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzikVar.zza = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            zzikVar.zza = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzikVar.zza = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzikVar.zza = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzikVar.zza = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int zzl(int i2, byte[] bArr, int i3, int i4, zzke<?> zzkeVar, zzik zzikVar) {
        zzjy zzjyVar = (zzjy) zzkeVar;
        int zzj = zzj(bArr, i3, zzikVar);
        zzjyVar.zzh(zzikVar.zza);
        while (zzj < i4) {
            int zzj2 = zzj(bArr, zzj, zzikVar);
            if (i2 != zzikVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzikVar);
            zzjyVar.zzh(zzikVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i2, zzik zzikVar) {
        byte b2;
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzikVar.zzb = j2;
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
        zzikVar.zzb = j3;
        return i4;
    }

    public static long zzn(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }
}
