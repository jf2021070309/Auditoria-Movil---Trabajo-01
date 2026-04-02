package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import c.c0.d0.l;
import c.c0.r;
import c.c0.t;
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = r.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        r.c().a(a, "Requesting diagnostics", new Throwable[0]);
        try {
            l.c(context).a(new t.a(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e2) {
            r.c().b(a, "WorkManager is not initialized", e2);
        }
    }
}
