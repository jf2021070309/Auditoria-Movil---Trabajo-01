package e.d.b.e.a.g;

import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes2.dex */
public final class m<ResultT> {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public Queue<l<ResultT>> f7031b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7032c;

    public final void a(l<ResultT> lVar) {
        synchronized (this.a) {
            if (this.f7031b == null) {
                this.f7031b = new ArrayDeque();
            }
            this.f7031b.add(lVar);
        }
    }

    public final void b(r<ResultT> rVar) {
        l<ResultT> poll;
        synchronized (this.a) {
            if (this.f7031b != null && !this.f7032c) {
                this.f7032c = true;
                while (true) {
                    synchronized (this.a) {
                        poll = this.f7031b.poll();
                        if (poll == null) {
                            this.f7032c = false;
                            return;
                        }
                    }
                    poll.a(rVar);
                }
            }
        }
    }
}
