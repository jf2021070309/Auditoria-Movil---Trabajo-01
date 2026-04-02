package com.amazon.aps.iva.g10;

import com.amazon.aps.iva.d10.i;
import com.amazon.aps.iva.d10.k;
import com.amazon.aps.iva.d10.p;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: EditDownloadsPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<g> implements d {
    public final com.amazon.aps.iva.uw.a b;
    public final com.amazon.aps.iva.g10.b c;
    public final k d;
    public final com.amazon.aps.iva.tv.a e;

    /* compiled from: EditDownloadsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            j.e(bool2, "isEditMode");
            boolean booleanValue = bool2.booleanValue();
            e eVar = e.this;
            if (booleanValue) {
                eVar.getView().z();
                eVar.getView().r8();
                eVar.getView().o3();
                eVar.getView().I7();
            } else {
                eVar.c.b0();
                eVar.getView().u();
                eVar.getView().r4();
                eVar.getView().X4();
                eVar.getView().ai();
            }
            return q.a;
        }
    }

    /* compiled from: EditDownloadsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends i>>, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends i>> gVar) {
            gVar.e(new f(e.this));
            return q.a;
        }
    }

    /* compiled from: EditDownloadsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public e(com.amazon.aps.iva.uw.a aVar, com.amazon.aps.iva.g10.b bVar, p pVar, com.amazon.aps.iva.tv.a aVar2, com.amazon.aps.iva.i10.a aVar3) {
        super(aVar3, pVar);
        this.b = aVar;
        this.c = bVar;
        this.d = pVar;
        this.e = aVar2;
    }

    @Override // com.amazon.aps.iva.g10.d
    public final void a5(i iVar) {
        j.f(iVar, "downloadPanel");
        q6(f1.J(iVar));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.a1().e(getView(), new c(new a()));
        this.c.r8().e(getView(), new c(new b()));
    }

    @Override // com.amazon.aps.iva.d10.g
    public final void q3(String str) {
        j.f(str, "downloadPanelId");
        this.c.I8(str);
    }

    public final void q6(List<i> list) {
        getView().u3(list.size());
        this.c.e5(list);
        this.d.p0(list);
        for (i iVar : list) {
            this.e.c(iVar, com.amazon.aps.iva.ls.a.DOWNLOADS);
        }
    }

    @Override // com.amazon.aps.iva.g10.d
    public final void r4() {
        boolean z;
        com.amazon.aps.iva.g10.b bVar = this.c;
        List<i> P4 = bVar.P4();
        if (!(P4 instanceof Collection) || !P4.isEmpty()) {
            for (i iVar : P4) {
                if (!iVar.d) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            bVar.b0();
        } else {
            bVar.I1();
        }
    }

    @Override // com.amazon.aps.iva.g10.d
    public final void w() {
        com.amazon.aps.iva.uw.a aVar = this.b;
        T d = aVar.a1().d();
        j.c(d);
        if (((Boolean) d).booleanValue()) {
            aVar.u();
        } else {
            aVar.z();
        }
    }

    @Override // com.amazon.aps.iva.g10.d
    public final void y2() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.c.P4()) {
            if (((i) obj).d) {
                arrayList.add(obj);
            }
        }
        q6(arrayList);
        this.b.u();
    }
}
