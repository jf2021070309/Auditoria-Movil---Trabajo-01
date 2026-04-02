package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.model.Href;
import com.ellation.crunchyroll.model.links.MovieLinks;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaTrack;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: PlayableAsset.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\bB\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\b\b\u0002\u0010&\u001a\u00020\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\b\b\u0002\u0010)\u001a\u00020\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0015\u0012\b\b\u0002\u00103\u001a\u00020\u0018\u0012\b\b\u0002\u00104\u001a\u00020\u001a\u0012\b\b\u0002\u00105\u001a\u00020\n\u0012\b\b\u0002\u00106\u001a\u00020\n\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010:\u001a\u00020\n\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015\u0012\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\t\u0010\u0003\u001a\u00020\u0002HÄ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÄ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÄ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÄ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÄ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\nHÆ\u0003J\t\u0010\u0010\u001a\u00020\nHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0018HÆ\u0003J\t\u0010\u001b\u001a\u00020\u001aHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003Jç\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00152\b\b\u0002\u00103\u001a\u00020\u00182\b\b\u0002\u00104\u001a\u00020\u001a2\b\b\u0002\u00105\u001a\u00020\n2\b\b\u0002\u00106\u001a\u00020\n2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00152\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010:\u001a\u00020\n2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00152\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015HÆ\u0001J\t\u0010?\u001a\u00020\u0002HÖ\u0001J\t\u0010A\u001a\u00020@HÖ\u0001J\u0013\u0010D\u001a\u00020\n2\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010-HÂ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0015HÂ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015HÂ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015HÂ\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015HÂ\u0003R\u001a\u0010\u001f\u001a\u00020\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b\u001f\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010 \u001a\u00020\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b \u0010N\u001a\u0004\bQ\u0010PR\u001a\u0010!\u001a\u00020\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b!\u0010N\u001a\u0004\bR\u0010PR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b\"\u0010N\u001a\u0004\bS\u0010PR\u001a\u0010#\u001a\u00020\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b#\u0010N\u001a\u0004\bT\u0010PR\u001c\u0010$\u001a\u0004\u0018\u00010\b8\u0014X\u0095\u0004¢\u0006\f\n\u0004\b$\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010%\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010X\u001a\u0004\b%\u0010YR\u001a\u0010&\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010X\u001a\u0004\b&\u0010YR\u001c\u0010'\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010(\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010X\u001a\u0004\b(\u0010YR\u001a\u0010)\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010X\u001a\u0004\b)\u0010YR\u001c\u0010*\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010]\u001a\u0004\b^\u0010_R\u001c\u0010+\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010]\u001a\u0004\b`\u0010_R\u001c\u0010,\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b,\u0010]\u001a\u0004\ba\u0010_R\u0016\u0010.\u001a\u0004\u0018\u00010-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010bR\u0016\u0010/\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010NR\"\u00100\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b0\u0010c\u001a\u0004\bd\u0010eR\u001c\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010cR\u001a\u00103\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010f\u001a\u0004\bg\u0010hR\u001a\u00104\u001a\u00020\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b4\u0010i\u001a\u0004\bj\u0010kR\u001a\u00105\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b5\u0010X\u001a\u0004\b5\u0010YR\u001a\u00106\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b6\u0010X\u001a\u0004\b6\u0010YR\u0016\u00107\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u0010NR\u001c\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u0010cR\u0016\u00109\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010NR\u001a\u0010:\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b:\u0010X\u001a\u0004\b:\u0010YR\u0016\u0010;\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010NR\u001c\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010cR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010cR\u001a\u0010l\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010f\u001a\u0004\bm\u0010hR\u0011\u0010o\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bn\u0010PR\u0014\u0010q\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010PR\u0016\u0010s\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010PR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u0002010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010eR\u0014\u0010w\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010PR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010eR\u0014\u0010{\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010PR\u0016\u0010}\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010PR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010eR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010e¨\u0006\u0084\u0001"}, d2 = {"Lcom/ellation/crunchyroll/model/Movie;", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "", "component1", "component2", "component3", "component4", "component5", "Lcom/ellation/crunchyroll/model/Images;", "component6", "", "component7", "component8", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "component9", "component10", "component11", "Ljava/util/Date;", "component12", "component13", "component14", "", "Lcom/ellation/crunchyroll/model/EpisodeAdBreak;", "component17", "Lcom/amazon/aps/iva/x50/t;", "component19", "", "component20", "component21", "component22", "component26", "_id", "_channelId", "_title", "_type", "_description", "_images", "isMature", "isMatureBlocked", "extendedMaturityRating", "isPremiumOnly", "isAvailableOffline", "availableDate", "freeAvailableDate", "premiumAvailableDate", "Lcom/ellation/crunchyroll/model/links/MovieLinks;", "links", "_movieListingId", "episodeAdBreaks", "Lcom/ellation/crunchyroll/model/PlayableAssetVersion;", "_versions", "parentType", "durationMs", "isDubbed", "isSubbed", "_audioLocale", "_subtitleLocale", "_variant", "isOriginal", "_streamsLink", "_contentDescriptors", "_subtitleLocales", "copy", "toString", "", "hashCode", "", "other", "equals", "component15", "component16", "component18", "component23", "component24", "component25", "component27", "component28", "component29", "Ljava/lang/String;", "get_id", "()Ljava/lang/String;", "get_channelId", "get_title", "get_type", "get_description", "Lcom/ellation/crunchyroll/model/Images;", "get_images", "()Lcom/ellation/crunchyroll/model/Images;", "Z", "()Z", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "Ljava/util/Date;", "getAvailableDate", "()Ljava/util/Date;", "getFreeAvailableDate", "getPremiumAvailableDate", "Lcom/ellation/crunchyroll/model/links/MovieLinks;", "Ljava/util/List;", "getEpisodeAdBreaks", "()Ljava/util/List;", "Lcom/amazon/aps/iva/x50/t;", "getParentType", "()Lcom/amazon/aps/iva/x50/t;", "J", "getDurationMs", "()J", "resourceType", "getResourceType", "getMovieListingId", "movieListingId", "getParentId", "parentId", "getStreamHref", "streamHref", "getVersions", "versions", "getAudioLocale", "audioLocale", "getContentDescriptors", "contentDescriptors", "getVariant", "variant", "getOriginalAudio", "originalAudio", "getAvailableAudioLocales", "availableAudioLocales", "getAvailableSubtitleLocales", "availableSubtitleLocales", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/model/Images;ZZLcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;ZZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/ellation/crunchyroll/model/links/MovieLinks;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/amazon/aps/iva/x50/t;JZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Movie extends PlayableAsset {
    public static final int $stable = 8;
    @SerializedName("audio_locale")
    private final String _audioLocale;
    @SerializedName("channel_id")
    private final String _channelId;
    @SerializedName("content_descriptors")
    private final List<String> _contentDescriptors;
    @SerializedName(MediaTrack.ROLE_DESCRIPTION)
    private final String _description;
    @SerializedName("id")
    private final String _id;
    @SerializedName("images")
    private final Images _images;
    @SerializedName("listing_id")
    private final String _movieListingId;
    @SerializedName("streams_link")
    private final String _streamsLink;
    @SerializedName("subtitle_locale")
    private final List<String> _subtitleLocale;
    @SerializedName("subtitle_locales")
    private final List<String> _subtitleLocales;
    @SerializedName("title")
    private final String _title;
    @SerializedName("media_type")
    private final String _type;
    @SerializedName("variant")
    private final String _variant;
    @SerializedName("versions")
    private final List<PlayableAssetVersion> _versions;
    @SerializedName("available_date")
    private final Date availableDate;
    @SerializedName("duration_ms")
    private final long durationMs;
    @SerializedName("ad_breaks")
    private final List<EpisodeAdBreak> episodeAdBreaks;
    @SerializedName("extended_maturity_rating")
    private final ExtendedMaturityRating extendedMaturityRating;
    @SerializedName("free_available_date")
    private final Date freeAvailableDate;
    @SerializedName("available_offline")
    private final boolean isAvailableOffline;
    @SerializedName("is_dubbed")
    private final boolean isDubbed;
    @SerializedName("is_mature")
    private final boolean isMature;
    @SerializedName("mature_blocked")
    private final boolean isMatureBlocked;
    @SerializedName("original")
    private final boolean isOriginal;
    @SerializedName("is_premium_only")
    private final boolean isPremiumOnly;
    @SerializedName("is_subbed")
    private final boolean isSubbed;
    @SerializedName("__links__")
    private final MovieLinks links;
    private final t parentType;
    @SerializedName("premium_available_date")
    private final Date premiumAvailableDate;
    private final t resourceType;

    public Movie() {
        this(null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, 0L, false, false, null, null, null, false, null, null, null, 536870911, null);
    }

    private final MovieLinks component15() {
        return this.links;
    }

    private final String component16() {
        return this._movieListingId;
    }

    private final List<PlayableAssetVersion> component18() {
        return this._versions;
    }

    private final String component23() {
        return this._audioLocale;
    }

    private final List<String> component24() {
        return this._subtitleLocale;
    }

    private final String component25() {
        return this._variant;
    }

    private final String component27() {
        return this._streamsLink;
    }

    private final List<String> component28() {
        return this._contentDescriptors;
    }

    private final List<String> component29() {
        return this._subtitleLocales;
    }

    public final String component1() {
        return this._id;
    }

    public final boolean component10() {
        return this.isPremiumOnly;
    }

    public final boolean component11() {
        return this.isAvailableOffline;
    }

    public final Date component12() {
        return this.availableDate;
    }

    public final Date component13() {
        return this.freeAvailableDate;
    }

    public final Date component14() {
        return this.premiumAvailableDate;
    }

    public final List<EpisodeAdBreak> component17() {
        return this.episodeAdBreaks;
    }

    public final t component19() {
        return this.parentType;
    }

    public final String component2() {
        return this._channelId;
    }

    public final long component20() {
        return this.durationMs;
    }

    public final boolean component21() {
        return this.isDubbed;
    }

    public final boolean component22() {
        return this.isSubbed;
    }

    public final boolean component26() {
        return this.isOriginal;
    }

    public final String component3() {
        return this._title;
    }

    public final String component4() {
        return this._type;
    }

    public final String component5() {
        return this._description;
    }

    public final Images component6() {
        return this._images;
    }

    public final boolean component7() {
        return this.isMature;
    }

    public final boolean component8() {
        return this.isMatureBlocked;
    }

    public final ExtendedMaturityRating component9() {
        return this.extendedMaturityRating;
    }

    public final Movie copy(String str, String str2, String str3, String str4, String str5, Images images, boolean z, boolean z2, ExtendedMaturityRating extendedMaturityRating, boolean z3, boolean z4, Date date, Date date2, Date date3, MovieLinks movieLinks, String str6, List<EpisodeAdBreak> list, List<PlayableAssetVersion> list2, t tVar, long j, boolean z5, boolean z6, String str7, List<String> list3, String str8, boolean z7, String str9, List<String> list4, List<String> list5) {
        j.f(str, "_id");
        j.f(str2, "_channelId");
        j.f(str3, "_title");
        j.f(str5, "_description");
        j.f(tVar, "parentType");
        j.f(list5, "_subtitleLocales");
        return new Movie(str, str2, str3, str4, str5, images, z, z2, extendedMaturityRating, z3, z4, date, date2, date3, movieLinks, str6, list, list2, tVar, j, z5, z6, str7, list3, str8, z7, str9, list4, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Movie)) {
            return false;
        }
        Movie movie = (Movie) obj;
        if (j.a(this._id, movie._id) && j.a(this._channelId, movie._channelId) && j.a(this._title, movie._title) && j.a(this._type, movie._type) && j.a(this._description, movie._description) && j.a(this._images, movie._images) && this.isMature == movie.isMature && this.isMatureBlocked == movie.isMatureBlocked && j.a(this.extendedMaturityRating, movie.extendedMaturityRating) && this.isPremiumOnly == movie.isPremiumOnly && this.isAvailableOffline == movie.isAvailableOffline && j.a(this.availableDate, movie.availableDate) && j.a(this.freeAvailableDate, movie.freeAvailableDate) && j.a(this.premiumAvailableDate, movie.premiumAvailableDate) && j.a(this.links, movie.links) && j.a(this._movieListingId, movie._movieListingId) && j.a(this.episodeAdBreaks, movie.episodeAdBreaks) && j.a(this._versions, movie._versions) && this.parentType == movie.parentType && this.durationMs == movie.durationMs && this.isDubbed == movie.isDubbed && this.isSubbed == movie.isSubbed && j.a(this._audioLocale, movie._audioLocale) && j.a(this._subtitleLocale, movie._subtitleLocale) && j.a(this._variant, movie._variant) && this.isOriginal == movie.isOriginal && j.a(this._streamsLink, movie._streamsLink) && j.a(this._contentDescriptors, movie._contentDescriptors) && j.a(this._subtitleLocales, movie._subtitleLocales)) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String getAudioLocale() {
        String str = this._audioLocale;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getAvailableAudioLocales() {
        return f1.J(getAudioLocale());
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public Date getAvailableDate() {
        return this.availableDate;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getAvailableSubtitleLocales() {
        return this._subtitleLocales;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getContentDescriptors() {
        List<String> list = this._contentDescriptors;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    @Override // com.ellation.crunchyroll.model.DurationProvider
    public long getDurationMs() {
        return this.durationMs;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public List<EpisodeAdBreak> getEpisodeAdBreaks() {
        return this.episodeAdBreaks;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public ExtendedMaturityRating getExtendedMaturityRating() {
        return this.extendedMaturityRating;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public Date getFreeAvailableDate() {
        return this.freeAvailableDate;
    }

    public final String getMovieListingId() {
        String str = this._movieListingId;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public String getOriginalAudio() {
        String audioLocale = getAudioLocale();
        if (m.b0(audioLocale)) {
            return null;
        }
        return audioLocale;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String getParentId() {
        return getMovieListingId();
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public t getParentType() {
        return this.parentType;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public Date getPremiumAvailableDate() {
        return this.premiumAvailableDate;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public t getResourceType() {
        return this.resourceType;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String getStreamHref() {
        Href streamsHref;
        String str = this._streamsLink;
        if (str == null) {
            MovieLinks movieLinks = this.links;
            if (movieLinks != null && (streamsHref = movieLinks.getStreamsHref()) != null) {
                return streamsHref.getHref();
            }
            return null;
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String getVariant() {
        String str = this._variant;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public List<PlayableAssetVersion> getVersions() {
        List<PlayableAssetVersion> list = this._versions;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String get_channelId() {
        return this._channelId;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String get_description() {
        return this._description;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String get_id() {
        return this._id;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public Images get_images() {
        return this._images;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String get_title() {
        return this._title;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public String get_type() {
        return this._type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int b = a.b(this._title, a.b(this._channelId, this._id.hashCode() * 31, 31), 31);
        String str = this._type;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b2 = a.b(this._description, (b + hashCode) * 31, 31);
        Images images = this._images;
        if (images == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = images.hashCode();
        }
        int i2 = (b2 + hashCode2) * 31;
        boolean z = this.isMature;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i2 + i4) * 31;
        boolean z2 = this.isMatureBlocked;
        int i6 = z2;
        if (z2 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        if (extendedMaturityRating == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = extendedMaturityRating.hashCode();
        }
        int i8 = (i7 + hashCode3) * 31;
        boolean z3 = this.isPremiumOnly;
        int i9 = z3;
        if (z3 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z4 = this.isAvailableOffline;
        int i11 = z4;
        if (z4 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        Date date = this.availableDate;
        if (date == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Date date2 = this.freeAvailableDate;
        if (date2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date2.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        Date date3 = this.premiumAvailableDate;
        if (date3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = date3.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        MovieLinks movieLinks = this.links;
        if (movieLinks == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = movieLinks.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str2 = this._movieListingId;
        if (str2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str2.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        List<EpisodeAdBreak> list = this.episodeAdBreaks;
        if (list == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        List<PlayableAssetVersion> list2 = this._versions;
        if (list2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list2.hashCode();
        }
        int a = i.a(this.durationMs, l1.a(this.parentType, (i18 + hashCode10) * 31, 31), 31);
        boolean z5 = this.isDubbed;
        int i19 = z5;
        if (z5 != 0) {
            i19 = 1;
        }
        int i20 = (a + i19) * 31;
        boolean z6 = this.isSubbed;
        int i21 = z6;
        if (z6 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        String str3 = this._audioLocale;
        if (str3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str3.hashCode();
        }
        int i23 = (i22 + hashCode11) * 31;
        List<String> list3 = this._subtitleLocale;
        if (list3 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list3.hashCode();
        }
        int i24 = (i23 + hashCode12) * 31;
        String str4 = this._variant;
        if (str4 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str4.hashCode();
        }
        int i25 = (i24 + hashCode13) * 31;
        boolean z7 = this.isOriginal;
        if (!z7) {
            i3 = z7 ? 1 : 0;
        }
        int i26 = (i25 + i3) * 31;
        String str5 = this._streamsLink;
        if (str5 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str5.hashCode();
        }
        int i27 = (i26 + hashCode14) * 31;
        List<String> list4 = this._contentDescriptors;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return this._subtitleLocales.hashCode() + ((i27 + i) * 31);
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public boolean isAvailableOffline() {
        return this.isAvailableOffline;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isDubbed() {
        return this.isDubbed;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset, com.ellation.crunchyroll.model.LabeledContent
    public boolean isMature() {
        return this.isMature;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset, com.ellation.crunchyroll.model.LabeledContent
    public boolean isMatureBlocked() {
        return this.isMatureBlocked;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public boolean isOriginal() {
        return this.isOriginal;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAsset
    public boolean isPremiumOnly() {
        return this.isPremiumOnly;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isSubbed() {
        return this.isSubbed;
    }

    public String toString() {
        String str = this._id;
        String str2 = this._channelId;
        String str3 = this._title;
        String str4 = this._type;
        String str5 = this._description;
        Images images = this._images;
        boolean z = this.isMature;
        boolean z2 = this.isMatureBlocked;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        boolean z3 = this.isPremiumOnly;
        boolean z4 = this.isAvailableOffline;
        Date date = this.availableDate;
        Date date2 = this.freeAvailableDate;
        Date date3 = this.premiumAvailableDate;
        MovieLinks movieLinks = this.links;
        String str6 = this._movieListingId;
        List<EpisodeAdBreak> list = this.episodeAdBreaks;
        List<PlayableAssetVersion> list2 = this._versions;
        t tVar = this.parentType;
        long j = this.durationMs;
        boolean z5 = this.isDubbed;
        boolean z6 = this.isSubbed;
        String str7 = this._audioLocale;
        List<String> list3 = this._subtitleLocale;
        String str8 = this._variant;
        boolean z7 = this.isOriginal;
        String str9 = this._streamsLink;
        List<String> list4 = this._contentDescriptors;
        List<String> list5 = this._subtitleLocales;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("Movie(_id=", str, ", _channelId=", str2, ", _title=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", _type=", str4, ", _description=");
        b.append(str5);
        b.append(", _images=");
        b.append(images);
        b.append(", isMature=");
        b.append(z);
        b.append(", isMatureBlocked=");
        b.append(z2);
        b.append(", extendedMaturityRating=");
        b.append(extendedMaturityRating);
        b.append(", isPremiumOnly=");
        b.append(z3);
        b.append(", isAvailableOffline=");
        b.append(z4);
        b.append(", availableDate=");
        b.append(date);
        b.append(", freeAvailableDate=");
        b.append(date2);
        b.append(", premiumAvailableDate=");
        b.append(date3);
        b.append(", links=");
        b.append(movieLinks);
        b.append(", _movieListingId=");
        b.append(str6);
        b.append(", episodeAdBreaks=");
        b.append(list);
        b.append(", _versions=");
        b.append(list2);
        b.append(", parentType=");
        b.append(tVar);
        b.append(", durationMs=");
        b.append(j);
        b.append(", isDubbed=");
        b.append(z5);
        b.append(", isSubbed=");
        b.append(z6);
        b.append(", _audioLocale=");
        b.append(str7);
        b.append(", _subtitleLocale=");
        b.append(list3);
        b.append(", _variant=");
        b.append(str8);
        b.append(", isOriginal=");
        b.append(z7);
        b.append(", _streamsLink=");
        b.append(str9);
        b.append(", _contentDescriptors=");
        b.append(list4);
        b.append(", _subtitleLocales=");
        b.append(list5);
        b.append(")");
        return b.toString();
    }

    public /* synthetic */ Movie(String str, String str2, String str3, String str4, String str5, Images images, boolean z, boolean z2, ExtendedMaturityRating extendedMaturityRating, boolean z3, boolean z4, Date date, Date date2, Date date3, MovieLinks movieLinks, String str6, List list, List list2, t tVar, long j, boolean z5, boolean z6, String str7, List list3, String str8, boolean z7, String str9, List list4, List list5, int i, e eVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : images, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : extendedMaturityRating, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? false : z3, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? null : date, (i & 4096) != 0 ? null : date2, (i & 8192) != 0 ? null : date3, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : movieLinks, (i & 32768) != 0 ? null : str6, (i & Cast.MAX_MESSAGE_LENGTH) != 0 ? null : list, (i & 131072) != 0 ? null : list2, (i & 262144) != 0 ? t.MOVIE_LISTING : tVar, (i & 524288) != 0 ? 0L : j, (i & 1048576) != 0 ? false : z5, (i & 2097152) != 0 ? false : z6, (i & 4194304) != 0 ? null : str7, (i & 8388608) != 0 ? null : list3, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str8, (i & 33554432) != 0 ? false : z7, (i & 67108864) != 0 ? null : str9, (i & 134217728) != 0 ? null : list4, (i & 268435456) != 0 ? z.b : list5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Movie(String str, String str2, String str3, String str4, String str5, Images images, boolean z, boolean z2, ExtendedMaturityRating extendedMaturityRating, boolean z3, boolean z4, Date date, Date date2, Date date3, MovieLinks movieLinks, String str6, List<EpisodeAdBreak> list, List<PlayableAssetVersion> list2, t tVar, long j, boolean z5, boolean z6, String str7, List<String> list3, String str8, boolean z7, String str9, List<String> list4, List<String> list5) {
        super(null);
        j.f(str, "_id");
        j.f(str2, "_channelId");
        j.f(str3, "_title");
        j.f(str5, "_description");
        j.f(tVar, "parentType");
        j.f(list5, "_subtitleLocales");
        this._id = str;
        this._channelId = str2;
        this._title = str3;
        this._type = str4;
        this._description = str5;
        this._images = images;
        this.isMature = z;
        this.isMatureBlocked = z2;
        this.extendedMaturityRating = extendedMaturityRating;
        this.isPremiumOnly = z3;
        this.isAvailableOffline = z4;
        this.availableDate = date;
        this.freeAvailableDate = date2;
        this.premiumAvailableDate = date3;
        this.links = movieLinks;
        this._movieListingId = str6;
        this.episodeAdBreaks = list;
        this._versions = list2;
        this.parentType = tVar;
        this.durationMs = j;
        this.isDubbed = z5;
        this.isSubbed = z6;
        this._audioLocale = str7;
        this._subtitleLocale = list3;
        this._variant = str8;
        this.isOriginal = z7;
        this._streamsLink = str9;
        this._contentDescriptors = list4;
        this._subtitleLocales = list5;
        this.resourceType = t.MOVIE;
    }
}
