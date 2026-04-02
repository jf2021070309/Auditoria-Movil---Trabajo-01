package i.a.h2.w;

import ch.qos.logback.classic.Level;
import h.m.f;
import h.o.b.p;
import h.o.c.k;
import i.a.g1;
import i.a.i2.o;
/* loaded from: classes2.dex */
public final class j extends k implements p<Integer, f.a, Integer> {
    public final /* synthetic */ h<?> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h<?> hVar) {
        super(2);
        this.a = hVar;
    }

    @Override // h.o.b.p
    public Integer i(Integer num, f.a aVar) {
        int intValue = num.intValue();
        f.a aVar2 = aVar;
        f.b<?> key = aVar2.getKey();
        f.a aVar3 = this.a.f9053b.get(key);
        int i2 = g1.T;
        if (key != g1.a.a) {
            return Integer.valueOf(aVar2 != aVar3 ? Level.ALL_INT : intValue + 1);
        }
        g1 g1Var = (g1) aVar3;
        g1 g1Var2 = (g1) aVar2;
        while (true) {
            if (g1Var2 != null) {
                if (g1Var2 == g1Var || !(g1Var2 instanceof o)) {
                    break;
                }
                i.a.o x = ((o) g1Var2).x();
                g1Var2 = x == null ? null : x.getParent();
            } else {
                g1Var2 = null;
                break;
            }
        }
        if (g1Var2 == g1Var) {
            if (g1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + g1Var2 + ", expected child of " + g1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
