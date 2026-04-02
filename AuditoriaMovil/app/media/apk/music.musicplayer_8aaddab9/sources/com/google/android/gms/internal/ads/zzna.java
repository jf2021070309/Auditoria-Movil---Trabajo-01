package com.google.android.gms.internal.ads;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.ads.AdRequest;
/* loaded from: classes.dex */
public final class zzna {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, SyslogConstants.LOG_ALERT, 128, SyslogConstants.LOG_LOCAL4, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzafv zza(zzamf zzamfVar, String str, String str2, zzn zznVar) {
        int i2 = zzc[(zzamfVar.zzn() & 192) >> 6];
        int zzn = zzamfVar.zzn();
        int i3 = zze[(zzn & 56) >> 3];
        if ((zzn & 4) != 0) {
            i3++;
        }
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD(str);
        zzaftVar.zzN("audio/ac3");
        zzaftVar.zzaa(i3);
        zzaftVar.zzab(i2);
        zzaftVar.zzQ(zznVar);
        zzaftVar.zzG(str2);
        return zzaftVar.zzah();
    }

    public static zzafv zzb(zzamf zzamfVar, String str, String str2, zzn zznVar) {
        zzamfVar.zzk(2);
        int i2 = zzc[(zzamfVar.zzn() & 192) >> 6];
        int zzn = zzamfVar.zzn();
        int i3 = zze[(zzn & 14) >> 1];
        if ((zzn & 1) != 0) {
            i3++;
        }
        if (((zzamfVar.zzn() & 30) >> 1) > 0 && (2 & zzamfVar.zzn()) != 0) {
            i3 += 2;
        }
        String str3 = (zzamfVar.zzd() <= 0 || (zzamfVar.zzn() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD(str);
        zzaftVar.zzN(str3);
        zzaftVar.zzaa(i3);
        zzaftVar.zzab(i2);
        zzaftVar.zzQ(zznVar);
        zzaftVar.zzG(str2);
        return zzaftVar.zzah();
    }

    public static zzmz zzc(zzame zzameVar) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int zzh;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int zzc2 = zzameVar.zzc();
        zzameVar.zzf(40);
        int zzh2 = zzameVar.zzh(5);
        zzameVar.zzd(zzc2);
        int i12 = -1;
        if (zzh2 > 10) {
            zzameVar.zzf(16);
            int zzh3 = zzameVar.zzh(2);
            if (zzh3 == 0) {
                i12 = 0;
            } else if (zzh3 == 1) {
                i12 = 1;
            } else if (zzh3 == 2) {
                i12 = 2;
            }
            zzameVar.zzf(3);
            int zzh4 = zzameVar.zzh(11) + 1;
            int i13 = zzh4 + zzh4;
            int zzh5 = zzameVar.zzh(2);
            if (zzh5 == 3) {
                i8 = zzd[zzameVar.zzh(2)];
                zzh = 3;
                i7 = 6;
            } else {
                zzh = zzameVar.zzh(2);
                i7 = zzb[zzh];
                i8 = zzc[zzh5];
            }
            int i14 = i7 * 256;
            int zzh6 = zzameVar.zzh(3);
            boolean zzg2 = zzameVar.zzg();
            int i15 = zze[zzh6] + (zzg2 ? 1 : 0);
            zzameVar.zzf(10);
            if (zzameVar.zzg()) {
                zzameVar.zzf(8);
            }
            if (zzh6 == 0) {
                zzameVar.zzf(5);
                if (zzameVar.zzg()) {
                    zzameVar.zzf(8);
                }
                i9 = 0;
                zzh6 = 0;
            } else {
                i9 = zzh6;
            }
            if (i12 == 1) {
                if (zzameVar.zzg()) {
                    zzameVar.zzf(16);
                }
                i10 = 1;
            } else {
                i10 = i12;
            }
            if (zzameVar.zzg()) {
                if (i9 > 2) {
                    zzameVar.zzf(2);
                }
                if ((i9 & 1) != 0 && i9 > 2) {
                    zzameVar.zzf(6);
                }
                if ((i9 & 4) != 0) {
                    zzameVar.zzf(6);
                }
                if (zzg2 && zzameVar.zzg()) {
                    zzameVar.zzf(5);
                }
                if (i10 == 0) {
                    if (zzameVar.zzg()) {
                        zzameVar.zzf(6);
                    }
                    if (i9 == 0 && zzameVar.zzg()) {
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
                                    zzameVar.zzf(8);
                                    zzameVar.zzf((zzh8 + 2) * 8);
                                    zzameVar.zzj();
                                }
                            }
                        }
                        zzameVar.zzf((zzh8 + 2) * 8);
                        zzameVar.zzj();
                    }
                    if (i9 < 2) {
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
                            i10 = 0;
                            zzh = 0;
                        } else {
                            for (int i16 = 0; i16 < i7; i16++) {
                                if (zzameVar.zzg()) {
                                    zzameVar.zzf(5);
                                }
                            }
                        }
                    }
                    i10 = 0;
                }
            }
            if (zzameVar.zzg()) {
                zzameVar.zzf(5);
                if (i9 == 2) {
                    zzameVar.zzf(4);
                    i9 = 2;
                }
                if (i9 >= 6) {
                    zzameVar.zzf(2);
                }
                if (zzameVar.zzg()) {
                    i11 = 8;
                    zzameVar.zzf(8);
                } else {
                    i11 = 8;
                }
                if (i9 == 0 && zzameVar.zzg()) {
                    zzameVar.zzf(i11);
                }
                if (zzh5 < 3) {
                    zzameVar.zze();
                }
            }
            if (i10 == 0 && zzh != 3) {
                zzameVar.zze();
            }
            if (i10 == 2 && (zzh == 3 || zzameVar.zzg())) {
                zzameVar.zzf(6);
            }
            str = (zzameVar.zzg() && zzameVar.zzh(6) == 1 && zzameVar.zzh(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i2 = i13;
            i6 = i14;
            i3 = i8;
            i4 = i15;
        } else {
            zzameVar.zzf(32);
            int zzh9 = zzameVar.zzh(2);
            String str2 = zzh9 == 3 ? null : "audio/ac3";
            int zze2 = zze(zzh9, zzameVar.zzh(6));
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
            str = str2;
            i2 = zze2;
            i3 = zzh9 < 3 ? zzc[zzh9] : -1;
            i4 = zze[zzh10] + (zzameVar.zzg() ? 1 : 0);
            i5 = -1;
            i6 = 1536;
        }
        return new zzmz(str, i5, i4, i3, i2, i6, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b2 = bArr[4];
            return zze((b2 & 192) >> 6, b2 & 63);
        }
        int i2 = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
        return i2 + i2;
    }

    private static int zze(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = zzc[i2];
        if (i5 == 44100) {
            int i6 = zzg[i4] + (i3 & 1);
            return i6 + i6;
        }
        int i7 = zzf[i4];
        return i5 == 32000 ? i7 * 6 : i7 * 4;
    }
}
