package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.g;
import java.util.HashMap;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements j {
    public final Object b;
    public final b.a c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.b = obj;
        this.c = b.c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.j
    public final void U2(com.amazon.aps.iva.i5.o oVar, g.a aVar) {
        HashMap hashMap = this.c.a;
        Object obj = this.b;
        b.a.a((List) hashMap.get(aVar), oVar, aVar, obj);
        b.a.a((List) hashMap.get(g.a.ON_ANY), oVar, aVar, obj);
    }
}
