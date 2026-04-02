package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.k9.m;
/* loaded from: classes.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    /* loaded from: classes.dex */
    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    /* loaded from: classes.dex */
    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    /* loaded from: classes.dex */
    public static class NetworkStateProxy extends ConstraintProxy {
    }

    /* loaded from: classes.dex */
    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    static {
        m.e("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m c = m.c();
        String.format("onReceive : %s", intent);
        c.a(new Throwable[0]);
        int i = a.e;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
