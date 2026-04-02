package com.kwad.components.ad.feed.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.facebook.appevents.AppEventsConstants;
import com.kwad.components.ad.feed.d;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.components.core.j.a;
import com.kwad.components.core.liveEnd.AdLiveEndCommonResultData;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.video.a;
import com.kwad.components.core.webview.b;
import com.kwad.components.core.webview.jshandler.WebCardRegisterLiveMessageListener;
import com.kwad.components.core.webview.jshandler.WebCardRegisterLiveShopListener;
import com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler;
import com.kwad.components.core.webview.jshandler.ad;
import com.kwad.components.core.webview.jshandler.ai;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.al;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.aq;
import com.kwad.components.core.webview.jshandler.ar;
import com.kwad.components.core.webview.jshandler.at;
import com.kwad.components.core.webview.jshandler.v;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.components.core.widget.b;
import com.kwad.components.model.FeedType;
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
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.contentalliance.a.a.b;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat;
import com.kwad.sdk.core.imageloader.core.decode.DecodedResult;
import com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener;
import com.kwad.sdk.core.imageloader.utils.BlurUtils;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.FeedSlideConf;
import com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.bm;
import com.kwad.sdk.widget.KSRelativeLayout;
import com.kwad.sdk.widget.RatioFrameLayout;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class m extends com.kwad.components.core.widget.b<AdTemplate> implements View.OnClickListener, com.kwad.sdk.widget.c {
    private static final HashMap<Long, Double> fq = new HashMap<>(8);
    private int cF;
    private List<Integer> cr;
    private KsAdVideoPlayConfig dJ;
    private d.b dS;
    private boolean eA;
    private final a.InterfaceC0212a eC;
    private IAdLiveOfflineView eD;
    private com.kwad.components.core.n.a.a.a eE;
    private IAdLivePlayModule eF;
    private boolean eG;
    private View eH;
    private a.b eI;
    private final AdLivePlayStateListener eJ;
    private OfflineOnAudioConflictListener eK;
    private long eh;
    private KSRelativeLayout ev;
    private ImageView ew;
    private com.kwad.sdk.core.video.videoview.a ex;
    private com.kwad.components.core.video.e ey;
    private d ez;
    private a fA;
    private ViewGroup.MarginLayoutParams fB;
    private e fC;
    private al fD;
    private boolean fE;
    private boolean fF;
    private com.kwad.components.core.webview.b fG;
    private com.kwad.components.core.webview.c fH;
    private b.a fI;
    private IAdLiveEndRequest fJ;
    private RatioFrameLayout fi;
    private double fj;
    private LinearLayout fk;
    private TextView fl;
    private at fm;
    private ap fn;
    private WebCardRegisterLiveMessageListener fo;
    private WebCardRegisterLiveShopListener fp;
    private boolean fr;
    private String fs;
    private aq.b ft;
    private aq.a fu;
    private boolean fv;
    private com.kwad.components.core.widget.b fw;
    private float fx;
    private float fy;
    private boolean fz;
    private KsAdWebView mAdWebView;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private Handler mHandler;
    private boolean mIsAudioEnable;
    private final com.kwad.sdk.core.network.m<com.kwad.components.core.liveEnd.a, AdLiveEndCommonResultData> mNetworking;
    private int mWidth;

    /* renamed from: com.kwad.components.ad.feed.b.m$11  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass11 extends com.kwad.components.core.webview.c {
        AnonymousClass11() {
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(com.kwad.components.core.webview.a aVar, com.kwad.sdk.core.webview.b bVar) {
            bVar.ayo = false;
            m.this.fm = new at();
            aVar.a(m.this.fm);
            aVar.a(new ai(m.this.getOpenNewPageListener()));
            aVar.a(new WebCardVideoPositionHandler(new WebCardVideoPositionHandler.a() { // from class: com.kwad.components.ad.feed.b.m.11.1
                @Override // com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler.a
                public final void a(WebCardVideoPositionHandler.VideoPosition videoPosition) {
                    m mVar;
                    boolean bH;
                    if (m.this.mAdInfo != null) {
                        if (com.kwad.sdk.core.response.b.a.aU(m.this.mAdInfo) || m.this.eG) {
                            m.this.fB = (ViewGroup.MarginLayoutParams) m.this.ev.getLayoutParams();
                            int ceil = (int) Math.ceil(m.this.fj);
                            int i = m.this.mWidth;
                            if (videoPosition.widthRation == PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                                videoPosition.widthRation = 0.9200000166893005d;
                                videoPosition.leftMarginRation = 0.03999999910593033d;
                            }
                            m.this.fB.topMargin = (int) (videoPosition.topMarginRation * ceil);
                            double d = i;
                            m.this.fB.leftMargin = (int) (videoPosition.leftMarginRation * d);
                            m.this.fB.width = (int) (d * videoPosition.widthRation);
                            m.this.fB.height = (int) (m.this.fB.width * videoPosition.heightWidthRation);
                            m.this.ev.setRadius(videoPosition.borderRadius);
                            m.this.ev.setLayoutParams(m.this.fB);
                            if (!(m.this.dJ instanceof KSAdVideoPlayConfigImpl) || ((KSAdVideoPlayConfigImpl) m.this.dJ).getVideoSoundValue() == 0) {
                                mVar = m.this;
                                bH = com.kwad.sdk.core.response.b.a.bH(m.this.mAdInfo);
                            } else {
                                mVar = m.this;
                                bH = m.this.dJ.isVideoSoundEnable();
                            }
                            mVar.mIsAudioEnable = bH;
                            m.this.mAdTemplate.mIsAudioEnable = m.this.mIsAudioEnable;
                            m.this.cr = com.kwad.sdk.core.response.b.a.bd(m.this.mAdInfo);
                            if (!m.this.eG) {
                                m.this.a(m.this.dJ);
                            } else if (m.this.eF != null) {
                                m.this.eF.setAudioEnabled(m.this.g(m.this.mIsAudioEnable), false);
                            }
                        }
                    }
                }
            }));
            aVar.a(new v(bVar, new v.a() { // from class: com.kwad.components.ad.feed.b.m.11.2
                @Override // com.kwad.components.core.webview.jshandler.v.a
                public final void bz() {
                    m.this.mHandler.post(new Runnable() { // from class: com.kwad.components.ad.feed.b.m.11.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.this.sp();
                        }
                    });
                }
            }));
            aVar.a(new ar(new ar.a() { // from class: com.kwad.components.ad.feed.b.m.11.3
                @Override // com.kwad.components.core.webview.jshandler.ar.a
                public final void bA() {
                    m.d(m.this, true);
                    m.this.bs();
                }
            }));
            m.this.fD = new al();
            aVar.a(m.this.fD);
            if (m.this.eG) {
                aVar.a(new com.kwad.components.core.webview.jshandler.d(1, 1));
                m.this.fp = new WebCardRegisterLiveShopListener();
                m.this.fo = new WebCardRegisterLiveMessageListener();
                aVar.a(m.this.fp);
                aVar.a(m.this.fo);
                aVar.a(new aq(m.this.getRegisterLiveListener()));
            }
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(ad.a aVar) {
            double d;
            if (m.this.fv) {
                return;
            }
            m.this.mAdWebView.setVisibility(0);
            if (m.this.fj == PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                m.this.fj = aVar.height;
                m.this.fi.setRatio((float) d);
                m.fq.put(Long.valueOf(m.this.mAdTemplate.posId), Double.valueOf(aVar.height / m.this.mWidth));
            }
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(ak.a aVar) {
            if (m.this.fr) {
                return;
            }
            m.this.cF = aVar.status;
            if (m.this.cF != 1) {
                m.this.f("3", 3);
                return;
            }
            m.this.mHandler.removeCallbacksAndMessages(null);
            if (m.this.fw != null) {
                m.this.fw.setVisibility(8);
            }
            m.this.mAdWebView.setVisibility(0);
            com.kwad.components.core.p.a.pC().X(m.this.mAdTemplate);
            if (m.this.fA != null) {
                m.this.fA.c(2, "");
            }
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(ap apVar) {
            m.this.fn = apVar;
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(w.a aVar) {
            aVar.height = 0;
            aVar.width = m.this.mWidth;
        }

        @Override // com.kwad.components.core.webview.c
        public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
            m.this.bu();
            int i = aVar.Vc;
            if (aVar.JJ) {
                i = aVar.Va ? 1 : 2;
            }
            boolean aU = com.kwad.sdk.core.response.b.a.aU(m.this.mAdInfo);
            z.b bVar = new z.b();
            if (aVar.Vd != null && !TextUtils.isEmpty(aVar.Vd.US)) {
                bVar.US = aVar.Vd.US;
            }
            com.kwad.components.core.e.d.a.a(new a.C0197a(m.this.getContext()).S(m.this.mAdTemplate).b(m.this.mApkDownloadHelper).al(m.a(m.this, aVar)).ao(i).an(aVar.jI).am(5).ar(aVar.JJ).ap(aU).s(m.this.eF == null ? 0L : m.this.eF.getPlayDuration()).a(bVar).an(true).a(new a.b() { // from class: com.kwad.components.ad.feed.b.m.11.4
                @Override // com.kwad.components.core.e.d.a.b
                public final void onAdClicked() {
                    if (m.this.XZ != null) {
                        m.this.XZ.onAdClicked();
                    }
                }
            }));
        }

        @Override // com.kwad.components.core.webview.c
        public final void by() {
            m.this.f("1", 2);
        }

        @Override // com.kwad.components.core.webview.c
        public final void onPageFinished() {
            com.kwad.components.ad.feed.monitor.b.c(com.kwad.sdk.core.response.b.b.bu(m.this.mAdTemplate), System.currentTimeMillis() - m.this.mAdWebView.getLoadTime());
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void c(int i, String str);
    }

    public m(Context context) {
        super(context);
        this.cF = -1;
        this.mIsAudioEnable = false;
        this.fv = false;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.fE = false;
        this.fF = false;
        this.eK = new OfflineOnAudioConflictListener() { // from class: com.kwad.components.ad.feed.b.m.1
            @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
            public final void onAudioBeOccupied() {
                m.a(m.this, false);
                if (m.this.ex != null) {
                    m.this.ex.setVideoSoundEnable(false);
                }
                if (m.this.eF != null) {
                    m.this.eF.setAudioEnabled(false, false);
                }
            }

            @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
            public final void onAudioBeReleased() {
            }
        };
        this.fH = new AnonymousClass11();
        this.fI = new b.a() { // from class: com.kwad.components.ad.feed.b.m.13
            @Override // com.kwad.components.core.widget.b.a
            public final void onAdClicked() {
                if (m.this.XZ != null) {
                    m.this.XZ.onAdClicked();
                }
            }

            @Override // com.kwad.components.core.widget.b.a
            public final void onAdShow() {
                if (m.this.XZ != null) {
                    m.this.XZ.onAdShow();
                }
                if (m.this.fv) {
                    com.kwad.sdk.core.report.j jVar = new com.kwad.sdk.core.report.j();
                    z.a aVar = new z.a();
                    FeedType fromInt = FeedType.fromInt(m.this.mAdTemplate.type);
                    if (fromInt == FeedType.FEED_TYPE_TEXT_NEW) {
                        fromInt = FeedType.FEED_TYPE_TEXT_BELOW;
                    }
                    aVar.templateId = String.valueOf(fromInt.getType());
                    jVar.a(aVar);
                    jVar.t((int) Math.ceil(m.this.fj), m.this.mWidth);
                    com.kwad.components.core.t.b.ql().a(m.this.mAdTemplate, null, jVar);
                    com.kwad.components.ad.feed.monitor.b.a(m.this.mAdTemplate, 1);
                }
            }

            @Override // com.kwad.components.core.widget.b.a
            public final void onDislikeClicked() {
                if (m.this.XZ != null) {
                    m.this.XZ.onDislikeClicked();
                }
            }

            @Override // com.kwad.components.core.widget.b.a
            public final void onDownloadTipsDialogDismiss() {
                if (m.this.XZ != null) {
                    m.this.XZ.onDownloadTipsDialogDismiss();
                }
            }

            @Override // com.kwad.components.core.widget.b.a
            public final void onDownloadTipsDialogShow() {
                if (m.this.XZ != null) {
                    m.this.XZ.onDownloadTipsDialogShow();
                }
            }
        };
        this.mNetworking = new com.kwad.sdk.core.network.m<com.kwad.components.core.liveEnd.a, AdLiveEndCommonResultData>() { // from class: com.kwad.components.ad.feed.b.m.15
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            /* renamed from: bB */
            public com.kwad.components.core.liveEnd.a createRequest() {
                return new com.kwad.components.core.liveEnd.a(m.this.fJ);
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
        this.eJ = new AdLivePlayStateListenerAdapter() { // from class: com.kwad.components.ad.feed.b.m.16
            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayEnd() {
                super.onLivePlayEnd();
                String aY = com.kwad.sdk.core.response.b.a.aY(m.this.mAdInfo);
                if (TextUtils.isEmpty(aY)) {
                    return;
                }
                com.kwad.components.core.n.a.a.a aVar = (com.kwad.components.core.n.a.a.a) com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.a.a.class);
                if (aVar != null) {
                    m.this.fJ = aVar.getAdLiveEndRequest(aY);
                }
                m.this.mNetworking.request(new p<com.kwad.components.core.liveEnd.a, AdLiveEndCommonResultData>() { // from class: com.kwad.components.ad.feed.b.m.16.1
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
                        if (m.this.ft != null) {
                            m.this.ft.a(aVar3);
                        } else {
                            m.this.fu = aVar3;
                        }
                    }
                });
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayProgress(long j) {
                super.onLivePlayProgress(j);
                m.this.c(j);
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayResume() {
                com.kwad.components.core.j.a.oe().a(m.this.getCurrentVoiceItem());
                super.onLivePlayResume();
                IAdLivePlayModule iAdLivePlayModule = m.this.eF;
                m mVar = m.this;
                iAdLivePlayModule.setAudioEnabled(mVar.g(mVar.mIsAudioEnable), false);
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayStart() {
                com.kwad.components.core.j.a.oe().a(m.this.getCurrentVoiceItem());
                super.onLivePlayStart();
                IAdLivePlayModule iAdLivePlayModule = m.this.eF;
                m mVar = m.this;
                iAdLivePlayModule.setAudioEnabled(mVar.g(mVar.mIsAudioEnable), false);
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePrepared() {
                super.onLivePrepared();
                m.this.eF.setAudioEnabled(false, false);
            }
        };
        this.eC = new a.InterfaceC0212a() { // from class: com.kwad.components.ad.feed.b.m.10
            @Override // com.kwad.components.core.video.a.InterfaceC0212a
            public final void a(int i, ac.a aVar) {
                int i2;
                int i3 = 2;
                boolean z = false;
                if (i == 1) {
                    i2 = 13;
                } else if (i == 2) {
                    i2 = 82;
                } else if (i != 3) {
                    i2 = 108;
                } else {
                    i2 = 83;
                    i3 = 1;
                    z = true;
                }
                z.b bVar = new z.b();
                bVar.jK = aVar;
                bVar.jI = i2;
                m.this.bu();
                com.kwad.components.core.e.d.a.a(new a.C0197a(m.this.getContext()).S(m.this.mAdTemplate).b(m.this.mApkDownloadHelper).ao(i3).al(z).an(true).a(bVar).ap(true).a(new a.b() { // from class: com.kwad.components.ad.feed.b.m.10.1
                    @Override // com.kwad.components.core.e.d.a.b
                    public final void onAdClicked() {
                        m.this.ed();
                    }
                }));
            }
        };
    }

    private void a(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return;
        }
        this.fx = motionEvent.getX();
        this.fy = motionEvent.getY();
    }

    private void a(com.kwad.sdk.core.video.videoview.a aVar, final int i) {
        if (aVar != null) {
            String F = com.kwad.sdk.core.response.b.a.F(this.mAdInfo);
            this.ey.setAutoRelease(false);
            AdVideoPlayerViewCache.getInstance().a(F, this.ex);
            FeedType.fromInt(this.mAdTemplate.type);
            bu();
            com.kwad.components.core.e.d.a.a(new a.C0197a(getContext()).S(this.mAdTemplate).b(this.mApkDownloadHelper).ao(2).ap(com.kwad.sdk.core.response.b.a.aU(this.mAdInfo)).a(new a.b() { // from class: com.kwad.components.ad.feed.b.m.9
                @Override // com.kwad.components.core.e.d.a.b
                public final void onAdClicked() {
                    m.this.aK(i);
                }
            }));
        }
    }

    static /* synthetic */ boolean a(m mVar, com.kwad.sdk.core.webview.d.b.a aVar) {
        return b(aVar);
    }

    static /* synthetic */ boolean a(m mVar, boolean z) {
        mVar.eA = false;
        return false;
    }

    private void aw() {
        com.kwad.components.core.webview.b bVar = this.fG;
        if (bVar != null) {
            bVar.jx();
        }
        this.mAdWebView.setVisibility(4);
        this.mAdWebView.setBackgroundColor(0);
        this.fG = new com.kwad.components.core.webview.b();
        this.fG.a(new b.a().aa(this.mAdTemplate).aE(com.kwad.sdk.core.response.b.b.bu(this.mAdTemplate)).d(this.mAdWebView).k(this.fi).f(this.mApkDownloadHelper).a(this.fH));
        this.mAdWebView.loadUrl(com.kwad.sdk.core.response.b.b.bu(this.mAdTemplate));
        com.kwad.components.ad.feed.monitor.b.o(com.kwad.sdk.core.response.b.b.bu(this.mAdTemplate));
        br();
    }

    private static boolean b(com.kwad.sdk.core.webview.d.b.a aVar) {
        return aVar.JJ ? aVar.Va : aVar.Vc == 1;
    }

    private boolean bf() {
        IAdLiveOfflineView iAdLiveOfflineView = this.eD;
        if (iAdLiveOfflineView == null || iAdLiveOfflineView.getView() == null || this.eF == null) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) this.eD.getView().getParent();
        if (viewGroup != this.ev) {
            viewGroup.removeView(this.eD.getView());
            if (this.ev.getTag() != null) {
                KSRelativeLayout kSRelativeLayout = this.ev;
                kSRelativeLayout.removeView((View) kSRelativeLayout.getTag());
                this.ev.setTag(null);
            }
            this.ev.addView(this.eD.getView());
            this.ev.setTag(this.eD.getView());
            this.eF.setAudioEnabled(g(this.mIsAudioEnable), false);
            IAdLivePlayModule adLivePlayModule = this.eE.getAdLivePlayModule(this.eD, KsAdSDKImpl.get().getAppId(), String.valueOf(com.kwad.sdk.core.response.b.a.bR(this.mAdInfo)));
            this.eF = adLivePlayModule;
            adLivePlayModule.registerAdLivePlayStateListener(this.eJ);
        }
        this.eF.onResume();
        return true;
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
        if (this.ev.getTag() != null) {
            KSRelativeLayout kSRelativeLayout = this.ev;
            kSRelativeLayout.removeView((View) kSRelativeLayout.getTag());
            this.ev.setTag(null);
        }
        this.ev.addView(view2);
        this.ev.setTag(view2);
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.feed.b.m.3
            @Override // java.lang.Runnable
            public final void run() {
                m.this.c(view2);
            }
        });
        bw();
        if (this.mIsAudioEnable) {
            com.kwad.components.core.t.a.ak(this.mContext).a(this.eK);
        }
        return adLivePlayModule;
    }

    private void bh() {
        String url = com.kwad.sdk.core.response.b.a.bi(this.mAdInfo).getUrl();
        this.ew.setVisibility(0);
        this.eH.setVisibility(0);
        if (TextUtils.isEmpty(url)) {
            this.ew.setImageResource(R.drawable.ksad_ad_live_end);
            return;
        }
        this.ew.setImageDrawable(null);
        KSImageLoader.loadImage(this.ew, url, this.mAdTemplate, new DisplayImageOptionsCompat.Builder().setBlurRadius(50).build(), new SimpleImageLoadingListener() { // from class: com.kwad.components.ad.feed.b.m.6
            @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
            public final boolean onDecode(String str, InputStream inputStream, DecodedResult decodedResult) {
                decodedResult.mBitmap = BlurUtils.stackBlur(BitmapFactory.decodeStream(inputStream), 50, false);
                return true;
            }
        });
    }

    private void br() {
        this.mHandler.postDelayed(new Runnable() { // from class: com.kwad.components.ad.feed.b.m.12
            @Override // java.lang.Runnable
            public final void run() {
                m.this.mAdWebView.stopLoading();
                m.this.mAdWebView.setVisibility(8);
                m.this.f(AppEventsConstants.EVENT_PARAM_VALUE_NO, 1);
            }
        }, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        this.dS = new d.b() { // from class: com.kwad.components.ad.feed.b.m.17
            @Override // com.kwad.components.ad.feed.d.b
            public final boolean b(final double d) {
                if (bm.o(m.this.fi, (int) (com.kwad.sdk.core.config.d.zG() * 100.0f))) {
                    com.kwad.components.core.e.d.a.a(new a.C0197a(m.this.getContext()).S(m.this.mAdTemplate).b(m.this.mApkDownloadHelper).ao(2).al(false).an(false).an(157).am(5).ap(true).a(new a.b() { // from class: com.kwad.components.ad.feed.b.m.17.1
                        @Override // com.kwad.components.core.e.d.a.b
                        public final void onAdClicked() {
                            com.kwad.sdk.core.e.c.d("FeedWebView", "convertEnable End" + com.kwad.sdk.core.response.b.d.cu(m.this.mAdTemplate));
                            com.kwad.sdk.core.report.j jVar = new com.kwad.sdk.core.report.j();
                            jVar.i(d);
                            jVar.cg(157);
                            m.this.c(jVar);
                        }
                    }));
                    return true;
                }
                return false;
            }
        };
        com.kwad.components.ad.feed.d.a(com.kwad.sdk.core.response.b.b.by(this.mAdTemplate), this.mContext, this.dS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bu() {
        if (this.fz) {
            return;
        }
        this.fz = true;
        com.kwad.components.ad.feed.monitor.b.a(this.mAdTemplate, 2, getStayTime());
    }

    private boolean bv() {
        return this.cF == 1;
    }

    private void bw() {
        this.eD.registerLiveMessageListener(new AdLiveMessageListener() { // from class: com.kwad.components.ad.feed.b.m.4
            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLiveMessageListener
            public final void handleAdLiveMessage(List<AdLiveMessageInfo> list) {
                if (m.this.fo != null) {
                    m.this.fo.k(list);
                }
            }
        });
        this.eD.registerLiveShopListener(new AdLiveShopListener() { // from class: com.kwad.components.ad.feed.b.m.5
            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLiveShopListener
            public final void handleAdLiveShop(AdLiveShopInfo adLiveShopInfo) {
                if (m.this.fp != null) {
                    m.this.fp.a(adLiveShopInfo);
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
                com.kwad.sdk.core.report.a.a((AdTemplate) this.mAdTemplate, ceil, (JSONObject) null);
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

    static /* synthetic */ boolean d(m mVar, boolean z) {
        mVar.fE = true;
        return true;
    }

    private void e(AdTemplate adTemplate) {
        if (this.fF) {
            return;
        }
        this.mAdWebView = (KsAdWebView) findViewById(com.kwad.sdk.core.response.b.a.cw(com.kwad.sdk.core.response.b.d.ck(adTemplate)) ? R.id.ksad_web_bottom_card_webView : R.id.ksad_web_default_bottom_card_webView);
        this.fF = true;
    }

    private static float f(AdTemplate adTemplate) {
        int i = adTemplate.type;
        if (i == 1) {
            return 0.6013f;
        }
        return (i == 2 || i == 3) ? 0.283f : 0.968f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str, int i) {
        com.kwad.sdk.core.e.c.d("FeedWebView", "handleWebViewError " + str);
        this.mHandler.removeCallbacksAndMessages(null);
        if (this.fr) {
            return;
        }
        this.fr = true;
        if (this.mAdWebView != null) {
            com.kwad.components.ad.feed.monitor.b.a(com.kwad.sdk.core.response.b.b.bu(this.mAdTemplate), System.currentTimeMillis() - this.mAdWebView.getLoadTime(), i);
        }
        com.kwad.components.core.p.a.pC().b(this.mAdTemplate, com.kwad.sdk.core.response.b.b.bu(this.mAdTemplate), str);
        a aVar = this.fA;
        if (aVar != null) {
            aVar.c(1, str);
        }
        this.fA = null;
        if (this.fw == null) {
            this.fv = true;
            c((ViewGroup) this);
            int aW = com.kwad.sdk.core.response.b.a.aW(this.mAdInfo);
            IAdLivePlayModule iAdLivePlayModule = this.eF;
            if (iAdLivePlayModule != null) {
                iAdLivePlayModule.setAudioEnabled(false, false);
                this.eF.onDestroy();
                this.eF = null;
            }
            IAdLiveOfflineView iAdLiveOfflineView = this.eD;
            if (iAdLiveOfflineView != null) {
                iAdLiveOfflineView.onDestroy();
                this.eD = null;
            }
            com.kwad.components.core.widget.b a2 = com.kwad.components.ad.feed.b.a(this.mContext, FeedType.fromInt(this.mAdTemplate.type), aW);
            this.fw = a2;
            if (a2 != null) {
                this.fw.setMargin(com.kwad.sdk.d.a.a.a(this.mContext, 16.0f));
                this.fi.removeAllViews();
                this.fi.setRatio(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
                KsAdWebView ksAdWebView = this.mAdWebView;
                if (ksAdWebView != null) {
                    ksAdWebView.setVisibility(8);
                }
                this.ev.setVisibility(8);
                this.fw.setInnerAdInteractionListener(this.fI);
                this.fi.addView(this.fw);
                this.fw.b((com.kwad.components.core.widget.b) this.mAdTemplate);
                com.kwad.components.core.widget.b bVar = this.fw;
                if (bVar instanceof c) {
                    ((c) bVar).a(this.dJ);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(AdTemplate adTemplate) {
        Double d;
        RatioFrameLayout ratioFrameLayout;
        double f;
        com.kwad.components.core.e.d.c cVar = new com.kwad.components.core.e.d.c(this.mAdTemplate);
        this.mApkDownloadHelper = cVar;
        cVar.setOnShowListener(this);
        this.mApkDownloadHelper.setOnDismissListener(this);
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        if (fq.get(Long.valueOf(this.mAdTemplate.posId)) != null) {
            this.fi.setRatio(d.floatValue());
        } else {
            if (com.kwad.sdk.core.response.b.b.bz(this.mAdTemplate) > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                ratioFrameLayout = this.fi;
                f = com.kwad.sdk.core.response.b.b.bz(this.mAdTemplate);
            } else if (this.fi.getRatio() == PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                ratioFrameLayout = this.fi;
                f = f(this.mAdTemplate);
            }
            ratioFrameLayout.setRatio(f);
        }
        com.kwad.components.core.n.a.a.a aVar = (com.kwad.components.core.n.a.a.a) com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.a.a.class);
        this.eE = aVar;
        if (aVar != null && aVar.oi() && com.kwad.sdk.core.response.b.a.cw(this.mAdInfo)) {
            this.eG = true;
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public a.b getCurrentVoiceItem() {
        if (this.eI == null) {
            this.eI = new a.b(new a.c() { // from class: com.kwad.components.ad.feed.b.m.2
                @Override // com.kwad.components.core.j.a.c
                public final void bi() {
                    if (!m.this.eG) {
                        if (m.this.ex != null) {
                            com.kwad.sdk.core.video.videoview.a aVar = m.this.ex;
                            m mVar = m.this;
                            aVar.setVideoSoundEnable(mVar.g(mVar.mIsAudioEnable));
                            return;
                        }
                        return;
                    }
                    if (m.this.eF == null) {
                        m mVar2 = m.this;
                        mVar2.eF = mVar2.bg();
                    }
                    IAdLivePlayModule iAdLivePlayModule = m.this.eF;
                    m mVar3 = m.this;
                    iAdLivePlayModule.setAudioEnabled(mVar3.g(mVar3.mIsAudioEnable), false);
                }
            });
        }
        return this.eI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ai.a getOpenNewPageListener() {
        return new ai.a() { // from class: com.kwad.components.ad.feed.b.m.18
            @Override // com.kwad.components.core.webview.jshandler.ai.a
            public final void a(com.kwad.components.core.webview.a.b bVar) {
                AdWebViewActivityProxy.launch(m.this.mContext, new AdWebViewActivityProxy.a.C0206a().as(bVar.title).at(bVar.url).ax(true).V(m.this.mAdTemplate).oE());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public aq.c getRegisterLiveListener() {
        return new aq.c() { // from class: com.kwad.components.ad.feed.b.m.14
            @Override // com.kwad.components.core.webview.jshandler.aq.c
            public final void a(aq.b bVar) {
                m.this.ft = bVar;
                if (m.this.fu != null) {
                    m.this.ft.a(m.this.fu);
                    m.this.fu = null;
                }
            }
        };
    }

    private a.b getVideoPlayCallback() {
        return new a.b() { // from class: com.kwad.components.ad.feed.b.m.7
            private boolean cs = false;

            @Override // com.kwad.components.core.video.a.c
            public final void bj() {
                if (!this.cs) {
                    this.cs = true;
                    com.kwad.components.core.p.a.pC().a(m.this.mAdTemplate, System.currentTimeMillis(), 1);
                }
                com.kwad.sdk.core.video.videoview.a aVar = m.this.ex;
                m mVar = m.this;
                aVar.setVideoSoundEnable(mVar.g(mVar.mIsAudioEnable));
            }

            @Override // com.kwad.components.core.video.a.c
            public final void bk() {
                com.kwad.sdk.core.report.a.aE(m.this.mAdTemplate);
                m.this.fm.aO(9);
                m.this.ev.setVisibility(8);
                if (com.kwad.components.ad.feed.a.b.aU() && m.this.ez == null && !m.this.fE) {
                    m.this.ez = new d(m.this.mContext);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    m mVar = m.this;
                    mVar.addView(mVar.ez, layoutParams);
                    m.this.ez.bl();
                }
            }

            @Override // com.kwad.components.core.video.a.c
            public final void d(long j) {
                m.this.c(j);
            }

            @Override // com.kwad.components.core.video.a.b
            public final void onVideoPlayError(int i, int i2) {
                AdTemplate adTemplate = m.this.mAdTemplate;
                String F = com.kwad.sdk.core.response.b.a.F(m.this.mAdInfo);
                com.kwad.components.ad.feed.monitor.b.a(adTemplate, 2, 1, F, i + " " + i2, SystemClock.elapsedRealtime() - m.this.eh);
            }

            @Override // com.kwad.components.core.video.a.c
            public final void onVideoPlayStart() {
                com.kwad.components.core.j.a.oe().a(m.this.getCurrentVoiceItem());
                com.kwad.components.ad.feed.monitor.b.a(m.this.mAdTemplate, 1, 1, com.kwad.sdk.core.response.b.a.F(m.this.mAdInfo), null, SystemClock.elapsedRealtime() - m.this.eh);
                com.kwad.sdk.core.report.a.aD(m.this.mAdTemplate);
                m.this.fm.aO(3);
                if (m.this.ez != null && (m.this.ez.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) m.this.ez.getParent()).removeView(m.this.ez);
                    m.this.ez.bm();
                    m.this.ez = null;
                }
                if (m.this.fC == null && com.kwad.sdk.core.response.b.b.bw(m.this.mAdTemplate) && m.this.fE) {
                    m.this.fC = new e(m.this.mContext);
                    m.this.ev.addView(m.this.fC, new FrameLayout.LayoutParams(-1, -1));
                    m.this.fC.setOnViewEventListener(new com.kwad.sdk.widget.c() { // from class: com.kwad.components.ad.feed.b.m.7.1
                        @Override // com.kwad.sdk.widget.c
                        public final void a(View view) {
                            if (com.kwad.sdk.core.response.b.b.bx(m.this.mAdTemplate)) {
                                return;
                            }
                            m.this.u(158);
                        }

                        @Override // com.kwad.sdk.widget.c
                        public final void b(View view) {
                            if (com.kwad.sdk.core.response.b.b.bx(m.this.mAdTemplate) || !com.kwad.sdk.core.response.b.c.bZ(m.this.mAdTemplate)) {
                                return;
                            }
                            m.this.u(153);
                        }
                    });
                    m.this.fC.a(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.feed.b.m.7.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            m.this.fD.aN(1);
                            m.this.ev.removeView(m.this.fC);
                        }
                    });
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(final int i) {
        bu();
        com.kwad.components.core.e.d.a.a(new a.C0197a(getContext()).S(this.mAdTemplate).b(this.mApkDownloadHelper).ao(1).al(true).an(i).am(5).an(false).ap(true).a(new a.b() { // from class: com.kwad.components.ad.feed.b.m.8
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                m.this.aK(i);
            }
        }));
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        if (view != this.ev) {
            if (view == this.fl) {
                a(this.ex, 25);
            }
        } else if (!this.ex.isIdle()) {
            a(this.ex, 100);
        } else {
            com.kwad.sdk.utils.l.cE(this.mAdTemplate);
            this.ex.setKsPlayLogParam(com.kwad.sdk.contentalliance.a.a.a.as(this.mAdTemplate));
            this.ex.start();
        }
    }

    public final void a(KsAdVideoPlayConfig ksAdVideoPlayConfig) {
        String url = com.kwad.sdk.core.response.b.a.bi(this.mAdInfo).getUrl();
        if (TextUtils.isEmpty(url)) {
            this.ew.setVisibility(8);
        } else {
            this.ew.setImageDrawable(null);
            KSImageLoader.loadImage(this.ew, url, this.mAdTemplate);
            this.ew.setVisibility(0);
        }
        com.kwad.sdk.core.video.videoview.a aVar = new com.kwad.sdk.core.video.videoview.a(this.mContext);
        this.ex = aVar;
        aVar.setTag(this.cr);
        int zy = com.kwad.sdk.core.config.d.zy();
        String F = com.kwad.sdk.core.response.b.a.F(this.mAdInfo);
        if (TextUtils.isEmpty(F)) {
            return;
        }
        if (zy < 0) {
            File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(F);
            F = (bP == null || !bP.exists()) ? null : bP.getAbsolutePath();
        } else if (zy != 0) {
            F = com.kwad.sdk.core.videocache.c.a.bl(this.mContext).dN(F);
        }
        if (TextUtils.isEmpty(F)) {
            return;
        }
        this.ex.a(new b.a(this.mAdTemplate).cm(F).cn(com.kwad.sdk.core.response.b.f.b(com.kwad.sdk.core.response.b.d.cl(this.mAdTemplate))).a(this.mAdTemplate.mVideoPlayerStatus).b(new com.kwad.sdk.contentalliance.a.a.a(this.mAdTemplate, System.currentTimeMillis())).yP(), null);
        this.ex.setVideoSoundEnable(g(this.mIsAudioEnable));
        this.ey = new com.kwad.components.core.video.e(this.mContext, this.mAdTemplate, this.ex, ksAdVideoPlayConfig);
        this.eh = SystemClock.elapsedRealtime();
        this.ey.setVideoPlayCallback(getVideoPlayCallback());
        this.ey.setAdClickListener(this.eC);
        this.ex.setController(this.ey);
        if (this.ev.getTag() != null) {
            KSRelativeLayout kSRelativeLayout = this.ev;
            kSRelativeLayout.removeView((View) kSRelativeLayout.getTag());
            this.ev.setTag(null);
        }
        this.ev.addView(this.ex, 1);
        this.ev.setTag(this.ex);
        this.ev.setClickable(true);
        new com.kwad.sdk.widget.f(this.ev, this);
        if (this.mIsAudioEnable) {
            com.kwad.components.core.t.a.ak(this.mContext).a(this.eK);
        }
        if (this.mAdTemplate.type == 1 || this.mAdTemplate.type == 19) {
            this.fk.setVisibility(0);
            this.fl.setVisibility(0);
            this.fl.setText(com.kwad.components.ad.feed.f.c(this.mAdTemplate));
            new com.kwad.sdk.widget.f(this.fl, this);
        }
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.h.c
    public final void aK() {
        super.aK();
        com.kwad.components.core.j.a.oe().a(getCurrentVoiceItem());
        if (this.eG) {
            IAdLivePlayModule iAdLivePlayModule = this.eF;
            if (iAdLivePlayModule == null) {
                this.eF = bg();
            } else {
                iAdLivePlayModule.onResume();
            }
        }
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.h.c
    public final void aL() {
        super.aL();
        IAdLivePlayModule iAdLivePlayModule = this.eF;
        if (iAdLivePlayModule != null) {
            iAdLivePlayModule.onPause();
        }
        com.kwad.components.core.j.a.oe().c(this.eI);
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
        super.aa();
        if (this.dS != null) {
            com.kwad.components.ad.feed.d.a(com.kwad.sdk.core.response.b.b.by(this.mAdTemplate), this.mContext, this.dS);
        }
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
        super.ab();
        this.mHandler.removeCallbacksAndMessages(null);
        com.kwad.sdk.utils.l.cD(this.mAdTemplate);
        d.b bVar = this.dS;
        if (bVar != null) {
            com.kwad.components.ad.feed.d.a(bVar);
        }
        IAdLivePlayModule iAdLivePlayModule = this.eF;
        if (iAdLivePlayModule != null) {
            iAdLivePlayModule.onDestroy();
            this.eF = null;
        }
        IAdLiveOfflineView iAdLiveOfflineView = this.eD;
        if (iAdLiveOfflineView != null) {
            iAdLiveOfflineView.onDestroy();
            this.eD = null;
        }
        com.kwad.components.core.j.a.oe().c(this.eI);
        this.ft = null;
        this.fu = null;
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate)) {
            if (view == this.ev || view == this.fl) {
                a(this.ex, 153);
            }
        }
    }

    @Override // com.kwad.components.core.widget.b
    public final void b(AdTemplate adTemplate) {
        e(adTemplate);
        adTemplate.realShowType = 2;
        super.b((m) adTemplate);
        if (this.fr) {
            com.kwad.components.core.widget.b bVar = this.fw;
            if (bVar != null) {
                bVar.b((com.kwad.components.core.widget.b) this.mAdTemplate);
                com.kwad.components.core.widget.b bVar2 = this.fw;
                if (bVar2 instanceof c) {
                    ((c) bVar2).a(this.dJ);
                }
            }
        } else if (!com.kwad.sdk.core.response.b.b.bA(this.mAdTemplate)) {
            f(AppEventsConstants.EVENT_PARAM_VALUE_NO, 0);
        } else {
            if (!bv()) {
                g(this.mAdTemplate);
            }
            try {
                String str = this.fs;
                if (str == null || !str.equals(adTemplate.mOriginJString)) {
                    if (bv()) {
                        this.mAdWebView.reload();
                    } else {
                        aw();
                    }
                }
            } catch (Throwable th) {
                f(AppEventsConstants.EVENT_PARAM_VALUE_NO, 0);
            }
            this.fs = adTemplate.mOriginJString;
        }
    }

    @Override // com.kwad.components.core.widget.b
    public final void ba() {
        com.kwad.components.ad.feed.monitor.b.aX();
        this.fi = (RatioFrameLayout) findViewById(R.id.ksad_container);
        this.ev = (KSRelativeLayout) findViewById(R.id.ksad_video_container);
        this.fk = (LinearLayout) findViewById(R.id.ksad_video_immerse_text_container);
        this.fl = (TextView) findViewById(R.id.ksad_video_immerse_text);
        this.ew = (ImageView) findViewById(R.id.ksad_video_first_frame_container);
        this.eH = findViewById(R.id.ksad_live_end_bg_mantle);
    }

    @Override // com.kwad.components.core.widget.b
    public final void bt() {
        ap apVar;
        if (!this.mAdTemplate.mPvReported && this.XZ != null) {
            this.XZ.onAdShow();
            com.kwad.components.ad.feed.monitor.b.a(this.mAdTemplate, 2);
        }
        if (this.fv || (apVar = this.fn) == null) {
            return;
        }
        apVar.rD();
    }

    @Override // com.kwad.components.core.widget.b
    public final int getLayoutId() {
        return R.layout.ksad_feed_webview;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        FeedSlideConf aU;
        int action = motionEvent.getAction() & 255;
        if (com.kwad.sdk.core.config.d.zJ() && com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate)) {
            if (com.kwad.sdk.core.response.b.b.aU(this.mAdTemplate) == null) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            a(motionEvent);
            if ((action == 2 || action == 3) && this.mAdWebView != null && !this.fv && Math.abs(motionEvent.getX() - this.fx) > 0.0f) {
                this.mAdWebView.requestDisallowInterceptTouchEvent(true);
                double abs = Math.abs(motionEvent.getX() - this.fx);
                double abs2 = Math.abs(motionEvent.getY() - this.fy);
                if (Math.tan(aU.maxRange) * abs < abs2 || Math.tan(aU.minRange) * abs < abs2) {
                    this.mAdWebView.requestDisallowInterceptTouchEvent(false);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        IAdLivePlayModule iAdLivePlayModule;
        ViewGroup viewGroup;
        super.onWindowFocusChanged(z);
        if (!z) {
            IAdLiveOfflineView iAdLiveOfflineView = this.eD;
            if (iAdLiveOfflineView == null || iAdLiveOfflineView.getView() == null || (iAdLivePlayModule = this.eF) == null) {
                return;
            }
            iAdLivePlayModule.onPause();
        } else if (bf()) {
        } else {
            com.kwad.sdk.core.video.videoview.a aVar = this.ex;
            if (aVar != null && (viewGroup = (ViewGroup) aVar.getParent()) != this.ev) {
                viewGroup.removeView(this.ex);
                if (this.ev.getTag() != null) {
                    KSRelativeLayout kSRelativeLayout = this.ev;
                    kSRelativeLayout.removeView((View) kSRelativeLayout.getTag());
                    this.ev.setTag(null);
                }
                this.ev.addView(this.ex);
                this.ev.setTag(this.ex);
                this.ex.setVideoSoundEnable(this.mIsAudioEnable);
                this.ey.setVideoPlayCallback(getVideoPlayCallback());
                this.ey.setAdClickListener(this.eC);
                this.ey.getAdTemplate().mAdWebVideoPageShowing = false;
                this.ey.qY();
                this.ey.setAutoRelease(true);
            }
            AdVideoPlayerViewCache.getInstance().remove(com.kwad.sdk.core.response.b.a.F(this.mAdInfo));
        }
    }

    @Override // com.kwad.components.core.widget.b
    public final void setMargin(int i) {
    }

    public final void setPreloadListener(a aVar) {
        a aVar2 = this.fA;
        if (aVar2 != null) {
            aVar2.c(this.cF == 1 ? 2 : 1, "");
        }
        this.fA = aVar;
    }

    public final void setVideoPlayConfig(KsAdVideoPlayConfig ksAdVideoPlayConfig) {
        com.kwad.components.core.video.e eVar;
        IAdLivePlayModule iAdLivePlayModule;
        this.dJ = ksAdVideoPlayConfig;
        if (ksAdVideoPlayConfig instanceof KSAdVideoPlayConfigImpl) {
            KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = (KSAdVideoPlayConfigImpl) ksAdVideoPlayConfig;
            if (kSAdVideoPlayConfigImpl.getVideoSoundValue() != 0) {
                this.mIsAudioEnable = kSAdVideoPlayConfigImpl.isVideoSoundEnable();
                this.mAdTemplate.mIsAudioEnable = this.mIsAudioEnable;
                IAdLiveOfflineView iAdLiveOfflineView = this.eD;
                if (iAdLiveOfflineView == null || iAdLiveOfflineView.getView() == null || (iAdLivePlayModule = this.eF) == null) {
                    com.kwad.sdk.core.video.videoview.a aVar = this.ex;
                    if (aVar != null) {
                        aVar.setVideoSoundEnable(g(this.mIsAudioEnable));
                    }
                } else {
                    iAdLivePlayModule.setAudioEnabled(g(this.mIsAudioEnable), false);
                }
                if (this.mIsAudioEnable) {
                    com.kwad.components.core.t.a.ak(this.mContext).a(this.eK);
                }
            }
            if (kSAdVideoPlayConfigImpl.getDataFlowAutoStartValue() == 0 || (eVar = this.ey) == null) {
                return;
            }
            eVar.setDataAutoStart(kSAdVideoPlayConfigImpl.isDataFlowAutoStart());
        }
    }

    public final void setWidth(int i) {
        if (i <= 0) {
            i = getContext().getResources().getDisplayMetrics().widthPixels;
        }
        this.mWidth = i;
    }
}
