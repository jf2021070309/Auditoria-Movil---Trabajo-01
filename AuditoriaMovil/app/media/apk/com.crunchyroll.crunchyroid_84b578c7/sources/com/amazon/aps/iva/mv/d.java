package com.amazon.aps.iva.mv;

import android.view.View;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mv.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: CrunchylistOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.n70.d<com.amazon.aps.iva.nv.e> {
    public final l<com.amazon.aps.iva.nv.e, q> a;
    public final l<com.amazon.aps.iva.nv.e, q> b;

    /* compiled from: CrunchylistOverflowMenuProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements l<View, q> {
        public final /* synthetic */ com.amazon.aps.iva.nv.e i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.nv.e eVar) {
            super(1);
            this.i = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            j.f(view, "it");
            d.this.a.invoke(this.i);
            return q.a;
        }
    }

    /* compiled from: CrunchylistOverflowMenuProvider.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements l<View, q> {
        public final /* synthetic */ com.amazon.aps.iva.nv.e i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.nv.e eVar) {
            super(1);
            this.i = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            j.f(view, "it");
            d.this.b.invoke(this.i);
            return q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super com.amazon.aps.iva.nv.e, q> lVar, l<? super com.amazon.aps.iva.nv.e, q> lVar2) {
        this.a = lVar;
        this.b = lVar2;
    }

    @Override // com.amazon.aps.iva.n70.d
    /* renamed from: b */
    public final List<com.amazon.aps.iva.n70.b> a(com.amazon.aps.iva.nv.e eVar) {
        j.f(eVar, "data");
        return f1.K(new com.amazon.aps.iva.n70.b(a.b.e, new a(eVar)), new com.amazon.aps.iva.n70.b(a.C0523a.e, new b(eVar)));
    }
}
