package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.api.model.Href;
import com.ellation.crunchyroll.model.links.PanelLinks;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
/* compiled from: Panel.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b<\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u008f\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010$¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0096\u0002\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010$HÆ\u0001¢\u0006\u0004\b(\u0010)J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020+HÖ\u0001J\u0013\u0010/\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÂ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÂ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0014HÂ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0016HÂ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0018HÂ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u001aHÂ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u001cHÂ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\"HÂ\u0003J\t\u0010?\u001a\u00020$HÂ\u0003J\u0012\u0010@\u001a\u0004\u0018\u00010$HÂ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010$HÂ\u0003¢\u0006\u0004\bB\u0010AR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010CR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010CR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010CR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010DR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010ER\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010CR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010FR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010GR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010HR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010IR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010JR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010K\u001a\u0004\bL\u0010MR$\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010C\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010 \u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010C\u001a\u0004\bR\u0010O\"\u0004\bS\u0010QR$\u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010C\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010VR\u0014\u0010%\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010WR\u0016\u0010&\u001a\u0004\u0018\u00010$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010XR\u0016\u0010'\u001a\u0004\u0018\u00010$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010XR\u0011\u0010Z\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bY\u0010OR\u0011\u0010\\\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b[\u0010OR\u0011\u0010^\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b]\u0010OR\u0011\u0010`\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b_\u0010OR\u0011\u0010b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\ba\u0010OR\u0011\u0010d\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bc\u0010OR\u0013\u0010f\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\be\u0010OR\u0011\u0010i\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020k0j8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020k0j8F¢\u0006\u0006\u001a\u0004\bo\u0010mR\u0014\u0010s\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0011\u0010t\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0011\u0010y\u001a\u00020v8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0011\u0010|\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0011\u0010\u007f\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0014\u0010\u0082\u0001\u001a\u00020\u00168F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0014\u0010\u0085\u0001\u001a\u00020\u00188F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0086\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010uR\u0016\u0010\u0087\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010uR\u0016\u0010\u0088\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010uR\u0016\u0010\u0089\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010uR\u001a\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u008f\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010j8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010mR\u0013\u0010\u0090\u0001\u001a\u00020$8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010uR\u0013\u0010\u0091\u0001\u001a\u00020$8F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010uR*\u0010\u0097\u0001\u001a\u00020\"2\u0007\u0010\u0092\u0001\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010OR\u001c\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050j8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010mR\u001c\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050j8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010mR\u0015\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010OR\u001c\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020k0j8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010mR\u0018\u0010¥\u0001\u001a\u00030¢\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001¨\u0006¨\u0001"}, d2 = {"Lcom/ellation/crunchyroll/model/Panel;", "Ljava/io/Serializable;", "Lcom/ellation/crunchyroll/model/LabeledContent;", "Ljava/util/Date;", "component15", "", "component16", "component17", "component18", "_id", "_title", "_promoTitle", "_channelId", "_description", "_promoDescription", "Lcom/ellation/crunchyroll/model/Images;", "_images", "Lcom/ellation/crunchyroll/model/links/PanelLinks;", "_links", "_streamsLink", "Lcom/ellation/crunchyroll/model/EpisodeMetadata;", "_episodeMetadata", "Lcom/ellation/crunchyroll/model/MovieListingMetadata;", "_movieListingMetadata", "Lcom/ellation/crunchyroll/model/MovieMetadata;", "_movieMetadata", "Lcom/ellation/crunchyroll/model/SeriesMetadata;", "_seriesMetadata", "Lcom/amazon/aps/iva/x50/t;", "type", "lastUpdated", "feedType", "feedTitle", "feedId", "Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistStatus;", "_watchlistStatus", "", "isInWatchlist", AppSettingsData.STATUS_NEW, "newContent", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/model/Images;Lcom/ellation/crunchyroll/model/links/PanelLinks;Ljava/lang/String;Lcom/ellation/crunchyroll/model/EpisodeMetadata;Lcom/ellation/crunchyroll/model/MovieListingMetadata;Lcom/ellation/crunchyroll/model/MovieMetadata;Lcom/ellation/crunchyroll/model/SeriesMetadata;Lcom/amazon/aps/iva/x50/t;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistStatus;ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/ellation/crunchyroll/model/Panel;", "toString", "", "hashCode", "", "other", "equals", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component19", "component20", "component21", "()Ljava/lang/Boolean;", "component22", "Ljava/lang/String;", "Lcom/ellation/crunchyroll/model/Images;", "Lcom/ellation/crunchyroll/model/links/PanelLinks;", "Lcom/ellation/crunchyroll/model/EpisodeMetadata;", "Lcom/ellation/crunchyroll/model/MovieListingMetadata;", "Lcom/ellation/crunchyroll/model/MovieMetadata;", "Lcom/ellation/crunchyroll/model/SeriesMetadata;", "Lcom/amazon/aps/iva/x50/t;", "Ljava/util/Date;", "getLastUpdated", "()Ljava/util/Date;", "getFeedType", "()Ljava/lang/String;", "setFeedType", "(Ljava/lang/String;)V", "getFeedTitle", "setFeedTitle", "getFeedId", "setFeedId", "Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistStatus;", "Z", "Ljava/lang/Boolean;", "getId", "id", "getChannelId", "channelId", "getTitle", "title", "getDescription", MediaTrack.ROLE_DESCRIPTION, "getPromoTitle", "promoTitle", "getPromoDescription", "promoDescription", "getStreamHref", "streamHref", "getImages", "()Lcom/ellation/crunchyroll/model/Images;", "images", "", "Lcom/ellation/crunchyroll/api/etp/model/Image;", "getThumbnails", "()Ljava/util/List;", "thumbnails", "getContinueWatchingImages", "continueWatchingImages", "getResourceType", "()Lcom/amazon/aps/iva/x50/t;", "resourceType", "isNew", "()Z", "Lcom/ellation/crunchyroll/model/PlayableAssetPanelMetadata;", "getMetadata", "()Lcom/ellation/crunchyroll/model/PlayableAssetPanelMetadata;", "metadata", "getSeriesMetadata", "()Lcom/ellation/crunchyroll/model/SeriesMetadata;", "seriesMetadata", "getEpisodeMetadata", "()Lcom/ellation/crunchyroll/model/EpisodeMetadata;", "episodeMetadata", "getMovieListingMetadata", "()Lcom/ellation/crunchyroll/model/MovieListingMetadata;", "movieListingMetadata", "getMovieMetadata", "()Lcom/ellation/crunchyroll/model/MovieMetadata;", "movieMetadata", "isMature", "isMatureBlocked", "isDubbed", "isSubbed", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "extendedMaturityRating", "getContentDescriptors", "contentDescriptors", "isAvailableOffline", "isEpisode", "value", "getWatchlistStatus", "()Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistStatus;", "setWatchlistStatus", "(Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistStatus;)V", "watchlistStatus", "getOriginalAudio", "originalAudio", "getAvailableSubtitleLocales", "availableSubtitleLocales", "getAvailableAudioLocales", "availableAudioLocales", "getEpisodeAudioLocale", "episodeAudioLocale", "getPosterWide", "posterWide", "Lcom/ellation/crunchyroll/model/PanelMetadata;", "getPanelMetadata", "()Lcom/ellation/crunchyroll/model/PanelMetadata;", "panelMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/model/Images;Lcom/ellation/crunchyroll/model/links/PanelLinks;Ljava/lang/String;Lcom/ellation/crunchyroll/model/EpisodeMetadata;Lcom/ellation/crunchyroll/model/MovieListingMetadata;Lcom/ellation/crunchyroll/model/MovieMetadata;Lcom/ellation/crunchyroll/model/SeriesMetadata;Lcom/amazon/aps/iva/x50/t;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistStatus;ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Panel implements Serializable, LabeledContent {
    public static final int $stable = 8;
    @SerializedName("channel_id")
    private final String _channelId;
    @SerializedName(MediaTrack.ROLE_DESCRIPTION)
    private final String _description;
    @SerializedName("episode_metadata")
    private final EpisodeMetadata _episodeMetadata;
    @SerializedName("id")
    private final String _id;
    @SerializedName("images")
    private final Images _images;
    @SerializedName("__links__")
    private final PanelLinks _links;
    @SerializedName("movie_listing_metadata")
    private final MovieListingMetadata _movieListingMetadata;
    @SerializedName("movie_metadata")
    private final MovieMetadata _movieMetadata;
    @SerializedName("promo_description")
    private final String _promoDescription;
    @SerializedName("promo_title")
    private final String _promoTitle;
    @SerializedName("series_metadata")
    private final SeriesMetadata _seriesMetadata;
    @SerializedName("streams_link")
    private final String _streamsLink;
    @SerializedName("title")
    private final String _title;
    @SerializedName("watchlist_status")
    private WatchlistStatus _watchlistStatus;
    private String feedId;
    private String feedTitle;
    private String feedType;
    @SerializedName("in_watchlist")
    private final boolean isInWatchlist;
    @SerializedName("last_public")
    private final Date lastUpdated;
    @SerializedName(AppSettingsData.STATUS_NEW)

    /* renamed from: new  reason: not valid java name */
    private final Boolean f8new;
    @SerializedName("new_content")
    private final Boolean newContent;
    @SerializedName("type")
    private final t type;

    /* compiled from: Panel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.MOVIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.EPISODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Panel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 4194303, null);
    }

    private final String component1() {
        return this._id;
    }

    private final EpisodeMetadata component10() {
        return this._episodeMetadata;
    }

    private final MovieListingMetadata component11() {
        return this._movieListingMetadata;
    }

    private final MovieMetadata component12() {
        return this._movieMetadata;
    }

    private final SeriesMetadata component13() {
        return this._seriesMetadata;
    }

    private final t component14() {
        return this.type;
    }

    private final WatchlistStatus component19() {
        return this._watchlistStatus;
    }

    private final String component2() {
        return this._title;
    }

    private final boolean component20() {
        return this.isInWatchlist;
    }

    private final Boolean component21() {
        return this.f8new;
    }

    private final Boolean component22() {
        return this.newContent;
    }

    private final String component3() {
        return this._promoTitle;
    }

    private final String component4() {
        return this._channelId;
    }

    private final String component5() {
        return this._description;
    }

    private final String component6() {
        return this._promoDescription;
    }

    private final Images component7() {
        return this._images;
    }

    private final PanelLinks component8() {
        return this._links;
    }

    private final String component9() {
        return this._streamsLink;
    }

    private final PanelMetadata getPanelMetadata() {
        SeriesMetadata seriesMetadata = this._seriesMetadata;
        if (seriesMetadata == null) {
            MovieListingMetadata movieListingMetadata = this._movieListingMetadata;
            if (movieListingMetadata == null) {
                return getMetadata();
            }
            return movieListingMetadata;
        }
        return seriesMetadata;
    }

    private final List<Image> getPosterWide() {
        List<Image> postersWide;
        Images images = this._images;
        if (images == null || (postersWide = images.getPostersWide()) == null) {
            return z.b;
        }
        return postersWide;
    }

    public final Date component15() {
        return this.lastUpdated;
    }

    public final String component16() {
        return this.feedType;
    }

    public final String component17() {
        return this.feedTitle;
    }

    public final String component18() {
        return this.feedId;
    }

    public final Panel copy(String str, String str2, String str3, String str4, String str5, String str6, Images images, PanelLinks panelLinks, String str7, EpisodeMetadata episodeMetadata, MovieListingMetadata movieListingMetadata, MovieMetadata movieMetadata, SeriesMetadata seriesMetadata, t tVar, Date date, String str8, String str9, String str10, WatchlistStatus watchlistStatus, boolean z, Boolean bool, Boolean bool2) {
        return new Panel(str, str2, str3, str4, str5, str6, images, panelLinks, str7, episodeMetadata, movieListingMetadata, movieMetadata, seriesMetadata, tVar, date, str8, str9, str10, watchlistStatus, z, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Panel)) {
            return false;
        }
        Panel panel = (Panel) obj;
        if (j.a(this._id, panel._id) && j.a(this._title, panel._title) && j.a(this._promoTitle, panel._promoTitle) && j.a(this._channelId, panel._channelId) && j.a(this._description, panel._description) && j.a(this._promoDescription, panel._promoDescription) && j.a(this._images, panel._images) && j.a(this._links, panel._links) && j.a(this._streamsLink, panel._streamsLink) && j.a(this._episodeMetadata, panel._episodeMetadata) && j.a(this._movieListingMetadata, panel._movieListingMetadata) && j.a(this._movieMetadata, panel._movieMetadata) && j.a(this._seriesMetadata, panel._seriesMetadata) && this.type == panel.type && j.a(this.lastUpdated, panel.lastUpdated) && j.a(this.feedType, panel.feedType) && j.a(this.feedTitle, panel.feedTitle) && j.a(this.feedId, panel.feedId) && this._watchlistStatus == panel._watchlistStatus && this.isInWatchlist == panel.isInWatchlist && j.a(this.f8new, panel.f8new) && j.a(this.newContent, panel.newContent)) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getAvailableAudioLocales() {
        List<String> availableAudioLocales = getPanelMetadata().getAvailableAudioLocales();
        if (availableAudioLocales == null) {
            return z.b;
        }
        return availableAudioLocales;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getAvailableSubtitleLocales() {
        List<String> availableSubtitleLocales = getPanelMetadata().getAvailableSubtitleLocales();
        if (availableSubtitleLocales == null) {
            return z.b;
        }
        return availableSubtitleLocales;
    }

    public final String getChannelId() {
        String str = this._channelId;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getContentDescriptors() {
        return getPanelMetadata().getContentDescriptors();
    }

    public final List<Image> getContinueWatchingImages() {
        List<Image> thumbnails = getThumbnails();
        if (thumbnails.isEmpty()) {
            thumbnails = getPosterWide();
        }
        return thumbnails;
    }

    public final String getDescription() {
        String str = this._description;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getEpisodeAudioLocale() {
        EpisodeMetadata episodeMetadata = this._episodeMetadata;
        if (episodeMetadata != null) {
            return episodeMetadata.getAudioLocale();
        }
        return null;
    }

    public final EpisodeMetadata getEpisodeMetadata() {
        EpisodeMetadata episodeMetadata = this._episodeMetadata;
        if (episodeMetadata == null) {
            return new EpisodeMetadata(null, null, 0L, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, null, null, null, null, 8388607, null);
        }
        return episodeMetadata;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public ExtendedMaturityRating getExtendedMaturityRating() {
        return getPanelMetadata().getExtendedMaturityRating();
    }

    public final String getFeedId() {
        return this.feedId;
    }

    public final String getFeedTitle() {
        return this.feedTitle;
    }

    public final String getFeedType() {
        return this.feedType;
    }

    public final String getId() {
        String str = this._id;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final Images getImages() {
        Images images = this._images;
        if (images == null) {
            return new Images(null, null, null, null, 15, null);
        }
        return images;
    }

    public final Date getLastUpdated() {
        return this.lastUpdated;
    }

    public final PlayableAssetPanelMetadata getMetadata() {
        EpisodeMetadata episodeMetadata = this._episodeMetadata;
        if (episodeMetadata == null) {
            MovieMetadata movieMetadata = this._movieMetadata;
            if (movieMetadata == null) {
                return EmptyPlayableAssetPanelMetadata.INSTANCE;
            }
            return movieMetadata;
        }
        return episodeMetadata;
    }

    public final MovieListingMetadata getMovieListingMetadata() {
        MovieListingMetadata movieListingMetadata = this._movieListingMetadata;
        if (movieListingMetadata == null) {
            return new MovieListingMetadata(0L, false, false, false, false, null, null, null, null, 511, null);
        }
        return movieListingMetadata;
    }

    public final MovieMetadata getMovieMetadata() {
        MovieMetadata movieMetadata = this._movieMetadata;
        if (movieMetadata == null) {
            return new MovieMetadata(null, null, null, null, null, 0L, false, false, false, false, false, false, null, null, null, null, null, 131071, null);
        }
        return movieMetadata;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public String getOriginalAudio() {
        return getPanelMetadata().getOriginalAudio();
    }

    public final String getPromoDescription() {
        String str = this._promoDescription;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getPromoTitle() {
        String str = this._promoTitle;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public t getResourceType() {
        t tVar = this.type;
        if (tVar == null) {
            return t.UNDEFINED;
        }
        return tVar;
    }

    public final SeriesMetadata getSeriesMetadata() {
        SeriesMetadata seriesMetadata = this._seriesMetadata;
        if (seriesMetadata == null) {
            return new SeriesMetadata(0, 0, null, false, false, false, false, null, null, null, null, 2047, null);
        }
        return seriesMetadata;
    }

    public final String getStreamHref() {
        Href streams;
        String str = this._streamsLink;
        if (str == null) {
            PanelLinks panelLinks = this._links;
            if (panelLinks != null && (streams = panelLinks.getStreams()) != null) {
                return streams.getHref();
            }
            return null;
        }
        return str;
    }

    public final List<Image> getThumbnails() {
        List<Image> thumbnails;
        Images images = this._images;
        if (images == null || (thumbnails = images.getThumbnails()) == null) {
            return z.b;
        }
        return thumbnails;
    }

    public final String getTitle() {
        String str = this._title;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final WatchlistStatus getWatchlistStatus() {
        WatchlistStatus watchlistStatus = this._watchlistStatus;
        if (watchlistStatus == null) {
            if (this.isInWatchlist) {
                return WatchlistStatus.IN_WATCHLIST;
            }
            return WatchlistStatus.NOT_IN_WATCHLIST;
        }
        return watchlistStatus;
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
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        String str = this._id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._title;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this._promoTitle;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this._channelId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this._description;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this._promoDescription;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Images images = this._images;
        if (images == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = images.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        PanelLinks panelLinks = this._links;
        if (panelLinks == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = panelLinks.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str7 = this._streamsLink;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        EpisodeMetadata episodeMetadata = this._episodeMetadata;
        if (episodeMetadata == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = episodeMetadata.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        MovieListingMetadata movieListingMetadata = this._movieListingMetadata;
        if (movieListingMetadata == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = movieListingMetadata.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        MovieMetadata movieMetadata = this._movieMetadata;
        if (movieMetadata == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = movieMetadata.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        SeriesMetadata seriesMetadata = this._seriesMetadata;
        if (seriesMetadata == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = seriesMetadata.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        t tVar = this.type;
        if (tVar == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = tVar.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        Date date = this.lastUpdated;
        if (date == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = date.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        String str8 = this.feedType;
        if (str8 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str8.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        String str9 = this.feedTitle;
        if (str9 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str9.hashCode();
        }
        int i18 = (i17 + hashCode17) * 31;
        String str10 = this.feedId;
        if (str10 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str10.hashCode();
        }
        int i19 = (i18 + hashCode18) * 31;
        WatchlistStatus watchlistStatus = this._watchlistStatus;
        if (watchlistStatus == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = watchlistStatus.hashCode();
        }
        int i20 = (i19 + hashCode19) * 31;
        boolean z = this.isInWatchlist;
        int i21 = z;
        if (z != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        Boolean bool = this.f8new;
        if (bool == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = bool.hashCode();
        }
        int i23 = (i22 + hashCode20) * 31;
        Boolean bool2 = this.newContent;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i23 + i;
    }

    public final boolean isAvailableOffline() {
        int i = WhenMappings.$EnumSwitchMapping$0[getResourceType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return getEpisodeMetadata().isAvailableOffline();
        }
        return getMovieMetadata().isAvailableOffline();
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isDubbed() {
        return getPanelMetadata().isDubbed();
    }

    public final boolean isEpisode() {
        if (getResourceType() == t.EPISODE) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isMature() {
        return getPanelMetadata().isMature();
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isMatureBlocked() {
        return getPanelMetadata().isMatureBlocked();
    }

    public final boolean isNew() {
        Boolean bool = this.newContent;
        if (bool != null || (bool = this.f8new) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isSubbed() {
        return getPanelMetadata().isSubbed();
    }

    public final void setFeedId(String str) {
        this.feedId = str;
    }

    public final void setFeedTitle(String str) {
        this.feedTitle = str;
    }

    public final void setFeedType(String str) {
        this.feedType = str;
    }

    public final void setWatchlistStatus(WatchlistStatus watchlistStatus) {
        j.f(watchlistStatus, "value");
        this._watchlistStatus = watchlistStatus;
    }

    public String toString() {
        String str = this._id;
        String str2 = this._title;
        String str3 = this._promoTitle;
        String str4 = this._channelId;
        String str5 = this._description;
        String str6 = this._promoDescription;
        Images images = this._images;
        PanelLinks panelLinks = this._links;
        String str7 = this._streamsLink;
        EpisodeMetadata episodeMetadata = this._episodeMetadata;
        MovieListingMetadata movieListingMetadata = this._movieListingMetadata;
        MovieMetadata movieMetadata = this._movieMetadata;
        SeriesMetadata seriesMetadata = this._seriesMetadata;
        t tVar = this.type;
        Date date = this.lastUpdated;
        String str8 = this.feedType;
        String str9 = this.feedTitle;
        String str10 = this.feedId;
        WatchlistStatus watchlistStatus = this._watchlistStatus;
        boolean z = this.isInWatchlist;
        Boolean bool = this.f8new;
        Boolean bool2 = this.newContent;
        StringBuilder b = a.b("Panel(_id=", str, ", _title=", str2, ", _promoTitle=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", _channelId=", str4, ", _description=");
        com.amazon.aps.iva.m80.a.c(b, str5, ", _promoDescription=", str6, ", _images=");
        b.append(images);
        b.append(", _links=");
        b.append(panelLinks);
        b.append(", _streamsLink=");
        b.append(str7);
        b.append(", _episodeMetadata=");
        b.append(episodeMetadata);
        b.append(", _movieListingMetadata=");
        b.append(movieListingMetadata);
        b.append(", _movieMetadata=");
        b.append(movieMetadata);
        b.append(", _seriesMetadata=");
        b.append(seriesMetadata);
        b.append(", type=");
        b.append(tVar);
        b.append(", lastUpdated=");
        b.append(date);
        b.append(", feedType=");
        b.append(str8);
        b.append(", feedTitle=");
        com.amazon.aps.iva.m80.a.c(b, str9, ", feedId=", str10, ", _watchlistStatus=");
        b.append(watchlistStatus);
        b.append(", isInWatchlist=");
        b.append(z);
        b.append(", new=");
        b.append(bool);
        b.append(", newContent=");
        b.append(bool2);
        b.append(")");
        return b.toString();
    }

    public Panel(String str, String str2, String str3, String str4, String str5, String str6, Images images, PanelLinks panelLinks, String str7, EpisodeMetadata episodeMetadata, MovieListingMetadata movieListingMetadata, MovieMetadata movieMetadata, SeriesMetadata seriesMetadata, t tVar, Date date, String str8, String str9, String str10, WatchlistStatus watchlistStatus, boolean z, Boolean bool, Boolean bool2) {
        this._id = str;
        this._title = str2;
        this._promoTitle = str3;
        this._channelId = str4;
        this._description = str5;
        this._promoDescription = str6;
        this._images = images;
        this._links = panelLinks;
        this._streamsLink = str7;
        this._episodeMetadata = episodeMetadata;
        this._movieListingMetadata = movieListingMetadata;
        this._movieMetadata = movieMetadata;
        this._seriesMetadata = seriesMetadata;
        this.type = tVar;
        this.lastUpdated = date;
        this.feedType = str8;
        this.feedTitle = str9;
        this.feedId = str10;
        this._watchlistStatus = watchlistStatus;
        this.isInWatchlist = z;
        this.f8new = bool;
        this.newContent = bool2;
    }

    public /* synthetic */ Panel(String str, String str2, String str3, String str4, String str5, String str6, Images images, PanelLinks panelLinks, String str7, EpisodeMetadata episodeMetadata, MovieListingMetadata movieListingMetadata, MovieMetadata movieMetadata, SeriesMetadata seriesMetadata, t tVar, Date date, String str8, String str9, String str10, WatchlistStatus watchlistStatus, boolean z, Boolean bool, Boolean bool2, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : images, (i & 128) != 0 ? null : panelLinks, (i & 256) != 0 ? null : str7, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : episodeMetadata, (i & 1024) != 0 ? null : movieListingMetadata, (i & 2048) != 0 ? null : movieMetadata, (i & 4096) != 0 ? null : seriesMetadata, (i & 8192) != 0 ? null : tVar, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : date, (i & 32768) != 0 ? null : str8, (i & Cast.MAX_MESSAGE_LENGTH) != 0 ? null : str9, (i & 131072) != 0 ? null : str10, (i & 262144) != 0 ? null : watchlistStatus, (i & 524288) != 0 ? false : z, (i & 1048576) != 0 ? null : bool, (i & 2097152) != 0 ? null : bool2);
    }
}
