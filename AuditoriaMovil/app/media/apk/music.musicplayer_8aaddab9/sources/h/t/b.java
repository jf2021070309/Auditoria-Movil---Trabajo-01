package h.t;

import e.j.d.w;
import h.o.b.p;
import h.o.c.j;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class b implements h.s.b<h.q.c> {
    public final CharSequence a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8959b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8960c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, h.f<Integer, Integer>> f8961d;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<h.q.c> {
        public int a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f8962b;

        /* renamed from: c  reason: collision with root package name */
        public int f8963c;

        /* renamed from: d  reason: collision with root package name */
        public h.q.c f8964d;

        /* renamed from: e  reason: collision with root package name */
        public int f8965e;

        public a() {
            int r = w.r(b.this.f8959b, 0, b.this.a.length());
            this.f8962b = r;
            this.f8963c = r;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
            if (r6 < r3) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f8963c
                r1 = 0
                if (r0 >= 0) goto Lc
                r7.a = r1
                r0 = 0
                r7.f8964d = r0
                goto L8f
            Lc:
                h.t.b r2 = h.t.b.this
                int r3 = r2.f8960c
                r4 = 1
                r5 = -1
                if (r3 <= 0) goto L1b
                int r6 = r7.f8965e
                int r6 = r6 + r4
                r7.f8965e = r6
                if (r6 >= r3) goto L23
            L1b:
                java.lang.CharSequence r2 = r2.a
                int r2 = r2.length()
                if (r0 <= r2) goto L37
            L23:
                h.q.c r0 = new h.q.c
                int r1 = r7.f8962b
                h.t.b r2 = h.t.b.this
                java.lang.CharSequence r2 = r2.a
                int r2 = h.t.g.c(r2)
                r0.<init>(r1, r2)
                r7.f8964d = r0
                r7.f8963c = r5
                goto L8d
            L37:
                h.t.b r0 = h.t.b.this
                h.o.b.p<java.lang.CharSequence, java.lang.Integer, h.f<java.lang.Integer, java.lang.Integer>> r2 = r0.f8961d
                java.lang.CharSequence r0 = r0.a
                int r3 = r7.f8963c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.i(r0, r3)
                h.f r0 = (h.f) r0
                if (r0 != 0) goto L5f
                h.q.c r0 = new h.q.c
                int r1 = r7.f8962b
                h.t.b r2 = h.t.b.this
                java.lang.CharSequence r2 = r2.a
                int r2 = h.t.g.c(r2)
                r0.<init>(r1, r2)
                r7.f8964d = r0
                r7.f8963c = r5
                goto L8d
            L5f:
                A r2 = r0.a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f8925b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f8962b
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 > r5) goto L7a
                h.q.c r3 = h.q.c.f8955d
                h.q.c r3 = h.q.c.f8956e
                goto L82
            L7a:
                h.q.c r5 = new h.q.c
                int r6 = r2 + (-1)
                r5.<init>(r3, r6)
                r3 = r5
            L82:
                r7.f8964d = r3
                int r2 = r2 + r0
                r7.f8962b = r2
                if (r0 != 0) goto L8a
                r1 = 1
            L8a:
                int r2 = r2 + r1
                r7.f8963c = r2
            L8d:
                r7.a = r4
            L8f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h.t.b.a.a():void");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == -1) {
                a();
            }
            return this.a == 1;
        }

        @Override // java.util.Iterator
        public h.q.c next() {
            if (this.a == -1) {
                a();
            }
            if (this.a != 0) {
                h.q.c cVar = this.f8964d;
                Objects.requireNonNull(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f8964d = null;
                this.a = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence charSequence, int i2, int i3, p<? super CharSequence, ? super Integer, h.f<Integer, Integer>> pVar) {
        j.e(charSequence, "input");
        j.e(pVar, "getNextMatch");
        this.a = charSequence;
        this.f8959b = i2;
        this.f8960c = i3;
        this.f8961d = pVar;
    }

    @Override // h.s.b
    public Iterator<h.q.c> iterator() {
        return new a();
    }
}
