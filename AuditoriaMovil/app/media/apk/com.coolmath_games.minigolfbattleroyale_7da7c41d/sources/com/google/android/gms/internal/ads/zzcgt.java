package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.ads.AdRequest;
import com.google.android.gms.games.GamesStatusCodes;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public class zzcgt {
    protected static final zzfmg zza = zzfmg.zzc(GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND);

    public static void zzd(String str) {
        if (zzm(3)) {
            if (str == null || str.length() <= 4000) {
                Log.d(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.d(AdRequest.LOGTAG, str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zze(String str, Throwable th) {
        if (zzm(3)) {
            Log.d(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzf(String str) {
        if (zzm(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.e(AdRequest.LOGTAG, str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzg(String str, Throwable th) {
        if (zzm(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzh(String str) {
        if (zzm(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.i(AdRequest.LOGTAG, str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzi(String str) {
        if (zzm(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.w(AdRequest.LOGTAG, str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzj(String str, Throwable th) {
        if (zzm(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    static String zzk(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            StringBuilder sb = new StringBuilder(str.length() + 13);
            sb.append(str);
            sb.append(" @");
            sb.append(lineNumber);
            return sb.toString();
        }
        return str;
    }

    public static void zzl(String str, Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzj(zzk(str), th);
            } else {
                zzi(zzk(str));
            }
        }
    }

    public static boolean zzm(int i) {
        return i >= 5 || Log.isLoggable(AdRequest.LOGTAG, i);
    }
}
