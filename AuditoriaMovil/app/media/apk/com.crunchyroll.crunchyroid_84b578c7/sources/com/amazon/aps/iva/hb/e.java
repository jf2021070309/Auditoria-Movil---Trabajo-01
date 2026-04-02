package com.amazon.aps.iva.hb;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ColumnFillSpaceCenterStrategy.java */
/* loaded from: classes.dex */
public final class e implements j, com.amazon.aps.iva.jb.f, com.amazon.aps.iva.kb.i, com.amazon.aps.iva.ad.g {
    public final /* synthetic */ int b;

    public /* synthetic */ e(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.ad.g
    public final void a(com.amazon.aps.iva.ad.h hVar) {
        hVar.onStart();
    }

    @Override // com.amazon.aps.iva.hb.j
    public final void b(com.amazon.aps.iva.ib.a aVar, LinkedList linkedList) {
        int i = 0;
        switch (this.b) {
            case 0:
                int i2 = com.amazon.aps.iva.ab.a.i(aVar) / (aVar.i + 1);
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    Rect rect = ((com.amazon.aps.iva.ib.n) it.next()).a;
                    i += i2;
                    rect.top += i;
                    rect.bottom += i;
                }
                return;
            default:
                if (aVar.i != 1) {
                    int h = com.amazon.aps.iva.ab.a.h(aVar) / (aVar.i - 1);
                    Iterator it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        Rect rect2 = ((com.amazon.aps.iva.ib.n) it2.next()).a;
                        if (rect2.left == aVar.a()) {
                            int a = rect2.left - aVar.a();
                            rect2.left = aVar.a();
                            rect2.right -= a;
                        } else {
                            i += h;
                            rect2.left += i;
                            rect2.right += i;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.amazon.aps.iva.kb.i
    public final boolean c(com.amazon.aps.iva.ib.a aVar) {
        if (aVar.g <= aVar.a()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.jb.f
    public final boolean h(com.amazon.aps.iva.ib.a aVar) {
        if (aVar.h + aVar.a > aVar.d() && aVar.h > aVar.a()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ad.g
    public final void d(com.amazon.aps.iva.ad.h hVar) {
    }
}
