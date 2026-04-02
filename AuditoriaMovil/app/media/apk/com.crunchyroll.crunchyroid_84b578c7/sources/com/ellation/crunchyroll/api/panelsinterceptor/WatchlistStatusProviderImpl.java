package com.ellation.crunchyroll.api.panelsinterceptor;

import com.amazon.aps.iva.ef0.r;
import com.amazon.aps.iva.oe0.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Metadata;
import okhttp3.ResponseBody;
/* compiled from: WatchlistStatusProvider.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/api/panelsinterceptor/WatchlistStatusProviderImpl;", "Lcom/ellation/crunchyroll/api/panelsinterceptor/WatchlistStatusProvider;", "watchlistStatusLoader", "Lcom/ellation/crunchyroll/api/panelsinterceptor/WatchlistStatusLoader;", "panelsParser", "Lcom/ellation/crunchyroll/api/panelsinterceptor/PanelsParser;", "(Lcom/ellation/crunchyroll/api/panelsinterceptor/WatchlistStatusLoader;Lcom/ellation/crunchyroll/api/panelsinterceptor/PanelsParser;)V", "addWatchlistStatusTo", "Ljava/io/InputStream;", "bodyReader", "Ljava/io/Reader;", "Lokhttp3/ResponseBody;", "body", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchlistStatusProviderImpl implements WatchlistStatusProvider {
    public static final int $stable = 0;
    private final PanelsParser panelsParser;
    private final WatchlistStatusLoader watchlistStatusLoader;

    public WatchlistStatusProviderImpl(WatchlistStatusLoader watchlistStatusLoader, PanelsParser panelsParser) {
        j.f(watchlistStatusLoader, "watchlistStatusLoader");
        j.f(panelsParser, "panelsParser");
        this.watchlistStatusLoader = watchlistStatusLoader;
        this.panelsParser = panelsParser;
    }

    @Override // com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusProvider
    public ResponseBody addWatchlistStatusTo(ResponseBody responseBody) {
        j.f(responseBody, "body");
        if (WatchlistStatusProviderKt.getContainsPanels(responseBody)) {
            return ResponseBody.Companion.create(r.b(r.f(addWatchlistStatusTo(new InputStreamReader(responseBody.source().r0(), a.b)))), responseBody.contentType(), responseBody.contentLength());
        }
        return null;
    }

    public /* synthetic */ WatchlistStatusProviderImpl(WatchlistStatusLoader watchlistStatusLoader, PanelsParser panelsParser, int i, e eVar) {
        this(watchlistStatusLoader, (i & 2) != 0 ? new PanelsParserImpl() : panelsParser);
    }

    private final InputStream addWatchlistStatusTo(Reader reader) {
        JsonElement parseReader = JsonParser.parseReader(reader);
        PanelsParser panelsParser = this.panelsParser;
        j.e(parseReader, "jsonTree");
        this.watchlistStatusLoader.addInWatchlistStatusTo(panelsParser.getPanels(parseReader));
        String jsonElement = parseReader.toString();
        j.e(jsonElement, "jsonTree.toString()");
        byte[] bytes = jsonElement.getBytes(a.b);
        j.e(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }
}
