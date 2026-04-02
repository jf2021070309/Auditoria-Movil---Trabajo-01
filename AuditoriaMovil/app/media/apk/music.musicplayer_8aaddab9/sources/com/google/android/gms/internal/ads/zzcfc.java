package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzcfc {
    public static String zza(String str, Context context, boolean z) {
        String zzl;
        if ((!((Boolean) zzbet.zzc().zzc(zzbjl.zzag)).booleanValue() || z) && com.google.android.gms.ads.internal.zzt.zzA().zzb(context) && !TextUtils.isEmpty(str) && (zzl = com.google.android.gms.ads.internal.zzt.zzA().zzl(context)) != null) {
            String str2 = (String) zzbet.zzc().zzc(zzbjl.zzZ);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzY)).booleanValue() && str.contains(str2)) {
                if (com.google.android.gms.ads.internal.zzt.zzc().zzp(str)) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzn(context, zzl);
                    return zzd(str, context).replace(str2, zzl);
                } else if (com.google.android.gms.ads.internal.zzt.zzc().zzq(str)) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzo(context, zzl);
                    return zzd(str, context).replace(str2, zzl);
                } else {
                    return str;
                }
            } else if (str.contains("fbs_aeid")) {
                return str;
            } else {
                if (com.google.android.gms.ads.internal.zzt.zzc().zzp(str)) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzn(context, zzl);
                    return zzc(zzd(str, context), "fbs_aeid", zzl).toString();
                } else if (com.google.android.gms.ads.internal.zzt.zzc().zzq(str)) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzo(context, zzl);
                    return zzc(zzd(str, context), "fbs_aeid", zzl).toString();
                } else {
                    return str;
                }
            }
        }
        return str;
    }

    public static String zzb(Uri uri, Context context) {
        String zzl;
        if (com.google.android.gms.ads.internal.zzt.zzA().zzb(context) && (zzl = com.google.android.gms.ads.internal.zzt.zzA().zzl(context)) != null) {
            String str = (String) zzbet.zzc().zzc(zzbjl.zzZ);
            String uri2 = uri.toString();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzY)).booleanValue() && uri2.contains(str)) {
                com.google.android.gms.ads.internal.zzt.zzA().zzn(context, zzl);
                return zzd(uri2, context).replace(str, zzl);
            } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                String uri3 = zzc(zzd(uri2, context), "fbs_aeid", zzl).toString();
                com.google.android.gms.ads.internal.zzt.zzA().zzn(context, zzl);
                return uri3;
            } else {
                return uri2;
            }
        }
        return uri.toString();
    }

    @VisibleForTesting
    public static Uri zzc(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            StringBuilder sb = new StringBuilder(str.substring(0, i2));
            a.M(sb, str2, "=", str3, "&");
            sb.append(str.substring(i2));
            return Uri.parse(sb.toString());
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    private static String zzd(String str, Context context) {
        String zzj = com.google.android.gms.ads.internal.zzt.zzA().zzj(context);
        String zzk = com.google.android.gms.ads.internal.zzt.zzA().zzk(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzj)) {
            str = zzc(str, "gmp_app_id", zzj).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzk)) ? str : zzc(str, "fbs_aiid", zzk).toString();
    }
}
