package com.amazon.aps.iva.v2;

import com.amazon.aps.iva.u2.d;
import com.amazon.aps.iva.u2.e;
/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class p implements d {
    public int a;
    public com.amazon.aps.iva.u2.e b;
    public m c;
    public e.b d;
    public final g e = new g(this);
    public int f = 0;
    public boolean g = false;
    public final f h = new f(this);
    public final f i = new f(this);
    public b j = b.NONE;

    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.b.values().length];
            a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(com.amazon.aps.iva.u2.e eVar) {
        this.b = eVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.l.add(fVar2);
        fVar.f = i;
        fVar2.k.add(fVar);
    }

    public static f h(com.amazon.aps.iva.u2.d dVar) {
        com.amazon.aps.iva.u2.d dVar2 = dVar.f;
        if (dVar2 == null) {
            return null;
        }
        int i = a.a[dVar2.e.ordinal()];
        com.amazon.aps.iva.u2.e eVar = dVar2.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return eVar.e.i;
                    }
                    return eVar.e.k;
                }
                return eVar.e.h;
            }
            return eVar.d.i;
        }
        return eVar.d.h;
    }

    public static f i(com.amazon.aps.iva.u2.d dVar, int i) {
        p pVar;
        com.amazon.aps.iva.u2.d dVar2 = dVar.f;
        if (dVar2 == null) {
            return null;
        }
        com.amazon.aps.iva.u2.e eVar = dVar2.d;
        if (i == 0) {
            pVar = eVar.d;
        } else {
            pVar = eVar.e;
        }
        int i2 = a.a[dVar2.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pVar.i;
        }
        return pVar.h;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            com.amazon.aps.iva.u2.e eVar = this.b;
            int i3 = eVar.w;
            max = Math.max(eVar.v, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            com.amazon.aps.iva.u2.e eVar2 = this.b;
            int i4 = eVar2.z;
            max = Math.max(eVar2.y, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public long j() {
        g gVar = this.e;
        if (gVar.j) {
            return gVar.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r10.a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(com.amazon.aps.iva.u2.d r13, com.amazon.aps.iva.u2.d r14, int r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v2.p.l(com.amazon.aps.iva.u2.d, com.amazon.aps.iva.u2.d, int):void");
    }

    @Override // com.amazon.aps.iva.v2.d
    public void a(d dVar) {
    }
}
