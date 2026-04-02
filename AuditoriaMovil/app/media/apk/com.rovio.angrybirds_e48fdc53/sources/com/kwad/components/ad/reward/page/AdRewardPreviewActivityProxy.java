package com.kwad.components.ad.reward.page;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.kwad.components.ad.reward.k;
import com.kwad.components.ad.reward.model.RewardCallBackRespInfo;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.o.c;
import com.kwad.components.core.request.d;
import com.kwad.components.core.t.b;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsRewardVideoAd;
import com.kwad.sdk.api.core.KsAdSdkDynamicImpl;
import com.kwad.sdk.api.proxy.app.AdWebViewActivity;
import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.network.g;
import com.kwad.sdk.core.network.m;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.b.a;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.bi;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.sdk.ksdk.util.Var;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import org.json.JSONObject;
@KsAdSdkDynamicImpl(AdWebViewActivity.class)
/* loaded from: classes.dex */
public class AdRewardPreviewActivityProxy extends c {
    public static final String KEY_TEMPLATE = "key_template_json";
    private static final String KEY_URL = "key_langingpage_url";
    private static final String TAG = "AdRewardPreviewActivityProxy";
    public static KsRewardVideoAd.RewardAdInteractionListener mInteractionListener;
    private AdTemplate mAdTemplate;
    private KsAdWebView mAdWebView;
    public k mCloseDialog;
    private int mCount;
    private View mCountDownLayout;
    private TextView mCountDownTips;
    private long mLastDown;
    protected KsLogoView mLogoView;
    private int mSkipCount;
    private View mSkipCountDownBtn;
    private View mSkipCountDownDiv;
    private long mStartPlayTime;
    private bi mTimerHelper;
    private String mUrl;
    private ImageView mWebCloseBtn;
    private AdBaseFrameLayout mWebContainer;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean mEnableSkip = false;
    private boolean counterPaused = false;
    private boolean mCheckExposureResult = true;

    static /* synthetic */ int access$410(AdRewardPreviewActivityProxy adRewardPreviewActivityProxy) {
        int i = adRewardPreviewActivityProxy.mCount;
        adRewardPreviewActivityProxy.mCount = i - 1;
        return i;
    }

    static /* synthetic */ int access$710(AdRewardPreviewActivityProxy adRewardPreviewActivityProxy) {
        int i = adRewardPreviewActivityProxy.mSkipCount;
        adRewardPreviewActivityProxy.mSkipCount = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRequest(final int i) {
        new m<d, RewardCallBackRespInfo>() { // from class: com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.7
            private static RewardCallBackRespInfo M(String str) {
                JSONObject jSONObject = new JSONObject(str);
                RewardCallBackRespInfo rewardCallBackRespInfo = new RewardCallBackRespInfo();
                rewardCallBackRespInfo.parseJson(jSONObject);
                return rewardCallBackRespInfo;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            /* renamed from: gA */
            public d createRequest() {
                return new d(i, AdRewardPreviewActivityProxy.this.mAdTemplate);
            }

            @Override // com.kwad.sdk.core.network.m
            public final /* synthetic */ RewardCallBackRespInfo parseData(String str) {
                return M(str);
            }
        }.request(exposureRequest());
    }

    private p<d, RewardCallBackRespInfo> exposureRequest() {
        return new p<d, RewardCallBackRespInfo>() { // from class: com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.8
            private void a(RewardCallBackRespInfo rewardCallBackRespInfo) {
                AdRewardPreviewActivityProxy.this.mCheckExposureResult = rewardCallBackRespInfo.result == 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onError(d dVar, int i, String str) {
                super.onError(dVar, i, str);
                AdRewardPreviewActivityProxy.this.mCheckExposureResult = false;
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* bridge */ /* synthetic */ void onStartRequest(g gVar) {
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onSuccess(g gVar, BaseResultData baseResultData) {
                a((RewardCallBackRespInfo) baseResultData);
            }
        };
    }

    private z.b getClientParams() {
        z.b bVar = new z.b();
        bVar.atp = 0;
        return bVar;
    }

    private KsAdWebView.d getWebErrorListener() {
        return new KsAdWebView.d() { // from class: com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.5
            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageFinished() {
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageStart() {
                if (!AdRewardPreviewActivityProxy.this.mAdTemplate.mPvReported) {
                    AdRewardPreviewActivityProxy.this.checkExposure();
                }
                b.ql().a(AdRewardPreviewActivityProxy.this.mAdTemplate, null, null);
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onReceivedHttpError(int i, String str, String str2) {
            }
        };
    }

    public static void launch(Activity activity, AdTemplate adTemplate, String str, KsRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        mInteractionListener = rewardAdInteractionListener;
        com.kwad.sdk.service.b.a(AdWebViewActivity.class, AdRewardPreviewActivityProxy.class);
        Intent intent = new Intent(activity, AdWebViewActivity.class);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("key_template_json", adTemplate.toJson().toString());
        intent.putExtra(KEY_URL, str);
        try {
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            com.kwad.sdk.crash.b.l(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCloseDialog() {
        k kVar = this.mCloseDialog;
        if (kVar == null || !kVar.isShowing()) {
            this.mCloseDialog = k.a(getActivity(), this.mAdTemplate, k.H("还差" + (this.mCount + 1) + "秒就可以获取奖励"), new k.b() { // from class: com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.9
                @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
                public final void G(boolean z) {
                    AdRewardPreviewActivityProxy.this.counterPaused = false;
                    if (AdRewardPreviewActivityProxy.mInteractionListener != null) {
                        try {
                            AdRewardPreviewActivityProxy.mInteractionListener.onVideoSkipToEnd(System.currentTimeMillis() - AdRewardPreviewActivityProxy.this.mStartPlayTime);
                        } catch (Throwable th) {
                            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                        }
                    }
                    AdRewardPreviewActivityProxy.this.finish();
                }

                @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
                public final void gi() {
                    AdRewardPreviewActivityProxy.this.counterPaused = true;
                }

                @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
                public final void gr() {
                    AdRewardPreviewActivityProxy.this.counterPaused = false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void skipToEnd() {
        this.mCountDownLayout.setVisibility(8);
        this.mWebCloseBtn.setVisibility(0);
        KsRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = mInteractionListener;
        if (rewardAdInteractionListener == null || !this.mCheckExposureResult) {
            return;
        }
        rewardAdInteractionListener.onRewardVerify();
        try {
            mInteractionListener.onRewardStepVerify(0, 0);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    public void checkExposure() {
        long j = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate).adRewardInfo.callBackStrategyInfo.impressionCheckMs;
        if (j <= 0 || a.Y(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)) <= PushUIConfig.dismissTime) {
            return;
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.6
            @Override // java.lang.Runnable
            public final void run() {
                AdRewardPreviewActivityProxy.this.checkRequest(1);
            }
        }, j);
    }

    @Override // com.kwad.components.core.o.c
    public boolean checkIntentData(Intent intent) {
        try {
            String stringExtra = getIntent().getStringExtra("key_template_json");
            AdTemplate adTemplate = new AdTemplate();
            adTemplate.parseJson(new JSONObject(stringExtra));
            this.mAdTemplate = adTemplate;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
        if (this.mAdTemplate == null) {
            com.kwad.sdk.i.a.af(Var.REWARD_KEY, TTLogUtil.TAG_EVENT_SHOW);
            return false;
        }
        return true;
    }

    @Override // com.kwad.components.core.o.c
    public int getLayoutId() {
        return R.layout.ksad_activity_reward_preview;
    }

    @Override // com.kwad.components.core.o.c
    public String getPageName() {
        return TAG;
    }

    public bi getTimerHelper() {
        if (this.mTimerHelper == null) {
            this.mTimerHelper = new bi();
        }
        return this.mTimerHelper;
    }

    @Override // com.kwad.components.core.o.c
    public void initData() {
        this.mUrl = getIntent().getStringExtra(KEY_URL);
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        int i = ck.adStyleInfo.adBrowseInfo.adBrowseDuration;
        int W = a.W(ck);
        this.mCount = i;
        this.mSkipCount = Math.min(W, i);
        this.mStartPlayTime = System.currentTimeMillis();
        KsRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = mInteractionListener;
        if (rewardAdInteractionListener != null) {
            try {
                rewardAdInteractionListener.onVideoPlayStart();
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            }
        }
    }

    @Override // com.kwad.components.core.o.c
    public void initView() {
        KsAdWebView ksAdWebView = (KsAdWebView) findViewById(R.id.ksad_video_webview);
        this.mAdWebView = ksAdWebView;
        this.mAdWebView.setClientConfig(ksAdWebView.getClientConfig().b(getClientParams()).cC(this.mAdTemplate).bk(false).bm(true).b(getWebErrorListener()));
        this.mAdWebView.onActivityCreate();
        this.mWebCloseBtn = (ImageView) findViewById(R.id.ksad_web_close_btn);
        this.mWebContainer = (AdBaseFrameLayout) findViewById(R.id.ksad_landing_page_root);
        KsLogoView ksLogoView = (KsLogoView) findViewById(R.id.ksad_reward_preview_logo);
        this.mLogoView = ksLogoView;
        ksLogoView.ad(this.mAdTemplate);
        this.mWebCloseBtn.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (AdRewardPreviewActivityProxy.mInteractionListener != null) {
                    try {
                        AdRewardPreviewActivityProxy.mInteractionListener.onVideoPlayEnd();
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                    }
                }
                com.kwad.sdk.core.report.a.a(AdRewardPreviewActivityProxy.this.mAdTemplate, 1, AdRewardPreviewActivityProxy.this.getTimerHelper().getTime(), (JSONObject) null);
                AdRewardPreviewActivityProxy.this.finish();
            }
        });
        this.mCountDownLayout = findViewById(R.id.ksad_reward_preview_skip_layout);
        this.mSkipCountDownDiv = findViewById(R.id.ksad_reward_preview_skip_div);
        this.mSkipCountDownBtn = findViewById(R.id.ksad_reward_preview_skip_btn);
        this.mCountDownTips = (TextView) findViewById(R.id.ksad_reward_preview_skip_time);
        if (this.mSkipCount <= 0) {
            this.mSkipCountDownBtn.setVisibility(0);
            this.mSkipCountDownDiv.setVisibility(0);
        } else {
            this.mSkipCountDownBtn.setVisibility(8);
            this.mSkipCountDownDiv.setVisibility(8);
        }
        this.mSkipCountDownBtn.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdRewardPreviewActivityProxy.this.showCloseDialog();
            }
        });
        TextView textView = this.mCountDownTips;
        textView.setText("激励领取视频还有" + this.mCount + "秒");
        this.mHandler.postDelayed(new Runnable() { // from class: com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.3
            @Override // java.lang.Runnable
            public final void run() {
                if (AdRewardPreviewActivityProxy.this.counterPaused) {
                    AdRewardPreviewActivityProxy.this.mHandler.postDelayed(this, 400L);
                    return;
                }
                if (AdRewardPreviewActivityProxy.this.mCount <= 0) {
                    AdRewardPreviewActivityProxy.this.mEnableSkip = true;
                    AdRewardPreviewActivityProxy.this.skipToEnd();
                } else {
                    if (AdRewardPreviewActivityProxy.this.mSkipCount <= 0) {
                        AdRewardPreviewActivityProxy.this.mSkipCountDownBtn.setVisibility(0);
                        AdRewardPreviewActivityProxy.this.mSkipCountDownDiv.setVisibility(0);
                    }
                    TextView textView2 = AdRewardPreviewActivityProxy.this.mCountDownTips;
                    textView2.setText("激励领取视频还有" + AdRewardPreviewActivityProxy.this.mCount + "秒");
                    AdRewardPreviewActivityProxy.this.mHandler.postDelayed(this, 1000L);
                }
                AdRewardPreviewActivityProxy.access$710(AdRewardPreviewActivityProxy.this);
                AdRewardPreviewActivityProxy.access$410(AdRewardPreviewActivityProxy.this);
            }
        }, 1000L);
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        if (this.mUrl != null) {
            com.kwad.components.core.e.d.c cVar = new com.kwad.components.core.e.d.c(this.mAdTemplate);
            if (a.ax(ck) && com.kwad.sdk.core.config.d.zm() && ag.isWifiConnected(getActivity())) {
                cVar.m(new a.C0197a(getActivity()).al(false).am(false).S(this.mAdTemplate).ao(false));
            }
        }
        this.mAdWebView.loadUrl(!TextUtils.isEmpty(this.mUrl) ? this.mUrl : com.kwad.sdk.core.response.b.a.aK(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)));
        getTimerHelper().startTiming();
        this.mWebContainer.a(new View.OnTouchListener() { // from class: com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getX() > AdRewardPreviewActivityProxy.this.mWebCloseBtn.getX() && motionEvent.getX() - AdRewardPreviewActivityProxy.this.mWebCloseBtn.getX() < AdRewardPreviewActivityProxy.this.mWebCloseBtn.getWidth() && motionEvent.getY() > AdRewardPreviewActivityProxy.this.mWebCloseBtn.getY() && motionEvent.getY() - AdRewardPreviewActivityProxy.this.mWebCloseBtn.getY() < AdRewardPreviewActivityProxy.this.mWebCloseBtn.getHeight()) {
                    com.kwad.sdk.core.e.c.d(AdRewardPreviewActivityProxy.TAG, "onClick backIcon");
                    return false;
                }
                if (motionEvent.getAction() == 0) {
                    AdRewardPreviewActivityProxy.this.mLastDown = SystemClock.elapsedRealtime();
                } else if (motionEvent.getAction() == 1) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - AdRewardPreviewActivityProxy.this.mLastDown;
                    if (AdRewardPreviewActivityProxy.this.mLastDown > 0 && elapsedRealtime > 60 && elapsedRealtime < 500) {
                        com.kwad.sdk.core.report.a.a(AdRewardPreviewActivityProxy.this.mAdTemplate, 72, AdRewardPreviewActivityProxy.this.mWebContainer.getTouchCoords());
                        if (AdRewardPreviewActivityProxy.mInteractionListener != null) {
                            AdRewardPreviewActivityProxy.mInteractionListener.onAdClicked();
                        }
                    }
                    AdRewardPreviewActivityProxy.this.mLastDown = 0L;
                }
                return false;
            }
        });
    }

    @Override // com.kwad.components.core.o.c
    public void onActivityCreate() {
        super.onActivityCreate();
        com.kwad.sdk.i.a.af(Var.REWARD_KEY, TTLogUtil.TAG_EVENT_SHOW);
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
        KsAdWebView ksAdWebView = this.mAdWebView;
        if (ksAdWebView != null && ksAdWebView.canGoBack()) {
            this.mAdWebView.goBack();
            com.kwad.sdk.core.report.a.aF(this.mAdTemplate);
        } else if (!this.mEnableSkip) {
            showCloseDialog();
        } else {
            super.onBackPressed();
            KsRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = mInteractionListener;
            if (rewardAdInteractionListener != null) {
                try {
                    rewardAdInteractionListener.onVideoPlayEnd();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
            com.kwad.sdk.core.report.a.a(this.mAdTemplate, 11, getTimerHelper().getTime(), (JSONObject) null);
        }
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_REWARD, "adShowSuccess").report();
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
        KsRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = mInteractionListener;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onPageDismiss();
        }
        mInteractionListener = null;
        KsAdWebView ksAdWebView = this.mAdWebView;
        if (ksAdWebView != null) {
            ksAdWebView.onActivityDestroy();
            this.mAdWebView = null;
        }
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        getTimerHelper().Ka();
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
        super.onResume();
        getTimerHelper().JZ();
    }
}
