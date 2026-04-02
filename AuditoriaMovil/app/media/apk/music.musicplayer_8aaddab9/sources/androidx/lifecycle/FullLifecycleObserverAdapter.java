package androidx.lifecycle;

import c.p.h;
import c.p.j;
import c.p.n;
import c.p.p;
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements n {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final n f441b;

    public FullLifecycleObserverAdapter(h hVar, n nVar) {
        this.a = hVar;
        this.f441b = nVar;
    }

    @Override // c.p.n
    public void c(p pVar, j.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.a.b(pVar);
                break;
            case 1:
                this.a.h(pVar);
                break;
            case 2:
                this.a.a(pVar);
                break;
            case 3:
                this.a.d(pVar);
                break;
            case 4:
                this.a.e(pVar);
                break;
            case 5:
                this.a.f(pVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        n nVar = this.f441b;
        if (nVar != null) {
            nVar.c(pVar, aVar);
        }
    }
}
