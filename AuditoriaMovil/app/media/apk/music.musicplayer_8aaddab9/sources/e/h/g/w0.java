package e.h.g;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import ch.qos.logback.classic.Level;
import e.h.g.j0;
/* loaded from: classes.dex */
public class w0 implements ServiceConnection {
    public final /* synthetic */ Intent a;

    public w0(Intent intent) {
        this.a = intent;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            t1.l("Service connected");
            if (iBinder instanceof u0) {
                z0 s0 = ((u0) iBinder).s0();
                if (s0 != null) {
                    ((e.h.d.m0) s0).R0(this.a);
                    t1.l("Service started");
                }
            } else if (iBinder == null) {
                t1.l("binder is null??");
            } else {
                t1.l("binder is wrong class ? " + iBinder.getClass().getName());
            }
        } catch (IllegalStateException | SecurityException unused) {
        } catch (Throwable th) {
            s1.l(th, true);
        }
        j0.c(new j0.b() { // from class: e.h.g.l
            @Override // e.h.g.j0.b
            public final void a() {
                ServiceConnection serviceConnection = this;
                try {
                    j1.n(Level.TRACE_INT, new r0());
                    x0.f8405d.unbindService(serviceConnection);
                } catch (Throwable th2) {
                    s1.l(th2, true);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        t1.l("Service unbound");
    }
}
