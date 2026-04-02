package com.amazon.aps.iva.oh;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nz.b;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xe0.k;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import java.util.List;
/* compiled from: MarkAsWatchedToggleInteractor.kt */
/* loaded from: classes.dex */
public interface e extends j {

    /* compiled from: MarkAsWatchedToggleInteractor.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static f a(EtpContentService etpContentService) {
            com.amazon.aps.iva.ye0.c cVar = r0.a;
            t1 t1Var = k.a;
            com.amazon.aps.iva.yb0.j.f(t1Var, "dispatcher");
            com.amazon.aps.iva.nz.c cVar2 = b.a.a;
            if (cVar2 == null) {
                cVar2 = new com.amazon.aps.iva.nz.c(t1Var);
                b.a.a = cVar2;
            }
            com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
            return new f(etpContentService, cVar2);
        }
    }

    Object O1(List<com.amazon.aps.iva.nz.a> list, com.amazon.aps.iva.ob0.d<? super q> dVar);

    Object T(List<com.amazon.aps.iva.nz.a> list, com.amazon.aps.iva.ob0.d<? super q> dVar);
}
