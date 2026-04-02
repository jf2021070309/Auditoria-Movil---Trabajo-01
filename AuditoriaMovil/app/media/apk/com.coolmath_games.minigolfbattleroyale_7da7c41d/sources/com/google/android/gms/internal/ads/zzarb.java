package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzarb {
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
        int i = (int) ((zzi == -1 || zzi > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) ? 4096L : 4096L);
        zzaux zzauxVar = new zzaux(64);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < i) {
            zzauxVar.zza(8);
            zzapnVar.zze(zzauxVar.zza, 0, 8, false);
            long zzp = zzauxVar.zzp();
            int zzr = zzauxVar.zzr();
            int i3 = 16;
            if (zzp == 1) {
                zzapnVar.zze(zzauxVar.zza, 8, 8, false);
                zzauxVar.zzf(16);
                zzp = zzauxVar.zzv();
            } else {
                i3 = 8;
            }
            long j = i3;
            if (zzp < j) {
                return false;
            }
            i2 += i3;
            if (zzr != zzaqk.zzE) {
                if (zzr == zzaqk.zzN || zzr == zzaqk.zzP) {
                    z2 = true;
                    break;
                } else if ((i2 + zzp) - j >= i) {
                    break;
                } else {
                    int i4 = (int) (zzp - j);
                    i2 += i4;
                    if (zzr == zzaqk.zzd) {
                        if (i4 < 8) {
                            return false;
                        }
                        zzauxVar.zza(i4);
                        zzapnVar.zze(zzauxVar.zza, 0, i4, false);
                        int i5 = i4 >> 2;
                        for (int i6 = 0; i6 < i5; i6++) {
                            if (i6 == 1) {
                                zzauxVar.zzj(4);
                            } else {
                                int zzr2 = zzauxVar.zzr();
                                if ((zzr2 >>> 8) != zzave.zzl("3gp")) {
                                    int[] iArr = zza;
                                    int length = iArr.length;
                                    for (int i7 = 0; i7 < 24; i7++) {
                                        if (iArr[i7] != zzr2) {
                                        }
                                    }
                                    continue;
                                }
                                z3 = true;
                                break;
                            }
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        zzapnVar.zzf(i4, false);
                    }
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
