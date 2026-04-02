package e.d.b.b.j.c0.h;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import e.d.b.b.j.c0.i.a0;
/* loaded from: classes.dex */
public class p implements y {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f6173b;

    /* renamed from: c  reason: collision with root package name */
    public AlarmManager f6174c;

    /* renamed from: d  reason: collision with root package name */
    public final t f6175d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.b.b.j.e0.a f6176e;

    public p(Context context, a0 a0Var, e.d.b.b.j.e0.a aVar, t tVar) {
        this.a = context;
        this.f6173b = a0Var;
        this.f6174c = (AlarmManager) context.getSystemService("alarm");
        this.f6176e = aVar;
        this.f6175d = tVar;
    }

    @Override // e.d.b.b.j.c0.h.y
    public void a(e.d.b.b.j.r rVar, int i2) {
        b(rVar, i2, false);
    }

    @Override // e.d.b.b.j.c0.h.y
    public void b(e.d.b.b.j.r rVar, int i2, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", rVar.b());
        builder.appendQueryParameter("priority", String.valueOf(e.d.b.b.j.f0.a.a(rVar.d())));
        if (rVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(rVar.c(), 0));
        }
        Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (!z) {
            if (PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null) {
                c.t.m.g("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", rVar);
                return;
            }
        }
        long R = this.f6173b.R(rVar);
        long b2 = this.f6175d.b(rVar.d(), R, i2);
        Object[] objArr = {rVar, Long.valueOf(b2), Long.valueOf(R), Integer.valueOf(i2)};
        c.t.m.m("AlarmManagerScheduler");
        String.format("Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        this.f6174c.set(3, this.f6176e.a() + b2, PendingIntent.getBroadcast(this.a, 0, intent, 0));
    }
}
