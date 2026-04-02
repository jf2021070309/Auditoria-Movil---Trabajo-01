package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.l9.k;
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        m.e("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m c = m.c();
        String.format("Received intent %s", intent);
        c.a(new Throwable[0]);
        try {
            k c2 = k.c(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            c2.getClass();
            synchronized (k.l) {
                c2.i = goAsync;
                if (c2.h) {
                    goAsync.finish();
                    c2.i = null;
                }
            }
        } catch (IllegalStateException e) {
            m.c().b(e);
        }
    }
}
