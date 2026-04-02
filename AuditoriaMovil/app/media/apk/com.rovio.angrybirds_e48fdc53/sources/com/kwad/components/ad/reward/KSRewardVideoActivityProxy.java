package com.kwad.components.ad.reward;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.kwad.components.ad.reward.j;
import com.kwad.components.ad.reward.o;
import com.kwad.components.ad.reward.page.BackPressHandleResult;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.t.c;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.offline.api.core.adlive.listener.OnAdLiveResumeInterceptor;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsRewardVideoAd;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.api.core.KsAdSdkDynamicImpl;
import com.kwad.sdk.api.proxy.app.KSRewardLandScapeVideoActivity;
import com.kwad.sdk.api.proxy.app.KsRewardVideoActivity;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.bi;
import com.kwad.sdk.utils.bj;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.sdk.ksdk.util.Var;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.util.HashMap;
@KsAdSdkDynamicImpl(KsRewardVideoActivity.class)
/* loaded from: classes.dex */
public class KSRewardVideoActivityProxy extends com.kwad.components.core.l.b<j> implements j.b, o.a, c.b, OnAdLiveResumeInterceptor {
    public static final String KEY_REWARD_TYPE = "key_template_reward_type";
    public static final String KEY_TEMPLATE = "key_template_json";
    public static final String KEY_VIDEO_PLAY_CONFIG = "key_video_play_config";
    private static final String TAG = "RewardVideo";
    private String listenerKey;
    private DetailVideoView mDetailVideoView;
    private boolean mIsBackEnable;
    private com.kwad.components.ad.reward.model.c mModel;
    private boolean mPageDismissCalled;
    private long mPageEnterTime;
    private FrameLayout mPlayLayout;
    private long mPlayTime;
    private o mRewardPresenter;
    private AdBaseFrameLayout mRootContainer;
    private bi mTimerHelper;
    private boolean mIsFinishVideoLookStep = false;
    private final com.kwad.components.ad.reward.e.j mRewardVerifyListener = new com.kwad.components.ad.reward.e.j() { // from class: com.kwad.components.ad.reward.KSRewardVideoActivityProxy.1
        @Override // com.kwad.components.ad.reward.e.j
        public final void onRewardVerify() {
            if (KSRewardVideoActivityProxy.this.mModel.hu() && ((j) KSRewardVideoActivityProxy.this.mCallerContext).mCheckExposureResult && ((j) KSRewardVideoActivityProxy.this.mCallerContext).pv != 2) {
                KSRewardVideoActivityProxy.this.markOpenNsCompleted();
                KSRewardVideoActivityProxy.this.notifyRewardVerify();
                KSRewardVideoActivityProxy.this.notifyRewardVerifyStepByStep();
            }
        }
    };
    private com.kwad.components.ad.reward.e.b mAdOpenInteractionListener = new com.kwad.components.ad.reward.e.c() { // from class: com.kwad.components.ad.reward.KSRewardVideoActivityProxy.2
        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void bF() {
            KsRewardVideoAd.RewardAdInteractionListener A = a.A(KSRewardVideoActivityProxy.this.getUniqueId());
            if (A != null) {
                A.onAdClicked();
            }
            ((j) KSRewardVideoActivityProxy.this.mCallerContext).fz = true;
            ((j) KSRewardVideoActivityProxy.this.mCallerContext).fW();
        }

        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void h(boolean z) {
            com.kwad.sdk.a.a.c.xY().yb();
            KSRewardVideoActivityProxy.this.notifyPageDismiss(false);
        }

        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void onRewardVerify() {
            if (!((j) KSRewardVideoActivityProxy.this.mCallerContext).mCheckExposureResult || ((j) KSRewardVideoActivityProxy.this.mCallerContext).pv == 2) {
                return;
            }
            KSRewardVideoActivityProxy.this.notifyRewardVerify();
            KSRewardVideoActivityProxy.this.notifyRewardVerifyStepByStep();
        }

        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void onVideoPlayEnd() {
            KsRewardVideoAd.RewardAdInteractionListener A = a.A(KSRewardVideoActivityProxy.this.getUniqueId());
            if (A != null) {
                A.onVideoPlayEnd();
            }
        }

        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void onVideoPlayError(int i, int i2) {
            KsRewardVideoAd.RewardAdInteractionListener A = a.A(KSRewardVideoActivityProxy.this.getUniqueId());
            if (A != null) {
                A.onVideoPlayError(i, i2);
            }
        }

        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void onVideoPlayStart() {
            KsRewardVideoAd.RewardAdInteractionListener A = a.A(KSRewardVideoActivityProxy.this.getUniqueId());
            if (A != null) {
                A.onVideoPlayStart();
            }
        }

        @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
        public final void onVideoSkipToEnd(long j) {
            try {
                KsRewardVideoAd.RewardAdInteractionListener A = a.A(KSRewardVideoActivityProxy.this.getUniqueId());
                if (A != null) {
                    A.onVideoSkipToEnd(j);
                }
            } catch (Throwable th) {
            }
        }
    };
    private com.kwad.components.ad.reward.e.f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.KSRewardVideoActivityProxy.3
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            KSRewardVideoActivityProxy.this.mIsBackEnable = true;
        }
    };
    private com.kwad.components.ad.reward.e.d mAdRewardStepListener = new com.kwad.components.ad.reward.e.d() { // from class: com.kwad.components.ad.reward.KSRewardVideoActivityProxy.4
        @Override // com.kwad.components.ad.reward.e.d
        public final void fA() {
            KSRewardVideoActivityProxy.this.notifyRewardVerifyStepByStep();
        }
    };
    private com.kwad.components.core.video.l mVideoPlayStateListener = new com.kwad.components.core.video.l() { // from class: com.kwad.components.ad.reward.KSRewardVideoActivityProxy.5
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            KSRewardVideoActivityProxy.this.mPlayTime = j2;
        }
    };

    /* loaded from: classes.dex */
    public static class a {
        private static final HashMap<String, a> oJ = new HashMap<>();
        private KsRewardVideoAd.RewardAdInteractionListener mInteractionListener;
        private KsRewardVideoAd.RewardAdInteractionListener oK;
        private com.kwad.components.core.i.d oL;

        public static KsRewardVideoAd.RewardAdInteractionListener A(String str) {
            a z = z(str);
            if (z != null) {
                return z.oK;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void B(String str) {
            a z = z(str);
            if (z != null) {
                z.oK = z.mInteractionListener;
            }
        }

        public static com.kwad.components.core.i.d C(String str) {
            a z = z(str);
            if (z != null) {
                return z.oL;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void D(String str) {
            a z = z(str);
            if (z != null) {
                z.destroy();
                oJ.put(str, null);
            }
        }

        public static void a(String str, KsRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener, com.kwad.components.core.i.d dVar) {
            a aVar = new a();
            aVar.mInteractionListener = rewardAdInteractionListener;
            aVar.oL = dVar;
            aVar.oK = rewardAdInteractionListener;
            oJ.put(str, aVar);
        }

        private void destroy() {
            this.mInteractionListener = null;
            this.oK = null;
            com.kwad.components.core.i.d dVar = this.oL;
            if (dVar != null) {
                dVar.destroy();
                this.oL = null;
            }
        }

        private static a z(String str) {
            return oJ.get(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.kwad.components.ad.j.a, com.kwad.components.ad.reward.l.a] */
    private void createPlayModuleProxy(j jVar) {
        com.kwad.components.ad.reward.l.d dVar;
        com.kwad.components.ad.reward.l.c cVar;
        if (com.kwad.sdk.core.response.b.a.aV(this.mModel.bC())) {
            ?? aVar = new com.kwad.components.ad.reward.l.a(this.mModel.getAdTemplate());
            dVar = new com.kwad.components.ad.reward.l.d(3, aVar);
            cVar = aVar;
        } else {
            com.kwad.components.ad.reward.l.c cVar2 = new com.kwad.components.ad.reward.l.c(jVar, this.mDetailVideoView);
            dVar = new com.kwad.components.ad.reward.l.d(1, cVar2);
            cVar = cVar2;
        }
        jVar.a(cVar);
        dVar.a(this.mVideoPlayStateListener);
        jVar.oZ = dVar;
    }

    private bi getTimerHelper() {
        if (this.mTimerHelper == null) {
            bi biVar = new bi();
            this.mTimerHelper = biVar;
            biVar.startTiming();
        }
        return this.mTimerHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getUniqueId() {
        return this.listenerKey;
    }

    private void handleNotifyVerify(boolean z) {
        ((j) this.mCallerContext).F(true);
        this.mModel.getAdTemplate().mRewardVerifyCalled = true;
        if (z || ((j) this.mCallerContext).pv == 0) {
            h.fI().r(this.mModel.getAdTemplate());
        }
        com.kwad.sdk.core.report.a.aK(this.mModel.getAdTemplate());
        if (!((j) this.mCallerContext).mAdTemplate.converted) {
            com.kwad.components.ad.reward.c.a.gY().gZ().L(com.kwad.components.ad.reward.c.b.ry);
        }
        final KsRewardVideoAd.RewardAdInteractionListener A = a.A(getUniqueId());
        if (A != null) {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.KSRewardVideoActivityProxy.8
                @Override // java.lang.Runnable
                public final void run() {
                    A.onRewardVerify();
                }
            });
            com.kwad.components.ad.reward.monitor.a.a(this.mModel.getAdTemplate(), 0, -1, true);
        }
        if (!com.kwad.sdk.core.response.b.a.cB(this.mModel.bC()) || ((j) this.mCallerContext).mAdTemplate.converted || ((j) this.mCallerContext).po || ((j) this.mCallerContext).gc()) {
            return;
        }
        j.a(getActivity(), (j) this.mCallerContext);
    }

    private boolean isLaunchTaskCompleted() {
        return ((j) this.mCallerContext).pE != null && ((j) this.mCallerContext).pE.isCompleted();
    }

    public static void launch(Activity activity, AdTemplate adTemplate, KsVideoPlayConfig ksVideoPlayConfig, KsRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener, com.kwad.components.core.i.d dVar, int i) {
        Intent intent;
        com.kwad.sdk.utils.l.cE(adTemplate);
        if (ksVideoPlayConfig.isShowLandscape()) {
            com.kwad.sdk.service.b.a(KSRewardLandScapeVideoActivity.class, KSRewardLandScapeVideoActivityProxy.class);
            intent = new Intent(activity, KSRewardLandScapeVideoActivity.class);
        } else {
            com.kwad.sdk.service.b.a(KsRewardVideoActivity.class, KSRewardVideoActivityProxy.class);
            intent = new Intent(activity, KsRewardVideoActivity.class);
        }
        intent.setFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("key_template_json", adTemplate.toJson().toString());
        intent.putExtra("key_video_play_config", ksVideoPlayConfig);
        intent.putExtra(KEY_REWARD_TYPE, i);
        String uniqueId = adTemplate.getUniqueId();
        a.a(uniqueId, rewardAdInteractionListener, dVar);
        a.B(uniqueId);
        activity.startActivity(intent);
        com.kwad.sdk.a.a.c.xY().bc(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void markOpenNsCompleted() {
        if (((j) this.mCallerContext).pF != null) {
            ((j) this.mCallerContext).pF.markOpenNsCompleted();
        }
    }

    private boolean needHandledOnResume() {
        return ((j) this.mCallerContext).gd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPageDismiss(boolean z) {
        com.kwad.components.ad.reward.model.c cVar;
        if (this.mPageDismissCalled || this.mCallerContext == 0 || (cVar = this.mModel) == null) {
            return;
        }
        this.mPageDismissCalled = true;
        com.kwad.sdk.core.report.a.n(cVar.getAdTemplate(), (int) Math.ceil(((float) this.mPlayTime) / 1000.0f));
        if (z) {
            com.kwad.sdk.core.report.a.a(this.mModel.getAdTemplate(), 1, getTimerHelper().getTime(), ((j) this.mCallerContext).mReportExtData);
        } else {
            com.kwad.sdk.core.report.a.a(this.mModel.getAdTemplate(), 6, getTimerHelper().getTime(), this.mModel.hx());
        }
        KsRewardVideoAd.RewardAdInteractionListener A = a.A(getUniqueId());
        if (A != null) {
            A.onPageDismiss();
        }
    }

    private void notifyRewardStep(final int i, final int i2) {
        com.kwad.components.ad.reward.model.c cVar = this.mModel;
        if (cVar == null || com.kwad.sdk.core.response.b.d.cv(cVar.getAdTemplate()) || ((j) this.mCallerContext).pu.contains(Integer.valueOf(i2))) {
            return;
        }
        ((j) this.mCallerContext).pu.add(Integer.valueOf(i2));
        p.a(i, i2, (j) this.mCallerContext, this.mModel);
        if (a.A(getUniqueId()) == null) {
            return;
        }
        try {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.KSRewardVideoActivityProxy.7
                @Override // java.lang.Runnable
                public final void run() {
                    a.A(KSRewardVideoActivityProxy.this.getUniqueId()).onRewardStepVerify(i, i2);
                }
            });
            com.kwad.components.ad.reward.monitor.a.a(this.mModel.getAdTemplate(), i, i2, false);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyRewardVerify() {
        if (this.mModel == null || !((j) this.mCallerContext).mCheckExposureResult || com.kwad.sdk.core.response.b.d.cv(this.mModel.getAdTemplate()) || ((j) this.mCallerContext).ge()) {
            return;
        }
        boolean z = false;
        if (this.mModel.ht()) {
            if (((j) this.mCallerContext).pE != null && ((j) this.mCallerContext).pE.isCompleted()) {
                z = true;
            }
            if (z) {
                handleNotifyVerify(true);
            }
        } else if (!this.mModel.hu()) {
            handleNotifyVerify(false);
        } else {
            if (((j) this.mCallerContext).pF != null && ((j) this.mCallerContext).pF.isCompleted()) {
                z = true;
            }
            if (z) {
                handleNotifyVerify(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyRewardVerifyStepByStep() {
        if (this.mModel.ht()) {
            notifyRewardStep(2, 0);
            if (isLaunchTaskCompleted()) {
                notifyRewardStep(2, 2);
            }
        } else if (!this.mModel.hu()) {
            if (this.mIsFinishVideoLookStep) {
                return;
            }
            this.mIsFinishVideoLookStep = true;
            notifyRewardStep(0, 0);
        } else {
            boolean z = ((j) this.mCallerContext).pF != null && ((j) this.mCallerContext).pF.isCompleted();
            notifyRewardStep(1, 0);
            if (z) {
                notifyRewardStep(1, 1);
            }
        }
    }

    public static void register() {
        com.kwad.sdk.service.b.a(KsRewardVideoActivity.class, KSRewardVideoActivityProxy.class);
    }

    @Override // com.kwad.components.core.o.c
    public boolean checkIntentData(Intent intent) {
        com.kwad.components.ad.reward.model.c a2 = com.kwad.components.ad.reward.model.c.a(intent);
        this.mModel = a2;
        if (a2 == null) {
            com.kwad.sdk.i.a.af(Var.REWARD_KEY, TTLogUtil.TAG_EVENT_SHOW);
            return false;
        }
        return true;
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void finish() {
        super.finish();
        notifyPageDismiss(false);
    }

    @Override // com.kwad.components.core.o.c
    public int getLayoutId() {
        return R.layout.ksad_activity_reward_video;
    }

    @Override // com.kwad.components.core.o.c
    public String getPageName() {
        return "KSRewardLandScapeVideoActivityProxy";
    }

    @Override // com.kwad.components.offline.api.core.adlive.listener.OnAdLiveResumeInterceptor
    public boolean handledAdLiveOnResume() {
        return needHandledOnResume();
    }

    @Override // com.kwad.components.core.o.c
    public void initData() {
        this.listenerKey = this.mModel.getAdTemplate().getUniqueId();
        this.mPageEnterTime = SystemClock.elapsedRealtime();
        com.kwad.components.ad.reward.monitor.a.a(true, this.mModel.getAdTemplate(), this.mPageEnterTime);
        com.kwad.components.ad.reward.monitor.a.H(true);
        com.kwad.components.core.t.c.qm().a(this);
        c.fv().a(this.mRewardVerifyListener);
    }

    @Override // com.kwad.components.core.o.c
    public void initView() {
        AdBaseFrameLayout adBaseFrameLayout = (AdBaseFrameLayout) findViewById(R.id.ksad_root_container);
        this.mRootContainer = adBaseFrameLayout;
        this.mDetailVideoView = (DetailVideoView) adBaseFrameLayout.findViewById(R.id.ksad_video_player);
        this.mPlayLayout = (FrameLayout) this.mRootContainer.findViewById(R.id.ksad_reward_play_layout);
        boolean z = !ai.IK();
        if ((this.mModel.ht() || this.mModel.hu()) && z) {
            this.mDetailVideoView.setForce(true);
        }
        this.mDetailVideoView.f(true, com.kwad.sdk.core.config.d.zW());
        com.kwad.sdk.i.a.af(Var.REWARD_KEY, TTLogUtil.TAG_EVENT_SHOW);
    }

    @Override // com.kwad.components.ad.reward.j.b
    public boolean interceptPlayCardResume() {
        return needHandledOnResume();
    }

    @Override // com.kwad.components.core.o.c
    public boolean needAdaptionScreen() {
        return true;
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
        BackPressHandleResult gC = this.mRewardPresenter.gC();
        if (gC.equals(BackPressHandleResult.HANDLED)) {
            return;
        }
        if (gC.equals(BackPressHandleResult.HANDLED_CLOSE)) {
            super.onBackPressed();
            notifyPageDismiss(false);
        } else if (this.mIsBackEnable) {
            notifyPageDismiss(false);
            super.onBackPressed();
        }
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_REWARD, "adShowSuccess").report();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.kwad.components.core.l.b
    public j onCreateCallerContext() {
        AdTemplate adTemplate = this.mModel.getAdTemplate();
        AdInfo bC = this.mModel.bC();
        final j jVar = new j(this);
        jVar.mPageEnterTime = this.mPageEnterTime;
        jVar.oY = this.mModel.hw() == 2;
        jVar.mAdOpenInteractionListener = this.mAdOpenInteractionListener;
        jVar.mAdRewardStepListener = this.mAdRewardStepListener;
        jVar.mScreenOrientation = this.mModel.getScreenOrientation();
        jVar.mVideoPlayConfig = this.mModel.hv();
        jVar.mReportExtData = this.mModel.hx();
        jVar.mRootContainer = this.mRootContainer;
        jVar.mAdTemplate = adTemplate;
        jVar.pQ = com.kwad.sdk.core.response.b.b.dB(bC) ? LoadStrategy.FULL_TK : LoadStrategy.MULTI;
        createPlayModuleProxy(jVar);
        jVar.a(this);
        if (com.kwad.sdk.core.response.b.a.ax(bC)) {
            jVar.mApkDownloadHelper = new com.kwad.components.core.e.d.c(adTemplate, this.mModel.hx());
        }
        jVar.pc = new RewardActionBarControl(jVar, this.mContext, adTemplate);
        jVar.b(this.mPlayEndPageListener);
        if (com.kwad.sdk.core.response.b.b.bo(adTemplate)) {
            jVar.pd = new l(jVar, this.mModel.hx(), null);
            jVar.pd.a(new com.kwad.components.ad.reward.c.d() { // from class: com.kwad.components.ad.reward.KSRewardVideoActivityProxy.6
                @Override // com.kwad.components.ad.reward.c.d
                public final void a(com.kwad.components.ad.reward.c.b bVar) {
                    jVar.b(bVar);
                }
            });
        }
        if (com.kwad.sdk.core.response.b.a.ak(bC)) {
            jVar.pe = new com.kwad.components.ad.k.a().ag(true);
        }
        jVar.pn = true;
        if (com.kwad.sdk.core.response.b.a.bv(bC)) {
            jVar.pb = new com.kwad.components.core.playable.a((KsAdWebView) findViewById(R.id.ksad_playable_webview));
        }
        jVar.pI = 0L;
        if (this.mModel.bC() != null) {
            jVar.pI = com.kwad.sdk.core.response.b.a.bv(this.mModel.bC()) ? com.kwad.sdk.core.response.b.a.aj(this.mModel.bC()) : com.kwad.sdk.core.response.b.a.ae(this.mModel.bC());
        }
        jVar.mTimerHelper = getTimerHelper();
        return jVar;
    }

    @Override // com.kwad.components.core.l.b
    public Presenter onCreatePresenter() {
        com.kwad.components.ad.reward.model.c cVar = this.mModel;
        if (cVar == null) {
            return null;
        }
        o oVar = new o(this, this.mRootContainer, cVar, (j) this.mCallerContext);
        this.mRewardPresenter = oVar;
        oVar.a(this);
        return this.mRewardPresenter;
    }

    @Override // com.kwad.components.core.l.b, com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
        c.fv().b(this.mRewardVerifyListener);
        super.onDestroy();
        notifyPageDismiss(false);
        if (this.mCallerContext != 0) {
            ((j) this.mCallerContext).oZ.b(this.mVideoPlayStateListener);
            if (((j) this.mCallerContext).oZ.jT()) {
                ((j) this.mCallerContext).oZ.jU().removeInterceptor(this);
            }
            a.D(getUniqueId());
        }
        com.kwad.components.ad.reward.model.c cVar = this.mModel;
        if (cVar != null) {
            String F = com.kwad.sdk.core.response.b.a.F(cVar.bC());
            if (!TextUtils.isEmpty(F)) {
                com.kwad.sdk.core.videocache.c.a.bl(this.mContext.getApplicationContext()).dQ(F);
            }
        }
        com.kwad.components.core.t.c.qm().b(this);
        this.listenerKey = null;
    }

    @Override // com.kwad.components.core.t.c.b
    public void onPageClose() {
        finish();
    }

    @Override // com.kwad.components.core.l.b, com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
        super.onPause();
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

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onPreDestroy() {
        super.onPreDestroy();
        com.kwad.components.core.webview.b.d.b.si().sj();
    }

    @Override // com.kwad.components.core.l.b, com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
        super.onResume();
        com.kwad.components.ad.reward.model.c cVar = this.mModel;
        if (cVar != null) {
            AdTemplate adTemplate = cVar.getAdTemplate();
            com.kwad.sdk.core.d.a.AV();
            com.kwad.sdk.core.d.a.au(adTemplate);
        }
        com.kwad.components.ad.reward.c.a.gY().O(this.mContext);
    }

    @Override // com.kwad.components.ad.reward.o.a
    public void onUnbind() {
        this.mIsBackEnable = false;
        ((j) this.mCallerContext).F(false);
        ((j) this.mCallerContext).ps = false;
    }
}
