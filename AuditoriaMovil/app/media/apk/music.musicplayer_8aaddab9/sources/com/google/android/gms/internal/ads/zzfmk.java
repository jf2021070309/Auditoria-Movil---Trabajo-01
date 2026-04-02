package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfmk {
    @CheckForNull
    private static final Object zza;
    @CheckForNull
    private static final Method zzb;
    @CheckForNull
    private static final Method zzc;

    static {
        Object zzc2 = zzc();
        zza = zzc2;
        zzb = zzc2 == null ? null : zze("getStackTraceElement", Throwable.class, Integer.TYPE);
        zzc = zzc2 != null ? zzd(zzc2) : null;
    }

    public static void zza(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static String zzb(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        zzged.zzc(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @CheckForNull
    private static Object zzc() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    private static Method zzd(Object obj) {
        try {
            Method zze = zze("getStackTraceDepth", Throwable.class);
            if (zze == null) {
                return null;
            }
            zze.invoke(obj, new Throwable());
            return zze;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @CheckForNull
    private static Method zze(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }
}
