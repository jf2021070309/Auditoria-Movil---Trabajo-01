package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.se0.j1;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Integer, g.b, Integer> {
    public final /* synthetic */ o<?> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o<?> oVar) {
        super(2);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Integer invoke(Integer num, g.b bVar) {
        int i;
        int intValue = num.intValue();
        g.b bVar2 = bVar;
        g.c<?> key = bVar2.getKey();
        g.b bVar3 = this.h.i.get(key);
        int i2 = j1.m0;
        if (key != j1.b.b) {
            if (bVar2 != bVar3) {
                i = Integer.MIN_VALUE;
            } else {
                i = intValue + 1;
            }
            return Integer.valueOf(i);
        }
        j1 j1Var = (j1) bVar3;
        j1 j1Var2 = (j1) bVar2;
        while (true) {
            if (j1Var2 == null) {
                j1Var2 = null;
                break;
            } else if (j1Var2 == j1Var || !(j1Var2 instanceof com.amazon.aps.iva.xe0.p)) {
                break;
            } else {
                com.amazon.aps.iva.se0.q a0 = ((com.amazon.aps.iva.xe0.p) j1Var2).a0();
                if (a0 != null) {
                    j1Var2 = a0.getParent();
                } else {
                    j1Var2 = null;
                }
            }
        }
        if (j1Var2 == j1Var) {
            if (j1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + j1Var2 + ", expected child of " + j1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
