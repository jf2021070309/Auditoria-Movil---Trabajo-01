package com.kwad.components.core.page;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.page.b.e;
import com.kwad.components.core.page.b.f;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.core.video.k;
import com.kwad.components.core.video.l;
import com.kwad.components.core.widget.ComplianceTextView;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.api.core.KsAdSdkDynamicImpl;
import com.kwad.sdk.api.proxy.app.AdWebViewActivity;
import com.kwad.sdk.api.proxy.app.KsFullScreenLandScapeVideoActivity;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat;
import com.kwad.sdk.core.imageloader.core.decode.DecodedResult;
import com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener;
import com.kwad.sdk.core.imageloader.utils.BlurUtils;
import com.kwad.sdk.core.page.widget.RoundAngleImageView;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.widget.DownloadProgressBar;
import com.kwad.sdk.widget.KSLinearLayout;
import com.kwad.sdk.widget.KSRelativeLayout;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.io.InputStream;
import org.json.JSONObject;
@KsAdSdkDynamicImpl(AdWebViewActivity.class)
/* loaded from: classes.dex */
public class DownloadLandPageActivity extends com.kwad.components.core.l.b<com.kwad.components.core.page.b.d> {
    public static final String KEY_NEED_CLOSE_REWARD = "key_close_reward";
    public static final String KEY_TEMPLATE = "key_template_json";
    private static final String TAG = "DownloadLandPageActivity";
    public static boolean showingAdWebViewLandPage = false;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private ImageView mBackIcon;
    private ImageView mCloseIcon;
    private DetailVideoView mDetailVideoView;
    private boolean mIsRewardLandPage;
    private KSRelativeLayout mKsadVideoContainer;
    private com.kwad.components.core.page.c.a mPlayModule;
    private ImageView mVideoBlurBg;
    private ImageView mVideoCover;
    private k mVideoPlayStateListener;

    private void buildView(ComplianceTextView complianceTextView, KSLinearLayout kSLinearLayout, KsLogoView ksLogoView) {
        if (com.kwad.sdk.core.response.b.a.aU(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))) {
            return;
        }
        ((FrameLayout.LayoutParams) complianceTextView.getLayoutParams()).gravity = 80;
        if (!ai.IK()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ksLogoView.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 0, com.kwad.sdk.d.a.a.a(this.mContext, 100.0f));
            ksLogoView.setLayoutParams(marginLayoutParams);
        }
        ksLogoView.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kSLinearLayout.getLayoutParams();
        layoutParams.gravity = 17;
        kSLinearLayout.setLayoutParams(layoutParams);
    }

    private k getVideoPlayStateListener() {
        l lVar = new l() { // from class: com.kwad.components.core.page.DownloadLandPageActivity.6
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayCompleted() {
                DownloadLandPageActivity.this.mVideoCover.setVisibility(0);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayError(int i, int i2) {
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayStart() {
                DownloadLandPageActivity.this.mVideoCover.setVisibility(8);
            }
        };
        this.mVideoPlayStateListener = lVar;
        return lVar;
    }

    private f.a getWebViewStateListener() {
        return new f.a() { // from class: com.kwad.components.core.page.DownloadLandPageActivity.3
            @Override // com.kwad.components.core.page.b.f.a
            public final void ax(int i) {
                if (i != 1) {
                    DownloadLandPageActivity.this.initNativeLandPage();
                }
            }
        };
    }

    private void handleCloseBtn() {
        long ae = com.kwad.sdk.core.response.b.a.ae(this.mAdInfo);
        if (ae == 0) {
            this.mCloseIcon.setVisibility(0);
        } else {
            this.mCloseIcon.postDelayed(new Runnable() { // from class: com.kwad.components.core.page.DownloadLandPageActivity.7
                @Override // java.lang.Runnable
                public final void run() {
                    if (DownloadLandPageActivity.this.getActivity() == null || DownloadLandPageActivity.this.getActivity().isFinishing()) {
                        return;
                    }
                    DownloadLandPageActivity.this.mCloseIcon.setVisibility(0);
                    DownloadLandPageActivity.this.mCloseIcon.setAlpha(0.0f);
                    DownloadLandPageActivity.this.mCloseIcon.animate().alpha(1.0f).setDuration(500L).start();
                }
            }, ae);
        }
        this.mCloseIcon.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.DownloadLandPageActivity.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.kwad.components.core.t.c.qm().qn();
                DownloadLandPageActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initNativeLandPage() {
        findViewById(R.id.ksad_ad_land_page_native).setVisibility(0);
        ComplianceTextView complianceTextView = (ComplianceTextView) findViewById(R.id.ksad_compliance_view);
        complianceTextView.setVisibility(0);
        complianceTextView.setAdTemplate(this.mAdTemplate);
        RoundAngleImageView roundAngleImageView = (RoundAngleImageView) findViewById(R.id.ksad_ad_cover);
        KSLinearLayout kSLinearLayout = (KSLinearLayout) findViewById(R.id.ksad_info_container);
        KsLogoView ksLogoView = (KsLogoView) findViewById(R.id.ksad_land_page_logo);
        DownloadProgressBar downloadProgressBar = (DownloadProgressBar) findViewById(R.id.ksad_web_download_progress);
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        setAdTitle((TextView) findViewById(R.id.ksad_ad_title), ck);
        ((TextView) findViewById(R.id.ksad_ad_info)).setText(ck.adBaseInfo.adDescription);
        roundAngleImageView.setRadius(32.0f);
        if (!TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.bQ(ck))) {
            KSImageLoader.loadImage(roundAngleImageView, com.kwad.sdk.core.response.b.a.bQ(ck), this.mAdTemplate);
        }
        setAdkDownload(downloadProgressBar, ck);
        buildView(complianceTextView, kSLinearLayout, ksLogoView);
    }

    public static void launch(Context context, AdTemplate adTemplate, boolean z) {
        Class cls = ai.IK() ? AdWebViewActivity.class : KsFullScreenLandScapeVideoActivity.class;
        com.kwad.sdk.service.b.a(cls, DownloadLandPageActivity.class);
        Intent intent = new Intent(context, cls);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("key_template_json", adTemplate.toJson().toString());
        intent.putExtra(KEY_NEED_CLOSE_REWARD, z);
        context.startActivity(intent);
    }

    private void loadBlurImage(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        imageView.setVisibility(0);
        KSImageLoader.loadImage(imageView, str, this.mAdTemplate, new DisplayImageOptionsCompat.Builder().setBlurRadius(50).build(), new SimpleImageLoadingListener() { // from class: com.kwad.components.core.page.DownloadLandPageActivity.2
            @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
            public final boolean onDecode(String str2, InputStream inputStream, DecodedResult decodedResult) {
                decodedResult.mBitmap = BlurUtils.stackBlur(BitmapFactory.decodeStream(inputStream), 50, false);
                return true;
            }
        });
    }

    private void setAdTitle(TextView textView, AdInfo adInfo) {
        if (!TextUtils.isEmpty(adInfo.adBaseInfo.appName)) {
            textView.setText(adInfo.adBaseInfo.appName);
        } else if (TextUtils.isEmpty(adInfo.advertiserInfo.rawUserName)) {
        } else {
            textView.setText(adInfo.advertiserInfo.rawUserName);
        }
    }

    private void setAdkDownload(final DownloadProgressBar downloadProgressBar, final AdInfo adInfo) {
        if (com.kwad.sdk.core.response.b.a.ax(adInfo)) {
            this.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate, new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.core.page.DownloadLandPageActivity.4
                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onDownloadFailed() {
                    downloadProgressBar.setProgress(100.0f);
                    downloadProgressBar.setText(com.kwad.sdk.core.response.b.a.aw(adInfo));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onDownloadFinished() {
                    downloadProgressBar.setProgress(100.0f);
                    downloadProgressBar.setText(com.kwad.sdk.core.response.b.a.aQ(DownloadLandPageActivity.this.mAdTemplate));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onIdle() {
                    downloadProgressBar.setProgress(100.0f);
                    downloadProgressBar.setText(com.kwad.sdk.core.response.b.a.aw(adInfo));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onInstalled() {
                    downloadProgressBar.setProgress(100.0f);
                    downloadProgressBar.setText(com.kwad.sdk.core.response.b.a.U(adInfo));
                }

                @Override // com.kwad.sdk.core.download.a.a
                public final void onPaused(int i) {
                    downloadProgressBar.setProgress(i);
                    downloadProgressBar.setText(com.kwad.sdk.core.response.b.a.cw(i));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onProgressUpdate(int i) {
                    downloadProgressBar.setProgress(i);
                    downloadProgressBar.setText(com.kwad.sdk.core.response.b.a.cv(i));
                }
            });
            downloadProgressBar.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.DownloadLandPageActivity.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.kwad.sdk.core.report.a.q(DownloadLandPageActivity.this.mAdTemplate, 152);
                    DownloadLandPageActivity.this.mApkDownloadHelper.m(new a.C0197a(DownloadLandPageActivity.this.getActivity()).al(true).am(false).S(DownloadLandPageActivity.this.mAdTemplate).ao(false));
                    if (DownloadLandPageActivity.this.mIsRewardLandPage) {
                        com.kwad.sdk.core.report.a.a(DownloadLandPageActivity.this.mAdTemplate, new j(), (JSONObject) null);
                    }
                }
            });
        }
    }

    private void setVideoData() {
        ViewGroup.LayoutParams layoutParams = this.mKsadVideoContainer.getLayoutParams();
        if (ai.IK()) {
            layoutParams.height = (com.kwad.sdk.d.a.a.getScreenWidth(this.mContext) * 9) / 16;
            layoutParams.width = -1;
        } else {
            layoutParams.width = com.kwad.sdk.d.a.a.getScreenWidth(this.mContext) / 2;
            layoutParams.height = -1;
        }
        this.mKsadVideoContainer.setLayoutParams(layoutParams);
        this.mKsadVideoContainer.setVisibility(0);
        KSImageLoader.loadImage(this.mVideoCover, com.kwad.sdk.core.response.b.a.bi(this.mAdInfo).getUrl(), this.mAdTemplate);
    }

    @Override // com.kwad.components.core.o.c
    public boolean checkIntentData(Intent intent) {
        try {
            String stringExtra = getIntent().getStringExtra("key_template_json");
            AdTemplate adTemplate = new AdTemplate();
            if (stringExtra != null) {
                adTemplate.parseJson(new JSONObject(stringExtra));
            }
            this.mAdTemplate = adTemplate;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
        return this.mAdTemplate != null;
    }

    @Override // com.kwad.components.core.o.c
    public int getLayoutId() {
        return ai.IK() ? R.layout.ksad_activity_ad_land_page : R.layout.ksad_activity_land_page_horizontal;
    }

    @Override // com.kwad.components.core.o.c
    public String getPageName() {
        return TAG;
    }

    @Override // com.kwad.components.core.o.c
    public void initData() {
        showingAdWebViewLandPage = true;
        this.mIsRewardLandPage = getIntent().getBooleanExtra(KEY_NEED_CLOSE_REWARD, false);
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
    }

    @Override // com.kwad.components.core.o.c
    public void initView() {
        KSRelativeLayout kSRelativeLayout = (KSRelativeLayout) findViewById(R.id.ksad_root_container);
        this.mKsadVideoContainer = (KSRelativeLayout) findViewById(R.id.ksad_video_container);
        DetailVideoView detailVideoView = (DetailVideoView) kSRelativeLayout.findViewById(R.id.ksad_video_player);
        this.mDetailVideoView = detailVideoView;
        detailVideoView.f(true, com.kwad.sdk.core.config.d.zW());
        this.mVideoBlurBg = (ImageView) kSRelativeLayout.findViewById(R.id.ksad_video_blur_bg);
        this.mBackIcon = (ImageView) kSRelativeLayout.findViewById(R.id.ksad_back_icon);
        this.mCloseIcon = (ImageView) kSRelativeLayout.findViewById(R.id.ksad_right_close);
        this.mVideoCover = (ImageView) kSRelativeLayout.findViewById(R.id.ksad_video_cover);
        if (this.mAdTemplate.adInfoList.size() > 0) {
            loadBlurImage(com.kwad.sdk.core.response.b.a.P(this.mAdTemplate.adInfoList.get(0)), this.mVideoBlurBg);
        }
        this.mBackIcon.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.DownloadLandPageActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.kwad.sdk.core.report.a.q(DownloadLandPageActivity.this.mAdTemplate, 153);
                DownloadLandPageActivity.this.finish();
            }
        });
        if (com.kwad.sdk.core.response.b.a.aU(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))) {
            setVideoData();
        }
        if (this.mIsRewardLandPage) {
            handleCloseBtn();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.core.l.b
    public com.kwad.components.core.page.b.d onCreateCallerContext() {
        com.kwad.components.core.page.b.d dVar = new com.kwad.components.core.page.b.d(this);
        dVar.mAdTemplate = this.mAdTemplate;
        if (com.kwad.sdk.core.response.b.a.aU(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))) {
            com.kwad.components.core.t.a.ak(this.mContext).aI(true);
            com.kwad.components.core.page.c.a aVar = new com.kwad.components.core.page.c.a(this.mAdTemplate, this.mDetailVideoView, new KsVideoPlayConfig.Builder().videoSoundEnable(true).build());
            this.mPlayModule = aVar;
            dVar.mPlayModule = aVar;
            this.mPlayModule.a(getVideoPlayStateListener());
            dVar.Lm.add(this.mPlayModule);
        }
        return dVar;
    }

    @Override // com.kwad.components.core.l.b
    public Presenter onCreatePresenter() {
        Presenter presenter = new Presenter();
        if (com.kwad.sdk.core.response.b.a.aU(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))) {
            presenter.a(new e());
        }
        presenter.a(new f(getWebViewStateListener(), this.mIsRewardLandPage));
        return presenter;
    }

    @Override // com.kwad.components.core.l.b, com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
        super.onDestroy();
        showingAdWebViewLandPage = false;
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.clear();
        }
        com.kwad.components.core.page.c.a aVar = this.mPlayModule;
        if (aVar != null) {
            aVar.release();
        }
    }
}
