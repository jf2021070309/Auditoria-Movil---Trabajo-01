package com.amazon.aps.iva.ga;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes.dex */
public abstract class m implements l, com.amazon.aps.iva.kb.i {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ m(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public abstract com.amazon.aps.iva.oc.k b();

    @Override // com.amazon.aps.iva.kb.i
    public boolean c(com.amazon.aps.iva.ib.a aVar) {
        return ((com.amazon.aps.iva.kb.i) this.c).c(aVar);
    }

    @Override // com.amazon.aps.iva.ga.l
    public final List e() {
        return (List) this.c;
    }

    public final com.amazon.aps.iva.oc.k f() {
        com.amazon.aps.iva.oc.k kVar = (com.amazon.aps.iva.oc.k) ((Queue) this.c).poll();
        if (kVar == null) {
            return b();
        }
        return kVar;
    }

    public final void g(com.amazon.aps.iva.oc.k kVar) {
        Object obj = this.c;
        if (((Queue) obj).size() < 20) {
            ((Queue) obj).offer(kVar);
        }
    }

    @Override // com.amazon.aps.iva.ga.l
    public final boolean k() {
        Object obj = this.c;
        if (((List) obj).isEmpty()) {
            return true;
        }
        if (((List) obj).size() == 1 && ((com.amazon.aps.iva.na.a) ((List) obj).get(0)).c()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.c;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public m() {
        this.b = 2;
        char[] cArr = com.amazon.aps.iva.hd.l.a;
        this.c = new ArrayDeque(20);
    }
}
