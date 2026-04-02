package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lf0.a;
import com.amazon.aps.iva.lf0.b;
import com.amazon.aps.iva.lf0.f;
import com.amazon.aps.iva.lf0.k;
import com.amazon.aps.iva.lf0.n;
import com.amazon.aps.iva.lf0.o;
import com.amazon.aps.iva.lf0.p;
import com.amazon.aps.iva.lf0.s;
import com.amazon.aps.iva.lf0.t;
import com.amazon.aps.iva.lf0.u;
import com.amazon.aps.iva.lf0.y;
import com.amazon.aps.iva.ob0.d;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.cms.model.SeasonsMetadata;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.api.etp.content.model.SavePlayheadBatchBody;
import com.ellation.crunchyroll.api.etp.content.model.SavePlayheadBody;
import com.ellation.crunchyroll.api.etp.content.model.UpdateWatchlistItemFavoriteStatusBody;
import com.ellation.crunchyroll.api.etp.content.model.WatchHistoryMetadata;
import com.ellation.crunchyroll.api.etp.content.model.WatchHistoryPanel;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistItem;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistItemBody;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CreatedCustomList;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItemPositionUpdateRequest;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItemRequest;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItems;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItemsOrderType;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItemsSortType;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListRequest;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomLists;
import com.ellation.crunchyroll.api.model.ContinueWatchingPanel;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.RawSimulcastSeason;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.MovieListing;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.Series;
import com.ellation.crunchyroll.model.UpNext;
import com.ellation.crunchyroll.model.UpNextPanel;
import com.ellation.crunchyroll.model.browse.BrowseSectionItem;
import com.ellation.crunchyroll.model.categories.Category;
import com.ellation.crunchyroll.model.music.Artist;
import com.ellation.crunchyroll.model.music.MusicConcert;
import com.ellation.crunchyroll.model.music.MusicVideo;
import com.ellation.crunchyroll.model.search.SearchResponse;
import com.ellation.crunchyroll.model.watchlist.WatchlistPanel;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: EtpContentService.kt */
@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J7\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJM\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014Jq\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0003\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010 \u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J=\u0010'\u001a\u00020&2\b\b\u0001\u0010#\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010$\u001a\u00020\u00022\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J+\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0014J7\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J+\u0010.\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00070\u0005H§@ø\u0001\u0000¢\u0006\u0004\b1\u00102J)\u00104\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u00103\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014JI\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u000b2\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b5\u00106J/\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00070\u00050\u00112\b\b\u0001\u00107\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b9\u0010\u0014J/\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00070\u00050\u00112\b\b\u0001\u0010:\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b;\u0010\u0014J/\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00070\u00050\u00112\b\b\u0001\u0010<\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b>\u0010\u0014J)\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u00107\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b@\u0010\u0014J)\u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010:\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\bB\u0010\u0014J)\u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010C\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\bE\u0010\u0014J)\u0010G\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020F0\u00052\b\b\u0001\u00107\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\bG\u0010\u0014J)\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\bI\u0010\u0014J)\u0010J\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\bJ\u0010\u0014J#\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010L\u001a\u00020KH§@ø\u0001\u0000¢\u0006\u0004\bM\u0010NJ#\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010L\u001a\u00020OH§@ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ#\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010S\u001a\u00020RH§@ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ-\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010V\u001a\u00020\u000b2\b\b\u0001\u0010X\u001a\u00020WH§@ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ#\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010V\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b[\u0010\u0014J)\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b]\u0010\u0014J\u001f\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u00070\u0005H§@ø\u0001\u0000¢\u0006\u0004\b]\u00102J)\u0010a\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`0\u00052\b\b\u0001\u0010^\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ)\u0010a\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`0\u00052\b\b\u0001\u0010)\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\ba\u0010\u0014J#\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\bc\u0010\u0014J\u0019\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H§@ø\u0001\u0000¢\u0006\u0004\bd\u00102J\u001f\u0010f\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u00070\u0005H§@ø\u0001\u0000¢\u0006\u0004\bf\u00102J)\u0010j\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010h\u001a\u00020gH§@ø\u0001\u0000¢\u0006\u0004\bj\u0010kJ\u0013\u0010m\u001a\u00020lH§@ø\u0001\u0000¢\u0006\u0004\bm\u00102JE\u0010u\u001a\u00020t2\b\b\u0001\u0010n\u001a\u00020\u000b2\b\b\u0001\u0010o\u001a\u00020\u00022\b\b\u0003\u0010^\u001a\u00020\u00022\b\b\u0003\u0010q\u001a\u00020p2\b\b\u0003\u0010s\u001a\u00020rH§@ø\u0001\u0000¢\u0006\u0004\bu\u0010vJ-\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010n\u001a\u00020\u000b2\b\b\u0001\u0010S\u001a\u00020wH§@ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ-\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010n\u001a\u00020\u000b2\b\b\u0001\u0010V\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\bz\u0010{J-\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010n\u001a\u00020\u000b2\b\b\u0001\u0010h\u001a\u00020gH§@ø\u0001\u0000¢\u0006\u0004\b|\u0010}J#\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b~\u0010\u0014J;\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010n\u001a\u00020\u000b2\b\b\u0001\u0010V\u001a\u00020\u000b2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u007fH§@ø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J9\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0005\b\u0083\u0001\u0010\tJ-\u0010\u0086\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0004\u0012\u00020\u00070\u00052\t\b\u0001\u0010\u0084\u0001\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u0086\u0001\u0010\u0014J-\u0010\u0089\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0088\u0001\u0012\u0004\u0012\u00020\u00070\u00052\t\b\u0001\u0010\u0087\u0001\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u0089\u0001\u0010\u0014J-\u0010\u008b\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0004\u0012\u00020\u00070\u00052\t\b\u0001\u0010\u0087\u0001\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u008b\u0001\u0010\u0014J-\u0010\u008d\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0088\u0001\u0012\u0004\u0012\u00020\u00070\u00052\t\b\u0001\u0010\u008c\u0001\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u008d\u0001\u0010\u0014J-\u0010\u008f\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0004\u0012\u00020\u00070\u00052\t\b\u0001\u0010\u008e\u0001\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u008f\u0001\u0010\u0014J,\u0010\u0090\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0088\u0001\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010V\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u0090\u0001\u0010\u0014J,\u0010\u0092\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0091\u0001\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010<\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u0092\u0001\u0010\u0014J-\u0010\u0095\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0094\u0001\u0012\u0004\u0012\u00020\u00070\u00052\t\b\u0001\u0010\u0093\u0001\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u0095\u0001\u0010\u0014J,\u0010\u0096\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0091\u0001\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010C\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u0096\u0001\u0010\u0014J,\u0010\u0097\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0094\u0001\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010:\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u0097\u0001\u0010\u0014J9\u0010\u009a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u00052\t\b\u0001\u0010\u0098\u0001\u001a\u00020\u000b2\u000b\b\u0003\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u009a\u0001\u0010{J,\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u00052\t\b\u0001\u0010\u0098\u0001\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0014J,\u0010\u009c\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u00052\t\b\u0001\u0010\u0098\u0001\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0005\b\u009c\u0001\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009d\u0001"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "", "", "start", "numberOfResults", "Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "Lcom/ellation/crunchyroll/api/model/HomeFeedItemRaw;", "Lcom/ellation/crunchyroll/api/etp/content/EmptyMeta;", "getHomeFeed", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "", "", "sortAndFilter", "Lcom/ellation/crunchyroll/model/watchlist/WatchlistPanel;", "getWatchlist", "(Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Integer;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "contentIds", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/amazon/aps/iva/kb0/q;", "markAsWatched", "(Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "offset", "titlesStartWith", "sortAndFilters", "categories", "season", "Lcom/ellation/crunchyroll/model/Panel;", "getBrowseAll", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/model/browse/BrowseSectionItem;", "getBrowseIndex", "(Ljava/util/Map;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "panelId", "getSimilar", "(Ljava/lang/String;ILcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", SearchIntents.EXTRA_QUERY, "startFrom", "type", "Lcom/ellation/crunchyroll/model/search/SearchResponse;", FirebaseAnalytics.Event.SEARCH, "(Ljava/lang/String;IILjava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", ImagesContract.URL, "getCollection", "Lcom/ellation/crunchyroll/api/model/ContinueWatchingPanel;", "getContinueWatching", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "getContinueWatchingPanels", "(Ljava/lang/Integer;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/model/categories/Category;", "getCategories", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "parentCategoryId", "getSubcategories", "getBrowseByCategories", "(Ljava/lang/String;Ljava/util/Map;ILcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "seriesId", "Lcom/ellation/crunchyroll/model/UpNext;", "getUpNextEpisode", "movieListingId", "getUpNextMovie", "episodeId", "Lcom/ellation/crunchyroll/model/UpNextPanel;", "getNextEpisodePanel", "Lcom/ellation/crunchyroll/model/Series;", "getSeries", "Lcom/ellation/crunchyroll/model/MovieListing;", "getMovieListing", "seasonId", "Lcom/ellation/crunchyroll/api/cms/model/Season;", "getSeason", "Lcom/ellation/crunchyroll/api/cms/model/SeasonsMetadata;", "getSeasons", "Lcom/ellation/crunchyroll/api/etp/content/model/Playhead;", "getPlayheads", "getPlayheadsUnsynced", "Lcom/ellation/crunchyroll/api/etp/content/model/SavePlayheadBody;", "playheadBody", "savePlayhead", "(Lcom/ellation/crunchyroll/api/etp/content/model/SavePlayheadBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/content/model/SavePlayheadBatchBody;", "savePlayheadBatch", "(Lcom/ellation/crunchyroll/api/etp/content/model/SavePlayheadBatchBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistItemBody;", "item", "addWatchlistItem", "(Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistItemBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "contentId", "Lcom/ellation/crunchyroll/api/etp/content/model/UpdateWatchlistItemFavoriteStatusBody;", "body", "updateWatchlistItemFavoriteStatus", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/content/model/UpdateWatchlistItemFavoriteStatusBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deleteWatchlistItem", "Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistItem;", "getWatchlistItems", "pageSize", "Lcom/ellation/crunchyroll/api/etp/content/model/WatchHistoryPanel;", "Lcom/ellation/crunchyroll/api/etp/content/model/WatchHistoryMetadata;", "getWatchHistory", "(ILcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deleteHistoryItems", "deleteHistory", "Lcom/ellation/crunchyroll/api/model/RawSimulcastSeason;", "getSeasonList", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListRequest;", "list", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CreatedCustomList;", "createPrivateCustomList", "(Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListRequest;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomLists;", "getCustomLists", "listId", "page", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemsSortType;", "sortBy", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemsOrderType;", "order", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItems;", "getCustomListItems", "(Ljava/lang/String;IILcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemsSortType;Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemsOrderType;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemRequest;", "addItemToCustomList", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemRequest;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deleteItemFromCustomList", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "updateCustomList", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListRequest;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deletePrivateCustomList", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemPositionUpdateRequest;", "positionUpdateRequest", "changeCustomListItemPosition", "(Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemPositionUpdateRequest;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "getMusicLandingFeed", "artistIds", "Lcom/ellation/crunchyroll/model/music/Artist;", "getArtists", "artistId", "Lcom/ellation/crunchyroll/model/music/MusicVideo;", "getArtistMusicVideos", "Lcom/ellation/crunchyroll/model/music/MusicConcert;", "getArtistMusicConcerts", "musicVideoIds", "getMusicVideos", "concertsIds", "getMusicConcerts", "getFeaturedMusicVideos", "Lcom/ellation/crunchyroll/model/Episode;", "getEpisode", "movieId", "Lcom/ellation/crunchyroll/model/Movie;", "getMovie", "getEpisodes", "getMovies", "panelIds", "fields", "getPanels", "getPanelIds", "getPanelImages", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface EtpContentService {

    /* compiled from: EtpContentService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getBrowseAll$default(EtpContentService etpContentService, Integer num, Integer num2, String str, Map map, String str2, String str3, d dVar, int i, Object obj) {
            Integer num3;
            Integer num4;
            String str4;
            a0 a0Var;
            String str5;
            String str6;
            if (obj == null) {
                if ((i & 1) != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if ((i & 2) != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if ((i & 4) != 0) {
                    str4 = null;
                } else {
                    str4 = str;
                }
                if ((i & 8) != 0) {
                    a0Var = a0.b;
                } else {
                    a0Var = map;
                }
                if ((i & 16) != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if ((i & 32) != 0) {
                    str6 = null;
                } else {
                    str6 = str3;
                }
                return etpContentService.getBrowseAll(num3, num4, str4, a0Var, str5, str6, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBrowseAll");
        }

        public static /* synthetic */ Object getContinueWatching$default(EtpContentService etpContentService, String str, Integer num, d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    num = null;
                }
                return etpContentService.getContinueWatching(str, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContinueWatching");
        }

        public static /* synthetic */ Object getContinueWatchingPanels$default(EtpContentService etpContentService, Integer num, d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = 5;
                }
                return etpContentService.getContinueWatchingPanels(num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContinueWatchingPanels");
        }

        public static /* synthetic */ Object getCustomListItems$default(EtpContentService etpContentService, String str, int i, int i2, CustomListItemsSortType customListItemsSortType, CustomListItemsOrderType customListItemsOrderType, d dVar, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    i2 = 25;
                }
                int i4 = i2;
                if ((i3 & 8) != 0) {
                    customListItemsSortType = CustomListItemsSortType.MANUAL;
                }
                CustomListItemsSortType customListItemsSortType2 = customListItemsSortType;
                if ((i3 & 16) != 0) {
                    customListItemsOrderType = CustomListItemsOrderType.ASCENDING;
                }
                return etpContentService.getCustomListItems(str, i, i4, customListItemsSortType2, customListItemsOrderType, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCustomListItems");
        }

        public static /* synthetic */ Object getHomeFeed$default(EtpContentService etpContentService, Integer num, Integer num2, d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = 0;
                }
                if ((i & 2) != 0) {
                    num2 = null;
                }
                return etpContentService.getHomeFeed(num, num2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeFeed");
        }

        public static /* synthetic */ Object getMusicLandingFeed$default(EtpContentService etpContentService, Integer num, Integer num2, d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = 0;
                }
                if ((i & 2) != 0) {
                    num2 = null;
                }
                return etpContentService.getMusicLandingFeed(num, num2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMusicLandingFeed");
        }

        public static /* synthetic */ Object getPanels$default(EtpContentService etpContentService, String str, String str2, d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return etpContentService.getPanels(str, str2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPanels");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getWatchlist$default(EtpContentService etpContentService, Integer num, Map map, Integer num2, d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = 0;
                }
                if ((i & 2) != 0) {
                    map = a0.b;
                }
                if ((i & 4) != 0) {
                    num2 = null;
                }
                return etpContentService.getWatchlist(num, map, num2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWatchlist");
        }

        public static /* synthetic */ Object search$default(EtpContentService etpContentService, String str, int i, int i2, String str2, d dVar, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    i2 = 0;
                }
                int i4 = i2;
                if ((i3 & 8) != 0) {
                    str2 = null;
                }
                return etpContentService.search(str, i, i4, str2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: search");
        }
    }

    @o("/content/v2/{account_uuid}/custom-lists/{list_id}")
    Object addItemToCustomList(@s("list_id") String str, @a CustomListItemRequest customListItemRequest, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @o("/content/v2/{account_uuid}/watchlist")
    Object addWatchlistItem(@a WatchlistItemBody watchlistItemBody, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @p("/content/v2/{account_uuid}/custom-lists/{list_id}/{content_id}/position")
    Object changeCustomListItemPosition(@s("list_id") String str, @s("content_id") String str2, @a CustomListItemPositionUpdateRequest customListItemPositionUpdateRequest, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @o("/content/v2/{account_uuid}/custom-lists")
    Object createPrivateCustomList(@a CustomListRequest customListRequest, d<? super ContentApiResponse<CreatedCustomList, EmptyMeta>> dVar);

    @b("/content/v2/{account_uuid}/watch-history")
    Object deleteHistory(d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @b("/content/v2/{account_uuid}/watch-history/{content_ids}")
    Object deleteHistoryItems(@s("content_ids") String str, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @b("/content/v2/{account_uuid}/custom-lists/{list_id}/{content_id}")
    Object deleteItemFromCustomList(@s("list_id") String str, @s("content_id") String str2, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @b("/content/v2/{account_uuid}/custom-lists/{list_id}")
    Object deletePrivateCustomList(@s("list_id") String str, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @b("/content/v2/{account_uuid}/watchlist/{content_id}")
    Object deleteWatchlistItem(@s("content_id") String str, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @f("/content/v2/music/artists/{artist_id}/concerts")
    Object getArtistMusicConcerts(@s("artist_id") String str, d<? super ContentApiResponse<MusicConcert, EmptyMeta>> dVar);

    @f("/content/v2/music/artists/{artist_id}/music_videos")
    Object getArtistMusicVideos(@s("artist_id") String str, d<? super ContentApiResponse<MusicVideo, EmptyMeta>> dVar);

    @f("/content/v2/music/artists/{artist_ids}")
    Object getArtists(@s("artist_ids") String str, d<? super ContentApiResponse<Artist, EmptyMeta>> dVar);

    @f("/content/v2/discover/browse")
    @k({"add_watchlist_status: true"})
    Object getBrowseAll(@t("n") Integer num, @t("start") Integer num2, @t("q") String str, @u Map<String, String> map, @t("categories") String str2, @t("seasonal_tag") String str3, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar);

    @f("/content/v2/discover/browse")
    @k({"add_watchlist_status: true"})
    Object getBrowseByCategories(@t("categories") String str, @u Map<String, String> map, @t("n") int i, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar);

    @f("/content/v2/discover/browse/index")
    @k({"add_watchlist_status: true"})
    Object getBrowseIndex(@u Map<String, String> map, @t("categories") String str, d<? super ContentApiResponse<BrowseSectionItem, EmptyMeta>> dVar);

    @f("/content/v2/discover/categories")
    Object getCategories(d<? super ContentApiResponse<Category, EmptyMeta>> dVar);

    @f
    @k({"add_watchlist_status: true"})
    Object getCollection(@y String str, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar);

    @f
    @k({"upload_offline_playheads: true"})
    Object getContinueWatching(@y String str, @t("n") Integer num, d<? super ContentApiResponse<ContinueWatchingPanel, EmptyMeta>> dVar);

    @f("/content/v2/discover/{account_uuid}/history")
    Object getContinueWatchingPanels(@t("n") Integer num, d<? super ContentApiResponse<ContinueWatchingPanel, EmptyMeta>> dVar);

    @f("/content/v2/{account_uuid}/custom-lists/{list_id}")
    @k({"add_watchlist_status: true"})
    Object getCustomListItems(@s("list_id") String str, @t("page") int i, @t("page_size") int i2, @t("sort_by") CustomListItemsSortType customListItemsSortType, @t("order") CustomListItemsOrderType customListItemsOrderType, d<? super CustomListItems> dVar);

    @f("/content/v2/{account_uuid}/custom-lists")
    Object getCustomLists(d<? super CustomLists> dVar);

    @f("/content/v2/cms/episodes/{episode_id}")
    Object getEpisode(@s("episode_id") String str, d<? super ContentApiResponse<Episode, EmptyMeta>> dVar);

    @f("/content/v2/cms/seasons/{season_id}/episodes")
    @k({"read_timeout: 30000"})
    Object getEpisodes(@s("season_id") String str, d<? super ContentApiResponse<Episode, EmptyMeta>> dVar);

    @f("/content/v2/music/featured/{content_id}")
    Object getFeaturedMusicVideos(@s("content_id") String str, d<? super ContentApiResponse<MusicVideo, EmptyMeta>> dVar);

    @f("/content/v2/discover/{account_uuid}/home_feed")
    @k({"add_watchlist_status: true"})
    Object getHomeFeed(@t("start") Integer num, @t("n") Integer num2, d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>> dVar);

    @f("/content/v2/cms/movies/{movie_id}")
    Object getMovie(@s("movie_id") String str, d<? super ContentApiResponse<Movie, EmptyMeta>> dVar);

    @f("/content/v2/cms/movie_listings/{content_id}")
    Object getMovieListing(@s("content_id") String str, d<? super ContentApiResponse<MovieListing, EmptyMeta>> dVar);

    @f("/content/v2/cms/movie_listings/{movie_listing_id}/movies")
    Object getMovies(@s("movie_listing_id") String str, d<? super ContentApiResponse<Movie, EmptyMeta>> dVar);

    @f("/content/v2/music/concerts/{concert_ids}")
    Object getMusicConcerts(@s("concert_ids") String str, d<? super ContentApiResponse<MusicConcert, EmptyMeta>> dVar);

    @f("/content/v2/music/{account_uuid}/landing_feed")
    Object getMusicLandingFeed(@t("start") Integer num, @t("n") Integer num2, d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>> dVar);

    @f("/content/v2/music/music_videos/{music_video_ids}")
    Object getMusicVideos(@s("music_video_ids") String str, d<? super ContentApiResponse<MusicVideo, EmptyMeta>> dVar);

    @f("/content/v2/discover/up_next/{episode_id}")
    @k({"upload_offline_playheads: true"})
    Object getNextEpisodePanel(@s("episode_id") String str, d<? super com.amazon.aps.iva.jf0.a0<ContentApiResponse<UpNextPanel, EmptyMeta>>> dVar);

    @f("/content/v2/cms/{account_uuid}/objects/{panel_ids}?fields=id")
    Object getPanelIds(@s("panel_ids") String str, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar);

    @f("/content/v2/cms/{account_uuid}/objects/{panel_ids}?fields=id,images")
    Object getPanelImages(@s("panel_ids") String str, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar);

    @f("/content/v2/cms/{account_uuid}/objects/{panel_ids}")
    Object getPanels(@s("panel_ids") String str, @t("fields") String str2, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar);

    @f("/content/v2/{account_uuid}/playheads")
    @k({"upload_offline_playheads: true"})
    Object getPlayheads(@t("content_ids") String str, d<? super ContentApiResponse<Playhead, EmptyMeta>> dVar);

    @f("/content/v2/{account_uuid}/playheads")
    Object getPlayheadsUnsynced(@t("content_ids") String str, d<? super ContentApiResponse<Playhead, EmptyMeta>> dVar);

    @f("/content/v2/cms/seasons/{season_id}")
    Object getSeason(@s("season_id") String str, d<? super ContentApiResponse<Season, EmptyMeta>> dVar);

    @f("/content/v2/discover/seasonal_tags")
    Object getSeasonList(d<? super ContentApiResponse<RawSimulcastSeason, EmptyMeta>> dVar);

    @f("/content/v2/cms/series/{series_id}/seasons")
    @k({"read_timeout: 30000"})
    Object getSeasons(@s("series_id") String str, d<? super ContentApiResponse<Season, SeasonsMetadata>> dVar);

    @f("/content/v2/cms/series/{series_id}")
    Object getSeries(@s("series_id") String str, d<? super ContentApiResponse<Series, EmptyMeta>> dVar);

    @f("/content/v2/discover/{account_uuid}/similar_to/{guid}")
    @k({"add_watchlist_status: true"})
    Object getSimilar(@s("guid") String str, @t("n") int i, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar);

    @f("/content/v2/discover/categories/{parent_category_id}/sub_categories")
    Object getSubcategories(@s("parent_category_id") String str, d<? super ContentApiResponse<Category, EmptyMeta>> dVar);

    @f("/content/v2/discover/up_next/{series_id}")
    @k({"upload_offline_playheads: true"})
    Object getUpNextEpisode(@s("series_id") String str, d<? super com.amazon.aps.iva.jf0.a0<ContentApiResponse<UpNext, EmptyMeta>>> dVar);

    @f("/content/v2/discover/up_next/{movie_listing_id}")
    @k({"upload_offline_playheads: true"})
    Object getUpNextMovie(@s("movie_listing_id") String str, d<? super com.amazon.aps.iva.jf0.a0<ContentApiResponse<UpNext, EmptyMeta>>> dVar);

    @f("/content/v2/{account_uuid}/watch-history")
    @k({"upload_offline_playheads: true"})
    Object getWatchHistory(@t("page_size") int i, d<? super ContentApiResponse<WatchHistoryPanel, WatchHistoryMetadata>> dVar);

    @f
    @k({"upload_offline_playheads: true"})
    Object getWatchHistory(@y String str, d<? super ContentApiResponse<WatchHistoryPanel, WatchHistoryMetadata>> dVar);

    @f("/content/v2/discover/{account_uuid}/watchlist")
    Object getWatchlist(@t("start") Integer num, @u Map<String, String> map, @t("n") Integer num2, d<? super ContentApiResponse<WatchlistPanel, EmptyMeta>> dVar);

    @f("/content/v2/{account_uuid}/watchlist")
    Object getWatchlistItems(d<? super ContentApiResponse<WatchlistItem, EmptyMeta>> dVar);

    @f("/content/v2/{account_uuid}/watchlist")
    Object getWatchlistItems(@t("content_ids") String str, d<? super ContentApiResponse<WatchlistItem, EmptyMeta>> dVar);

    @o("/content/v2/discover/{account_uuid}/mark_as_watched/{content_ids}")
    Object markAsWatched(@s("content_ids") String str, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @o("/content/v2/{account_uuid}/playheads")
    Object savePlayhead(@a SavePlayheadBody savePlayheadBody, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @o("/content/v2/{account_uuid}/playheads/batch")
    Object savePlayheadBatch(@a SavePlayheadBatchBody savePlayheadBatchBody, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @f("/content/v2/discover/search")
    @k({"add_watchlist_status: true"})
    Object search(@t("q") String str, @t("n") int i, @t("start") int i2, @t("type") String str2, d<? super SearchResponse> dVar);

    @n("/content/v2/{account_uuid}/custom-lists/{list_id}")
    Object updateCustomList(@s("list_id") String str, @a CustomListRequest customListRequest, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);

    @n("/content/v2/{account_uuid}/watchlist/{content_id}")
    Object updateWatchlistItemFavoriteStatus(@s(encoded = true, value = "content_id") String str, @a UpdateWatchlistItemFavoriteStatusBody updateWatchlistItemFavoriteStatusBody, d<? super com.amazon.aps.iva.jf0.a0<q>> dVar);
}
