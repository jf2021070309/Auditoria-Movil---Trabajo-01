package com.amazon.aps.iva.jy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.iy.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SeriesCarouselItemDelegate.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.jy.a<a> {
    public final com.amazon.aps.iva.n70.d<Panel> a;
    public final com.amazon.aps.iva.qt.a b;
    public final int c;

    /* compiled from: SeriesCarouselItemDelegate.kt */
    /* loaded from: classes2.dex */
    public final class a extends g {

        /* compiled from: SeriesCarouselItemDelegate.kt */
        /* renamed from: com.amazon.aps.iva.jy.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0426a extends l implements p<i, Integer, q> {
            public final /* synthetic */ Panel h;
            public final /* synthetic */ e i;
            public final /* synthetic */ com.amazon.aps.iva.jt.a j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0426a(com.amazon.aps.iva.jt.a aVar, e eVar, Panel panel) {
                super(2);
                this.h = panel;
                this.i = eVar;
                this.j = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final q invoke(i iVar, Integer num) {
                i iVar2 = iVar;
                if ((num.intValue() & 11) == 2 && iVar2.h()) {
                    iVar2.A();
                } else {
                    e0.b bVar = e0.a;
                    Panel panel = this.h;
                    com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 230705211, new d(this.j, this.i, panel)), iVar2, 6);
                }
                return q.a;
            }
        }

        public a(ComposeView composeView) {
            super(composeView);
        }

        @Override // com.amazon.aps.iva.iy.g
        public final void U2(Panel panel, com.amazon.aps.iva.jt.a aVar) {
            b1(panel, aVar);
        }

        @Override // com.amazon.aps.iva.iy.g
        public final void b1(Panel panel, com.amazon.aps.iva.jt.a aVar) {
            View view = this.itemView;
            j.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
            ((ComposeView) view).setContent(com.amazon.aps.iva.v0.b.c(-909791922, new C0426a(aVar, e.this, panel), true));
        }
    }

    public e(com.amazon.aps.iva.n70.d dVar, com.amazon.aps.iva.qt.b bVar) {
        j.f(dVar, "overflowMenuProvider");
        this.a = dVar;
        this.b = bVar;
        this.c = 111;
    }

    @Override // com.amazon.aps.iva.jy.a
    public final int a() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.jy.a
    public final a b(ViewGroup viewGroup) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new a(new ComposeView(context, null, 6));
    }
}
