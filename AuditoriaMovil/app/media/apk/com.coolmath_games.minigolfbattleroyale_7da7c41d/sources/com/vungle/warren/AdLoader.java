package com.vungle.warren;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.vungle.warren.AdConfig;
import com.vungle.warren.OperationSequence;
import com.vungle.warren.downloader.AssetDownloadListener;
import com.vungle.warren.downloader.AssetPriority;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdAsset;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.JsonUtil;
import com.vungle.warren.model.Placement;
import com.vungle.warren.network.Call;
import com.vungle.warren.network.Callback;
import com.vungle.warren.network.Response;
import com.vungle.warren.omsdk.OMInjector;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.tasks.DownloadJob;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.ui.HackMraid;
import com.vungle.warren.utility.Executors;
import com.vungle.warren.utility.FileUtility;
import com.vungle.warren.utility.UnzipUtility;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public class AdLoader {
    public static final boolean DEFAULT_LOAD_OPTIMIZATION_ENABLED = false;
    private static final String DOWNLOAD_AD_ASSETS_CONTEXT = "AdLoader#downloadAdAssets; loadAd sequence";
    private static final String DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT = "AdLoader#DownloadAdCallback#onDownloadCompleted; loadAd sequence";
    public static final long EXPONENTIAL_RATE = 2;
    private static final String FETCH_AD_METADATA_CONTEXT = "AdLoader#fetchAdMetadata; loadAd sequence";
    private static final String GET_ASSET_DOWNLOAD_LISTENER_CONTEXT = "AdLoader#getAssetDownloadListener; loadAd sequence";
    private static final String LOAD_AD_EXECUTE_CONTEXT = "AdLoader#loadAd#execute; loadAd sequence";
    private static final String NOT_A_DIR = "not a dir";
    private static final String ON_ASSET_DOWNLOAD_FINISHED_CONTEXT = "AdLoader#onAssetDownloadFinished; loadAd sequence";
    private static final String OP_ID_AND_ADVERTISEMENT_FORMAT = "request = %1$s; advertisement = %2$s";
    private static final String PLACEMENT_ID_AND_ADVERTISEMENT_FORMAT_2_3 = "request = %2$s; advertisement = %3$s";
    private static final String PLACEMENT_ID_AND_ADVERTISEMENT_FORMAT_3_4 = "request = %3$s; advertisement = %4$s";
    public static final int RETRY_COUNT = 5;
    public static final long RETRY_DELAY = 2000;
    private static final String STRING_AND_OP_ID_FORMAT = "%1$s; request = %2$s";
    private static final String TAG = AdLoader.class.getCanonicalName();
    public static final String TT_DOWNLOAD_CONTEXT = "ttDownloadContext";
    private final CacheManager cacheManager;
    private final Downloader downloader;
    private final OMInjector omInjector;
    private final Repository repository;
    private final RuntimeValues runtimeValues;
    private final Executors sdkExecutors;
    private final OperationSequence sequence;
    private final VisionController visionController;
    private final VungleStaticApi vungleApi;
    private final VungleApiClient vungleApiClient;
    private final Map<AdRequest, Operation> loadOperations = new ConcurrentHashMap();
    private final Map<AdRequest, Operation> pendingOperations = new ConcurrentHashMap();
    private final List<Operation> startingOperations = new CopyOnWriteArrayList();
    private AdRequest sequenceLoadingRequest = null;
    private final AtomicReference<JobRunner> jobRunnerRef = new AtomicReference<>();
    private boolean adLoadOptimizationEnabled = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface DownloadCallback {
        void onDownloadCompleted(AdRequest adRequest, String str);

        void onDownloadFailed(VungleException vungleException, AdRequest adRequest, String str);

        void onReady(AdRequest adRequest, Placement placement, Advertisement advertisement);
    }

    /* loaded from: classes2.dex */
    public @interface Priority {
        public static final int HIGH = 1;
        public static final int HIGHEST = 0;
        public static final int LOWEST = Integer.MAX_VALUE;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ReschedulePolicy {
        public static final int EXPONENTIAL = 0;
        public static final int EXPONENTIAL_ENDLESS_AD = 1;
    }

    private boolean recoverableServerCode(int i) {
        return i == 408 || (500 <= i && i < 600);
    }

    /* loaded from: classes2.dex */
    public static class Operation {
        long delay;
        boolean logError;
        int policy;
        int priority;
        final AdRequest request;
        int retry;
        long retryDelay;
        int retryLimit;
        final AdConfig.AdSize size;
        final Set<LoadAdCallback> loadAdCallbacks = new CopyOnWriteArraySet();
        List<DownloadRequest> requests = new CopyOnWriteArrayList();
        final AtomicBoolean loading = new AtomicBoolean();

        public Operation(AdRequest adRequest, AdConfig.AdSize adSize, long j, long j2, int i, int i2, int i3, boolean z, int i4, LoadAdCallback... loadAdCallbackArr) {
            this.request = adRequest;
            this.delay = j;
            this.retryDelay = j2;
            this.retryLimit = i;
            this.policy = i2;
            this.retry = i3;
            this.size = adSize;
            this.logError = z;
            this.priority = i4;
            if (loadAdCallbackArr != null) {
                this.loadAdCallbacks.addAll(Arrays.asList(loadAdCallbackArr));
            }
        }

        Operation delay(long j) {
            return new Operation(this.request, this.size, j, this.retryDelay, this.retryLimit, this.policy, this.retry, this.logError, this.priority, (LoadAdCallback[]) this.loadAdCallbacks.toArray(new LoadAdCallback[0]));
        }

        Operation retryDelay(long j) {
            return new Operation(this.request, this.size, this.delay, j, this.retryLimit, this.policy, this.retry, this.logError, this.priority, (LoadAdCallback[]) this.loadAdCallbacks.toArray(new LoadAdCallback[0]));
        }

        Operation retry(int i) {
            return new Operation(this.request, this.size, this.delay, this.retryDelay, this.retryLimit, this.policy, i, this.logError, this.priority, (LoadAdCallback[]) this.loadAdCallbacks.toArray(new LoadAdCallback[0]));
        }

        void merge(Operation operation) {
            this.delay = Math.min(this.delay, operation.delay);
            this.retryDelay = Math.min(this.retryDelay, operation.retryDelay);
            this.retryLimit = Math.min(this.retryLimit, operation.retryLimit);
            int i = operation.policy;
            if (i != 0) {
                i = this.policy;
            }
            this.policy = i;
            this.retry = Math.min(this.retry, operation.retry);
            this.logError |= operation.logError;
            this.priority = Math.min(this.priority, operation.priority);
            this.loadAdCallbacks.addAll(operation.loadAdCallbacks);
        }

        public String toString() {
            return "request=" + this.request.toString() + " size=" + this.size.toString() + " priority=" + this.priority + " policy=" + this.policy + " retry=" + this.retry + "/" + this.retryLimit + " delay=" + this.delay + "->" + this.retryDelay + " log=" + this.logError;
        }

        public AdRequest getRequest() {
            return this.request;
        }

        public AdConfig.AdSize getSize() {
            return this.size;
        }

        public boolean getLogError() {
            return this.logError;
        }

        public int getPriority() {
            return this.priority;
        }
    }

    public AdLoader(Executors executors, Repository repository, VungleApiClient vungleApiClient, CacheManager cacheManager, Downloader downloader, RuntimeValues runtimeValues, VungleStaticApi vungleStaticApi, VisionController visionController, OperationSequence operationSequence, OMInjector oMInjector) {
        this.sdkExecutors = executors;
        this.repository = repository;
        this.vungleApiClient = vungleApiClient;
        this.cacheManager = cacheManager;
        this.downloader = downloader;
        this.runtimeValues = runtimeValues;
        this.vungleApi = vungleStaticApi;
        this.visionController = visionController;
        this.sequence = operationSequence;
        this.omInjector = oMInjector;
    }

    public void init(JobRunner jobRunner) {
        this.jobRunnerRef.set(jobRunner);
        this.downloader.init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canReDownload(Advertisement advertisement) {
        List<AdAsset> list;
        if (advertisement == null || (!(advertisement.getState() == 0 || advertisement.getState() == 1) || (list = this.repository.loadAllAdAssets(advertisement.getId()).get()) == null || list.size() == 0)) {
            return false;
        }
        for (AdAsset adAsset : list) {
            if (adAsset.fileType == 1) {
                if (!fileIsValid(new File(adAsset.localPath), adAsset)) {
                    return false;
                }
            } else if (TextUtils.isEmpty(adAsset.serverPath)) {
                return false;
            }
        }
        return true;
    }

    public boolean canPlayAd(Advertisement advertisement) {
        if (advertisement == null || advertisement.getState() != 1) {
            return false;
        }
        return hasAssetsFor(advertisement);
    }

    public boolean canRenderAd(Advertisement advertisement) {
        if (advertisement == null) {
            return false;
        }
        if (advertisement.getState() == 1 || advertisement.getState() == 2) {
            return hasAssetsFor(advertisement);
        }
        return false;
    }

    public void clear() {
        HashSet<AdRequest> hashSet = new HashSet();
        hashSet.addAll(this.loadOperations.keySet());
        hashSet.addAll(this.pendingOperations.keySet());
        for (AdRequest adRequest : hashSet) {
            Operation remove = this.loadOperations.remove(adRequest);
            this.startingOperations.remove(remove);
            onError(remove, 25);
            onError(this.pendingOperations.remove(adRequest), 25);
        }
        for (Operation operation : this.startingOperations) {
            this.startingOperations.remove(operation);
            onError(operation, 25);
        }
        this.sdkExecutors.getBackgroundExecutor().submit(new Runnable() { // from class: com.vungle.warren.AdLoader.1
            @Override // java.lang.Runnable
            public void run() {
                AdLoader.this.sequenceLoadingRequest = null;
                for (OperationSequence.Entry entry : AdLoader.this.sequence.removeAll()) {
                    AdLoader.this.onError(entry.operation, 25);
                }
            }
        });
    }

    public boolean isLoading(AdRequest adRequest) {
        Operation operation = this.loadOperations.get(adRequest);
        return operation != null && operation.loading.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoading(AdRequest adRequest, boolean z) {
        Operation operation = this.loadOperations.get(adRequest);
        if (operation != null) {
            operation.loading.set(z);
        }
    }

    public void loadPendingInternal(AdRequest adRequest) {
        Operation remove = this.pendingOperations.remove(adRequest);
        if (remove == null) {
            return;
        }
        load(remove.delay(0L));
    }

    public void load(final Operation operation) {
        JobRunner jobRunner = this.jobRunnerRef.get();
        if (jobRunner == null) {
            VungleLogger.error("AdLoader#load; loadAd sequence", String.format("Cannot load operation %s; job runner is null", operation));
            onError(operation, 9);
            return;
        }
        checkAndUpdateHBPPlacementBannerSize(operation.request.getPlacementId(), operation.size);
        Operation remove = this.pendingOperations.remove(operation.request);
        if (remove != null) {
            operation.merge(remove);
        }
        if (operation.delay <= 0) {
            operation.request.timeStamp.set(System.currentTimeMillis());
            this.startingOperations.add(operation);
            this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AdLoader.this.startingOperations.contains(operation)) {
                        Operation operation2 = operation;
                        Operation operation3 = (Operation) AdLoader.this.loadOperations.get(operation2.request);
                        if (operation3 == null) {
                            OperationSequence.Entry remove2 = AdLoader.this.sequence.remove(operation2.request);
                            if (remove2 != null) {
                                remove2.operation.merge(operation2);
                                operation2 = remove2.operation;
                            }
                            if (operation2.priority <= 0) {
                                AdLoader.this.startLoading(operation2);
                            } else {
                                OperationSequence operationSequence = AdLoader.this.sequence;
                                if (remove2 == null) {
                                    remove2 = new OperationSequence.Entry(operation2);
                                }
                                operationSequence.offer(remove2);
                                AdLoader.this.tryLoadNextInQueue(null);
                            }
                        } else {
                            int i = operation3.priority;
                            operation3.merge(operation2);
                            if (operation3.priority < i) {
                                AdLoader.this.onChangePriority(operation3);
                            }
                        }
                        AdLoader.this.startingOperations.remove(operation2);
                    }
                }
            });
            return;
        }
        this.pendingOperations.put(operation.request, operation);
        jobRunner.execute(DownloadJob.makeJobInfo(operation.request).setDelay(operation.delay).setUpdateCurrent(true));
    }

    private void checkAndUpdateHBPPlacementBannerSize(String str, final AdConfig.AdSize adSize) {
        this.repository.load(str, Placement.class, new Repository.LoadCallback<Placement>() { // from class: com.vungle.warren.AdLoader.3
            @Override // com.vungle.warren.persistence.Repository.LoadCallback
            public void onLoaded(Placement placement) {
                if (placement != null && placement.isMultipleHBPEnabled() && placement.getPlacementAdType() == 1) {
                    AdConfig.AdSize adSize2 = placement.getAdSize();
                    AdConfig.AdSize adSize3 = adSize;
                    if (adSize2 != adSize3) {
                        placement.setAdSize(adSize3);
                        AdLoader.this.repository.save(placement, null, false);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoading(Operation operation) {
        this.loadOperations.put(operation.request, operation);
        loadAd(operation, new DownloadCallbackWrapper(this.sdkExecutors.getBackgroundExecutor(), new DownloadAdCallback()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryLoadNextInQueue(AdRequest adRequest) {
        AdRequest adRequest2 = this.sequenceLoadingRequest;
        if (adRequest2 == null || adRequest2.equals(adRequest)) {
            this.sequenceLoadingRequest = null;
            OperationSequence.Entry poll = this.sequence.poll();
            if (poll != null) {
                this.sequenceLoadingRequest = poll.operation.request;
                startLoading(poll.operation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onChangePriority(Operation operation) {
        for (DownloadRequest downloadRequest : operation.requests) {
            downloadRequest.setPriority(getAssetPriority(operation.priority, downloadRequest.path));
            this.downloader.updatePriority(downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(Operation operation, int i) {
        Object[] objArr = new Object[2];
        objArr[0] = new VungleException(i);
        objArr[1] = operation != null ? operation : "null";
        VungleLogger.error("AdLoader#onError; loadAd sequence", String.format("Error %1$s occured; operation is %2$s", objArr));
        if (operation != null) {
            for (LoadAdCallback loadAdCallback : operation.loadAdCallbacks) {
                loadAdCallback.onError(operation.request.getPlacementId(), new VungleException(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VungleException reposeCodeToVungleException(int i) {
        if (recoverableServerCode(i)) {
            return new VungleException(22);
        }
        return new VungleException(21);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VungleException retrofitToVungleException(Throwable th) {
        if (th instanceof UnknownHostException) {
            return new VungleException(11);
        }
        if (th instanceof IOException) {
            return new VungleException(20);
        }
        return new VungleException(11);
    }

    private void loadAd(final Operation operation, final DownloadCallbackWrapper downloadCallbackWrapper) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.4
            @Override // java.lang.Runnable
            public void run() {
                Advertisement advertisement;
                List<Advertisement> list;
                if (AdLoader.this.vungleApi.isInitialized()) {
                    Placement placement = (Placement) AdLoader.this.repository.load(operation.request.getPlacementId(), Placement.class).get();
                    if (placement == null) {
                        VungleLogger.error(AdLoader.LOAD_AD_EXECUTE_CONTEXT, "placement not found for " + operation.request);
                        downloadCallbackWrapper.onDownloadFailed(new VungleException(13), operation.request, null);
                        return;
                    } else if (placement.isValid()) {
                        if (AdLoader.this.isSizeInvalid(placement, operation.size)) {
                            VungleLogger.error(AdLoader.LOAD_AD_EXECUTE_CONTEXT, "size is invalid, size = " + operation.size);
                            downloadCallbackWrapper.onDownloadFailed(new VungleException(28), operation.request, null);
                            return;
                        }
                        if (placement.getPlacementAdType() == 1 && !placement.isMultipleHBPEnabled() && (list = AdLoader.this.repository.findValidAdvertisementsForPlacement(placement.getId(), operation.request.getEventId()).get()) != null) {
                            boolean z = false;
                            for (Advertisement advertisement2 : list) {
                                if (advertisement2.getAdConfig().getAdSize() != operation.size) {
                                    try {
                                        AdLoader.this.repository.deleteAdvertisement(advertisement2.getId());
                                        z = true;
                                    } catch (DatabaseHelper.DBException unused) {
                                        VungleLogger.error(AdLoader.LOAD_AD_EXECUTE_CONTEXT, "cannot delete advertisement, request = " + operation.request);
                                        downloadCallbackWrapper.onDownloadFailed(new VungleException(26), operation.request, null);
                                        return;
                                    }
                                }
                            }
                            if (z) {
                                AdLoader.this.loadEndlessIfNeeded(placement, operation.size, 0L);
                            }
                        }
                        int type = operation.request.getType();
                        if (type == 0 || type == 2) {
                            String eventId = operation.request.getEventId();
                            advertisement = AdLoader.this.repository.findValidAdvertisementForPlacement(placement.getId(), eventId).get();
                            if (placement.isMultipleHBPEnabled() && operation.request.getType() == 0) {
                                if (eventId == null) {
                                    downloadCallbackWrapper.onDownloadFailed(new VungleException(36), operation.request, null);
                                    return;
                                } else if (advertisement == null) {
                                    downloadCallbackWrapper.onDownloadFailed(new VungleException(10), operation.request, null);
                                    return;
                                }
                            }
                            if (advertisement == null || !AdLoader.this.canPlayAd(advertisement)) {
                                if (AdLoader.this.canReDownload(advertisement)) {
                                    Log.d(AdLoader.TAG, "Found valid adv but not ready - downloading content");
                                    VungleSettings vungleSettings = AdLoader.this.runtimeValues.settings.get();
                                    if (vungleSettings != null && AdLoader.this.cacheManager.getBytesAvailable() >= vungleSettings.getMinimumSpaceForAd()) {
                                        AdLoader.this.setLoading(operation.request, true);
                                        if (advertisement.getState() != 0) {
                                            try {
                                                AdLoader.this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 0);
                                            } catch (DatabaseHelper.DBException unused2) {
                                                VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; canReDownload branch", "cannot save/apply NEW state, request = " + operation.request);
                                                downloadCallbackWrapper.onDownloadFailed(new VungleException(26), operation.request, null);
                                                return;
                                            }
                                        }
                                        advertisement.setAdRequestStartTime(currentTimeMillis);
                                        advertisement.setAssetDownloadStartTime(System.currentTimeMillis());
                                        AdLoader.this.tryLoadNextInQueue(operation.request);
                                        AdLoader.this.downloadAdAssets(operation, advertisement, downloadCallbackWrapper);
                                        return;
                                    }
                                    if (advertisement.getState() != 4) {
                                        try {
                                            AdLoader.this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 4);
                                        } catch (DatabaseHelper.DBException unused3) {
                                            VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; canReDownload branch", "cannot save/apply ERROR state, request = " + operation.request);
                                            downloadCallbackWrapper.onDownloadFailed(new VungleException(26), operation.request, null);
                                            return;
                                        }
                                    }
                                    VungleLogger.error(AdLoader.LOAD_AD_EXECUTE_CONTEXT, "failed to download assets, no space; request = " + operation.request);
                                    downloadCallbackWrapper.onDownloadFailed(new VungleException(19), operation.request, null);
                                    return;
                                }
                            } else {
                                AdLoader.this.tryLoadNextInQueue(operation.request);
                                downloadCallbackWrapper.onReady(operation.request, placement, advertisement);
                                return;
                            }
                        } else {
                            if (operation.request.getType() == 1) {
                                AdLoader adLoader = AdLoader.this;
                                if (adLoader.isReadyForHBP(operation, adLoader.repository)) {
                                    AdLoader.this.tryLoadNextInQueue(operation.request);
                                    downloadCallbackWrapper.onReady(operation.request, placement, null);
                                    return;
                                }
                            }
                            advertisement = null;
                        }
                        if (placement.getWakeupTime() > System.currentTimeMillis()) {
                            downloadCallbackWrapper.onDownloadFailed(new VungleException(1), operation.request, null);
                            VungleLogger.warn("AdLoader#loadAd#execute; loadAd sequence; snoozed branch", String.format("Placement with id %s is snoozed ", placement.getId()));
                            Log.w(AdLoader.TAG, "Placement " + placement.getId() + " is  snoozed");
                            Log.d(AdLoader.TAG, "Placement " + placement.getId() + " is sleeping rescheduling it ");
                            AdLoader.this.loadEndlessIfNeeded(placement, operation.size, placement.getWakeupTime() - System.currentTimeMillis());
                            return;
                        }
                        String str = operation.request.getType() == 1 ? "advs" : "adv";
                        Log.i(AdLoader.TAG, "didn't find cached " + str + " for " + operation.request + " downloading");
                        if (advertisement != null) {
                            try {
                                AdLoader.this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 4);
                            } catch (DatabaseHelper.DBException unused4) {
                                VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; last else branch", "cannot save/apply ERROR state, request = " + operation.request);
                                downloadCallbackWrapper.onDownloadFailed(new VungleException(26), operation.request, null);
                                return;
                            }
                        }
                        VungleSettings vungleSettings2 = AdLoader.this.runtimeValues.settings.get();
                        if (vungleSettings2 == null || AdLoader.this.cacheManager.getBytesAvailable() >= vungleSettings2.getMinimumSpaceForAd()) {
                            Log.d(AdLoader.TAG, "No " + str + " for placement " + placement.getId() + " getting new data ");
                            AdLoader.this.setLoading(operation.request, true);
                            AdLoader.this.fetchAdMetadata(operation, placement, downloadCallbackWrapper);
                            return;
                        }
                        VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; last else branch", String.format("no space to load, isAutoCached = %1$s, request = %2$s", Boolean.valueOf(placement.isAutoCached()), operation.request));
                        downloadCallbackWrapper.onDownloadFailed(new VungleException(placement.isAutoCached() ? 18 : 17), operation.request, null);
                        return;
                    } else {
                        downloadCallbackWrapper.onDownloadFailed(new VungleException(5), operation.request, null);
                        return;
                    }
                }
                VungleLogger.error(AdLoader.LOAD_AD_EXECUTE_CONTEXT, "Vungle is not initialized");
                downloadCallbackWrapper.onDownloadFailed(new VungleException(9), operation.request, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReadyForHBP(Operation operation, Repository repository) {
        List<Advertisement> list = repository.findValidAdvertisementsForPlacement(operation.request.getPlacementId(), null).get();
        return list != null && ((long) list.size()) >= operation.request.getAdCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSizeInvalid(Placement placement, AdConfig.AdSize adSize) {
        if (placement.getPlacementAdType() != 1 || AdConfig.AdSize.isNonMrecBannerAdSize(adSize)) {
            return placement.getPlacementAdType() == 0 && !AdConfig.AdSize.isDefaultAdSize(adSize);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchAdMetadata(final Operation operation, Placement placement, final DownloadCallback downloadCallback) {
        final HeaderBiddingCallback headerBiddingCallback = this.runtimeValues.headerBiddingCallback.get();
        final long currentTimeMillis = System.currentTimeMillis();
        VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Start to request ad, request = %1$s, at: %2$d", operation.request, Long.valueOf(currentTimeMillis)));
        this.vungleApiClient.requestAd(operation.request.getPlacementId(), AdConfig.AdSize.isNonMrecBannerAdSize(operation.size) ? operation.size.getName() : "", placement.isHeaderBidding(), this.visionController.isEnabled() ? this.visionController.getPayload() : null).enqueue(new Callback<JsonObject>() { // from class: com.vungle.warren.AdLoader.5
            @Override // com.vungle.warren.network.Callback
            public void onFailure(Call<JsonObject> call, Throwable th) {
                VungleLogger.verbose(true, AdLoader.TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Request ad failed, request = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("failed to request ad, request = %1$s, throwable = %2$s", operation.request, th));
                downloadCallback.onDownloadFailed(AdLoader.this.retrofitToVungleException(th), operation.request, null);
            }

            @Override // com.vungle.warren.network.Callback
            public void onResponse(Call<JsonObject> call, final Response<JsonObject> response) {
                VungleLogger.verbose(true, AdLoader.TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Request ad got response, request = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int state;
                        Placement placement2 = (Placement) AdLoader.this.repository.load(operation.request.getPlacementId(), Placement.class).get();
                        if (placement2 == null) {
                            Log.e(AdLoader.TAG, "Placement metadata not found for requested advertisement.");
                            VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, "Placement metadata not found for requested advertisement. request = " + operation.request);
                            downloadCallback.onDownloadFailed(new VungleException(2), operation.request, null);
                        } else if (!response.isSuccessful()) {
                            long retryAfterHeaderValue = AdLoader.this.vungleApiClient.getRetryAfterHeaderValue(response);
                            if (retryAfterHeaderValue <= 0 || (!placement2.isAutoCached() && !placement2.isMultipleHBPEnabled())) {
                                Log.e(AdLoader.TAG, "Failed to retrieve advertisement information");
                                VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("Response was not successful, not retrying;request = %1$s; responseCode = %2$s", operation.request, Integer.valueOf(response.code())));
                                downloadCallback.onDownloadFailed(AdLoader.this.reposeCodeToVungleException(response.code()), operation.request, null);
                                return;
                            }
                            AdLoader.this.loadEndlessIfNeeded(placement2, operation.size, retryAfterHeaderValue);
                            VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, "Response was not successful, retrying; request = " + operation.request);
                            downloadCallback.onDownloadFailed(new VungleException(14), operation.request, null);
                        } else {
                            JsonObject jsonObject = (JsonObject) response.body();
                            Log.d(AdLoader.TAG, "Ads Response: " + jsonObject);
                            if (jsonObject != null && jsonObject.has("ads") && !jsonObject.get("ads").isJsonNull()) {
                                JsonArray asJsonArray = jsonObject.getAsJsonArray("ads");
                                if (asJsonArray == null || asJsonArray.size() == 0) {
                                    VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, "Response was successful, but no ads; request = " + operation.request);
                                    downloadCallback.onDownloadFailed(new VungleException(1), operation.request, null);
                                    return;
                                }
                                JsonObject asJsonObject = asJsonArray.get(0).getAsJsonObject();
                                try {
                                    Advertisement advertisement = new Advertisement(asJsonObject);
                                    if (AdLoader.this.visionController.isEnabled()) {
                                        JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("ad_markup");
                                        if (JsonUtil.hasNonNull(asJsonObject2, "data_science_cache")) {
                                            AdLoader.this.visionController.setDataScienceCache(asJsonObject2.get("data_science_cache").getAsString());
                                        } else {
                                            AdLoader.this.visionController.setDataScienceCache(null);
                                        }
                                    }
                                    Advertisement advertisement2 = (Advertisement) AdLoader.this.repository.load(advertisement.getId(), Advertisement.class).get();
                                    if (advertisement2 != null && ((state = advertisement2.getState()) == 0 || state == 1 || state == 2)) {
                                        Log.d(AdLoader.TAG, "Operation Cancelled");
                                        downloadCallback.onDownloadFailed(new VungleException(25), operation.request, null);
                                        return;
                                    }
                                    if (placement2.isHeaderBidding() && headerBiddingCallback != null) {
                                        headerBiddingCallback.onBidTokenAvailable(operation.request.getPlacementId(), advertisement.getBidToken());
                                    }
                                    AdLoader.this.repository.deleteAdvertisement(advertisement.getId());
                                    Set<Map.Entry<String, String>> entrySet = advertisement.getDownloadableUrls().entrySet();
                                    File destinationDir = AdLoader.this.getDestinationDir(advertisement);
                                    if (destinationDir != null && destinationDir.isDirectory()) {
                                        for (Map.Entry<String, String> entry : entrySet) {
                                            if (AdLoader.this.isUrlValid(entry.getValue())) {
                                                AdLoader.this.saveAsset(advertisement, destinationDir, entry.getKey(), entry.getValue());
                                            } else {
                                                VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("Response was successful, but one of downloadable urls is neither http nor https : url = %1$s; op.request = %2$s, ad.getId() = %3$s", entry.getValue(), operation.request, advertisement.getId()));
                                                downloadCallback.onDownloadFailed(new VungleException(11), operation.request, advertisement.getId());
                                                return;
                                            }
                                        }
                                        if (placement2.getPlacementAdType() == 1 && (advertisement.getAdType() != 1 || !"banner".equals(advertisement.getTemplateType()))) {
                                            Object[] objArr = new Object[3];
                                            objArr[0] = advertisement.getAdType() != 1 ? "ad type is not MRAID" : "advertisement template type is not banner";
                                            objArr[1] = operation.request;
                                            objArr[2] = advertisement.getId();
                                            VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("Response was successful, but placement is banner while %1$s; op.request = %2$s, ad.getId() = %3$s", objArr));
                                            downloadCallback.onDownloadFailed(new VungleException(1), operation.request, advertisement.getId());
                                            return;
                                        }
                                        advertisement.getAdConfig().setAdSize(operation.size);
                                        advertisement.setAdRequestStartTime(currentTimeMillis);
                                        advertisement.setAssetDownloadStartTime(System.currentTimeMillis());
                                        AdLoader.this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 0);
                                        int type = operation.request.getType();
                                        if (type != 0 && type != 2) {
                                            if (operation.request.getType() == 1) {
                                                if (AdLoader.this.isReadyForHBP(operation, AdLoader.this.repository)) {
                                                    AdLoader.this.tryLoadNextInQueue(operation.request);
                                                    downloadCallback.onReady(operation.request, placement2, null);
                                                    return;
                                                }
                                                AdLoader.this.fetchAdMetadata(operation, placement2, downloadCallback);
                                                return;
                                            }
                                            return;
                                        }
                                        AdLoader.this.tryLoadNextInQueue(operation.request);
                                        AdLoader.this.downloadAdAssets(operation, advertisement, downloadCallback);
                                        return;
                                    }
                                    Object[] objArr2 = new Object[3];
                                    objArr2[0] = destinationDir == null ? "null" : AdLoader.NOT_A_DIR;
                                    objArr2[1] = operation.request;
                                    objArr2[2] = advertisement.getId();
                                    VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("Response was successful, but adv directory is %1$s; op.request = %2$s, ad.getId() = %3$s", objArr2));
                                    downloadCallback.onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                                    return;
                                } catch (DatabaseHelper.DBException e) {
                                    VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("BadAd - DBException; can't proceed; placement = %1$s; op.request = %2$s; exception = %3$s", placement2, operation.request, e));
                                    downloadCallback.onDownloadFailed(new VungleException(26), operation.request, null);
                                    return;
                                } catch (IllegalArgumentException unused) {
                                    JsonObject asJsonObject3 = asJsonObject.getAsJsonObject("ad_markup");
                                    if (asJsonObject3.has("sleep")) {
                                        long asInt = asJsonObject3.get("sleep").getAsInt();
                                        placement2.snooze(asInt);
                                        try {
                                            VungleLogger.warn(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("badAd - snoozed placement %1$s; request = %2$s", placement2, operation.request));
                                            AdLoader.this.repository.save(placement2);
                                            AdLoader.this.loadEndlessIfNeeded(placement2, operation.size, asInt * 1000);
                                        } catch (DatabaseHelper.DBException unused2) {
                                            VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("badAd - can't save snoozed placement %1$s; request = %2$s", placement2, operation.request));
                                            downloadCallback.onDownloadFailed(new VungleException(26), operation.request, null);
                                            return;
                                        }
                                    }
                                    VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("badAd; can't proceed %1$s; request = %2$s", placement2, operation.request));
                                    downloadCallback.onDownloadFailed(new VungleException(1), operation.request, null);
                                    return;
                                }
                            }
                            VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("Response has no ads; placement = %1$s;op.request = %2$s; response = %3$s", placement2, operation.request, jsonObject));
                            downloadCallback.onDownloadFailed(new VungleException(1), operation.request, null);
                        }
                    }
                });
            }
        });
    }

    File getDestinationDir(Advertisement advertisement) {
        return this.repository.getAdvertisementAssetDirectory(advertisement.getId()).get();
    }

    void saveAsset(Advertisement advertisement, File file, String str, String str2) throws DatabaseHelper.DBException {
        String str3 = file.getPath() + File.separator + str;
        int i = (str3.endsWith(Advertisement.KEY_POSTROLL) || str3.endsWith("template")) ? 0 : 2;
        AdAsset adAsset = new AdAsset(advertisement.getId(), str2, str3);
        adAsset.status = 0;
        adAsset.fileType = i;
        try {
            this.repository.save(adAsset);
        } catch (DatabaseHelper.DBException e) {
            VungleLogger.error("AdLoader#saveAsset; loadAd sequence", String.format("Can't save adAsset %1$s; exception = %2$s", adAsset, e));
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void downloadAdAssets(com.vungle.warren.AdLoader.Operation r12, com.vungle.warren.model.Advertisement r13, com.vungle.warren.AdLoader.DownloadCallback r14) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.downloadAdAssets(com.vungle.warren.AdLoader$Operation, com.vungle.warren.model.Advertisement, com.vungle.warren.AdLoader$DownloadCallback):void");
    }

    private DownloadRequest getDownloadRequest(int i, AdAsset adAsset) {
        return new DownloadRequest(3, getAssetPriority(i, adAsset.localPath), adAsset.serverPath, adAsset.localPath, false, adAsset.identifier);
    }

    private AssetPriority getAssetPriority(int i, String str) {
        return new AssetPriority(Math.max(-2147483646, i), getAssetPriority(str, this.adLoadOptimizationEnabled));
    }

    public static int getAssetPriority(String str, boolean z) {
        if (z) {
            return !str.endsWith("template");
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vungle.warren.AdLoader$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements AssetDownloadListener {
        AtomicLong downloadCount;
        List<AssetDownloadListener.DownloadError> errors = Collections.synchronizedList(new ArrayList());
        final /* synthetic */ Advertisement val$advertisement;
        final /* synthetic */ DownloadCallback val$callback;
        final /* synthetic */ Operation val$op;

        @Override // com.vungle.warren.downloader.AssetDownloadListener
        public void onProgress(AssetDownloadListener.Progress progress, DownloadRequest downloadRequest) {
        }

        AnonymousClass6(Operation operation, DownloadCallback downloadCallback, Advertisement advertisement) {
            this.val$op = operation;
            this.val$callback = downloadCallback;
            this.val$advertisement = advertisement;
            this.downloadCount = new AtomicLong(this.val$op.requests.size());
        }

        @Override // com.vungle.warren.downloader.AssetDownloadListener
        public void onError(final AssetDownloadListener.DownloadError downloadError, final DownloadRequest downloadRequest) {
            AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.6.1
                @Override // java.lang.Runnable
                public void run() {
                    Log.e(AdLoader.TAG, "Download Failed");
                    DownloadRequest downloadRequest2 = downloadRequest;
                    if (downloadRequest2 != null) {
                        String str = downloadRequest2.cookieString;
                        AdAsset adAsset = TextUtils.isEmpty(str) ? null : (AdAsset) AdLoader.this.repository.load(str, AdAsset.class).get();
                        if (adAsset != null) {
                            AnonymousClass6.this.errors.add(downloadError);
                            adAsset.status = 2;
                            try {
                                AdLoader.this.repository.save(adAsset);
                            } catch (DatabaseHelper.DBException unused) {
                                AnonymousClass6.this.errors.add(new AssetDownloadListener.DownloadError(-1, new VungleException(26), 4));
                            }
                        } else {
                            AnonymousClass6.this.errors.add(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), 1));
                        }
                    } else {
                        AnonymousClass6.this.errors.add(new AssetDownloadListener.DownloadError(-1, new RuntimeException("error in request"), 4));
                    }
                    if (AnonymousClass6.this.downloadCount.decrementAndGet() <= 0) {
                        AdLoader.this.onAssetDownloadFinished(AnonymousClass6.this.val$op, AnonymousClass6.this.val$callback, AnonymousClass6.this.val$advertisement.getId(), AnonymousClass6.this.errors, true);
                    }
                }
            });
        }

        @Override // com.vungle.warren.downloader.AssetDownloadListener
        public void onSuccess(final File file, final DownloadRequest downloadRequest) {
            AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.6.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!file.exists()) {
                        VungleLogger.error(AdLoader.GET_ASSET_DOWNLOAD_LISTENER_CONTEXT, String.format("Downloaded file %1$s doesn't exist", file.getPath()));
                        AnonymousClass6.this.onError(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), 3), downloadRequest);
                        return;
                    }
                    String str = downloadRequest.cookieString;
                    AdAsset adAsset = str == null ? null : (AdAsset) AdLoader.this.repository.load(str, AdAsset.class).get();
                    if (adAsset != null) {
                        adAsset.fileType = AdLoader.this.isZip(file) ? 0 : 2;
                        adAsset.fileSize = file.length();
                        adAsset.status = 3;
                        try {
                            AdLoader.this.repository.save(adAsset);
                            if (AdLoader.this.isZip(file)) {
                                AdLoader.this.injectOMIfNeeded(AnonymousClass6.this.val$op, AnonymousClass6.this.val$advertisement, AnonymousClass6.this.val$callback);
                                AdLoader.this.processTemplate(AnonymousClass6.this.val$op, AnonymousClass6.this.val$callback, adAsset, AnonymousClass6.this.val$advertisement);
                            }
                            if (AnonymousClass6.this.downloadCount.decrementAndGet() <= 0) {
                                AdLoader.this.onAssetDownloadFinished(AnonymousClass6.this.val$op, AnonymousClass6.this.val$callback, AnonymousClass6.this.val$advertisement.getId(), AnonymousClass6.this.errors, !AdLoader.this.isAdLoadOptimizationEnabled(AnonymousClass6.this.val$advertisement));
                                return;
                            }
                            return;
                        } catch (DatabaseHelper.DBException e) {
                            VungleLogger.error(AdLoader.GET_ASSET_DOWNLOAD_LISTENER_CONTEXT, String.format("Can't save adAsset %1$s; exception = %2$s", adAsset, e));
                            AnonymousClass6.this.onError(new AssetDownloadListener.DownloadError(-1, new VungleException(26), 4), downloadRequest);
                            return;
                        }
                    }
                    Object[] objArr = new Object[2];
                    objArr[0] = str == null ? "id is null" : "repository returned null";
                    objArr[1] = downloadRequest;
                    VungleLogger.error(AdLoader.GET_ASSET_DOWNLOAD_LISTENER_CONTEXT, String.format("adAsset is null because %1$s, downloadRequest = %2$s", objArr));
                    AnonymousClass6.this.onError(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), 1), downloadRequest);
                }
            });
        }
    }

    private AssetDownloadListener getAssetDownloadListener(Advertisement advertisement, Operation operation, DownloadCallback downloadCallback) {
        return new AnonymousClass6(operation, downloadCallback, advertisement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isZip(File file) {
        return file.getName().equals(Advertisement.KEY_POSTROLL) || file.getName().equals("template");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUrlValid(String str) {
        return !TextUtils.isEmpty(str) && (URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTemplate(Operation operation, DownloadCallback downloadCallback, AdAsset adAsset, Advertisement advertisement) {
        if (adAsset.status != 3) {
            downloadCallback.onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
            return;
        }
        File file = new File(adAsset.localPath);
        if (!fileIsValid(file, adAsset)) {
            VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Assets file not valid %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", file.getPath(), adAsset.toString(), operation.request, advertisement));
            downloadCallback.onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
            return;
        }
        if (adAsset.fileType == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Start to unzip assets, request  = %1$s, at: %2$d", operation.request, Long.valueOf(currentTimeMillis)));
            try {
                unzipFile(advertisement, adAsset, file, this.repository.loadAllAdAssets(advertisement.getId()).get());
                VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Unzip assets completed, request  = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            } catch (DatabaseHelper.DBException e) {
                VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Issue(s) with database: exception = %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", e, adAsset.toString(), operation.request, advertisement));
                downloadCallback.onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                return;
            } catch (IOException unused) {
                VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Unzip failed %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", file.getPath(), adAsset.toString(), operation.request, advertisement));
                this.downloader.dropCache(adAsset.serverPath);
                downloadCallback.onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                return;
            }
        }
        if (isAdLoadOptimizationEnabled(advertisement)) {
            VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Ad ready to play, request  = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - advertisement.adRequestStartTime)));
            downloadCallback.onDownloadCompleted(operation.request, advertisement.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean injectOMIfNeeded(Operation operation, Advertisement advertisement, DownloadCallback downloadCallback) {
        if (advertisement.getOmEnabled()) {
            try {
                File destinationDir = getDestinationDir(advertisement);
                if (destinationDir != null && destinationDir.isDirectory()) {
                    for (File file : this.omInjector.injectJsFiles(destinationDir)) {
                        AdAsset adAsset = new AdAsset(advertisement.getId(), null, file.getPath());
                        adAsset.fileSize = file.length();
                        adAsset.fileType = 2;
                        adAsset.status = 3;
                        this.repository.save(adAsset);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[0] = destinationDir == null ? "null" : NOT_A_DIR;
                objArr[1] = operation.request;
                objArr[2] = advertisement;
                VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Mraid ad; bad destinationDir - %1$srequest = %2$s; advertisement = %3$s", objArr));
                downloadCallback.onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                return false;
            } catch (DatabaseHelper.DBException unused) {
                downloadCallback.onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                return false;
            } catch (IOException unused2) {
                downloadCallback.onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAssetDownloadFinished(Operation operation, DownloadCallback downloadCallback, String str, List<AssetDownloadListener.DownloadError> list, boolean z) {
        VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Assets download completed, request  = %1$s, at: %2$d", operation.request, Long.valueOf(System.currentTimeMillis())));
        if (list.isEmpty()) {
            Advertisement advertisement = (Advertisement) this.repository.load(str, Advertisement.class).get();
            if (advertisement == null) {
                VungleLogger.error(DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("advertisement is null: request = %1$s; advertisementId = %2$s", operation.request, str));
                downloadCallback.onDownloadFailed(new VungleException(11), operation.request, str);
                return;
            }
            List<AdAsset> list2 = this.repository.loadAllAdAssets(str).get();
            if (list2 == null || list2.size() == 0) {
                Object[] objArr = new Object[3];
                objArr[0] = list2 != null ? "empty" : "null";
                objArr[1] = operation.request;
                objArr[2] = str;
                VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Assets are %1$s; request = %2$s; advertisement = %3$s", objArr));
                if (z) {
                    downloadCallback.onDownloadFailed(new VungleException(24), operation.request, str);
                    return;
                }
                return;
            }
            for (AdAsset adAsset : list2) {
                if (adAsset.status == 3) {
                    File file = new File(adAsset.localPath);
                    if (!fileIsValid(file, adAsset)) {
                        VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Assets file not valid %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", file.getPath(), adAsset.toString(), operation.request, advertisement));
                        if (z) {
                            downloadCallback.onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                            return;
                        }
                        return;
                    }
                } else if (adAsset.fileType == 0 && adAsset.status != 4) {
                    VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Zip asset left unprocessed asset = %1$s,request = %2$s; advertisement = %3$s", adAsset.toString(), operation.request, advertisement));
                    downloadCallback.onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                    return;
                }
            }
            if (advertisement.getAdType() == 1) {
                File destinationDir = getDestinationDir(advertisement);
                if (destinationDir == null || !destinationDir.isDirectory()) {
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = destinationDir != null ? NOT_A_DIR : "null";
                    objArr2[1] = operation.request;
                    objArr2[2] = advertisement;
                    VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Mraid ad; bad destinationDir - %1$srequest = %2$s; advertisement = %3$s", objArr2));
                    if (z) {
                        downloadCallback.onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                        return;
                    }
                    return;
                }
                String str2 = TAG;
                Log.d(str2, "saving MRAID for " + advertisement.getId());
                advertisement.setMraidAssetDir(destinationDir);
                try {
                    this.repository.save(advertisement);
                } catch (DatabaseHelper.DBException e) {
                    VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Issue(s) with database: can't save advertisement;exception = %1$s; request = %2$s; advertisement = %3$s", e, operation.request, advertisement));
                    if (z) {
                        downloadCallback.onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                        return;
                    }
                    return;
                }
            }
            if (z) {
                downloadCallback.onDownloadCompleted(operation.request, advertisement.getId());
                return;
            }
            return;
        }
        VungleException vungleException = null;
        Iterator<AssetDownloadListener.DownloadError> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AssetDownloadListener.DownloadError next = it.next();
            if (VungleException.getExceptionCode(next.cause) == 26) {
                vungleException = new VungleException(26);
                break;
            }
            if (recoverableServerCode(next.serverCode) && next.reason == 1) {
                vungleException = new VungleException(23);
            } else if (next.reason == 0) {
                vungleException = new VungleException(23);
            } else {
                vungleException = new VungleException(24);
            }
            if (vungleException.getExceptionCode() == 24) {
                break;
            }
        }
        if (z) {
            downloadCallback.onDownloadFailed(vungleException, operation.request, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class DownloadAdCallback implements DownloadCallback {
        private DownloadAdCallback() {
        }

        @Override // com.vungle.warren.AdLoader.DownloadCallback
        public void onDownloadCompleted(AdRequest adRequest, String str) {
            String str2 = AdLoader.TAG;
            Log.d(str2, "download completed " + adRequest);
            Placement placement = (Placement) AdLoader.this.repository.load(adRequest.getPlacementId(), Placement.class).get();
            if (placement == null) {
                VungleLogger.error(AdLoader.DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("loaded placement is null: request = %1$s; advertisementId = %2$s", adRequest, str));
                onDownloadFailed(new VungleException(13), adRequest, str);
                return;
            }
            Advertisement advertisement = TextUtils.isEmpty(str) ? null : (Advertisement) AdLoader.this.repository.load(str, Advertisement.class).get();
            if (advertisement == null) {
                VungleLogger.error(AdLoader.DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("advertisement is null: request = %1$s; advertisementId = %2$s", adRequest, str));
                onDownloadFailed(new VungleException(11), adRequest, str);
                return;
            }
            advertisement.setFinishedDownloadingTime(System.currentTimeMillis());
            try {
                AdLoader.this.repository.saveAndApplyState(advertisement, adRequest.getPlacementId(), 1);
                onReady(adRequest, placement, advertisement);
            } catch (DatabaseHelper.DBException e) {
                VungleLogger.error(AdLoader.DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("Can't save/apply state READY: exception = %1$s;request = %2$s; advertisement = %3$s", e, adRequest, advertisement));
                onDownloadFailed(new VungleException(26), adRequest, str);
            }
        }

        @Override // com.vungle.warren.AdLoader.DownloadCallback
        public void onReady(AdRequest adRequest, Placement placement, Advertisement advertisement) {
            AdLoader.this.setLoading(adRequest, false);
            HeaderBiddingCallback headerBiddingCallback = AdLoader.this.runtimeValues.headerBiddingCallback.get();
            if (advertisement != null && placement.isHeaderBidding() && headerBiddingCallback != null) {
                headerBiddingCallback.adAvailableForBidToken(adRequest.getPlacementId(), advertisement.getBidToken());
            }
            String str = AdLoader.TAG;
            Log.i(str, "found already cached valid adv, calling onAdLoad callback for request " + adRequest);
            InitCallback initCallback = AdLoader.this.runtimeValues.initCallback.get();
            int type = adRequest.getType();
            if (placement.isAutoCached() && initCallback != null && (type == 2 || type == 0)) {
                initCallback.onAutoCacheAdAvailable(adRequest.getPlacementId());
            }
            Operation operation = (Operation) AdLoader.this.loadOperations.remove(adRequest);
            String id = advertisement != null ? advertisement.getId() : null;
            if (operation != null) {
                placement.setAdSize(operation.size);
                try {
                    AdLoader.this.repository.save(placement);
                    String str2 = AdLoader.TAG;
                    Log.i(str2, "loading took " + (System.currentTimeMillis() - adRequest.timeStamp.get()) + "ms for:" + adRequest);
                    for (LoadAdCallback loadAdCallback : operation.loadAdCallbacks) {
                        loadAdCallback.onAdLoad(adRequest.getPlacementId());
                    }
                } catch (DatabaseHelper.DBException e) {
                    VungleLogger.error("AdLoader#DownloadAdCallback#onReady; loadAd sequence", String.format("Can't save placement: exception = %1$s;placement = %2$s; advertisement = %3$s", e, placement, advertisement));
                    onDownloadFailed(new VungleException(26), adRequest, id);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0171 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.vungle.warren.AdLoader.DownloadCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onDownloadFailed(com.vungle.warren.error.VungleException r12, com.vungle.warren.AdRequest r13, java.lang.String r14) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.DownloadAdCallback.onDownloadFailed(com.vungle.warren.error.VungleException, com.vungle.warren.AdRequest, java.lang.String):void");
        }
    }

    public void load(AdRequest adRequest, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        load(new Operation(adRequest, adConfig.getAdSize(), 0L, RETRY_DELAY, 5, 0, 0, true, 0, loadAdCallback));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadEndlessIfNeeded(com.vungle.warren.model.Placement r17, com.vungle.warren.AdConfig.AdSize r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            boolean r1 = r17.isMultipleHBPEnabled()
            r2 = 1
            if (r1 == 0) goto L1d
            int r1 = r17.getPlacementAdType()
            if (r1 != r2) goto L1d
            boolean r1 = com.vungle.warren.AdConfig.AdSize.isBannerAdSize(r18)
            if (r1 != 0) goto L1d
            com.vungle.warren.AdConfig$AdSize r1 = r17.getRecommendedAdSize()
            r5 = r1
            r1 = r17
            goto L21
        L1d:
            r1 = r17
            r5 = r18
        L21:
            boolean r3 = r0.isSizeInvalid(r1, r5)
            if (r3 == 0) goto L28
            return
        L28:
            r3 = 0
            boolean r4 = r17.isMultipleHBPEnabled()
            r6 = 0
            if (r4 == 0) goto L45
            boolean r4 = r17.isSingleHBPEnabled()
            if (r4 != 0) goto L45
            com.vungle.warren.AdRequest r3 = new com.vungle.warren.AdRequest
            java.lang.String r4 = r17.getId()
            int r7 = r17.getMaxHbCache()
            long r7 = (long) r7
            r3.<init>(r4, r2, r7)
            goto L69
        L45:
            boolean r2 = r17.isSingleHBPEnabled()
            r7 = 1
            if (r2 == 0) goto L59
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r3 = r17.getId()
            r4 = 2
            r2.<init>(r3, r4, r7)
        L57:
            r4 = r2
            goto L6a
        L59:
            boolean r2 = r17.isAutoCached()
            if (r2 == 0) goto L69
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r3 = r17.getId()
            r2.<init>(r3, r6, r7)
            goto L57
        L69:
            r4 = r3
        L6a:
            if (r4 == 0) goto L83
            com.vungle.warren.AdLoader$Operation r2 = new com.vungle.warren.AdLoader$Operation
            r8 = 2000(0x7d0, double:9.88E-321)
            r10 = 5
            r11 = 1
            r12 = 0
            r13 = 0
            int r14 = r17.getAutoCachePriority()
            com.vungle.warren.LoadAdCallback[] r15 = new com.vungle.warren.LoadAdCallback[r6]
            r3 = r2
            r6 = r19
            r3.<init>(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            r0.load(r2)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.loadEndlessIfNeeded(com.vungle.warren.model.Placement, com.vungle.warren.AdConfig$AdSize, long):void");
    }

    private void unzipFile(Advertisement advertisement, AdAsset adAsset, final File file, List<AdAsset> list) throws IOException, DatabaseHelper.DBException {
        final ArrayList arrayList = new ArrayList();
        for (AdAsset adAsset2 : list) {
            if (adAsset2.fileType == 2) {
                arrayList.add(adAsset2.localPath);
            }
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            Object[] objArr = new Object[2];
            objArr[0] = destinationDir == null ? "null" : NOT_A_DIR;
            objArr[1] = advertisement;
            VungleLogger.error("AdLoader#unzipFile; loadAd sequence", String.format("Can't unzip file: destination dir is %1$s; advertisement = %2$s", objArr));
            throw new IOException("Unable to access Destination Directory");
        }
        List<File> unzip = UnzipUtility.unzip(file.getPath(), destinationDir.getPath(), new UnzipUtility.Filter() { // from class: com.vungle.warren.AdLoader.7
            @Override // com.vungle.warren.utility.UnzipUtility.Filter
            public boolean matches(String str) {
                File file2 = new File(str);
                for (String str2 : arrayList) {
                    File file3 = new File(str2);
                    if (file3.equals(file2)) {
                        return false;
                    }
                    String path = file2.getPath();
                    if (path.startsWith(file3.getPath() + File.separator)) {
                        return false;
                    }
                }
                return true;
            }
        });
        if (file.getName().equals("template")) {
            File file2 = new File(destinationDir.getPath() + File.separator + "mraid.js");
            if (file2.exists()) {
                PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2, true)));
                HackMraid.apply(printWriter);
                printWriter.close();
            }
        }
        for (File file3 : unzip) {
            AdAsset adAsset3 = new AdAsset(advertisement.getId(), null, file3.getPath());
            adAsset3.fileSize = file3.length();
            adAsset3.fileType = 1;
            adAsset3.parentId = adAsset.identifier;
            adAsset3.status = 3;
            this.repository.save(adAsset3);
        }
        String str = TAG;
        Log.d(str, "Uzipped " + destinationDir);
        FileUtility.printDirectoryTree(destinationDir);
        adAsset.status = 4;
        this.repository.save(adAsset, new Repository.SaveCallback() { // from class: com.vungle.warren.AdLoader.8
            @Override // com.vungle.warren.persistence.Repository.SaveCallback
            public void onError(Exception exc) {
            }

            @Override // com.vungle.warren.persistence.Repository.SaveCallback
            public void onSaved() {
                AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            FileUtility.delete(file);
                        } catch (IOException e) {
                            Log.e(AdLoader.TAG, "Error on deleting zip assets archive", e);
                        }
                    }
                });
            }
        });
    }

    boolean hasAssetsFor(Advertisement advertisement) throws IllegalStateException {
        List<AdAsset> list;
        if (advertisement == null || (list = this.repository.loadAllAdAssets(advertisement.getId()).get()) == null || list.size() == 0) {
            return false;
        }
        for (AdAsset adAsset : list) {
            if (adAsset.fileType == 0) {
                if (adAsset.status != 4) {
                    return false;
                }
            } else if (!isUrlValid(adAsset.serverPath) || !isAdLoadOptimizationEnabled(advertisement)) {
                if (adAsset.status != 3 || !fileIsValid(new File(adAsset.localPath), adAsset)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAdLoadOptimizationEnabled(Advertisement advertisement) {
        return this.adLoadOptimizationEnabled && advertisement != null && advertisement.getAdType() == 1;
    }

    private boolean fileIsValid(File file, AdAsset adAsset) {
        return file.exists() && file.length() == adAsset.fileSize;
    }

    Collection<Operation> getPendingOperations() {
        return this.pendingOperations.values();
    }

    Collection<Operation> getRunningOperations() {
        return this.loadOperations.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAdLoadOptimizationEnabled(boolean z) {
        this.adLoadOptimizationEnabled = z;
    }

    public void dropCache(String str) {
        List<AdAsset> list = this.repository.loadAllAdAssets(str).get();
        if (list == null) {
            Log.w(TAG, "No assets found in ad cache to cleanup");
            return;
        }
        HashSet hashSet = new HashSet();
        for (AdAsset adAsset : list) {
            hashSet.add(adAsset.serverPath);
        }
        Advertisement advertisement = (Advertisement) this.repository.load(str, Advertisement.class).get();
        if (advertisement != null) {
            hashSet.addAll(advertisement.getDownloadableUrls().values());
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.downloader.dropCache((String) it.next());
        }
    }
}
