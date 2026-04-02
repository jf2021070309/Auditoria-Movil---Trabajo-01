package com.amazon.aps.iva.g1;

import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.q1;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.c;
import com.amazon.aps.iva.q5.k;
import com.amazon.aps.iva.q5.l0;
import com.crunchyroll.sortandfilters.filters.empty.EmptyFilterResultLayout;
import com.ellation.crunchyroll.presentation.search.recent.RecentSearchesLayout;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements j, k.a, com.amazon.aps.iva.t5.g, p1.d, com.amazon.aps.iva.hb.g {
    public final /* synthetic */ int b;

    public /* synthetic */ f(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        ((e.a) obj).d();
    }

    @Override // com.amazon.aps.iva.b8.p1.d
    public final void d(v1 v1Var, q.e eVar) {
        q1.k(v1Var, eVar);
    }

    @Override // com.amazon.aps.iva.q5.k.a
    public final com.amazon.aps.iva.q5.k e(Bundle bundle) {
        c.a[] aVarArr;
        b0.e eVar;
        ImmutableList a;
        ImmutableList a2;
        b0.a aVar = null;
        b0 b0Var = null;
        switch (this.b) {
            case 1:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.amazon.aps.iva.q5.c.j);
                if (parcelableArrayList == null) {
                    aVarArr = new c.a[0];
                } else {
                    c.a[] aVarArr2 = new c.a[parcelableArrayList.size()];
                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                        aVarArr2[i] = (c.a) c.a.r.e((Bundle) parcelableArrayList.get(i));
                    }
                    aVarArr = aVarArr2;
                }
                return new com.amazon.aps.iva.q5.c(null, aVarArr, bundle.getLong(com.amazon.aps.iva.q5.c.k, 0L), bundle.getLong(com.amazon.aps.iva.q5.c.l, -9223372036854775807L), bundle.getInt(com.amazon.aps.iva.q5.c.m, 0));
            case 2:
                Bundle bundle2 = bundle.getBundle(b0.g.l);
                if (bundle2 == null) {
                    eVar = null;
                } else {
                    eVar = (b0.e) b0.e.r.e(bundle2);
                }
                Bundle bundle3 = bundle.getBundle(b0.g.m);
                if (bundle3 != null) {
                    aVar = (b0.a) b0.a.e.e(bundle3);
                }
                b0.a aVar2 = aVar;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(b0.g.n);
                if (parcelableArrayList2 == null) {
                    a = ImmutableList.of();
                } else {
                    a = com.amazon.aps.iva.t5.c.a(new com.amazon.aps.iva.q5.b(2), parcelableArrayList2);
                }
                ImmutableList immutableList = a;
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(b0.g.p);
                if (parcelableArrayList3 == null) {
                    a2 = ImmutableList.of();
                } else {
                    a2 = com.amazon.aps.iva.t5.c.a(b0.j.p, parcelableArrayList3);
                }
                Uri uri = (Uri) bundle.getParcelable(b0.g.j);
                uri.getClass();
                return new b0.g(uri, bundle.getString(b0.g.k), eVar, aVar2, immutableList, bundle.getString(b0.g.o), a2, null);
            case 3:
                int i2 = bundle.getInt(l0.d.k, 0);
                Bundle bundle4 = bundle.getBundle(l0.d.l);
                if (bundle4 != null) {
                    b0Var = (b0) b0.o.e(bundle4);
                }
                return new l0.d(null, i2, b0Var, null, bundle.getInt(l0.d.m, 0), bundle.getLong(l0.d.n, 0L), bundle.getLong(l0.d.o, 0L), bundle.getInt(l0.d.p, -1), bundle.getInt(l0.d.q, -1));
            default:
                Bundle bundle5 = bundle.getBundle(com.amazon.aps.iva.b8.l.f);
                boolean z = bundle.getBoolean(com.amazon.aps.iva.b8.l.g, false);
                boolean z2 = bundle.getBoolean(com.amazon.aps.iva.b8.l.h, false);
                boolean z3 = bundle.getBoolean(com.amazon.aps.iva.b8.l.i, false);
                if (bundle5 == null) {
                    bundle5 = Bundle.EMPTY;
                }
                return new com.amazon.aps.iva.b8.l(bundle5, z, z2, z3);
        }
    }

    @Override // com.amazon.aps.iva.g1.j
    public final double f(double d) {
        double d2;
        double d3;
        if (d < 0.0d) {
            d2 = -d;
        } else {
            d2 = d;
        }
        if (d2 >= 0.04045d) {
            d3 = Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d);
        } else {
            d3 = d2 * 0.07739938080495357d;
        }
        return Math.copySign(d3, d);
    }

    @Override // com.amazon.aps.iva.hb.g
    public final int g() {
        switch (this.b) {
            case 8:
                int i = EmptyFilterResultLayout.e;
                return 17;
            default:
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = RecentSearchesLayout.f;
                return 8388611;
        }
    }
}
