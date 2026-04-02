package i.a;

import h.m.e;
/* loaded from: classes2.dex */
public final class a0 {
    public static final boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r0.equals("") != false) goto L21;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = e.j.d.w.A0(r0)
            if (r0 == 0) goto L53
            int r1 = r0.hashCode()
            if (r1 == 0) goto L2a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L21
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L33
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            r0 = 0
            goto L54
        L21:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L2a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L53:
            r0 = 1
        L54:
            i.a.a0.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.a0.<clinit>():void");
    }

    public static final h.m.f a(e0 e0Var, h.m.f fVar) {
        h.m.f plus = e0Var.g().plus(fVar);
        c0 c0Var = o0.a;
        if (plus != c0Var) {
            int i2 = h.m.e.R;
            return plus.get(e.a.a) == null ? plus.plus(c0Var) : plus;
        }
        return plus;
    }

    public static final c2<?> b(h.m.d<?> dVar, h.m.f fVar, Object obj) {
        c2<?> c2Var = null;
        if (dVar instanceof h.m.i.a.d) {
            if (fVar.get(d2.a) != null) {
                h.m.i.a.d dVar2 = (h.m.i.a.d) dVar;
                while (true) {
                    if (!(dVar2 instanceof m0) && (dVar2 = dVar2.getCallerFrame()) != null) {
                        if (dVar2 instanceof c2) {
                            c2Var = (c2) dVar2;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (c2Var != null) {
                    c2Var.f8971d = fVar;
                    c2Var.f8972e = obj;
                }
                return c2Var;
            }
            return null;
        }
        return null;
    }
}
