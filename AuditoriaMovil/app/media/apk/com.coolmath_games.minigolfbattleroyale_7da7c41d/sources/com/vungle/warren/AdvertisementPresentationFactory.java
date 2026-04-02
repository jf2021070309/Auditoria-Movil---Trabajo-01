package com.vungle.warren;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.vungle.warren.AdConfig;
import com.vungle.warren.PresentationFactory;
import com.vungle.warren.analytics.JobDelegateAnalytics;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.Placement;
import com.vungle.warren.omsdk.OMTracker;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.JavascriptBridge;
import com.vungle.warren.ui.OrientationDelegate;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.presenter.MRAIDAdPresenter;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.ui.view.FullAdWidget;
import com.vungle.warren.ui.view.LocalAdView;
import com.vungle.warren.ui.view.MRAIDAdView;
import com.vungle.warren.ui.view.VungleWebClient;
import com.vungle.warren.utility.HandlerScheduler;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public class AdvertisementPresentationFactory implements PresentationFactory {
    private static final String EXTRA_ADVERTISEMENT = "ADV_FACTORY_ADVERTISEMENT";
    private static final String TAG = AdvertisementPresentationFactory.class.getSimpleName();
    private final AdLoader adLoader;
    private VungleApiClient apiClient;
    private Advertisement currentAdvertisement;
    private final JobRunner jobRunner;
    private final OMTracker.Factory omTrackerFactory;
    private BaseTask.OnModelLoadListener onModelLoadListener = new BaseTask.OnModelLoadListener() { // from class: com.vungle.warren.AdvertisementPresentationFactory.1
        @Override // com.vungle.warren.AdvertisementPresentationFactory.BaseTask.OnModelLoadListener
        public void onLoad(Advertisement advertisement, Placement placement) {
            AdvertisementPresentationFactory.this.currentAdvertisement = advertisement;
        }
    };
    private Repository repository;
    private final SessionData sessionData;
    private BaseTask task;
    private final ExecutorService taskExecutor;
    private VungleStaticApi vungleStaticApi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdvertisementPresentationFactory(AdLoader adLoader, VungleStaticApi vungleStaticApi, Repository repository, VungleApiClient vungleApiClient, JobRunner jobRunner, RuntimeValues runtimeValues, OMTracker.Factory factory, ExecutorService executorService) {
        this.vungleStaticApi = vungleStaticApi;
        this.repository = repository;
        this.apiClient = vungleApiClient;
        this.jobRunner = jobRunner;
        this.adLoader = adLoader;
        this.sessionData = runtimeValues.sessionData.get();
        this.omTrackerFactory = factory;
        this.taskExecutor = executorService;
    }

    @Override // com.vungle.warren.PresentationFactory
    public void getFullScreenPresentation(Context context, AdRequest adRequest, FullAdWidget fullAdWidget, OptionsState optionsState, CloseDelegate closeDelegate, OrientationDelegate orientationDelegate, Bundle bundle, PresentationFactory.FullScreenCallback fullScreenCallback) {
        cancelTask();
        FullScreenPresentationTask fullScreenPresentationTask = new FullScreenPresentationTask(context, this.adLoader, adRequest, this.repository, this.vungleStaticApi, this.jobRunner, this.apiClient, this.sessionData, fullAdWidget, optionsState, orientationDelegate, closeDelegate, fullScreenCallback, this.onModelLoadListener, bundle, this.omTrackerFactory);
        this.task = fullScreenPresentationTask;
        fullScreenPresentationTask.executeOnExecutor(this.taskExecutor, new Void[0]);
    }

    private void cancelTask() {
        BaseTask baseTask = this.task;
        if (baseTask != null) {
            baseTask.cancel(true);
            this.task.clear();
        }
    }

    @Override // com.vungle.warren.PresentationFactory
    public void getNativeViewPresentation(AdRequest adRequest, AdConfig adConfig, CloseDelegate closeDelegate, PresentationFactory.ViewCallback viewCallback) {
        cancelTask();
        NativeViewPresentationTask nativeViewPresentationTask = new NativeViewPresentationTask(adRequest, adConfig, this.adLoader, this.repository, this.vungleStaticApi, this.jobRunner, viewCallback, null, this.sessionData, this.onModelLoadListener, this.apiClient, this.omTrackerFactory);
        this.task = nativeViewPresentationTask;
        nativeViewPresentationTask.executeOnExecutor(this.taskExecutor, new Void[0]);
    }

    @Override // com.vungle.warren.PresentationFactory
    public void saveState(Bundle bundle) {
        Advertisement advertisement = this.currentAdvertisement;
        bundle.putString(EXTRA_ADVERTISEMENT, advertisement == null ? null : advertisement.getId());
    }

    @Override // com.vungle.warren.PresentationFactory
    public void destroy() {
        cancelTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class PresentationResultHolder {
        private AdContract.AdView adView;
        private AdContract.AdvertisementPresenter advertisementPresenter;
        private VungleException exception;
        private VungleWebClient webClient;

        PresentationResultHolder(VungleException vungleException) {
            this.exception = vungleException;
        }

        PresentationResultHolder(AdContract.AdView adView, AdContract.AdvertisementPresenter advertisementPresenter, VungleWebClient vungleWebClient) {
            this.adView = adView;
            this.advertisementPresenter = advertisementPresenter;
            this.webClient = vungleWebClient;
        }
    }

    /* loaded from: classes2.dex */
    private static class FullScreenPresentationTask extends BaseTask {
        private final AdLoader adLoader;
        private Advertisement advertisement;
        private final VungleApiClient apiClient;
        private final CloseDelegate closeDelegate;
        private Context context;
        private FullAdWidget fullAdWidget;
        private final PresentationFactory.FullScreenCallback fullscreenCallback;
        private final JobRunner jobRunner;
        private final OMTracker.Factory omTrackerFactory;
        private final OptionsState optionsState;
        private final OrientationDelegate orientationDelegate;
        private final AdRequest request;
        private final Bundle savedState;
        private final SessionData sessionData;

        FullScreenPresentationTask(Context context, AdLoader adLoader, AdRequest adRequest, Repository repository, VungleStaticApi vungleStaticApi, JobRunner jobRunner, VungleApiClient vungleApiClient, SessionData sessionData, FullAdWidget fullAdWidget, OptionsState optionsState, OrientationDelegate orientationDelegate, CloseDelegate closeDelegate, PresentationFactory.FullScreenCallback fullScreenCallback, BaseTask.OnModelLoadListener onModelLoadListener, Bundle bundle, OMTracker.Factory factory) {
            super(repository, vungleStaticApi, onModelLoadListener);
            this.request = adRequest;
            this.fullAdWidget = fullAdWidget;
            this.optionsState = optionsState;
            this.context = context;
            this.fullscreenCallback = fullScreenCallback;
            this.savedState = bundle;
            this.jobRunner = jobRunner;
            this.apiClient = vungleApiClient;
            this.orientationDelegate = orientationDelegate;
            this.closeDelegate = closeDelegate;
            this.adLoader = adLoader;
            this.sessionData = sessionData;
            this.omTrackerFactory = factory;
        }

        @Override // com.vungle.warren.AdvertisementPresentationFactory.BaseTask
        void clear() {
            super.clear();
            this.context = null;
            this.fullAdWidget = null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public PresentationResultHolder doInBackground(Void... voidArr) {
            try {
                Pair<Advertisement, Placement> loadPresentationData = loadPresentationData(this.request, this.savedState);
                this.advertisement = (Advertisement) loadPresentationData.first;
                Placement placement = (Placement) loadPresentationData.second;
                if (!this.adLoader.canRenderAd(this.advertisement)) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Advertisement is null or assets are missing");
                    return new PresentationResultHolder(new VungleException(10));
                } else if (placement.getPlacementAdType() != 0) {
                    return new PresentationResultHolder(new VungleException(29));
                } else {
                    JobDelegateAnalytics jobDelegateAnalytics = new JobDelegateAnalytics(this.jobRunner);
                    Cookie cookie = (Cookie) this.repository.load("appId", Cookie.class).get();
                    if (cookie != null && !TextUtils.isEmpty(cookie.getString("appId"))) {
                        cookie.getString("appId");
                    }
                    VungleWebClient vungleWebClient = new VungleWebClient(this.advertisement, placement);
                    File file = this.repository.getAdvertisementAssetDirectory(this.advertisement.getId()).get();
                    if (file == null || !file.isDirectory()) {
                        Log.e(AdvertisementPresentationFactory.TAG, "Advertisement assets dir is missing");
                        return new PresentationResultHolder(new VungleException(26));
                    }
                    int adType = this.advertisement.getAdType();
                    if (adType == 0) {
                        return new PresentationResultHolder(new LocalAdView(this.context, this.fullAdWidget, this.orientationDelegate, this.closeDelegate), new LocalAdPresenter(this.advertisement, placement, this.repository, new HandlerScheduler(), jobDelegateAnalytics, vungleWebClient, this.optionsState, file, this.sessionData, this.request.getImpression()), vungleWebClient);
                    }
                    boolean z = true;
                    if (adType == 1) {
                        OMTracker make = this.omTrackerFactory.make((this.apiClient.getOmEnabled() && this.advertisement.getOmEnabled()) ? false : false);
                        vungleWebClient.setWebViewObserver(make);
                        return new PresentationResultHolder(new MRAIDAdView(this.context, this.fullAdWidget, this.orientationDelegate, this.closeDelegate), new MRAIDAdPresenter(this.advertisement, placement, this.repository, new HandlerScheduler(), jobDelegateAnalytics, vungleWebClient, this.optionsState, file, this.sessionData, make, this.request.getImpression()), vungleWebClient);
                    }
                    return new PresentationResultHolder(new VungleException(10));
                }
            } catch (VungleException e) {
                return new PresentationResultHolder(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.warren.AdvertisementPresentationFactory.BaseTask, android.os.AsyncTask
        public void onPostExecute(PresentationResultHolder presentationResultHolder) {
            super.onPostExecute(presentationResultHolder);
            if (isCancelled() || this.fullscreenCallback == null) {
                return;
            }
            if (presentationResultHolder.exception != null) {
                Log.e(AdvertisementPresentationFactory.TAG, "Exception on creating presenter", presentationResultHolder.exception);
                this.fullscreenCallback.onResult(new Pair<>(null, null), presentationResultHolder.exception);
                return;
            }
            this.fullAdWidget.linkWebView(presentationResultHolder.webClient, new JavascriptBridge(presentationResultHolder.advertisementPresenter));
            this.fullscreenCallback.onResult(new Pair<>(presentationResultHolder.adView, presentationResultHolder.advertisementPresenter), presentationResultHolder.exception);
        }
    }

    /* loaded from: classes2.dex */
    private static class NativeViewPresentationTask extends BaseTask {
        private final AdConfig adConfig;
        private final AdLoader adLoader;
        private final VungleApiClient apiClient;
        private final JobRunner jobRunner;
        private final OMTracker.Factory omTrackerFactory;
        private final AdRequest request;
        private final Bundle savedState;
        private final SessionData sessionData;
        private final PresentationFactory.ViewCallback viewCallback;

        NativeViewPresentationTask(AdRequest adRequest, AdConfig adConfig, AdLoader adLoader, Repository repository, VungleStaticApi vungleStaticApi, JobRunner jobRunner, PresentationFactory.ViewCallback viewCallback, Bundle bundle, SessionData sessionData, BaseTask.OnModelLoadListener onModelLoadListener, VungleApiClient vungleApiClient, OMTracker.Factory factory) {
            super(repository, vungleStaticApi, onModelLoadListener);
            this.request = adRequest;
            this.adConfig = adConfig;
            this.viewCallback = viewCallback;
            this.savedState = bundle;
            this.jobRunner = jobRunner;
            this.adLoader = adLoader;
            this.sessionData = sessionData;
            this.apiClient = vungleApiClient;
            this.omTrackerFactory = factory;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public PresentationResultHolder doInBackground(Void... voidArr) {
            try {
                Pair<Advertisement, Placement> loadPresentationData = loadPresentationData(this.request, this.savedState);
                Advertisement advertisement = (Advertisement) loadPresentationData.first;
                boolean z = true;
                if (advertisement.getAdType() != 1) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Invalid Ad Type for Native Ad.");
                    return new PresentationResultHolder(new VungleException(10));
                }
                Placement placement = (Placement) loadPresentationData.second;
                if (!this.adLoader.canPlayAd(advertisement)) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Advertisement is null or assets are missing");
                    return new PresentationResultHolder(new VungleException(10));
                }
                JobDelegateAnalytics jobDelegateAnalytics = new JobDelegateAnalytics(this.jobRunner);
                VungleWebClient vungleWebClient = new VungleWebClient(advertisement, placement);
                File file = this.repository.getAdvertisementAssetDirectory(advertisement.getId()).get();
                if (file == null || !file.isDirectory()) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Advertisement assets dir is missing");
                    return new PresentationResultHolder(new VungleException(26));
                } else if ("mrec".equals(advertisement.getTemplateType()) && this.adConfig.getAdSize() != AdConfig.AdSize.VUNGLE_MREC) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Corresponding AdConfig#setAdSize must be passed for the type/size of native ad");
                    return new PresentationResultHolder(new VungleException(28));
                } else if (placement.getPlacementAdType() == 0) {
                    return new PresentationResultHolder(new VungleException(10));
                } else {
                    advertisement.configure(this.adConfig);
                    try {
                        this.repository.save(advertisement);
                        OMTracker make = this.omTrackerFactory.make((this.apiClient.getOmEnabled() && advertisement.getOmEnabled()) ? false : false);
                        vungleWebClient.setWebViewObserver(make);
                        return new PresentationResultHolder(null, new MRAIDAdPresenter(advertisement, placement, this.repository, new HandlerScheduler(), jobDelegateAnalytics, vungleWebClient, null, file, this.sessionData, make, this.request.getImpression()), vungleWebClient);
                    } catch (DatabaseHelper.DBException unused) {
                        return new PresentationResultHolder(new VungleException(26));
                    }
                }
            } catch (VungleException e) {
                return new PresentationResultHolder(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.warren.AdvertisementPresentationFactory.BaseTask, android.os.AsyncTask
        public void onPostExecute(PresentationResultHolder presentationResultHolder) {
            PresentationFactory.ViewCallback viewCallback;
            super.onPostExecute(presentationResultHolder);
            if (isCancelled() || (viewCallback = this.viewCallback) == null) {
                return;
            }
            viewCallback.onResult(new Pair<>((WebAdContract.WebAdPresenter) presentationResultHolder.advertisementPresenter, presentationResultHolder.webClient), presentationResultHolder.exception);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static abstract class BaseTask extends AsyncTask<Void, Void, PresentationResultHolder> {
        private OnModelLoadListener onDataLoadedListener;
        protected final Repository repository;
        protected final VungleStaticApi vungleStaticApi;
        private AtomicReference<Advertisement> adRef = new AtomicReference<>();
        private AtomicReference<Placement> plRef = new AtomicReference<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public interface OnModelLoadListener {
            void onLoad(Advertisement advertisement, Placement placement);
        }

        BaseTask(Repository repository, VungleStaticApi vungleStaticApi, OnModelLoadListener onModelLoadListener) {
            this.repository = repository;
            this.vungleStaticApi = vungleStaticApi;
            this.onDataLoadedListener = onModelLoadListener;
        }

        Pair<Advertisement, Placement> loadPresentationData(AdRequest adRequest, Bundle bundle) throws VungleException {
            if (!this.vungleStaticApi.isInitialized()) {
                throw new VungleException(9);
            }
            if (adRequest == null || TextUtils.isEmpty(adRequest.getPlacementId())) {
                throw new VungleException(10);
            }
            Placement placement = (Placement) this.repository.load(adRequest.getPlacementId(), Placement.class).get();
            if (placement == null) {
                Log.e(AdvertisementPresentationFactory.TAG, "No Placement for ID");
                throw new VungleException(13);
            } else if (placement.isMultipleHBPEnabled() && adRequest.getEventId() == null) {
                throw new VungleException(36);
            } else {
                this.plRef.set(placement);
                Advertisement advertisement = null;
                if (bundle == null) {
                    advertisement = this.repository.findValidAdvertisementForPlacement(adRequest.getPlacementId(), adRequest.getEventId()).get();
                } else {
                    String string = bundle.getString(AdvertisementPresentationFactory.EXTRA_ADVERTISEMENT);
                    if (!TextUtils.isEmpty(string)) {
                        advertisement = (Advertisement) this.repository.load(string, Advertisement.class).get();
                    }
                }
                if (advertisement == null) {
                    throw new VungleException(10);
                }
                this.adRef.set(advertisement);
                File file = this.repository.getAdvertisementAssetDirectory(advertisement.getId()).get();
                if (file == null || !file.isDirectory()) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Advertisement assets dir is missing");
                    throw new VungleException(26);
                }
                return new Pair<>(advertisement, placement);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(PresentationResultHolder presentationResultHolder) {
            super.onPostExecute((BaseTask) presentationResultHolder);
            OnModelLoadListener onModelLoadListener = this.onDataLoadedListener;
            if (onModelLoadListener != null) {
                onModelLoadListener.onLoad(this.adRef.get(), this.plRef.get());
            }
        }

        void clear() {
            this.onDataLoadedListener = null;
        }
    }
}
