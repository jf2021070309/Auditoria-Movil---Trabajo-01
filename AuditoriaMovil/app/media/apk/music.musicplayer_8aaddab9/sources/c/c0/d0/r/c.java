package c.c0.d0.r;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import c.c0.d0.l;
import c.c0.d0.s.p;
import c.c0.i;
import c.c0.r;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class c implements c.c0.d0.q.c, c.c0.d0.b {
    public static final String a = r.e("SystemFgDispatcher");

    /* renamed from: b  reason: collision with root package name */
    public Context f1481b;

    /* renamed from: c  reason: collision with root package name */
    public l f1482c;

    /* renamed from: d  reason: collision with root package name */
    public final c.c0.d0.t.t.a f1483d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f1484e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public String f1485f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, i> f1486g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, p> f1487h;

    /* renamed from: i  reason: collision with root package name */
    public final Set<p> f1488i;

    /* renamed from: j  reason: collision with root package name */
    public final c.c0.d0.q.d f1489j;

    /* renamed from: k  reason: collision with root package name */
    public a f1490k;

    /* loaded from: classes.dex */
    public interface a {
    }

    public c(Context context) {
        this.f1481b = context;
        l c2 = l.c(this.f1481b);
        this.f1482c = c2;
        c.c0.d0.t.t.a aVar = c2.f1373g;
        this.f1483d = aVar;
        this.f1485f = null;
        this.f1486g = new LinkedHashMap();
        this.f1488i = new HashSet();
        this.f1487h = new HashMap();
        this.f1489j = new c.c0.d0.q.d(this.f1481b, aVar, this);
        this.f1482c.f1375i.a(this);
    }

    public static Intent a(Context context, String str, i iVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f1601b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f1602c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, i iVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f1601b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f1602c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // c.c0.d0.q.c
    public void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            r.c().a(a, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            l lVar = this.f1482c;
            ((c.c0.d0.t.t.b) lVar.f1373g).a.execute(new c.c0.d0.t.l(lVar, str, true));
        }
    }

    @Override // c.c0.d0.b
    public void d(String str, boolean z) {
        Map.Entry<String, i> entry;
        synchronized (this.f1484e) {
            p remove = this.f1487h.remove(str);
            if (remove != null ? this.f1488i.remove(remove) : false) {
                this.f1489j.b(this.f1488i);
            }
        }
        i remove2 = this.f1486g.remove(str);
        if (str.equals(this.f1485f) && this.f1486g.size() > 0) {
            Iterator<Map.Entry<String, i>> it = this.f1486g.entrySet().iterator();
            Map.Entry<String, i> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f1485f = entry.getKey();
            if (this.f1490k != null) {
                i value = entry.getValue();
                ((SystemForegroundService) this.f1490k).b(value.a, value.f1601b, value.f1602c);
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f1490k;
                systemForegroundService.f667c.post(new e(systemForegroundService, value.a));
            }
        }
        a aVar = this.f1490k;
        if (remove2 == null || aVar == null) {
            return;
        }
        r.c().a(a, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.a), str, Integer.valueOf(remove2.f1601b)), new Throwable[0]);
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) aVar;
        systemForegroundService2.f667c.post(new e(systemForegroundService2, remove2.a));
    }

    public final void e(Intent intent) {
        int i2 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        r.c().a(a, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f1490k == null) {
            return;
        }
        this.f1486g.put(stringExtra, new i(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f1485f)) {
            this.f1485f = stringExtra;
            ((SystemForegroundService) this.f1490k).b(intExtra, intExtra2, notification);
            return;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) this.f1490k;
        systemForegroundService.f667c.post(new d(systemForegroundService, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, i> entry : this.f1486g.entrySet()) {
            i2 |= entry.getValue().f1601b;
        }
        i iVar = this.f1486g.get(this.f1485f);
        if (iVar != null) {
            ((SystemForegroundService) this.f1490k).b(iVar.a, i2, iVar.f1602c);
        }
    }

    @Override // c.c0.d0.q.c
    public void f(List<String> list) {
    }

    public void g() {
        this.f1490k = null;
        synchronized (this.f1484e) {
            this.f1489j.c();
        }
        this.f1482c.f1375i.e(this);
    }
}
