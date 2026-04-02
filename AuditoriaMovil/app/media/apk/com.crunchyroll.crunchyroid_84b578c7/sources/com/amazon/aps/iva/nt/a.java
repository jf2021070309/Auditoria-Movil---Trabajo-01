package com.amazon.aps.iva.nt;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.nt.o;
import com.amazon.aps.iva.xb0.q;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: CardOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.n70.d<Panel> {
    public final q<Panel, o, com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> a;
    public final com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> b;
    public final com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> c;
    public final com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> d;

    /* compiled from: CardOverflowMenuProvider.kt */
    /* renamed from: com.amazon.aps.iva.nt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0545a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WatchlistStatus.values().length];
            try {
                iArr[WatchlistStatus.IN_WATCHLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WatchlistStatus.NOT_IN_WATCHLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(q<? super Panel, ? super o, ? super com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> qVar, com.amazon.aps.iva.xb0.l<? super Panel, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<? super Panel, com.amazon.aps.iva.kb0.q> lVar2, com.amazon.aps.iva.xb0.l<? super Panel, com.amazon.aps.iva.kb0.q> lVar3) {
        com.amazon.aps.iva.yb0.j.f(qVar, "onToggleWatchlistItem");
        com.amazon.aps.iva.yb0.j.f(lVar, "onShare");
        com.amazon.aps.iva.yb0.j.f(lVar2, "onWatchNow");
        com.amazon.aps.iva.yb0.j.f(lVar3, "onMarkAsWatched");
        this.a = qVar;
        this.b = lVar;
        this.c = lVar2;
        this.d = lVar3;
    }

    @Override // com.amazon.aps.iva.n70.d
    public final List a(Panel panel) {
        o oVar;
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "data");
        int i = C0545a.a[panel2.getWatchlistStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oVar = o.a.e;
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
        } else {
            oVar = o.b.e;
        }
        return f1.K(new com.amazon.aps.iva.n70.b(oVar, new b(this, panel2, oVar)), new com.amazon.aps.iva.n70.b(n.e, new c(this, panel2)), new com.amazon.aps.iva.n70.b(m.e, new d(this, panel2)), new com.amazon.aps.iva.n70.b(f.e, new e(this, panel2)));
    }
}
