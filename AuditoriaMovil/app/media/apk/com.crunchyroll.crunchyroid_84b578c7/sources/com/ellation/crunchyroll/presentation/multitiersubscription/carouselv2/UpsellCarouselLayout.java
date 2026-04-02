package com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m20.f;
import com.amazon.aps.iva.m20.g;
import com.amazon.aps.iva.m20.h;
import com.amazon.aps.iva.o70.e;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
/* compiled from: UpsellCarouselLayout.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/carouselv2/UpsellCarouselLayout;", "Lcom/amazon/aps/iva/o70/a;", "Lcom/amazon/aps/iva/m20/h;", "Lkotlin/Function1;", "", "Lcom/amazon/aps/iva/kb0/q;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setItemSelectedListener", "position", "setCurrentItem", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UpsellCarouselLayout extends com.amazon.aps.iva.o70.a implements h {
    public final g c;

    /* compiled from: UpsellCarouselLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<e, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Integer, q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.l<? super Integer, q> lVar) {
            super(1);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(e eVar) {
            e eVar2 = eVar;
            j.f(eVar2, "$this$setListeners");
            eVar2.f4(new com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.a(this.h));
            return q.a;
        }
    }

    /* compiled from: UpsellCarouselLayout.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.l<Integer, q> {
        public b(g gVar) {
            super(1, gVar, f.class, "onItemClick", "onItemClick(I)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Integer num) {
            ((f) this.receiver).i4(num.intValue());
            return q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UpsellCarouselLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static final com.amazon.aps.iva.n20.a b1(UpsellCarouselLayout upsellCarouselLayout, int i) {
        View view;
        RecyclerView.f0 findViewHolderForAdapterPosition = upsellCarouselLayout.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition != null) {
            view = findViewHolderForAdapterPosition.itemView;
        } else {
            view = null;
        }
        if (!(view instanceof com.amazon.aps.iva.n20.a)) {
            return null;
        }
        return (com.amazon.aps.iva.n20.a) view;
    }

    public final void P(List<com.amazon.aps.iva.n20.f> list) {
        j.f(list, "tiers");
        setAdapter(new com.amazon.aps.iva.m20.j(list, new b(this.c)));
    }

    public void setCurrentItem(int i) {
        scrollToPosition(i);
    }

    public final void setItemSelectedListener(com.amazon.aps.iva.xb0.l<? super Integer, q> lVar) {
        j.f(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        setListeners(new a(lVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UpsellCarouselLayout(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            com.amazon.aps.iva.rv.e r0 = com.amazon.aps.iva.aq.k.n(r9)
            boolean r0 = r0.c()
            if (r0 == 0) goto L1b
            android.content.res.Resources r0 = r9.getResources()
            r1 = 2131166808(0x7f070658, float:1.7947872E38)
            int r0 = r0.getDimensionPixelSize(r1)
            goto L2d
        L1b:
            int r0 = com.amazon.aps.iva.xw.q.e(r9)
            android.content.res.Resources r1 = r9.getResources()
            r2 = 2131166805(0x7f070655, float:1.7947866E38)
            int r1 = r1.getDimensionPixelSize(r2)
            int r1 = r1 * 2
            int r0 = r0 - r1
        L2d:
            r5 = r0
            android.content.res.Resources r0 = r9.getResources()
            r1 = 2131166809(0x7f070659, float:1.7947874E38)
            int r6 = r0.getDimensionPixelSize(r1)
            r7 = 8
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.amazon.aps.iva.m20.g r10 = new com.amazon.aps.iva.m20.g
            r10.<init>(r8)
            r8.c = r10
            com.ellation.widgets.pagerrecycler.ScaleLayoutManager r10 = new com.ellation.widgets.pagerrecycler.ScaleLayoutManager
            r10.<init>(r9)
            r8.setLayoutManager(r10)
            boolean r9 = r8.isInEditMode()
            if (r9 != 0) goto L8d
            com.amazon.aps.iva.m20.k r9 = new com.amazon.aps.iva.m20.k
            r10 = 2131166841(0x7f070679, float:1.7947939E38)
            int r10 = com.amazon.aps.iva.xw.t0.a(r10, r8)
            com.amazon.aps.iva.m20.d r11 = com.amazon.aps.iva.m20.d.h
            r9.<init>(r8, r10, r11)
            com.amazon.aps.iva.m20.c r10 = new com.amazon.aps.iva.m20.c
            r10.<init>(r8)
            android.content.res.Resources r11 = r8.getResources()
            r0 = 2131099802(0x7f06009a, float:1.7811967E38)
            java.lang.String r11 = r11.getString(r0)
            android.content.res.Resources r0 = r8.getResources()
            r1 = 2131099809(0x7f0600a1, float:1.7811982E38)
            java.lang.String r0 = r0.getString(r1)
            com.amazon.aps.iva.m20.e r1 = new com.amazon.aps.iva.m20.e
            r1.<init>(r8, r11, r0)
            com.amazon.aps.iva.m20.b r11 = new com.amazon.aps.iva.m20.b
            r11.<init>(r10, r9, r1)
            r8.setListeners(r11)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.UpsellCarouselLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
