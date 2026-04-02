package h.n;

import h.o.c.j;
import h.p.c;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: h.n.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0202a {
        public static final Method a;

        /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[SYNTHETIC] */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                h.o.c.j.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            Le:
                r5 = 0
                if (r4 >= r2) goto L40
                r6 = r1[r4]
                int r4 = r4 + 1
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = h.o.c.j.a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L3c
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                h.o.c.j.d(r7, r9)
                java.lang.String r9 = "<this>"
                h.o.c.j.e(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L35
                r5 = r7[r3]
            L35:
                boolean r5 = h.o.c.j.a(r5, r0)
                if (r5 == 0) goto L3c
                goto L3d
            L3c:
                r8 = 0
            L3d:
                if (r8 == 0) goto Le
                r5 = r6
            L40:
                h.n.a.C0202a.a = r5
                int r0 = r1.length
            L43:
                if (r3 >= r0) goto L55
                r2 = r1[r3]
                int r3 = r3 + 1
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = h.o.c.j.a(r2, r4)
                if (r2 == 0) goto L43
            L55:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h.n.a.C0202a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        j.e(th, "cause");
        j.e(th2, "exception");
        Method method = C0202a.a;
        if (method == null) {
            return;
        }
        method.invoke(th, th2);
    }

    public c b() {
        return new h.p.b();
    }
}
