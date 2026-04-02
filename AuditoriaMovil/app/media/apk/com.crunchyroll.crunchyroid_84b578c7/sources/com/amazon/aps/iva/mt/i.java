package com.amazon.aps.iva.mt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.p1;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e0.g0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.w1;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.o0.y1;
import java.util.List;
/* compiled from: ContinueWatchingCarousel.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.v1.a {
    public final com.amazon.aps.iva.n70.d<com.amazon.aps.iva.yx.g> j;
    public final com.amazon.aps.iva.mt.a k;
    public final y1 l;
    public final w1 m;
    public final y1 n;

    /* compiled from: ContinueWatchingCarousel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, q> {
        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            int i;
            int i2;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                boolean c = com.amazon.aps.iva.aq.k.n((Context) iVar2.i(androidx.compose.ui.platform.d.b)).c();
                g0 z = defpackage.i.z(iVar2);
                com.amazon.aps.iva.fs.b p = r.p((View) iVar2.i(androidx.compose.ui.platform.d.f), null);
                if (c) {
                    i = 24;
                } else {
                    i = 16;
                }
                float f = i;
                p1 a = androidx.compose.foundation.layout.d.a(f, 2);
                a.i iVar3 = com.amazon.aps.iva.d0.a.a;
                if (c) {
                    i2 = 12;
                } else {
                    i2 = 8;
                }
                a.h g = com.amazon.aps.iva.d0.a.g(i2);
                i iVar4 = i.this;
                com.amazon.aps.iva.e0.b.b(null, z, a, false, g, null, null, false, new f(iVar4, f, p), iVar2, 0, 233);
                x0.c(iVar4.getScrollPosition(), new g(z, iVar4, null), iVar2);
                x0.c(z, new h(z, iVar4, null), iVar2);
            }
            return q.a;
        }
    }

    /* compiled from: ContinueWatchingCarousel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(2);
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            i.this.a(iVar, I);
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, com.amazon.aps.iva.n70.d dVar, com.amazon.aps.iva.mt.b bVar) {
        super(context, null, 6, 0);
        com.amazon.aps.iva.yb0.j.f(dVar, "overflowMenuProvider");
        this.j = dVar;
        this.k = bVar;
        this.l = com.amazon.aps.iva.cq.b.c0(z.b);
        this.m = w.J(0);
        this.n = com.amazon.aps.iva.cq.b.c0(new k(0, false));
        setLayoutParams(new RecyclerView.q(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k getScrollPosition() {
        return (k) this.n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScrollPosition(k kVar) {
        this.n.setValue(kVar);
    }

    @Override // com.amazon.aps.iva.v1.a
    public final void a(com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.o0.j g = iVar.g(-1277972350);
        e0.b bVar = e0.a;
        com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(g, -1802109265, new a()), g, 6);
        j2 X = g.X();
        if (X != null) {
            X.d = new b(i);
        }
    }

    public final List<com.amazon.aps.iva.yx.g> getItems$home_feed_release() {
        return (List) this.l.getValue();
    }

    public final int getPositionOfFeed$home_feed_release() {
        return this.m.t();
    }

    public final void l(int i) {
        setScrollPosition(new k(0, true));
    }

    public final void setItems$home_feed_release(List<com.amazon.aps.iva.yx.g> list) {
        com.amazon.aps.iva.yb0.j.f(list, "<set-?>");
        this.l.setValue(list);
    }

    public final void setPositionOfFeed$home_feed_release(int i) {
        this.m.e(i);
    }
}
