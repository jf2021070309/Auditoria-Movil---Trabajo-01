package e.a.c;

import android.net.Uri;
import e.h.g.j0;
/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements j0.b {
    public static final /* synthetic */ e4 a = new e4();

    @Override // e.h.g.j0.b
    public final void a() {
        Uri uri = z6.a;
        try {
            s6 y = z6.y();
            if (y != null) {
                try {
                    if (z6.u() == 2) {
                        y.u(0);
                    } else {
                        y.u(2);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e2) {
            c.i.g.b.l(e2);
            e.h.g.s1.l(e2, true);
        }
    }
}
