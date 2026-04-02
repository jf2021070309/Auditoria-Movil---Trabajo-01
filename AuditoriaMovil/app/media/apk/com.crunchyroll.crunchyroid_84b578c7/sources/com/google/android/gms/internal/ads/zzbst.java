package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amazon.aps.iva.k.q;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbst implements zzbsv {
    @VisibleForTesting
    static zzbsv zza;
    @VisibleForTesting
    static zzbsv zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzbzu zzh;
    private final Object zzd = new Object();
    private final WeakHashMap zzf = new WeakHashMap();

    public zzbst(Context context, zzbzu zzbzuVar) {
        zzfll.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzbzuVar;
    }

    public static zzbsv zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbdh.zze.zze()).booleanValue()) {
                    if (!((Boolean) zzba.zzc().zzb(zzbbf.zzhk)).booleanValue()) {
                        zza = new zzbst(context, zzbzu.zza());
                    }
                }
                zza = new zzbsu();
            }
        }
        return zza;
    }

    public static zzbsv zzb(Context context, zzbzu zzbzuVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbdh.zze.zze()).booleanValue()) {
                    if (!((Boolean) zzba.zzc().zzb(zzbbf.zzhk)).booleanValue()) {
                        zzbst zzbstVar = new zzbst(context, zzbzuVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbstVar.zzd) {
                                zzbstVar.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbss(zzbstVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbsr(zzbstVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbstVar;
                    }
                }
                zzb = new zzbsu();
            }
        }
        return zzb;
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzfpf.zzc(zzbzh.zzf(zzc(th)));
    }

    public final void zze(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzbzh.zzo(stackTraceElement.getClassName());
                    z2 |= zzbst.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                zzg(th, "", 1.0f);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzg(Throwable th, String str, float f) {
        Throwable th2;
        String str2;
        int i;
        String str3;
        String str4;
        Handler handler = zzbzh.zza;
        boolean z = false;
        if (((Boolean) zzbdh.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzbzh.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        } else {
                            arrayList.add(stackTraceElement);
                        }
                    }
                }
                if (z2) {
                    if (th2 == null) {
                        th2 = new Throwable(th4.getMessage());
                    } else {
                        th2 = new Throwable(th4.getMessage(), th2);
                    }
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String zzc2 = zzc(th);
        if (((Boolean) zzba.zzc().zzb(zzbbf.zzih)).booleanValue()) {
            str2 = zzd(th);
        } else {
            str2 = "";
        }
        double d = f;
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        double random = Math.random();
        if (i2 > 0) {
            i = (int) (1.0f / f);
        } else {
            i = 1;
        }
        if (random < d) {
            ArrayList arrayList2 = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th5) {
                zzbzo.zzh("Error fetching instant app info", th5);
            }
            try {
                str3 = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzbzo.zzj("Cannot obtain package name, proceeding.");
                str3 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str5 = Build.MANUFACTURER;
            String str6 = Build.MODEL;
            if (!str6.startsWith(str5)) {
                str6 = q.b(str5, " ", str6);
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzc2).appendQueryParameter("eids", TextUtils.join(",", zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "525816637").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbdh.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze)));
            if (true != this.zzh.zze) {
                str4 = "0";
            } else {
                str4 = "1";
            }
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("lite", str4);
            if (!TextUtils.isEmpty(str2)) {
                appendQueryParameter3.appendQueryParameter("hash", str2);
            }
            arrayList2.add(appendQueryParameter3.toString());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                final String str7 = (String) it.next();
                final zzbzt zzbztVar = new zzbzt(null);
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbzt.this.zza(str7);
                    }
                });
            }
        }
    }
}
