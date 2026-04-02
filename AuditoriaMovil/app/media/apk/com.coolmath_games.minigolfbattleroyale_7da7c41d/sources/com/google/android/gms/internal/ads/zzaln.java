package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaln {
    @Pure
    public static void zza(String str, String str2, Throwable th) {
        Log.w(str, zzc(str2, th));
    }

    @Pure
    public static void zzb(String str, String str2, Throwable th) {
        Log.e(str, zzc(str2, th));
    }

    @Pure
    private static String zzc(String str, Throwable th) {
        String replace;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 != null) {
                    if (th2 instanceof UnknownHostException) {
                        replace = "UnknownHostException (no network)";
                        break;
                    }
                    th2 = th2.getCause();
                } else {
                    replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace2 = replace.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(replace2).length());
        sb.append(valueOf);
        sb.append("\n  ");
        sb.append(replace2);
        sb.append('\n');
        return sb.toString();
    }
}
