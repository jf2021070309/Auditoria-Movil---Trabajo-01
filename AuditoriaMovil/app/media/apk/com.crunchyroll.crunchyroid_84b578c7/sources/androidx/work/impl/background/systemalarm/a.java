package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.k9.n;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.t9.g;
import com.amazon.aps.iva.t9.i;
import com.amazon.aps.iva.t9.p;
import com.amazon.aps.iva.t9.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: CommandHandler.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.l9.b {
    public static final /* synthetic */ int e = 0;
    public final Context b;
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    static {
        m.e("CommandHandler");
    }

    public a(Context context) {
        this.b = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public final void c(int i, Intent intent, d dVar) {
        boolean z;
        boolean z2;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m c = m.c();
            String.format("Handling constraints changed %s", intent);
            c.a(new Throwable[0]);
            b bVar = new b(this.b, i, dVar);
            ArrayList e2 = ((r) dVar.f.c.n()).e();
            int i2 = ConstraintProxy.a;
            Iterator it = e2.iterator();
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            while (it.hasNext()) {
                com.amazon.aps.iva.k9.c cVar = ((p) it.next()).j;
                z3 |= cVar.d;
                z4 |= cVar.b;
                z5 |= cVar.e;
                if (cVar.a != n.NOT_REQUIRED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z6 |= z2;
                if (z3 && z4 && z5 && z6) {
                    break;
                }
            }
            int i3 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = bVar.a;
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z4).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z6);
            context.sendBroadcast(intent2);
            com.amazon.aps.iva.p9.d dVar2 = bVar.c;
            dVar2.b(e2);
            ArrayList arrayList = new ArrayList(e2.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = e2.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
                String str = pVar.a;
                if (currentTimeMillis >= pVar.a() && (!pVar.b() || dVar2.a(str))) {
                    arrayList.add(pVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str2 = ((p) it3.next()).a;
                Intent a = a(context, str2);
                m c2 = m.c();
                String.format("Creating a delay_met command for workSpec with id (%s)", str2);
                int i4 = b.d;
                c2.a(new Throwable[0]);
                dVar.d(new d.b(bVar.b, a, dVar));
            }
            dVar2.c();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m c3 = m.c();
            String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i));
            c3.a(new Throwable[0]);
            dVar.f.f();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m c4 = m.c();
                String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID");
                c4.b(new Throwable[0]);
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                m c5 = m.c();
                String.format("Handling schedule work for %s", string);
                c5.a(new Throwable[0]);
                WorkDatabase workDatabase = dVar.f.c;
                workDatabase.c();
                try {
                    p i5 = ((r) workDatabase.n()).i(string);
                    if (i5 == null) {
                        m.c().f(new Throwable[0]);
                    } else if (i5.b.isFinished()) {
                        m.c().f(new Throwable[0]);
                    } else {
                        long a2 = i5.a();
                        boolean b = i5.b();
                        Context context2 = this.b;
                        k kVar = dVar.f;
                        if (!b) {
                            m c6 = m.c();
                            String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a2));
                            c6.a(new Throwable[0]);
                            com.amazon.aps.iva.n9.a.b(context2, kVar, string, a2);
                        } else {
                            m c7 = m.c();
                            String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a2));
                            c7.a(new Throwable[0]);
                            com.amazon.aps.iva.n9.a.b(context2, kVar, string, a2);
                            Intent intent3 = new Intent(context2, SystemAlarmService.class);
                            intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                            dVar.d(new d.b(i, intent3, dVar));
                        }
                        workDatabase.h();
                    }
                } finally {
                    workDatabase.f();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.d) {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    m c8 = m.c();
                    String.format("Handing delay met for %s", string2);
                    c8.a(new Throwable[0]);
                    if (!this.c.containsKey(string2)) {
                        c cVar2 = new c(this.b, i, string2, dVar);
                        this.c.put(string2, cVar2);
                        cVar2.d();
                    } else {
                        m c9 = m.c();
                        String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2);
                        c9.a(new Throwable[0]);
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                m c10 = m.c();
                String.format("Handing stopWork work for %s", string3);
                c10.a(new Throwable[0]);
                dVar.f.h(string3);
                int i6 = com.amazon.aps.iva.n9.a.a;
                i iVar = (i) dVar.f.c.k();
                g a3 = iVar.a(string3);
                if (a3 != null) {
                    com.amazon.aps.iva.n9.a.a(this.b, a3.b, string3);
                    m c11 = m.c();
                    String.format("Removing SystemIdInfo for workSpecId (%s)", string3);
                    c11.a(new Throwable[0]);
                    iVar.b(string3);
                }
                dVar.f(string3, false);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras3 = intent.getExtras();
                String string4 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z7 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                m c12 = m.c();
                String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i));
                c12.a(new Throwable[0]);
                f(string4, z7);
            } else {
                m c13 = m.c();
                String.format("Ignoring intent %s", intent);
                c13.f(new Throwable[0]);
            }
        }
    }

    @Override // com.amazon.aps.iva.l9.b
    public final void f(String str, boolean z) {
        synchronized (this.d) {
            com.amazon.aps.iva.l9.b bVar = (com.amazon.aps.iva.l9.b) this.c.remove(str);
            if (bVar != null) {
                bVar.f(str, z);
            }
        }
    }
}
