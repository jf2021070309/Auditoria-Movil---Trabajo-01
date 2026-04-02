package com.kwad.components.core.d;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.kuaishou.aegon.Aegon;
import com.kwad.sdk.DownloadTask;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.report.x;
import com.kwad.sdk.crash.b;
import com.kwad.sdk.crash.c;
import com.kwad.sdk.crash.f;
import com.kwad.sdk.crash.h;
import com.kwad.sdk.crash.model.message.ExceptionMessage;
import com.kwad.sdk.m;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.au;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.k;
import com.kwai.CpuMemoryProfiler;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class a {
    private static boolean IV;
    private static final AtomicBoolean IW = new AtomicBoolean(false);
    private static List<Throwable> IX;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.core.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0192a {
        public static String aa(Context context) {
            File file = new File(getDataDir(context), "kwad_ex");
            if (!file.exists()) {
                file.mkdir();
            }
            return file.getAbsolutePath();
        }

        private static File getDataDir(Context context) {
            if (Build.VERSION.SDK_INT >= 29) {
                return new File(context.getExternalFilesDir(null).getAbsolutePath());
            }
            File dataDir = Build.VERSION.SDK_INT >= 24 ? context.getDataDir() : null;
            if (dataDir == null) {
                dataDir = new File(Environment.getDataDirectory().getPath() + "/data/" + context.getPackageName());
                if (!dataDir.exists()) {
                    return new File("/data/data/" + context.getPackageName());
                }
            }
            return dataDir;
        }
    }

    private static String aj(String str) {
        try {
            int indexOf = str.indexOf(46, str.indexOf(46) + 1);
            if (indexOf > 0) {
                return str.substring(0, indexOf);
            }
            return null;
        } catch (Throwable th) {
            c.printStackTraceOnly(th);
            return null;
        }
    }

    public static void b(Throwable th) {
        c.printStackTrace(th);
        if (IW.get()) {
            b.l(th);
        } else {
            c(th);
        }
    }

    private static void c(Throwable th) {
        if (IX == null) {
            IX = new CopyOnWriteArrayList();
        }
        IX.add(th);
    }

    public static synchronized void initAsync(Context context) {
        synchronized (a.class) {
            if (context != null) {
                if (!IW.get() && !IV) {
                    IV = true;
                    g.execute(new aw() { // from class: com.kwad.components.core.d.a.1
                        @Override // com.kwad.sdk.utils.aw
                        public final void doTask() {
                            if (d.b(com.kwad.sdk.core.config.c.aks)) {
                                c.d("KsAdExceptionCollectorHelper", "init");
                                b.a(a.mK());
                                a.IW.set(true);
                                a.mG();
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mG() {
        List<Throwable> list = IX;
        if (list == null) {
            return;
        }
        for (Throwable th : list) {
            b.l(th);
        }
        IX.clear();
        IX = null;
        ServiceProvider.d(new com.kwad.sdk.g.a<Throwable>() { // from class: com.kwad.components.core.d.a.2
            private static void d(Throwable th2) {
                b.l(th2);
            }

            @Override // com.kwad.sdk.g.a
            public final /* synthetic */ void accept(Throwable th2) {
                d(th2);
            }
        });
    }

    private static com.kwad.sdk.crash.c mH() {
        final Context context = ServiceProvider.getContext();
        return new c.a().bx(context).bn(d.b(com.kwad.sdk.core.config.c.alE)).bo(d.b(com.kwad.sdk.core.config.c.alF)).bp(KsAdSDKImpl.get().getIsExternal()).em(d.a(com.kwad.sdk.core.config.c.alG)).el(d.a(com.kwad.sdk.core.config.c.alH)).es(ExceptionMessage.getSdkCrashVersionName(KsAdSDKImpl.get().getSDKVersion(), 1)).cC(KsAdSDKImpl.get().getSDKVersionCode()).et(ExceptionMessage.getSdkCrashVersionName(KsAdSDKImpl.get().getApiVersion(), 1)).cD(KsAdSDKImpl.get().getApiVersionCode()).cE(1).er("com.kwad.sdk").eu(context.getPackageName()).ev(ServiceProvider.HB().appId).ew(ServiceProvider.HB().appName).ex(k.bS(context)).eo(au.getDeviceId()).ep(ServiceProvider.HB().appId).en("Android").eq(C0192a.aa(context)).a(new h() { // from class: com.kwad.components.core.d.a.4
            @Override // com.kwad.sdk.crash.h
            public final com.kwad.sdk.crash.model.message.a mN() {
                com.kwad.sdk.crash.model.message.a aVar = new com.kwad.sdk.crash.model.message.a();
                aVar.ey(x.Ck());
                aVar.putString("mKsadAppId", ServiceProvider.HB().appId);
                aVar.putString("mKsadAppName", ServiceProvider.HB().appName);
                aVar.putString("mKsadAppPackageName", context.getPackageName());
                aVar.putString("mKsadAppVersion", k.bS(context));
                aVar.putString("mKsadSdkName", "com.kwad.sdk");
                aVar.putString("mKsadSdkVersion", ExceptionMessage.getSdkCrashVersionName(KsAdSDKImpl.get().getSDKVersion(), 1));
                aVar.putInt("mKsadSdKVersionCode", KsAdSDKImpl.get().getSDKVersionCode());
                aVar.putString("mKsadSdkApiVersion", ExceptionMessage.getSdkCrashVersionName(KsAdSDKImpl.get().getApiVersion(), 1));
                aVar.putInt("mKsadSdKApiVersionCode", KsAdSDKImpl.get().getApiVersionCode());
                aVar.putInt("mKsadSdkType", 1);
                aVar.putInt("mBuildNumber", 489);
                return aVar;
            }
        }).a(new f() { // from class: com.kwad.components.core.d.a.3
            @Override // com.kwad.sdk.crash.f
            public final void a(int i, ExceptionMessage exceptionMessage) {
                m.av(context);
                if (i == 1 || i == 3 || i == 4) {
                    com.kwad.sdk.core.e.c.d("KsAdExceptionCollectorHelper", "onOccurred crashType=" + i);
                }
            }
        }).d(mI()).e(mJ()).A(d.yY()).j(d.a(com.kwad.sdk.core.config.c.amA)).EA();
    }

    private static String[] mI() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(aj(KsAdSDKImpl.class.getName()));
            arrayList.add(aj(DownloadTask.class.getName()));
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
        try {
            arrayList.add(aj(CpuMemoryProfiler.class.getName()));
            arrayList.add(aj(Aegon.class.getName()));
        } catch (Throwable th2) {
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static String[] mJ() {
        String[] strArr = new String[1];
        try {
            String name = com.kwad.sdk.crash.d.class.getName();
            strArr[0] = name.substring(0, name.lastIndexOf("."));
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
        return strArr;
    }

    static /* synthetic */ com.kwad.sdk.crash.c mK() {
        return mH();
    }
}
