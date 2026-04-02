package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.k9.o;
import com.amazon.aps.iva.l9.k;
import java.util.Collections;
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        m.e("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        m.c().a(new Throwable[0]);
        try {
            k c = k.c(context);
            c.getClass();
            c.a(Collections.singletonList(new o.a(DiagnosticsWorker.class).a()));
        } catch (IllegalStateException e) {
            m.c().b(e);
        }
    }
}
