package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import ch.qos.logback.core.joran.action.ActionConst;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class p {
    private static final AtomicBoolean a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private static final Lock f4262b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    private static Runnable f4263c;

    /* renamed from: d  reason: collision with root package name */
    private static Thread f4264d;

    /* renamed from: g  reason: collision with root package name */
    private final m f4267g;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Integer, Thread> f4265e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Object f4266f = new Object();

    /* renamed from: i  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.e f4269i = null;

    /* renamed from: j  reason: collision with root package name */
    private final Map<Integer, String> f4270j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Integer, String> f4271k = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f4268h = new Runnable() { // from class: com.applovin.impl.sdk.p.1
        @Override // java.lang.Runnable
        public void run() {
            p.this.f4269i = null;
            p.this.b();
        }
    };

    public p(m mVar) {
        this.f4267g = mVar;
    }

    private static Thread a(String str) {
        Thread thread = new Thread(f4263c, str);
        thread.setDaemon(true);
        return thread;
    }

    public static void a() {
        if (a.compareAndSet(false, true)) {
            f4262b.lock();
            f4263c = new Runnable() { // from class: com.applovin.impl.sdk.p.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        p.f4262b.lockInterruptibly();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            };
            StringBuilder y = e.a.d.a.a.y("ALDEBUG-");
            y.append(AppLovinSdk.VERSION);
            Thread a2 = a(y.toString());
            f4264d = a2;
            a2.start();
        }
    }

    private String c(Object obj) {
        if (obj instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) obj;
            if ("APPLOVIN".equals(aVar.Q())) {
                return null;
            }
            StringBuilder sb = new StringBuilder(aVar.Q());
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
        if (obj instanceof com.applovin.impl.sdk.ad.e) {
            com.applovin.impl.sdk.ad.e eVar = (com.applovin.impl.sdk.ad.e) obj;
            StringBuilder sb = new StringBuilder("AL/");
            sb.append(eVar.getSize().getLabel());
            sb.append("/");
            sb.append(eVar.getAdIdNumber());
            if (eVar instanceof com.applovin.impl.a.a) {
                sb.append("/VAST/");
                sb.append(((com.applovin.impl.a.a) eVar).l().a());
            }
            if (StringUtils.isValidString(eVar.getDspName())) {
                sb.append("/DSP/");
                sb.append(eVar.getDspName());
            }
            return sb.toString();
        }
        return null;
    }

    private void d() {
        Context L = this.f4267g.L();
        StringBuilder sb = new StringBuilder("ALDEBUG-");
        sb.append(AppLovinSdk.VERSION);
        try {
            PackageInfo packageInfo = L.getPackageManager().getPackageInfo("com.google.android.webview", 0);
            sb.append("-");
            sb.append(packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        ActivityManager activityManager = (ActivityManager) L.getSystemService("activity");
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
        Map<String, Object> b2 = this.f4267g.V().b();
        if (b2.containsKey("gms_mb")) {
            sb.append("-GMS-");
            sb.append(b2.get("gms_mb"));
            sb.append("MB");
        }
        for (Integer num : this.f4270j.keySet()) {
            int intValue = num.intValue();
            sb.append("-");
            sb.append(this.f4270j.get(Integer.valueOf(intValue)));
        }
        for (Integer num2 : this.f4271k.keySet()) {
            int intValue2 = num2.intValue();
            sb.append("-");
            sb.append(this.f4271k.get(Integer.valueOf(intValue2)));
        }
        String sb2 = sb.toString();
        Thread thread = f4264d;
        if (thread != null) {
            thread.setName(sb2);
            return;
        }
        Thread a2 = a(sb2);
        f4264d = a2;
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
            sb.append(aVar.Q());
            if (StringUtils.isValidString(aVar.getCreativeId())) {
                sb.append("-");
                sb.append(aVar.getCreativeId());
            }
            return sb.toString();
        } else if (obj instanceof com.applovin.impl.sdk.ad.e) {
            com.applovin.impl.sdk.ad.e eVar = (com.applovin.impl.sdk.ad.e) obj;
            String label = eVar.getAdZone().b() != null ? eVar.getAdZone().b().getLabel() : ActionConst.NULL;
            StringBuilder sb2 = new StringBuilder("AL-");
            e.a.d.a.a.M(sb2, AppLovinSdk.VERSION, "-", label, "-");
            sb2.append(eVar.getAdIdNumber());
            if (eVar instanceof com.applovin.impl.a.a) {
                sb2.append("-VAST-");
                sb2.append(((com.applovin.impl.a.a) eVar).l().a());
            }
            if (StringUtils.isValidString(eVar.getDspName())) {
                sb2.append("-DSP-");
                sb2.append(eVar.getDspName());
            }
            return sb2.toString();
        } else {
            return null;
        }
    }

    public void a(Object obj) {
        if (!((Boolean) this.f4267g.a(com.applovin.impl.sdk.c.b.dV)).booleanValue() || obj == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(System.identityHashCode(obj));
        synchronized (this.f4266f) {
            if (!this.f4265e.containsKey(valueOf)) {
                String e2 = e(obj);
                if (e2 == null) {
                    return;
                }
                String c2 = c(obj);
                if (StringUtils.isValidString(c2)) {
                    this.f4270j.put(valueOf, c2);
                }
                String d2 = d(obj);
                if (StringUtils.isValidString(d2)) {
                    this.f4271k.put(valueOf, d2);
                }
                v B = this.f4267g.B();
                B.b("AppLovinSdk", "Creating ad debug thread with name: " + e2);
                Thread a2 = a(e2);
                a2.start();
                this.f4265e.put(valueOf, a2);
            }
        }
    }

    public void b() {
        if (!((Boolean) this.f4267g.a(com.applovin.impl.sdk.c.b.dV)).booleanValue() || this.f4267g.e()) {
            return;
        }
        long longValue = ((Long) this.f4267g.a(com.applovin.impl.sdk.c.b.dX)).longValue();
        if (longValue <= 0 || this.f4269i != null) {
            return;
        }
        d();
        this.f4269i = com.applovin.impl.sdk.utils.e.a(longValue, this.f4267g, this.f4268h);
    }

    public void b(Object obj) {
        if (!((Boolean) this.f4267g.a(com.applovin.impl.sdk.c.b.dV)).booleanValue() || obj == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(System.identityHashCode(obj));
        synchronized (this.f4266f) {
            Thread thread = this.f4265e.get(valueOf);
            if (thread != null) {
                v B = this.f4267g.B();
                B.b("AppLovinSdk", "Destroying ad debug thread with name: " + thread.getName());
                thread.interrupt();
                this.f4265e.remove(valueOf);
                this.f4270j.remove(valueOf);
                this.f4271k.remove(valueOf);
            }
        }
    }
}
