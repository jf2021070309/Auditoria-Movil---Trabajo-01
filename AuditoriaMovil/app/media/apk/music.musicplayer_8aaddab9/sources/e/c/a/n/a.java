package e.c.a.n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class a implements h {
    public final Set<i> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f5948b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5949c;

    @Override // e.c.a.n.h
    public void a(i iVar) {
        this.a.add(iVar);
        if (this.f5949c) {
            iVar.onDestroy();
        } else if (this.f5948b) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    @Override // e.c.a.n.h
    public void b(i iVar) {
        this.a.remove(iVar);
    }

    public void c() {
        this.f5949c = true;
        Iterator it = ((ArrayList) e.c.a.s.j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onDestroy();
        }
    }

    public void d() {
        this.f5948b = true;
        Iterator it = ((ArrayList) e.c.a.s.j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStart();
        }
    }

    public void e() {
        this.f5948b = false;
        Iterator it = ((ArrayList) e.c.a.s.j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStop();
        }
    }
}
