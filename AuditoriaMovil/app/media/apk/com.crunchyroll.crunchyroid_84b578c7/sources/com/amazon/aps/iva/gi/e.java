package com.amazon.aps.iva.gi;

import android.view.View;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.gi.d;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: MusicCardOverflowMenuProvider.kt */
/* loaded from: classes.dex */
public final class e<T> implements com.amazon.aps.iva.n70.d<T> {
    public final l<T, f> a;
    public final com.amazon.aps.iva.gn.b b;
    public final com.amazon.aps.iva.k50.d c;

    /* compiled from: MusicCardOverflowMenuProvider.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements l<View, q> {
        public final /* synthetic */ e<T> h;
        public final /* synthetic */ f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e<T> eVar, f fVar) {
            super(1);
            this.h = eVar;
            this.i = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            j.f(view, "it");
            this.h.c.D1(new com.amazon.aps.iva.l50.a(this.i.b));
            return q.a;
        }
    }

    /* compiled from: MusicCardOverflowMenuProvider.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements l<View, q> {
        public final /* synthetic */ e<T> h;
        public final /* synthetic */ f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e<T> eVar, f fVar) {
            super(1);
            this.h = eVar;
            this.i = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            j.f(view, "it");
            com.amazon.aps.iva.gn.b bVar = this.h.b;
            f fVar = this.i;
            bVar.q0(fVar.a, fVar.d, fVar.c, fVar.e);
            return q.a;
        }
    }

    public e(l lVar, com.amazon.aps.iva.gn.c cVar, com.amazon.aps.iva.k50.d dVar) {
        j.f(lVar, "map");
        j.f(cVar, "shareComponent");
        this.a = lVar;
        this.b = cVar;
        this.c = dVar;
    }

    @Override // com.amazon.aps.iva.n70.d
    public final List<com.amazon.aps.iva.n70.b> a(T t) {
        f invoke = this.a.invoke(t);
        return f1.K(new com.amazon.aps.iva.n70.b(d.C0307d.e, new a(this, invoke)), new com.amazon.aps.iva.n70.b(d.c.e, new b(this, invoke)));
    }
}
