package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.appevents.integrity.IntegrityManager;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class e {
    public static String c = "";
    Context a;
    String b;
    private JSONObject d;
    private String e;
    private String f;
    private boolean g;
    private Thread.UncaughtExceptionHandler h;
    private String i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {
        static volatile e a = new e((byte) 0);
    }

    private e() {
        this.g = false;
        this.d = new JSONObject();
        this.h = Thread.getDefaultUncaughtExceptionHandler();
        this.b = " ";
        this.i = "https://outcome-crash-report.supersonicads.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new d(this.h));
    }

    /* synthetic */ e(byte b) {
        this();
    }

    public static e a() {
        return a.a;
    }

    private static String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return IntegrityManager.INTEGRITY_TYPE_NONE;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return IntegrityManager.INTEGRITY_TYPE_NONE;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return "wifi";
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return "cellular";
                    }
                }
            }
            return IntegrityManager.INTEGRITY_TYPE_NONE;
        } catch (Exception e) {
            e.printStackTrace();
            return IntegrityManager.INTEGRITY_TYPE_NONE;
        }
    }

    public final void a(final Context context, HashSet<String> hashSet, String str, String str2, boolean z, final String str3, int i, boolean z2) {
        if (context != null) {
            Log.d("automation_log", "init ISCrashReporter");
            this.a = context;
            if (!TextUtils.isEmpty(str2)) {
                this.b = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.i = str;
            }
            this.f = str3;
            if (z) {
                com.ironsource.environment.a aVar = new com.ironsource.environment.a(i);
                aVar.c = z2;
                aVar.b = true;
                aVar.a = new b() { // from class: com.ironsource.environment.e.1
                    @Override // com.ironsource.environment.b
                    public final void a() {
                        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                        StringBuilder sb = new StringBuilder(128);
                        for (Thread thread : allStackTraces.keySet()) {
                            StackTraceElement[] stackTrace = thread.getStackTrace();
                            if (stackTrace != null && stackTrace.length > 0) {
                                sb.append(",");
                                sb.append(thread.getName());
                                sb.append("\n");
                                for (StackTraceElement stackTraceElement : stackTrace) {
                                    sb.append(stackTraceElement.toString());
                                    sb.append(" ");
                                    sb.append(thread.getState().toString());
                                    sb.append("\n");
                                }
                            }
                        }
                        e.c = sb.toString();
                    }

                    @Override // com.ironsource.environment.b
                    public final void b() {
                    }
                };
                aVar.start();
            }
            String a2 = a(this.a);
            if (!a2.equals(IntegrityManager.INTEGRITY_TYPE_NONE)) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
                String string = sharedPreferences.getString("String1", this.e);
                String string2 = sharedPreferences.getString("sId", this.f);
                new StringBuilder();
                for (c cVar : f.a()) {
                    String b = cVar.b();
                    String a3 = cVar.a();
                    String c2 = cVar.c();
                    String packageName = context.getPackageName();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crashDate", b);
                        jSONObject.put("stacktraceCrash", a3);
                        jSONObject.put("crashType", c2);
                        jSONObject.put("CrashReporterVersion", "1.0.4");
                        jSONObject.put("SDKVersion", VersionInfo.VERSION);
                        jSONObject.put("deviceLanguage", h.b(context));
                        jSONObject.put("appVersion", c.c(context, packageName));
                        jSONObject.put("deviceOSVersion", h.e());
                        jSONObject.put("network", a2);
                        jSONObject.put("deviceApiLevel", h.f());
                        jSONObject.put("deviceModel", h.g());
                        jSONObject.put("deviceOS", h.i());
                        jSONObject.put("advertisingId", string);
                        jSONObject.put("isLimitAdTrackingEnabled", this.g);
                        jSONObject.put("deviceOEM", h.h());
                        jSONObject.put("systemProperties", System.getProperties());
                        jSONObject.put("bundleId", packageName);
                        jSONObject.put("sId", string2);
                        JSONObject jSONObject2 = new JSONObject();
                        if (hashSet != null && !hashSet.isEmpty()) {
                            Iterator<String> it = hashSet.iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                try {
                                    if (jSONObject.has(next)) {
                                        jSONObject2.put(next, jSONObject.opt(next));
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            jSONObject = jSONObject2;
                        }
                        this.d = jSONObject;
                    } catch (Exception unused) {
                    }
                    if (this.d.length() == 0) {
                        Log.d("ISCrashReport", " Is Empty");
                    } else {
                        new Thread(new Runnable() { // from class: com.ironsource.environment.e.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(e.a().i).openConnection();
                                    httpURLConnection.setRequestMethod("POST");
                                    httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                                    httpURLConnection.setRequestProperty("Accept", "application/json");
                                    httpURLConnection.setDoOutput(true);
                                    httpURLConnection.setDoInput(true);
                                    Log.i("JSON", e.this.d.toString());
                                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                                    dataOutputStream.writeBytes(e.this.d.toString());
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                    Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
                                    Log.i("MSG", httpURLConnection.getResponseMessage());
                                    httpURLConnection.disconnect();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }).start();
                        f.c();
                    }
                }
            }
            new Thread(new Runnable() { // from class: com.ironsource.environment.e.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String[] a4 = h.a(context);
                        if (!TextUtils.isEmpty(a4[0])) {
                            e.this.e = a4[0];
                        }
                        e.this.g = Boolean.parseBoolean(a4[1]);
                        SharedPreferences.Editor edit = context.getSharedPreferences("CRep", 0).edit();
                        edit.putString("String1", e.this.e);
                        edit.putString("sId", str3);
                        edit.apply();
                    } catch (Exception unused2) {
                    }
                }
            }).start();
        }
    }
}
