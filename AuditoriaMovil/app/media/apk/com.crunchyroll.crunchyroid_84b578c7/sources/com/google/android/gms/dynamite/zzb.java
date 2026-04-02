package com.google.android.gms.dynamite;

import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
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
                } catch (SecurityException e) {
                    e.getMessage();
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread zzc() {
        SecurityException e;
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
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 < activeGroupCount) {
                            threadGroup = threadGroupArr[i2];
                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                break;
                            }
                            i2++;
                        } else {
                            threadGroup = null;
                            break;
                        }
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i < activeCount) {
                            zzaVar2 = threadArr[i];
                            if ("GmsDynamite".equals(zzaVar2.getName())) {
                                break;
                            }
                            i++;
                        } else {
                            zzaVar2 = null;
                            break;
                        }
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    zzaVar = null;
                }
                if (zzaVar2 == null) {
                    try {
                        zzaVar = new zza(threadGroup, "GmsDynamite");
                        try {
                            zzaVar.setContextClassLoader(null);
                            zzaVar.start();
                        } catch (SecurityException e3) {
                            e = e3;
                            e.getMessage();
                            zzaVar2 = zzaVar;
                            return zzaVar2;
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        zzaVar = zzaVar2;
                    }
                    zzaVar2 = zzaVar;
                }
            }
            return zzaVar2;
        }
    }
}
