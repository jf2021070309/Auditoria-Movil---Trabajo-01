package com.amazon.aps.iva.da0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.o1;
import com.amazon.aps.iva.ee0.s0;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.ee0.y;
import com.amazon.aps.iva.j0.d1;
import com.amazon.aps.iva.lb0.c0;
import com.amazon.aps.iva.lb0.d0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.oc0.y0;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/* loaded from: classes4.dex */
public class a implements e, com.amazon.aps.iva.hb.k, com.amazon.aps.iva.hb.j, com.amazon.aps.iva.jb.f, com.amazon.aps.iva.kb.i {
    public static final com.amazon.aps.iva.ob0.d[] b = new com.amazon.aps.iva.ob0.d[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.amazon.aps.iva.ee0.u1] */
    public static final u1 A(e0 e0Var) {
        m0 m0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        u1 L0 = e0Var.L0();
        if (L0 instanceof y) {
            y yVar = (y) L0;
            m0 m0Var2 = yVar.c;
            if (!m0Var2.I0().getParameters().isEmpty() && m0Var2.I0().k() != null) {
                List<y0> parameters = m0Var2.I0().getParameters();
                com.amazon.aps.iva.yb0.j.e(parameters, "constructor.parameters");
                List<y0> list = parameters;
                ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
                for (y0 y0Var : list) {
                    arrayList.add(new s0(y0Var));
                }
                m0Var2 = o1.d(m0Var2, arrayList, null, 2);
            }
            m0 m0Var3 = yVar.d;
            if (!m0Var3.I0().getParameters().isEmpty() && m0Var3.I0().k() != null) {
                List<y0> parameters2 = m0Var3.I0().getParameters();
                com.amazon.aps.iva.yb0.j.e(parameters2, "constructor.parameters");
                List<y0> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                for (y0 y0Var2 : list2) {
                    arrayList2.add(new s0(y0Var2));
                }
                m0Var3 = o1.d(m0Var3, arrayList2, null, 2);
            }
            m0Var = f0.c(m0Var2, m0Var3);
        } else if (L0 instanceof m0) {
            m0 m0Var4 = (m0) L0;
            boolean isEmpty = m0Var4.I0().getParameters().isEmpty();
            m0Var = m0Var4;
            if (!isEmpty) {
                com.amazon.aps.iva.oc0.h k = m0Var4.I0().k();
                m0Var = m0Var4;
                if (k != null) {
                    List<y0> parameters3 = m0Var4.I0().getParameters();
                    com.amazon.aps.iva.yb0.j.e(parameters3, "constructor.parameters");
                    List<y0> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
                    for (y0 y0Var3 : list3) {
                        arrayList3.add(new s0(y0Var3));
                    }
                    m0Var = o1.d(m0Var4, arrayList3, null, 2);
                }
            }
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        return com.amazon.aps.iva.dg.b.w(m0Var, L0);
    }

    public static final l1 j(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        return new l1(e0Var);
    }

    public static final boolean k(e0 e0Var, c1 c1Var, Set set) {
        com.amazon.aps.iva.oc0.i iVar;
        List<y0> list;
        y0 y0Var;
        boolean z;
        boolean z2;
        if (com.amazon.aps.iva.yb0.j.a(e0Var.I0(), c1Var)) {
            return true;
        }
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k instanceof com.amazon.aps.iva.oc0.i) {
            iVar = (com.amazon.aps.iva.oc0.i) k;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            list = iVar.n();
        } else {
            list = null;
        }
        d0 d1 = x.d1(e0Var.G0());
        if (!(d1 instanceof Collection) || !((Collection) d1).isEmpty()) {
            Iterator it = d1.iterator();
            do {
                com.amazon.aps.iva.lb0.e0 e0Var2 = (com.amazon.aps.iva.lb0.e0) it;
                if (e0Var2.hasNext()) {
                    c0 c0Var = (c0) e0Var2.next();
                    int i = c0Var.a;
                    j1 j1Var = (j1) c0Var.b;
                    if (list != null) {
                        y0Var = (y0) x.w0(i, list);
                    } else {
                        y0Var = null;
                    }
                    if (y0Var != null && set != null && set.contains(y0Var)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !j1Var.b()) {
                        e0 type = j1Var.getType();
                        com.amazon.aps.iva.yb0.j.e(type, "argument.type");
                        z2 = k(type, c1Var, set);
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                }
            } while (!z2);
            return true;
        }
        return false;
    }

    public static final l1 l(e0 e0Var, v1 v1Var, y0 y0Var) {
        v1 v1Var2;
        com.amazon.aps.iva.yb0.j.f(e0Var, "type");
        com.amazon.aps.iva.yb0.j.f(v1Var, "projectionKind");
        if (y0Var != null) {
            v1Var2 = y0Var.i();
        } else {
            v1Var2 = null;
        }
        if (v1Var2 == v1Var) {
            v1Var = v1.INVARIANT;
        }
        return new l1(e0Var, v1Var);
    }

    public static final void m(e0 e0Var, m0 m0Var, LinkedHashSet linkedHashSet, Set set) {
        com.amazon.aps.iva.oc0.i iVar;
        List<y0> list;
        y0 y0Var;
        boolean z;
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k instanceof y0) {
            if (!com.amazon.aps.iva.yb0.j.a(e0Var.I0(), m0Var.I0())) {
                linkedHashSet.add(k);
                return;
            }
            for (e0 e0Var2 : ((y0) k).getUpperBounds()) {
                com.amazon.aps.iva.yb0.j.e(e0Var2, "upperBound");
                m(e0Var2, m0Var, linkedHashSet, set);
            }
            return;
        }
        com.amazon.aps.iva.oc0.h k2 = e0Var.I0().k();
        if (k2 instanceof com.amazon.aps.iva.oc0.i) {
            iVar = (com.amazon.aps.iva.oc0.i) k2;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            list = iVar.n();
        } else {
            list = null;
        }
        int i = 0;
        for (j1 j1Var : e0Var.G0()) {
            int i2 = i + 1;
            if (list != null) {
                y0Var = (y0) x.w0(i, list);
            } else {
                y0Var = null;
            }
            if (y0Var != null && set != null && set.contains(y0Var)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !j1Var.b() && !x.m0(linkedHashSet, j1Var.getType().I0().k()) && !com.amazon.aps.iva.yb0.j.a(j1Var.getType().I0(), m0Var.I0())) {
                e0 type = j1Var.getType();
                com.amazon.aps.iva.yb0.j.e(type, "argument.type");
                m(type, m0Var, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final com.amazon.aps.iva.lc0.k n(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        com.amazon.aps.iva.lc0.k j = e0Var.I0().j();
        com.amazon.aps.iva.yb0.j.e(j, "constructor.builtIns");
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final e0 o(y0 y0Var) {
        com.amazon.aps.iva.oc0.e eVar;
        boolean z;
        List<e0> upperBounds = y0Var.getUpperBounds();
        com.amazon.aps.iva.yb0.j.e(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<e0> upperBounds2 = y0Var.getUpperBounds();
        com.amazon.aps.iva.yb0.j.e(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            eVar = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            com.amazon.aps.iva.oc0.h k = ((e0) next).I0().k();
            if (k instanceof com.amazon.aps.iva.oc0.e) {
                eVar = (com.amazon.aps.iva.oc0.e) k;
            }
            if (eVar != null && eVar.getKind() != com.amazon.aps.iva.oc0.f.INTERFACE && eVar.getKind() != com.amazon.aps.iva.oc0.f.ANNOTATION_CLASS) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                eVar = next;
                break;
            }
        }
        e0 e0Var = (e0) eVar;
        if (e0Var == null) {
            List<e0> upperBounds3 = y0Var.getUpperBounds();
            com.amazon.aps.iva.yb0.j.e(upperBounds3, "upperBounds");
            Object t0 = x.t0(upperBounds3);
            com.amazon.aps.iva.yb0.j.e(t0, "upperBounds.first()");
            return (e0) t0;
        }
        return e0Var;
    }

    public static final String p(int i, com.amazon.aps.iva.o0.i iVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        iVar.s(-726638443);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.i(androidx.compose.ui.platform.d.a);
        Resources resources = ((Context) iVar.i(androidx.compose.ui.platform.d.b)).getResources();
        boolean z7 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = resources.getString(R.string.navigation_menu);
            com.amazon.aps.iva.yb0.j.e(str, "resources.getString(R.string.navigation_menu)");
        } else {
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str = resources.getString(R.string.close_drawer);
                com.amazon.aps.iva.yb0.j.e(str, "resources.getString(R.string.close_drawer)");
            } else {
                if (i == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    str = resources.getString(R.string.close_sheet);
                    com.amazon.aps.iva.yb0.j.e(str, "resources.getString(R.string.close_sheet)");
                } else {
                    if (i == 3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        str = resources.getString(R.string.default_error_message);
                        com.amazon.aps.iva.yb0.j.e(str, "resources.getString(R.st…ng.default_error_message)");
                    } else {
                        if (i == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            str = resources.getString(R.string.dropdown_menu);
                            com.amazon.aps.iva.yb0.j.e(str, "resources.getString(R.string.dropdown_menu)");
                        } else {
                            if (i == 5) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                str = resources.getString(R.string.range_start);
                                com.amazon.aps.iva.yb0.j.e(str, "resources.getString(R.string.range_start)");
                            } else {
                                if (i == 6) {
                                    z7 = true;
                                }
                                if (z7) {
                                    str = resources.getString(R.string.range_end);
                                    com.amazon.aps.iva.yb0.j.e(str, "resources.getString(R.string.range_end)");
                                } else {
                                    str = "";
                                }
                            }
                        }
                    }
                }
            }
        }
        iVar.G();
        return str;
    }

    public static final boolean q(y0 y0Var, c1 c1Var, Set set) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(y0Var, "typeParameter");
        List<com.amazon.aps.iva.ee0.e0> upperBounds = y0Var.getUpperBounds();
        com.amazon.aps.iva.yb0.j.e(upperBounds, "typeParameter.upperBounds");
        List<com.amazon.aps.iva.ee0.e0> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (com.amazon.aps.iva.ee0.e0 e0Var : list) {
            com.amazon.aps.iva.yb0.j.e(e0Var, "upperBound");
            if (k(e0Var, y0Var.m().I0(), set) && (c1Var == null || com.amazon.aps.iva.yb0.j.a(e0Var.I0(), c1Var))) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static final boolean r(com.amazon.aps.iva.ee0.e0 e0Var, com.amazon.aps.iva.ee0.e0 e0Var2) {
        com.amazon.aps.iva.yb0.j.f(e0Var2, "superType");
        return com.amazon.aps.iva.fe0.d.a.d(e0Var, e0Var2);
    }

    public static final u1 y(com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        return s1.j(e0Var, true);
    }

    public static final com.amazon.aps.iva.ee0.e0 z(com.amazon.aps.iva.ee0.e0 e0Var, com.amazon.aps.iva.pc0.h hVar) {
        if (e0Var.getAnnotations().isEmpty() && hVar.isEmpty()) {
            return e0Var;
        }
        return e0Var.L0().O0(k0.j(e0Var.H0(), hVar));
    }

    @Override // com.amazon.aps.iva.hb.j
    public void b(com.amazon.aps.iva.ib.a aVar, LinkedList linkedList) {
        int h = com.amazon.aps.iva.ab.a.h(aVar) / 2;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Rect rect = ((com.amazon.aps.iva.ib.n) it.next()).a;
            rect.left -= h;
            rect.right -= h;
        }
    }

    @Override // com.amazon.aps.iva.kb.i
    public boolean c(com.amazon.aps.iva.ib.a aVar) {
        if (aVar.e <= aVar.b()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.hb.k
    public com.amazon.aps.iva.hb.j e(int i) {
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return new com.amazon.aps.iva.o6.h(1);
                    }
                    return new com.amazon.aps.iva.hb.d(0);
                }
                return new com.amazon.aps.iva.hb.e(0);
            }
            return new com.amazon.aps.iva.u0.b(2);
        }
        return new d1();
    }

    @Override // com.amazon.aps.iva.da0.e
    public String getType() {
        return "BaseEvent";
    }

    @Override // com.amazon.aps.iva.jb.f
    public boolean h(com.amazon.aps.iva.ib.a aVar) {
        if (aVar.g - aVar.a < aVar.a() && aVar.g < aVar.d()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.da0.e
    public boolean s() {
        return this instanceof q;
    }

    @Override // com.amazon.aps.iva.da0.e
    public boolean t() {
        return false;
    }

    @Override // com.amazon.aps.iva.da0.e
    public boolean u() {
        return this instanceof h;
    }

    @Override // com.amazon.aps.iva.da0.e
    public boolean v() {
        return this instanceof s;
    }

    @Override // com.amazon.aps.iva.da0.e
    public boolean w() {
        return false;
    }

    @Override // com.amazon.aps.iva.da0.e
    public boolean x() {
        return this instanceof q;
    }
}
