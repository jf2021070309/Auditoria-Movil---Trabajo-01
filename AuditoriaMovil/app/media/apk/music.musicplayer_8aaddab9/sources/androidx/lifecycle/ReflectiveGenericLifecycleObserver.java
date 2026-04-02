package androidx.lifecycle;

import c.p.b;
import c.p.j;
import c.p.n;
import c.p.p;
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements n {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f462b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.f462b = b.a.b(obj.getClass());
    }

    @Override // c.p.n
    public void c(p pVar, j.a aVar) {
        b.a aVar2 = this.f462b;
        Object obj = this.a;
        b.a.a(aVar2.a.get(aVar), pVar, aVar, obj);
        b.a.a(aVar2.a.get(j.a.ON_ANY), pVar, aVar, obj);
    }
}
