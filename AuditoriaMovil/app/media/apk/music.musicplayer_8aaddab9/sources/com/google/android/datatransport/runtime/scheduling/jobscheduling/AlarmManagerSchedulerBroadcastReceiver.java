package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import e.d.b.b.j.c0.h.d;
import e.d.b.b.j.c0.h.u;
import e.d.b.b.j.f0.a;
import e.d.b.b.j.j;
import e.d.b.b.j.r;
import e.d.b.b.j.v;
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        v.b(context);
        r.a a2 = r.a();
        a2.b(queryParameter);
        a2.c(a.b(intValue));
        if (queryParameter2 != null) {
            ((j.b) a2).f6266b = Base64.decode(queryParameter2, 0);
        }
        u uVar = v.a().f6290e;
        uVar.f6187e.execute(new d(uVar, a2.a(), i2, new Runnable() { // from class: e.d.b.b.j.c0.h.a
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = AlarmManagerSchedulerBroadcastReceiver.a;
            }
        }));
    }
}
