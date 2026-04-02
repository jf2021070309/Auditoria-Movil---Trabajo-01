package com.amazon.aps.iva.q30;

import com.amazon.aps.iva.q30.g;
import com.amazon.aps.iva.t50.c;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
import java.util.List;
/* compiled from: RecentSearchesInteractor.kt */
/* loaded from: classes2.dex */
public interface k extends com.amazon.aps.iva.wy.j {

    /* compiled from: RecentSearchesInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static m a() {
            i iVar = g.a.a;
            if (iVar == null) {
                CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
                CrunchyrollApplication a = CrunchyrollApplication.a.a();
                i iVar2 = new i(a);
                h hVar = new h(a);
                iVar2.n1(hVar.q());
                hVar.clear();
                g.a.a = iVar2;
                iVar = iVar2;
            }
            return new m(iVar, 5, c.b.a);
        }
    }

    void B(MusicAsset musicAsset);

    void B1(Panel panel);

    void I1(String str);

    void M0();

    void l1(com.amazon.aps.iva.xb0.l<? super List<b>, com.amazon.aps.iva.kb0.q> lVar);
}
