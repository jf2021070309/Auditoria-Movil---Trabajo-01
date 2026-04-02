package e.j.d;

import java.lang.ref.WeakReference;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class j {

    /* loaded from: classes.dex */
    public static final class a {
        public static final void a() {
            int i2 = c.b.c.n.a;
            if (c.b.c.n.a != 2) {
                c.b.c.n.a = 2;
                synchronized (c.b.c.n.f820c) {
                    Iterator<WeakReference<c.b.c.n>> it = c.b.c.n.f819b.iterator();
                    while (it.hasNext()) {
                        c.b.c.n nVar = it.next().get();
                        if (nVar != null) {
                            nVar.d();
                        }
                    }
                }
            }
        }
    }

    public static final boolean a() {
        return k.a.a().e();
    }

    public static final void b() {
        k.a.a().f();
    }
}
