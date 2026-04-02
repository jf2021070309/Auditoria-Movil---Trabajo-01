package com.google.android.gms.internal.ads;

import android.util.Log;
import e.a.d.a.a;
import java.util.Locale;
/* loaded from: classes.dex */
public final class zzwo {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable(zza, 2);
    private static final String zzc = zzwo.class.getName();

    public static void zza(String str, Object... objArr) {
        if (zzb) {
            zze(str, objArr);
        }
    }

    public static void zzb(String str, Object... objArr) {
        zze(str, objArr);
    }

    public static void zzc(String str, Object... objArr) {
        Log.e(zza, zze(str, objArr));
    }

    public static void zzd(Throwable th, String str, Object... objArr) {
        Log.e(zza, zze(str, objArr), th);
    }

    private static String zze(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i2 = 2;
        while (true) {
            if (i2 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i2].getClassName().equals(zzc)) {
                String className = stackTrace[i2].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i2].getMethodName();
                str2 = a.s(new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length()), substring2, ".", methodName);
                break;
            } else {
                i2++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }
}
