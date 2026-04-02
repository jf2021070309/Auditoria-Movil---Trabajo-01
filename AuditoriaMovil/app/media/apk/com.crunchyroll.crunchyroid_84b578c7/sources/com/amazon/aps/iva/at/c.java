package com.amazon.aps.iva.at;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetPanelMetadata;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* compiled from: ContentAvailabilityProvider.kt */
/* loaded from: classes2.dex */
public class c implements com.amazon.aps.iva.at.a {
    public final com.amazon.aps.iva.xb0.a<Boolean> a;
    public final com.amazon.aps.iva.xb0.a<Date> b;

    /* compiled from: ContentAvailabilityProvider.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.EPISODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.MOVIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ c(com.amazon.aps.iva.xb0.a aVar) {
        this(aVar, b.h);
    }

    @Override // com.amazon.aps.iva.at.a
    public final String a(PlayableAsset playableAsset) {
        Date freeAvailableDate;
        j.f(playableAsset, "asset");
        boolean z = false;
        if (!playableAsset.isPremiumOnly() && playableAsset.getAvailableDate() == null) {
            if (this.a.invoke().booleanValue()) {
                freeAvailableDate = playableAsset.getPremiumAvailableDate();
            } else {
                freeAvailableDate = playableAsset.getFreeAvailableDate();
            }
            if (freeAvailableDate == null) {
                z = true;
            }
        }
        if (z) {
            return "unavailable";
        }
        if (h(playableAsset)) {
            return "comingSoon";
        }
        if (playableAsset.isMatureBlocked()) {
            return "matureBlocked";
        }
        if (j(playableAsset)) {
            return "premium";
        }
        return "available";
    }

    @Override // com.amazon.aps.iva.at.a
    public final List<String> b(Panel panel) {
        j.f(panel, "panel");
        int i = a.a[panel.getResourceType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return f1.J("unavailable");
                }
                return f1.J("unavailable");
            }
            return g(panel.getMovieMetadata());
        }
        return g(panel.getEpisodeMetadata());
    }

    @Override // com.amazon.aps.iva.at.a
    public final ArrayList d(PlayableAsset playableAsset) {
        Date freeAvailableDate;
        j.f(playableAsset, "asset");
        ArrayList arrayList = new ArrayList();
        if (playableAsset.isMatureBlocked()) {
            arrayList.add("matureBlocked");
        }
        if (j(playableAsset)) {
            arrayList.add("premium");
        }
        boolean z = false;
        if (!playableAsset.isPremiumOnly() && playableAsset.getAvailableDate() == null) {
            if (this.a.invoke().booleanValue()) {
                freeAvailableDate = playableAsset.getPremiumAvailableDate();
            } else {
                freeAvailableDate = playableAsset.getFreeAvailableDate();
            }
            if (freeAvailableDate == null) {
                z = true;
            }
        }
        if (z) {
            arrayList.add("unavailable");
        }
        if (h(playableAsset)) {
            arrayList.add("comingSoon");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("available");
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.at.a
    public final String e(Panel panel) {
        int i = a.a[panel.getResourceType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "unavailable";
            }
            return f(panel.getMovieMetadata());
        }
        return f(panel.getEpisodeMetadata());
    }

    public final String f(PlayableAssetPanelMetadata playableAssetPanelMetadata) {
        Date freeAvailableDate;
        boolean isPremiumOnly = playableAssetPanelMetadata.isPremiumOnly();
        com.amazon.aps.iva.xb0.a<Boolean> aVar = this.a;
        boolean z = false;
        if (!isPremiumOnly && playableAssetPanelMetadata.getAvailableDate() == null) {
            if (aVar.invoke().booleanValue()) {
                freeAvailableDate = playableAssetPanelMetadata.getPremiumAvailableDate();
            } else {
                freeAvailableDate = playableAssetPanelMetadata.getFreeAvailableDate();
            }
            if (freeAvailableDate == null) {
                z = true;
            }
        }
        if (z) {
            return "unavailable";
        }
        if (i(playableAssetPanelMetadata)) {
            return "comingSoon";
        }
        if (playableAssetPanelMetadata.isMatureBlocked()) {
            return "matureBlocked";
        }
        if (playableAssetPanelMetadata.isPremiumOnly() && !aVar.invoke().booleanValue()) {
            return "premium";
        }
        return "available";
    }

    public final ArrayList g(PlayableAssetPanelMetadata playableAssetPanelMetadata) {
        Date freeAvailableDate;
        ArrayList arrayList = new ArrayList();
        boolean isPremiumOnly = playableAssetPanelMetadata.isPremiumOnly();
        com.amazon.aps.iva.xb0.a<Boolean> aVar = this.a;
        boolean z = false;
        if (!isPremiumOnly && playableAssetPanelMetadata.getAvailableDate() == null) {
            if (aVar.invoke().booleanValue()) {
                freeAvailableDate = playableAssetPanelMetadata.getPremiumAvailableDate();
            } else {
                freeAvailableDate = playableAssetPanelMetadata.getFreeAvailableDate();
            }
            if (freeAvailableDate == null) {
                z = true;
            }
        }
        if (z) {
            arrayList.add("unavailable");
        }
        if (i(playableAssetPanelMetadata)) {
            arrayList.add("comingSoon");
        }
        if (playableAssetPanelMetadata.isMatureBlocked()) {
            arrayList.add("matureBlocked");
        }
        if (playableAssetPanelMetadata.isPremiumOnly() && !aVar.invoke().booleanValue()) {
            arrayList.add("premium");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("available");
        }
        return arrayList;
    }

    public final boolean h(PlayableAsset playableAsset) {
        Date freeAvailableDate;
        if (playableAsset.isPremiumOnly()) {
            return false;
        }
        Date invoke = this.b.invoke();
        Date availableDate = playableAsset.getAvailableDate();
        if (availableDate == null) {
            if (this.a.invoke().booleanValue()) {
                freeAvailableDate = playableAsset.getPremiumAvailableDate();
            } else {
                freeAvailableDate = playableAsset.getFreeAvailableDate();
            }
            availableDate = freeAvailableDate;
            if (availableDate == null) {
                return false;
            }
        }
        return invoke.before(availableDate);
    }

    public final boolean i(PlayableAssetPanelMetadata playableAssetPanelMetadata) {
        Date freeAvailableDate;
        if (playableAssetPanelMetadata.isPremiumOnly()) {
            return false;
        }
        Date invoke = this.b.invoke();
        Date availableDate = playableAssetPanelMetadata.getAvailableDate();
        if (availableDate == null) {
            if (this.a.invoke().booleanValue()) {
                freeAvailableDate = playableAssetPanelMetadata.getPremiumAvailableDate();
            } else {
                freeAvailableDate = playableAssetPanelMetadata.getFreeAvailableDate();
            }
            availableDate = freeAvailableDate;
            if (availableDate == null) {
                return false;
            }
        }
        return invoke.before(availableDate);
    }

    public boolean j(PlayableAsset playableAsset) {
        j.f(playableAsset, "asset");
        if (playableAsset.isPremiumOnly() && !this.a.invoke().booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.amazon.aps.iva.xb0.a<Boolean> aVar, com.amazon.aps.iva.xb0.a<? extends Date> aVar2) {
        j.f(aVar, "isUserPremium");
        j.f(aVar2, "currentDate");
        this.a = aVar;
        this.b = aVar2;
    }
}
