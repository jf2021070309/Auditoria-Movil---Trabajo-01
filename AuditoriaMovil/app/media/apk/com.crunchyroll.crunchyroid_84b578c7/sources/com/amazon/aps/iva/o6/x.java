package com.amazon.aps.iva.o6;

import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.o6.z;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((z) obj3).N(((z.a) obj4).a, (v.b) obj2, (t) obj);
                return;
            default:
                com.amazon.aps.iva.b8.t tVar = (com.amazon.aps.iva.b8.t) obj4;
                p1.c cVar = (p1.c) obj3;
                q.d dVar = (q.d) obj2;
                List<com.amazon.aps.iva.q5.b0> list = (List) obj;
                int i2 = p1.i;
                if (!tVar.g()) {
                    cVar.b(tVar.o, dVar, list);
                    return;
                }
                return;
        }
    }
}
