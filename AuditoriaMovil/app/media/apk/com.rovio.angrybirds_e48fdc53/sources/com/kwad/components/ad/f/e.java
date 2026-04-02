package com.kwad.components.ad.f;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.kwad.components.ad.f.d;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.components.core.j.a;
import com.kwad.components.core.liveEnd.AdLiveEndCommonResultData;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener;
import com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener;
import com.kwad.components.core.webview.jshandler.aa;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.ai;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.aq;
import com.kwad.components.core.webview.jshandler.as;
import com.kwad.components.core.webview.jshandler.at;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.u;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.components.offline.api.core.adlive.IAdLiveEndRequest;
import com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView;
import com.kwad.components.offline.api.core.adlive.IAdLivePlayModule;
import com.kwad.components.offline.api.core.adlive.listener.AdLiveMessageListener;
import com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener;
import com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter;
import com.kwad.components.offline.api.core.adlive.listener.AdLiveShopListener;
import com.kwad.components.offline.api.core.adlive.model.AdLiveMessageInfo;
import com.kwad.components.offline.api.core.adlive.model.AdLiveShopInfo;
import com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat;
import com.kwad.sdk.core.imageloader.core.decode.DecodedResult;
import com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener;
import com.kwad.sdk.core.imageloader.utils.BlurUtils;
import com.kwad.sdk.core.network.m;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBasePvFrameLayout;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.m.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.widget.KSRelativeLayout;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e extends KSRelativeLayout implements com.kwad.sdk.core.h.c {
    private com.kwad.components.core.widget.a.b bG;
    private com.kwad.components.core.webview.a cD;
    private com.kwad.sdk.core.webview.b cE;
    private int cF;
    private ak.b cK;
    private List<Integer> cr;
    private boolean eA;
    private IAdLiveOfflineView eD;
    private com.kwad.components.core.n.a.a.a eE;
    public IAdLivePlayModule eF;
    private a.b eI;
    private final AdLivePlayStateListener eJ;
    private OfflineOnAudioConflictListener eK;
    private KSRelativeLayout ev;
    private IAdLiveEndRequest fJ;
    private at fm;
    private ap fn;
    private WebCardRegisterLiveMessageListener fo;
    private WebCardRegisterLiveShopListener fp;
    private aq.b ft;
    private aq.a fu;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private KsAdWebView mAdWebView;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private Context mContext;
    private KsNativeAd.VideoPlayListener mD;
    private int mF;
    private int mG;
    private d.a mI;
    private boolean mIsAudioEnable;
    private final m<com.kwad.components.core.liveEnd.a, AdLiveEndCommonResultData> mNetworking;
    private ImageView mS;
    private RelativeLayout mT;
    private AdBasePvFrameLayout mU;
    private KSAdVideoPlayConfigImpl mV;

    public e(Context context) {
        super(context);
        this.mF = 0;
        this.mG = 0;
        this.cK = new ak.b() { // from class: com.kwad.components.ad.f.e.10
            @Override // com.kwad.components.core.webview.jshandler.ak.b
            public final void a(ak.a aVar) {
                KsAdWebView ksAdWebView;
                int i;
                e.this.cF = aVar.status;
                if (e.this.cF != 1) {
                    ksAdWebView = e.this.mAdWebView;
                    i = 8;
                } else {
                    ksAdWebView = e.this.mAdWebView;
                    i = 0;
                }
                ksAdWebView.setVisibility(i);
            }
        };
        this.mNetworking = new m<com.kwad.components.core.liveEnd.a, AdLiveEndCommonResultData>() { // from class: com.kwad.components.ad.f.e.12
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            /* renamed from: bB */
            public com.kwad.components.core.liveEnd.a createRequest() {
                return new com.kwad.components.core.liveEnd.a(e.this.fJ);
            }

            private static AdLiveEndCommonResultData p(String str) {
                AdLiveEndCommonResultData adLiveEndCommonResultData = new AdLiveEndCommonResultData();
                adLiveEndCommonResultData.parseJson(new JSONObject(str));
                return adLiveEndCommonResultData;
            }

            @Override // com.kwad.sdk.core.network.m
            public final boolean isPostByJson() {
                return false;
            }

            @Override // com.kwad.sdk.core.network.m
            public final /* synthetic */ AdLiveEndCommonResultData parseData(String str) {
                return p(str);
            }
        };
        this.eJ = new AdLivePlayStateListenerAdapter() { // from class: com.kwad.components.ad.f.e.2
            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayCompleted() {
                super.onLivePlayCompleted();
                if (e.this.mD != null) {
                    e.this.mD.onVideoPlayComplete();
                }
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayEnd() {
                super.onLivePlayEnd();
                if (e.this.mD != null) {
                    e.this.mD.onVideoPlayComplete();
                }
                String aY = com.kwad.sdk.core.response.b.a.aY(e.this.mAdInfo);
                if (TextUtils.isEmpty(aY)) {
                    return;
                }
                com.kwad.components.core.n.a.a.a aVar = (com.kwad.components.core.n.a.a.a) com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.a.a.class);
                if (aVar != null) {
                    e.this.fJ = aVar.getAdLiveEndRequest(aY);
                }
                e.this.mNetworking.request(new p<com.kwad.components.core.liveEnd.a, AdLiveEndCommonResultData>() { // from class: com.kwad.components.ad.f.e.2.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
                    /* renamed from: a */
                    public void onStartRequest(com.kwad.components.core.liveEnd.a aVar2) {
                        super.onStartRequest(aVar2);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
                    /* renamed from: a */
                    public void onError(com.kwad.components.core.liveEnd.a aVar2, int i, String str) {
                        super.onError(aVar2, i, str);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
                    /* renamed from: a */
                    public void onSuccess(com.kwad.components.core.liveEnd.a aVar2, AdLiveEndCommonResultData adLiveEndCommonResultData) {
                        super.onSuccess(aVar2, adLiveEndCommonResultData);
                        aq.a aVar3 = new aq.a();
                        aVar3.status = 9;
                        aVar3.totalWatchingDuration = adLiveEndCommonResultData.totalWatchingDuration;
                        aVar3.watchingUserCount = adLiveEndCommonResultData.watchingUserCount;
                        aVar3.displayWatchingUserCount = adLiveEndCommonResultData.displayWatchingUserCount;
                        aVar3.likeUserCount = adLiveEndCommonResultData.likeUserCount;
                        aVar3.displayLikeUserCount = adLiveEndCommonResultData.displayLikeUserCount;
                        aVar3.liveDuration = adLiveEndCommonResultData.liveDuration;
                        if (e.this.ft != null) {
                            e.this.ft.a(aVar3);
                        } else {
                            e.this.fu = aVar3;
                        }
                    }
                });
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayPause() {
                super.onLivePlayPause();
                if (e.this.mD != null) {
                    e.this.mD.onVideoPlayPause();
                }
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayProgress(long j) {
                super.onLivePlayProgress(j);
                e.this.c(j);
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayResume() {
                super.onLivePlayResume();
                com.kwad.components.core.j.a.oe().a(e.this.getCurrentVoiceItem());
                IAdLivePlayModule iAdLivePlayModule = e.this.eF;
                e eVar = e.this;
                iAdLivePlayModule.setAudioEnabled(eVar.g(eVar.mIsAudioEnable), false);
                if (e.this.mD != null) {
                    e.this.mD.onVideoPlayResume();
                }
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayStart() {
                super.onLivePlayStart();
                com.kwad.components.core.j.a.oe().a(e.this.getCurrentVoiceItem());
                IAdLivePlayModule iAdLivePlayModule = e.this.eF;
                e eVar = e.this;
                iAdLivePlayModule.setAudioEnabled(eVar.g(eVar.mIsAudioEnable), false);
                if (e.this.mD != null) {
                    e.this.mD.onVideoPlayStart();
                }
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePrepared() {
                super.onLivePrepared();
                com.kwad.components.core.j.a.oe().a(e.this.getCurrentVoiceItem());
                if (e.this.mD != null) {
                    e.this.mD.onVideoPlayReady();
                }
                if (e.this.eF != null) {
                    e.this.eF.setAudioEnabled(false, false);
                }
            }
        };
        this.eK = new OfflineOnAudioConflictListener() { // from class: com.kwad.components.ad.f.e.3
            @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
            public final void onAudioBeOccupied() {
                if (e.this.eF != null) {
                    e.this.eF.setAudioEnabled(false, false);
                }
            }

            @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
            public final void onAudioBeReleased() {
            }
        };
        initView();
    }

    private void a(com.kwad.components.core.webview.a aVar) {
        this.fm = new at();
        ap apVar = new ap();
        this.fn = apVar;
        aVar.a(apVar);
        aVar.a(new u(this.cE, this.mApkDownloadHelper, getClickListener()));
        aVar.a(new r(this.cE, this.mApkDownloadHelper, getClickListener()));
        aVar.a(new com.kwad.components.core.webview.b.a.f());
        aVar.a(new x(this.cE));
        aVar.a(new aa(this.cE));
        aVar.a(new w(this.cE));
        aVar.a(new ak(this.cK, com.kwad.sdk.core.response.b.b.bu(this.mAdTemplate)));
        aVar.a(new as(this.cE, this.mApkDownloadHelper));
        aVar.a(new ae(this.cE));
        aVar.a(this.fm);
        aVar.a(new ai(getOpenNewPageListener()));
        aVar.a(new com.kwad.components.core.webview.jshandler.d(this.mF, this.mG));
        this.fp = new WebCardRegisterLiveShopListener();
        this.fo = new WebCardRegisterLiveMessageListener();
        aVar.a(this.fp);
        aVar.a(this.fo);
        aVar.a(new aq(getRegisterLiveListener()));
    }

    private void av() {
        com.kwad.sdk.core.webview.b bVar = new com.kwad.sdk.core.webview.b();
        this.cE = bVar;
        bVar.setAdTemplate(this.mAdTemplate);
        this.cE.mScreenOrientation = 0;
        this.cE.aym = null;
        this.cE.MZ = this.mU;
        this.cE.My = this.mAdWebView;
        this.cE.mReportExtData = null;
        this.cE.ayo = false;
    }

    private void aw() {
        if (com.kwad.sdk.core.response.b.b.bB(this.mAdTemplate)) {
            eN();
        }
    }

    private void ay() {
        com.kwad.components.core.webview.a aVar = this.cD;
        if (aVar != null) {
            aVar.destroy();
            this.cD = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IAdLivePlayModule bg() {
        bh();
        IAdLiveOfflineView view = this.eE.getView(this.mContext, 3);
        this.eD = view;
        IAdLivePlayModule adLivePlayModule = this.eE.getAdLivePlayModule(view, ServiceProvider.HB().appId, String.valueOf(com.kwad.sdk.core.response.b.a.bR(this.mAdInfo)));
        adLivePlayModule.setAudioEnabled(g(this.mIsAudioEnable), false);
        adLivePlayModule.registerAdLivePlayStateListener(this.eJ);
        final View view2 = this.eD.getView();
        this.mT.removeAllViews();
        this.mT.addView(view2);
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.f.e.1
            @Override // java.lang.Runnable
            public final void run() {
                e.this.c(view2);
            }
        });
        bw();
        if (this.mIsAudioEnable) {
            com.kwad.components.core.t.a.ak(this.mContext).a(this.eK);
        }
        return adLivePlayModule;
    }

    private void bh() {
        ImageView imageView;
        int i;
        String url = com.kwad.sdk.core.response.b.a.bi(this.mAdInfo).getUrl();
        if (TextUtils.isEmpty(url)) {
            imageView = this.mS;
            i = 8;
        } else {
            this.mS.setImageDrawable(null);
            KSImageLoader.loadImage(this.mS, url, this.mAdTemplate, new DisplayImageOptionsCompat.Builder().setBlurRadius(50).build(), new SimpleImageLoadingListener() { // from class: com.kwad.components.ad.f.e.5
                @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
                public final boolean onDecode(String str, InputStream inputStream, DecodedResult decodedResult) {
                    decodedResult.mBitmap = BlurUtils.stackBlur(BitmapFactory.decodeStream(inputStream), 50, false);
                    return true;
                }
            });
            imageView = this.mS;
            i = 0;
        }
        imageView.setVisibility(i);
    }

    private boolean bv() {
        return this.cF == 1;
    }

    private void bw() {
        this.eD.registerLiveMessageListener(new AdLiveMessageListener() { // from class: com.kwad.components.ad.f.e.6
            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLiveMessageListener
            public final void handleAdLiveMessage(List<AdLiveMessageInfo> list) {
                if (e.this.fo != null) {
                    e.this.fo.k(list);
                }
            }
        });
        this.eD.registerLiveShopListener(new AdLiveShopListener() { // from class: com.kwad.components.ad.f.e.7
            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLiveShopListener
            public final void handleAdLiveShop(AdLiveShopInfo adLiveShopInfo) {
                if (e.this.fp != null) {
                    e.this.fp.a(adLiveShopInfo);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        int ceil = (int) Math.ceil(((float) j) / 1000.0f);
        List<Integer> list = this.cr;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<Integer> it = this.cr.iterator();
        while (it.hasNext()) {
            if (ceil >= it.next().intValue()) {
                com.kwad.sdk.core.report.a.a(this.mAdTemplate, ceil, (JSONObject) null);
                it.remove();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        int width = this.ev.getWidth();
        int height = this.ev.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (height * 0.5625f), height);
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    private void eI() {
        try {
            this.mF = this.mAdTemplate.mAdScene.nativeAdExtraData.showLiveStatus;
            this.mG = this.mAdTemplate.mAdScene.nativeAdExtraData.showLiveStyle;
        } catch (Throwable th) {
        }
    }

    private void eM() {
        this.mAdWebView.setVisibility(8);
        av();
        if (bv()) {
            this.mAdWebView.reload();
        } else {
            aw();
        }
    }

    private void eN() {
        ay();
        this.mAdWebView.setClientConfig(this.mAdWebView.getClientConfig().cC(this.mAdTemplate));
        com.kwad.components.core.webview.a aVar = new com.kwad.components.core.webview.a(this.mAdWebView);
        this.cD = aVar;
        a(aVar);
        this.mAdWebView.addJavascriptInterface(this.cD, "KwaiAd");
        this.mAdWebView.loadUrl(com.kwad.sdk.core.response.b.b.bv(this.mAdTemplate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(boolean z) {
        if (z) {
            if (this.eI != null) {
                com.kwad.components.core.j.a.oe();
                if (!com.kwad.components.core.j.a.b(this.eI)) {
                    return false;
                }
            }
            if (!com.kwad.sdk.core.config.d.gH()) {
                return !com.kwad.components.core.t.a.ak(this.mContext).qk() ? com.kwad.components.core.t.a.ak(this.mContext).aI(false) : !com.kwad.components.core.t.a.ak(this.mContext).qj();
            }
            if (!this.eA) {
                this.eA = com.kwad.components.core.t.a.ak(this.mContext).aI(true);
            }
            return this.eA;
        }
        return false;
    }

    private com.kwad.sdk.core.webview.d.a.a getClickListener() {
        return new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.f.e.11
            @Override // com.kwad.sdk.core.webview.d.a.a
            public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
                int i = aVar.Vc;
                if (aVar.JJ) {
                    i = aVar.Va ? 1 : 2;
                }
                boolean aU = com.kwad.sdk.core.response.b.a.aU(e.this.mAdInfo);
                z.b bVar = new z.b();
                if (aVar.Vd != null && !TextUtils.isEmpty(aVar.Vd.US)) {
                    bVar.US = aVar.Vd.US;
                }
                com.kwad.components.core.e.d.a.a(new a.C0197a(e.this.getContext()).S(e.this.mAdTemplate).b(e.this.mApkDownloadHelper).al(false).ao(i).ar(aVar.JJ).ap(aU).s(e.this.eF == null ? 0L : e.this.eF.getPlayDuration()).a(bVar).an(true).a(new a.b() { // from class: com.kwad.components.ad.f.e.11.1
                    @Override // com.kwad.components.core.e.d.a.b
                    public final void onAdClicked() {
                        if (e.this.mI != null) {
                            e.this.mI.l(e.this.mAdWebView);
                        }
                    }
                }));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a.b getCurrentVoiceItem() {
        if (this.eI == null) {
            this.eI = new a.b(new a.c() { // from class: com.kwad.components.ad.f.e.4
                @Override // com.kwad.components.core.j.a.c
                public final void bi() {
                    if (e.this.eF == null) {
                        e eVar = e.this;
                        eVar.eF = eVar.bg();
                    }
                    IAdLivePlayModule iAdLivePlayModule = e.this.eF;
                    e eVar2 = e.this;
                    iAdLivePlayModule.setAudioEnabled(eVar2.g(eVar2.mIsAudioEnable), false);
                }
            });
        }
        return this.eI;
    }

    private ai.a getOpenNewPageListener() {
        return new ai.a() { // from class: com.kwad.components.ad.f.e.9
            @Override // com.kwad.components.core.webview.jshandler.ai.a
            public final void a(com.kwad.components.core.webview.a.b bVar) {
                AdWebViewActivityProxy.launch(e.this.mContext, new AdWebViewActivityProxy.a.C0206a().as(bVar.title).at(bVar.url).V(e.this.mAdTemplate).oE());
            }
        };
    }

    private aq.c getRegisterLiveListener() {
        return new aq.c() { // from class: com.kwad.components.ad.f.e.8
            @Override // com.kwad.components.core.webview.jshandler.aq.c
            public final void a(aq.b bVar) {
                e.this.ft = bVar;
                if (e.this.fu != null) {
                    e.this.ft.a(e.this.fu);
                    e.this.fu = null;
                }
            }
        };
    }

    private void initView() {
        l.inflate(getContext(), R.layout.ksad_native_live_layout, this);
        AdBasePvFrameLayout adBasePvFrameLayout = (AdBasePvFrameLayout) findViewById(R.id.ksad_root_container);
        this.mU = adBasePvFrameLayout;
        this.mS = (ImageView) adBasePvFrameLayout.findViewById(R.id.ksad_live_bg_img);
        this.ev = (KSRelativeLayout) this.mU.findViewById(R.id.ksad_live_container);
        this.mT = (RelativeLayout) this.mU.findViewById(R.id.ksad_live_video_container);
        KsAdWebView ksAdWebView = (KsAdWebView) this.mU.findViewById(R.id.ksad_web_card_webView);
        this.mAdWebView = ksAdWebView;
        ksAdWebView.setBackgroundColor(0);
        this.eE = (com.kwad.components.core.n.a.a.a) com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.a.a.class);
    }

    public final void a(Context context, AdTemplate adTemplate, com.kwad.components.core.e.d.c cVar, KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl) {
        this.mAdTemplate = adTemplate;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.mAdInfo = ck;
        this.mContext = context;
        this.mV = kSAdVideoPlayConfigImpl;
        this.mApkDownloadHelper = cVar;
        this.cr = com.kwad.sdk.core.response.b.a.bd(ck);
        this.bG = new com.kwad.components.core.widget.a.b(getParent() == null ? this : (View) getParent(), 30);
        this.mIsAudioEnable = this.mV.getVideoSoundValue() != 0 ? this.mV.isVideoSoundEnable() : com.kwad.sdk.core.response.b.a.bH(this.mAdInfo);
        eI();
        eM();
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aK() {
        com.kwad.components.core.j.a.oe().a(getCurrentVoiceItem());
        IAdLivePlayModule iAdLivePlayModule = this.eF;
        if (iAdLivePlayModule == null) {
            this.eF = bg();
        } else {
            iAdLivePlayModule.onResume();
        }
    }

    @Override // com.kwad.sdk.core.h.c
    public final void aL() {
        IAdLivePlayModule iAdLivePlayModule = this.eF;
        if (iAdLivePlayModule != null) {
            iAdLivePlayModule.onPause();
        }
        com.kwad.components.core.j.a.oe().c(this.eI);
    }

    @Override // com.kwad.sdk.widget.KSRelativeLayout
    public final void aa() {
        super.aa();
        this.bG.sB();
        this.bG.a(this);
    }

    @Override // com.kwad.sdk.widget.KSRelativeLayout
    public final void ab() {
        super.ab();
        this.bG.sB();
        this.bG.b(this);
        IAdLivePlayModule iAdLivePlayModule = this.eF;
        if (iAdLivePlayModule != null) {
            iAdLivePlayModule.onDestroy();
            this.eF = null;
        }
        com.kwad.components.core.j.a.oe().c(this.eI);
        this.fu = null;
        this.ft = null;
        IAdLiveOfflineView iAdLiveOfflineView = this.eD;
        if (iAdLiveOfflineView != null) {
            iAdLiveOfflineView.onDestroy();
            this.eD = null;
        }
    }

    public final void setInnerAdInteractionListener(d.a aVar) {
        this.mI = aVar;
    }

    public final void setVideoPlayListener(KsNativeAd.VideoPlayListener videoPlayListener) {
        this.mD = videoPlayListener;
    }
}
