package com.amazon.aps.iva.qz;

import com.amazon.aps.iva.hg.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.l40.t1;
import com.amazon.aps.iva.l40.w1;
import com.amazon.aps.iva.l40.x1;
import com.ellation.crunchyroll.api.cms.model.Season;
import java.util.ArrayList;
/* compiled from: AssetListViewModel.kt */
/* loaded from: classes2.dex */
public interface b extends com.amazon.aps.iva.qg.a {

    /* compiled from: AssetListViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ void a(b bVar, Season season, int i) {
            boolean z;
            if ((i & 1) != 0) {
                season = null;
            }
            if ((i & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            bVar.r1(season, z, false);
        }
    }

    com.amazon.aps.iva.i00.a I();

    void L4(com.amazon.aps.iva.qz.a aVar);

    g P();

    void Y(com.amazon.aps.iva.hg.c cVar);

    Object e3(t1 t1Var);

    v o6();

    void q(com.amazon.aps.iva.i00.a aVar);

    void q8(ArrayList arrayList, w1 w1Var, x1 x1Var);

    void r1(Season season, boolean z, boolean z2);
}
