package com.amazon.aps.iva.a2;

import java.util.ArrayList;
import java.util.List;
/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class v {
    public static final b0<com.amazon.aps.iva.kb0.q> A;
    public static final b0<String> B;
    public static final b0<com.amazon.aps.iva.xb0.l<Object, Integer>> C;
    public static final b0<List<String>> a = new b0<>("ContentDescription", a.h);
    public static final b0<String> b;
    public static final b0<com.amazon.aps.iva.a2.h> c;
    public static final b0<String> d;
    public static final b0<com.amazon.aps.iva.kb0.q> e;
    public static final b0<com.amazon.aps.iva.a2.b> f;
    public static final b0<com.amazon.aps.iva.a2.c> g;
    public static final b0<com.amazon.aps.iva.kb0.q> h;
    public static final b0<com.amazon.aps.iva.kb0.q> i;
    public static final b0<com.amazon.aps.iva.a2.g> j;
    public static final b0<Boolean> k;
    public static final b0<Boolean> l;
    public static final b0<com.amazon.aps.iva.kb0.q> m;
    public static final b0<Float> n;
    public static final b0<j> o;
    public static final b0<j> p;
    public static final b0<com.amazon.aps.iva.kb0.q> q;
    public static final b0<com.amazon.aps.iva.kb0.q> r;
    public static final b0<com.amazon.aps.iva.a2.i> s;
    public static final b0<String> t;
    public static final b0<List<com.amazon.aps.iva.c2.b>> u;
    public static final b0<com.amazon.aps.iva.c2.b> v;
    public static final b0<com.amazon.aps.iva.c2.z> w;
    public static final b0<com.amazon.aps.iva.i2.k> x;
    public static final b0<Boolean> y;
    public static final b0<com.amazon.aps.iva.b2.a> z;

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<List<? extends String>, List<? extends String>, List<? extends String>> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            com.amazon.aps.iva.yb0.j.f(list4, "childValue");
            if (list3 != null) {
                ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(list3);
                Z0.addAll(list4);
                return Z0;
            }
            return list4;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar, com.amazon.aps.iva.kb0.q qVar2) {
            com.amazon.aps.iva.kb0.q qVar3 = qVar;
            com.amazon.aps.iva.yb0.j.f(qVar2, "<anonymous parameter 1>");
            return qVar3;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar, com.amazon.aps.iva.kb0.q qVar2) {
            com.amazon.aps.iva.yb0.j.f(qVar2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar, com.amazon.aps.iva.kb0.q qVar2) {
            com.amazon.aps.iva.yb0.j.f(qVar2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<String, String, String> {
        public static final e h = new e();

        public e() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final String invoke(String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(str2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.a2.i, com.amazon.aps.iva.a2.i, com.amazon.aps.iva.a2.i> {
        public static final f h = new f();

        public f() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.a2.i invoke(com.amazon.aps.iva.a2.i iVar, com.amazon.aps.iva.a2.i iVar2) {
            com.amazon.aps.iva.a2.i iVar3 = iVar;
            int i = iVar2.a;
            return iVar3;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<String, String, String> {
        public static final g h = new g();

        public g() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final String invoke(String str, String str2) {
            String str3 = str;
            com.amazon.aps.iva.yb0.j.f(str2, "<anonymous parameter 1>");
            return str3;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<List<? extends com.amazon.aps.iva.c2.b>, List<? extends com.amazon.aps.iva.c2.b>, List<? extends com.amazon.aps.iva.c2.b>> {
        public static final h h = new h();

        public h() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final List<? extends com.amazon.aps.iva.c2.b> invoke(List<? extends com.amazon.aps.iva.c2.b> list, List<? extends com.amazon.aps.iva.c2.b> list2) {
            List<? extends com.amazon.aps.iva.c2.b> list3 = list;
            List<? extends com.amazon.aps.iva.c2.b> list4 = list2;
            com.amazon.aps.iva.yb0.j.f(list4, "childValue");
            if (list3 != null) {
                ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(list3);
                Z0.addAll(list4);
                return Z0;
            }
            return list4;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Float, Float, Float> {
        public static final i h = new i();

        public i() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Float invoke(Float f, Float f2) {
            Float f3 = f;
            f2.floatValue();
            return f3;
        }
    }

    static {
        a0 a0Var = a0.h;
        b = new b0<>("StateDescription", a0Var);
        c = new b0<>("ProgressBarRangeInfo", a0Var);
        d = new b0<>("PaneTitle", e.h);
        e = new b0<>("SelectableGroup", a0Var);
        f = new b0<>("CollectionInfo", a0Var);
        g = new b0<>("CollectionItemInfo", a0Var);
        h = new b0<>("Heading", a0Var);
        i = new b0<>("Disabled", a0Var);
        j = new b0<>("LiveRegion", a0Var);
        k = new b0<>("Focused", a0Var);
        l = new b0<>("IsTraversalGroup", a0Var);
        m = new b0<>("InvisibleToUser", b.h);
        n = new b0<>("TraversalIndex", i.h);
        o = new b0<>("HorizontalScrollAxisRange", a0Var);
        p = new b0<>("VerticalScrollAxisRange", a0Var);
        q = new b0<>("IsPopup", d.h);
        r = new b0<>("IsDialog", c.h);
        s = new b0<>("Role", f.h);
        t = new b0<>("TestTag", g.h);
        u = new b0<>("Text", h.h);
        v = new b0<>("EditableText", a0Var);
        w = new b0<>("TextSelectionRange", a0Var);
        x = new b0<>("ImeAction", a0Var);
        y = new b0<>("Selected", a0Var);
        z = new b0<>("ToggleableState", a0Var);
        A = new b0<>("Password", a0Var);
        B = new b0<>("Error", a0Var);
        C = new b0<>("IndexForKey", a0Var);
    }
}
