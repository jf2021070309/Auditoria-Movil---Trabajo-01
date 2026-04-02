package com.amazon.aps.iva.a6;

import android.util.Pair;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.o6.v;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e1(Object obj, int i, int i2, Object obj2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                ((j1.a) obj2).c.h.R(((Integer) pair.first).intValue(), (v.b) pair.second, i2);
                return;
            default:
                e.a aVar = (e.a) obj2;
                com.amazon.aps.iva.g6.e eVar = (com.amazon.aps.iva.g6.e) obj;
                int i3 = aVar.a;
                eVar.getClass();
                eVar.R(i3, aVar.b, i2);
                return;
        }
    }
}
