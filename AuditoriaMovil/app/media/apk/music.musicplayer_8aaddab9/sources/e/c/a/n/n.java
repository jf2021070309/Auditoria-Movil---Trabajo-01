package e.c.a.n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class n {
    public final Set<e.c.a.q.b> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final List<e.c.a.q.b> f5967b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f5968c;

    public boolean a(e.c.a.q.b bVar) {
        boolean z = true;
        if (bVar == null) {
            return true;
        }
        boolean remove = this.a.remove(bVar);
        if (!this.f5967b.remove(bVar) && !remove) {
            z = false;
        }
        if (z) {
            bVar.clear();
        }
        return z;
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.f5968c + "}";
    }
}
