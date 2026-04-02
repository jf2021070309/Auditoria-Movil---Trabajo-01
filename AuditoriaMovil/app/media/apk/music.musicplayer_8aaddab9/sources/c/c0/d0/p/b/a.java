package c.c0.d0.p.b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import c.c0.d0.l;
import c.c0.d0.s.g;
import c.c0.d0.s.i;
import c.c0.r;
/* loaded from: classes.dex */
public class a {
    public static final String a = r.e("Alarms");

    public static void a(Context context, String str, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        r.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i2)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, l lVar, String str, long j2) {
        int intValue;
        WorkDatabase workDatabase = lVar.f1372f;
        i iVar = (i) workDatabase.n();
        g a2 = iVar.a(str);
        if (a2 != null) {
            a(context, str, a2.f1498b);
            c(context, str, a2.f1498b, j2);
            return;
        }
        synchronized (c.c0.d0.t.f.class) {
            workDatabase.c();
            Long a3 = ((c.c0.d0.s.f) workDatabase.m()).a("next_alarm_manager_id");
            int i2 = 0;
            intValue = a3 != null ? a3.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i2 = intValue + 1;
            }
            ((c.c0.d0.s.f) workDatabase.m()).b(new c.c0.d0.s.d("next_alarm_manager_id", i2));
            workDatabase.k();
            workDatabase.g();
        }
        iVar.b(new g(str, intValue));
        c(context, str, intValue, j2);
    }

    public static void c(Context context, String str, int i2, long j2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j2, service);
        }
    }
}
