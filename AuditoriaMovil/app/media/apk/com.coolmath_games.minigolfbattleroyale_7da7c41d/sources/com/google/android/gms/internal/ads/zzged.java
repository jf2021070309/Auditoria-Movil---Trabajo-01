package com.google.android.gms.internal.ads;

import java.io.PrintStream;
import java.io.PrintWriter;
/* compiled from: com.google.android.gms:play-services-ads-base@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzged {
    static final zzgdx zza;

    static {
        zzgdx zzgebVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                zzgebVar = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new zzgea() : new zzgeb();
            } else {
                zzgebVar = new zzgec();
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = zzgeb.class.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            zzgebVar = new zzgeb();
        }
        zza = zzgebVar;
        if (num == null) {
            return;
        }
        num.intValue();
    }

    public static void zza(Throwable th, Throwable th2) {
        zza.zza(th, th2);
    }

    public static void zzb(Throwable th) {
        zza.zzb(th);
    }

    public static void zzc(Throwable th, PrintWriter printWriter) {
        zza.zzc(th, printWriter);
    }
}
