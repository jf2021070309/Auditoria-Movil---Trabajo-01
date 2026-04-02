package e.c.a.m.s.d0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class c {
    public final Map<String, a> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final b f5636b = new b();

    /* loaded from: classes.dex */
    public static class a {
        public final Lock a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f5637b;
    }

    /* loaded from: classes.dex */
    public static class b {
        public final Queue<a> a = new ArrayDeque();
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            a aVar2 = this.a.get(str);
            Objects.requireNonNull(aVar2, "Argument must not be null");
            aVar = aVar2;
            int i2 = aVar.f5637b;
            if (i2 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f5637b);
            }
            int i3 = i2 - 1;
            aVar.f5637b = i3;
            if (i3 == 0) {
                a remove = this.a.remove(str);
                if (!remove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                }
                b bVar = this.f5636b;
                synchronized (bVar.a) {
                    if (bVar.a.size() < 10) {
                        bVar.a.offer(remove);
                    }
                }
            }
        }
        aVar.a.unlock();
    }
}
