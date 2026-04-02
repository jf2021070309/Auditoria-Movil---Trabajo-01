package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzr {
    private final Bundle zza;

    public zzr(Bundle bundle) {
        if (bundle != null) {
            this.zza = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    private final a zzg(String str) {
        String zza = zza(str);
        if (!TextUtils.isEmpty(zza)) {
            try {
                return new a(zza);
            } catch (b unused) {
                new StringBuilder(e.a(zza, e.a(zzh(str), 50)));
                return null;
            }
        }
        return null;
    }

    private static String zzh(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    private static String zzi(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    public final String zza(String str) {
        Bundle bundle = this.zza;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String zzi = zzi(str);
            if (this.zza.containsKey(zzi)) {
                str = zzi;
            }
        }
        return bundle.getString(str);
    }

    public final boolean zzb(String str) {
        String zza = zza(str);
        return "1".equals(zza) || Boolean.parseBoolean(zza);
    }

    public final Integer zzc(String str) {
        String zza = zza(str);
        if (TextUtils.isEmpty(zza)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(zza));
        } catch (NumberFormatException unused) {
            new StringBuilder(e.a(zza, e.a(zzh(str), 38)));
            return null;
        }
    }

    public final Long zzd(String str) {
        String zza = zza(str);
        if (TextUtils.isEmpty(zza)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(zza));
        } catch (NumberFormatException unused) {
            new StringBuilder(e.a(zza, e.a(zzh(str), 38)));
            return null;
        }
    }

    public final String zze(String str) {
        String valueOf = String.valueOf(str);
        return zza("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    public final Object[] zzf(String str) {
        String valueOf = String.valueOf(str);
        a zzg = zzg("_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (zzg == null) {
            return null;
        }
        int e = zzg.e();
        String[] strArr = new String[e];
        for (int i = 0; i < e; i++) {
            strArr[i] = zzg.l(i);
        }
        return strArr;
    }

    public final Bundle zze() {
        Bundle bundle = new Bundle(this.zza);
        for (String str : this.zza.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final String zzb() {
        String zza = zza("gcm.n.sound2");
        return TextUtils.isEmpty(zza) ? zza("gcm.n.sound") : zza;
    }

    public final Bundle zzf() {
        Bundle bundle = new Bundle(this.zza);
        for (String str : this.zza.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    private final String zzb(Resources resources, String str, String str2) {
        String zze = zze(str2);
        if (TextUtils.isEmpty(zze)) {
            return null;
        }
        int identifier = resources.getIdentifier(zze, "string", str);
        if (identifier == 0) {
            String valueOf = String.valueOf(str2);
            new StringBuilder(e.a(str2, e.a(zzh("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf)), 49)));
            return null;
        }
        Object[] zzf = zzf(str2);
        if (zzf == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, zzf);
        } catch (MissingFormatArgumentException unused) {
            new StringBuilder(e.a(Arrays.toString(zzf), e.a(zzh(str2), 58)));
            return null;
        }
    }

    public final Uri zza() {
        String zza = zza("gcm.n.link_android");
        if (TextUtils.isEmpty(zza)) {
            zza = zza("gcm.n.link");
        }
        if (TextUtils.isEmpty(zza)) {
            return null;
        }
        return Uri.parse(zza);
    }

    public final String zza(Resources resources, String str, String str2) {
        String zza = zza(str2);
        return !TextUtils.isEmpty(zza) ? zza : zzb(resources, str, str2);
    }

    public final long[] zzc() {
        a zzg = zzg("gcm.n.vibrate_timings");
        if (zzg == null) {
            return null;
        }
        try {
            if (zzg.e() > 1) {
                int e = zzg.e();
                long[] jArr = new long[e];
                for (int i = 0; i < e; i++) {
                    jArr[i] = zzg.k(i);
                }
                return jArr;
            }
            throw new b("vibrateTimings have invalid length");
        } catch (b | NumberFormatException unused) {
            new StringBuilder(String.valueOf(zzg).length() + 74);
            return null;
        }
    }

    public final int[] zzd() {
        a zzg = zzg("gcm.n.light_settings");
        if (zzg == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (zzg.e() == 3) {
                int parseColor = Color.parseColor(zzg.l(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = zzg.g(1);
                    iArr[2] = zzg.g(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new b("lightSettings don't have all three fields");
        } catch (b unused) {
            new StringBuilder(String.valueOf(zzg).length() + 58);
            return null;
        } catch (IllegalArgumentException e) {
            new StringBuilder(e.a(e.getMessage(), String.valueOf(zzg).length() + 60));
            return null;
        }
    }

    public static boolean zza(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(zzi("gcm.n.e")));
    }
}
