package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.yb0.e;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PanelMetadata.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0012\u0010\r\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/ellation/crunchyroll/model/PlayableAssetPanelMetadata;", "Lcom/ellation/crunchyroll/model/PanelMetadata;", "Lcom/ellation/crunchyroll/model/DurationProvider;", "()V", "availableDate", "Ljava/util/Date;", "getAvailableDate", "()Ljava/util/Date;", "freeAvailableDate", "getFreeAvailableDate", "isAvailableOffline", "", "()Z", "isPremiumOnly", "parentId", "", "getParentId", "()Ljava/lang/String;", "parentTitle", "getParentTitle", "premiumAvailableDate", "getPremiumAvailableDate", "versions", "", "Lcom/ellation/crunchyroll/model/PlayableAssetVersion;", "getVersions", "()Ljava/util/List;", "Lcom/ellation/crunchyroll/model/EmptyPlayableAssetPanelMetadata;", "Lcom/ellation/crunchyroll/model/EpisodeMetadata;", "Lcom/ellation/crunchyroll/model/MovieMetadata;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PlayableAssetPanelMetadata extends PanelMetadata implements DurationProvider {
    public static final int $stable = 0;

    public /* synthetic */ PlayableAssetPanelMetadata(e eVar) {
        this();
    }

    public abstract Date getAvailableDate();

    public abstract Date getFreeAvailableDate();

    public abstract String getParentId();

    public abstract String getParentTitle();

    public abstract Date getPremiumAvailableDate();

    public abstract List<PlayableAssetVersion> getVersions();

    public abstract boolean isAvailableOffline();

    public abstract boolean isPremiumOnly();

    private PlayableAssetPanelMetadata() {
        super(null);
    }
}
