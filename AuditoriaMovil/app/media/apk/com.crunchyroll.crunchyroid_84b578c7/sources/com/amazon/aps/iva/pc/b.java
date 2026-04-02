package com.amazon.aps.iva.pc;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: classes.dex */
public final class b {
    public final HashMap a = new HashMap();
    public final C0608b b = new C0608b();

    /* compiled from: DiskCacheWriteLocker.java */
    /* loaded from: classes.dex */
    public static class a {
        public final ReentrantLock a = new ReentrantLock();
        public int b;
    }

    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: com.amazon.aps.iva.pc.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0608b {
        public final ArrayDeque a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.a.get(str);
            defpackage.i.l(obj);
            aVar = (a) obj;
            int i = aVar.b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.b = i2;
                if (i2 == 0) {
                    a aVar2 = (a) this.a.remove(str);
                    if (aVar2.equals(aVar)) {
                        C0608b c0608b = this.b;
                        synchronized (c0608b.a) {
                            if (c0608b.a.size() < 10) {
                                c0608b.a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.b);
            }
        }
        aVar.a.unlock();
    }
}
