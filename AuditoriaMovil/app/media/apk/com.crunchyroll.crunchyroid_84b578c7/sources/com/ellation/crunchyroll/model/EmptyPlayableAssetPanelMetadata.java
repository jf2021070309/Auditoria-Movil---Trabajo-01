package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.lb0.z;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PanelMetadata.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0014\u0010\"\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u000bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007¨\u0006."}, d2 = {"Lcom/ellation/crunchyroll/model/EmptyPlayableAssetPanelMetadata;", "Lcom/ellation/crunchyroll/model/PlayableAssetPanelMetadata;", "()V", "availableAudioLocales", "", "", "getAvailableAudioLocales", "()Ljava/util/List;", "availableDate", "Ljava/util/Date;", "getAvailableDate", "()Ljava/util/Date;", "availableSubtitleLocales", "getAvailableSubtitleLocales", "contentDescriptors", "getContentDescriptors", "durationMs", "", "getDurationMs", "()J", "extendedMaturityRating", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "freeAvailableDate", "getFreeAvailableDate", "isAvailableOffline", "", "()Z", "isDubbed", "isMature", "isMatureBlocked", "isPremiumOnly", "isSubbed", "originalAudio", "getOriginalAudio", "()Ljava/lang/String;", "parentId", "getParentId", "parentTitle", "getParentTitle", "premiumAvailableDate", "getPremiumAvailableDate", "versions", "Lcom/ellation/crunchyroll/model/PlayableAssetVersion;", "getVersions", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyPlayableAssetPanelMetadata extends PlayableAssetPanelMetadata {
    public static final int $stable;
    private static final List<String> availableAudioLocales;
    private static final Date availableDate = null;
    private static final List<String> availableSubtitleLocales;
    private static final List<String> contentDescriptors = null;
    private static final long durationMs = 0;
    private static final ExtendedMaturityRating extendedMaturityRating = null;
    private static final Date freeAvailableDate = null;
    private static final boolean isAvailableOffline = false;
    private static final boolean isDubbed = false;
    private static final boolean isMature = false;
    private static final boolean isMatureBlocked = false;
    private static final boolean isPremiumOnly = false;
    private static final boolean isSubbed = false;
    private static final Date premiumAvailableDate = null;
    private static final List<PlayableAssetVersion> versions;
    public static final EmptyPlayableAssetPanelMetadata INSTANCE = new EmptyPlayableAssetPanelMetadata();
    private static final String parentId = "";
    private static final String parentTitle = "";
    private static final String originalAudio = "";

    static {
        z zVar = z.b;
        availableAudioLocales = zVar;
        availableSubtitleLocales = zVar;
        versions = zVar;
        $stable = 8;
    }

    private EmptyPlayableAssetPanelMetadata() {
        super(null);
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getAvailableAudioLocales() {
        return availableAudioLocales;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public Date getAvailableDate() {
        return availableDate;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getAvailableSubtitleLocales() {
        return availableSubtitleLocales;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getContentDescriptors() {
        return contentDescriptors;
    }

    @Override // com.ellation.crunchyroll.model.DurationProvider
    public long getDurationMs() {
        return durationMs;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public ExtendedMaturityRating getExtendedMaturityRating() {
        return extendedMaturityRating;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public Date getFreeAvailableDate() {
        return freeAvailableDate;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public String getOriginalAudio() {
        return originalAudio;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public String getParentId() {
        return parentId;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public String getParentTitle() {
        return parentTitle;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public Date getPremiumAvailableDate() {
        return premiumAvailableDate;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public List<PlayableAssetVersion> getVersions() {
        return versions;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public boolean isAvailableOffline() {
        return isAvailableOffline;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isDubbed() {
        return isDubbed;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isMature() {
        return isMature;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isMatureBlocked() {
        return isMatureBlocked;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public boolean isPremiumOnly() {
        return isPremiumOnly;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isSubbed() {
        return isSubbed;
    }
}
