package com.amazon.aps.iva.r4;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import com.amazon.aps.iva.b5.c;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.y4.a;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: LayoutSelection.kt */
/* loaded from: classes.dex */
public final class y0 {
    public static final Map<c1, Integer> a = com.amazon.aps.iva.lb0.i0.U(new com.amazon.aps.iva.kb0.j(c1.Text, Integer.valueOf((int) R.layout.glance_text)), new com.amazon.aps.iva.kb0.j(c1.List, Integer.valueOf((int) R.layout.glance_list)), new com.amazon.aps.iva.kb0.j(c1.CheckBox, Integer.valueOf((int) R.layout.glance_check_box)), new com.amazon.aps.iva.kb0.j(c1.CheckBoxBackport, Integer.valueOf((int) R.layout.glance_check_box_backport)), new com.amazon.aps.iva.kb0.j(c1.Button, Integer.valueOf((int) R.layout.glance_button)), new com.amazon.aps.iva.kb0.j(c1.Swtch, Integer.valueOf((int) R.layout.glance_swtch)), new com.amazon.aps.iva.kb0.j(c1.SwtchBackport, Integer.valueOf((int) R.layout.glance_swtch_backport)), new com.amazon.aps.iva.kb0.j(c1.Frame, Integer.valueOf((int) R.layout.glance_frame)), new com.amazon.aps.iva.kb0.j(c1.ImageCrop, Integer.valueOf((int) R.layout.glance_image_crop)), new com.amazon.aps.iva.kb0.j(c1.ImageFit, Integer.valueOf((int) R.layout.glance_image_fit)), new com.amazon.aps.iva.kb0.j(c1.ImageFillBounds, Integer.valueOf((int) R.layout.glance_image_fill_bounds)), new com.amazon.aps.iva.kb0.j(c1.LinearProgressIndicator, Integer.valueOf((int) R.layout.glance_linear_progress_indicator)), new com.amazon.aps.iva.kb0.j(c1.CircularProgressIndicator, Integer.valueOf((int) R.layout.glance_circular_progress_indicator)), new com.amazon.aps.iva.kb0.j(c1.VerticalGridOneColumn, Integer.valueOf((int) R.layout.glance_vertical_grid_one_column)), new com.amazon.aps.iva.kb0.j(c1.VerticalGridTwoColumns, Integer.valueOf((int) R.layout.glance_vertical_grid_two_columns)), new com.amazon.aps.iva.kb0.j(c1.VerticalGridThreeColumns, Integer.valueOf((int) R.layout.glance_vertical_grid_three_columns)), new com.amazon.aps.iva.kb0.j(c1.VerticalGridFourColumns, Integer.valueOf((int) R.layout.glance_vertical_grid_four_columns)), new com.amazon.aps.iva.kb0.j(c1.VerticalGridFiveColumns, Integer.valueOf((int) R.layout.glance_vertical_grid_five_columns)), new com.amazon.aps.iva.kb0.j(c1.VerticalGridAutoFit, Integer.valueOf((int) R.layout.glance_vertical_grid_auto_fit)), new com.amazon.aps.iva.kb0.j(c1.RadioButton, Integer.valueOf((int) R.layout.glance_radio_button)), new com.amazon.aps.iva.kb0.j(c1.RadioButtonBackport, Integer.valueOf((int) R.layout.glance_radio_button_backport)));
    public static final int b;
    public static final int c;

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.y4.r, n.c, com.amazon.aps.iva.y4.r> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.amazon.aps.iva.p4.n$c, java.lang.Object, com.amazon.aps.iva.y4.r] */
        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.y4.r invoke(com.amazon.aps.iva.y4.r rVar, n.c cVar) {
            n.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "cur");
            if (cVar2 instanceof com.amazon.aps.iva.y4.r) {
                return cVar2;
            }
            return rVar;
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.y4.k, n.c, com.amazon.aps.iva.y4.k> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.amazon.aps.iva.y4.k, com.amazon.aps.iva.p4.n$c, java.lang.Object] */
        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.y4.k invoke(com.amazon.aps.iva.y4.k kVar, n.c cVar) {
            n.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "cur");
            if (cVar2 instanceof com.amazon.aps.iva.y4.k) {
                return cVar2;
            }
            return kVar;
        }
    }

    /* compiled from: LayoutSelection.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<n.c, Boolean> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(n.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "it");
            return Boolean.TRUE;
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.r4.a, n.c, com.amazon.aps.iva.r4.a> {
        public static final d h = new d();

        public d() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.amazon.aps.iva.p4.n$c, java.lang.Object, com.amazon.aps.iva.r4.a] */
        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.r4.a invoke(com.amazon.aps.iva.r4.a aVar, n.c cVar) {
            n.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "cur");
            if (cVar2 instanceof com.amazon.aps.iva.r4.a) {
                return cVar2;
            }
            return aVar;
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.y4.r, n.c, com.amazon.aps.iva.y4.r> {
        public static final e h = new e();

        public e() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.amazon.aps.iva.p4.n$c, java.lang.Object, com.amazon.aps.iva.y4.r] */
        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.y4.r invoke(com.amazon.aps.iva.y4.r rVar, n.c cVar) {
            n.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "cur");
            if (cVar2 instanceof com.amazon.aps.iva.y4.r) {
                return cVar2;
            }
            return rVar;
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.y4.k, n.c, com.amazon.aps.iva.y4.k> {
        public static final f h = new f();

        public f() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.amazon.aps.iva.y4.k, com.amazon.aps.iva.p4.n$c, java.lang.Object] */
        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.y4.k invoke(com.amazon.aps.iva.y4.k kVar, n.c cVar) {
            n.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "cur");
            if (cVar2 instanceof com.amazon.aps.iva.y4.k) {
                return cVar2;
            }
            return kVar;
        }
    }

    static {
        int i;
        int size = y.f.size();
        b = size;
        if (Build.VERSION.SDK_INT >= 31) {
            i = y.h;
        } else {
            i = y.h / size;
        }
        c = i;
    }

    public static final n0 a(RemoteViews remoteViews, a2 a2Var, c1 c1Var, int i, com.amazon.aps.iva.p4.n nVar, a.C0884a c0884a, a.b bVar) {
        Integer num;
        int intValue;
        com.amazon.aps.iva.yb0.j.f(remoteViews, "$this$insertContainerView");
        com.amazon.aps.iva.yb0.j.f(c1Var, "type");
        com.amazon.aps.iva.yb0.j.f(nVar, "modifier");
        Integer f2 = f(c1Var, nVar);
        if (f2 != null) {
            intValue = f2.intValue();
        } else {
            j jVar = y.a.get(new k(c1Var, i, c0884a, bVar));
            if (jVar != null) {
                num = Integer.valueOf(jVar.a);
            } else {
                num = null;
            }
            if (num != null) {
                intValue = num.intValue();
            } else {
                throw new IllegalArgumentException("Cannot find container " + c1Var + " with " + i + " children");
            }
        }
        Map<Integer, Map<x1, Integer>> map = y.b.get(c1Var);
        if (map != null) {
            n0 c2 = c(remoteViews, a2Var, intValue, nVar);
            n0 n0Var = new n0(c2.a, c2.b, map);
            if (Build.VERSION.SDK_INT >= 33) {
                remoteViews.removeAllViews(n0Var.a);
            }
            return n0Var;
        }
        throw new IllegalArgumentException("Cannot find generated children for " + c1Var);
    }

    public static final n0 b(RemoteViews remoteViews, a2 a2Var, c1 c1Var, com.amazon.aps.iva.p4.n nVar) {
        com.amazon.aps.iva.yb0.j.f(remoteViews, "<this>");
        com.amazon.aps.iva.yb0.j.f(a2Var, "translationContext");
        com.amazon.aps.iva.yb0.j.f(c1Var, "type");
        com.amazon.aps.iva.yb0.j.f(nVar, "modifier");
        Integer f2 = f(c1Var, nVar);
        if (f2 != null || (f2 = a.get(c1Var)) != null) {
            return c(remoteViews, a2Var, f2.intValue(), nVar);
        }
        throw new IllegalArgumentException("Cannot use `insertView` with a container like " + c1Var);
    }

    public static final n0 c(RemoteViews remoteViews, a2 a2Var, int i, com.amazon.aps.iva.p4.n nVar) {
        com.amazon.aps.iva.b5.c cVar;
        com.amazon.aps.iva.b5.c cVar2;
        Integer num;
        z0 z0Var;
        z0 z0Var2;
        int incrementAndGet;
        int i2 = a2Var.e;
        com.amazon.aps.iva.y4.r rVar = (com.amazon.aps.iva.y4.r) nVar.a(null, a.h);
        if (rVar == null || (cVar = rVar.b) == null) {
            cVar = c.e.a;
        }
        com.amazon.aps.iva.y4.k kVar = (com.amazon.aps.iva.y4.k) nVar.a(null, b.h);
        if (kVar == null || (cVar2 = kVar.b) == null) {
            cVar2 = c.e.a;
        }
        boolean z = true;
        if (nVar.b(c.h)) {
            num = null;
        } else if (!a2Var.i.getAndSet(true)) {
            num = 16908288;
        } else {
            throw new IllegalStateException("At most one view can be set as AppWidgetBackground.".toString());
        }
        int i3 = Build.VERSION.SDK_INT;
        Context context = a2Var.a;
        if (i3 >= 33) {
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = a2Var.g.incrementAndGet();
            }
            r0 r0Var = r0.a;
            String packageName = context.getPackageName();
            com.amazon.aps.iva.yb0.j.e(packageName, "translationContext.context.packageName");
            RemoteViews a2 = r0Var.a(packageName, i, incrementAndGet);
            int i4 = a2Var.h.a;
            com.amazon.aps.iva.yb0.j.f(remoteViews, "<this>");
            com.amazon.aps.iva.yb0.j.f(a2, "childView");
            if (i3 >= 31) {
                u1.a.a(remoteViews, i4, a2, i2);
            } else {
                remoteViews.addView(i4, a2);
            }
            return new n0(incrementAndGet, 0, null, 6);
        } else if (i3 >= 31) {
            c.b bVar = c.b.a;
            if (com.amazon.aps.iva.yb0.j.a(cVar, bVar)) {
                z0Var = z0.Expand;
            } else {
                z0Var = z0.Wrap;
            }
            if (com.amazon.aps.iva.yb0.j.a(cVar2, bVar)) {
                z0Var2 = z0.Expand;
            } else {
                z0Var2 = z0.Wrap;
            }
            return new n0(com.amazon.aps.iva.ff0.b.x(remoteViews, a2Var, e(remoteViews, a2Var, i2, z0Var, z0Var2), i, num), 0, null, 6);
        } else {
            z0 g = g(d(cVar, context));
            z0 g2 = g(d(cVar2, context));
            int e2 = e(remoteViews, a2Var, i2, g, g2);
            z0 z0Var3 = z0.Fixed;
            if (g != z0Var3 && g2 != z0Var3) {
                z = false;
            }
            if (z) {
                q0 q0Var = y.e.get(new x1(g, g2));
                if (q0Var != null) {
                    return new n0(com.amazon.aps.iva.ff0.b.x(remoteViews, a2Var, R.id.glanceViewStub, i, num), com.amazon.aps.iva.ff0.b.y(remoteViews, a2Var, e2, q0Var.a, 8), null, 4);
                }
                throw new IllegalArgumentException("Could not find complex layout for width=" + g + ", height=" + g2);
            }
            return new n0(com.amazon.aps.iva.ff0.b.x(remoteViews, a2Var, e2, i, num), 0, null, 6);
        }
    }

    public static final com.amazon.aps.iva.b5.c d(com.amazon.aps.iva.b5.c cVar, Context context) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(context, "context");
        if (!(cVar instanceof c.d)) {
            return cVar;
        }
        c.d dVar = (c.d) cVar;
        float dimension = context.getResources().getDimension(0);
        int i = (int) dimension;
        if (i != -2) {
            if (i != -1) {
                return new c.a(dimension / context.getResources().getDisplayMetrics().density);
            }
            return c.C0130c.a;
        }
        return c.e.a;
    }

    public static final int e(RemoteViews remoteViews, a2 a2Var, int i, z0 z0Var, z0 z0Var2) {
        z0 z0Var3;
        z0 z0Var4;
        boolean z;
        z0 z0Var5 = z0.Fixed;
        if (z0Var == z0Var5) {
            z0Var3 = z0.Wrap;
        } else {
            z0Var3 = z0Var;
        }
        if (z0Var2 == z0Var5) {
            z0Var4 = z0.Wrap;
        } else {
            z0Var4 = z0Var2;
        }
        x1 x1Var = new x1(z0Var3, z0Var4);
        Map<x1, Integer> map = a2Var.h.c.get(Integer.valueOf(i));
        if (map != null) {
            Integer num = map.get(x1Var);
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : map.values()) {
                    if (((Number) obj).intValue() != intValue) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.amazon.aps.iva.ff0.b.x(remoteViews, a2Var, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf((int) R.id.deletedViewId));
                }
                return intValue;
            }
            throw new IllegalStateException("No child for position " + i + " and size " + z0Var + " x " + z0Var2);
        }
        throw new IllegalStateException(com.amazon.aps.iva.q.c0.a("Parent doesn't have child position ", i));
    }

    public static final Integer f(c1 c1Var, com.amazon.aps.iva.p4.n nVar) {
        boolean z;
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        com.amazon.aps.iva.r4.a aVar = (com.amazon.aps.iva.r4.a) nVar.a(null, d.h);
        com.amazon.aps.iva.y4.r rVar = (com.amazon.aps.iva.y4.r) nVar.a(null, e.h);
        boolean z2 = false;
        if (rVar != null) {
            z = com.amazon.aps.iva.yb0.j.a(rVar.b, c.b.a);
        } else {
            z = false;
        }
        com.amazon.aps.iva.y4.k kVar = (com.amazon.aps.iva.y4.k) nVar.a(null, f.h);
        if (kVar != null) {
            z2 = com.amazon.aps.iva.yb0.j.a(kVar.b, c.b.a);
        }
        if (aVar != null) {
            Map<com.amazon.aps.iva.r4.e, q0> map = y.c;
            com.amazon.aps.iva.y4.a aVar2 = aVar.b;
            q0 q0Var = map.get(new com.amazon.aps.iva.r4.e(c1Var, aVar2.a, aVar2.b));
            if (q0Var != null) {
                return Integer.valueOf(q0Var.a);
            }
            throw new IllegalArgumentException("Cannot find " + c1Var + " with alignment " + aVar2);
        } else if (!z && !z2) {
            return null;
        } else {
            q0 q0Var2 = y.d.get(new v1(c1Var, z, z2));
            if (q0Var2 != null) {
                return Integer.valueOf(q0Var2.a);
            }
            throw new IllegalArgumentException("Cannot find " + c1Var + " with defaultWeight set");
        }
    }

    public static final z0 g(com.amazon.aps.iva.b5.c cVar) {
        boolean z;
        if (cVar instanceof c.e) {
            return z0.Wrap;
        }
        if (cVar instanceof c.b) {
            return z0.Expand;
        }
        if (cVar instanceof c.C0130c) {
            return z0.MatchParent;
        }
        if (cVar instanceof c.a) {
            z = true;
        } else {
            z = cVar instanceof c.d;
        }
        if (z) {
            return z0.Fixed;
        }
        throw new com.amazon.aps.iva.kb0.h();
    }
}
