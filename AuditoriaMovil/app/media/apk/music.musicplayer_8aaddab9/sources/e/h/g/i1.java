package e.h.g;

import android.app.NotificationManager;
/* loaded from: classes2.dex */
public class i1 extends b1<h1> {

    /* renamed from: c  reason: collision with root package name */
    public NotificationManager f8308c;

    public i1() {
        x0 x0Var = x0.f8405d;
        if (x0Var != null) {
            this.f8308c = (NotificationManager) x0Var.getSystemService("notification");
        }
    }

    @Override // e.h.g.b1
    public void a(h1 h1Var) {
        h1 h1Var2 = h1Var;
        if (this.f8308c == null) {
            this.f8308c = (NotificationManager) x0.f8405d.getSystemService("notification");
        }
        try {
            int i2 = h1Var2.a;
            if (i2 == 0) {
                this.f8308c.cancel(h1Var2.f8303d);
            } else if (i2 != 1) {
                if (i2 == 2) {
                    this.f8308c.notify(h1Var2.f8303d, h1Var2.f8302c);
                } else if (i2 != 3) {
                } else {
                    s1.c(h1Var2.f8306g + ", stopped in the foreground");
                    h1Var2.f8305f.stopForeground(h1Var2.f8304e);
                }
            } else {
                if (v0.d()) {
                    h1Var2.f8305f.startForeground(h1Var2.f8303d, h1Var2.f8302c, h1Var2.f8307h);
                } else {
                    h1Var2.f8305f.startForeground(h1Var2.f8303d, h1Var2.f8302c);
                }
                s1.c(h1Var2.f8306g + ", started in the foreground");
                g1 g1Var = h1Var2.f8301b;
                if (g1Var != null) {
                    g1Var.a();
                }
            }
        } catch (Throwable th) {
            s1.l(th, true);
        }
    }
}
