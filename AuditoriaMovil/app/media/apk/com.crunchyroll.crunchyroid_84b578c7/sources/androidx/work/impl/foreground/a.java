package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.iva.k9.g;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.l9.b;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.p9.c;
import com.amazon.aps.iva.p9.d;
import com.amazon.aps.iva.s9.e;
import com.amazon.aps.iva.t9.p;
import com.amazon.aps.iva.u9.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public final class a implements c, b {
    public static final /* synthetic */ int k = 0;
    public final k b;
    public final com.amazon.aps.iva.w9.a c;
    public final Object d = new Object();
    public String e;
    public final LinkedHashMap f;
    public final HashMap g;
    public final HashSet h;
    public final d i;
    public InterfaceC0064a j;

    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0064a {
    }

    static {
        m.e("SystemFgDispatcher");
    }

    public a(Context context) {
        k c = k.c(context);
        this.b = c;
        com.amazon.aps.iva.w9.a aVar = c.d;
        this.c = aVar;
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashSet();
        this.g = new HashMap();
        this.i = new d(context, aVar, this);
        c.f.a(this);
    }

    public static Intent a(Context context, String str, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.b);
        intent.putExtra("KEY_NOTIFICATION", gVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.b);
        intent.putExtra("KEY_NOTIFICATION", gVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // com.amazon.aps.iva.p9.c
    public final void c(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                m c = m.c();
                String.format("Constraints unmet for WorkSpec %s", str);
                c.a(new Throwable[0]);
                k kVar = this.b;
                ((com.amazon.aps.iva.w9.b) kVar.d).a(new l(kVar, str, true));
            }
        }
    }

    public final void d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        m c = m.c();
        String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2));
        c.a(new Throwable[0]);
        if (notification != null && this.j != null) {
            g gVar = new g(intExtra, intExtra2, notification);
            LinkedHashMap linkedHashMap = this.f;
            linkedHashMap.put(stringExtra, gVar);
            if (TextUtils.isEmpty(this.e)) {
                this.e = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.j;
                systemForegroundService.c.post(new com.amazon.aps.iva.s9.c(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.j;
            systemForegroundService2.c.post(new com.amazon.aps.iva.s9.d(systemForegroundService2, intExtra, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    i |= ((g) entry.getValue()).b;
                }
                g gVar2 = (g) linkedHashMap.get(this.e);
                if (gVar2 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.j;
                    systemForegroundService3.c.post(new com.amazon.aps.iva.s9.c(systemForegroundService3, gVar2.a, gVar2.c, i));
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.l9.b
    public final void f(String str, boolean z) {
        boolean z2;
        Map.Entry entry;
        synchronized (this.d) {
            try {
                p pVar = (p) this.g.remove(str);
                if (pVar != null) {
                    z2 = this.h.remove(pVar);
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.i.b(this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar = (g) this.f.remove(str);
        if (str.equals(this.e) && this.f.size() > 0) {
            Iterator it = this.f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.e = (String) entry.getKey();
            if (this.j != null) {
                g gVar2 = (g) entry.getValue();
                InterfaceC0064a interfaceC0064a = this.j;
                SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0064a;
                systemForegroundService.c.post(new com.amazon.aps.iva.s9.c(systemForegroundService, gVar2.a, gVar2.c, gVar2.b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.j;
                systemForegroundService2.c.post(new e(systemForegroundService2, gVar2.a));
            }
        }
        InterfaceC0064a interfaceC0064a2 = this.j;
        if (gVar != null && interfaceC0064a2 != null) {
            m c = m.c();
            String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(gVar.a), str, Integer.valueOf(gVar.b));
            c.a(new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0064a2;
            systemForegroundService3.c.post(new e(systemForegroundService3, gVar.a));
        }
    }

    @Override // com.amazon.aps.iva.p9.c
    public final void g(List<String> list) {
    }
}
