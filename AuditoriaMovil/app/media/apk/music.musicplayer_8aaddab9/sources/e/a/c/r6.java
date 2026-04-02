package e.a.c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
/* loaded from: classes.dex */
public class r6 {
    public final Vector<Integer> a = new Vector<>(100);

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<Integer, Integer> f5174b = new HashMap<>();

    public void a() {
        synchronized (this.a) {
            this.a.clear();
            this.f5174b.clear();
        }
    }

    public void b(e.h.g.l0 l0Var) {
        synchronized (this.a) {
            l.a.a.a aVar = new l.a.a.a(this.a.size());
            Iterator<Integer> it = this.a.iterator();
            while (it.hasNext()) {
                aVar.add(Long.valueOf(it.next().intValue()));
            }
            l0Var.q("history");
            l0Var.p("history2", aVar.b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r0.get(r0.size() - 1).intValue() != r3) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L2f
            java.util.Vector<java.lang.Integer> r0 = r2.a
            int r0 = r0.size()
            if (r0 == 0) goto L26
            java.util.Vector<java.lang.Integer> r0 = r2.a
            int r0 = r0.size()
            if (r0 <= 0) goto L2f
            java.util.Vector<java.lang.Integer> r0 = r2.a
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == r3) goto L2f
        L26:
            java.util.Vector<java.lang.Integer> r0 = r2.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
        L2f:
            java.util.Vector<java.lang.Integer> r3 = r2.a
            int r3 = r3.size()
            r0 = 100
            if (r3 <= r0) goto L3f
            java.util.Vector<java.lang.Integer> r3 = r2.a
            r0 = 0
            r3.removeElementAt(r0)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.c.r6.c(int):void");
    }
}
