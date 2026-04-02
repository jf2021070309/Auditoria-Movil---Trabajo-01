package com.amazon.aps.iva.ws;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.js.t;
import com.amazon.aps.iva.js.v;
import com.amazon.aps.iva.ks.n;
import com.amazon.aps.iva.mn.m;
import com.amazon.aps.iva.tz.k0;
import com.amazon.aps.iva.tz.q0;
import com.amazon.aps.iva.ws.c;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
/* compiled from: SubgenrePanelAnalyticsDataFactory.kt */
/* loaded from: classes2.dex */
public final class g implements b {
    public final com.amazon.aps.iva.l10.a a;
    public final com.amazon.aps.iva.l10.a b;

    public g(com.amazon.aps.iva.l10.a aVar, com.amazon.aps.iva.l10.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.amazon.aps.iva.ws.b
    public final e a(int i, Panel panel, com.amazon.aps.iva.mn.g gVar) {
        String str;
        String str2;
        String b;
        j.f(panel, "panel");
        j.f(gVar, "sortAndFilters");
        com.amazon.aps.iva.mn.e eVar = gVar.b;
        j.d(eVar, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.browse.BrowseFilters");
        q0 q0Var = (q0) eVar;
        m mVar = gVar.a.a;
        j.d(mVar, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.browse.sorting.BrowseSortOption");
        com.amazon.aps.iva.a00.b bVar = (com.amazon.aps.iva.a00.b) mVar;
        com.amazon.aps.iva.l10.a aVar = this.b;
        if (aVar == null || (str = aVar.b) == null) {
            int i2 = c.a.a[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    str = AppSettingsData.STATUS_NEW;
                } else {
                    throw new IllegalArgumentException(bVar + " is not supported!");
                }
            } else {
                str = "popular";
            }
        }
        String str3 = str;
        v vVar = v.SUBGENRE_BROWSE;
        t tVar = t.GRID;
        com.amazon.aps.iva.ks.e w = w.w(panel);
        String str4 = this.a.b;
        String a = c.a(q0Var.a);
        String c = c.c(q0Var.b);
        if (aVar == null && bVar == com.amazon.aps.iva.a00.b.NewlyAdded) {
            str2 = k0.a(panel).getAnalyticsName();
        } else {
            str2 = null;
        }
        if (aVar == null) {
            b = null;
        } else {
            b = c.b(bVar);
        }
        return new e(0, i, vVar, tVar, new n.d(w, str4, str3, a, c, b, str2));
    }
}
