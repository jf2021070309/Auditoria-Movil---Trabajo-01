package c.g.a.i;

import c.g.a.g;
import c.g.a.i.l.n;
import ch.qos.logback.classic.Level;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public int f1733b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1734c;

    /* renamed from: d  reason: collision with root package name */
    public final d f1735d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1736e;

    /* renamed from: f  reason: collision with root package name */
    public c f1737f;

    /* renamed from: i  reason: collision with root package name */
    public c.g.a.g f1740i;
    public HashSet<c> a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f1738g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f1739h = Level.ALL_INT;

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, a aVar) {
        this.f1735d = dVar;
        this.f1736e = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r4.f1735d.E == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        if (r8 != c.g.a.i.c.a.CENTER_Y) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (r8 != c.g.a.i.c.a.RIGHT) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0063, code lost:
        if (r8 != c.g.a.i.c.a.CENTER_Y) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007e, code lost:
        if (r8 != c.g.a.i.c.a.CENTER_X) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(c.g.a.i.c r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != 0) goto L7
            r4.h()
            return r0
        L7:
            if (r8 != 0) goto L84
            c.g.a.i.c$a r8 = r5.f1736e
            c.g.a.i.c$a r1 = r4.f1736e
            r2 = 0
            if (r8 != r1) goto L21
            c.g.a.i.c$a r8 = c.g.a.i.c.a.BASELINE
            if (r1 != r8) goto L40
            c.g.a.i.d r8 = r5.f1735d
            boolean r8 = r8.E
            if (r8 == 0) goto L42
            c.g.a.i.d r8 = r4.f1735d
            boolean r8 = r8.E
            if (r8 != 0) goto L40
            goto L42
        L21:
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L42;
                case 1: goto L68;
                case 2: goto L4d;
                case 3: goto L68;
                case 4: goto L4d;
                case 5: goto L44;
                case 6: goto L34;
                case 7: goto L42;
                case 8: goto L42;
                default: goto L28;
            }
        L28:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            c.g.a.i.c$a r6 = r4.f1736e
            java.lang.String r6 = r6.name()
            r5.<init>(r6)
            throw r5
        L34:
            c.g.a.i.c$a r1 = c.g.a.i.c.a.BASELINE
            if (r8 == r1) goto L42
            c.g.a.i.c$a r1 = c.g.a.i.c.a.CENTER_X
            if (r8 == r1) goto L42
            c.g.a.i.c$a r1 = c.g.a.i.c.a.CENTER_Y
            if (r8 == r1) goto L42
        L40:
            r8 = 1
            goto L81
        L42:
            r8 = 0
            goto L81
        L44:
            c.g.a.i.c$a r1 = c.g.a.i.c.a.LEFT
            if (r8 == r1) goto L42
            c.g.a.i.c$a r1 = c.g.a.i.c.a.RIGHT
            if (r8 != r1) goto L40
            goto L42
        L4d:
            c.g.a.i.c$a r1 = c.g.a.i.c.a.TOP
            if (r8 == r1) goto L58
            c.g.a.i.c$a r1 = c.g.a.i.c.a.BOTTOM
            if (r8 != r1) goto L56
            goto L58
        L56:
            r1 = 0
            goto L59
        L58:
            r1 = 1
        L59:
            c.g.a.i.d r3 = r5.f1735d
            boolean r3 = r3 instanceof c.g.a.i.f
            if (r3 == 0) goto L66
            if (r1 != 0) goto L40
            c.g.a.i.c$a r1 = c.g.a.i.c.a.CENTER_Y
            if (r8 != r1) goto L42
            goto L40
        L66:
            r8 = r1
            goto L81
        L68:
            c.g.a.i.c$a r1 = c.g.a.i.c.a.LEFT
            if (r8 == r1) goto L73
            c.g.a.i.c$a r1 = c.g.a.i.c.a.RIGHT
            if (r8 != r1) goto L71
            goto L73
        L71:
            r1 = 0
            goto L74
        L73:
            r1 = 1
        L74:
            c.g.a.i.d r3 = r5.f1735d
            boolean r3 = r3 instanceof c.g.a.i.f
            if (r3 == 0) goto L66
            if (r1 != 0) goto L40
            c.g.a.i.c$a r1 = c.g.a.i.c.a.CENTER_X
            if (r8 != r1) goto L42
            goto L40
        L81:
            if (r8 != 0) goto L84
            return r2
        L84:
            r4.f1737f = r5
            java.util.HashSet<c.g.a.i.c> r8 = r5.a
            if (r8 != 0) goto L91
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r5.a = r8
        L91:
            c.g.a.i.c r5 = r4.f1737f
            java.util.HashSet<c.g.a.i.c> r5 = r5.a
            if (r5 == 0) goto L9a
            r5.add(r4)
        L9a:
            r4.f1738g = r6
            r4.f1739h = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.a.i.c.a(c.g.a.i.c, int, int, boolean):boolean");
    }

    public void b(int i2, ArrayList<n> arrayList, n nVar) {
        HashSet<c> hashSet = this.a;
        if (hashSet != null) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                c.e.a.b(it.next().f1735d, i2, arrayList, nVar);
            }
        }
    }

    public int c() {
        if (this.f1734c) {
            return this.f1733b;
        }
        return 0;
    }

    public int d() {
        c cVar;
        if (this.f1735d.i0 == 8) {
            return 0;
        }
        int i2 = this.f1739h;
        return (i2 == Integer.MIN_VALUE || (cVar = this.f1737f) == null || cVar.f1735d.i0 != 8) ? this.f1738g : i2;
    }

    public boolean e() {
        c cVar;
        HashSet<c> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            c next = it.next();
            switch (next.f1736e.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    cVar = null;
                    break;
                case 1:
                    cVar = next.f1735d.L;
                    break;
                case 2:
                    cVar = next.f1735d.M;
                    break;
                case 3:
                    cVar = next.f1735d.J;
                    break;
                case 4:
                    cVar = next.f1735d.K;
                    break;
                default:
                    throw new AssertionError(next.f1736e.name());
            }
            if (cVar.g()) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        HashSet<c> hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean g() {
        return this.f1737f != null;
    }

    public void h() {
        HashSet<c> hashSet;
        c cVar = this.f1737f;
        if (cVar != null && (hashSet = cVar.a) != null) {
            hashSet.remove(this);
            if (this.f1737f.a.size() == 0) {
                this.f1737f.a = null;
            }
        }
        this.a = null;
        this.f1737f = null;
        this.f1738g = 0;
        this.f1739h = Level.ALL_INT;
        this.f1734c = false;
        this.f1733b = 0;
    }

    public void i() {
        c.g.a.g gVar = this.f1740i;
        if (gVar == null) {
            this.f1740i = new c.g.a.g(g.a.UNRESTRICTED);
        } else {
            gVar.c();
        }
    }

    public void j(int i2) {
        this.f1733b = i2;
        this.f1734c = true;
    }

    public String toString() {
        return this.f1735d.j0 + ":" + this.f1736e.toString();
    }
}
