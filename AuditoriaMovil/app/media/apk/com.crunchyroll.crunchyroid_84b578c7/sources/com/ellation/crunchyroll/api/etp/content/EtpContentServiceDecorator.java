package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.q;
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
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.cms.model.SeasonsMetadata;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.api.etp.content.model.SavePlayheadBatchBody;
import com.ellation.crunchyroll.api.etp.content.model.SavePlayheadBody;
import com.ellation.crunchyroll.api.etp.content.model.UpdateWatchlistItemFavoriteStatusBody;
import com.ellation.crunchyroll.api.etp.content.model.WatchHistoryMetadata;
import com.ellation.crunchyroll.api.etp.content.model.WatchHistoryPanel;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistItem;
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
/* compiled from: EtpContentServiceDecorator.kt */
@Metadata(d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0007\u0010\u009d\u0001\u001a\u00020\u0001\u0012\b\u0010 \u0001\u001a\u00030\u009f\u0001\u0012\n\b\u0002\u0010£\u0001\u001a\u00030¢\u0001\u0012\t\b\u0002\u0010¥\u0001\u001a\u00020'¢\u0006\u0006\b§\u0001\u0010¨\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0097Aø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0097Aø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ)\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010\u001f\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b!\u0010\u001aJ)\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010\u001f\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b#\u0010\u001aJ)\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010$\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b&\u0010\u001aJq\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00130\u00112\n\b\u0003\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010'2\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020+2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b0\u00101JI\u00103\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010-\u001a\u00020\u00022\u0014\b\u0001\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020+2\b\b\u0001\u0010(\u001a\u00020'H\u0097Aø\u0001\u0000¢\u0006\u0004\b3\u00104JA\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00130\u00112\u0014\b\u0001\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020+2\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00130\u0011H\u0097Aø\u0001\u0000¢\u0006\u0004\b9\u0010\u0017J+\u0010;\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00130\u00112\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b;\u0010\u001aJ7\u0010=\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00130\u00112\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010(\u001a\u0004\u0018\u00010'H\u0097Aø\u0001\u0000¢\u0006\u0004\b=\u0010>J+\u0010?\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00130\u00112\n\b\u0003\u0010(\u001a\u0004\u0018\u00010'H\u0097Aø\u0001\u0000¢\u0006\u0004\b?\u0010@JE\u0010H\u001a\u00020G2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020'2\b\b\u0003\u0010B\u001a\u00020'2\b\b\u0003\u0010D\u001a\u00020C2\b\b\u0003\u0010F\u001a\u00020EH\u0097Aø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0013\u0010K\u001a\u00020JH\u0097Aø\u0001\u0000¢\u0006\u0004\bK\u0010\u0017J)\u0010N\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010L\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bN\u0010\u001aJ)\u0010P\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010O\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bP\u0010\u001aJ)\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010\n\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bQ\u0010\u001aJ7\u0010T\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u00130\u00112\n\b\u0003\u0010R\u001a\u0004\u0018\u00010'2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010'H\u0097Aø\u0001\u0000¢\u0006\u0004\bT\u0010UJ)\u0010X\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010V\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bX\u0010\u001aJ)\u0010[\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010Y\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b[\u0010\u001aJ)\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010Y\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b\\\u0010\u001aJ)\u0010^\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010]\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\b^\u0010\u001aJ7\u0010_\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u00130\u00112\n\b\u0003\u0010R\u001a\u0004\u0018\u00010'2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010'H\u0097Aø\u0001\u0000¢\u0006\u0004\b_\u0010UJ)\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010`\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\ba\u0010\u001aJ/\u0010c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u00130\u00110\u00062\b\b\u0001\u0010L\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bc\u0010\u001aJ)\u0010e\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010d\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\be\u0010\u001aJ)\u0010f\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010d\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bf\u0010\u001aJ)\u0010h\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010O\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bh\u0010\u001aJ\u001f\u0010j\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020\u00130\u0011H\u0097Aø\u0001\u0000¢\u0006\u0004\bj\u0010\u0017J)\u0010m\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020l0\u00112\b\b\u0001\u0010k\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bm\u0010\u001aJ)\u0010o\u001a\u000e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010k\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bo\u0010\u001aJ3\u0010q\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010p\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020'H\u0097Aø\u0001\u0000¢\u0006\u0004\bq\u0010rJ)\u0010t\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010s\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bt\u0010\u001aJ/\u0010v\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u00130\u00110\u00062\b\b\u0001\u0010k\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bv\u0010\u001aJ/\u0010w\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u00130\u00110\u00062\b\b\u0001\u0010Y\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bw\u0010\u001aJ)\u0010z\u001a\u000e\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00020y0\u00112\b\b\u0001\u0010B\u001a\u00020'H\u0097Aø\u0001\u0000¢\u0006\u0004\bz\u0010{J)\u0010z\u001a\u000e\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00020y0\u00112\b\b\u0001\u0010:\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0004\bz\u0010\u001aJM\u0010}\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\u00130\u00112\n\b\u0003\u0010R\u001a\u0004\u0018\u00010'2\u0014\b\u0003\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020+2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010'H\u0097Aø\u0001\u0000¢\u0006\u0004\b}\u0010~J!\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u007f\u0012\u0004\u0012\u00020\u00130\u0011H\u0097Aø\u0001\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u0017J+\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u007f\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0001\u0010\u0018\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u001aJ%\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0002H\u0097Aø\u0001\u0000¢\u0006\u0005\b\u0081\u0001\u0010\u001aJ(\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0097Aø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001JD\u0010\u008a\u0001\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u0086\u0001\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020'2\t\b\u0003\u0010\u0087\u0001\u001a\u00020'2\u000b\b\u0003\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0002H\u0097Aø\u0001\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J0\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0097Aø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J2\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0097Aø\u0001\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J*\u0010\u0093\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0092\u0001\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0018\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0093\u0001\u0010\u001aJ%\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0007\u0010\u0005\u001a\u00030\u0094\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J*\u0010\u0097\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0092\u0001\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0018\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0097\u0001\u0010\u001aJ&\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0083\u0001\u001a\u00030\u0098\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J4\u0010\u009c\u0001\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010d\u001a\u00020\u00022\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u009c\u0001\u0010\u001cR\u0017\u0010\u009d\u0001\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010 \u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010£\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0017\u0010¥\u0001\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006©\u0001"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/EtpContentServiceDecorator;", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "", "listId", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemRequest;", "item", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/amazon/aps/iva/kb0/q;", "addItemToCustomList", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemRequest;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "contentId", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemPositionUpdateRequest;", "positionUpdateRequest", "changeCustomListItemPosition", "(Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemPositionUpdateRequest;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListRequest;", "list", "Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CreatedCustomList;", "Lcom/ellation/crunchyroll/api/etp/content/EmptyMeta;", "createPrivateCustomList", "(Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListRequest;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deleteHistory", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "contentIds", "deleteHistoryItems", "(Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deleteItemFromCustomList", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deletePrivateCustomList", "deleteWatchlistItem", "artistId", "Lcom/ellation/crunchyroll/model/music/MusicConcert;", "getArtistMusicConcerts", "Lcom/ellation/crunchyroll/model/music/MusicVideo;", "getArtistMusicVideos", "artistIds", "Lcom/ellation/crunchyroll/model/music/Artist;", "getArtists", "", "numberOfResults", "offset", "titlesStartWith", "", "sortAndFilters", "categories", "season", "Lcom/ellation/crunchyroll/model/Panel;", "getBrowseAll", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "sortAndFilter", "getBrowseByCategories", "(Ljava/lang/String;Ljava/util/Map;ILcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/model/browse/BrowseSectionItem;", "getBrowseIndex", "(Ljava/util/Map;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/model/categories/Category;", "getCategories", ImagesContract.URL, "getCollection", "Lcom/ellation/crunchyroll/api/model/ContinueWatchingPanel;", "getContinueWatching", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "getContinueWatchingPanels", "(Ljava/lang/Integer;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "page", "pageSize", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemsSortType;", "sortBy", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemsOrderType;", "order", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItems;", "getCustomListItems", "(Ljava/lang/String;IILcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemsSortType;Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemsOrderType;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomLists;", "getCustomLists", "episodeId", "Lcom/ellation/crunchyroll/model/Episode;", "getEpisode", "seasonId", "getEpisodes", "getFeaturedMusicVideos", "start", "Lcom/ellation/crunchyroll/api/model/HomeFeedItemRaw;", "getHomeFeed", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "movieId", "Lcom/ellation/crunchyroll/model/Movie;", "getMovie", "movieListingId", "Lcom/ellation/crunchyroll/model/MovieListing;", "getMovieListing", "getMovies", "concertsIds", "getMusicConcerts", "getMusicLandingFeed", "musicVideoIds", "getMusicVideos", "Lcom/ellation/crunchyroll/model/UpNextPanel;", "getNextEpisodePanel", "panelIds", "getPanelIds", "getPanelImages", "Lcom/ellation/crunchyroll/api/cms/model/Season;", "getSeason", "Lcom/ellation/crunchyroll/api/model/RawSimulcastSeason;", "getSeasonList", "seriesId", "Lcom/ellation/crunchyroll/api/cms/model/SeasonsMetadata;", "getSeasons", "Lcom/ellation/crunchyroll/model/Series;", "getSeries", "panelId", "getSimilar", "(Ljava/lang/String;ILcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "parentCategoryId", "getSubcategories", "Lcom/ellation/crunchyroll/model/UpNext;", "getUpNextEpisode", "getUpNextMovie", "Lcom/ellation/crunchyroll/api/etp/content/model/WatchHistoryPanel;", "Lcom/ellation/crunchyroll/api/etp/content/model/WatchHistoryMetadata;", "getWatchHistory", "(ILcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/model/watchlist/WatchlistPanel;", "getWatchlist", "(Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Integer;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistItem;", "getWatchlistItems", "markAsWatched", "Lcom/ellation/crunchyroll/api/etp/content/model/SavePlayheadBody;", "playheadBody", "savePlayhead", "(Lcom/ellation/crunchyroll/api/etp/content/model/SavePlayheadBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", SearchIntents.EXTRA_QUERY, "startFrom", "type", "Lcom/ellation/crunchyroll/model/search/SearchResponse;", FirebaseAnalytics.Event.SEARCH, "(Ljava/lang/String;IILjava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "updateCustomList", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListRequest;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/content/model/UpdateWatchlistItemFavoriteStatusBody;", "body", "updateWatchlistItemFavoriteStatus", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/content/model/UpdateWatchlistItemFavoriteStatusBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/content/model/Playhead;", "getPlayheads", "Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistItemBody;", "addWatchlistItem", "(Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistItemBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "getPlayheadsUnsynced", "Lcom/ellation/crunchyroll/api/etp/content/model/SavePlayheadBatchBody;", "savePlayheadBatch", "(Lcom/ellation/crunchyroll/api/etp/content/model/SavePlayheadBatchBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "fields", "getPanels", "etpContentService", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "Lcom/ellation/crunchyroll/api/etp/content/ContentServiceMonitor;", "contentServiceMonitor", "Lcom/ellation/crunchyroll/api/etp/content/ContentServiceMonitor;", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentServiceConfig;", "config", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentServiceConfig;", "chunkSize", "I", "<init>", "(Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;Lcom/ellation/crunchyroll/api/etp/content/ContentServiceMonitor;Lcom/ellation/crunchyroll/api/etp/content/EtpContentServiceConfig;I)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EtpContentServiceDecorator implements EtpContentService {
    public static final int $stable = 8;
    private final int chunkSize;
    private final EtpContentServiceConfig config;
    private final ContentServiceMonitor contentServiceMonitor;
    private final EtpContentService etpContentService;

    public EtpContentServiceDecorator(EtpContentService etpContentService, ContentServiceMonitor contentServiceMonitor, EtpContentServiceConfig etpContentServiceConfig, int i) {
        j.f(etpContentService, "etpContentService");
        j.f(contentServiceMonitor, "contentServiceMonitor");
        j.f(etpContentServiceConfig, "config");
        this.etpContentService = etpContentService;
        this.contentServiceMonitor = contentServiceMonitor;
        this.config = etpContentServiceConfig;
        this.chunkSize = i;
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @o("/content/v2/{account_uuid}/custom-lists/{list_id}")
    public Object addItemToCustomList(@s("list_id") String str, @a CustomListItemRequest customListItemRequest, d<? super a0<q>> dVar) {
        return this.etpContentService.addItemToCustomList(str, customListItemRequest, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object addWatchlistItem(com.ellation.crunchyroll.api.etp.content.model.WatchlistItemBody r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.jf0.a0<com.amazon.aps.iva.kb0.q>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator$addWatchlistItem$1
            if (r0 == 0) goto L13
            r0 = r6
            com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator$addWatchlistItem$1 r0 = (com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator$addWatchlistItem$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator$addWatchlistItem$1 r0 = new com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator$addWatchlistItem$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator r5 = (com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator) r5
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r4.etpContentService
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.addWatchlistItem(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            r0 = r6
            com.amazon.aps.iva.jf0.a0 r0 = (com.amazon.aps.iva.jf0.a0) r0
            com.ellation.crunchyroll.api.etp.content.ContentServiceMonitor r5 = r5.contentServiceMonitor
            r5.onAddToWatchlist()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator.addWatchlistItem(com.ellation.crunchyroll.api.etp.content.model.WatchlistItemBody, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @p("/content/v2/{account_uuid}/custom-lists/{list_id}/{content_id}/position")
    public Object changeCustomListItemPosition(@s("list_id") String str, @s("content_id") String str2, @a CustomListItemPositionUpdateRequest customListItemPositionUpdateRequest, d<? super a0<q>> dVar) {
        return this.etpContentService.changeCustomListItemPosition(str, str2, customListItemPositionUpdateRequest, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @o("/content/v2/{account_uuid}/custom-lists")
    public Object createPrivateCustomList(@a CustomListRequest customListRequest, d<? super ContentApiResponse<CreatedCustomList, EmptyMeta>> dVar) {
        return this.etpContentService.createPrivateCustomList(customListRequest, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @b("/content/v2/{account_uuid}/watch-history")
    public Object deleteHistory(d<? super a0<q>> dVar) {
        return this.etpContentService.deleteHistory(dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @b("/content/v2/{account_uuid}/watch-history/{content_ids}")
    public Object deleteHistoryItems(@s("content_ids") String str, d<? super a0<q>> dVar) {
        return this.etpContentService.deleteHistoryItems(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @b("/content/v2/{account_uuid}/custom-lists/{list_id}/{content_id}")
    public Object deleteItemFromCustomList(@s("list_id") String str, @s("content_id") String str2, d<? super a0<q>> dVar) {
        return this.etpContentService.deleteItemFromCustomList(str, str2, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @b("/content/v2/{account_uuid}/custom-lists/{list_id}")
    public Object deletePrivateCustomList(@s("list_id") String str, d<? super a0<q>> dVar) {
        return this.etpContentService.deletePrivateCustomList(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @b("/content/v2/{account_uuid}/watchlist/{content_id}")
    public Object deleteWatchlistItem(@s("content_id") String str, d<? super a0<q>> dVar) {
        return this.etpContentService.deleteWatchlistItem(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/music/artists/{artist_id}/concerts")
    public Object getArtistMusicConcerts(@s("artist_id") String str, d<? super ContentApiResponse<MusicConcert, EmptyMeta>> dVar) {
        return this.etpContentService.getArtistMusicConcerts(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/music/artists/{artist_id}/music_videos")
    public Object getArtistMusicVideos(@s("artist_id") String str, d<? super ContentApiResponse<MusicVideo, EmptyMeta>> dVar) {
        return this.etpContentService.getArtistMusicVideos(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/music/artists/{artist_ids}")
    public Object getArtists(@s("artist_ids") String str, d<? super ContentApiResponse<Artist, EmptyMeta>> dVar) {
        return this.etpContentService.getArtists(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/browse")
    @k({"add_watchlist_status: true"})
    public Object getBrowseAll(@t("n") Integer num, @t("start") Integer num2, @t("q") String str, @u Map<String, String> map, @t("categories") String str2, @t("seasonal_tag") String str3, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar) {
        return this.etpContentService.getBrowseAll(num, num2, str, map, str2, str3, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/browse")
    @k({"add_watchlist_status: true"})
    public Object getBrowseByCategories(@t("categories") String str, @u Map<String, String> map, @t("n") int i, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar) {
        return this.etpContentService.getBrowseByCategories(str, map, i, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/browse/index")
    @k({"add_watchlist_status: true"})
    public Object getBrowseIndex(@u Map<String, String> map, @t("categories") String str, d<? super ContentApiResponse<BrowseSectionItem, EmptyMeta>> dVar) {
        return this.etpContentService.getBrowseIndex(map, str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/categories")
    public Object getCategories(d<? super ContentApiResponse<Category, EmptyMeta>> dVar) {
        return this.etpContentService.getCategories(dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f
    @k({"add_watchlist_status: true"})
    public Object getCollection(@y String str, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar) {
        return this.etpContentService.getCollection(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f
    @k({"upload_offline_playheads: true"})
    public Object getContinueWatching(@y String str, @t("n") Integer num, d<? super ContentApiResponse<ContinueWatchingPanel, EmptyMeta>> dVar) {
        return this.etpContentService.getContinueWatching(str, num, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/{account_uuid}/history")
    public Object getContinueWatchingPanels(@t("n") Integer num, d<? super ContentApiResponse<ContinueWatchingPanel, EmptyMeta>> dVar) {
        return this.etpContentService.getContinueWatchingPanels(num, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/{account_uuid}/custom-lists/{list_id}")
    @k({"add_watchlist_status: true"})
    public Object getCustomListItems(@s("list_id") String str, @t("page") int i, @t("page_size") int i2, @t("sort_by") CustomListItemsSortType customListItemsSortType, @t("order") CustomListItemsOrderType customListItemsOrderType, d<? super CustomListItems> dVar) {
        return this.etpContentService.getCustomListItems(str, i, i2, customListItemsSortType, customListItemsOrderType, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/{account_uuid}/custom-lists")
    public Object getCustomLists(d<? super CustomLists> dVar) {
        return this.etpContentService.getCustomLists(dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/cms/episodes/{episode_id}")
    public Object getEpisode(@s("episode_id") String str, d<? super ContentApiResponse<Episode, EmptyMeta>> dVar) {
        return this.etpContentService.getEpisode(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/cms/seasons/{season_id}/episodes")
    @k({"read_timeout: 30000"})
    public Object getEpisodes(@s("season_id") String str, d<? super ContentApiResponse<Episode, EmptyMeta>> dVar) {
        return this.etpContentService.getEpisodes(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/music/featured/{content_id}")
    public Object getFeaturedMusicVideos(@s("content_id") String str, d<? super ContentApiResponse<MusicVideo, EmptyMeta>> dVar) {
        return this.etpContentService.getFeaturedMusicVideos(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/{account_uuid}/home_feed")
    @k({"add_watchlist_status: true"})
    public Object getHomeFeed(@t("start") Integer num, @t("n") Integer num2, d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>> dVar) {
        return this.etpContentService.getHomeFeed(num, num2, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/cms/movies/{movie_id}")
    public Object getMovie(@s("movie_id") String str, d<? super ContentApiResponse<Movie, EmptyMeta>> dVar) {
        return this.etpContentService.getMovie(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/cms/movie_listings/{content_id}")
    public Object getMovieListing(@s("content_id") String str, d<? super ContentApiResponse<MovieListing, EmptyMeta>> dVar) {
        return this.etpContentService.getMovieListing(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/cms/movie_listings/{movie_listing_id}/movies")
    public Object getMovies(@s("movie_listing_id") String str, d<? super ContentApiResponse<Movie, EmptyMeta>> dVar) {
        return this.etpContentService.getMovies(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/music/concerts/{concert_ids}")
    public Object getMusicConcerts(@s("concert_ids") String str, d<? super ContentApiResponse<MusicConcert, EmptyMeta>> dVar) {
        return this.etpContentService.getMusicConcerts(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/music/{account_uuid}/landing_feed")
    public Object getMusicLandingFeed(@t("start") Integer num, @t("n") Integer num2, d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>> dVar) {
        return this.etpContentService.getMusicLandingFeed(num, num2, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/music/music_videos/{music_video_ids}")
    public Object getMusicVideos(@s("music_video_ids") String str, d<? super ContentApiResponse<MusicVideo, EmptyMeta>> dVar) {
        return this.etpContentService.getMusicVideos(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/up_next/{episode_id}")
    @k({"upload_offline_playheads: true"})
    public Object getNextEpisodePanel(@s("episode_id") String str, d<? super a0<ContentApiResponse<UpNextPanel, EmptyMeta>>> dVar) {
        return this.etpContentService.getNextEpisodePanel(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/cms/{account_uuid}/objects/{panel_ids}?fields=id")
    public Object getPanelIds(@s("panel_ids") String str, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar) {
        return this.etpContentService.getPanelIds(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/cms/{account_uuid}/objects/{panel_ids}?fields=id,images")
    public Object getPanelImages(@s("panel_ids") String str, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar) {
        return this.etpContentService.getPanelImages(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    public Object getPanels(String str, String str2, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar) {
        return z.p(new EtpContentServiceDecorator$getPanels$2(str, this, str2, null), dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    public Object getPlayheads(String str, d<? super ContentApiResponse<Playhead, EmptyMeta>> dVar) {
        return z.p(new EtpContentServiceDecorator$getPlayheads$2(str, this, null), dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    public Object getPlayheadsUnsynced(String str, d<? super ContentApiResponse<Playhead, EmptyMeta>> dVar) {
        return z.p(new EtpContentServiceDecorator$getPlayheadsUnsynced$2(str, this, null), dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/cms/seasons/{season_id}")
    public Object getSeason(@s("season_id") String str, d<? super ContentApiResponse<Season, EmptyMeta>> dVar) {
        return this.etpContentService.getSeason(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/seasonal_tags")
    public Object getSeasonList(d<? super ContentApiResponse<RawSimulcastSeason, EmptyMeta>> dVar) {
        return this.etpContentService.getSeasonList(dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/cms/series/{series_id}/seasons")
    @k({"read_timeout: 30000"})
    public Object getSeasons(@s("series_id") String str, d<? super ContentApiResponse<Season, SeasonsMetadata>> dVar) {
        return this.etpContentService.getSeasons(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/cms/series/{series_id}")
    public Object getSeries(@s("series_id") String str, d<? super ContentApiResponse<Series, EmptyMeta>> dVar) {
        return this.etpContentService.getSeries(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/{account_uuid}/similar_to/{guid}")
    @k({"add_watchlist_status: true"})
    public Object getSimilar(@s("guid") String str, @t("n") int i, d<? super ContentApiResponse<Panel, EmptyMeta>> dVar) {
        return this.etpContentService.getSimilar(str, i, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/categories/{parent_category_id}/sub_categories")
    public Object getSubcategories(@s("parent_category_id") String str, d<? super ContentApiResponse<Category, EmptyMeta>> dVar) {
        return this.etpContentService.getSubcategories(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/up_next/{series_id}")
    @k({"upload_offline_playheads: true"})
    public Object getUpNextEpisode(@s("series_id") String str, d<? super a0<ContentApiResponse<UpNext, EmptyMeta>>> dVar) {
        return this.etpContentService.getUpNextEpisode(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/up_next/{movie_listing_id}")
    @k({"upload_offline_playheads: true"})
    public Object getUpNextMovie(@s("movie_listing_id") String str, d<? super a0<ContentApiResponse<UpNext, EmptyMeta>>> dVar) {
        return this.etpContentService.getUpNextMovie(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/{account_uuid}/watch-history")
    @k({"upload_offline_playheads: true"})
    public Object getWatchHistory(@t("page_size") int i, d<? super ContentApiResponse<WatchHistoryPanel, WatchHistoryMetadata>> dVar) {
        return this.etpContentService.getWatchHistory(i, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/{account_uuid}/watchlist")
    public Object getWatchlist(@t("start") Integer num, @u Map<String, String> map, @t("n") Integer num2, d<? super ContentApiResponse<WatchlistPanel, EmptyMeta>> dVar) {
        return this.etpContentService.getWatchlist(num, map, num2, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/{account_uuid}/watchlist")
    public Object getWatchlistItems(d<? super ContentApiResponse<WatchlistItem, EmptyMeta>> dVar) {
        return this.etpContentService.getWatchlistItems(dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @o("/content/v2/discover/{account_uuid}/mark_as_watched/{content_ids}")
    public Object markAsWatched(@s("content_ids") String str, d<? super a0<q>> dVar) {
        return this.etpContentService.markAsWatched(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @o("/content/v2/{account_uuid}/playheads")
    public Object savePlayhead(@a SavePlayheadBody savePlayheadBody, d<? super a0<q>> dVar) {
        return this.etpContentService.savePlayhead(savePlayheadBody, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    public Object savePlayheadBatch(SavePlayheadBatchBody savePlayheadBatchBody, d<? super a0<q>> dVar) {
        return z.p(new EtpContentServiceDecorator$savePlayheadBatch$2(savePlayheadBatchBody, this, null), dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/discover/search")
    @k({"add_watchlist_status: true"})
    public Object search(@t("q") String str, @t("n") int i, @t("start") int i2, @t("type") String str2, d<? super SearchResponse> dVar) {
        return this.etpContentService.search(str, i, i2, str2, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @n("/content/v2/{account_uuid}/custom-lists/{list_id}")
    public Object updateCustomList(@s("list_id") String str, @a CustomListRequest customListRequest, d<? super a0<q>> dVar) {
        return this.etpContentService.updateCustomList(str, customListRequest, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @n("/content/v2/{account_uuid}/watchlist/{content_id}")
    public Object updateWatchlistItemFavoriteStatus(@s(encoded = true, value = "content_id") String str, @a UpdateWatchlistItemFavoriteStatusBody updateWatchlistItemFavoriteStatusBody, d<? super a0<q>> dVar) {
        return this.etpContentService.updateWatchlistItemFavoriteStatus(str, updateWatchlistItemFavoriteStatusBody, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f
    @k({"upload_offline_playheads: true"})
    public Object getWatchHistory(@y String str, d<? super ContentApiResponse<WatchHistoryPanel, WatchHistoryMetadata>> dVar) {
        return this.etpContentService.getWatchHistory(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.content.EtpContentService
    @f("/content/v2/{account_uuid}/watchlist")
    public Object getWatchlistItems(@t("content_ids") String str, d<? super ContentApiResponse<WatchlistItem, EmptyMeta>> dVar) {
        return this.etpContentService.getWatchlistItems(str, dVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EtpContentServiceDecorator(com.ellation.crunchyroll.api.etp.content.EtpContentService r1, com.ellation.crunchyroll.api.etp.content.ContentServiceMonitor r2, com.ellation.crunchyroll.api.etp.content.EtpContentServiceConfig r3, int r4, int r5, com.amazon.aps.iva.yb0.e r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto La
            com.ellation.crunchyroll.api.etp.content.EtpContentServiceConfig$Companion r3 = com.ellation.crunchyroll.api.etp.content.EtpContentServiceConfig.Companion
            com.ellation.crunchyroll.api.etp.content.EtpContentServiceConfig r3 = r3.get()
        La:
            r5 = r5 & 8
            if (r5 == 0) goto L38
            int r4 = com.ellation.crunchyroll.application.a.a
            com.ellation.crunchyroll.application.a r4 = com.ellation.crunchyroll.application.a.C0959a.a
            if (r4 == 0) goto L31
            com.amazon.aps.iva.ms.a r4 = r4.c()
            java.lang.String r5 = "objects_max_ids_per_request_allowed"
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            java.lang.Object r4 = r4.c(r6, r5)
            if (r4 == 0) goto L29
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L38
        L29:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            r1.<init>(r2)
            throw r1
        L31:
            java.lang.String r1 = "instance"
            com.amazon.aps.iva.yb0.j.m(r1)
            r1 = 0
            throw r1
        L38:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.content.EtpContentServiceDecorator.<init>(com.ellation.crunchyroll.api.etp.content.EtpContentService, com.ellation.crunchyroll.api.etp.content.ContentServiceMonitor, com.ellation.crunchyroll.api.etp.content.EtpContentServiceConfig, int, int, com.amazon.aps.iva.yb0.e):void");
    }
}
