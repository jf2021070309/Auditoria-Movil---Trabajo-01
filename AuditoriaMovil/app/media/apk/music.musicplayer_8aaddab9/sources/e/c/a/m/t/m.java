package e.c.a.m.t;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
/* loaded from: classes.dex */
public class m<A, B> {
    public final e.c.a.s.g<b<A>, B> a;

    /* loaded from: classes.dex */
    public class a extends e.c.a.s.g<b<A>, B> {
        public a(m mVar, long j2) {
            super(j2);
        }

        @Override // e.c.a.s.g
        public void c(Object obj, Object obj2) {
            b<?> bVar = (b) obj;
            Objects.requireNonNull(bVar);
            Queue<b<?>> queue = b.a;
            synchronized (queue) {
                queue.offer(bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b<A> {
        public static final Queue<b<?>> a;

        /* renamed from: b  reason: collision with root package name */
        public int f5802b;

        /* renamed from: c  reason: collision with root package name */
        public int f5803c;

        /* renamed from: d  reason: collision with root package name */
        public A f5804d;

        static {
            char[] cArr = e.c.a.s.j.a;
            a = new ArrayDeque(0);
        }

        public static <A> b<A> a(A a2, int i2, int i3) {
            b<A> bVar;
            Queue<b<?>> queue = a;
            synchronized (queue) {
                bVar = (b<A>) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.f5804d = a2;
            bVar.f5803c = i2;
            bVar.f5802b = i3;
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f5803c == bVar.f5803c && this.f5802b == bVar.f5802b && this.f5804d.equals(bVar.f5804d);
            }
            return false;
        }

        public int hashCode() {
            return this.f5804d.hashCode() + (((this.f5802b * 31) + this.f5803c) * 31);
        }
    }

    public m(long j2) {
        this.a = new a(this, j2);
    }
}
