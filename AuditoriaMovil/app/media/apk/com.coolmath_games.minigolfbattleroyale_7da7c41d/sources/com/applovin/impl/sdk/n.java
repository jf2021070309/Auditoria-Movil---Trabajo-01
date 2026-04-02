package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class n {
    private static final AtomicBoolean a = new AtomicBoolean();
    private static final Lock b = new ReentrantLock();
    private static Runnable c;
    private static Thread d;
    private final k g;
    private final Map<Integer, Thread> e = new HashMap();
    private final Object f = new Object();
    private com.applovin.impl.sdk.utils.d i = null;
    private final Map<Integer, String> j = new HashMap();
    private final Map<Integer, String> k = new HashMap();
    private final Runnable h = new Runnable() { // from class: com.applovin.impl.sdk.n.1
        @Override // java.lang.Runnable
        public void run() {
            n.this.i = null;
            n.this.b();
        }
    };

    public n(k kVar) {
        this.g = kVar;
    }

    private static Thread a(String str) {
        Thread thread = new Thread(c, str);
        thread.setDaemon(true);
        return thread;
    }

    public static void a() {
        if (a.compareAndSet(false, true)) {
            b.lock();
            c = new Runnable() { // from class: com.applovin.impl.sdk.n.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        n.b.lockInterruptibly();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            };
            Thread a2 = a("ALDEBUG-" + AppLovinSdk.VERSION);
            d = a2;
            a2.start();
        }
    }

    private String c(Object obj) {
        if (obj instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) obj;
            if ("APPLOVIN".equals(aVar.L())) {
                return null;
            }
            StringBuilder sb = new StringBuilder(aVar.L());
            sb.append("/");
            sb.append(aVar.getFormat().getLabel());
            String creativeId = aVar.getCreativeId();
            if (StringUtils.isValidString(creativeId)) {
                sb.append("/");
                sb.append(creativeId);
            }
            return sb.toString();
        }
        return null;
    }

    private String d(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.a.g) {
            com.applovin.impl.sdk.a.g gVar = (com.applovin.impl.sdk.a.g) obj;
            StringBuilder sb = new StringBuilder("AL/");
            sb.append(gVar.getSize().getLabel());
            sb.append("/");
            sb.append(gVar.getAdIdNumber());
            if (gVar instanceof com.applovin.impl.a.a) {
                sb.append("/VAST/");
                sb.append(((com.applovin.impl.a.a) gVar).i().a());
            }
            if (StringUtils.isValidString(gVar.r())) {
                sb.append("/DSP/");
                sb.append(gVar.r());
            }
            return sb.toString();
        }
        return null;
    }

    private void d() {
        Context J = this.g.J();
        StringBuilder sb = new StringBuilder("ALDEBUG-");
        sb.append(AppLovinSdk.VERSION);
        try {
            PackageInfo packageInfo = J.getPackageManager().getPackageInfo("com.google.android.webview", 0);
            sb.append("-");
            sb.append(packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        ActivityManager activityManager = (ActivityManager) J.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            sb.append("-");
            sb.append(memoryInfo.availMem / 1000000);
            sb.append("MB");
            sb.append("/");
            sb.append(memoryInfo.totalMem / 1000000);
            sb.append("MB");
            sb.append("(");
            sb.append(memoryInfo.lowMemory);
            sb.append(")");
        }
        Map<String, Object> b2 = this.g.T().b();
        if (b2.containsKey("gms_mb")) {
            sb.append("-GMS-");
            sb.append(b2.get("gms_mb"));
            sb.append("MB");
        }
        for (Integer num : this.j.keySet()) {
            int intValue = num.intValue();
            sb.append("-");
            sb.append(this.j.get(Integer.valueOf(intValue)));
        }
        for (Integer num2 : this.k.keySet()) {
            int intValue2 = num2.intValue();
            sb.append("-");
            sb.append(this.k.get(Integer.valueOf(intValue2)));
        }
        String sb2 = sb.toString();
        Thread thread = d;
        if (thread != null) {
            thread.setName(sb2);
            return;
        }
        Thread a2 = a(sb2);
        d = a2;
        a2.start();
    }

    private String e(Object obj) {
        if (obj instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) obj;
            StringBuilder sb = new StringBuilder("MAX-");
            sb.append(AppLovinSdk.VERSION);
            sb.append("-");
            sb.append(aVar.getFormat().getLabel());
            sb.append("-");
            sb.append(aVar.L());
            if (StringUtils.isValidString(aVar.getCreativeId())) {
                sb.append("-");
                sb.append(aVar.getCreativeId());
            }
            return sb.toString();
        } else if (obj instanceof com.applovin.impl.sdk.a.g) {
            com.applovin.impl.sdk.a.g gVar = (com.applovin.impl.sdk.a.g) obj;
            String label = gVar.getAdZone().b() != null ? gVar.getAdZone().b().getLabel() : "NULL";
            StringBuilder sb2 = new StringBuilder("AL-");
            sb2.append(AppLovinSdk.VERSION);
            sb2.append("-");
            sb2.append(label);
            sb2.append("-");
            sb2.append(gVar.getAdIdNumber());
            if (gVar instanceof com.applovin.impl.a.a) {
                sb2.append("-VAST-");
                sb2.append(((com.applovin.impl.a.a) gVar).i().a());
            }
            if (StringUtils.isValidString(gVar.r())) {
                sb2.append("-DSP-");
                sb2.append(gVar.r());
            }
            return sb2.toString();
        } else {
            return null;
        }
    }

    public void a(Object obj) {
        if (!((Boolean) this.g.a(com.applovin.impl.sdk.c.b.dT)).booleanValue() || obj == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(System.identityHashCode(obj));
        synchronized (this.f) {
            if (!this.e.containsKey(valueOf)) {
                String e = e(obj);
                if (e == null) {
                    return;
                }
                String c2 = c(obj);
                if (StringUtils.isValidString(c2)) {
                    this.j.put(valueOf, c2);
                }
                String d2 = d(obj);
                if (StringUtils.isValidString(d2)) {
                    this.k.put(valueOf, d2);
                }
                r z = this.g.z();
                z.b("AppLovinSdk", "Creating ad debug thread with name: " + e);
                Thread a2 = a(e);
                a2.start();
                this.e.put(valueOf, a2);
            }
        }
    }

    public void b() {
        if (!((Boolean) this.g.a(com.applovin.impl.sdk.c.b.dT)).booleanValue() || this.g.e()) {
            return;
        }
        long longValue = ((Long) this.g.a(com.applovin.impl.sdk.c.b.dV)).longValue();
        if (longValue <= 0 || this.i != null) {
            return;
        }
        d();
        this.i = com.applovin.impl.sdk.utils.d.a(longValue, this.g, this.h);
    }

    public void b(Object obj) {
        if (!((Boolean) this.g.a(com.applovin.impl.sdk.c.b.dT)).booleanValue() || obj == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(System.identityHashCode(obj));
        synchronized (this.f) {
            Thread thread = this.e.get(valueOf);
            if (thread != null) {
                r z = this.g.z();
                z.b("AppLovinSdk", "Destroying ad debug thread with name: " + thread.getName());
                thread.interrupt();
                this.e.remove(valueOf);
                this.j.remove(valueOf);
                this.k.remove(valueOf);
            }
        }
    }
}
