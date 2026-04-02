package c.c0.d0.q.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c.c0.r;
/* loaded from: classes.dex */
public class b extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f1461i = r.e("BatteryNotLowTracker");

    public b(Context context, c.c0.d0.t.t.a aVar) {
        super(context, aVar);
    }

    @Override // c.c0.d0.q.f.d
    public Object a() {
        Intent registerReceiver = this.f1465c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            return Boolean.valueOf((registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f) ? true : true);
        }
        r.c().b(f1461i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // c.c0.d0.q.f.c
    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // c.c0.d0.q.f.c
    public void g(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        r.c().a(f1461i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
