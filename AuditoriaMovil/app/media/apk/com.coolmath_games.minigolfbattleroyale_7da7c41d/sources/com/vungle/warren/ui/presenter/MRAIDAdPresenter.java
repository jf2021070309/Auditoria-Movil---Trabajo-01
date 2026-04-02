package com.vungle.warren.ui.presenter;

import android.content.ActivityNotFoundException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import androidx.core.app.NotificationCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.vungle.warren.SessionData;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.analytics.AdAnalytics;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.omsdk.OMTracker;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.DurationRecorder;
import com.vungle.warren.ui.JavascriptBridge;
import com.vungle.warren.ui.PresenterAppLeftCallback;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.ui.view.WebViewAPI;
import com.vungle.warren.utility.AsyncFileUtils;
import com.vungle.warren.utility.Constants;
import com.vungle.warren.utility.Scheduler;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class MRAIDAdPresenter implements WebAdContract.WebAdPresenter, WebViewAPI.MRAIDDelegate, WebViewAPI.WebClientErrorHandler {
    private static final String ACTION = "action";
    private static final String ACTION_WITH_VALUE = "actionWithValue";
    private static final String CLOSE = "close";
    private static final String CONSENT_ACTION = "consentAction";
    private static final String EXTRA_INCENTIVIZED_SENT = "incentivized_sent";
    private static final String EXTRA_REPORT = "saved_report";
    private static final String OPEN = "open";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    private static final String OPEN_PRIVACY = "openPrivacy";
    private static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = MRAIDAdPresenter.class.getCanonicalName();
    private static final String TPAT = "tpat";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    private static final String VIDEO_VIEWED = "videoViewed";
    private WebAdContract.WebAdView adView;
    private boolean adViewed;
    private Advertisement advertisement;
    private final AdAnalytics analytics;
    private File assetDir;
    private boolean backEnabled;
    private AdContract.AdvertisementPresenter.EventListener bus;
    private long duration;
    private DurationRecorder durationRecorder;
    private AsyncFileUtils.ExistenceOperation fileExistenceOperation;
    private final String[] impressionUrls;
    private final OMTracker omTracker;
    private final Placement placement;
    private Report report;
    private Repository repository;
    private final Scheduler scheduler;
    private SessionData sessionData;
    private WebViewAPI webClient;
    private Map<String, Cookie> cookieMap = new HashMap();
    private AtomicBoolean sendReportIncentivized = new AtomicBoolean(false);
    private AtomicBoolean isDestroying = new AtomicBoolean(false);
    private Repository.SaveCallback repoCallback = new Repository.SaveCallback() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.1
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
            MRAIDAdPresenter.this.makeBusError(26);
            VungleLogger.error(MRAIDAdPresenter.class.getSimpleName(), new VungleException(26).getLocalizedMessage());
            MRAIDAdPresenter.this.closeView();
        }
    };

    public MRAIDAdPresenter(Advertisement advertisement, Placement placement, Repository repository, Scheduler scheduler, AdAnalytics adAnalytics, WebViewAPI webViewAPI, OptionsState optionsState, File file, SessionData sessionData, OMTracker oMTracker, String[] strArr) {
        this.advertisement = advertisement;
        this.repository = repository;
        this.placement = placement;
        this.scheduler = scheduler;
        this.analytics = adAnalytics;
        this.webClient = webViewAPI;
        this.assetDir = file;
        this.sessionData = sessionData;
        this.omTracker = oMTracker;
        this.impressionUrls = strArr;
        loadData(optionsState);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void setEventListener(AdContract.AdvertisementPresenter.EventListener eventListener) {
        this.bus = eventListener;
    }

    public void reportAction(String str, String str2) {
        if (str.equals("videoLength")) {
            long parseLong = Long.parseLong(str2);
            this.duration = parseLong;
            this.report.setVideoLength(parseLong);
            this.repository.save(this.report, this.repoCallback);
            return;
        }
        this.report.recordAction(str, str2, System.currentTimeMillis());
        this.repository.save(this.report, this.repoCallback);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void onViewConfigurationChanged() {
        this.adView.updateWindow();
        this.webClient.notifyPropertiesChange(true);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void attach(WebAdContract.WebAdView webAdView, OptionsState optionsState) {
        this.isDestroying.set(false);
        this.adView = webAdView;
        webAdView.setPresenter(this);
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext(Constants.ATTACH, this.advertisement.getCreativeId(), this.placement.getId());
        }
        this.omTracker.start();
        int settings = this.advertisement.getAdConfig().getSettings();
        if (settings > 0) {
            this.backEnabled = (settings & 2) == 2;
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
        webAdView.setOrientation(i2);
        prepare(optionsState);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void detach(int i) {
        AsyncFileUtils.ExistenceOperation existenceOperation = this.fileExistenceOperation;
        if (existenceOperation != null) {
            existenceOperation.cancel();
        }
        stop(i);
        this.webClient.setWebViewObserver(null);
        this.adView.destroyAdView(this.omTracker.stop());
    }

    private void prepare(OptionsState optionsState) {
        this.webClient.setMRAIDDelegate(this);
        this.webClient.setErrorHandler(this);
        loadMraid(new File(this.assetDir.getPath() + File.separator + "template"));
        Cookie cookie = this.cookieMap.get(Cookie.INCENTIVIZED_TEXT_COOKIE);
        if (cookie != null) {
            this.advertisement.setIncentivizedText(cookie.getString("title"), cookie.getString(SDKConstants.PARAM_A2U_BODY), cookie.getString("continue"), cookie.getString("close"));
        }
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
        Cookie cookie2 = this.cookieMap.get(Cookie.CONSENT_COOKIE);
        if (cookie2 != null) {
            boolean z = cookie2.getBoolean("is_country_data_protected").booleanValue() && "unknown".equals(cookie2.getString("consent_status"));
            this.webClient.setConsentStatus(z, cookie2.getString("consent_title"), cookie2.getString("consent_message"), cookie2.getString("button_accept"), cookie2.getString("button_deny"));
            if (z) {
                cookie2.putValue("consent_status", "opted_out_by_timeout");
                cookie2.putValue(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP, Long.valueOf(System.currentTimeMillis() / 1000));
                cookie2.putValue("consent_source", "vungle_modal");
                this.repository.save(cookie2, this.repoCallback);
            }
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(this.placement.isIncentivized());
        if (showCloseDelay > 0) {
            this.scheduler.schedule(new Runnable() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.2
                @Override // java.lang.Runnable
                public void run() {
                    MRAIDAdPresenter.this.backEnabled = true;
                }
            }, showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        this.adView.updateWindow();
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext("start", null, this.placement.getId());
        }
    }

    private void loadMraid(File file) {
        File file2 = new File(file.getParent());
        final File file3 = new File(file2.getPath() + File.separator + "index.html");
        this.fileExistenceOperation = AsyncFileUtils.isFileExistAsync(file3, new AsyncFileUtils.FileExistCallback() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.3
            @Override // com.vungle.warren.utility.AsyncFileUtils.FileExistCallback
            public void status(boolean z) {
                if (!z) {
                    MRAIDAdPresenter.this.makeBusError(27);
                    MRAIDAdPresenter.this.makeBusError(10);
                    MRAIDAdPresenter.this.adView.close();
                    return;
                }
                WebAdContract.WebAdView webAdView = MRAIDAdPresenter.this.adView;
                webAdView.showWebsite("file://" + file3.getPath());
                MRAIDAdPresenter.this.recordPlayRemoteUrl();
            }
        });
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void start() {
        if (!this.adView.hasWebView()) {
            reportErrorAndCloseAd(31);
            return;
        }
        this.adView.setImmersiveMode();
        this.adView.resumeWeb();
        setAdVisibility(true);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void stop(int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        this.adView.pauseWeb();
        setAdVisibility(false);
        if (z || !z2 || this.isDestroying.getAndSet(true)) {
            return;
        }
        WebViewAPI webViewAPI = this.webClient;
        if (webViewAPI != null) {
            webViewAPI.setMRAIDDelegate(null);
        }
        if (z3) {
            reportAction("mraidCloseByApi", null);
        }
        this.repository.save(this.report, this.repoCallback);
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext("end", this.report.isCTAClicked() ? "isCTAClicked" : null, this.placement.getId());
        }
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdPresenter
    public void setAdVisibility(boolean z) {
        this.webClient.setAdVisibility(z);
        if (z) {
            this.durationRecorder.start();
        } else {
            this.durationRecorder.stop();
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void generateSaveState(OptionsState optionsState) {
        if (optionsState == null) {
            return;
        }
        this.repository.save(this.report, this.repoCallback);
        optionsState.put(EXTRA_REPORT, this.report.getId());
        optionsState.put(EXTRA_INCENTIVIZED_SENT, this.sendReportIncentivized.get());
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void restoreFromSave(OptionsState optionsState) {
        if (optionsState == null) {
            return;
        }
        boolean z = optionsState.getBoolean(EXTRA_INCENTIVIZED_SENT, false);
        if (z) {
            this.sendReportIncentivized.set(z);
        }
        if (this.report == null) {
            this.adView.close();
            VungleLogger.error(MRAIDAdPresenter.class.getSimpleName() + "#restoreFromSave", "The advertisement was not started and cannot be restored.");
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public boolean handleExit() {
        if (this.backEnabled) {
            this.adView.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.vungle.warren.ui.view.WebViewAPI.MRAIDDelegate
    public boolean processCommand(String str, JsonObject jsonObject) {
        char c;
        boolean z;
        float f;
        char c2;
        char c3;
        switch (str.hashCode()) {
            case -1912374177:
                if (str.equals(SUCCESSFUL_VIEW)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1422950858:
                if (str.equals("action")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -735200587:
                if (str.equals(ACTION_WITH_VALUE)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -660787472:
                if (str.equals(CONSENT_ACTION)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -511324706:
                if (str.equals(OPEN_PRIVACY)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -418575596:
                if (str.equals(OPEN_NON_MRAID)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -348095344:
                if (str.equals(USE_CUSTOM_PRIVACY)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3417674:
                if (str.equals(OPEN)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3566511:
                if (str.equals(TPAT)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 94756344:
                if (str.equals("close")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1614272768:
                if (str.equals(USE_CUSTOM_CLOSE)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                reportAction("mraidClose", null);
                closeView();
                return true;
            case 1:
                Cookie cookie = this.cookieMap.get(Cookie.CONSENT_COOKIE);
                if (cookie == null) {
                    cookie = new Cookie(Cookie.CONSENT_COOKIE);
                }
                cookie.putValue("consent_status", jsonObject.get(NotificationCompat.CATEGORY_EVENT).getAsString());
                cookie.putValue("consent_source", "vungle_modal");
                cookie.putValue(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP, Long.valueOf(System.currentTimeMillis() / 1000));
                this.repository.save(cookie, this.repoCallback);
                return true;
            case 2:
                String asString = jsonObject.get(NotificationCompat.CATEGORY_EVENT).getAsString();
                String asString2 = jsonObject.get("value").getAsString();
                this.report.recordAction(asString, asString2, System.currentTimeMillis());
                this.repository.save(this.report, this.repoCallback);
                if (asString.equals("videoViewed")) {
                    try {
                        f = Float.parseFloat(asString2);
                    } catch (NumberFormatException unused) {
                        Log.e(TAG, "value for videoViewed is null !");
                        f = 0.0f;
                    }
                    AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
                    if (eventListener != null && f > 0.0f && !this.adViewed) {
                        this.adViewed = true;
                        eventListener.onNext("adViewed", null, this.placement.getId());
                        String[] strArr = this.impressionUrls;
                        if (strArr != null) {
                            this.analytics.ping(strArr);
                        }
                    }
                    long j = this.duration;
                    if (j > 0) {
                        int i = (int) ((f / ((float) j)) * 100.0f);
                        if (i > 0) {
                            AdContract.AdvertisementPresenter.EventListener eventListener2 = this.bus;
                            if (eventListener2 != null) {
                                eventListener2.onNext("percentViewed:" + i, null, this.placement.getId());
                            }
                            Cookie cookie2 = this.cookieMap.get(Cookie.CONFIG_COOKIE);
                            if (this.placement.isIncentivized() && i > 75 && cookie2 != null && cookie2.getBoolean("isReportIncentivizedEnabled").booleanValue() && !this.sendReportIncentivized.getAndSet(true)) {
                                JsonObject jsonObject2 = new JsonObject();
                                jsonObject2.add("placement_reference_id", new JsonPrimitive(this.placement.getId()));
                                jsonObject2.add("app_id", new JsonPrimitive(this.advertisement.getAppID()));
                                jsonObject2.add(ReportDBAdapter.ReportColumns.COLUMN_AD_START_TIME, new JsonPrimitive(Long.valueOf(this.report.getAdStartTime())));
                                jsonObject2.add("user", new JsonPrimitive(this.report.getUserID()));
                                this.analytics.ri(jsonObject2);
                            }
                        }
                        this.durationRecorder.update();
                    }
                }
                if (asString.equals("videoLength")) {
                    this.duration = Long.parseLong(asString2);
                    reportAction("videoLength", asString2);
                    z = true;
                    this.webClient.notifyPropertiesChange(true);
                } else {
                    z = true;
                }
                this.adView.setVisibility(z);
                return z;
            case 3:
                this.analytics.ping(this.advertisement.getTpatUrls(jsonObject.get(NotificationCompat.CATEGORY_EVENT).getAsString()));
                return true;
            case 4:
                return true;
            case 5:
            case 6:
                reportAction(JavascriptBridge.MraidHandler.DOWNLOAD_ACTION, null);
                if (OPEN.equalsIgnoreCase(str)) {
                    reportAction("mraidOpen", null);
                } else if (OPEN_NON_MRAID.equalsIgnoreCase(str)) {
                    reportAction("nonMraidOpen", null);
                }
                String asString3 = jsonObject.get("url").getAsString();
                if (asString3 == null || asString3.isEmpty()) {
                    Log.e(TAG, "CTA destination URL is not configured properly");
                } else {
                    this.adView.open(asString3, new PresenterAppLeftCallback(this.bus, this.placement));
                }
                AdContract.AdvertisementPresenter.EventListener eventListener3 = this.bus;
                if (eventListener3 != null) {
                    eventListener3.onNext(OPEN, "adClick", this.placement.getId());
                    return true;
                }
                return true;
            case 7:
                String asString4 = jsonObject.get("sdkCloseButton").getAsString();
                int hashCode = asString4.hashCode();
                if (hashCode == -1901805651) {
                    if (asString4.equals("invisible")) {
                        c2 = 1;
                    }
                    c2 = 65535;
                } else if (hashCode != 3178655) {
                    if (hashCode == 466743410 && asString4.equals("visible")) {
                        c2 = 2;
                    }
                    c2 = 65535;
                } else {
                    if (asString4.equals("gone")) {
                        c2 = 0;
                    }
                    c2 = 65535;
                }
                if (c2 == 0 || c2 == 1 || c2 == 2) {
                    return true;
                }
                throw new IllegalArgumentException("Unknown value " + asString4);
            case '\b':
                String asString5 = jsonObject.get(USE_CUSTOM_PRIVACY).getAsString();
                int hashCode2 = asString5.hashCode();
                if (hashCode2 == 3178655) {
                    if (asString5.equals("gone")) {
                        c3 = 0;
                    }
                    c3 = 65535;
                } else if (hashCode2 != 3569038) {
                    if (hashCode2 == 97196323 && asString5.equals("false")) {
                        c3 = 2;
                    }
                    c3 = 65535;
                } else {
                    if (asString5.equals("true")) {
                        c3 = 1;
                    }
                    c3 = 65535;
                }
                if (c3 == 0 || c3 == 1 || c3 == 2) {
                    return true;
                }
                throw new IllegalArgumentException("Unknown value " + asString5);
            case '\t':
                this.adView.open(jsonObject.get("url").getAsString(), new PresenterAppLeftCallback(this.bus, this.placement));
                return true;
            case '\n':
                AdContract.AdvertisementPresenter.EventListener eventListener4 = this.bus;
                if (eventListener4 != null) {
                    eventListener4.onNext(SUCCESSFUL_VIEW, null, this.placement.getId());
                }
                Cookie cookie3 = this.cookieMap.get(Cookie.CONFIG_COOKIE);
                if (!this.placement.isIncentivized() || cookie3 == null || !cookie3.getBoolean("isReportIncentivizedEnabled").booleanValue() || this.sendReportIncentivized.getAndSet(true)) {
                    return true;
                }
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.add("placement_reference_id", new JsonPrimitive(this.placement.getId()));
                jsonObject3.add("app_id", new JsonPrimitive(this.advertisement.getAppID()));
                jsonObject3.add(ReportDBAdapter.ReportColumns.COLUMN_AD_START_TIME, new JsonPrimitive(Long.valueOf(this.report.getAdStartTime())));
                jsonObject3.add("user", new JsonPrimitive(this.report.getUserID()));
                this.analytics.ri(jsonObject3);
                return true;
            default:
                VungleLogger.error(MRAIDAdPresenter.class.getSimpleName() + "#processCommand", "Unknown MRAID Command");
                return false;
        }
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
            if (str.equals("close")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            closeView();
        } else if (c == 1) {
            download();
        } else if (c == 2) {
        } else {
            throw new IllegalArgumentException("Unknown action " + str);
        }
    }

    private void download() {
        reportAction(SDKConstants.PARAM_GAME_REQUESTS_CTA, "");
        try {
            this.analytics.ping(new String[]{this.advertisement.getCTAURL(true)});
            this.adView.open(this.advertisement.getCTAURL(false), new PresenterAppLeftCallback(this.bus, this.placement));
        } catch (ActivityNotFoundException unused) {
            VungleLogger.error(MRAIDAdPresenter.class.getSimpleName() + "#download", "Download - Activity Not Found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeView() {
        this.adView.close();
        this.scheduler.cancelAll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void loadData(OptionsState optionsState) {
        this.cookieMap.put(Cookie.INCENTIVIZED_TEXT_COOKIE, this.repository.load(Cookie.INCENTIVIZED_TEXT_COOKIE, Cookie.class).get());
        this.cookieMap.put(Cookie.CONSENT_COOKIE, this.repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get());
        this.cookieMap.put(Cookie.CONFIG_COOKIE, this.repository.load(Cookie.CONFIG_COOKIE, Cookie.class).get());
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
        }
        VungleLogger.error(MRAIDAdPresenter.class.getSimpleName() + "#onReceivedError", str);
        if (z) {
            reportErrorAndCloseAd(38);
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView webView, boolean z) {
        handleWebViewException(31);
        VungleLogger.error(MRAIDAdPresenter.class.getSimpleName() + "onWebRenderingProcessGone", new VungleException(31).getLocalizedMessage());
        return true;
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException(32);
        VungleLogger.error(MRAIDAdPresenter.class.getSimpleName() + "#onRenderProcessUnresponsive", new VungleException(32).getLocalizedMessage());
    }

    private void handleWebViewException(int i) {
        WebAdContract.WebAdView webAdView = this.adView;
        if (webAdView != null) {
            webAdView.removeWebView();
        }
        VungleLogger.error(MRAIDAdPresenter.class.getSimpleName() + "#handleWebViewException", "WebViewException: " + new VungleException(i).getLocalizedMessage());
        reportErrorAndCloseAd(i);
    }

    private void reportErrorAndCloseAd(int i) {
        makeBusError(i);
        closeView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeBusError(int i) {
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onError(new VungleException(i), this.placement.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPlayRemoteUrl() {
        Report report;
        Advertisement advertisement = (Advertisement) this.repository.load(this.advertisement.getId(), Advertisement.class).get();
        if (advertisement == null || (report = this.report) == null) {
            return;
        }
        report.setAllAssetDownloaded(advertisement.assetsFullyDownloaded);
        this.repository.save(this.report, this.repoCallback);
    }
}
