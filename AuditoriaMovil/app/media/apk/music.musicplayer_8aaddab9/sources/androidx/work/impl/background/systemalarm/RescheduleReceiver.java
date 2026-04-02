package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import c.c0.d0.l;
import c.c0.d0.p.b.b;
import c.c0.r;
import java.util.Objects;
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = r.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        r.c().a(a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT < 23) {
            String str = b.a;
            Intent intent2 = new Intent(context, SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            context.startService(intent2);
            return;
        }
        try {
            l c2 = l.c(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Objects.requireNonNull(c2);
            synchronized (l.f1369c) {
                c2.f1378l = goAsync;
                if (c2.f1377k) {
                    goAsync.finish();
                    c2.f1378l = null;
                }
            }
        } catch (IllegalStateException e2) {
            r.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }
}
