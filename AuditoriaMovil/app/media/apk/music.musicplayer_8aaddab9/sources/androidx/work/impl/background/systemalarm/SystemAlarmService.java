package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import c.c0.d0.p.b.e;
import c.c0.d0.t.m;
import c.c0.r;
import c.p.t;
import java.util.HashMap;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SystemAlarmService extends t implements e.c {

    /* renamed from: b  reason: collision with root package name */
    public static final String f661b = r.e("SystemAlarmService");

    /* renamed from: c  reason: collision with root package name */
    public e f662c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f663d;

    public final void a() {
        e eVar = new e(this);
        this.f662c = eVar;
        if (eVar.f1440k != null) {
            r.c().b(e.a, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            eVar.f1440k = this;
        }
    }

    public void b() {
        this.f663d = true;
        r.c().a(f661b, "All commands completed in dispatcher", new Throwable[0]);
        String str = m.a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = m.f1549b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                r.c().f(m.a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // c.p.t, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
        this.f663d = false;
    }

    @Override // c.p.t, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f663d = true;
        this.f662c.c();
    }

    @Override // c.p.t, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f663d) {
            r.c().d(f661b, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f662c.c();
            a();
            this.f663d = false;
        }
        if (intent != null) {
            this.f662c.a(intent, i3);
            return 3;
        }
        return 3;
    }
}
