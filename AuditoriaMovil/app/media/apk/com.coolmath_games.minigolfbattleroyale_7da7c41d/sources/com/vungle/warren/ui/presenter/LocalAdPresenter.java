package com.vungle.warren.ui.presenter;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.vungle.warren.SessionData;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.analytics.AdAnalytics;
import com.vungle.warren.analytics.AnalyticsEvent;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.DurationRecorder;
import com.vungle.warren.ui.JavascriptBridge;
import com.vungle.warren.ui.PresenterAppLeftCallback;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.ui.view.WebViewAPI;
import com.vungle.warren.utility.AsyncFileUtils;
import com.vungle.warren.utility.Constants;
import com.vungle.warren.utility.Scheduler;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class LocalAdPresenter implements LocalAdContract.LocalPresenter, WebViewAPI.WebClientErrorHandler {
    static final String EXTRA_INCENTIVIZED_SENT = "incentivized_sent";
    static final String EXTRA_IN_POST = "in_post_roll";
    static final String EXTRA_IS_MUTED = "is_muted_mode";
    static final String EXTRA_REPORT = "saved_report";
    static final String EXTRA_VIDEO_POSITION = "videoPosition";
    static final String HTTPS_VUNGLE_COM_PRIVACY = "https://vungle.com/privacy/";
    public static final int INCENTIVIZED_TRESHOLD = 75;
    static final String TAG = "LocalAdPresenter";
    private LocalAdContract.LocalView adView;
    private boolean adViewed;
    private Advertisement advertisement;
    private final AdAnalytics analytics;
    private File assetDir;
    private AdContract.AdvertisementPresenter.EventListener bus;
    private int duration;
    private DurationRecorder durationRecorder;
    private AsyncFileUtils.ExistenceOperation fileExistenceOperation;
    private final String[] impressionUrls;
    private boolean inPost;
    private boolean muted;
    private Placement placement;
    private int progress;
    private Report report;
    private Repository repository;
    private final Scheduler scheduler;
    private SessionData sessionData;
    private boolean userExitEnabled;
    private int videoPosition;
    private final WebViewAPI webViewAPI;
    private final Map<String, Cookie> cookies = new HashMap();
    private String dialogTitle = "Are you sure?";
    private String dialogBody = "If you exit now, you will not get your reward";
    private String dialogContinue = "Continue";
    private String dialogClose = "Close";
    private AtomicBoolean sendReportIncentivized = new AtomicBoolean(false);
    private AtomicBoolean isDestroying = new AtomicBoolean(false);
    private LinkedList<Advertisement.Checkpoint> checkpointList = new LinkedList<>();
    private Repository.SaveCallback repoCallback = new Repository.SaveCallback() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.1
        boolean errorHappened = false;

        @Override // com.vungle.warren.persistence.Repository.SaveCallback
        public void onSaved() {
        }

        @Override // com.vungle.warren.persistence.Repository.SaveCallback
        public void onError(Exception exc) {
            if (this.errorHappened) {
                return;
            }
            this.errorHappened = true;
            LocalAdPresenter.this.makeBusError(26);
            VungleLogger.error(LocalAdPresenter.class.getSimpleName() + "#onError", new VungleException(26).getLocalizedMessage());
            LocalAdPresenter.this.closeAndReport();
        }
    };
    private AtomicBoolean busy = new AtomicBoolean(false);

    public LocalAdPresenter(Advertisement advertisement, Placement placement, Repository repository, Scheduler scheduler, AdAnalytics adAnalytics, WebViewAPI webViewAPI, OptionsState optionsState, File file, SessionData sessionData, String[] strArr) {
        this.advertisement = advertisement;
        this.placement = placement;
        this.scheduler = scheduler;
        this.analytics = adAnalytics;
        this.webViewAPI = webViewAPI;
        this.repository = repository;
        this.assetDir = file;
        this.sessionData = sessionData;
        this.impressionUrls = strArr;
        if (advertisement.getCheckpoints() != null) {
            this.checkpointList.addAll(advertisement.getCheckpoints());
            Collections.sort(this.checkpointList);
        }
        loadData(optionsState);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void setEventListener(AdContract.AdvertisementPresenter.EventListener eventListener) {
        this.bus = eventListener;
    }

    private void reportError(String str) {
        this.report.recordError(str);
        this.repository.save(this.report, this.repoCallback);
        makeBusError(27);
        if (!this.inPost && this.advertisement.hasPostroll()) {
            playPost();
            return;
        }
        makeBusError(10);
        this.adView.close();
    }

    public void reportAction(String str, String str2) {
        if (str.equals("videoLength")) {
            int parseInt = Integer.parseInt(str2);
            this.duration = parseInt;
            this.report.setVideoLength(parseInt);
            this.repository.save(this.report, this.repoCallback);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -840405966) {
            if (hashCode != 3363353) {
                if (hashCode == 1370606900 && str.equals(AnalyticsEvent.Ad.videoClose)) {
                    c = 2;
                }
            } else if (str.equals(AnalyticsEvent.Ad.mute)) {
                c = 0;
            }
        } else if (str.equals(AnalyticsEvent.Ad.unmute)) {
            c = 1;
        }
        if (c == 0 || c == 1 || c == 2) {
            this.analytics.ping(this.advertisement.getTpatUrls(str));
        }
        this.report.recordAction(str, str2, System.currentTimeMillis());
        this.repository.save(this.report, this.repoCallback);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void onViewConfigurationChanged() {
        this.webViewAPI.notifyPropertiesChange(true);
        this.adView.refreshDialogIfVisible();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void attach(LocalAdContract.LocalView localView, OptionsState optionsState) {
        this.isDestroying.set(false);
        this.adView = localView;
        localView.setPresenter(this);
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext(Constants.ATTACH, this.advertisement.getCreativeId(), this.placement.getId());
        }
        int settings = this.advertisement.getAdConfig().getSettings();
        if (settings > 0) {
            this.muted = (settings & 1) == 1;
            this.userExitEnabled = (settings & 2) == 2;
        }
        int i = -1;
        int adOrientation = this.advertisement.getAdConfig().getAdOrientation();
        int i2 = 6;
        if (adOrientation == 3) {
            int orientation = this.advertisement.getOrientation();
            if (orientation == 0) {
                i = 7;
            } else if (orientation == 1) {
                i = 6;
            }
            i2 = i;
        } else if (adOrientation == 0) {
            i2 = 7;
        } else if (adOrientation != 1) {
            i2 = 4;
        }
        Log.d(TAG, "Requested Orientation " + i2);
        localView.setOrientation(i2);
        prepare(optionsState);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void detach(int i) {
        AsyncFileUtils.ExistenceOperation existenceOperation = this.fileExistenceOperation;
        if (existenceOperation != null) {
            existenceOperation.cancel();
        }
        stop(i);
        this.adView.destroyAdView(0L);
    }

    private void playPost() {
        File file = new File(this.assetDir.getPath());
        final File file2 = new File(file.getPath() + File.separator + "index.html");
        this.fileExistenceOperation = AsyncFileUtils.isFileExistAsync(file2, new AsyncFileUtils.FileExistCallback() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.2
            @Override // com.vungle.warren.utility.AsyncFileUtils.FileExistCallback
            public void status(boolean z) {
                if (z) {
                    LocalAdContract.LocalView localView = LocalAdPresenter.this.adView;
                    localView.showWebsite("file://" + file2.getPath());
                    LocalAdPresenter.this.analytics.ping(LocalAdPresenter.this.advertisement.getTpatUrls(AnalyticsEvent.Ad.postrollView));
                    LocalAdPresenter.this.inPost = true;
                    return;
                }
                LocalAdPresenter.this.makeBusError(27);
                LocalAdPresenter.this.makeBusError(10);
                VungleLogger.error(LocalAdPresenter.class.getSimpleName() + "#playPost", "Error Rendering Postroll");
                LocalAdPresenter.this.closeAndReport();
            }
        });
    }

    private void prepare(OptionsState optionsState) {
        restoreFromSave(optionsState);
        Cookie cookie = this.cookies.get(Cookie.INCENTIVIZED_TEXT_COOKIE);
        String string = cookie == null ? null : cookie.getString(SDKConstants.PARAM_USER_ID);
        if (this.report == null) {
            Report report = new Report(this.advertisement, this.placement, System.currentTimeMillis(), string, this.sessionData);
            this.report = report;
            report.setTtDownload(this.advertisement.getTtDownload());
            this.repository.save(this.report, this.repoCallback);
        }
        if (this.durationRecorder == null) {
            this.durationRecorder = new DurationRecorder(this.report, this.repository, this.repoCallback);
        }
        this.webViewAPI.setErrorHandler(this);
        this.adView.showCTAOverlay(this.advertisement.isCtaOverlayEnabled(), this.advertisement.getCtaClickArea());
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext("start", null, this.placement.getId());
        }
    }

    private boolean needShowGDPR(Cookie cookie) {
        return cookie != null && cookie.getBoolean("is_country_data_protected").booleanValue() && "unknown".equals(cookie.getString("consent_status"));
    }

    private void showGDPR(final Cookie cookie) {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                cookie.putValue("consent_status", i == -2 ? Cookie.CONSENT_STATUS_OPTED_OUT : i == -1 ? Cookie.CONSENT_STATUS_OPTED_IN : "opted_out_by_timeout");
                cookie.putValue(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP, Long.valueOf(System.currentTimeMillis() / 1000));
                cookie.putValue("consent_source", "vungle_modal");
                LocalAdPresenter.this.repository.save(cookie, null);
                LocalAdPresenter.this.start();
            }
        };
        cookie.putValue("consent_status", "opted_out_by_timeout");
        cookie.putValue(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP, Long.valueOf(System.currentTimeMillis() / 1000));
        cookie.putValue("consent_source", "vungle_modal");
        this.repository.save(cookie, this.repoCallback);
        showDialog(cookie.getString("consent_title"), cookie.getString("consent_message"), cookie.getString("button_accept"), cookie.getString("button_deny"), onClickListener);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public boolean handleExit() {
        if (this.inPost) {
            closeAndReport();
            return true;
        } else if (this.userExitEnabled) {
            if (this.placement.isIncentivized() && this.progress <= 75) {
                showIncetivizedDialog();
                return false;
            }
            reportAction(AnalyticsEvent.Ad.videoClose, null);
            if (this.advertisement.hasPostroll()) {
                playPost();
                return false;
            }
            closeAndReport();
            return true;
        } else {
            return false;
        }
    }

    private void showIncetivizedDialog() {
        String str = this.dialogTitle;
        String str2 = this.dialogBody;
        String str3 = this.dialogContinue;
        String str4 = this.dialogClose;
        Cookie cookie = this.cookies.get(Cookie.INCENTIVIZED_TEXT_COOKIE);
        if (cookie != null) {
            str = cookie.getString("title");
            if (TextUtils.isEmpty(str)) {
                str = this.dialogTitle;
            }
            str2 = cookie.getString(SDKConstants.PARAM_A2U_BODY);
            if (TextUtils.isEmpty(str2)) {
                str2 = this.dialogBody;
            }
            str3 = cookie.getString("continue");
            if (TextUtils.isEmpty(str3)) {
                str3 = this.dialogContinue;
            }
            str4 = cookie.getString(JavascriptBridge.MraidHandler.CLOSE_ACTION);
            if (TextUtils.isEmpty(str4)) {
                str4 = this.dialogClose;
            }
        }
        showDialog(str, str2, str3, str4, new DialogInterface.OnClickListener() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == -2) {
                    LocalAdPresenter.this.reportAction(AnalyticsEvent.Ad.videoClose, null);
                    LocalAdPresenter.this.continueWithPostroll();
                }
            }
        });
    }

    private void showDialog(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        this.adView.pauseVideo();
        this.adView.showDialog(str, str2, str3, str4, onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueWithPostroll() {
        if (this.advertisement.hasPostroll()) {
            playPost();
        } else {
            closeAndReport();
        }
    }

    private boolean isWebPageBlank() {
        String websiteUrl = this.adView.getWebsiteUrl();
        return TextUtils.isEmpty(websiteUrl) || "about:blank".equalsIgnoreCase(websiteUrl);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void start() {
        this.durationRecorder.start();
        if (!this.adView.hasWebView()) {
            reportErrorAndCloseAd(31);
            VungleLogger.error(LocalAdPresenter.class.getSimpleName() + "#start", new VungleException(31).getLocalizedMessage());
            return;
        }
        this.adView.setImmersiveMode();
        this.adView.resumeWeb();
        Cookie cookie = this.cookies.get(Cookie.CONSENT_COOKIE);
        if (needShowGDPR(cookie)) {
            showGDPR(cookie);
        } else if (this.inPost) {
            if (isWebPageBlank()) {
                playPost();
            }
        } else if (this.adView.isVideoPlaying() || this.adView.isDialogVisible()) {
        } else {
            this.adView.playVideo(new File(this.assetDir.getPath() + File.separator + "video"), this.muted, this.videoPosition);
            int showCloseDelay = this.advertisement.getShowCloseDelay(this.placement.isIncentivized());
            if (showCloseDelay > 0) {
                this.scheduler.schedule(new Runnable() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.5
                    @Override // java.lang.Runnable
                    public void run() {
                        LocalAdPresenter.this.userExitEnabled = true;
                        if (LocalAdPresenter.this.inPost) {
                            return;
                        }
                        LocalAdPresenter.this.adView.showCloseButton();
                    }
                }, showCloseDelay);
                return;
            }
            this.userExitEnabled = true;
            this.adView.showCloseButton();
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void stop(int i) {
        this.durationRecorder.stop();
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        this.adView.pauseWeb();
        if (this.adView.isVideoPlaying()) {
            this.videoPosition = this.adView.getVideoPosition();
            this.adView.pauseVideo();
        }
        if (!z && z2) {
            if (this.isDestroying.getAndSet(true)) {
                return;
            }
            reportAction(JavascriptBridge.MraidHandler.CLOSE_ACTION, null);
            this.scheduler.cancelAll();
            AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
            if (eventListener != null) {
                eventListener.onNext("end", this.report.isCTAClicked() ? "isCTAClicked" : null, this.placement.getId());
            }
        } else if (this.inPost || z2) {
            this.adView.showWebsite("about:blank");
        }
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onProgressUpdate(int i, float f) {
        this.progress = (int) ((i / f) * 100.0f);
        this.videoPosition = i;
        this.durationRecorder.update();
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext("percentViewed:" + this.progress, null, this.placement.getId());
        }
        AdContract.AdvertisementPresenter.EventListener eventListener2 = this.bus;
        if (eventListener2 != null && i > 0 && !this.adViewed) {
            this.adViewed = true;
            eventListener2.onNext("adViewed", null, this.placement.getId());
            String[] strArr = this.impressionUrls;
            if (strArr != null) {
                this.analytics.ping(strArr);
            }
        }
        reportAction("video_viewed", String.format(Locale.ENGLISH, "%d", Integer.valueOf(i)));
        if (this.progress == 100) {
            if (this.checkpointList.peekLast() != null && this.checkpointList.peekLast().getPercentage() == 100) {
                this.analytics.ping(this.checkpointList.pollLast().getUrls());
            }
            continueWithPostroll();
        }
        this.report.recordProgress(this.videoPosition);
        this.repository.save(this.report, this.repoCallback);
        while (this.checkpointList.peek() != null && this.progress > this.checkpointList.peek().getPercentage()) {
            this.analytics.ping(this.checkpointList.poll().getUrls());
        }
        Cookie cookie = this.cookies.get(Cookie.CONFIG_COOKIE);
        if (!this.placement.isIncentivized() || this.progress <= 75 || cookie == null || !cookie.getBoolean("isReportIncentivizedEnabled").booleanValue() || this.sendReportIncentivized.getAndSet(true)) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("placement_reference_id", new JsonPrimitive(this.placement.getId()));
        jsonObject.add("app_id", new JsonPrimitive(this.advertisement.getAppID()));
        jsonObject.add(ReportDBAdapter.ReportColumns.COLUMN_AD_START_TIME, new JsonPrimitive(Long.valueOf(this.report.getAdStartTime())));
        jsonObject.add("user", new JsonPrimitive(this.report.getUserID()));
        this.analytics.ri(jsonObject);
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onVideoStart(int i, float f) {
        reportAction("videoLength", String.format(Locale.ENGLISH, "%d", Integer.valueOf((int) f)));
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onMute(boolean z) {
        this.muted = z;
        if (z) {
            reportAction(AnalyticsEvent.Ad.mute, "true");
        } else {
            reportAction(AnalyticsEvent.Ad.unmute, "false");
        }
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onDownload() {
        download();
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public boolean onMediaError(String str) {
        reportError(str);
        VungleLogger.error(LocalAdPresenter.class.getSimpleName() + "#onMediaError", "Media Error: " + str);
        return false;
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onPrivacy() {
        this.adView.open(HTTPS_VUNGLE_COM_PRIVACY, new PresenterAppLeftCallback(this.bus, this.placement));
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void generateSaveState(OptionsState optionsState) {
        if (optionsState == null) {
            return;
        }
        this.repository.save(this.report, this.repoCallback);
        Report report = this.report;
        optionsState.put(EXTRA_REPORT, report == null ? null : report.getId());
        optionsState.put(EXTRA_INCENTIVIZED_SENT, this.sendReportIncentivized.get());
        optionsState.put(EXTRA_IN_POST, this.inPost);
        optionsState.put(EXTRA_IS_MUTED, this.muted);
        LocalAdContract.LocalView localView = this.adView;
        optionsState.put(EXTRA_VIDEO_POSITION, (localView == null || !localView.isVideoPlaying()) ? this.videoPosition : this.adView.getVideoPosition());
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void restoreFromSave(OptionsState optionsState) {
        if (optionsState == null) {
            return;
        }
        if (optionsState.getBoolean(EXTRA_INCENTIVIZED_SENT, false)) {
            this.sendReportIncentivized.set(true);
        }
        this.inPost = optionsState.getBoolean(EXTRA_IN_POST, this.inPost);
        this.muted = optionsState.getBoolean(EXTRA_IS_MUTED, this.muted);
        this.videoPosition = optionsState.getInt(EXTRA_VIDEO_POSITION, this.videoPosition).intValue();
    }

    @Override // com.vungle.warren.ui.JavascriptBridge.MraidHandler
    public void onMraidAction(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -314498168) {
            if (str.equals("privacy")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 94756344) {
            if (hashCode == 1427818632 && str.equals(JavascriptBridge.MraidHandler.DOWNLOAD_ACTION)) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(JavascriptBridge.MraidHandler.CLOSE_ACTION)) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            closeAndReport();
        } else if (c == 1) {
            download();
            closeAndReport();
        } else if (c == 2) {
        } else {
            VungleLogger.error(LocalAdPresenter.class.getSimpleName() + "#onMraidAction", "Unknown MRAID Command");
            throw new IllegalArgumentException("Unknown action " + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e A[Catch: ActivityNotFoundException -> 0x007e, TRY_LEAVE, TryCatch #0 {ActivityNotFoundException -> 0x007e, blocks: (B:3:0x0009, B:5:0x004f, B:8:0x0056, B:10:0x006a, B:12:0x006e, B:9:0x0065), top: B:16:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void download() {
        /*
            r6 = this;
            java.lang.String r0 = "LocalAdPresenter"
            java.lang.String r1 = "cta"
            java.lang.String r2 = ""
            r6.reportAction(r1, r2)
            com.vungle.warren.analytics.AdAnalytics r1 = r6.analytics     // Catch: android.content.ActivityNotFoundException -> L7e
            com.vungle.warren.model.Advertisement r2 = r6.advertisement     // Catch: android.content.ActivityNotFoundException -> L7e
            java.lang.String r3 = "postroll_click"
            java.lang.String[] r2 = r2.getTpatUrls(r3)     // Catch: android.content.ActivityNotFoundException -> L7e
            r1.ping(r2)     // Catch: android.content.ActivityNotFoundException -> L7e
            com.vungle.warren.analytics.AdAnalytics r1 = r6.analytics     // Catch: android.content.ActivityNotFoundException -> L7e
            com.vungle.warren.model.Advertisement r2 = r6.advertisement     // Catch: android.content.ActivityNotFoundException -> L7e
            java.lang.String r3 = "click_url"
            java.lang.String[] r2 = r2.getTpatUrls(r3)     // Catch: android.content.ActivityNotFoundException -> L7e
            r1.ping(r2)     // Catch: android.content.ActivityNotFoundException -> L7e
            com.vungle.warren.analytics.AdAnalytics r1 = r6.analytics     // Catch: android.content.ActivityNotFoundException -> L7e
            com.vungle.warren.model.Advertisement r2 = r6.advertisement     // Catch: android.content.ActivityNotFoundException -> L7e
            java.lang.String r3 = "video_click"
            java.lang.String[] r2 = r2.getTpatUrls(r3)     // Catch: android.content.ActivityNotFoundException -> L7e
            r1.ping(r2)     // Catch: android.content.ActivityNotFoundException -> L7e
            com.vungle.warren.analytics.AdAnalytics r1 = r6.analytics     // Catch: android.content.ActivityNotFoundException -> L7e
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch: android.content.ActivityNotFoundException -> L7e
            com.vungle.warren.model.Advertisement r4 = r6.advertisement     // Catch: android.content.ActivityNotFoundException -> L7e
            java.lang.String r2 = r4.getCTAURL(r2)     // Catch: android.content.ActivityNotFoundException -> L7e
            r4 = 0
            r3[r4] = r2     // Catch: android.content.ActivityNotFoundException -> L7e
            r1.ping(r3)     // Catch: android.content.ActivityNotFoundException -> L7e
            java.lang.String r1 = "download"
            r2 = 0
            r6.reportAction(r1, r2)     // Catch: android.content.ActivityNotFoundException -> L7e
            com.vungle.warren.model.Advertisement r1 = r6.advertisement     // Catch: android.content.ActivityNotFoundException -> L7e
            java.lang.String r1 = r1.getCTAURL(r4)     // Catch: android.content.ActivityNotFoundException -> L7e
            if (r1 == 0) goto L65
            boolean r2 = r1.isEmpty()     // Catch: android.content.ActivityNotFoundException -> L7e
            if (r2 == 0) goto L56
            goto L65
        L56:
            com.vungle.warren.ui.contract.LocalAdContract$LocalView r2 = r6.adView     // Catch: android.content.ActivityNotFoundException -> L7e
            com.vungle.warren.ui.PresenterAppLeftCallback r3 = new com.vungle.warren.ui.PresenterAppLeftCallback     // Catch: android.content.ActivityNotFoundException -> L7e
            com.vungle.warren.ui.contract.AdContract$AdvertisementPresenter$EventListener r4 = r6.bus     // Catch: android.content.ActivityNotFoundException -> L7e
            com.vungle.warren.model.Placement r5 = r6.placement     // Catch: android.content.ActivityNotFoundException -> L7e
            r3.<init>(r4, r5)     // Catch: android.content.ActivityNotFoundException -> L7e
            r2.open(r1, r3)     // Catch: android.content.ActivityNotFoundException -> L7e
            goto L6a
        L65:
            java.lang.String r1 = "CTA destination URL is not configured properly"
            android.util.Log.e(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L7e
        L6a:
            com.vungle.warren.ui.contract.AdContract$AdvertisementPresenter$EventListener r1 = r6.bus     // Catch: android.content.ActivityNotFoundException -> L7e
            if (r1 == 0) goto L9f
            com.vungle.warren.ui.contract.AdContract$AdvertisementPresenter$EventListener r1 = r6.bus     // Catch: android.content.ActivityNotFoundException -> L7e
            java.lang.String r2 = "open"
            java.lang.String r3 = "adClick"
            com.vungle.warren.model.Placement r4 = r6.placement     // Catch: android.content.ActivityNotFoundException -> L7e
            java.lang.String r4 = r4.getId()     // Catch: android.content.ActivityNotFoundException -> L7e
            r1.onNext(r2, r3, r4)     // Catch: android.content.ActivityNotFoundException -> L7e
            goto L9f
        L7e:
            java.lang.String r1 = "Unable to find destination activity"
            android.util.Log.e(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<com.vungle.warren.ui.presenter.LocalAdPresenter> r1 = com.vungle.warren.ui.presenter.LocalAdPresenter.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "#download"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Download - Activity Not Found"
            com.vungle.warren.VungleLogger.error(r0, r1)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.ui.presenter.LocalAdPresenter.download():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeAndReport() {
        if (this.busy.get()) {
            Log.w(TAG, "Busy with closing");
            return;
        }
        this.busy.set(true);
        reportAction(JavascriptBridge.MraidHandler.CLOSE_ACTION, null);
        this.scheduler.cancelAll();
        this.adView.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void loadData(OptionsState optionsState) {
        this.cookies.put(Cookie.INCENTIVIZED_TEXT_COOKIE, this.repository.load(Cookie.INCENTIVIZED_TEXT_COOKIE, Cookie.class).get());
        this.cookies.put(Cookie.CONSENT_COOKIE, this.repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get());
        this.cookies.put(Cookie.CONFIG_COOKIE, this.repository.load(Cookie.CONFIG_COOKIE, Cookie.class).get());
        if (optionsState != null) {
            String string = optionsState.getString(EXTRA_REPORT);
            Report report = TextUtils.isEmpty(string) ? null : (Report) this.repository.load(string, Report.class).get();
            if (report != null) {
                this.report = report;
            }
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String str, boolean z) {
        Report report = this.report;
        if (report != null) {
            report.recordError(str);
            this.repository.save(this.report, this.repoCallback);
            VungleLogger.error(LocalAdPresenter.class.getSimpleName() + "onReceivedError", str);
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView webView, boolean z) {
        handleWebViewException(31);
        VungleLogger.error(LocalAdPresenter.class.getSimpleName() + "#onWebRenderingProcessGone", new VungleException(31).getLocalizedMessage());
        return true;
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException(32);
        VungleLogger.error(LocalAdPresenter.class.getSimpleName() + "#onRenderProcessUnresponsive", new VungleException(32).getLocalizedMessage());
    }

    private void handleWebViewException(int i) {
        LocalAdContract.LocalView localView = this.adView;
        if (localView != null) {
            localView.removeWebView();
        }
        reportErrorAndCloseAd(i);
    }

    private void reportErrorAndCloseAd(int i) {
        makeBusError(i);
        String simpleName = LocalAdPresenter.class.getSimpleName();
        VungleLogger.error(simpleName, "WebViewException: " + new VungleException(i).getLocalizedMessage());
        closeAndReport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeBusError(int i) {
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onError(new VungleException(i), this.placement.getId());
        }
    }
}
