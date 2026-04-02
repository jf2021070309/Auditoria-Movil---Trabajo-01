package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.google.android.gms.cast.MediaTrack;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ContentContainer.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\bR\u0014\u0010$\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000bR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b'\u0010\bR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\bR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\bR\u0011\u0010,\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010\u000bR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\bR\u0011\u00100\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b1\u0010\u000bR\u0011\u00102\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b3\u0010\u000bR\u0011\u00104\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b5\u0010\u000bR\u0011\u00106\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b7\u0010\u0017R\u0014\u00108\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010<\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00109R\u0016\u0010=\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u000bR\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b@\u0010\bR\u0011\u0010A\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bB\u0010\u000b\u0082\u0001\u0002CD¨\u0006E"}, d2 = {"Lcom/ellation/crunchyroll/model/ContentContainer;", "Ljava/io/Serializable;", "Lcom/ellation/crunchyroll/model/LabeledContent;", "()V", "_audioLocales", "", "", "get_audioLocales", "()Ljava/util/List;", "_channelId", "get_channelId", "()Ljava/lang/String;", "_contentDescriptors", "get_contentDescriptors", "_contentProvider", "get_contentProvider", "_description", "get_description", "_id", "get_id", "_images", "Lcom/ellation/crunchyroll/model/Images;", "get_images", "()Lcom/ellation/crunchyroll/model/Images;", "_isDubbed", "", "get_isDubbed", "()Ljava/lang/Boolean;", "_isMature", "get_isMature", "_isMatureBlocked", "get_isMatureBlocked", "_isSubbed", "get_isSubbed", "_subtitleLocales", "get_subtitleLocales", "_title", "get_title", "audioLocales", "getAudioLocales", "availableAudioLocales", "getAvailableAudioLocales", "availableSubtitleLocales", "getAvailableSubtitleLocales", "channelId", "getChannelId", "contentDescriptors", "getContentDescriptors", "contentProvider", "getContentProvider", MediaTrack.ROLE_DESCRIPTION, "getDescription", "id", "getId", "images", "getImages", "isDubbed", "()Z", "isMature", "isMatureBlocked", "isSubbed", "originalAudio", "getOriginalAudio", "subtitleLocales", "getSubtitleLocales", "title", "getTitle", "Lcom/ellation/crunchyroll/model/MovieListing;", "Lcom/ellation/crunchyroll/model/Series;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ContentContainer implements Serializable, LabeledContent {
    public static final int $stable = 0;

    public /* synthetic */ ContentContainer(e eVar) {
        this();
    }

    public final List<String> getAudioLocales() {
        return x.r0(get_audioLocales());
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getAvailableAudioLocales() {
        return getAudioLocales();
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getAvailableSubtitleLocales() {
        return getSubtitleLocales();
    }

    public final String getChannelId() {
        String str = get_channelId();
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getContentDescriptors() {
        List<String> list = get_contentDescriptors();
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final String getContentProvider() {
        String str = get_contentProvider();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getDescription() {
        String str = get_description();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getId() {
        String str = get_id();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final Images getImages() {
        Images images = get_images();
        if (images == null) {
            return new Images(null, null, null, null, 15, null);
        }
        return images;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public String getOriginalAudio() {
        return (String) x.v0(getAudioLocales());
    }

    public final List<String> getSubtitleLocales() {
        return x.r0(get_subtitleLocales());
    }

    public final String getTitle() {
        String str = get_title();
        if (str == null) {
            return "";
        }
        return str;
    }

    public abstract List<String> get_audioLocales();

    public abstract String get_channelId();

    public abstract List<String> get_contentDescriptors();

    public abstract String get_contentProvider();

    public abstract String get_description();

    public abstract String get_id();

    public abstract Images get_images();

    public abstract Boolean get_isDubbed();

    public abstract Boolean get_isMature();

    public abstract Boolean get_isMatureBlocked();

    public abstract Boolean get_isSubbed();

    public abstract List<String> get_subtitleLocales();

    public abstract String get_title();

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isDubbed() {
        Boolean bool = get_isDubbed();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isMature() {
        Boolean bool = get_isMature();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isMatureBlocked() {
        Boolean bool = get_isMatureBlocked();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isSubbed() {
        Boolean bool = get_isSubbed();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private ContentContainer() {
    }
}
