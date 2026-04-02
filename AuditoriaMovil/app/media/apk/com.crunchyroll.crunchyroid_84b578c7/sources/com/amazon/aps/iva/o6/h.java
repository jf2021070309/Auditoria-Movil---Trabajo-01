package com.amazon.aps.iva.o6;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: DefaultCompositeSequenceableLoaderFactory.java */
/* loaded from: classes.dex */
public final class h implements com.amazon.aps.iva.hb.j, com.amazon.aps.iva.jb.f {
    public final /* synthetic */ int b;

    public /* synthetic */ h(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.hb.j
    public final void b(com.amazon.aps.iva.ib.a aVar, LinkedList linkedList) {
        switch (this.b) {
            case 1:
                return;
            default:
                if (aVar.i != 1) {
                    int h = com.amazon.aps.iva.ab.a.h(aVar) / (aVar.i - 1);
                    Iterator it = linkedList.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Rect rect = ((com.amazon.aps.iva.ib.n) it.next()).a;
                        if (rect.right == aVar.d()) {
                            rect.left += aVar.d() - rect.right;
                            rect.right = aVar.d();
                        } else {
                            i += h;
                            rect.right -= i;
                            rect.left -= i;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.amazon.aps.iva.jb.f
    public final boolean h(com.amazon.aps.iva.ib.a aVar) {
        if (aVar.h > aVar.a() && aVar.h + aVar.a > aVar.d()) {
            return true;
        }
        return false;
    }
}
