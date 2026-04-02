package com.amazon.aps.iva.uz;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.uz.h;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: BrowseUiModel.kt */
/* loaded from: classes2.dex */
public final class i {
    public static final void a(List<? extends h> list, String str, WatchlistStatus watchlistStatus, l<? super Integer, q> lVar) {
        h.c cVar;
        Panel panel;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        com.amazon.aps.iva.yb0.j.f(watchlistStatus, "watchlistStatus");
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            String str2 = null;
            if (i >= 0) {
                h hVar = (h) obj;
                if (hVar instanceof h.c) {
                    cVar = (h.c) hVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    panel = cVar.a();
                } else {
                    panel = null;
                }
                if (panel != null) {
                    str2 = panel.getId();
                }
                if (com.amazon.aps.iva.yb0.j.a(str, str2)) {
                    com.amazon.aps.iva.yb0.j.f(panel, "<this>");
                    if (panel.getWatchlistStatus() != watchlistStatus) {
                        panel.setWatchlistStatus(watchlistStatus);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        lVar.invoke(Integer.valueOf(i));
                    }
                }
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
    }
}
