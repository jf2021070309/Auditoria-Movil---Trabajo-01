package com.amazon.aps.iva.ok;

import com.amazon.aps.iva.nk.i;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.qj.h;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerTextTracksController.kt */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.ok.b {
    public final com.amazon.aps.iva.hk.b a;
    public final f b;
    public final g0<i> c;
    public final g0<j> d;
    public final com.amazon.aps.iva.ve0.f<j> e;

    /* compiled from: PlayerTextTracksController.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<i, i> {
        public final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(1);
            this.h = z;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final i invoke(i iVar) {
            i iVar2 = iVar;
            com.amazon.aps.iva.yb0.j.f(iVar2, "$this$set");
            return i.a(iVar2, false, null, this.h, 31);
        }
    }

    /* compiled from: PlayerTextTracksController.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<i, i> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final i invoke(i iVar) {
            i iVar2 = iVar;
            com.amazon.aps.iva.yb0.j.f(iVar2, "$this$set");
            return i.a(iVar2, false, this.h, false, 47);
        }
    }

    /* compiled from: PlayerTextTracksController.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<j, j> {
        public final /* synthetic */ h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar) {
            super(1);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final j invoke(j jVar) {
            j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            return j.a(jVar2, false, 0L, 0L, 0.0f, 0L, null, null, 0, null, null, null, null, null, this.h, null, null, false, null, null, 4128767);
        }
    }

    public e(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.gk.b bVar, f fVar, v0 v0Var, v0 v0Var2) {
        this.a = bVar;
        this.b = fVar;
        this.c = v0Var;
        this.d = v0Var2;
        com.amazon.aps.iva.ve0.f<j> n = com.amazon.aps.iva.dg.b.n(v0Var2, d.h);
        this.e = n;
        com.amazon.aps.iva.dg.b.A(g0Var, new a0(n, new com.amazon.aps.iva.ok.c(this, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.ok.b
    public final void a(boolean z) {
        a aVar = new a(z);
        g0<i> g0Var = this.c;
        com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
        g0Var.setValue(aVar.invoke(g0Var.getValue()));
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.ok.b
    public final void b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "languageTag");
        b bVar = new b(str);
        g0<i> g0Var = this.c;
        com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
        g0Var.setValue(bVar.invoke(g0Var.getValue()));
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if (r6 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
        if (r6 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0103, code lost:
        r8 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ok.e.c():void");
    }
}
