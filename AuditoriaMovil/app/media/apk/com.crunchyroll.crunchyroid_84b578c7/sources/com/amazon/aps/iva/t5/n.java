package com.amazon.aps.iva.t5;

import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.n0;
import com.amazon.aps.iva.t5.o;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n(Object obj, int i, int i2, Object obj2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                o.a aVar = (o.a) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    o.c cVar = (o.c) it.next();
                    if (!cVar.d) {
                        if (i2 != -1) {
                            cVar.b.a(i2);
                        }
                        cVar.c = true;
                        aVar.invoke(cVar.a);
                    }
                }
                return;
            case 1:
                List<com.amazon.aps.iva.q5.b0> list = (List) obj;
                m0 m0Var = ((n0) obj2).c;
                if (i2 == -1) {
                    m0Var.b.o.O0(list);
                    return;
                } else {
                    m0Var.b.o.F0(i2, list);
                    return;
                }
            default:
                ((androidx.profileinstaller.b) obj2).b.b(i2, obj);
                return;
        }
    }
}
