package com.amazon.aps.iva.j0;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: StringHelpers.kt */
/* loaded from: classes.dex */
public final class d1 implements com.amazon.aps.iva.hb.j, com.amazon.aps.iva.hb.k, com.amazon.aps.iva.jb.e, com.amazon.aps.iva.kb.i, com.amazon.aps.iva.ad.j {
    public static final int d(int i, CharSequence charSequence) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        int length = charSequence.length();
        for (int i2 = i + 1; i2 < length; i2++) {
            if (charSequence.charAt(i2) == '\n') {
                return i2;
            }
        }
        return charSequence.length();
    }

    @Override // com.amazon.aps.iva.jb.e
    public final com.amazon.aps.iva.jb.f a() {
        return new com.amazon.aps.iva.hb.e(2);
    }

    @Override // com.amazon.aps.iva.hb.j
    public final void b(com.amazon.aps.iva.ib.a aVar, LinkedList linkedList) {
        int i = com.amazon.aps.iva.ab.a.i(aVar) / aVar.i;
        Iterator it = linkedList.iterator();
        int i2 = i;
        while (it.hasNext()) {
            Rect rect = ((com.amazon.aps.iva.ib.n) it.next()).a;
            if (rect.top == aVar.b()) {
                int b = rect.top - aVar.b();
                rect.top = aVar.b();
                rect.bottom = (rect.bottom - b) + i2;
            } else {
                rect.top += i2;
                i2 += i;
                rect.bottom += i2;
            }
        }
    }

    @Override // com.amazon.aps.iva.kb.i
    public final boolean c(com.amazon.aps.iva.ib.a aVar) {
        if (aVar.h >= aVar.d()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.hb.k
    public final com.amazon.aps.iva.hb.j e(int i) {
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return new com.amazon.aps.iva.o6.h(1);
                    }
                    return new com.amazon.aps.iva.se0.j0(1);
                }
                return new com.amazon.aps.iva.hb.d(1);
            }
            return new com.amazon.aps.iva.hb.e(1);
        }
        return new com.amazon.aps.iva.u0.b(3);
    }

    @Override // com.amazon.aps.iva.jb.e
    public final com.amazon.aps.iva.jb.f f() {
        return new com.amazon.aps.iva.u0.b(5);
    }
}
