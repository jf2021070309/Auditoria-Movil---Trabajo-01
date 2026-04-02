package com.amazon.aps.iva.u0;

import android.app.Activity;
import android.graphics.Rect;
import com.amazon.aps.iva.hb.j;
import com.amazon.aps.iva.ib.n;
import com.amazon.aps.iva.jb.f;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: MutabilityOwnership.kt */
/* loaded from: classes.dex */
public final class b implements j, f, com.amazon.aps.iva.ad.f {
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.hb.j
    public final void b(com.amazon.aps.iva.ib.a aVar, LinkedList linkedList) {
        switch (this.b) {
            case 2:
                if (aVar.i != 1) {
                    int i = com.amazon.aps.iva.ab.a.i(aVar) / (aVar.i - 1);
                    Iterator it = linkedList.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        Rect rect = ((n) it.next()).a;
                        if (rect.top == aVar.b()) {
                            int b = rect.top - aVar.b();
                            rect.top = aVar.b();
                            rect.bottom -= b;
                        } else {
                            i2 += i;
                            rect.top += i2;
                            rect.bottom += i2;
                        }
                    }
                    return;
                }
                return;
            default:
                int h = com.amazon.aps.iva.ab.a.h(aVar) / aVar.i;
                Iterator it2 = linkedList.iterator();
                int i3 = h;
                while (it2.hasNext()) {
                    Rect rect2 = ((n) it2.next()).a;
                    if (rect2.left == aVar.a()) {
                        int a = rect2.left - aVar.a();
                        rect2.left = aVar.a();
                        rect2.right = (rect2.right - a) + i3;
                    } else {
                        rect2.left += i3;
                        i3 += h;
                        rect2.right += i3;
                    }
                }
                return;
        }
    }

    @Override // com.amazon.aps.iva.jb.f
    public final boolean h(com.amazon.aps.iva.ib.a aVar) {
        if (aVar.g < aVar.d() && aVar.g - aVar.a < aVar.a()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ad.f
    public final void a(Activity activity) {
    }
}
