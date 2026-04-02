package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.o0.t1;
import java.util.ArrayList;
/* compiled from: ChannelFlow.kt */
/* loaded from: classes4.dex */
public abstract class f<T> implements com.amazon.aps.iva.ve0.f {
    public final com.amazon.aps.iva.ob0.g b;
    public final int c;
    public final com.amazon.aps.iva.ue0.e d;

    public f(com.amazon.aps.iva.ob0.g gVar, int i, com.amazon.aps.iva.ue0.e eVar) {
        this.b = gVar;
        this.c = i;
        this.d = eVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public Object c(com.amazon.aps.iva.ve0.g<? super T> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object p = z.p(new d(null, gVar, this), dVar);
        if (p != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        return p;
    }

    public abstract Object d(com.amazon.aps.iva.ue0.q<? super T> qVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    public abstract f<T> e(com.amazon.aps.iva.ob0.g gVar, int i, com.amazon.aps.iva.ue0.e eVar);

    public com.amazon.aps.iva.ve0.f<T> h() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        com.amazon.aps.iva.ob0.h hVar = com.amazon.aps.iva.ob0.h.b;
        com.amazon.aps.iva.ob0.g gVar = this.b;
        if (gVar != hVar) {
            arrayList.add("context=" + gVar);
        }
        int i = this.c;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        com.amazon.aps.iva.ue0.e eVar = com.amazon.aps.iva.ue0.e.SUSPEND;
        com.amazon.aps.iva.ue0.e eVar2 = this.d;
        if (eVar2 != eVar) {
            arrayList.add("onBufferOverflow=" + eVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return t1.b(sb, x.B0(arrayList, ", ", null, null, null, 62), ']');
    }
}
