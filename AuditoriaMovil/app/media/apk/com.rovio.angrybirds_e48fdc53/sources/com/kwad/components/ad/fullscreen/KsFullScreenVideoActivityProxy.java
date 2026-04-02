package com.kwad.components.ad.fullscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.kwad.components.ad.reward.e.f;
import com.kwad.components.ad.reward.j;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.offline.api.core.adlive.listener.OnAdLiveResumeInterceptor;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsFullScreenVideoAd;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.api.core.KsAdSdkDynamicImpl;
import com.kwad.sdk.api.proxy.app.FeedDownloadActivity;
import com.kwad.sdk.api.proxy.app.KsFullScreenLandScapeVideoActivity;
import com.kwad.sdk.api.proxy.app.KsFullScreenVideoActivity;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.utils.bi;
import com.kwad.sdk.utils.l;
import com.kwad.sdk.utils.t;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
@KsAdSdkDynamicImpl(FeedDownloadActivity.class)
/* loaded from: classes.dex */
public class KsFullScreenVideoActivityProxy extends com.kwad.components.core.l.b<j> implements OnAdLiveResumeInterceptor {
    public static final String KEY_TEMPLATE = "key_template_json";
    public static final String KEY_VIDEO_PLAY_CONFIG = "key_video_play_config";
    private static final String TAG = "FullScreenVideo";
    private static final HashMap<String, KsFullScreenVideoAd.FullScreenVideoAdInteractionListener> sHashMap = new HashMap<>();
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private DetailVideoView mDetailVideoView;
    private com.kwad.components.ad.fullscreen.c.b mFullScreenPresenter;
    private KsFullScreenVideoAd.FullScreenVideoAdInteractionListener mInteractionListener;
    private boolean mIsBackEnable;
    private boolean mPageDismissCalled;
    public long mPageEnterTime;
    private FrameLayout mPlayLayout;
    private JSONObject mReportExtData;
    private AdBaseFrameLayout mRootContainer;
    public int mScreenOrientation;
    private bi mTimerHelper;
    private KsVideoPlayConfig mVideoPlayConfig;
    private f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy.1
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            KsFullScreenVideoActivityProxy.this.mIsBackEnable = true;
        }
    };
    private com.kwad.components.ad.reward.e.b mAdOpenInteractionListener = new com.kwad.components.ad.reward.e.c() { // from class: com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy.2
        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void bF() {
            if (KsFullScreenVideoActivityProxy.this.mInteractionListener != null) {
                KsFullScreenVideoActivityProxy.this.mInteractionListener.onAdClicked();
            }
        }

        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void h(boolean z) {
            KsFullScreenVideoActivityProxy.this.notifyPageDismiss();
        }

        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void onVideoPlayEnd() {
            if (KsFullScreenVideoActivityProxy.this.mInteractionListener != null) {
                KsFullScreenVideoActivityProxy.this.mInteractionListener.onVideoPlayEnd();
            }
        }

        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void onVideoPlayError(int i, int i2) {
            if (KsFullScreenVideoActivityProxy.this.mInteractionListener != null) {
                KsFullScreenVideoActivityProxy.this.mInteractionListener.onVideoPlayError(i, i2);
            }
        }

        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void onVideoPlayStart() {
            if (KsFullScreenVideoActivityProxy.this.mInteractionListener != null) {
                KsFullScreenVideoActivityProxy.this.mInteractionListener.onVideoPlayStart();
            }
        }

        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void onVideoSkipToEnd(long j) {
            if (KsFullScreenVideoActivityProxy.this.mInteractionListener != null) {
                KsFullScreenVideoActivityProxy.this.mInteractionListener.onSkippedVideo();
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.kwad.components.ad.j.a, com.kwad.components.ad.reward.l.a] */
    private void createPlayModuleProxy(j jVar) {
        com.kwad.components.ad.reward.l.d dVar;
        com.kwad.components.ad.reward.l.c cVar;
        if (com.kwad.sdk.core.response.b.a.aV(this.mAdInfo)) {
            ?? aVar = new com.kwad.components.ad.reward.l.a(this.mAdTemplate);
            dVar = new com.kwad.components.ad.reward.l.d(3, aVar);
            cVar = aVar;
        } else {
            com.kwad.components.ad.reward.l.c cVar2 = new com.kwad.components.ad.reward.l.c(jVar, this.mDetailVideoView);
            dVar = new com.kwad.components.ad.reward.l.d(1, cVar2);
            cVar = cVar2;
        }
        jVar.a(cVar);
        jVar.oZ = dVar;
    }

    private static String getListenerKey(AdTemplate adTemplate) {
        return adTemplate == null ? "" : String.valueOf(com.kwad.sdk.core.response.b.d.ck(adTemplate).adBaseInfo.creativeId);
    }

    private bi getTimerHelper() {
        if (this.mTimerHelper == null) {
            bi biVar = new bi();
            this.mTimerHelper = biVar;
            biVar.startTiming();
        }
        return this.mTimerHelper;
    }

    private void initVideoPlayConfig(KsVideoPlayConfig ksVideoPlayConfig) {
        if (TextUtils.isEmpty(ksVideoPlayConfig.getShowScene())) {
            return;
        }
        this.mReportExtData = null;
        JSONObject jSONObject = new JSONObject();
        this.mReportExtData = jSONObject;
        t.putValue(jSONObject, "ext_showscene", ksVideoPlayConfig.getShowScene());
    }

    public static void launch(Context context, AdTemplate adTemplate, KsVideoPlayConfig ksVideoPlayConfig, KsFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        Intent intent;
        l.cE(adTemplate);
        if (ksVideoPlayConfig.isShowLandscape()) {
            com.kwad.sdk.service.b.a(KsFullScreenLandScapeVideoActivity.class, KsFullScreenLandScapeVideoActivityProxy.class);
            intent = new Intent(context, KsFullScreenLandScapeVideoActivity.class);
        } else {
            com.kwad.sdk.service.b.a(FeedDownloadActivity.class, KsFullScreenVideoActivityProxy.class);
            intent = new Intent(context, FeedDownloadActivity.class);
        }
        intent.setFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("key_template_json", adTemplate.toJson().toString());
        intent.putExtra("key_video_play_config", ksVideoPlayConfig);
        sHashMap.put(getListenerKey(adTemplate), fullScreenVideoAdInteractionListener);
        context.startActivity(intent);
        com.kwad.sdk.a.a.c.xY().bc(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPageDismiss() {
        if (this.mPageDismissCalled) {
            return;
        }
        this.mPageDismissCalled = true;
        com.kwad.sdk.a.a.c.xY().yb();
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, 6, getTimerHelper().getTime(), this.mReportExtData);
        KsFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.mInteractionListener;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onPageDismiss();
        }
    }

    public static void register() {
        com.kwad.sdk.service.b.a(KsFullScreenVideoActivity.class, KsFullScreenVideoActivityProxy.class);
        com.kwad.sdk.service.b.a(FeedDownloadActivity.class, KsFullScreenVideoActivityProxy.class);
    }

    @Override // com.kwad.components.core.o.c
    public boolean checkIntentData(Intent intent) {
        Serializable serializableExtra = getIntent().getSerializableExtra("key_video_play_config");
        if (serializableExtra instanceof KsVideoPlayConfig) {
            this.mVideoPlayConfig = (KsVideoPlayConfig) serializableExtra;
        }
        try {
            String stringExtra = getIntent().getStringExtra("key_template_json");
            AdTemplate adTemplate = new AdTemplate();
            adTemplate.parseJson(new JSONObject(stringExtra));
            this.mAdTemplate = adTemplate;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
        if (this.mVideoPlayConfig == null || this.mAdTemplate == null) {
            com.kwad.sdk.i.a.af("fullscreen", TTLogUtil.TAG_EVENT_SHOW);
            return false;
        }
        return true;
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void finish() {
        super.finish();
        notifyPageDismiss();
    }

    @Override // com.kwad.components.core.o.c
    public int getLayoutId() {
        return R.layout.ksad_activity_fullscreen_video;
    }

    @Override // com.kwad.components.core.o.c
    public String getPageName() {
        return "KsFullScreenVideoActivityProxy";
    }

    @Override // com.kwad.components.offline.api.core.adlive.listener.OnAdLiveResumeInterceptor
    public boolean handledAdLiveOnResume() {
        return ((j) this.mCallerContext).fQ();
    }

    @Override // com.kwad.components.core.o.c
    public void initData() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.mPageEnterTime = elapsedRealtime;
        com.kwad.components.ad.reward.monitor.a.a(false, this.mAdTemplate, elapsedRealtime);
        com.kwad.components.ad.reward.monitor.a.H(false);
        this.mInteractionListener = sHashMap.get(getListenerKey(this.mAdTemplate));
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        this.mScreenOrientation = this.mVideoPlayConfig.isShowLandscape() ? 1 : 0;
        this.mAdTemplate.mInitVoiceStatus = this.mVideoPlayConfig.isVideoSoundEnable() ? 2 : 1;
        initVideoPlayConfig(this.mVideoPlayConfig);
    }

    @Override // com.kwad.components.core.o.c
    public void initView() {
        AdBaseFrameLayout adBaseFrameLayout = (AdBaseFrameLayout) findViewById(R.id.ksad_root_container);
        this.mRootContainer = adBaseFrameLayout;
        this.mDetailVideoView = (DetailVideoView) adBaseFrameLayout.findViewById(R.id.ksad_video_player);
        this.mPlayLayout = (FrameLayout) this.mRootContainer.findViewById(R.id.ksad_reward_play_layout);
        this.mDetailVideoView.f(true, com.kwad.sdk.core.config.d.zW());
        com.kwad.sdk.i.a.af("fullscreen", TTLogUtil.TAG_EVENT_SHOW);
    }

    @Override // com.kwad.components.core.o.c
    public boolean needAdaptionScreen() {
        return true;
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
        com.kwad.components.ad.fullscreen.c.b bVar = this.mFullScreenPresenter;
        if ((bVar == null || !bVar.bQ()) && this.mIsBackEnable) {
            super.onBackPressed();
        }
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_FULLSCREEN, "adShowSuccess").report();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.kwad.components.core.l.b
    public j onCreateCallerContext() {
        j jVar = new j(this);
        jVar.mPageEnterTime = this.mPageEnterTime;
        jVar.oY = false;
        jVar.mAdOpenInteractionListener = this.mAdOpenInteractionListener;
        jVar.mScreenOrientation = this.mScreenOrientation;
        jVar.mVideoPlayConfig = this.mVideoPlayConfig;
        jVar.mReportExtData = this.mReportExtData;
        jVar.mRootContainer = this.mRootContainer;
        jVar.mAdTemplate = this.mAdTemplate;
        createPlayModuleProxy(jVar);
        if (com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
            jVar.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate, this.mReportExtData);
        }
        jVar.pc = new RewardActionBarControl(jVar, this.mContext, this.mAdTemplate);
        jVar.b(this.mPlayEndPageListener);
        if (com.kwad.sdk.core.response.b.b.bo(this.mAdTemplate)) {
            jVar.pd = new com.kwad.components.ad.reward.l(jVar, this.mReportExtData, null);
        }
        if (com.kwad.sdk.core.response.b.a.bv(this.mAdInfo)) {
            jVar.pb = new com.kwad.components.core.playable.a((KsAdWebView) findViewById(R.id.ksad_playable_webview));
        }
        if (com.kwad.sdk.core.response.b.a.am(this.mAdInfo)) {
            jVar.pe = new com.kwad.components.ad.k.a().ag(false);
        }
        jVar.pn = false;
        jVar.pI = com.kwad.sdk.core.response.b.a.bv(this.mAdInfo) ? com.kwad.sdk.core.response.b.a.aj(this.mAdInfo) : com.kwad.sdk.core.response.b.a.ae(this.mAdInfo);
        jVar.mTimerHelper = getTimerHelper();
        return jVar;
    }

    @Override // com.kwad.components.core.l.b
    public Presenter onCreatePresenter() {
        b bVar = new b(this.mAdTemplate);
        getActivity();
        com.kwad.components.ad.fullscreen.c.b bVar2 = new com.kwad.components.ad.fullscreen.c.b(this, this.mRootContainer, bVar, (j) this.mCallerContext);
        this.mFullScreenPresenter = bVar2;
        return bVar2;
    }

    @Override // com.kwad.components.core.l.b, com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
        super.onDestroy();
        notifyPageDismiss();
        AdInfo adInfo = this.mAdInfo;
        if (adInfo != null) {
            String F = com.kwad.sdk.core.response.b.a.F(adInfo);
            if (!TextUtils.isEmpty(F)) {
                com.kwad.sdk.core.videocache.c.a.bl(this.mContext.getApplicationContext()).dQ(F);
            }
        }
        if (this.mCallerContext != 0 && ((j) this.mCallerContext).oZ.jT()) {
            ((j) this.mCallerContext).oZ.jU().removeInterceptor(this);
        }
        sHashMap.remove(getListenerKey(this.mAdTemplate));
        this.mInteractionListener = null;
    }

    @Override // com.kwad.components.core.l.b, com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
        super.onPause();
        getTimerHelper().Ka();
        if (this.mCallerContext != 0) {
            ((j) this.mCallerContext).mPageEnterTime = -1L;
        }
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPreCreate(Bundle bundle) {
        super.onPreCreate(bundle);
        try {
            getIntent().removeExtra("key_template");
        } catch (Throwable th) {
        }
    }

    @Override // com.kwad.components.core.l.b, com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
        super.onResume();
        getTimerHelper().JZ();
    }
}
