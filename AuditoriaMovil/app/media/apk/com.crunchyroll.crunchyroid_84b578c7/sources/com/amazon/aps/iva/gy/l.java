package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.xx.g;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.model.Panel;
import java.util.Iterator;
import java.util.List;
/* compiled from: HomeFeedItemInteractor.kt */
/* loaded from: classes2.dex */
public interface l extends com.amazon.aps.iva.wy.j {

    /* compiled from: HomeFeedItemInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static com.amazon.aps.iva.xx.l a(l lVar, List<Panel> list, HomeFeedItemRaw homeFeedItemRaw, int i) {
            com.amazon.aps.iva.yb0.j.f(list, "panels");
            com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "feedItem");
            if (!list.isEmpty()) {
                lVar.H(homeFeedItemRaw, list);
                if (list.get(0).getResourceType() == com.amazon.aps.iva.x50.t.EPISODE) {
                    return new g.a(list, homeFeedItemRaw, i);
                }
                return new g.b(list, homeFeedItemRaw, i);
            }
            return com.amazon.aps.iva.xx.i.b;
        }

        public static void b(List list, HomeFeedItemRaw homeFeedItemRaw) {
            com.amazon.aps.iva.yb0.j.f(list, "panels");
            com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "feedItem");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Panel panel = (Panel) it.next();
                panel.setFeedId(homeFeedItemRaw.getId());
                panel.setFeedTitle(homeFeedItemRaw.getTitle());
            }
        }
    }

    Object D1(HomeFeedItemRaw homeFeedItemRaw, int i, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> dVar);

    void H(HomeFeedItemRaw homeFeedItemRaw, List list);
}
