package com.amazon.aps.iva.l40;

import com.amazon.aps.iva.r30.a;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import java.util.List;
/* compiled from: ShowPageDetailsFormatter.kt */
/* loaded from: classes2.dex */
public interface q {

    /* compiled from: ShowPageDetailsFormatter.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static r a(ShowPageActivity showPageActivity) {
            com.amazon.aps.iva.kh.d dVar = com.amazon.aps.iva.gy.t.a;
            if (dVar != null) {
                com.amazon.aps.iva.kh.f a = dVar.a(showPageActivity);
                com.amazon.aps.iva.r30.b a2 = a.C0662a.a(showPageActivity);
                com.amazon.aps.iva.yb0.j.f(showPageActivity, "context");
                com.amazon.aps.iva.aj.j jVar = ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).d;
                com.amazon.aps.iva.yb0.j.f(jVar, "parentalControlsFeature");
                return new r(a, a2, jVar);
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    String a(ContentContainer contentContainer);

    String b(ContentContainer contentContainer);

    String c(List<String> list);
}
