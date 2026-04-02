package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzpc {
    public static int zza(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static zzoz zzb(zzamf zzamfVar, boolean z, boolean z2) throws zzaha {
        if (z) {
            zzc(3, zzamfVar, false);
        }
        String zzE = zzamfVar.zzE((int) zzamfVar.zzu(), zzfll.zzc);
        long zzu = zzamfVar.zzu();
        String[] strArr = new String[(int) zzu];
        int length = zzE.length() + 15;
        for (int i2 = 0; i2 < zzu; i2++) {
            String zzE2 = zzamfVar.zzE((int) zzamfVar.zzu(), zzfll.zzc);
            strArr[i2] = zzE2;
            length = length + 4 + zzE2.length();
        }
        if (z2 && (zzamfVar.zzn() & 1) == 0) {
            throw zzaha.zzb("framing bit expected to be set", null);
        }
        return new zzoz(zzE, strArr, length + 1);
    }

    public static boolean zzc(int i2, zzamf zzamfVar, boolean z) throws zzaha {
        if (zzamfVar.zzd() < 7) {
            if (z) {
                return false;
            }
            int zzd = zzamfVar.zzd();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(zzd);
            throw zzaha.zzb(sb.toString(), null);
        } else if (zzamfVar.zzn() != i2) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i2));
            throw zzaha.zzb(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "), null);
        } else if (zzamfVar.zzn() == 118 && zzamfVar.zzn() == 111 && zzamfVar.zzn() == 114 && zzamfVar.zzn() == 98 && zzamfVar.zzn() == 105 && zzamfVar.zzn() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzaha.zzb("expected characters 'vorbis'", null);
        }
    }
}
