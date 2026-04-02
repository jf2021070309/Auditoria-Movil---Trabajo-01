package com.vungle.warren.downloader;

import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.Pair;
import com.facebook.internal.AnalyticsEvents;
import com.vungle.warren.AdLoader;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.downloader.AssetDownloadListener;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.utility.FileUtility;
import com.vungle.warren.utility.NetworkProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okio.GzipSource;
import okio.Okio;
/* loaded from: classes2.dex */
public class AssetDownloader implements Downloader {
    private static final String ACCEPT_ENCODING = "Accept-Encoding";
    private static final String ACCEPT_RANGES = "Accept-Ranges";
    private static final String BYTES = "bytes";
    private static final int CONNECTION_RETRY_TIMEOUT = 300;
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_RANGE = "Content-Range";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    static final String DOWNLOAD_COMPLETE = "DOWNLOAD_COMPLETE";
    static final String DOWNLOAD_URL = "Download_URL";
    static final String ETAG = "ETag";
    private static final String GZIP = "gzip";
    private static final String IDENTITY = "identity";
    private static final String IF_MODIFIED_SINCE = "If-Modified-Since";
    private static final String IF_NONE_MATCH = "If-None-Match";
    private static final String IF_RANGE = "If-Range";
    private static final String KEY_TEMPLATE = "template";
    static final String LAST_CACHE_VERIFICATION = "Last-Cache-Verification";
    static final String LAST_DOWNLOAD = "Last-Download";
    static final String LAST_MODIFIED = "Last-Modified";
    private static final String LOAD_CONTEXT = "AssetDownloader#load; loadAd sequence";
    private static final long MAX_PERCENT = 100;
    private static final int MAX_RECONNECT_ATTEMPTS = 10;
    private static final String META_POSTFIX_EXT = ".vng_meta";
    private static final int PROGRESS_STEP = 5;
    private static final String RANGE = "Range";
    private static final int RANGE_NOT_SATISFIABLE = 416;
    private static final int RETRY_COUNT_ON_CONNECTION_LOST = 5;
    private static final int TIMEOUT = 30;
    private final Object addLock;
    private final DownloaderCache cache;
    private final ThreadPoolExecutor downloadExecutor;
    private boolean isCacheEnabled;
    int maxReconnectAttempts;
    private Map<String, DownloadRequestMediator> mediators;
    private final NetworkProvider.NetworkListener networkListener;
    private final NetworkProvider networkProvider;
    private final OkHttpClient okHttpClient;
    private volatile int progressStep;
    int reconnectTimeout;
    int retryCountOnConnectionLost;
    private final long timeWindow;
    private List<DownloadRequest> transitioning;
    private final ExecutorService uiExecutor;
    public static final long VERIFICATION_WINDOW = TimeUnit.HOURS.toMillis(24);
    private static final String TAG = AssetDownloader.class.getSimpleName();

    /* loaded from: classes2.dex */
    public @interface NetworkType {
        public static final int ANY = 3;
        public static final int CELLULAR = 1;
        public static final int WIFI = 2;
    }

    static /* synthetic */ String access$000() {
        return TAG;
    }

    static /* synthetic */ long access$1000(AssetDownloader assetDownloader, Response response) {
        return assetDownloader.getContentLength(response);
    }

    static /* synthetic */ boolean access$1100(AssetDownloader assetDownloader, File file, Response response, DownloadRequestMediator downloadRequestMediator, HashMap hashMap) {
        return assetDownloader.notModified(file, response, downloadRequestMediator, hashMap);
    }

    static /* synthetic */ boolean access$1200(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, File file, Map map, int i) {
        return assetDownloader.useCacheOnFail(downloadRequestMediator, file, map, i);
    }

    static /* synthetic */ void access$1300(AssetDownloader assetDownloader, File file, HashMap hashMap) {
        assetDownloader.saveMeta(file, hashMap);
    }

    static /* synthetic */ boolean access$1400(AssetDownloader assetDownloader, long j, int i, Response response, DownloadRequestMediator downloadRequestMediator) {
        return assetDownloader.partialMalformed(j, i, response, downloadRequestMediator);
    }

    static /* synthetic */ void access$1500(AssetDownloader assetDownloader, File file, File file2, boolean z) {
        assetDownloader.deleteFileAndMeta(file, file2, z);
    }

    static /* synthetic */ void access$1600(AssetDownloader assetDownloader, File file, File file2, Headers headers) throws IOException {
        assetDownloader.checkEncoding(file, file2, headers);
    }

    static /* synthetic */ HashMap access$1700(AssetDownloader assetDownloader, File file, Headers headers, String str) {
        return assetDownloader.makeMeta(file, headers, str);
    }

    static /* synthetic */ ResponseBody access$1800(AssetDownloader assetDownloader, Response response) {
        return assetDownloader.decodeGzipIfNeeded(response);
    }

    static /* synthetic */ void access$1900(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress) {
        assetDownloader.onProgressMediator(downloadRequestMediator, progress);
    }

    static /* synthetic */ int access$2000(AssetDownloader assetDownloader) {
        return assetDownloader.progressStep;
    }

    static /* synthetic */ int access$2100(AssetDownloader assetDownloader, Throwable th, boolean z) {
        return assetDownloader.mapExceptionToReason(th, z);
    }

    static /* synthetic */ void access$2200(AssetDownloader assetDownloader, long j) {
        assetDownloader.sleep(j);
    }

    static /* synthetic */ boolean access$2300(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress, AssetDownloadListener.DownloadError downloadError) {
        return assetDownloader.pause(downloadRequestMediator, progress, downloadError);
    }

    static /* synthetic */ void access$2400(AssetDownloader assetDownloader, File file, DownloadRequestMediator downloadRequestMediator) {
        assetDownloader.onSuccessMediator(file, downloadRequestMediator);
    }

    static /* synthetic */ void access$2500(AssetDownloader assetDownloader, AssetDownloadListener.DownloadError downloadError, DownloadRequestMediator downloadRequestMediator) {
        assetDownloader.onErrorMediator(downloadError, downloadRequestMediator);
    }

    static /* synthetic */ void access$2600(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator) {
        assetDownloader.onCancelledMediator(downloadRequestMediator);
    }

    static /* synthetic */ void access$2700(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator) {
        assetDownloader.removeMediator(downloadRequestMediator);
    }

    static /* synthetic */ void access$2800(AssetDownloader assetDownloader) {
        assetDownloader.removeNetworkListener();
    }

    static /* synthetic */ DownloaderCache access$300(AssetDownloader assetDownloader) {
        return assetDownloader.cache;
    }

    static /* synthetic */ String access$400(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator) {
        return assetDownloader.debugString(downloadRequestMediator);
    }

    static /* synthetic */ boolean access$500(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator) {
        return assetDownloader.isAnyConnected(downloadRequestMediator);
    }

    static /* synthetic */ HashMap access$600(AssetDownloader assetDownloader, File file) {
        return assetDownloader.extractMeta(file);
    }

    static /* synthetic */ boolean access$700(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, File file, Map map) {
        return assetDownloader.useCacheWithoutVerification(downloadRequestMediator, file, map);
    }

    static /* synthetic */ void access$800(AssetDownloader assetDownloader, long j, File file, HashMap hashMap, Request.Builder builder) {
        assetDownloader.appendHeaders(j, file, hashMap, builder);
    }

    static /* synthetic */ OkHttpClient access$900(AssetDownloader assetDownloader) {
        return assetDownloader.okHttpClient;
    }

    public AssetDownloader(int i, NetworkProvider networkProvider, ExecutorService executorService) {
        this(null, 0L, i, networkProvider, executorService);
    }

    public AssetDownloader(DownloaderCache downloaderCache, long j, int i, NetworkProvider networkProvider, ExecutorService executorService) {
        this.retryCountOnConnectionLost = 5;
        this.maxReconnectAttempts = 10;
        this.reconnectTimeout = 300;
        this.mediators = new ConcurrentHashMap();
        this.transitioning = new ArrayList();
        this.addLock = new Object();
        this.progressStep = 5;
        this.isCacheEnabled = true;
        this.networkListener = new NetworkProvider.NetworkListener() { // from class: com.vungle.warren.downloader.AssetDownloader.3
            @Override // com.vungle.warren.utility.NetworkProvider.NetworkListener
            public void onChanged(int i2) {
                String str = AssetDownloader.TAG;
                Log.d(str, "Network changed: " + i2);
                AssetDownloader.this.onNetworkChanged(i2);
            }
        };
        this.cache = downloaderCache;
        int max = Math.max(i, 1);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, max, 1L, TimeUnit.SECONDS, new PriorityBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.timeWindow = j;
        this.downloadExecutor = threadPoolExecutor;
        this.networkProvider = networkProvider;
        this.uiExecutor = executorService;
        this.okHttpClient = new OkHttpClient.Builder().readTimeout(30L, TimeUnit.SECONDS).connectTimeout(30L, TimeUnit.SECONDS).cache(null).followRedirects(true).followSslRedirects(true).build();
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void download(final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener) {
        if (downloadRequest == null) {
            VungleLogger.error("AssetDownloader#download; loadAd sequence", "downloadRequest is null");
            if (assetDownloadListener != null) {
                deliverError(null, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new IllegalArgumentException("DownloadRequest is null"), 1));
            }
            return;
        }
        VungleLogger.verbose(true, TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Waiting for download asset %1$s, at: %2$d", downloadRequest, Long.valueOf(System.currentTimeMillis())));
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new DownloadPriorityRunnable(new AssetPriority(DownloadRequest.Priority.CRITICAL, 0)) { // from class: com.vungle.warren.downloader.AssetDownloader.1
            @Override // java.lang.Runnable
            public void run() {
                VungleLogger.verbose(true, AssetDownloader.TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Start to download asset %1$s, at: %2$d", downloadRequest, Long.valueOf(System.currentTimeMillis())));
                try {
                    AssetDownloader.this.launchRequest(downloadRequest, assetDownloadListener);
                } catch (IOException e) {
                    VungleLogger.error("AssetDownloader#download; loadAd sequence", "cannot launch request due to " + e);
                    Log.e(AssetDownloader.TAG, "Error on launching request", e);
                    AssetDownloader.this.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, e, 1));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchRequest(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) throws IOException {
        synchronized (this.addLock) {
            synchronized (this) {
                if (downloadRequest.isCancelled()) {
                    this.transitioning.remove(downloadRequest);
                    String str = TAG;
                    Log.d(str, "Request " + downloadRequest.url + " is cancelled before starting");
                    new AssetDownloadListener.Progress().status = 3;
                    deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new IOException(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED), 1));
                    return;
                }
                DownloadRequestMediator downloadRequestMediator = this.mediators.get(mediatorKeyFromRequest(downloadRequest));
                if (downloadRequestMediator == null) {
                    this.transitioning.remove(downloadRequest);
                    DownloadRequestMediator makeNewMediator = makeNewMediator(downloadRequest, assetDownloadListener);
                    this.mediators.put(makeNewMediator.key, makeNewMediator);
                    load(makeNewMediator);
                    return;
                }
                downloadRequestMediator.lock();
                synchronized (this) {
                    this.transitioning.remove(downloadRequest);
                    if (!downloadRequestMediator.is(6) && (!downloadRequestMediator.is(3) || downloadRequest.isCancelled())) {
                        if (downloadRequestMediator.isCacheable) {
                            downloadRequestMediator.add(downloadRequest, assetDownloadListener);
                            if (downloadRequestMediator.is(2)) {
                                load(downloadRequestMediator);
                            }
                        } else {
                            VungleLogger.warn("AssetDownloader#launchRequest; loadAd sequence", "request " + downloadRequest + " is already running");
                            deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new IllegalArgumentException("DownloadRequest is already running"), 1));
                        }
                    }
                    DownloadRequestMediator makeNewMediator2 = makeNewMediator(downloadRequest, assetDownloadListener);
                    this.mediators.put(downloadRequestMediator.key, makeNewMediator2);
                    load(makeNewMediator2);
                }
                downloadRequestMediator.unlock();
            }
        }
    }

    private DownloadRequestMediator makeNewMediator(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) throws IOException {
        File file;
        File metaFile;
        boolean z;
        String str;
        if (!isCacheEnabled()) {
            file = new File(downloadRequest.path);
            metaFile = new File(file.getPath() + META_POSTFIX_EXT);
            str = downloadRequest.url + " " + downloadRequest.path;
            z = false;
        } else {
            file = this.cache.getFile(downloadRequest.url);
            metaFile = this.cache.getMetaFile(file);
            z = true;
            str = downloadRequest.url;
        }
        String str2 = str;
        boolean z2 = z;
        Log.d(TAG, "Destination file " + file.getPath());
        return new DownloadRequestMediator(downloadRequest, assetDownloadListener, file.getPath(), metaFile.getPath(), z2, str2);
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized List<DownloadRequest> getAllRequests() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (DownloadRequestMediator downloadRequestMediator : new ArrayList(this.mediators.values())) {
            arrayList.addAll(downloadRequestMediator.requests());
        }
        arrayList.addAll(this.transitioning);
        return arrayList;
    }

    private synchronized void load(final DownloadRequestMediator downloadRequestMediator) {
        addNetworkListener();
        downloadRequestMediator.set(1);
        this.downloadExecutor.execute(new DownloadPriorityRunnable(downloadRequestMediator) { // from class: com.vungle.warren.downloader.AssetDownloader.2
            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:343:0x0963
                	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    Method dump skipped, instructions count: 3652
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.AnonymousClass2.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean useCacheOnFail(DownloadRequestMediator downloadRequestMediator, File file, Map<String, String> map, int i) {
        return this.cache != null && downloadRequestMediator.isCacheable && i != 200 && i != RANGE_NOT_SATISFIABLE && i != 206 && Boolean.parseBoolean(map.get(DOWNLOAD_COMPLETE)) && file.exists() && file.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeMediator(DownloadRequestMediator downloadRequestMediator) {
        this.mediators.remove(downloadRequestMediator.key);
    }

    private void addNetworkListener() {
        Log.d(TAG, "Adding network listner");
        this.networkProvider.addListener(this.networkListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pause(DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress, AssetDownloadListener.DownloadError downloadError) {
        if (downloadRequestMediator.is(3) || isAnyConnected(downloadRequestMediator)) {
            return false;
        }
        progress.status = 2;
        AssetDownloadListener.Progress copy = AssetDownloadListener.Progress.copy(progress);
        boolean z = false;
        for (Pair<DownloadRequest, AssetDownloadListener> pair : downloadRequestMediator.values()) {
            DownloadRequest downloadRequest = pair.first;
            if (downloadRequest != null) {
                if (!downloadRequest.pauseOnConnectionLost) {
                    downloadRequestMediator.remove(downloadRequest);
                    deliverError(downloadRequest, pair.second, downloadError);
                } else {
                    downloadRequestMediator.set(2);
                    Log.d(TAG, "Pausing download " + debugString(downloadRequest));
                    deliverProgress(copy, pair.first, pair.second);
                    z = true;
                }
            }
        }
        if (!z) {
            downloadRequestMediator.set(5);
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Attempted to pause - ");
        sb.append(downloadRequestMediator.getStatus() == 2);
        Log.d(str, sb.toString());
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sleep(long j) {
        try {
            Thread.sleep(Math.max(0L, j));
        } catch (InterruptedException e) {
            Log.e(TAG, "InterruptedException ", e);
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> makeMeta(File file, Headers headers, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(DOWNLOAD_URL, str);
        hashMap.put(ETAG, headers.get(ETAG));
        hashMap.put(LAST_MODIFIED, headers.get(LAST_MODIFIED));
        hashMap.put(ACCEPT_RANGES, headers.get(ACCEPT_RANGES));
        hashMap.put(CONTENT_ENCODING, headers.get(CONTENT_ENCODING));
        saveMeta(file, hashMap);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkEncoding(File file, File file2, Headers headers) throws IOException {
        String str = headers.get(CONTENT_ENCODING);
        if (str == null || GZIP.equalsIgnoreCase(str) || IDENTITY.equalsIgnoreCase(str)) {
            return;
        }
        deleteFileAndMeta(file, file2, false);
        VungleLogger.error("AssetDownloader#checkEncoding; loadAd sequence", String.format("unknown %1$s %2$s ", CONTENT_ENCODING, str));
        throw new IOException("Unknown Content-Encoding");
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.base/java.util.BitSet.or(BitSet.java:941)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public boolean useCacheWithoutVerification(com.vungle.warren.downloader.DownloadRequestMediator r6, java.io.File r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r5 = this;
            r0 = 0
            if (r8 == 0) goto L45
            com.vungle.warren.downloader.DownloaderCache r1 = r5.cache
            if (r1 == 0) goto L45
            boolean r6 = r6.isCacheable
            if (r6 != 0) goto Lc
            goto L45
        Lc:
            java.lang.String r6 = "Last-Cache-Verification"
            java.lang.Object r6 = r8.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L45
            boolean r7 = r7.exists()
            if (r7 == 0) goto L45
            java.lang.String r7 = "DOWNLOAD_COMPLETE"
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = java.lang.Boolean.parseBoolean(r7)
            if (r7 != 0) goto L2b
            goto L45
        L2b:
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L45
            long r1 = r5.timeWindow
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r3 = r3 - r6
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L44
            long r6 = r6 + r1
            long r1 = java.lang.System.currentTimeMillis()
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 < 0) goto L45
        L44:
            r0 = 1
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.useCacheWithoutVerification(com.vungle.warren.downloader.DownloadRequestMediator, java.io.File, java.util.Map):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean partialMalformed(long j, int i, Response response, DownloadRequestMediator downloadRequestMediator) {
        return (i == 206 && !satisfiesPartialDownload(response, j, downloadRequestMediator)) || i == RANGE_NOT_SATISFIABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendHeaders(long j, File file, HashMap<String, String> hashMap, Request.Builder builder) {
        builder.addHeader(ACCEPT_ENCODING, IDENTITY);
        if (!file.exists() || hashMap.isEmpty()) {
            return;
        }
        String str = hashMap.get(ETAG);
        String str2 = hashMap.get(LAST_MODIFIED);
        if (Boolean.parseBoolean(hashMap.get(DOWNLOAD_COMPLETE))) {
            if (!TextUtils.isEmpty(str)) {
                builder.addHeader(IF_NONE_MATCH, str);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            builder.addHeader(IF_MODIFIED_SINCE, str2);
        } else if (BYTES.equalsIgnoreCase(hashMap.get(ACCEPT_RANGES))) {
            if (hashMap.get(CONTENT_ENCODING) == null || IDENTITY.equalsIgnoreCase(hashMap.get(CONTENT_ENCODING))) {
                builder.addHeader(RANGE, "bytes=" + j + "-");
                if (!TextUtils.isEmpty(str)) {
                    builder.addHeader(IF_RANGE, str);
                } else if (TextUtils.isEmpty(str2)) {
                } else {
                    builder.addHeader(IF_RANGE, str2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseBody decodeGzipIfNeeded(Response response) {
        if (GZIP.equalsIgnoreCase(response.header(CONTENT_ENCODING)) && HttpHeaders.hasBody(response) && response.body() != null) {
            return new RealResponseBody(response.header(CONTENT_TYPE), -1L, Okio.buffer(new GzipSource(response.body().source())));
        }
        return response.body();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onCancelledMediator(DownloadRequestMediator downloadRequestMediator) {
        for (DownloadRequest downloadRequest : downloadRequestMediator.requests()) {
            onCancelled(downloadRequest);
        }
    }

    private void onCancelled(DownloadRequest downloadRequest) {
        if (downloadRequest.isCancelled()) {
            return;
        }
        downloadRequest.cancel();
        DownloadRequestMediator findMediatorForCancellation = findMediatorForCancellation(downloadRequest);
        if (findMediatorForCancellation != null && findMediatorForCancellation.getStatus() != 3) {
            Pair<DownloadRequest, AssetDownloadListener> remove = findMediatorForCancellation.remove(downloadRequest);
            DownloadRequest downloadRequest2 = remove == null ? null : remove.first;
            AssetDownloadListener assetDownloadListener = remove != null ? remove.second : null;
            if (findMediatorForCancellation.values().isEmpty()) {
                findMediatorForCancellation.set(3);
            }
            if (downloadRequest2 == null) {
                return;
            }
            AssetDownloadListener.Progress progress = new AssetDownloadListener.Progress();
            progress.status = 3;
            deliverProgress(progress, downloadRequest2, assetDownloadListener);
        }
        removeNetworkListener();
    }

    private synchronized DownloadRequestMediator findMediatorForCancellation(DownloadRequest downloadRequest) {
        ArrayList<DownloadRequestMediator> arrayList = new ArrayList(2);
        arrayList.add(this.mediators.get(getCacheableKey(downloadRequest)));
        arrayList.add(this.mediators.get(getNonCacheableKey(downloadRequest)));
        for (DownloadRequestMediator downloadRequestMediator : arrayList) {
            if (downloadRequestMediator != null) {
                for (DownloadRequest downloadRequest2 : downloadRequestMediator.requests()) {
                    if (downloadRequest2.equals(downloadRequest)) {
                        return downloadRequestMediator;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNetworkListener() {
        if (this.mediators.isEmpty()) {
            Log.d(TAG, "Removing listener");
            this.networkProvider.removeListener(this.networkListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int mapExceptionToReason(Throwable th, boolean z) {
        if (th instanceof RuntimeException) {
            return 4;
        }
        if (!z || (th instanceof SocketException) || (th instanceof SocketTimeoutException)) {
            return 0;
        }
        return ((th instanceof UnknownHostException) || (th instanceof SSLException)) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getContentLength(Response response) {
        if (response == null) {
            return -1L;
        }
        String str = response.headers().get("Content-Length");
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean notModified(File file, Response response, DownloadRequestMediator downloadRequestMediator, HashMap<String, String> hashMap) {
        if (response != null && file.exists() && file.length() > 0 && downloadRequestMediator.isCacheable) {
            int code = response.code();
            if (Boolean.parseBoolean(hashMap.get(DOWNLOAD_COMPLETE)) && code == 304) {
                String str = TAG;
                Log.d(str, "304 code, data size matches file size " + debugString(downloadRequestMediator));
                return true;
            }
        }
        return false;
    }

    private boolean satisfiesPartialDownload(Response response, long j, DownloadRequestMediator downloadRequestMediator) {
        RangeResponse rangeResponse = new RangeResponse(response.headers().get(CONTENT_RANGE));
        boolean z = response.code() == 206 && BYTES.equalsIgnoreCase(rangeResponse.dimension) && rangeResponse.rangeStart >= 0 && j == rangeResponse.rangeStart;
        String str = TAG;
        Log.d(str, "satisfies partial download: " + z + " " + debugString(downloadRequestMediator));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String debugString(DownloadRequestMediator downloadRequestMediator) {
        return ", mediator url - " + downloadRequestMediator.url + ", path - " + downloadRequestMediator.filePath + ", th - " + Thread.currentThread().getName() + "id " + downloadRequestMediator;
    }

    private String debugString(DownloadRequest downloadRequest) {
        return ", single request url - " + downloadRequest.url + ", path - " + downloadRequest.path + ", th - " + Thread.currentThread().getName() + "id " + downloadRequest.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAnyConnected(DownloadRequestMediator downloadRequestMediator) {
        for (DownloadRequest downloadRequest : downloadRequestMediator.requests()) {
            if (downloadRequest == null) {
                Log.d(TAG, "Request is null");
            } else if (isConnected(downloadRequest)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean isConnected(com.vungle.warren.downloader.DownloadRequest r6) {
        /*
            r5 = this;
            com.vungle.warren.utility.NetworkProvider r0 = r5.networkProvider
            int r0 = r0.getCurrentNetworkType()
            r1 = 1
            if (r0 < 0) goto Lf
            int r2 = r6.networkType
            r3 = 3
            if (r2 != r3) goto Lf
            return r1
        Lf:
            if (r0 == 0) goto L28
            if (r0 == r1) goto L26
            r2 = 4
            if (r0 == r2) goto L28
            r2 = 9
            if (r0 == r2) goto L26
            r2 = 17
            if (r0 == r2) goto L28
            r2 = 6
            if (r0 == r2) goto L26
            r2 = 7
            if (r0 == r2) goto L28
            r2 = -1
            goto L29
        L26:
            r2 = 2
            goto L29
        L28:
            r2 = r1
        L29:
            if (r2 <= 0) goto L31
            int r3 = r6.networkType
            r3 = r3 & r2
            if (r3 != r2) goto L31
            goto L32
        L31:
            r1 = 0
        L32:
            java.lang.String r2 = com.vungle.warren.downloader.AssetDownloader.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checking pause for type: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " connected "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r6 = r5.debugString(r6)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            android.util.Log.d(r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.isConnected(com.vungle.warren.downloader.DownloadRequest):boolean");
    }

    @Override // com.vungle.warren.downloader.Downloader
    public boolean cancelAndAwait(DownloadRequest downloadRequest, long j) {
        if (downloadRequest == null) {
            return false;
        }
        cancel(downloadRequest);
        long currentTimeMillis = System.currentTimeMillis() + Math.max(0L, j);
        while (System.currentTimeMillis() < currentTimeMillis) {
            DownloadRequestMediator findMediatorForCancellation = findMediatorForCancellation(downloadRequest);
            synchronized (this) {
                if (!this.transitioning.contains(downloadRequest) && (findMediatorForCancellation == null || !findMediatorForCancellation.requests().contains(downloadRequest))) {
                    return true;
                }
            }
            sleep(10L);
        }
        return false;
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void cancel(DownloadRequest downloadRequest) {
        if (downloadRequest == null) {
            return;
        }
        onCancelled(downloadRequest);
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void cancelAll() {
        Log.d(TAG, "Cancelling all");
        for (DownloadRequest downloadRequest : this.transitioning) {
            String str = TAG;
            Log.d(str, "Cancel in transtiotion " + downloadRequest.url);
            cancel(downloadRequest);
        }
        String str2 = TAG;
        Log.d(str2, "Cancel in mediator " + this.mediators.values().size());
        for (DownloadRequestMediator downloadRequestMediator : this.mediators.values()) {
            String str3 = TAG;
            Log.d(str3, "Cancel in mediator " + downloadRequestMediator.key);
            onCancelledMediator(downloadRequestMediator);
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public void setProgressStep(int i) {
        if (i != 0) {
            this.progressStep = i;
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void init() {
        if (this.cache != null) {
            this.cache.init();
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void clearCache() {
        if (this.cache != null) {
            this.cache.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkChanged(int i) {
        String str = TAG;
        Log.d(str, "Num of connections: " + this.mediators.values().size());
        for (DownloadRequestMediator downloadRequestMediator : this.mediators.values()) {
            if (downloadRequestMediator.is(3)) {
                Log.d(TAG, "Result cancelled");
            } else {
                boolean isAnyConnected = isAnyConnected(downloadRequestMediator);
                String str2 = TAG;
                Log.d(str2, "Connected = " + isAnyConnected + " for " + i);
                downloadRequestMediator.setConnected(isAnyConnected);
                if (downloadRequestMediator.isPausable() && isAnyConnected && downloadRequestMediator.is(2)) {
                    load(downloadRequestMediator);
                    String str3 = TAG;
                    Log.d(str3, "resumed " + downloadRequestMediator.key + " " + downloadRequestMediator);
                }
            }
        }
    }

    private boolean responseVersionMatches(Response response, HashMap<String, String> hashMap) {
        Headers headers = response.headers();
        String str = headers.get(ETAG);
        String str2 = headers.get(LAST_MODIFIED);
        String str3 = TAG;
        Log.d(str3, "server etag: " + str);
        String str4 = TAG;
        Log.d(str4, "server lastModified: " + str2);
        if (str != null && !str.equals(hashMap.get(ETAG))) {
            String str5 = TAG;
            Log.d(str5, "etags miss match current: " + hashMap.get(ETAG));
            return false;
        } else if (str2 == null || str2.equals(hashMap.get(LAST_MODIFIED))) {
            return true;
        } else {
            String str6 = TAG;
            Log.d(str6, "lastModified miss match current: " + hashMap.get(LAST_MODIFIED));
            return false;
        }
    }

    synchronized void shutdown() {
        cancel(null);
        this.transitioning.clear();
        this.mediators.clear();
        this.uiExecutor.shutdownNow();
        this.downloadExecutor.shutdownNow();
        try {
            this.downloadExecutor.awaitTermination(2L, TimeUnit.SECONDS);
            this.uiExecutor.awaitTermination(2L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e(TAG, "InterruptedException ", e);
            Thread.currentThread().interrupt();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class DownloadPriorityRunnable implements Comparable, Runnable {
        private static final AtomicInteger seq = new AtomicInteger();
        private final DownloadRequestMediator mediator;
        private final int order;
        private final AssetPriority priority;

        DownloadPriorityRunnable(DownloadRequestMediator downloadRequestMediator) {
            this.order = seq.incrementAndGet();
            this.mediator = downloadRequestMediator;
            this.priority = downloadRequestMediator.priority;
            downloadRequestMediator.setRunnable(this);
        }

        DownloadPriorityRunnable(AssetPriority assetPriority) {
            this.order = seq.incrementAndGet();
            this.priority = assetPriority;
            this.mediator = null;
        }

        AssetPriority getPriority() {
            DownloadRequestMediator downloadRequestMediator = this.mediator;
            return downloadRequestMediator != null ? downloadRequestMediator.getPriority() : this.priority;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            if (obj instanceof DownloadPriorityRunnable) {
                DownloadPriorityRunnable downloadPriorityRunnable = (DownloadPriorityRunnable) obj;
                int compareTo = getPriority().compareTo(downloadPriorityRunnable.getPriority());
                return compareTo == 0 ? Integer.valueOf(this.order).compareTo(Integer.valueOf(downloadPriorityRunnable.order)) : compareTo;
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> extractMeta(File file) {
        return FileUtility.readMap(file.getPath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveMeta(File file, HashMap<String, String> hashMap) {
        FileUtility.writeMap(file.getPath(), hashMap);
    }

    synchronized void setDownloadedForTests(boolean z, String str, String str2) {
        ArrayList<File> arrayList = new ArrayList(2);
        if (this.cache != null) {
            try {
                arrayList.add(this.cache.getMetaFile(this.cache.getFile(str)));
            } catch (IOException e) {
                Log.e(TAG, "Cannot add or get meta file", e);
                throw new RuntimeException("Failed to get file for request");
            }
        }
        arrayList.add(new File(str2 + META_POSTFIX_EXT));
        for (File file : arrayList) {
            HashMap<String, String> extractMeta = extractMeta(file);
            extractMeta.put(DOWNLOAD_COMPLETE, Boolean.valueOf(z).toString());
            FileUtility.writeSerializable(file, extractMeta);
        }
    }

    private void copyToDestination(File file, File file2, Pair<DownloadRequest, AssetDownloadListener> pair) {
        FileOutputStream fileOutputStream;
        IOException e;
        FileInputStream fileInputStream;
        if (file2.exists()) {
            FileUtility.deleteAndLogIfFailed(file2);
        }
        if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            fileOutputStream = null;
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            FileUtility.closeQuietly(fileInputStream2);
            FileUtility.closeQuietly(fileOutputStream);
            throw th;
        }
        try {
            fileOutputStream = new FileOutputStream(file2);
            try {
                FileChannel channel = fileInputStream.getChannel();
                channel.transferTo(0L, channel.size(), fileOutputStream.getChannel());
                Log.d(TAG, "Copying: finished " + pair.first.url + " copying to " + file2.getPath());
            } catch (IOException e3) {
                e = e3;
                VungleLogger.error("AssetDownloader#copyToDestination; loadAd sequence", String.format("cannot copy from %1$s(%2$s) to %3$s due to %4$s", file.getPath(), pair.first.url, file2.getPath(), e));
                deliverError(pair.first, pair.second, new AssetDownloadListener.DownloadError(-1, e, 2));
                Log.d(TAG, "Copying: error" + pair.first.url + " copying to " + file2.getPath());
                FileUtility.closeQuietly(fileInputStream);
                FileUtility.closeQuietly(fileOutputStream);
            }
        } catch (IOException e4) {
            fileOutputStream = null;
            e = e4;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            fileInputStream2 = fileInputStream;
            FileUtility.closeQuietly(fileInputStream2);
            FileUtility.closeQuietly(fileOutputStream);
            throw th;
        }
        FileUtility.closeQuietly(fileInputStream);
        FileUtility.closeQuietly(fileOutputStream);
    }

    private void deliverSuccess(Pair<DownloadRequest, AssetDownloadListener> pair, File file) {
        if (pair.second != null) {
            pair.second.onSuccess(file, pair.first);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSuccessMediator(File file, DownloadRequestMediator downloadRequestMediator) {
        String str = TAG;
        Log.d(str, "OnComplete - Removing connections and listener " + downloadRequestMediator);
        try {
            downloadRequestMediator.lock();
            List<Pair<DownloadRequest, AssetDownloadListener>> values = downloadRequestMediator.values();
            if (!file.exists()) {
                VungleLogger.error("AssetDownloader#onSuccessMediator; loadAd sequence", String.format("File %1$s does not exist; mediator %2$s ", file.getPath(), debugString(downloadRequestMediator)));
                onErrorMediator(new AssetDownloadListener.DownloadError(-1, new IOException("File is deleted"), 2), downloadRequestMediator);
                return;
            }
            if (this.cache != null && downloadRequestMediator.isCacheable) {
                this.cache.onCacheHit(file, values.size());
                this.cache.setCacheLastUpdateTimestamp(file, System.currentTimeMillis());
            }
            for (Pair<DownloadRequest, AssetDownloadListener> pair : values) {
                File file2 = new File(pair.first.path);
                if (file2.equals(file)) {
                    file2 = file;
                } else {
                    copyToDestination(file, file2, pair);
                }
                String str2 = TAG;
                Log.d(str2, "Deliver success:" + pair.first.url + " dest file: " + file2.getPath());
                deliverSuccess(pair, file2);
            }
            removeMediator(downloadRequestMediator);
            downloadRequestMediator.set(6);
            String str3 = TAG;
            Log.d(str3, "Finished " + debugString(downloadRequestMediator));
        } finally {
            downloadRequestMediator.unlock();
        }
    }

    private String mediatorKeyFromRequest(DownloadRequest downloadRequest) {
        if (isCacheEnabled()) {
            return getCacheableKey(downloadRequest);
        }
        return getNonCacheableKey(downloadRequest);
    }

    private String getNonCacheableKey(DownloadRequest downloadRequest) {
        return downloadRequest.url + " " + downloadRequest.path;
    }

    private String getCacheableKey(DownloadRequest downloadRequest) {
        return downloadRequest.url;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onErrorMediator(AssetDownloadListener.DownloadError downloadError, DownloadRequestMediator downloadRequestMediator) {
        VungleLogger.error("AssetDownloader#onErrorMediator; loadAd sequence", String.format("Error %1$s occured; mediator %2$s", downloadError, debugString(downloadRequestMediator)));
        if (downloadError == null) {
            downloadError = new AssetDownloadListener.DownloadError(-1, new RuntimeException(), 4);
        }
        try {
            downloadRequestMediator.lock();
            for (Pair<DownloadRequest, AssetDownloadListener> pair : downloadRequestMediator.values()) {
                deliverError(pair.first, pair.second, downloadError);
            }
            removeMediator(downloadRequestMediator);
            downloadRequestMediator.set(6);
        } finally {
            downloadRequestMediator.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deliverError(final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener, final AssetDownloadListener.DownloadError downloadError) {
        Object[] objArr = new Object[2];
        objArr[0] = downloadError;
        objArr[1] = downloadRequest != null ? debugString(downloadRequest) : "null";
        VungleLogger.error("AssetDownloader#deliverError; loadAd sequence", String.format("Delivering error %1$s; request %2$s", objArr));
        if (assetDownloadListener != null) {
            this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.4
                @Override // java.lang.Runnable
                public void run() {
                    assetDownloadListener.onError(downloadError, downloadRequest);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgressMediator(DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress) {
        if (downloadRequestMediator == null) {
            return;
        }
        AssetDownloadListener.Progress copy = AssetDownloadListener.Progress.copy(progress);
        String str = TAG;
        Log.d(str, "Progress " + progress.progressPercent + " status " + progress.status + " " + downloadRequestMediator + " " + downloadRequestMediator.filePath);
        for (Pair<DownloadRequest, AssetDownloadListener> pair : downloadRequestMediator.values()) {
            deliverProgress(copy, pair.first, pair.second);
        }
    }

    private void deliverProgress(final AssetDownloadListener.Progress progress, final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener) {
        if (assetDownloadListener != null) {
            this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.5
                @Override // java.lang.Runnable
                public void run() {
                    String str = AssetDownloader.TAG;
                    Log.d(str, "On progress " + downloadRequest);
                    assetDownloadListener.onProgress(progress, downloadRequest);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteFileAndMeta(File file, File file2, boolean z) {
        if (file == null) {
            return;
        }
        FileUtility.deleteAndLogIfFailed(file);
        if (file2 != null) {
            FileUtility.deleteAndLogIfFailed(file2);
        }
        if (this.cache == null || !isCacheEnabled()) {
            return;
        }
        if (z) {
            this.cache.deleteAndRemove(file);
        } else {
            this.cache.deleteContents(file);
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public boolean dropCache(String str) {
        DownloaderCache downloaderCache = this.cache;
        if (downloaderCache != null && str != null) {
            try {
                File file = downloaderCache.getFile(str);
                String str2 = TAG;
                Log.d(str2, "Broken asset, deleting " + file.getPath());
                return this.cache.deleteAndRemove(file);
            } catch (IOException e) {
                VungleLogger.error("AssetDownloader#dropCache; loadAd sequence", String.format("Error %1$s occured", e));
                Log.e(TAG, "There was an error to get file", e);
            }
        }
        return false;
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized boolean isCacheEnabled() {
        boolean z;
        if (this.cache != null) {
            z = this.isCacheEnabled;
        }
        return z;
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void setCacheEnabled(boolean z) {
        this.isCacheEnabled = z;
    }

    @Override // com.vungle.warren.downloader.Downloader
    public void updatePriority(DownloadRequest downloadRequest) {
        Runnable runnable;
        DownloadRequestMediator findMediatorForCancellation = findMediatorForCancellation(downloadRequest);
        if (findMediatorForCancellation == null || (runnable = findMediatorForCancellation.getRunnable()) == null || !this.downloadExecutor.remove(runnable)) {
            return;
        }
        String str = TAG;
        Log.d(str, "prio: updated to " + findMediatorForCancellation.getPriority());
        this.downloadExecutor.execute(runnable);
    }
}
