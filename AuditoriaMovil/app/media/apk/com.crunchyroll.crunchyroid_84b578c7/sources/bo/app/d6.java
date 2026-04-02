package bo.app;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public final class d6 {
    public static final a b = new a(null);
    private static final Comparator c = new com.amazon.aps.iva.u1.y(5);
    private final PriorityQueue a;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    public d6(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "fallbackActions");
        PriorityQueue priorityQueue = new PriorityQueue(12, c);
        this.a = priorityQueue;
        priorityQueue.addAll(list);
    }

    public final q2 a() {
        return (q2) this.a.poll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(q2 q2Var, q2 q2Var2) {
        com.amazon.aps.iva.yb0.j.f(q2Var, "actionA");
        com.amazon.aps.iva.yb0.j.f(q2Var2, "actionB");
        int j = q2Var.n().j();
        int j2 = q2Var2.n().j();
        if (j > j2) {
            return -1;
        }
        if (j < j2) {
            return 1;
        }
        return q2Var.getId().compareTo(q2Var2.getId());
    }
}
