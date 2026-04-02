package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzfal;
import com.google.android.gms.internal.ads.zzfar;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zze {
    public static boolean zza(zzfal zzfalVar) {
        if (zze(zzfalVar)) {
            zzbdg zzbdgVar = zzfalVar.zza.zza.zzd;
            return (zzbdgVar.zzs == null && zzbdgVar.zzx == null) ? false : true;
        }
        return false;
    }

    public static String zzb(zzfal zzfalVar) {
        return !zze(zzfalVar) ? "" : zzfalVar.zza.zza.zzd.zzp;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zzc(zzfal zzfalVar) {
        char c;
        if (zze(zzfalVar)) {
            String zzd = zzd(zzfalVar.zza.zza);
            if (TextUtils.isEmpty(zzd)) {
                return "unspecified";
            }
            switch (zzd.hashCode()) {
                case 1743582862:
                    if (zzd.equals("requester_type_0")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1743582863:
                    if (zzd.equals("requester_type_1")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1743582864:
                    if (zzd.equals("requester_type_2")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1743582865:
                    if (zzd.equals("requester_type_3")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1743582866:
                    if (zzd.equals("requester_type_4")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1743582867:
                    if (zzd.equals("requester_type_5")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1743582868:
                    if (zzd.equals("requester_type_6")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return AppEventsConstants.EVENT_PARAM_VALUE_NO;
                case 1:
                    return "1";
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                case 6:
                    return "6";
                default:
                    return zzd;
            }
        }
        return "unspecified";
    }

    public static String zzd(zzfar zzfarVar) {
        Bundle bundle = zzfarVar.zzd.zzc;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    private static boolean zze(zzfal zzfalVar) {
        return zzfalVar != null;
    }
}
