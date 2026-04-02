package com.amazon.aps.iva.p2;

import android.view.View;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x0.i;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: AndroidView.android.kt */
/* loaded from: classes.dex */
public final class g<T extends View> extends com.amazon.aps.iva.p2.a {
    public l<? super T, q> A;
    public l<? super T, q> B;
    public l<? super T, q> C;
    public final T w;
    public final com.amazon.aps.iva.o1.b x;
    public final i y;
    public i.a z;

    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ g<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g<T> gVar) {
            super(0);
            this.h = gVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            g<T> gVar = this.h;
            gVar.getReleaseBlock().invoke(gVar.w);
            g.d(gVar);
            return q.a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ g<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g<T> gVar) {
            super(0);
            this.h = gVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            g<T> gVar = this.h;
            gVar.getResetBlock().invoke(gVar.w);
            return q.a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ g<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g<T> gVar) {
            super(0);
            this.h = gVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            g<T> gVar = this.h;
            gVar.getUpdateBlock().invoke(gVar.w);
            return q.a;
        }
    }

    public g() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.content.Context r8, com.amazon.aps.iva.xb0.l<? super android.content.Context, ? extends T> r9, com.amazon.aps.iva.o0.g0 r10, com.amazon.aps.iva.x0.i r11, int r12) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            java.lang.String r0 = "factory"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            java.lang.Object r9 = r9.invoke(r8)
            android.view.View r9 = (android.view.View) r9
            com.amazon.aps.iva.o1.b r6 = new com.amazon.aps.iva.o1.b
            r6.<init>()
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            r4 = r6
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r7.w = r9
            r7.x = r6
            r7.y = r11
            r8 = 0
            r7.setClipChildren(r8)
            java.lang.String r8 = java.lang.String.valueOf(r12)
            r10 = 0
            if (r11 == 0) goto L34
            java.lang.Object r12 = r11.e(r8)
            goto L35
        L34:
            r12 = r10
        L35:
            boolean r0 = r12 instanceof android.util.SparseArray
            if (r0 == 0) goto L3c
            r10 = r12
            android.util.SparseArray r10 = (android.util.SparseArray) r10
        L3c:
            if (r10 == 0) goto L41
            r9.restoreHierarchyState(r10)
        L41:
            if (r11 == 0) goto L4f
            com.amazon.aps.iva.p2.f r9 = new com.amazon.aps.iva.p2.f
            r9.<init>(r7)
            com.amazon.aps.iva.x0.i$a r8 = r11.b(r8, r9)
            r7.setSavableRegistryEntry(r8)
        L4f:
            com.amazon.aps.iva.p2.d$j r8 = com.amazon.aps.iva.p2.d.a
            r7.A = r8
            r7.B = r8
            r7.C = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p2.g.<init>(android.content.Context, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.o0.g0, com.amazon.aps.iva.x0.i, int):void");
    }

    public static final void d(g gVar) {
        gVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(i.a aVar) {
        i.a aVar2 = this.z;
        if (aVar2 != null) {
            aVar2.unregister();
        }
        this.z = aVar;
    }

    public final com.amazon.aps.iva.o1.b getDispatcher() {
        return this.x;
    }

    public final l<T, q> getReleaseBlock() {
        return (l<? super T, q>) this.C;
    }

    public final l<T, q> getResetBlock() {
        return (l<? super T, q>) this.B;
    }

    public /* bridge */ /* synthetic */ com.amazon.aps.iva.v1.a getSubCompositionView() {
        return null;
    }

    public final l<T, q> getUpdateBlock() {
        return (l<? super T, q>) this.A;
    }

    public final void setReleaseBlock(l<? super T, q> lVar) {
        j.f(lVar, "value");
        this.C = lVar;
        setRelease(new a(this));
    }

    public final void setResetBlock(l<? super T, q> lVar) {
        j.f(lVar, "value");
        this.B = lVar;
        setReset(new b(this));
    }

    public final void setUpdateBlock(l<? super T, q> lVar) {
        j.f(lVar, "value");
        this.A = lVar;
        setUpdate(new c(this));
    }

    public View getViewRoot() {
        return this;
    }
}
