package com.amazon.aps.iva.o40;

import android.content.Context;
import com.amazon.aps.iva.wv.b0;
import com.amazon.aps.iva.wv.d0;
import com.amazon.aps.iva.wv.e0;
import com.amazon.aps.iva.wv.f0;
import com.amazon.aps.iva.wv.i0;
import com.amazon.aps.iva.wv.j;
import com.amazon.aps.iva.wv.j0;
import com.amazon.aps.iva.wv.q;
import com.amazon.aps.iva.wv.r;
import com.amazon.aps.iva.wv.s;
import com.amazon.aps.iva.wv.t;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.Series;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ShowContentInteractor.kt */
/* loaded from: classes2.dex */
public interface c extends com.amazon.aps.iva.wy.j {

    /* compiled from: ShowContentInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static com.amazon.aps.iva.o40.a a(j jVar, com.amazon.aps.iva.ug.a aVar) {
            CrunchyrollApplication b = com.ellation.crunchyroll.application.e.b();
            j0 j0Var = i0.a.a;
            if (j0Var == null) {
                Context applicationContext = b.getApplicationContext();
                com.amazon.aps.iva.yb0.j.e(applicationContext, "context.applicationContext");
                j0Var = new j0(applicationContext);
                i0.a.a = j0Var;
            }
            j0 j0Var2 = j0Var;
            CrunchyrollApplication b2 = com.ellation.crunchyroll.application.e.b();
            t tVar = s.a.a;
            if (tVar == null) {
                Context applicationContext2 = b2.getApplicationContext();
                com.amazon.aps.iva.yb0.j.e(applicationContext2, "context.applicationContext");
                tVar = new t(applicationContext2);
                s.a.a = tVar;
            }
            t tVar2 = tVar;
            CrunchyrollApplication b3 = com.ellation.crunchyroll.application.e.b();
            r rVar = q.a.a;
            if (rVar == null) {
                Context applicationContext3 = b3.getApplicationContext();
                com.amazon.aps.iva.yb0.j.e(applicationContext3, "context.applicationContext");
                rVar = new r(applicationContext3);
                q.a.a = rVar;
            }
            r rVar2 = rVar;
            CrunchyrollApplication b4 = com.ellation.crunchyroll.application.e.b();
            f0 f0Var = e0.a.a;
            if (f0Var == null) {
                Context applicationContext4 = b4.getApplicationContext();
                com.amazon.aps.iva.yb0.j.e(applicationContext4, "context.applicationContext");
                f0Var = new f0(applicationContext4);
                e0.a.a = f0Var;
            }
            f0 f0Var2 = f0Var;
            CrunchyrollApplication b5 = com.ellation.crunchyroll.application.e.b();
            d0 d0Var = b0.a.a;
            if (d0Var == null) {
                Context applicationContext5 = b5.getApplicationContext();
                com.amazon.aps.iva.yb0.j.e(applicationContext5, "context.applicationContext");
                d0Var = new d0(applicationContext5);
                b0.a.a = d0Var;
            }
            d0 d0Var2 = d0Var;
            CrunchyrollApplication b6 = com.ellation.crunchyroll.application.e.b();
            com.amazon.aps.iva.wv.k kVar = j.a.a;
            if (kVar == null) {
                Context applicationContext6 = b6.getApplicationContext();
                com.amazon.aps.iva.yb0.j.e(applicationContext6, "context.applicationContext");
                kVar = new com.amazon.aps.iva.wv.k(applicationContext6);
                j.a.a = kVar;
            }
            com.amazon.aps.iva.yb0.j.f(aVar, "downloadedAssetsProvider");
            return new com.amazon.aps.iva.o40.a(jVar, aVar, j0Var2, tVar2, rVar2, f0Var2, d0Var2, kVar);
        }
    }

    Object b1(Season season, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.e00.a> dVar);

    Serializable f(com.amazon.aps.iva.ob0.d dVar);

    Object g(ContentContainer contentContainer, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.e00.a> dVar);

    Object g1(Series series, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.l40.f> dVar);

    j getInput();

    Object n(String str, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar);

    Object o(String[] strArr, com.amazon.aps.iva.ob0.d<? super Map<String, Playhead>> dVar);

    Object t(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o00.e> dVar);

    void u();
}
