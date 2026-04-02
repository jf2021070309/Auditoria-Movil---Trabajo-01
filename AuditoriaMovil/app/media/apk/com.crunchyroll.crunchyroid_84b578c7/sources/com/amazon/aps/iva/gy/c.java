package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.gy.l;
import com.ellation.crunchyroll.api.model.GameHomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.GameItem;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.HomeFeedItemResourceType;
import com.ellation.crunchyroll.model.FmsImages;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BentoItemInteractor.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final com.amazon.aps.iva.xb0.a<Boolean> b;

    public c(com.amazon.aps.iva.xb0.a<Boolean> aVar) {
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.gy.l
    public final Object D1(HomeFeedItemRaw homeFeedItemRaw, int i, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> dVar) {
        String str;
        String str2;
        String str3;
        String str4;
        c cVar;
        com.amazon.aps.iva.yb0.j.d(homeFeedItemRaw, "null cannot be cast to non-null type com.ellation.crunchyroll.api.model.GameHomeFeedItemRaw");
        String id = homeFeedItemRaw.getId();
        List<GameItem> items = ((GameHomeFeedItemRaw) homeFeedItemRaw).getItems();
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(items));
        for (GameItem gameItem : items) {
            String id2 = gameItem.getId();
            if (id2 == null) {
                str = "";
            } else {
                str = id2;
            }
            String title = gameItem.getTitle();
            if (title == null) {
                str2 = "";
            } else {
                str2 = title;
            }
            String genre = gameItem.getGenre();
            if (genre == null) {
                str3 = "";
            } else {
                str3 = genre;
            }
            FmsImages images = gameItem.getImages();
            if (images == null) {
                images = new FmsImages(null, null, null, null, 15, null);
            }
            FmsImages fmsImages = images;
            String link = gameItem.getLink();
            if (link == null) {
                cVar = this;
                str4 = "";
            } else {
                str4 = link;
                cVar = this;
            }
            arrayList.add(new com.amazon.aps.iva.xx.d(str, str2, fmsImages, str3, str4, !cVar.b.invoke().booleanValue(), homeFeedItemRaw.getTitle()));
        }
        return new com.amazon.aps.iva.xx.e(id, homeFeedItemRaw, arrayList);
    }

    @Override // com.amazon.aps.iva.gy.l
    public final void H(HomeFeedItemRaw homeFeedItemRaw, List list) {
        com.amazon.aps.iva.yb0.j.f(list, "panels");
        com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "feedItem");
        l.a.b(list, homeFeedItemRaw);
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }

    @Override // com.amazon.aps.iva.gy.b
    public final com.amazon.aps.iva.xx.e z1() {
        FmsImages fmsImages = new FmsImages(null, null, null, null, 15, null);
        com.amazon.aps.iva.xb0.a<Boolean> aVar = this.b;
        return new com.amazon.aps.iva.xx.e("mockBento", new HomeFeedItemRaw(null, null, null, HomeFeedItemResourceType.GAMES_COLLECTION, null, null, null, "Game Vault", "Subscribe to Premium and get access to games from award- winningstudios. It’s all included!", null, null, null, null, 7799, null), f1.K(new com.amazon.aps.iva.xx.d("1", "River City Girls", fmsImages, "Action", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade"), new com.amazon.aps.iva.xx.d("2", "Bloodline: Last Royal Vampire", new FmsImages(null, null, null, null, 15, null), "Adventure", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade"), new com.amazon.aps.iva.xx.d("3", "Pacman", new FmsImages(null, null, null, null, 15, null), "Action", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade"), new com.amazon.aps.iva.xx.d("13", "River City Girls", new FmsImages(null, null, null, null, 15, null), "Action", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade"), new com.amazon.aps.iva.xx.d("234", "Bloodline: Last Royal Vampire", new FmsImages(null, null, null, null, 15, null), "Adventure", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade"), new com.amazon.aps.iva.xx.d("344", "Pacman", new FmsImages(null, null, null, null, 15, null), "Action", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade"), new com.amazon.aps.iva.xx.d("1424", "River City Girls", new FmsImages(null, null, null, null, 15, null), "Action", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade"), new com.amazon.aps.iva.xx.d("24234", "Bloodline: Last Royal Vampire", new FmsImages(null, null, null, null, 15, null), "Adventure", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade"), new com.amazon.aps.iva.xx.d("3234", "Pacman", new FmsImages(null, null, null, null, 15, null), "Action", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade"), new com.amazon.aps.iva.xx.d("1234", "River City Girls", new FmsImages(null, null, null, null, 15, null), "Action", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade"), new com.amazon.aps.iva.xx.d("32", "Bloodline: Last Royal Vampire", new FmsImages(null, null, null, null, 15, null), "Adventure", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade"), new com.amazon.aps.iva.xx.d("33", "Pacman", new FmsImages(null, null, null, null, 15, null), "Action", "market://details?id=com.crunchyroll.crunchyroid&url=crunchyroll://search", !aVar.invoke().booleanValue(), "Cr Arcade")));
    }
}
