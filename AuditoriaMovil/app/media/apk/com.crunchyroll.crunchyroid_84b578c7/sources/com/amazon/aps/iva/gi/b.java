package com.amazon.aps.iva.gi;

import android.view.View;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.gi.d;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.zh.k;
import java.util.List;
/* compiled from: MusicCardOverflowMenuProvider.kt */
/* loaded from: classes.dex */
public final class b<T> implements com.amazon.aps.iva.n70.d<T> {
    public final l<T, f> a;
    public final com.amazon.aps.iva.gn.b b;

    /* compiled from: MusicCardOverflowMenuProvider.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements l<View, q> {
        public final /* synthetic */ b<T> h;
        public final /* synthetic */ f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, f fVar) {
            super(1);
            this.h = bVar;
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

    public b(k.c cVar, com.amazon.aps.iva.gn.c cVar2) {
        j.f(cVar, "map");
        j.f(cVar2, "shareComponent");
        this.a = cVar;
        this.b = cVar2;
    }

    @Override // com.amazon.aps.iva.n70.d
    public final List<com.amazon.aps.iva.n70.b> a(T t) {
        return f1.J(new com.amazon.aps.iva.n70.b(d.c.e, new a(this, this.a.invoke(t))));
    }
}
