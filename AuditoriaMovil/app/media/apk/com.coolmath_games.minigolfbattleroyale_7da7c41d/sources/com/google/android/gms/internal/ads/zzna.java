package com.google.android.gms.internal.ads;

import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzna {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzafv zza(zzamf zzamfVar, String str, String str2, zzn zznVar) {
        int i = zzc[(zzamfVar.zzn() & 192) >> 6];
        int zzn = zzamfVar.zzn();
        int i2 = zze[(zzn & 56) >> 3];
        if ((zzn & 4) != 0) {
            i2++;
        }
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD(str);
        zzaftVar.zzN("audio/ac3");
        zzaftVar.zzaa(i2);
        zzaftVar.zzab(i);
        zzaftVar.zzQ(zznVar);
        zzaftVar.zzG(str2);
        return zzaftVar.zzah();
    }

    public static zzafv zzb(zzamf zzamfVar, String str, String str2, zzn zznVar) {
        zzamfVar.zzk(2);
        int i = zzc[(zzamfVar.zzn() & 192) >> 6];
        int zzn = zzamfVar.zzn();
        int i2 = zze[(zzn & 14) >> 1];
        if ((zzn & 1) != 0) {
            i2++;
        }
        if (((zzamfVar.zzn() & 30) >> 1) > 0 && (2 & zzamfVar.zzn()) != 0) {
            i2 += 2;
        }
        String str3 = (zzamfVar.zzd() <= 0 || (zzamfVar.zzn() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD(str);
        zzaftVar.zzN(str3);
        zzaftVar.zzaa(i2);
        zzaftVar.zzab(i);
        zzaftVar.zzQ(zznVar);
        zzaftVar.zzG(str2);
        return zzaftVar.zzah();
    }

    public static zzmz zzc(zzame zzameVar) {
        int zze2;
        int i;
        int i2;
        int i3;
        String str;
        int zzh;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int zzc2 = zzameVar.zzc();
        zzameVar.zzf(40);
        int zzh2 = zzameVar.zzh(5);
        zzameVar.zzd(zzc2);
        int i9 = -1;
        if (zzh2 > 10) {
            zzameVar.zzf(16);
            int zzh3 = zzameVar.zzh(2);
            if (zzh3 == 0) {
                i9 = 0;
            } else if (zzh3 == 1) {
                i9 = 1;
            } else if (zzh3 == 2) {
                i9 = 2;
            }
            zzameVar.zzf(3);
            int zzh4 = zzameVar.zzh(11) + 1;
            zze2 = zzh4 + zzh4;
            int zzh5 = zzameVar.zzh(2);
            if (zzh5 == 3) {
                i4 = 6;
                i = zzd[zzameVar.zzh(2)];
                zzh = 3;
            } else {
                zzh = zzameVar.zzh(2);
                i4 = zzb[zzh];
                i = zzc[zzh5];
            }
            i3 = i4 * 256;
            int zzh6 = zzameVar.zzh(3);
            boolean zzg2 = zzameVar.zzg();
            i2 = zze[zzh6] + (zzg2 ? 1 : 0);
            zzameVar.zzf(10);
            if (zzameVar.zzg()) {
                zzameVar.zzf(8);
            }
            if (zzh6 == 0) {
                zzameVar.zzf(5);
                if (zzameVar.zzg()) {
                    zzameVar.zzf(8);
                }
                i5 = 0;
                zzh6 = 0;
            } else {
                i5 = zzh6;
            }
            if (i9 == 1) {
                if (zzameVar.zzg()) {
                    zzameVar.zzf(16);
                }
                i6 = 1;
            } else {
                i6 = i9;
            }
            if (zzameVar.zzg()) {
                if (i5 > 2) {
                    zzameVar.zzf(2);
                }
                if ((i5 & 1) != 0 && i5 > 2) {
                    zzameVar.zzf(6);
                }
                if ((i5 & 4) != 0) {
                    zzameVar.zzf(6);
                }
                if (zzg2 && zzameVar.zzg()) {
                    zzameVar.zzf(5);
                }
                if (i6 == 0) {
                    if (zzameVar.zzg()) {
                        zzameVar.zzf(6);
                    }
                    if (i5 == 0 && zzameVar.zzg()) {
                        zzameVar.zzf(6);
                    }
                    if (zzameVar.zzg()) {
                        zzameVar.zzf(6);
                    }
                    int zzh7 = zzameVar.zzh(2);
                    if (zzh7 == 1) {
                        zzameVar.zzf(5);
                    } else if (zzh7 == 2) {
                        zzameVar.zzf(12);
                    } else if (zzh7 == 3) {
                        int zzh8 = zzameVar.zzh(5);
                        if (zzameVar.zzg()) {
                            zzameVar.zzf(5);
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(4);
                            }
                            if (zzameVar.zzg()) {
                                if (zzameVar.zzg()) {
                                    zzameVar.zzf(4);
                                }
                                if (zzameVar.zzg()) {
                                    zzameVar.zzf(4);
                                }
                            }
                        }
                        if (zzameVar.zzg()) {
                            zzameVar.zzf(5);
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(7);
                                if (zzameVar.zzg()) {
                                    i8 = 8;
                                    zzameVar.zzf(8);
                                    zzameVar.zzf((zzh8 + 2) * i8);
                                    zzameVar.zzj();
                                }
                            }
                        }
                        i8 = 8;
                        zzameVar.zzf((zzh8 + 2) * i8);
                        zzameVar.zzj();
                    }
                    if (i5 < 2) {
                        if (zzameVar.zzg()) {
                            zzameVar.zzf(14);
                        }
                        if (zzh6 == 0 && zzameVar.zzg()) {
                            zzameVar.zzf(14);
                        }
                    }
                    if (zzameVar.zzg()) {
                        if (zzh == 0) {
                            zzameVar.zzf(5);
                            i6 = 0;
                            zzh = 0;
                        } else {
                            for (int i10 = 0; i10 < i4; i10++) {
                                if (zzameVar.zzg()) {
                                    zzameVar.zzf(5);
                                }
                            }
                        }
                    }
                    i6 = 0;
                }
            }
            if (zzameVar.zzg()) {
                zzameVar.zzf(5);
                if (i5 == 2) {
                    zzameVar.zzf(4);
                    i5 = 2;
                }
                if (i5 >= 6) {
                    zzameVar.zzf(2);
                }
                if (zzameVar.zzg()) {
                    i7 = 8;
                    zzameVar.zzf(8);
                } else {
                    i7 = 8;
                }
                if (i5 == 0 && zzameVar.zzg()) {
                    zzameVar.zzf(i7);
                }
                if (zzh5 < 3) {
                    zzameVar.zze();
                }
            }
            if (i6 == 0 && zzh != 3) {
                zzameVar.zze();
            }
            if (i6 == 2 && (zzh == 3 || zzameVar.zzg())) {
                zzameVar.zzf(6);
            }
            str = (zzameVar.zzg() && zzameVar.zzh(6) == 1 && zzameVar.zzh(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
        } else {
            zzameVar.zzf(32);
            int zzh9 = zzameVar.zzh(2);
            String str2 = zzh9 == 3 ? null : "audio/ac3";
            zze2 = zze(zzh9, zzameVar.zzh(6));
            zzameVar.zzf(8);
            int zzh10 = zzameVar.zzh(3);
            if ((zzh10 & 1) != 0 && zzh10 != 1) {
                zzameVar.zzf(2);
            }
            if ((zzh10 & 4) != 0) {
                zzameVar.zzf(2);
            }
            if (zzh10 == 2) {
                zzameVar.zzf(2);
            }
            i = zzh9 < 3 ? zzc[zzh9] : -1;
            i2 = zze[zzh10] + (zzameVar.zzg() ? 1 : 0);
            i3 = 1536;
            str = str2;
        }
        return new zzmz(str, i9, i2, i, zze2, i3, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & UByte.MAX_VALUE) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return zze((b & 192) >> 6, b & 63);
    }

    private static int zze(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
