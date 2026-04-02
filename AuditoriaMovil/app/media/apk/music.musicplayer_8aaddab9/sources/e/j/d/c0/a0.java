package e.j.d.c0;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
/* loaded from: classes2.dex */
public abstract class a0<T> {
    public static final a a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.PHResult$Companion", f = "PHResult.kt", l = {14}, m = "suspendOf")
        /* renamed from: e.j.d.c0.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0187a<T> extends h.m.i.a.c {
            public /* synthetic */ Object a;

            /* renamed from: c  reason: collision with root package name */
            public int f8617c;

            public C0187a(h.m.d<? super C0187a> dVar) {
                super(dVar);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.f8617c |= Level.ALL_INT;
                return a.this.a(null, this);
            }
        }

        public a(h.o.c.f fVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object a(h.o.b.l<? super h.m.d<? super T>, ? extends java.lang.Object> r5, h.m.d<? super e.j.d.c0.a0<? extends T>> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof e.j.d.c0.a0.a.C0187a
                if (r0 == 0) goto L13
                r0 = r6
                e.j.d.c0.a0$a$a r0 = (e.j.d.c0.a0.a.C0187a) r0
                int r1 = r0.f8617c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8617c = r1
                goto L18
            L13:
                e.j.d.c0.a0$a$a r0 = new e.j.d.c0.a0$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.a
                h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
                int r2 = r0.f8617c
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                e.j.d.w.E0(r6)     // Catch: java.lang.Exception -> L41
                goto L3b
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                e.j.d.w.E0(r6)
                r0.f8617c = r3     // Catch: java.lang.Exception -> L41
                java.lang.Object r6 = r5.invoke(r0)     // Catch: java.lang.Exception -> L41
                if (r6 != r1) goto L3b
                return r1
            L3b:
                e.j.d.c0.a0$c r5 = new e.j.d.c0.a0$c     // Catch: java.lang.Exception -> L41
                r5.<init>(r6)     // Catch: java.lang.Exception -> L41
                goto L48
            L41:
                r5 = move-exception
                e.j.d.c0.a0$b r6 = new e.j.d.c0.a0$b
                r6.<init>(r5)
                r5 = r6
            L48:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.a0.a.a(h.o.b.l, h.m.d):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends a0 {

        /* renamed from: b  reason: collision with root package name */
        public final Exception f8618b;

        public b(Exception exc) {
            super(null);
            this.f8618b = exc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && h.o.c.j.a(this.f8618b, ((b) obj).f8618b);
        }

        public int hashCode() {
            Exception exc = this.f8618b;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("Failure(error=");
            y.append(this.f8618b);
            y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return y.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> extends a0<T> {

        /* renamed from: b  reason: collision with root package name */
        public final T f8619b;

        public c(T t) {
            super(null);
            this.f8619b = t;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && h.o.c.j.a(this.f8619b, ((c) obj).f8619b);
        }

        public int hashCode() {
            T t = this.f8619b;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("Success(value=");
            y.append(this.f8619b);
            y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return y.toString();
        }
    }

    public a0() {
    }

    public a0(h.o.c.f fVar) {
    }
}
