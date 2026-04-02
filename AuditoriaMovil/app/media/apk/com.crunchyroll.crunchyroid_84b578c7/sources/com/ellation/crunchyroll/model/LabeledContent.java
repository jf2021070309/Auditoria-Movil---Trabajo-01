package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LabeledContent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/ellation/crunchyroll/model/LabeledContent;", "", "", "isMature", "()Z", "isMatureBlocked", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "extendedMaturityRating", "", "", "getContentDescriptors", "()Ljava/util/List;", "contentDescriptors", "isDubbed", "isSubbed", "getOriginalAudio", "()Ljava/lang/String;", "originalAudio", "getAvailableSubtitleLocales", "availableSubtitleLocales", "getAvailableAudioLocales", "availableAudioLocales", "Lcom/amazon/aps/iva/x50/t;", "getResourceType", "()Lcom/amazon/aps/iva/x50/t;", "resourceType", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface LabeledContent {
    List<String> getAvailableAudioLocales();

    List<String> getAvailableSubtitleLocales();

    List<String> getContentDescriptors();

    ExtendedMaturityRating getExtendedMaturityRating();

    String getOriginalAudio();

    t getResourceType();

    boolean isDubbed();

    boolean isMature();

    boolean isMatureBlocked();

    boolean isSubbed();
}
