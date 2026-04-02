package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import c.c0.d0.l;
import c.c0.d0.t.g;
import c.c0.d0.t.t.b;
import c.c0.r;
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = r.e("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Intent a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f659b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f660c;

        public a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.a = intent;
            this.f659b = context;
            this.f660c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                r.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                g.a(this.f659b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g.a(this.f659b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g.a(this.f659b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g.a(this.f659b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f660c.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            r.c().a(a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
            return;
        }
        ((b) l.c(context).f1373g).a.execute(new a(this, intent, context, goAsync()));
    }
}
