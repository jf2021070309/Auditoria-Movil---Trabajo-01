package com.amazon.aps.iva.r7;

import com.amazon.aps.iva.f1.d0;
import com.amazon.aps.iva.q7.e;
import com.amazon.aps.iva.q7.g;
import com.amazon.aps.iva.q7.h;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.z5.g;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
/* compiled from: CeaDecoder.java */
/* loaded from: classes.dex */
public abstract class c implements e {
    public final ArrayDeque<a> a = new ArrayDeque<>();
    public final ArrayDeque<h> b;
    public final PriorityQueue<a> c;
    public a d;
    public long e;
    public long f;

    /* compiled from: CeaDecoder.java */
    /* loaded from: classes.dex */
    public static final class a extends g implements Comparable<a> {
        public long k;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (i(4) != aVar2.i(4)) {
                if (i(4)) {
                    return 1;
                }
            } else {
                long j = this.f - aVar2.f;
                if (j == 0) {
                    j = this.k - aVar2.k;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
            }
            return -1;
        }
    }

    /* compiled from: CeaDecoder.java */
    /* loaded from: classes.dex */
    public static final class b extends h {
        public final g.a<b> f;

        public b(d0 d0Var) {
            this.f = d0Var;
        }

        @Override // com.amazon.aps.iva.z5.g
        public final void k() {
            c cVar = (c) ((d0) this.f).c;
            cVar.getClass();
            this.b = 0;
            this.d = null;
            cVar.b.add(this);
        }
    }

    public c() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new a());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new b(new d0(this, 3)));
        }
        this.c = new PriorityQueue<>();
    }

    @Override // com.amazon.aps.iva.z5.d
    public final void a(com.amazon.aps.iva.q7.g gVar) throws com.amazon.aps.iva.z5.e {
        boolean z;
        if (gVar == this.d) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        a aVar = (a) gVar;
        if (aVar.j()) {
            aVar.k();
            this.a.add(aVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            aVar.k = j;
            this.c.add(aVar);
        }
        this.d = null;
    }

    @Override // com.amazon.aps.iva.q7.e
    public final void b(long j) {
        this.e = j;
    }

    @Override // com.amazon.aps.iva.z5.d
    public final com.amazon.aps.iva.q7.g d() throws com.amazon.aps.iva.z5.e {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        ArrayDeque<a> arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        a pollFirst = arrayDeque.pollFirst();
        this.d = pollFirst;
        return pollFirst;
    }

    public abstract d e();

    public abstract void f(a aVar);

    @Override // com.amazon.aps.iva.z5.d
    public void flush() {
        ArrayDeque<a> arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue<a> priorityQueue = this.c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            a poll = priorityQueue.poll();
            int i = g0.a;
            poll.k();
            arrayDeque.add(poll);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
            arrayDeque.add(aVar);
            this.d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        return null;
     */
    @Override // com.amazon.aps.iva.z5.d
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.aps.iva.q7.h c() throws com.amazon.aps.iva.q7.f {
        /*
            r12 = this;
            java.util.ArrayDeque<com.amazon.aps.iva.q7.h> r0 = r12.b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue<com.amazon.aps.iva.r7.c$a> r1 = r12.c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r1.peek()
            com.amazon.aps.iva.r7.c$a r3 = (com.amazon.aps.iva.r7.c.a) r3
            int r4 = com.amazon.aps.iva.t5.g0.a
            long r3 = r3.f
            long r5 = r12.e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6d
            java.lang.Object r1 = r1.poll()
            com.amazon.aps.iva.r7.c$a r1 = (com.amazon.aps.iva.r7.c.a) r1
            r3 = 4
            boolean r4 = r1.i(r3)
            java.util.ArrayDeque<com.amazon.aps.iva.r7.c$a> r5 = r12.a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            com.amazon.aps.iva.q7.h r0 = (com.amazon.aps.iva.q7.h) r0
            r0.h(r3)
            r1.k()
            r5.add(r1)
            return r0
        L41:
            r12.f(r1)
            boolean r3 = r12.h()
            if (r3 == 0) goto L66
            com.amazon.aps.iva.r7.d r9 = r12.e()
            java.lang.Object r0 = r0.pollFirst()
            com.amazon.aps.iva.q7.h r0 = (com.amazon.aps.iva.q7.h) r0
            long r7 = r1.f
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r0
            r6.l(r7, r9, r10)
            r1.k()
            r5.add(r1)
            return r0
        L66:
            r1.k()
            r5.add(r1)
            goto La
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r7.c.c():com.amazon.aps.iva.q7.h");
    }

    public abstract boolean h();

    @Override // com.amazon.aps.iva.z5.d
    public void release() {
    }
}
