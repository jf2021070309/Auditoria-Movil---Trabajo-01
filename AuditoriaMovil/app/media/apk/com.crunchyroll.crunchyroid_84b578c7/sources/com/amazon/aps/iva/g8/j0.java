package com.amazon.aps.iva.g8;

import com.amazon.aps.iva.g8.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: NavGraph.kt */
/* loaded from: classes.dex */
public class j0 extends g0 implements Iterable<g0>, com.amazon.aps.iva.zb0.a {
    public static final /* synthetic */ int o = 0;
    public final com.amazon.aps.iva.x.i<g0> k;
    public int l;
    public String m;
    public String n;

    /* compiled from: NavGraph.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: NavGraph.kt */
        /* renamed from: com.amazon.aps.iva.g8.j0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0297a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, g0> {
            public static final C0297a h = new C0297a();

            public C0297a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final g0 invoke(g0 g0Var) {
                g0 g0Var2 = g0Var;
                com.amazon.aps.iva.yb0.j.f(g0Var2, "it");
                if (g0Var2 instanceof j0) {
                    j0 j0Var = (j0) g0Var2;
                    return j0Var.n(j0Var.l, true);
                }
                return null;
            }
        }

        public static g0 a(j0 j0Var) {
            com.amazon.aps.iva.yb0.j.f(j0Var, "<this>");
            return (g0) com.amazon.aps.iva.ne0.s.a0(com.amazon.aps.iva.ne0.k.R(j0Var.n(j0Var.l, true), C0297a.h));
        }
    }

    /* compiled from: NavGraph.kt */
    /* loaded from: classes.dex */
    public static final class b implements Iterator<g0>, com.amazon.aps.iva.zb0.a {
        public int b = -1;
        public boolean c;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b + 1 < j0.this.k.g()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final g0 next() {
            if (hasNext()) {
                this.c = true;
                com.amazon.aps.iva.x.i<g0> iVar = j0.this.k;
                int i = this.b + 1;
                this.b = i;
                g0 h = iVar.h(i);
                com.amazon.aps.iva.yb0.j.e(h, "nodes.valueAt(++index)");
                return h;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.c) {
                com.amazon.aps.iva.x.i<g0> iVar = j0.this.k;
                iVar.h(this.b).c = null;
                int i = this.b;
                Object[] objArr = iVar.d;
                Object obj = objArr[i];
                Object obj2 = com.amazon.aps.iva.x.i.f;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    iVar.b = true;
                }
                this.b = i - 1;
                this.c = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(r0<? extends j0> r0Var) {
        super(r0Var);
        com.amazon.aps.iva.yb0.j.f(r0Var, "navGraphNavigator");
        this.k = new com.amazon.aps.iva.x.i<>();
    }

    @Override // com.amazon.aps.iva.g8.g0
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof j0)) {
            com.amazon.aps.iva.x.i<g0> iVar = this.k;
            ArrayList g0 = com.amazon.aps.iva.ne0.s.g0(com.amazon.aps.iva.ne0.k.O(com.amazon.aps.iva.a60.b.y(iVar)));
            j0 j0Var = (j0) obj;
            com.amazon.aps.iva.x.i<g0> iVar2 = j0Var.k;
            com.amazon.aps.iva.x.j y = com.amazon.aps.iva.a60.b.y(iVar2);
            while (y.hasNext()) {
                g0.remove((g0) y.next());
            }
            if (super.equals(obj) && iVar.g() == iVar2.g() && this.l == j0Var.l && g0.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.g8.g0
    public final int hashCode() {
        int i = this.l;
        com.amazon.aps.iva.x.i<g0> iVar = this.k;
        int g = iVar.g();
        for (int i2 = 0; i2 < g; i2++) {
            i = (((i * 31) + iVar.e(i2)) * 31) + iVar.h(i2).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator<g0> iterator() {
        return new b();
    }

    @Override // com.amazon.aps.iva.g8.g0
    public final g0.b j(f0 f0Var) {
        g0.b j = super.j(f0Var);
        ArrayList arrayList = new ArrayList();
        b bVar = new b();
        while (bVar.hasNext()) {
            g0.b j2 = ((g0) bVar.next()).j(f0Var);
            if (j2 != null) {
                arrayList.add(j2);
            }
        }
        return (g0.b) com.amazon.aps.iva.lb0.x.F0(com.amazon.aps.iva.lb0.o.O(new g0.b[]{j, (g0.b) com.amazon.aps.iva.lb0.x.F0(arrayList)}));
    }

    public final g0 n(int i, boolean z) {
        j0 j0Var;
        g0 g0Var = (g0) this.k.d(i, null);
        if (g0Var == null) {
            if (!z || (j0Var = this.c) == null) {
                return null;
            }
            return j0Var.n(i, true);
        }
        return g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final g0 o(String str, boolean z) {
        j0 j0Var;
        ?? r1;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(str, "route");
        int hashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        com.amazon.aps.iva.x.i<g0> iVar = this.k;
        g0 g0Var = (g0) iVar.d(hashCode, null);
        boolean z3 = false;
        if (g0Var == null) {
            Iterator it = com.amazon.aps.iva.ne0.k.O(com.amazon.aps.iva.a60.b.y(iVar)).iterator();
            while (true) {
                if (it.hasNext()) {
                    r1 = it.next();
                    if (((g0) r1).k(str) != null) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    r1 = 0;
                    break;
                }
            }
            g0Var = r1;
        }
        if (g0Var == null) {
            if (!z || (j0Var = this.c) == null) {
                return null;
            }
            if (com.amazon.aps.iva.oe0.m.b0(str)) {
                z3 = true;
            }
            if (z3) {
                return null;
            }
            return j0Var.o(str, true);
        }
        return g0Var;
    }

    public final g0.b p(f0 f0Var) {
        return super.j(f0Var);
    }

    public final void q(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if (!com.amazon.aps.iva.yb0.j.a(str, this.i)) {
            if (!com.amazon.aps.iva.oe0.m.b0(str)) {
                hashCode = "android-app://androidx.navigation/".concat(str).hashCode();
            } else {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
        } else {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        }
        this.l = hashCode;
        this.n = str;
    }

    @Override // com.amazon.aps.iva.g8.g0
    public final String toString() {
        boolean z;
        g0 g0Var;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.n;
        if (str != null && !com.amazon.aps.iva.oe0.m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            g0Var = o(str, true);
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            g0Var = n(this.l, true);
        }
        sb.append(" startDestination=");
        if (g0Var == null) {
            String str2 = this.n;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.m;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.l));
                }
            }
        } else {
            sb.append("{");
            sb.append(g0Var.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "sb.toString()");
        return sb2;
    }
}
