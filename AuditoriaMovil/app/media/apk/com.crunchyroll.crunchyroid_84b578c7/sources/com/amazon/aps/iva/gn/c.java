package com.amazon.aps.iva.gn;

import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: ShareContentPresenter.kt */
/* loaded from: classes2.dex */
public interface c extends k, b {

    /* compiled from: ShareContentPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static d a(e eVar, String str) {
            j.f(str, "deepLinkBaseUrl");
            g gVar = new g(str);
            com.amazon.aps.iva.hn.b bVar = new com.amazon.aps.iva.hn.b(com.amazon.aps.iva.ds.c.b);
            j.f(eVar, "view");
            j.f(str, ImagesContract.URL);
            return new d(eVar, gVar, bVar);
        }
    }

    void V(Panel panel);
}
