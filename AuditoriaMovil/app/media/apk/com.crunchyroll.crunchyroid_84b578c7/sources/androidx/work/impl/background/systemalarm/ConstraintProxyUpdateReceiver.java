package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.u9.g;
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Intent b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ BroadcastReceiver.PendingResult d;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.b = intent;
            this.c = context;
            this.d = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.d;
            Context context = this.c;
            Intent intent = this.b;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                m c = m.c();
                int i = ConstraintProxyUpdateReceiver.a;
                String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4));
                c.a(new Throwable[0]);
                g.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    static {
        m.e("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            m c = m.c();
            String.format("Ignoring unknown action %s", str);
            c.a(new Throwable[0]);
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        ((com.amazon.aps.iva.w9.b) k.c(context).d).a(new a(intent, context, goAsync));
    }
}
