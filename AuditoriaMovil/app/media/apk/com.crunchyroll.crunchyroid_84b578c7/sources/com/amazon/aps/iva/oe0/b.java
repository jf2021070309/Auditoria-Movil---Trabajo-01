package com.amazon.aps.iva.oe0;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Strings.kt */
/* loaded from: classes4.dex */
public final class b implements com.amazon.aps.iva.ne0.h<com.amazon.aps.iva.ec0.j> {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final com.amazon.aps.iva.xb0.p<CharSequence, Integer, com.amazon.aps.iva.kb0.j<Integer, Integer>> d;

    /* compiled from: Strings.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<com.amazon.aps.iva.ec0.j>, com.amazon.aps.iva.zb0.a {
        public int b = -1;
        public int c;
        public int d;
        public com.amazon.aps.iva.ec0.j e;
        public int f;

        public a() {
            int j = com.amazon.aps.iva.aq.j.j(b.this.b, 0, b.this.a.length());
            this.c = j;
            this.d = j;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r6 < r3) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b() {
            /*
                r7 = this;
                int r0 = r7.d
                r1 = 0
                if (r0 >= 0) goto Lb
                r7.b = r1
                r0 = 0
                r7.e = r0
                goto L7b
            Lb:
                com.amazon.aps.iva.oe0.b r2 = com.amazon.aps.iva.oe0.b.this
                int r3 = r2.c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L1a
                int r6 = r7.f
                int r6 = r6 + r5
                r7.f = r6
                if (r6 >= r3) goto L22
            L1a:
                java.lang.CharSequence r3 = r2.a
                int r3 = r3.length()
                if (r0 <= r3) goto L34
            L22:
                com.amazon.aps.iva.ec0.j r0 = new com.amazon.aps.iva.ec0.j
                int r1 = r7.c
                java.lang.CharSequence r2 = r2.a
                int r2 = com.amazon.aps.iva.oe0.q.n0(r2)
                r0.<init>(r1, r2)
                r7.e = r0
                r7.d = r4
                goto L79
            L34:
                com.amazon.aps.iva.xb0.p<java.lang.CharSequence, java.lang.Integer, com.amazon.aps.iva.kb0.j<java.lang.Integer, java.lang.Integer>> r0 = r2.d
                java.lang.CharSequence r3 = r2.a
                int r6 = r7.d
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r0 = r0.invoke(r3, r6)
                com.amazon.aps.iva.kb0.j r0 = (com.amazon.aps.iva.kb0.j) r0
                if (r0 != 0) goto L58
                com.amazon.aps.iva.ec0.j r0 = new com.amazon.aps.iva.ec0.j
                int r1 = r7.c
                java.lang.CharSequence r2 = r2.a
                int r2 = com.amazon.aps.iva.oe0.q.n0(r2)
                r0.<init>(r1, r2)
                r7.e = r0
                r7.d = r4
                goto L79
            L58:
                A r2 = r0.b
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.c
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.c
                com.amazon.aps.iva.ec0.j r3 = com.amazon.aps.iva.aq.j.T(r3, r2)
                r7.e = r3
                int r2 = r2 + r0
                r7.c = r2
                if (r0 != 0) goto L76
                r1 = r5
            L76:
                int r2 = r2 + r1
                r7.d = r2
            L79:
                r7.b = r5
            L7b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oe0.b.a.b():void");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b == -1) {
                b();
            }
            if (this.b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final com.amazon.aps.iva.ec0.j next() {
            if (this.b == -1) {
                b();
            }
            if (this.b != 0) {
                com.amazon.aps.iva.ec0.j jVar = this.e;
                com.amazon.aps.iva.yb0.j.d(jVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.e = null;
                this.b = -1;
                return jVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence charSequence, int i, int i2, com.amazon.aps.iva.xb0.p<? super CharSequence, ? super Integer, com.amazon.aps.iva.kb0.j<Integer, Integer>> pVar) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "input");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = pVar;
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<com.amazon.aps.iva.ec0.j> iterator() {
        return new a();
    }
}
