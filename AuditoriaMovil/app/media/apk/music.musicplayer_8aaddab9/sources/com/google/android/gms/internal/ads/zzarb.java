package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzarb {
    private static final int[] zza = {zzave.zzl("isom"), zzave.zzl("iso2"), zzave.zzl("iso3"), zzave.zzl("iso4"), zzave.zzl("iso5"), zzave.zzl("iso6"), zzave.zzl("avc1"), zzave.zzl("hvc1"), zzave.zzl("hev1"), zzave.zzl("mp41"), zzave.zzl("mp42"), zzave.zzl("3g2a"), zzave.zzl("3g2b"), zzave.zzl("3gr6"), zzave.zzl("3gs6"), zzave.zzl("3ge6"), zzave.zzl("3gg6"), zzave.zzl("M4V "), zzave.zzl("M4A "), zzave.zzl("f4v "), zzave.zzl("kddi"), zzave.zzl("M4VP"), zzave.zzl("qt  "), zzave.zzl("MSNV")};

    public static boolean zza(zzapn zzapnVar) throws IOException, InterruptedException {
        return zzc(zzapnVar, true);
    }

    public static boolean zzb(zzapn zzapnVar) throws IOException, InterruptedException {
        return zzc(zzapnVar, false);
    }

    private static boolean zzc(zzapn zzapnVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        long zzi = zzapnVar.zzi();
        int i2 = (int) ((zzi == -1 || zzi > 4096) ? 4096L : 4096L);
        zzaux zzauxVar = new zzaux(64);
        int i3 = 0;
        boolean z3 = false;
        while (i3 < i2) {
            zzauxVar.zza(8);
            zzapnVar.zze(zzauxVar.zza, 0, 8, false);
            long zzp = zzauxVar.zzp();
            int zzr = zzauxVar.zzr();
            int i4 = 16;
            if (zzp == 1) {
                zzapnVar.zze(zzauxVar.zza, 8, 8, false);
                zzauxVar.zzf(16);
                zzp = zzauxVar.zzv();
            } else {
                i4 = 8;
            }
            long j2 = i4;
            if (zzp < j2) {
                return false;
            }
            i3 += i4;
            if (zzr != zzaqk.zzE) {
                if (zzr == zzaqk.zzN || zzr == zzaqk.zzP) {
                    z2 = true;
                    break;
                } else if ((i3 + zzp) - j2 >= i2) {
                    break;
                } else {
                    int i5 = (int) (zzp - j2);
                    i3 += i5;
                    if (zzr == zzaqk.zzd) {
                        if (i5 < 8) {
                            return false;
                        }
                        zzauxVar.zza(i5);
                        zzapnVar.zze(zzauxVar.zza, 0, i5, false);
                        int i6 = i5 >> 2;
                        for (int i7 = 0; i7 < i6; i7++) {
                            if (i7 != 1) {
                                int zzr2 = zzauxVar.zzr();
                                if ((zzr2 >>> 8) != zzave.zzl("3gp")) {
                                    int[] iArr = zza;
                                    int length = iArr.length;
                                    for (int i8 = 0; i8 < 24; i8++) {
                                        if (iArr[i8] != zzr2) {
                                        }
                                    }
                                    continue;
                                }
                                z3 = true;
                                break;
                            }
                            zzauxVar.zzj(4);
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i5 != 0) {
                        zzapnVar.zzf(i5, false);
                    }
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
