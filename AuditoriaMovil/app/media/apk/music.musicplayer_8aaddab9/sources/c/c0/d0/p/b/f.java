package c.c0.d0.p.b;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c.c0.d0.s.p;
import c.c0.r;
/* loaded from: classes.dex */
public class f implements c.c0.d0.e {
    public static final String a = r.e("SystemAlarmScheduler");

    /* renamed from: b  reason: collision with root package name */
    public final Context f1443b;

    public f(Context context) {
        this.f1443b = context.getApplicationContext();
    }

    @Override // c.c0.d0.e
    public void a(p... pVarArr) {
        for (p pVar : pVarArr) {
            r.c().a(a, String.format("Scheduling work with workSpecId %s", pVar.a), new Throwable[0]);
            this.f1443b.startService(b.c(this.f1443b, pVar.a));
        }
    }

    @Override // c.c0.d0.e
    public boolean c() {
        return true;
    }

    @Override // c.c0.d0.e
    public void e(String str) {
        Context context = this.f1443b;
        String str2 = b.a;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        this.f1443b.startService(intent);
    }
}
