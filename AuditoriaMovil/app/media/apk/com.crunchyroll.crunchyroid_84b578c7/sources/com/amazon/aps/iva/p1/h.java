package com.amazon.aps.iva.p1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: InternalPointerEvent.android.kt */
/* loaded from: classes.dex */
public final class h {
    public final Map<x, y> a;
    public final a0 b;
    public boolean c;

    public h(LinkedHashMap linkedHashMap, a0 a0Var) {
        this.a = linkedHashMap;
        this.b = a0Var;
    }

    public final boolean a(long j) {
        b0 b0Var;
        List<b0> list = this.b.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                b0Var = list.get(i);
                if (x.a(b0Var.a, j)) {
                    break;
                }
                i++;
            } else {
                b0Var = null;
                break;
            }
        }
        b0 b0Var2 = b0Var;
        if (b0Var2 == null) {
            return false;
        }
        return b0Var2.h;
    }
}
