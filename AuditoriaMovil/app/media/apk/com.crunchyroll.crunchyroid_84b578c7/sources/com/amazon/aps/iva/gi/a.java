package com.amazon.aps.iva.gi;

import android.view.View;
import com.amazon.aps.iva.gi.d;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ArtistCardOverflowMenuProvider.kt */
/* loaded from: classes.dex */
public final class a<T> implements com.amazon.aps.iva.n70.d<T> {
    public final l<T, com.amazon.aps.iva.gi.c> a;
    public final com.amazon.aps.iva.gn.b b;
    public final com.amazon.aps.iva.k50.d c;

    /* compiled from: ArtistCardOverflowMenuProvider.kt */
    /* renamed from: com.amazon.aps.iva.gi.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0306a extends com.amazon.aps.iva.yb0.l implements l<View, q> {
        public final /* synthetic */ a<T> h;
        public final /* synthetic */ com.amazon.aps.iva.gi.c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0306a(a<T> aVar, com.amazon.aps.iva.gi.c cVar) {
            super(1);
            this.h = aVar;
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            j.f(view, "it");
            this.h.c.C1(new com.amazon.aps.iva.l50.c((String) x.t0(this.i.c), t.MUSIC_VIDEO));
            return q.a;
        }
    }

    /* compiled from: ArtistCardOverflowMenuProvider.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements l<View, q> {
        public final /* synthetic */ a<T> h;
        public final /* synthetic */ com.amazon.aps.iva.gi.c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<T> aVar, com.amazon.aps.iva.gi.c cVar) {
            super(1);
            this.h = aVar;
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            j.f(view, "it");
            this.h.c.C1(new com.amazon.aps.iva.l50.c((String) x.t0(this.i.d), t.CONCERT));
            return q.a;
        }
    }

    /* compiled from: ArtistCardOverflowMenuProvider.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements l<View, q> {
        public final /* synthetic */ a<T> h;
        public final /* synthetic */ com.amazon.aps.iva.gi.c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a<T> aVar, com.amazon.aps.iva.gi.c cVar) {
            super(1);
            this.h = aVar;
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            j.f(view, "it");
            com.amazon.aps.iva.gn.b bVar = this.h.b;
            com.amazon.aps.iva.gi.c cVar = this.i;
            bVar.g3(cVar.a, cVar.b);
            return q.a;
        }
    }

    public a(com.amazon.aps.iva.ix.a aVar, com.amazon.aps.iva.gn.c cVar, com.amazon.aps.iva.ii.a aVar2) {
        j.f(aVar, "map");
        j.f(cVar, "shareComponent");
        this.a = aVar;
        this.b = cVar;
        this.c = aVar2;
    }

    @Override // com.amazon.aps.iva.n70.d
    public final List<com.amazon.aps.iva.n70.b> a(T t) {
        com.amazon.aps.iva.gi.c invoke = this.a.invoke(t);
        ArrayList arrayList = new ArrayList();
        if (!invoke.c.isEmpty()) {
            arrayList.add(new com.amazon.aps.iva.n70.b(d.b.e, new C0306a(this, invoke)));
        }
        if (!invoke.d.isEmpty()) {
            arrayList.add(new com.amazon.aps.iva.n70.b(d.a.e, new b(this, invoke)));
        }
        arrayList.add(new com.amazon.aps.iva.n70.b(d.c.e, new c(this, invoke)));
        return arrayList;
    }
}
