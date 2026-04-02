package com.facebook.ads.internal.j;

import com.facebook.ads.internal.j.d;
import com.facebook.ads.internal.j.f;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
/* loaded from: classes2.dex */
public class e<T extends f, E extends d> {
    private final Map<Class<E>, List<WeakReference<T>>> a = new HashMap();
    private final Queue<E> b = new ArrayDeque();

    private void a(List<WeakReference<T>> list) {
        if (list != null) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                WeakReference<T> weakReference = list.get(i2);
                if (weakReference.get() != null) {
                    list.set(i, weakReference);
                    i++;
                }
            }
            for (int size = list.size() - 1; size >= i; size--) {
                list.remove(size);
            }
        }
    }

    private void b(E e) {
        List<WeakReference<T>> list;
        if (this.a == null || (list = this.a.get(e.getClass())) == null) {
            return;
        }
        a(list);
        if (list.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : new ArrayList(list)) {
            f fVar = (f) weakReference.get();
            if (fVar != null && fVar.b(e)) {
                fVar.a(e);
            }
        }
    }

    public synchronized void a(E e) {
        if (this.b.isEmpty()) {
            this.b.add(e);
            while (!this.b.isEmpty()) {
                b((e<T, E>) this.b.peek());
                this.b.remove();
            }
        } else {
            this.b.add(e);
        }
    }

    public synchronized void a(T... tArr) {
        if (tArr != null) {
            for (T t : tArr) {
                a((e<T, E>) t);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        r0 = r0.add(new java.lang.ref.WeakReference<>(r6));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean a(T r6) {
        /*
            r5 = this;
            r2 = 0
            monitor-enter(r5)
            if (r6 != 0) goto L7
            r0 = r2
        L5:
            monitor-exit(r5)
            return r0
        L7:
            java.lang.Class r0 = r6.a()     // Catch: java.lang.Throwable -> L4b
            java.util.Map<java.lang.Class<E extends com.facebook.ads.internal.j.d>, java.util.List<java.lang.ref.WeakReference<T extends com.facebook.ads.internal.j.f>>> r1 = r5.a     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L1d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            r1.<init>()     // Catch: java.lang.Throwable -> L4b
            java.util.Map<java.lang.Class<E extends com.facebook.ads.internal.j.d>, java.util.List<java.lang.ref.WeakReference<T extends com.facebook.ads.internal.j.f>>> r3 = r5.a     // Catch: java.lang.Throwable -> L4b
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L4b
        L1d:
            java.util.Map<java.lang.Class<E extends com.facebook.ads.internal.j.d>, java.util.List<java.lang.ref.WeakReference<T extends com.facebook.ads.internal.j.f>>> r1 = r5.a     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L4b
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L4b
            r5.a(r0)     // Catch: java.lang.Throwable -> L4b
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L4b
            r3 = r2
        L2d:
            if (r3 >= r4) goto L41
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L4b
            if (r1 != r6) goto L3d
            r0 = r2
            goto L5
        L3d:
            int r1 = r3 + 1
            r3 = r1
            goto L2d
        L41:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L4b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L4b
            goto L5
        L4b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.j.e.a(com.facebook.ads.internal.j.f):boolean");
    }

    public synchronized void b(T... tArr) {
        if (tArr != null) {
            for (T t : tArr) {
                b((e<T, E>) t);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        r0.get(r3).clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b(T r6) {
        /*
            r5 = this;
            r2 = 0
            monitor-enter(r5)
            if (r6 != 0) goto L7
            r0 = r2
        L5:
            monitor-exit(r5)
            return r0
        L7:
            java.util.Map<java.lang.Class<E extends com.facebook.ads.internal.j.d>, java.util.List<java.lang.ref.WeakReference<T extends com.facebook.ads.internal.j.f>>> r0 = r5.a     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r1 = r6.a()     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3b
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L17
            r0 = r2
            goto L5
        L17:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L3b
            r3 = r2
        L1c:
            if (r3 >= r4) goto L39
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L3b
            if (r1 != r6) goto L35
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L3b
            r0.clear()     // Catch: java.lang.Throwable -> L3b
            r0 = 1
            goto L5
        L35:
            int r1 = r3 + 1
            r3 = r1
            goto L1c
        L39:
            r0 = r2
            goto L5
        L3b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.j.e.b(com.facebook.ads.internal.j.f):boolean");
    }
}
