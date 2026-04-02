package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzrt {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zznv zznvVar) throws IOException {
        return zzc(zznvVar, true, false);
    }

    public static boolean zzb(zznv zznvVar, boolean z) throws IOException {
        return zzc(zznvVar, false, false);
    }

    private static boolean zzc(zznv zznvVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        long zzo = zznvVar.zzo();
        long j = -1;
        int i = (zzo > (-1L) ? 1 : (zzo == (-1L) ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i != 0 && zzo <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = zzo;
        }
        int i2 = (int) j2;
        zzamf zzamfVar = new zzamf(64);
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        while (i3 < i2) {
            zzamfVar.zza(8);
            if (!zznvVar.zzh(zzamfVar.zzi(), z4 ? 1 : 0, 8, true)) {
                z3 = z4 ? 1 : 0;
                break;
            }
            long zzt = zzamfVar.zzt();
            int zzv = zzamfVar.zzv();
            int i4 = 16;
            if (zzt == 1) {
                zznvVar.zzi(zzamfVar.zzi(), 8, 8);
                zzamfVar.zzf(16);
                zzt = zzamfVar.zzx();
            } else {
                if (zzt == 0) {
                    long zzo2 = zznvVar.zzo();
                    if (zzo2 != j) {
                        zzt = (zzo2 - zznvVar.zzm()) + 8;
                    }
                }
                i4 = 8;
            }
            long j3 = i4;
            if (zzt < j3) {
                return z4;
            }
            i3 += i4;
            if (zzv == 1836019574) {
                i2 += (int) zzt;
                if (i != 0 && i2 > zzo) {
                    i2 = (int) zzo;
                }
                j = -1;
            } else if (zzv == 1836019558 || zzv == 1836475768) {
                z3 = true;
                break;
            } else {
                long j4 = zzo;
                if ((i3 + zzt) - j3 >= i2) {
                    break;
                }
                int i5 = (int) (zzt - j3);
                i3 += i5;
                if (zzv == 1718909296) {
                    if (i5 < 8) {
                        return false;
                    }
                    zzamfVar.zza(i5);
                    zznvVar.zzi(zzamfVar.zzi(), 0, i5);
                    int i6 = i5 >> 2;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (i7 == 1) {
                            zzamfVar.zzk(4);
                        } else {
                            int zzv2 = zzamfVar.zzv();
                            if ((zzv2 >>> 8) != 3368816) {
                                if (zzv2 == 1751476579) {
                                    zzv2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i8 = 0; i8 < 29; i8++) {
                                    if (iArr[i8] != zzv2) {
                                    }
                                }
                                continue;
                            }
                            z5 = true;
                            break;
                        }
                    }
                    if (!z5) {
                        return false;
                    }
                } else if (i5 != 0) {
                    zznvVar.zzk(i5);
                }
                zzo = j4;
                j = -1;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }
}
