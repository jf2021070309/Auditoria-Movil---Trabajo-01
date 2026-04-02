package com.amazon.aps.iva.n9;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.t9.d;
import com.amazon.aps.iva.t9.g;
import com.amazon.aps.iva.t9.i;
import com.amazon.aps.iva.u9.f;
/* compiled from: Alarms.java */
/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ int a = 0;

    static {
        m.e("Alarms");
    }

    public static void a(Context context, int i, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.a(context, str), 603979776);
        if (service != null && alarmManager != null) {
            m c = m.c();
            String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i));
            c.a(new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, k kVar, String str, long j) {
        int i;
        int i2;
        WorkDatabase workDatabase = kVar.c;
        i iVar = (i) workDatabase.k();
        g a2 = iVar.a(str);
        if (a2 != null) {
            a(context, a2.b, str);
            int i3 = a2.b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i3, androidx.work.impl.background.systemalarm.a.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (f.class) {
            workDatabase.c();
            Long a3 = ((com.amazon.aps.iva.t9.f) workDatabase.j()).a("next_alarm_manager_id");
            if (a3 != null) {
                i = a3.intValue();
            } else {
                i = 0;
            }
            if (i == Integer.MAX_VALUE) {
                i2 = 0;
            } else {
                i2 = i + 1;
            }
            ((com.amazon.aps.iva.t9.f) workDatabase.j()).b(new d("next_alarm_manager_id", i2));
            workDatabase.h();
            workDatabase.f();
        }
        g gVar = new g(str, i);
        com.amazon.aps.iva.p8.g gVar2 = iVar.a;
        gVar2.b();
        gVar2.c();
        try {
            iVar.b.e(gVar);
            gVar2.h();
            gVar2.f();
            AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service2 = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.a(context, str), 201326592);
            if (alarmManager2 != null) {
                alarmManager2.setExact(0, j, service2);
            }
        } catch (Throwable th) {
            gVar2.f();
            throw th;
        }
    }
}
