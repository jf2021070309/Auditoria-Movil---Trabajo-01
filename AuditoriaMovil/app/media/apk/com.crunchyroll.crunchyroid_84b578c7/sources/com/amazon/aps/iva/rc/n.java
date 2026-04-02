package com.amazon.aps.iva.rc;

import java.util.ArrayDeque;
/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public final class n<A, B> {
    public final m a = new m();

    /* compiled from: ModelCache.java */
    /* loaded from: classes.dex */
    public static final class a<A> {
        public static final ArrayDeque d;
        public int a;
        public int b;
        public A c;

        static {
            char[] cArr = com.amazon.aps.iva.hd.l.a;
            d = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = d;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.c = obj;
            aVar.b = 0;
            aVar.a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b || this.a != aVar.a || !this.c.equals(aVar.c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
        }
    }
}
