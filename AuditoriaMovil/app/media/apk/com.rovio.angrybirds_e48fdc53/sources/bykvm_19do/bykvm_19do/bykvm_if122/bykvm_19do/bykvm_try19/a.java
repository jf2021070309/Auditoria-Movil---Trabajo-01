package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19;

import java.util.LinkedList;
import java.util.Queue;
/* loaded from: classes.dex */
public class a {
    private static volatile a d;
    private long a;
    private long b;
    private final Queue<Long> c = new LinkedList();

    private a() {
    }

    public static a c() {
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    public void a(long j, long j2) {
        synchronized (a.class) {
            if (this.a != j || this.b != j2) {
                this.a = j;
                this.b = j2;
                this.c.clear();
            }
        }
    }

    public boolean a() {
        boolean z;
        Queue<Long> queue;
        Long valueOf;
        synchronized (a.class) {
            z = false;
            if (this.a > 0 && this.b > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.c.size() >= this.a) {
                    while (this.c.size() > this.a) {
                        this.c.poll();
                    }
                    if (Math.abs(currentTimeMillis - this.c.peek().longValue()) <= this.b) {
                        z = true;
                    } else {
                        this.c.poll();
                        queue = this.c;
                        valueOf = Long.valueOf(currentTimeMillis);
                    }
                } else {
                    queue = this.c;
                    valueOf = Long.valueOf(currentTimeMillis);
                }
                queue.offer(valueOf);
            }
        }
        return z;
    }

    public boolean b() {
        boolean z;
        synchronized (a.class) {
            z = false;
            if (this.a > 0 && this.b > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.c.size() >= this.a) {
                    while (this.c.size() > this.a) {
                        this.c.poll();
                    }
                    if (Math.abs(currentTimeMillis - this.c.peek().longValue()) <= this.b) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }
}
