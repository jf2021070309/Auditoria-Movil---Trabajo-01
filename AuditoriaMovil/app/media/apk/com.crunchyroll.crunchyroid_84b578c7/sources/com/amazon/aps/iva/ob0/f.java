package com.amazon.aps.iva.ob0;

import android.graphics.Rect;
import com.amazon.aps.iva.hb.j;
import com.amazon.aps.iva.ib.n;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: Continuation.kt */
/* loaded from: classes4.dex */
public class f implements com.amazon.aps.iva.hb.g, j, com.amazon.aps.iva.jb.f, com.amazon.aps.iva.kb.i {
    public static f b;

    public /* synthetic */ f() {
    }

    public static final int a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final long d(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    @Override // com.amazon.aps.iva.hb.j
    public final void b(com.amazon.aps.iva.ib.a aVar, LinkedList linkedList) {
        int h = com.amazon.aps.iva.ab.a.h(aVar) / (aVar.i + 1);
        Iterator it = linkedList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Rect rect = ((n) it.next()).a;
            i += h;
            rect.right -= i;
            rect.left -= i;
        }
    }

    @Override // com.amazon.aps.iva.kb.i
    public final boolean c(com.amazon.aps.iva.ib.a aVar) {
        return false;
    }

    @Override // com.amazon.aps.iva.hb.g
    public final int g() {
        return 16;
    }

    @Override // com.amazon.aps.iva.jb.f
    public final boolean h(com.amazon.aps.iva.ib.a aVar) {
        if (aVar.f > aVar.b() && aVar.f + aVar.b > aVar.c()) {
            return true;
        }
        return false;
    }

    public f(int i) {
    }
}
