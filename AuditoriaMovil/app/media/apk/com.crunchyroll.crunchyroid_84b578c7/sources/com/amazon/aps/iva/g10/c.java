package com.amazon.aps.iva.g10;

import com.amazon.aps.iva.d10.i;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: DownloadsViewModel.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.ez.b implements com.amazon.aps.iva.g10.b {
    public final List<String> b;
    public final v<com.amazon.aps.iva.ez.g<List<i>>> c;

    /* compiled from: DownloadsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<i, i> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final i invoke(i iVar) {
            i iVar2 = iVar;
            j.f(iVar2, "it");
            return i.a(iVar2, false);
        }
    }

    /* compiled from: DownloadsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<String, Boolean> {
        public final /* synthetic */ List<i> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<i> list) {
            super(1);
            this.h = list;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            List<i> list = this.h;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (i iVar : list) {
                    if (j.a(iVar.b(), str2)) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: DownloadsViewModel.kt */
    /* renamed from: com.amazon.aps.iva.g10.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0286c extends l implements com.amazon.aps.iva.xb0.l<i, i> {
        public static final C0286c h = new C0286c();

        public C0286c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final i invoke(i iVar) {
            i iVar2 = iVar;
            j.f(iVar2, "it");
            return i.a(iVar2, true);
        }
    }

    /* compiled from: DownloadsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<i, i> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final i invoke(i iVar) {
            i iVar2 = iVar;
            j.f(iVar2, "panel");
            if (j.a(iVar2.b(), this.h)) {
                return i.a(iVar2, !iVar2.d);
            }
            return iVar2;
        }
    }

    public c() {
        super(new com.amazon.aps.iva.wy.j[0]);
        this.b = Collections.synchronizedList(new ArrayList());
        this.c = new v<>(new g.b(z.b));
    }

    @Override // com.amazon.aps.iva.g10.b
    public final void I1() {
        N8(C0286c.h);
    }

    @Override // com.amazon.aps.iva.g10.b
    public final void I8(String str) {
        j.f(str, "itemId");
        N8(new d(str));
    }

    public final void N8(com.amazon.aps.iva.xb0.l<? super i, i> lVar) {
        if (!P4().isEmpty()) {
            v<com.amazon.aps.iva.ez.g<List<i>>> vVar = this.c;
            List<i> P4 = P4();
            ArrayList arrayList = new ArrayList(r.Y(P4));
            for (i iVar : P4) {
                arrayList.add(lVar.invoke(iVar));
            }
            vVar.i(new g.c(arrayList, null));
        }
    }

    @Override // com.amazon.aps.iva.g10.b
    public final List<i> P4() {
        g.c<List<i>> a2;
        List<i> list;
        com.amazon.aps.iva.ez.g<List<i>> d2 = this.c.d();
        if (d2 == null || (a2 = d2.a()) == null || (list = a2.a) == null) {
            return z.b;
        }
        return list;
    }

    @Override // com.amazon.aps.iva.g10.b
    public final void U0(List<i> list) {
        boolean z;
        g.c<List<i>> a2;
        List<i> list2;
        j.f(list, "downloads");
        List<String> list3 = this.b;
        j.e(list3, "softRemovedPanelIds");
        t.h0(list3, new b(list));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!list3.contains(((i) obj).b())) {
                arrayList.add(obj);
            }
        }
        v<com.amazon.aps.iva.ez.g<List<i>>> vVar = this.c;
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj2 = null;
            if (it.hasNext()) {
                i iVar = (i) it.next();
                com.amazon.aps.iva.ez.g<List<i>> d2 = vVar.d();
                if (d2 != null && (a2 = d2.a()) != null && (list2 = a2.a) != null) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (j.a(((i) next).b(), iVar.b())) {
                            obj2 = next;
                            break;
                        }
                    }
                    i iVar2 = (i) obj2;
                    if (iVar2 != null) {
                        z = iVar2.d;
                        arrayList2.add(i.a(iVar, z));
                    }
                }
                z = false;
                arrayList2.add(i.a(iVar, z));
            } else {
                vVar.i(new g.c(arrayList2, null));
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if ((!r0.isEmpty()) == true) goto L9;
     */
    @Override // com.amazon.aps.iva.g10.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0() {
        /*
            r2 = this;
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<java.util.List<com.amazon.aps.iva.d10.i>>> r0 = r2.c
            java.lang.Object r0 = r0.d()
            com.amazon.aps.iva.ez.g r0 = (com.amazon.aps.iva.ez.g) r0
            if (r0 == 0) goto L21
            com.amazon.aps.iva.ez.g$c r0 = r0.a()
            if (r0 == 0) goto L21
            T r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L21
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L29
            com.amazon.aps.iva.g10.c$a r0 = com.amazon.aps.iva.g10.c.a.h
            r2.N8(r0)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g10.c.b0():void");
    }

    @Override // com.amazon.aps.iva.g10.b
    public final void e5(List<i> list) {
        List<i> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (i iVar : list2) {
            arrayList.add(iVar.b());
        }
        List<String> list3 = this.b;
        list3.addAll(arrayList);
        v<com.amazon.aps.iva.ez.g<List<i>>> vVar = this.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : P4()) {
            if (!list3.contains(((i) obj).b())) {
                arrayList2.add(obj);
            }
        }
        vVar.k(new g.c(arrayList2, null));
    }

    @Override // com.amazon.aps.iva.g10.b
    public final v r8() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.g10.b
    public final void y0(i iVar) {
        j.f(iVar, "panel");
        Iterator<i> it = P4().iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (j.a(it.next().b(), iVar.b())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0 && i <= f1.B(P4())) {
            z = true;
        }
        if (z) {
            ArrayList Z0 = x.Z0(P4());
            for (i iVar2 : P4()) {
                if (j.a(iVar2.b(), iVar.b())) {
                    Z0.set(i, i.a(iVar, iVar2.d));
                    this.c.i(new g.c(Z0, null));
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
