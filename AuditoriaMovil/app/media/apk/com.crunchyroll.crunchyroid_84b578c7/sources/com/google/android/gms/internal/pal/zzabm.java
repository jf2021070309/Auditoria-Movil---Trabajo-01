package com.google.android.gms.internal.pal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzabm {
    public static int zza(byte[] bArr, int i, zzabl zzablVar) throws zzadi {
        int zzj = zzj(bArr, i, zzablVar);
        int i2 = zzablVar.zza;
        if (i2 >= 0) {
            if (i2 <= bArr.length - zzj) {
                if (i2 == 0) {
                    zzablVar.zzc = zzaby.zzb;
                    return zzj;
                }
                zzablVar.zzc = zzaby.zzo(bArr, zzj, i2);
                return zzj + i2;
            }
            throw zzadi.zzi();
        }
        throw zzadi.zzf();
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static int zzc(zzaer zzaerVar, byte[] bArr, int i, int i2, int i3, zzabl zzablVar) throws IOException {
        zzaei zzaeiVar = (zzaei) zzaerVar;
        Object zze = zzaeiVar.zze();
        int zzc = zzaeiVar.zzc(zze, bArr, i, i2, i3, zzablVar);
        zzaeiVar.zzf(zze);
        zzablVar.zzc = zze;
        return zzc;
    }

    public static int zzd(zzaer zzaerVar, byte[] bArr, int i, int i2, zzabl zzablVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzk(i4, bArr, i3, zzablVar);
            i4 = zzablVar.zza;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zze = zzaerVar.zze();
            int i6 = i4 + i5;
            zzaerVar.zzi(zze, bArr, i5, i6, zzablVar);
            zzaerVar.zzf(zze);
            zzablVar.zzc = zze;
            return i6;
        }
        throw zzadi.zzi();
    }

    public static int zze(zzaer zzaerVar, int i, byte[] bArr, int i2, int i3, zzadf zzadfVar, zzabl zzablVar) throws IOException {
        int zzd = zzd(zzaerVar, bArr, i2, i3, zzablVar);
        zzadfVar.add(zzablVar.zzc);
        while (zzd < i3) {
            int zzj = zzj(bArr, zzd, zzablVar);
            if (i != zzablVar.zza) {
                break;
            }
            zzd = zzd(zzaerVar, bArr, zzj, i3, zzablVar);
            zzadfVar.add(zzablVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzadf zzadfVar, zzabl zzablVar) throws IOException {
        zzada zzadaVar = (zzada) zzadfVar;
        int zzj = zzj(bArr, i, zzablVar);
        int i2 = zzablVar.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzablVar);
            zzadaVar.zzg(zzablVar.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzadi.zzi();
    }

    public static int zzg(byte[] bArr, int i, zzabl zzablVar) throws zzadi {
        int zzj = zzj(bArr, i, zzablVar);
        int i2 = zzablVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzablVar.zzc = "";
                return zzj;
            }
            zzablVar.zzc = new String(bArr, zzj, i2, zzadg.zzb);
            return zzj + i2;
        }
        throw zzadi.zzf();
    }

    public static int zzh(byte[] bArr, int i, zzabl zzablVar) throws zzadi {
        int zzj = zzj(bArr, i, zzablVar);
        int i2 = zzablVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzablVar.zzc = "";
                return zzj;
            }
            zzablVar.zzc = zzafx.zzd(bArr, zzj, i2);
            return zzj + i2;
        }
        throw zzadi.zzf();
    }

    public static int zzi(int i, byte[] bArr, int i2, int i3, zzafj zzafjVar, zzabl zzablVar) throws zzadi {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzafjVar.zzh(i, Integer.valueOf(zzb(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzadi.zzc();
                        }
                        int i5 = (i & (-8)) | 4;
                        zzafj zze = zzafj.zze();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int zzj = zzj(bArr, i2, zzablVar);
                            int i7 = zzablVar.zza;
                            if (i7 == i5) {
                                i6 = i7;
                                i2 = zzj;
                                break;
                            }
                            i6 = i7;
                            i2 = zzi(i7, bArr, zzj, i3, zze, zzablVar);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzafjVar.zzh(i, zze);
                            return i2;
                        }
                        throw zzadi.zzg();
                    }
                    int zzj2 = zzj(bArr, i2, zzablVar);
                    int i8 = zzablVar.zza;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - zzj2) {
                            if (i8 == 0) {
                                zzafjVar.zzh(i, zzaby.zzb);
                            } else {
                                zzafjVar.zzh(i, zzaby.zzo(bArr, zzj2, i8));
                            }
                            return zzj2 + i8;
                        }
                        throw zzadi.zzi();
                    }
                    throw zzadi.zzf();
                }
                zzafjVar.zzh(i, Long.valueOf(zzn(bArr, i2)));
                return i2 + 8;
            }
            int zzm = zzm(bArr, i2, zzablVar);
            zzafjVar.zzh(i, Long.valueOf(zzablVar.zzb));
            return zzm;
        }
        throw zzadi.zzc();
    }

    public static int zzj(byte[] bArr, int i, zzabl zzablVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzablVar.zza = b;
            return i2;
        }
        return zzk(b, bArr, i2, zzablVar);
    }

    public static int zzk(int i, byte[] bArr, int i2, zzabl zzablVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzablVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Ascii.DEL) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzablVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Ascii.DEL) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzablVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Ascii.DEL) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzablVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Ascii.DEL) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzablVar.zza = i11;
                return i12;
            }
        }
    }

    public static int zzl(int i, byte[] bArr, int i2, int i3, zzadf zzadfVar, zzabl zzablVar) {
        zzada zzadaVar = (zzada) zzadfVar;
        int zzj = zzj(bArr, i2, zzablVar);
        zzadaVar.zzg(zzablVar.zza);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, zzablVar);
            if (i != zzablVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzablVar);
            zzadaVar.zzg(zzablVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzabl zzablVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzablVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Ascii.DEL) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Ascii.DEL) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzablVar.zzb = j2;
        return i3;
    }

    public static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
