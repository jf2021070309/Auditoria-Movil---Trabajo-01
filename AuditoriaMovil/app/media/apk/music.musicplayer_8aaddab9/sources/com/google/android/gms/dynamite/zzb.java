package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
/* loaded from: classes.dex */
public final class zzb {
    private static volatile ClassLoader zza;
    private static volatile Thread zzb;

    public static synchronized ClassLoader zza() {
        ClassLoader classLoader;
        synchronized (zzb.class) {
            if (zza == null) {
                zza = zzb();
            }
            classLoader = zza;
        }
        return classLoader;
    }

    private static synchronized ClassLoader zzb() {
        synchronized (zzb.class) {
            ClassLoader classLoader = null;
            if (zzb == null) {
                zzb = zzc();
                if (zzb == null) {
                    return null;
                }
            }
            synchronized (zzb) {
                try {
                    classLoader = zzb.getContextClassLoader();
                } catch (SecurityException e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread zzc() {
        SecurityException e2;
        zza zzaVar;
        zza zzaVar2;
        ThreadGroup threadGroup;
        synchronized (zzb.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i3];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i3++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i2 >= activeCount) {
                            zzaVar2 = null;
                            break;
                        }
                        zzaVar2 = threadArr[i2];
                        if ("GmsDynamite".equals(zzaVar2.getName())) {
                            break;
                        }
                        i2++;
                    }
                } catch (SecurityException e3) {
                    e2 = e3;
                    zzaVar = null;
                }
                if (zzaVar2 == null) {
                    try {
                        zzaVar = new zza(threadGroup, "GmsDynamite");
                        try {
                            zzaVar.setContextClassLoader(null);
                            zzaVar.start();
                        } catch (SecurityException e4) {
                            e2 = e4;
                            String valueOf = String.valueOf(e2.getMessage());
                            Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new String("Failed to enumerate thread/threadgroup "));
                            zzaVar2 = zzaVar;
                            return zzaVar2;
                        }
                    } catch (SecurityException e5) {
                        e2 = e5;
                        zzaVar = zzaVar2;
                    }
                    zzaVar2 = zzaVar;
                }
            }
            return zzaVar2;
        }
    }
}
