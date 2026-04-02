package e.c.a.n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class p implements i {
    public final Set<e.c.a.q.h.h<?>> a = Collections.newSetFromMap(new WeakHashMap());

    @Override // e.c.a.n.i
    public void onDestroy() {
        Iterator it = ((ArrayList) e.c.a.s.j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((e.c.a.q.h.h) it.next()).onDestroy();
        }
    }

    @Override // e.c.a.n.i
    public void onStart() {
        Iterator it = ((ArrayList) e.c.a.s.j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((e.c.a.q.h.h) it.next()).onStart();
        }
    }

    @Override // e.c.a.n.i
    public void onStop() {
        Iterator it = ((ArrayList) e.c.a.s.j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((e.c.a.q.h.h) it.next()).onStop();
        }
    }
}
