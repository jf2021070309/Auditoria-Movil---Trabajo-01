package com.amazon.aps.iva.d60;

import androidx.compose.foundation.layout.e;
import com.amazon.aps.iva.a0.p0;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
/* compiled from: WatchlistBadge.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: WatchlistBadge.kt */
    /* renamed from: com.amazon.aps.iva.d60.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0193a extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final C0193a h = new C0193a();

        public C0193a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "in_watchlist");
            return q.a;
        }
    }

    /* compiled from: WatchlistBadge.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<i, Integer, q> {
        public final /* synthetic */ WatchlistStatus h;
        public final /* synthetic */ f i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WatchlistStatus watchlistStatus, f fVar, int i, int i2) {
            super(2);
            this.h = watchlistStatus;
            this.i = fVar;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            a.a(this.h, this.i, iVar, I, this.k);
            return q.a;
        }
    }

    public static final void a(WatchlistStatus watchlistStatus, f fVar, i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        j.f(watchlistStatus, "watchlistStatus");
        com.amazon.aps.iva.o0.j g = iVar.g(1912663624);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(watchlistStatus)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.H(fVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && g.h()) {
            g.A();
        } else {
            if (i6 != 0) {
                fVar = f.a.c;
            }
            e0.b bVar = e0.a;
            if (watchlistStatus == WatchlistStatus.IN_WATCHLIST) {
                float f = 28;
                p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_bookmark_corner, g), null, o.a(e.f(e.l(fVar, f), f), false, C0193a.h), null, null, 0.0f, null, g, 56, 120);
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(watchlistStatus, fVar, i, i2);
        }
    }
}
