package com.amazon.aps.iva.ya0;

import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yb0.v;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ViewPump.kt */
/* loaded from: classes4.dex */
public final class e {
    public static e e;
    public static final c f = new c();
    public final ArrayList a;
    public final List<d> b;
    public final boolean c;
    public final boolean d;

    /* compiled from: ViewPump.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public final boolean b = true;
        public final boolean c = true;
    }

    /* compiled from: ViewPump.kt */
    /* loaded from: classes4.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<w> {
        public static final b h = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final w invoke() {
            return new w();
        }
    }

    /* compiled from: ViewPump.kt */
    /* loaded from: classes4.dex */
    public static final class c {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l[] a = {e0.c(new v(e0.a(c.class), "reflectiveFallbackViewCreator", "getReflectiveFallbackViewCreator()Lio/github/inflationx/viewpump/FallbackViewCreator;"))};

        public static e a() {
            e eVar = e.e;
            if (eVar == null) {
                a aVar = new a();
                e eVar2 = new e(x.X0(aVar.a), aVar.b, aVar.c);
                e.e = eVar2;
                return eVar2;
            }
            return eVar;
        }
    }

    static {
        com.amazon.aps.iva.kb0.f.b(b.h);
    }

    public e(List list, boolean z, boolean z2) {
        this.b = list;
        this.c = z;
        this.d = z2;
        this.a = x.Z0(x.M0(list, new com.amazon.aps.iva.za0.a()));
    }

    public final com.amazon.aps.iva.ya0.c a(com.amazon.aps.iva.ya0.b bVar) {
        ArrayList arrayList = this.a;
        j.g(arrayList, "interceptors");
        if (arrayList.size() > 0) {
            return ((d) arrayList.get(0)).a(new com.amazon.aps.iva.za0.b(arrayList, 1, bVar));
        }
        throw new AssertionError("no interceptors added to the chain");
    }
}
