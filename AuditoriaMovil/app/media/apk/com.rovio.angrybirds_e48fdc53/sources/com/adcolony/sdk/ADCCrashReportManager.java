package com.adcolony.sdk;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ADCCrashReportManager {
    static boolean a = true;
    private boolean b = false;
    private String c;
    private String d;
    private Thread.UncaughtExceptionHandler e;
    private List<am> f;
    private JSONArray g;
    private JSONObject h;

    public native void initNativeCrashReporter(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        if (!this.b) {
            au.d.b("Configuring Crash Reporter");
            if (a) {
                this.e = Thread.getDefaultUncaughtExceptionHandler();
                a aVar = new a();
                au.b.b("adding exception handler.");
                Thread.setDefaultUncaughtExceptionHandler(aVar);
                try {
                    this.d = i();
                    initNativeCrashReporter(this.d.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    au.h.b(e.getMessage());
                    this.b = false;
                }
            }
            this.c = com.adcolony.sdk.a.a().l().e() + "fatalLog.txt";
            this.f = new ArrayList();
            this.g = as.b();
            d();
            this.b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        if (a) {
            c();
            h();
            g();
        }
    }

    synchronized void c() {
        synchronized (this) {
            try {
                boolean a2 = com.adcolony.sdk.a.a().g().a(this.c);
                boolean a3 = com.adcolony.sdk.a.a().g().a(this.d);
                if (a2) {
                    StringBuilder a4 = com.adcolony.sdk.a.a().g().a(this.c, false);
                    JSONArray g = as.g(as.a(a4.toString()), "crashList");
                    for (int i = 0; i < g.length(); i++) {
                        JSONObject jSONObject = g.getJSONObject(i);
                        au.b.b("Log read from disk: " + jSONObject.toString());
                        this.f.add(new am().a(jSONObject));
                    }
                    au.b.b("Contents of crash Reporting file: ").b(a4.toString());
                } else {
                    au.b.b("Java Crash log doesn't exist.");
                }
                if (a3) {
                    this.f.add(new am().a(a(com.adcolony.sdk.a.a().g().b(this.d, true))));
                } else {
                    au.b.b("Native Crash log doesn't exist.");
                }
            } catch (Exception e) {
                au.h.b("Exception occurred when retrieving logs. Exception Msg: " + e.getMessage());
            }
        }
    }

    synchronized void d() {
        this.h = as.a();
        try {
            String str = com.adcolony.sdk.a.a().l().e() + "ad_cache_report.txt";
            if (com.adcolony.sdk.a.a().g().a(str)) {
                this.h = as.c(str);
            }
        } catch (Exception e) {
            au.h.b("Exception occurred when retrieving ad-cache log. Exception Msg: " + e.getMessage());
        }
    }

    synchronized void a(Throwable th) {
        String str = null;
        synchronized (this) {
            au.b.b("Writing crash log...");
            if (th != null) {
                JSONArray b = as.b();
                StackTraceElement a2 = a(th.getStackTrace(), b);
                if (a2 == null) {
                    Throwable cause = th.getCause();
                    if (cause == null || (a2 = a(cause.getStackTrace(), (b = as.b()))) == null) {
                        a2 = null;
                    } else {
                        str = cause.getMessage();
                    }
                } else {
                    str = th.getMessage();
                }
                if (a2 != null && str != null) {
                    String className = a2.getClassName();
                    String methodName = a2.getMethodName();
                    int lineNumber = a2.getLineNumber();
                    JSONObject a3 = as.a();
                    as.a(a3, "timestamp", Long.toString(System.currentTimeMillis()));
                    as.a(a3, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str);
                    as.a(a3, "sourceFile", className);
                    as.b(a3, "lineNumber", lineNumber);
                    as.a(a3, "methodName", methodName);
                    as.a(a3, "stackTrace", b);
                    d(a3);
                    au.b.b("saving to disk...");
                    c(a3);
                    f();
                }
                au.b.b("..printing stacktrace");
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void e() {
        JSONObject a2 = as.a();
        aa p = com.adcolony.sdk.a.a().p();
        if (p != null) {
            AdColonyInterstitial adColonyInterstitial = com.adcolony.sdk.a.a().j().c().get(p.a());
            String b = adColonyInterstitial == null ? "" : adColonyInterstitial.b();
            String c = adColonyInterstitial == null ? "" : adColonyInterstitial.c();
            as.a(a2, "isAdActive", true);
            as.a(a2, "activeAdId", b);
            as.a(a2, "active_creative_ad_id", c);
        } else {
            as.a(a2, "isAdActive", false);
            as.a(a2, "activeAdId", "");
            as.a(a2, "active_creative_ad_id", "");
        }
        JSONArray a3 = a(as.c(com.adcolony.sdk.a.a().l().e() + "422de421e0f4e019426b9abfd780746bc40740eb"));
        JSONArray b2 = b(as.c(com.adcolony.sdk.a.a().l().e() + "422de421e0f4e019426b9abfd780746bc40740eb"));
        as.b(a2, "adCacheSize", a3.length());
        as.a(a2, "listOfCachedAds", a3);
        as.a(a2, "listOfCreativeAdIds", b2);
        if (e(a2)) {
            au.b.b("heather adCacheData=" + a2);
            as.h(this.h, com.adcolony.sdk.a.a().l().e() + "ad_cache_report.txt");
            au.b.b("CrashReport AdCache=" + this.h.toString());
            this.h = a2;
        }
    }

    JSONArray a(JSONObject jSONObject) {
        JSONArray b = as.b();
        JSONArray g = as.g(as.f(jSONObject, "app"), "zones");
        for (int i = 0; i < g.length(); i++) {
            JSONArray g2 = as.g(as.d(g, i), "ads");
            for (int i2 = 0; i2 < g2.length(); i2++) {
                JSONObject f = as.f(as.d(g2, i2), "legacy");
                JSONObject f2 = as.f(as.d(g2, i2), "aurora");
                if (f.has("uuid")) {
                    as.a(b, as.b(f, "uuid"));
                } else {
                    as.a(b, as.b(f2, "uuid"));
                }
            }
        }
        return b;
    }

    JSONArray b(JSONObject jSONObject) {
        JSONArray b = as.b();
        JSONArray g = as.g(as.f(jSONObject, "app"), "zones");
        for (int i = 0; i < g.length(); i++) {
            JSONArray g2 = as.g(as.d(g, i), "ads");
            for (int i2 = 0; i2 < g2.length(); i2++) {
                JSONObject f = as.f(as.d(g2, i2), "legacy");
                as.f(as.d(g2, i2), "aurora");
                JSONObject f2 = as.f(f, TTDownloadField.TT_META);
                JSONObject f3 = as.f(f, TTDownloadField.TT_META);
                if (f2.has("creative_id")) {
                    as.a(b, as.b(f2, "creative_id"));
                } else {
                    as.a(b, as.b(f3, "creative_id"));
                }
            }
        }
        return b;
    }

    synchronized void c(JSONObject jSONObject) {
        if (this.g == null) {
            this.g = as.b();
        } else if (this.g.length() == 256) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 1; i < this.g.length(); i++) {
                jSONArray.put(as.b(this.g, i));
            }
            this.g = jSONArray;
        }
        this.g.put(jSONObject);
    }

    private void f() {
        JSONObject a2 = as.a();
        as.a(a2, "crashList", this.g);
        au.b.b("saving object to " + this.c);
        as.h(a2, this.c);
    }

    private void d(JSONObject jSONObject) {
        if (this.h != null) {
            String b = as.b(this.h, "activeAdId");
            boolean d = as.d(this.h, "isAdActive");
            int c = as.c(this.h, "adCacheSize");
            JSONArray g = as.g(this.h, "listOfCachedAds");
            String b2 = as.b(this.h, "active_creative_ad_id");
            JSONArray g2 = as.g(this.h, "listOfCreativeAdIds");
            as.a(jSONObject, "isAdActive", d);
            as.a(jSONObject, "activeAdId", b);
            as.b(jSONObject, "adCacheSize", c);
            as.a(jSONObject, "listOfCachedAds", g);
            as.a(jSONObject, "active_creative_ad_id", b2);
            as.a(jSONObject, "listOfCreativeAdIds", g2);
        }
    }

    private void g() {
        this.f = new ArrayList();
        this.g = as.b();
        try {
            com.adcolony.sdk.a.a().g().a(new File(this.c));
            com.adcolony.sdk.a.a().g().a(new File(this.d));
        } catch (Exception e) {
            au.f.b("Unable to delete log file.");
        }
    }

    private void h() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f.size()) {
                au.b.a("Writing a crash log to adc-instruments");
                b.a(this.f.get(i2));
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    private synchronized JSONObject a(List<String> list) {
        JSONObject a2;
        String str;
        String str2;
        boolean z;
        boolean z2;
        try {
            JSONObject a3 = as.a();
            JSONArray b = as.b();
            JSONArray b2 = as.b();
            int i = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (i < list.size()) {
                String str3 = list.get(i);
                int indexOf = str3.indexOf(58);
                if (indexOf < 0 || indexOf >= str3.length()) {
                    str = null;
                    str2 = null;
                } else {
                    str2 = str3.substring(0, indexOf);
                    str = str3.substring(indexOf + 1).trim();
                }
                if (str2 != null && str2.equals("signalMessage")) {
                    as.a(a3, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str);
                    z = z3;
                    z2 = z4;
                } else if (str2 != null && str2.equals("date")) {
                    as.a(a3, "timestamp", str);
                    z = z3;
                    z2 = z4;
                } else if (str2 != null && str2.equals("threadState")) {
                    z = z3;
                    z2 = true;
                } else if (str2 != null && str2.equals("backtrace")) {
                    z = true;
                    z2 = false;
                } else if (z4) {
                    as.a(b, str3);
                    z = z3;
                    z2 = z4;
                } else if (z3) {
                    as.a(b2, str3);
                    z = z3;
                    z2 = z4;
                } else {
                    if (str2 != null) {
                        as.a(a3, str2, str);
                    }
                    z = z3;
                    z2 = z4;
                }
                i++;
                z4 = z2;
                z3 = z;
            }
            as.a(a3, "threadState", b);
            as.a(a3, "stackTrace", b2);
            d(a3);
            a2 = a3;
        } catch (Exception e) {
            au.h.b("Error occurred while parsing native crash report.");
            a2 = as.a();
            long currentTimeMillis = System.currentTimeMillis();
            as.a(a2, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "An error occurred while paring the native crash report.");
            as.a(a2, "timestamp", Long.toString(currentTimeMillis));
        }
        return a2;
    }

    private String i() {
        return com.adcolony.sdk.a.a().l().e() + "com.adcolony.crashreports.current.crash";
    }

    private boolean e(JSONObject jSONObject) {
        if (this.h.has("isAdActive") && this.h.has("activeAdId") && this.h.has("adCacheSize") && this.h.has("listOfCachedAds")) {
            return (as.d(this.h, "isAdActive") != as.d(jSONObject, "isAdActive")) || (!as.b(this.h, "activeAdId").equals(as.b(jSONObject, "activeAdId"))) || (as.c(this.h, "adCacheSize") != as.c(jSONObject, "adCacheSize")) || (!as.g(this.h, "listOfCachedAds").equals(as.g(jSONObject, "listOfCachedAds")));
        }
        return true;
    }

    private StackTraceElement a(StackTraceElement[] stackTraceElementArr, JSONArray jSONArray) {
        StackTraceElement stackTraceElement = null;
        int i = 0;
        while (i < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i];
            jSONArray.put(stackTraceElement2.toString());
            String className = stackTraceElement2.getClassName();
            au.b.a("CRASH - classname=").b(className);
            if (!className.contains("com.adcolony.sdk") || stackTraceElement != null) {
                stackTraceElement2 = stackTraceElement;
            }
            i++;
            stackTraceElement = stackTraceElement2;
        }
        return stackTraceElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a implements Thread.UncaughtExceptionHandler {
        private a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            au.b.b("Caught exception.");
            ADCCrashReportManager.this.a(th);
            ADCCrashReportManager.this.e.uncaughtException(thread, th);
        }
    }
}
