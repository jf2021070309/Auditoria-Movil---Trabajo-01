package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgek {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzgej zzgejVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzgejVar.zza = b;
            return i2;
        }
        return zzb(b, bArr, i2, zzgejVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, byte[] bArr, int i2, zzgej zzgejVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzgejVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzgejVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgejVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgejVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgejVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i, zzgej zzgejVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzgejVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & ByteCompanionObject.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzgejVar.zzb = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zze(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i, zzgej zzgejVar) throws zzggm {
        int zza = zza(bArr, i, zzgejVar);
        int i2 = zzgejVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzgejVar.zzc = "";
                return zza;
            }
            zzgejVar.zzc = new String(bArr, zza, i2, zzggk.zza);
            return zza + i2;
        }
        throw zzggm.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i, zzgej zzgejVar) throws zzggm {
        int zza = zza(bArr, i, zzgejVar);
        int i2 = zzgejVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzgejVar.zzc = "";
                return zza;
            }
            zzgejVar.zzc = zzgjd.zzj(bArr, zza, i2);
            return zza + i2;
        }
        throw zzggm.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i, zzgej zzgejVar) throws zzggm {
        int zza = zza(bArr, i, zzgejVar);
        int i2 = zzgejVar.zza;
        if (i2 < 0) {
            throw zzggm.zze();
        }
        if (i2 <= bArr.length - zza) {
            if (i2 == 0) {
                zzgejVar.zzc = zzgex.zzb;
                return zza;
            }
            zzgejVar.zzc = zzgex.zzs(bArr, zza, i2);
            return zza + i2;
        }
        throw zzggm.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(zzghz zzghzVar, byte[] bArr, int i, int i2, zzgej zzgejVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzb(i4, bArr, i3, zzgejVar);
            i4 = zzgejVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzggm.zzd();
        }
        Object zza = zzghzVar.zza();
        int i6 = i4 + i5;
        zzghzVar.zzi(zza, bArr, i5, i6, zzgejVar);
        zzghzVar.zzj(zza);
        zzgejVar.zzc = zza;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(zzghz zzghzVar, byte[] bArr, int i, int i2, int i3, zzgej zzgejVar) throws IOException {
        zzghl zzghlVar = (zzghl) zzghzVar;
        Object zza = zzghlVar.zza();
        int zzh = zzghlVar.zzh(zza, bArr, i, i2, i3, zzgejVar);
        zzghlVar.zzj(zza);
        zzgejVar.zzc = zza;
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i, byte[] bArr, int i2, int i3, zzggj<?> zzggjVar, zzgej zzgejVar) {
        zzggb zzggbVar = (zzggb) zzggjVar;
        int zza = zza(bArr, i2, zzgejVar);
        zzggbVar.zzh(zzgejVar.zza);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzgejVar);
            if (i != zzgejVar.zza) {
                break;
            }
            zza = zza(bArr, zza2, zzgejVar);
            zzggbVar.zzh(zzgejVar.zza);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(byte[] bArr, int i, zzggj<?> zzggjVar, zzgej zzgejVar) throws IOException {
        zzggb zzggbVar = (zzggb) zzggjVar;
        int zza = zza(bArr, i, zzgejVar);
        int i2 = zzgejVar.zza + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzgejVar);
            zzggbVar.zzh(zzgejVar.zza);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzggm.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(zzghz<?> zzghzVar, int i, byte[] bArr, int i2, int i3, zzggj<?> zzggjVar, zzgej zzgejVar) throws IOException {
        int zzi = zzi(zzghzVar, bArr, i2, i3, zzgejVar);
        zzggjVar.add(zzgejVar.zzc);
        while (zzi < i3) {
            int zza = zza(bArr, zzi, zzgejVar);
            if (i != zzgejVar.zza) {
                break;
            }
            zzi = zzi(zzghzVar, bArr, zza, i3, zzgejVar);
            zzggjVar.add(zzgejVar.zzc);
        }
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(int i, byte[] bArr, int i2, int i3, zzgip zzgipVar, zzgej zzgejVar) throws zzggm {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzc = zzc(bArr, i2, zzgejVar);
                zzgipVar.zzh(i, Long.valueOf(zzgejVar.zzb));
                return zzc;
            } else if (i4 == 1) {
                zzgipVar.zzh(i, Long.valueOf(zze(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzgejVar);
                int i5 = zzgejVar.zza;
                if (i5 < 0) {
                    throw zzggm.zze();
                }
                if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzgipVar.zzh(i, zzgex.zzb);
                    } else {
                        zzgipVar.zzh(i, zzgex.zzs(bArr, zza, i5));
                    }
                    return zza + i5;
                }
                throw zzggm.zzd();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzgipVar.zzh(i, Integer.valueOf(zzd(bArr, i2)));
                    return i2 + 4;
                }
                throw zzggm.zzg();
            } else {
                int i6 = (i & (-8)) | 4;
                zzgip zzb = zzgip.zzb();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzgejVar);
                    int i8 = zzgejVar.zza;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = zza2;
                        break;
                    }
                    i7 = i8;
                    i2 = zzn(i8, bArr, zza2, i3, zzb, zzgejVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzggm.zzk();
                }
                zzgipVar.zzh(i, zzb);
                return i2;
            }
        }
        throw zzggm.zzg();
    }
}
