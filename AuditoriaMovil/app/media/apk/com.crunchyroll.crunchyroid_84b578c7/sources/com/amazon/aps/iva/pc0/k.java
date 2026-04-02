package com.amazon.aps.iva.pc0;

import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.ne0.f;
import com.amazon.aps.iva.ne0.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: Annotations.kt */
/* loaded from: classes4.dex */
public final class k implements h {
    public final List<h> b;

    /* compiled from: Annotations.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<h, c> {
        public final /* synthetic */ com.amazon.aps.iva.nd0.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.nd0.c cVar) {
            super(1);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final c invoke(h hVar) {
            h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "it");
            return hVar2.h(this.h);
        }
    }

    /* compiled from: Annotations.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<h, com.amazon.aps.iva.ne0.h<? extends c>> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ne0.h<? extends c> invoke(h hVar) {
            h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "it");
            return x.k0(hVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(List<? extends h> list) {
        this.b = list;
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final boolean A(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        Iterator<Object> it = x.k0(this.b).iterator();
        while (it.hasNext()) {
            if (((h) it.next()).A(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final c h(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        return (c) s.X(s.c0(x.k0(this.b), new a(cVar)));
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final boolean isEmpty() {
        List<h> list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (h hVar : list) {
            if (!hVar.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        return new f.a(s.Y(x.k0(this.b), b.h));
    }

    public k(h... hVarArr) {
        this.b = o.b0(hVarArr);
    }
}
