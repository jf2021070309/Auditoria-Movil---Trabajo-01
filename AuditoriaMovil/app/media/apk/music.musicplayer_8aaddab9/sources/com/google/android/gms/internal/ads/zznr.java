package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zznr {
    public final String zza;

    private zznr(int i2, int i3, String str) {
        this.zza = str;
    }

    public static zznr zza(zzamf zzamfVar) {
        String str;
        zzamfVar.zzk(2);
        int zzn = zzamfVar.zzn();
        int i2 = zzn >> 1;
        int zzn2 = (zzamfVar.zzn() >> 3) | ((zzn & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else if (i2 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = zzn2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(str2);
        sb.append(zzn2);
        return new zznr(i2, zzn2, sb.toString());
    }
}
