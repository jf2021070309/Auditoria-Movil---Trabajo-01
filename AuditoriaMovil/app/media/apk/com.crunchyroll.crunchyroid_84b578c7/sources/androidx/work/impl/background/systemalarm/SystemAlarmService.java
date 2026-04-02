package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import com.amazon.aps.iva.i5.q;
import com.amazon.aps.iva.k9.m;
import java.util.HashMap;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SystemAlarmService extends q implements d.c {
    public d c;
    public boolean d;

    static {
        m.e("SystemAlarmService");
    }

    public final void g() {
        d dVar = new d(this);
        this.c = dVar;
        if (dVar.k != null) {
            m.c().b(new Throwable[0]);
        } else {
            dVar.k = this;
        }
    }

    @Override // com.amazon.aps.iva.i5.q, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g();
        this.d = false;
    }

    @Override // com.amazon.aps.iva.i5.q, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.d = true;
        this.c.c();
    }

    @Override // com.amazon.aps.iva.i5.q, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            m.c().d(new Throwable[0]);
            this.c.c();
            g();
            this.d = false;
        }
        if (intent != null) {
            this.c.a(i2, intent);
            return 3;
        }
        return 3;
    }

    public final void r() {
        this.d = true;
        m.c().a(new Throwable[0]);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = com.amazon.aps.iva.u9.m.a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap2 = com.amazon.aps.iva.u9.m.a;
        synchronized (weakHashMap2) {
            hashMap.putAll(weakHashMap2);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                String.format("WakeLock held for %s", hashMap.get(wakeLock));
                m c = m.c();
                WeakHashMap<PowerManager.WakeLock, String> weakHashMap3 = com.amazon.aps.iva.u9.m.a;
                c.f(new Throwable[0]);
            }
        }
        stopSelf();
    }
}
