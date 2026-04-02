package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import e.a.d.a.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcar implements zzcat {
    @VisibleForTesting
    public static zzcat zza;
    @VisibleForTesting
    public static zzcat zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzcgz zzh;
    private final Object zzd = new Object();
    private final WeakHashMap<Thread, Boolean> zzf = new WeakHashMap<>();

    public zzcar(Context context, zzcgz zzcgzVar) {
        zzfkz.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzcgzVar;
    }

    public static zzcat zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (zzblf.zze.zze().booleanValue()) {
                    if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfz)).booleanValue()) {
                        zza = new zzcar(context, zzcgz.zza());
                    }
                }
                zza = new zzcas();
            }
        }
        return zza;
    }

    public static zzcat zzb(Context context, zzcgz zzcgzVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (zzblf.zze.zze().booleanValue()) {
                    if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfz)).booleanValue()) {
                        zzcar zzcarVar = new zzcar(context, zzcgzVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzcarVar.zzd) {
                                zzcarVar.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzcaq(zzcarVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzcap(zzcarVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzcarVar;
                    }
                }
                zzb = new zzcas();
            }
        }
        return zzb;
    }

    public final void zzc(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzcgm.zzi(stackTraceElement.getClassName());
                    z2 |= zzcar.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            zze(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzd(Throwable th, String str) {
        zze(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zze(Throwable th, String str, float f2) {
        boolean z;
        String str2;
        if (zzcgm.zzg(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        zzged.zzc(th, new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        double d2 = f2;
        double random = Math.random();
        int i2 = f2 > 0.0f ? (int) (1.0f / f2) : 1;
        if (random < d2) {
            ArrayList arrayList = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th2) {
                zzcgt.zzg("Error fetching instant app info", th2);
                z = false;
            }
            try {
                str2 = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzcgt.zzi("Cannot obtain package name, proceeding.");
                str2 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(FacebookAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = a.s(new StringBuilder(String.valueOf(str3).length() + 1 + str4.length()), str3, " ", str4);
            }
            arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", zzbjl.zzc())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "407425155").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(zzblf.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? "0" : "1").toString());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final String str5 = (String) it.next();
                final zzcgy zzcgyVar = new zzcgy(null);
                this.zzg.execute(new Runnable(zzcgyVar, str5) { // from class: com.google.android.gms.internal.ads.zzcao
                    private final zzcgy zza;
                    private final String zzb;

                    {
                        this.zza = zzcgyVar;
                        this.zzb = str5;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza(this.zzb);
                    }
                });
            }
        }
    }
}
