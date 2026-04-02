package com.google.android.gms.internal.cast_tv;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzgh {
    public static int zza(byte[] bArr, int i, zzgg zzggVar) throws zzie {
        int zzj = zzj(bArr, i, zzggVar);
        int i2 = zzggVar.zza;
        if (i2 >= 0) {
            if (i2 <= bArr.length - zzj) {
                if (i2 == 0) {
                    zzggVar.zzc = zzgu.zzb;
                    return zzj;
                }
                zzggVar.zzc = zzgu.zzl(bArr, zzj, i2);
                return zzj + i2;
            }
            throw zzie.zzg();
        }
        throw zzie.zzd();
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & UnsignedBytes.MAX_VALUE;
        int i3 = bArr[i + 1] & UnsignedBytes.MAX_VALUE;
        int i4 = bArr[i + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int zzc(zzjn zzjnVar, byte[] bArr, int i, int i2, int i3, zzgg zzggVar) throws IOException {
        Object zze = zzjnVar.zze();
        int zzn = zzn(zze, zzjnVar, bArr, i, i2, i3, zzggVar);
        zzjnVar.zzf(zze);
        zzggVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzjn zzjnVar, byte[] bArr, int i, int i2, zzgg zzggVar) throws IOException {
        Object zze = zzjnVar.zze();
        int zzo = zzo(zze, zzjnVar, bArr, i, i2, zzggVar);
        zzjnVar.zzf(zze);
        zzggVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzjn zzjnVar, int i, byte[] bArr, int i2, int i3, zzib zzibVar, zzgg zzggVar) throws IOException {
        int zzd = zzd(zzjnVar, bArr, i2, i3, zzggVar);
        zzibVar.add(zzggVar.zzc);
        while (zzd < i3) {
            int zzj = zzj(bArr, zzd, zzggVar);
            if (i != zzggVar.zza) {
                break;
            }
            zzd = zzd(zzjnVar, bArr, zzj, i3, zzggVar);
            zzibVar.add(zzggVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzib zzibVar, zzgg zzggVar) throws IOException {
        zzhu zzhuVar = (zzhu) zzibVar;
        int zzj = zzj(bArr, i, zzggVar);
        int i2 = zzggVar.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzggVar);
            zzhuVar.zzh(zzggVar.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzie.zzg();
    }

    public static int zzg(byte[] bArr, int i, zzgg zzggVar) throws zzie {
        int zzj = zzj(bArr, i, zzggVar);
        int i2 = zzggVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzggVar.zzc = "";
                return zzj;
            }
            zzggVar.zzc = new String(bArr, zzj, i2, zzic.zzb);
            return zzj + i2;
        }
        throw zzie.zzd();
    }

    public static int zzh(byte[] bArr, int i, zzgg zzggVar) throws zzie {
        int zzj = zzj(bArr, i, zzggVar);
        int i2 = zzggVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzggVar.zzc = "";
                return zzj;
            }
            int i3 = zzkt.zza;
            int length = bArr.length;
            if ((((length - zzj) - i2) | zzj | i2) >= 0) {
                int i4 = zzj + i2;
                char[] cArr = new char[i2];
                int i5 = 0;
                while (zzj < i4) {
                    byte b = bArr[zzj];
                    if (!zzkp.zzd(b)) {
                        break;
                    }
                    zzj++;
                    cArr[i5] = (char) b;
                    i5++;
                }
                int i6 = i5;
                while (zzj < i4) {
                    int i7 = zzj + 1;
                    byte b2 = bArr[zzj];
                    if (zzkp.zzd(b2)) {
                        int i8 = i6 + 1;
                        cArr[i6] = (char) b2;
                        zzj = i7;
                        while (true) {
                            i6 = i8;
                            if (zzj < i4) {
                                byte b3 = bArr[zzj];
                                if (zzkp.zzd(b3)) {
                                    zzj++;
                                    i8 = i6 + 1;
                                    cArr[i6] = (char) b3;
                                }
                            }
                        }
                    } else if (b2 < -32) {
                        if (i7 < i4) {
                            zzkp.zzc(b2, bArr[i7], cArr, i6);
                            zzj = i7 + 1;
                            i6++;
                        } else {
                            throw zzie.zzc();
                        }
                    } else if (b2 < -16) {
                        if (i7 < i4 - 1) {
                            int i9 = i7 + 1;
                            zzkp.zzb(b2, bArr[i7], bArr[i9], cArr, i6);
                            zzj = i9 + 1;
                            i6++;
                        } else {
                            throw zzie.zzc();
                        }
                    } else if (i7 < i4 - 2) {
                        int i10 = i7 + 1;
                        byte b4 = bArr[i7];
                        int i11 = i10 + 1;
                        zzkp.zza(b2, b4, bArr[i10], bArr[i11], cArr, i6);
                        i6 += 2;
                        zzj = i11 + 1;
                    } else {
                        throw zzie.zzc();
                    }
                }
                zzggVar.zzc = new String(cArr, 0, i6);
                return i4;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzj), Integer.valueOf(i2)));
        }
        throw zzie.zzd();
    }

    public static int zzi(int i, byte[] bArr, int i2, int i3, zzkf zzkfVar, zzgg zzggVar) throws zzie {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzkfVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzie.zzb();
                        }
                        int i5 = (i & (-8)) | 4;
                        zzkf zzf = zzkf.zzf();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int zzj = zzj(bArr, i2, zzggVar);
                            int i7 = zzggVar.zza;
                            i6 = i7;
                            if (i7 != i5) {
                                int zzi = zzi(i6, bArr, zzj, i3, zzf, zzggVar);
                                i6 = i7;
                                i2 = zzi;
                            } else {
                                i2 = zzj;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzkfVar.zzj(i, zzf);
                            return i2;
                        }
                        throw zzie.zze();
                    }
                    int zzj2 = zzj(bArr, i2, zzggVar);
                    int i8 = zzggVar.zza;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - zzj2) {
                            if (i8 == 0) {
                                zzkfVar.zzj(i, zzgu.zzb);
                            } else {
                                zzkfVar.zzj(i, zzgu.zzl(bArr, zzj2, i8));
                            }
                            return zzj2 + i8;
                        }
                        throw zzie.zzg();
                    }
                    throw zzie.zzd();
                }
                zzkfVar.zzj(i, Long.valueOf(zzq(bArr, i2)));
                return i2 + 8;
            }
            int zzm = zzm(bArr, i2, zzggVar);
            zzkfVar.zzj(i, Long.valueOf(zzggVar.zzb));
            return zzm;
        }
        throw zzie.zzb();
    }

    public static int zzj(byte[] bArr, int i, zzgg zzggVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzggVar.zza = b;
            return i2;
        }
        return zzk(b, bArr, i2, zzggVar);
    }

    public static int zzk(int i, byte[] bArr, int i2, zzgg zzggVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzggVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Ascii.DEL) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzggVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Ascii.DEL) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzggVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Ascii.DEL) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzggVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Ascii.DEL) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzggVar.zza = i11;
                return i12;
            }
        }
    }

    public static int zzl(int i, byte[] bArr, int i2, int i3, zzib zzibVar, zzgg zzggVar) {
        zzhu zzhuVar = (zzhu) zzibVar;
        int zzj = zzj(bArr, i2, zzggVar);
        zzhuVar.zzh(zzggVar.zza);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, zzggVar);
            if (i != zzggVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzggVar);
            zzhuVar.zzh(zzggVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzgg zzggVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzggVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Ascii.DEL) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= (b2 & Ascii.DEL) << i4;
            i3 = i5;
            b = b2;
        }
        zzggVar.zzb = j2;
        return i3;
    }

    public static int zzn(Object obj, zzjn zzjnVar, byte[] bArr, int i, int i2, int i3, zzgg zzggVar) throws IOException {
        int zzc = ((zzjf) zzjnVar).zzc(obj, bArr, i, i2, i3, zzggVar);
        zzggVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzjn zzjnVar, byte[] bArr, int i, int i2, zzgg zzggVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzk(i4, bArr, i3, zzggVar);
            i4 = zzggVar.zza;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            zzjnVar.zzh(obj, bArr, i5, i6, zzggVar);
            zzggVar.zzc = obj;
            return i6;
        }
        throw zzie.zzg();
    }

    public static int zzp(int i, byte[] bArr, int i2, int i3, zzgg zzggVar) throws zzie {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzie.zzb();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = zzj(bArr, i2, zzggVar);
                            i6 = zzggVar.zza;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = zzp(i6, bArr, i2, i3, zzggVar);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzie.zze();
                    }
                    return zzj(bArr, i2, zzggVar) + zzggVar.zza;
                }
                return i2 + 8;
            }
            return zzm(bArr, i2, zzggVar);
        }
        throw zzie.zzb();
    }

    public static long zzq(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
