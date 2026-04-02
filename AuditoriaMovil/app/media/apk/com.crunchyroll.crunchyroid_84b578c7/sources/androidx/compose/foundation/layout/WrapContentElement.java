package androidx.compose.foundation.layout;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.d0.f2;
import com.amazon.aps.iva.d0.r;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.o2.h;
import com.amazon.aps.iva.o2.j;
import com.amazon.aps.iva.o2.l;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.p;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/f2;", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WrapContentElement extends f0<f2> {
    public final r c;
    public final boolean d;
    public final p<j, l, h> e;
    public final Object f;

    /* compiled from: Size.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: Size.kt */
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0013a extends com.amazon.aps.iva.yb0.l implements p<j, l, h> {
            public final /* synthetic */ a.c h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0013a(a.c cVar) {
                super(2);
                this.h = cVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final h invoke(j jVar, l lVar) {
                long j = jVar.a;
                com.amazon.aps.iva.yb0.j.f(lVar, "<anonymous parameter 1>");
                return new h(w.e(0, this.h.a(0, j.b(j))));
            }
        }

        /* compiled from: Size.kt */
        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements p<j, l, h> {
            public final /* synthetic */ com.amazon.aps.iva.a1.a h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.amazon.aps.iva.a1.a aVar) {
                super(2);
                this.h = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final h invoke(j jVar, l lVar) {
                long j = jVar.a;
                l lVar2 = lVar;
                com.amazon.aps.iva.yb0.j.f(lVar2, "layoutDirection");
                return new h(this.h.a(0L, j, lVar2));
            }
        }

        /* compiled from: Size.kt */
        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements p<j, l, h> {
            public final /* synthetic */ a.b h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a.b bVar) {
                super(2);
                this.h = bVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final h invoke(j jVar, l lVar) {
                long j = jVar.a;
                l lVar2 = lVar;
                com.amazon.aps.iva.yb0.j.f(lVar2, "layoutDirection");
                return new h(w.e(this.h.a(0, (int) (j >> 32), lVar2), 0));
            }
        }

        public static WrapContentElement a(a.c cVar, boolean z) {
            return new WrapContentElement(r.Vertical, z, new C0013a(cVar), cVar, "wrapContentHeight");
        }

        public static WrapContentElement b(com.amazon.aps.iva.a1.a aVar, boolean z) {
            return new WrapContentElement(r.Both, z, new b(aVar), aVar, "wrapContentSize");
        }

        public static WrapContentElement c(a.b bVar, boolean z) {
            return new WrapContentElement(r.Horizontal, z, new c(bVar), bVar, "wrapContentWidth");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(r rVar, boolean z, p<? super j, ? super l, h> pVar, Object obj, String str) {
        com.amazon.aps.iva.yb0.j.f(rVar, "direction");
        this.c = rVar;
        this.d = z;
        this.e = pVar;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(WrapContentElement.class, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.layout.WrapContentElement");
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        if (this.c == wrapContentElement.c && this.d == wrapContentElement.d && com.amazon.aps.iva.yb0.j.a(this.f, wrapContentElement.f)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.f.hashCode() + com.amazon.aps.iva.a0.r.b(this.d, this.c.hashCode() * 31, 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final f2 l() {
        return new f2(this.c, this.d, this.e);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(f2 f2Var) {
        f2 f2Var2 = f2Var;
        com.amazon.aps.iva.yb0.j.f(f2Var2, "node");
        r rVar = this.c;
        com.amazon.aps.iva.yb0.j.f(rVar, "<set-?>");
        f2Var2.o = rVar;
        f2Var2.p = this.d;
        p<j, l, h> pVar = this.e;
        com.amazon.aps.iva.yb0.j.f(pVar, "<set-?>");
        f2Var2.q = pVar;
    }
}
