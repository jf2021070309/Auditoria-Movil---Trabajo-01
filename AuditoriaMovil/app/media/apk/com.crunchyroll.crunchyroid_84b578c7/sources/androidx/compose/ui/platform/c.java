package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.node.o;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.b0;
import com.amazon.aps.iva.a2.k;
import com.amazon.aps.iva.a2.l;
import com.amazon.aps.iva.a2.m;
import com.amazon.aps.iva.a2.r;
import com.amazon.aps.iva.a2.t;
import com.amazon.aps.iva.a2.v;
import com.amazon.aps.iva.c2.y;
import com.amazon.aps.iva.s1.q;
import com.amazon.aps.iva.v1.h2;
import com.amazon.aps.iva.v1.i2;
import com.amazon.aps.iva.v1.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
public final class c {
    public static final boolean a(r rVar) {
        if (m.a(rVar.h(), v.i) == null) {
            return true;
        }
        return false;
    }

    public static final float b(r rVar) {
        l h = rVar.h();
        b0<Float> b0Var = v.n;
        if (h.d(b0Var)) {
            return ((Number) rVar.h().e(b0Var)).floatValue();
        }
        return 0.0f;
    }

    public static final boolean c(r rVar) {
        return rVar.h().d(v.A);
    }

    public static final boolean d(r rVar) {
        if (rVar.c.t == com.amazon.aps.iva.o2.l.Rtl) {
            return true;
        }
        return false;
    }

    public static final String e(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "android.widget.Button";
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            z5 = true;
        }
        if (z5) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final h2 f(int i, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(arrayList, "<this>");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((h2) arrayList.get(i2)).b == i) {
                return (h2) arrayList.get(i2);
            }
        }
        return null;
    }

    public static final androidx.compose.ui.node.e g(androidx.compose.ui.node.e eVar, com.amazon.aps.iva.xb0.l<? super androidx.compose.ui.node.e, Boolean> lVar) {
        for (androidx.compose.ui.node.e v = eVar.v(); v != null; v = v.v()) {
            if (lVar.invoke(v).booleanValue()) {
                return v;
            }
        }
        return null;
    }

    public static final void h(Region region, r rVar, LinkedHashMap linkedHashMap, r rVar2) {
        boolean z;
        com.amazon.aps.iva.u1.h hVar;
        boolean z2;
        com.amazon.aps.iva.e1.e eVar;
        androidx.compose.ui.node.e eVar2;
        boolean G = rVar2.c.G();
        boolean z3 = false;
        androidx.compose.ui.node.e eVar3 = rVar2.c;
        if (G && eVar3.F()) {
            z = false;
        } else {
            z = true;
        }
        boolean isEmpty = region.isEmpty();
        int i = rVar.g;
        int i2 = rVar2.g;
        if (!isEmpty || i2 == i) {
            if (z && !rVar2.e) {
                return;
            }
            l lVar = rVar2.d;
            if (!lVar.c || (hVar = t.c(eVar3)) == null) {
                hVar = rVar2.a;
            }
            f.c V = hVar.V();
            if (m.a(lVar, k.b) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.amazon.aps.iva.yb0.j.f(V, "<this>");
            boolean z4 = V.b.n;
            com.amazon.aps.iva.e1.e eVar4 = com.amazon.aps.iva.e1.e.e;
            if (z4) {
                if (!z2) {
                    o d = com.amazon.aps.iva.u1.i.d(V, 8);
                    eVar4 = com.amazon.aps.iva.gd0.j.f(d).f(d, true);
                } else {
                    o d2 = com.amazon.aps.iva.u1.i.d(V, 8);
                    if (d2.l()) {
                        q f = com.amazon.aps.iva.gd0.j.f(d2);
                        com.amazon.aps.iva.e1.b bVar = d2.v;
                        if (bVar == null) {
                            bVar = new com.amazon.aps.iva.e1.b();
                            d2.v = bVar;
                        }
                        long g1 = d2.g1(d2.q1());
                        bVar.a = -com.amazon.aps.iva.e1.g.d(g1);
                        bVar.b = -com.amazon.aps.iva.e1.g.b(g1);
                        bVar.c = com.amazon.aps.iva.e1.g.d(g1) + d2.o0();
                        bVar.d = com.amazon.aps.iva.e1.g.b(g1) + d2.k0();
                        while (true) {
                            if (d2 != f) {
                                d2.F1(bVar, false, true);
                                if (bVar.b()) {
                                    break;
                                }
                                d2 = d2.k;
                                com.amazon.aps.iva.yb0.j.c(d2);
                            } else {
                                eVar4 = new com.amazon.aps.iva.e1.e(bVar.a, bVar.b, bVar.c, bVar.d);
                                break;
                            }
                        }
                    }
                }
            }
            Rect rect = new Rect(com.amazon.aps.iva.ob0.f.a(eVar4.a), com.amazon.aps.iva.ob0.f.a(eVar4.b), com.amazon.aps.iva.ob0.f.a(eVar4.c), com.amazon.aps.iva.ob0.f.a(eVar4.d));
            Region region2 = new Region();
            region2.set(rect);
            if (i2 == i) {
                i2 = -1;
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(i2);
                Rect bounds = region2.getBounds();
                com.amazon.aps.iva.yb0.j.e(bounds, "region.bounds");
                linkedHashMap.put(valueOf, new i2(rVar2, bounds));
                List<r> j = rVar2.j();
                for (int size = j.size() - 1; -1 < size; size--) {
                    h(region, rVar, linkedHashMap, j.get(size));
                }
                region.op(rect, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (rVar2.e) {
                r i3 = rVar2.i();
                if (i3 != null && (eVar2 = i3.c) != null && eVar2.G()) {
                    z3 = true;
                }
                if (z3) {
                    eVar = i3.e();
                } else {
                    eVar = new com.amazon.aps.iva.e1.e(0.0f, 0.0f, 10.0f, 10.0f);
                }
                linkedHashMap.put(Integer.valueOf(i2), new i2(rVar2, new Rect(com.amazon.aps.iva.ob0.f.a(eVar.a), com.amazon.aps.iva.ob0.f.a(eVar.b), com.amazon.aps.iva.ob0.f.a(eVar.c), com.amazon.aps.iva.ob0.f.a(eVar.d))));
            } else if (i2 == -1) {
                Integer valueOf2 = Integer.valueOf(i2);
                Rect bounds2 = region2.getBounds();
                com.amazon.aps.iva.yb0.j.e(bounds2, "region.bounds");
                linkedHashMap.put(valueOf2, new i2(rVar2, bounds2));
            }
        }
    }

    public static final boolean i(r rVar) {
        l lVar = rVar.d;
        b0<com.amazon.aps.iva.a2.a<com.amazon.aps.iva.xb0.l<List<y>, Boolean>>> b0Var = k.a;
        return lVar.d(k.h);
    }

    public static final com.amazon.aps.iva.p2.a j(x0 x0Var, int i) {
        Object obj;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(x0Var, "<this>");
        Set<Map.Entry<androidx.compose.ui.node.e, com.amazon.aps.iva.p2.a>> entrySet = x0Var.getLayoutNodeToHolder().entrySet();
        com.amazon.aps.iva.yb0.j.e(entrySet, "layoutNodeToHolder.entries");
        Iterator<T> it = entrySet.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((androidx.compose.ui.node.e) ((Map.Entry) obj).getKey()).c == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (com.amazon.aps.iva.p2.a) entry.getValue();
    }
}
