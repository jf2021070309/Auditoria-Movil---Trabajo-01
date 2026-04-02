package e.c.a.m.s.c0;

import e.c.a.m.s.c0.l;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes.dex */
public abstract class c<T extends l> {
    public final Queue<T> a;

    public c() {
        char[] cArr = e.c.a.s.j.a;
        this.a = new ArrayDeque(20);
    }

    public abstract T a();

    public T b() {
        T poll = this.a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
