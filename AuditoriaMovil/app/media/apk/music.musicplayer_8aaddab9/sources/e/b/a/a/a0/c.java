package e.b.a.a.a0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PowerManager;
import e.b.a.a.a0.a;
import e.b.a.a.l;
import e.b.a.a.z.k.f;
import e.h.g.x0;
/* loaded from: classes.dex */
public class c implements b, e.b.a.a.a0.a {
    public a.InterfaceC0105a a;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c.this.b(context);
        }
    }

    public c(Context context) {
        Context applicationContext = context.getApplicationContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            if (i2 >= 23) {
                applicationContext.registerReceiver(new d(this), new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
            }
            ((ConnectivityManager) applicationContext.getSystemService("connectivity")).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(13).build(), new e(this, applicationContext));
            return;
        }
        a aVar = new a();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (i2 >= 23) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        applicationContext.registerReceiver(aVar, intentFilter);
    }

    @Override // e.b.a.a.a0.a
    public void a(a.InterfaceC0105a interfaceC0105a) {
        this.a = interfaceC0105a;
    }

    public void b(Context context) {
        a.InterfaceC0105a interfaceC0105a = this.a;
        if (interfaceC0105a == null) {
            return;
        }
        c(context);
        l lVar = (l) interfaceC0105a;
        lVar.f5366c.a((f) lVar.f5373j.a(f.class));
    }

    public int c(Context context) {
        boolean z;
        NetworkInfo activeNetworkInfo;
        if (Build.VERSION.SDK_INT >= 23) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager.isDeviceIdleMode() && !powerManager.isIgnoringBatteryOptimizations(x0.f8405d.getPackageName())) {
                z = true;
                if (z && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null) {
                    return (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9) ? 2 : 1;
                }
                return 0;
            }
        }
        z = false;
        if (z) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 2;
        }
    }
}
