package com.kwad.components.ad.feed.b;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kwad.components.ad.widget.DownloadProgressView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.components.core.j.a;
import com.kwad.components.core.video.a;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView;
import com.kwad.components.offline.api.core.adlive.IAdLivePlayModule;
import com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener;
import com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter;
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
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.widget.KSRelativeLayout;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class c extends a implements View.OnClickListener, com.kwad.sdk.widget.c {
    private List<Integer> cr;
    private volatile boolean cs;
    private com.kwad.sdk.widget.j ct;
    private TextView dC;
    private KsAdVideoPlayConfig dJ;
    private ImageView du;
    private TextView dv;
    private boolean eA;
    private TextView eB;
    private final a.InterfaceC0212a eC;
    private IAdLiveOfflineView eD;
    private com.kwad.components.core.n.a.a.a eE;
    private IAdLivePlayModule eF;
    private boolean eG;
    private View eH;
    private a.b eI;
    private final AdLivePlayStateListener eJ;
    private OfflineOnAudioConflictListener eK;
    private a.b eL;
    private TextView ek;
    private ImageView em;
    private TextView eo;
    private TextView ep;
    private View eq;
    private DownloadProgressView er;
    private KSRelativeLayout ev;
    private ImageView ew;
    private com.kwad.sdk.core.video.videoview.a ex;
    private com.kwad.components.core.video.e ey;
    private d ez;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private boolean mIsAudioEnable;
    private KsLogoView mLogoView;

    public c(Context context) {
        super(context);
        this.mIsAudioEnable = false;
        this.cs = false;
        this.ct = new com.kwad.sdk.widget.j() { // from class: com.kwad.components.ad.feed.b.c.1
            @Override // com.kwad.sdk.widget.j
            public final void am() {
                com.kwad.sdk.utils.l.cF(c.this.mAdTemplate);
            }
        };
        this.eC = new a.InterfaceC0212a() { // from class: com.kwad.components.ad.feed.b.c.3
            @Override // com.kwad.components.core.video.a.InterfaceC0212a
            public final void a(int i, ac.a aVar) {
                int i2;
                int i3 = 2;
                boolean z = false;
                if (i == 1) {
                    i2 = 15;
                } else if (i == 2) {
                    i2 = 16;
                } else if (i != 3) {
                    i2 = 35;
                } else {
                    i2 = 39;
                    i3 = 1;
                    z = true;
                }
                z.b bVar = new z.b();
                bVar.jK = aVar;
                bVar.jI = i2;
                c.this.aY();
                com.kwad.components.core.e.d.a.a(new a.C0197a(c.this.getContext()).S(c.this.mAdTemplate).b(c.this.mApkDownloadHelper).ao(i3).al(z).an(true).am(5).an(i2).ap(true).a(bVar).a(new a.b() { // from class: com.kwad.components.ad.feed.b.c.3.1
                    @Override // com.kwad.components.core.e.d.a.b
                    public final void onAdClicked() {
                        c.this.ed();
                    }
                }));
            }
        };
        this.eJ = new AdLivePlayStateListenerAdapter() { // from class: com.kwad.components.ad.feed.b.c.7
            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayEnd() {
                super.onLivePlayEnd();
                c.this.eB.setVisibility(0);
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayProgress(long j) {
                super.onLivePlayProgress(j);
                c.this.c(j);
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayResume() {
                super.onLivePlayResume();
                com.kwad.components.core.j.a.oe().a(c.this.getCurrentVoiceItem());
                IAdLivePlayModule iAdLivePlayModule = c.this.eF;
                c cVar = c.this;
                iAdLivePlayModule.setAudioEnabled(cVar.g(cVar.mIsAudioEnable), false);
            }

            @Override // com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListenerAdapter, com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener
            public final void onLivePlayStart() {
                super.onLivePlayStart();
                com.kwad.components.core.j.a.oe().a(c.this.getCurrentVoiceItem());
                IAdLivePlayModule iAdLivePlayModule = c.this.eF;
                c cVar = c.this;
                iAdLivePlayModule.setAudioEnabled(cVar.g(cVar.mIsAudioEnable), false);
            }
        };
        this.eK = new OfflineOnAudioConflictListener() { // from class: com.kwad.components.ad.feed.b.c.8
            @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
            public final void onAudioBeOccupied() {
                c.b(c.this, false);
                if (c.this.ex != null) {
                    c.this.ex.setVideoSoundEnable(false);
                }
                if (c.this.eF != null) {
                    c.this.eF.setAudioEnabled(false, false);
                }
            }

            @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
            public final void onAudioBeReleased() {
            }
        };
        this.eL = new a.b() { // from class: com.kwad.components.ad.feed.b.c.10
            @Override // com.kwad.components.core.video.a.c
            public final void bj() {
                com.kwad.sdk.core.video.videoview.a aVar = c.this.ex;
                c cVar = c.this;
                aVar.setVideoSoundEnable(cVar.g(cVar.mIsAudioEnable));
            }

            @Override // com.kwad.components.core.video.a.c
            public final void bk() {
                if (com.kwad.components.ad.feed.a.b.aU() && c.this.ez == null) {
                    c.this.ez = new d(c.this.getContext());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    c cVar = c.this;
                    cVar.addView(cVar.ez, layoutParams);
                    c.this.ez.bl();
                }
                com.kwad.sdk.core.report.a.aE(c.this.mAdTemplate);
            }

            @Override // com.kwad.components.core.video.a.c
            public final void d(long j) {
                c.this.c(j);
            }

            @Override // com.kwad.components.core.video.a.b
            public final void onVideoPlayError(int i, int i2) {
                AdTemplate adTemplate = c.this.mAdTemplate;
                String F = com.kwad.sdk.core.response.b.a.F(c.this.mAdInfo);
                com.kwad.components.ad.feed.monitor.b.a(adTemplate, 2, 1, F, i + " " + i2, SystemClock.elapsedRealtime() - c.this.eh);
            }

            @Override // com.kwad.components.core.video.a.c
            public final void onVideoPlayStart() {
                com.kwad.components.core.j.a.oe().a(c.this.getCurrentVoiceItem());
                if (c.this.ez != null && (c.this.ez.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) c.this.ez.getParent()).removeView(c.this.ez);
                    c.this.ez.bm();
                    c.this.ez = null;
                }
                com.kwad.components.ad.feed.monitor.b.a(c.this.mAdTemplate, 1, 1, com.kwad.sdk.core.response.b.a.F(c.this.mAdInfo), null, SystemClock.elapsedRealtime() - c.this.eh);
                com.kwad.sdk.core.report.a.aD(c.this.mAdTemplate);
            }
        };
    }

    private void a(com.kwad.sdk.core.video.videoview.a aVar, boolean z, final int i) {
        if (aVar != null || this.eG) {
            String F = com.kwad.sdk.core.response.b.a.F(this.mAdInfo);
            if (!this.eG) {
                this.ey.setAutoRelease(false);
            }
            int i2 = z ? 1 : 2;
            if (!this.eG) {
                AdVideoPlayerViewCache.getInstance().a(F, this.ex);
            }
            aY();
            a.C0197a al = new a.C0197a(getContext()).S(this.mAdTemplate).b(this.mApkDownloadHelper).al(z);
            IAdLivePlayModule iAdLivePlayModule = this.eF;
            com.kwad.components.core.e.d.a.a(al.s(iAdLivePlayModule == null ? 0L : iAdLivePlayModule.getPlayDuration()).ao(i2).ap(true).a(new a.b() { // from class: com.kwad.components.ad.feed.b.c.9
                @Override // com.kwad.components.core.e.d.a.b
                public final void onAdClicked() {
                    c.this.aK(i);
                }
            }));
        }
    }

    static /* synthetic */ boolean b(c cVar, boolean z) {
        cVar.eA = false;
        return false;
    }

    private void bb() {
        findViewById(R.id.ksad_ad_h5_container).setVisibility(0);
        findViewById(R.id.ksad_ad_download_container).setVisibility(8);
        this.ep = (TextView) findViewById(R.id.ksad_h5_desc);
        this.dC = (TextView) findViewById(R.id.ksad_h5_open_btn);
        this.eq = findViewById(R.id.ksad_h5_open_cover);
        this.ep.setText(com.kwad.components.ad.feed.f.c(this.mAdTemplate));
        this.dC.setText(com.kwad.sdk.core.response.b.a.aw(this.mAdInfo));
        this.eq.setOnClickListener(this);
        this.ep.setOnClickListener(this);
        this.dC.setOnClickListener(this);
        new com.kwad.sdk.widget.f(getContext(), this.eq, this);
        new com.kwad.sdk.widget.f(getContext(), this.ep, this);
        new com.kwad.sdk.widget.f(getContext(), this.dC, this);
    }

    private void bc() {
        findViewById(R.id.ksad_ad_download_container).setVisibility(0);
        findViewById(R.id.ksad_ad_h5_container).setVisibility(8);
        this.du = (ImageView) findViewById(R.id.ksad_app_icon);
        this.dv = (TextView) findViewById(R.id.ksad_app_title);
        TextView textView = (TextView) findViewById(R.id.ksad_app_desc);
        this.eo = textView;
        com.kwad.sdk.d.a.a.a(this, this.du, this.dv, textView);
        new com.kwad.sdk.widget.f(getContext(), this.du, this);
        new com.kwad.sdk.widget.f(getContext(), this.dv, this);
        new com.kwad.sdk.widget.f(getContext(), this.eo, this);
        this.dv.setText(com.kwad.sdk.core.response.b.a.ao(this.mAdInfo));
        this.du.setImageResource(R.drawable.ksad_default_app_icon);
        KSImageLoader.loadAppIcon(this.du, com.kwad.sdk.core.response.b.a.bQ(this.mAdInfo), this.mAdTemplate, 8);
        this.eo.setText(com.kwad.components.ad.feed.f.c(this.mAdTemplate));
        aZ();
        this.er.K(this.mAdTemplate);
        this.er.setOnClickListener(this);
        new com.kwad.sdk.widget.f(getContext(), this.er, this);
        com.kwad.components.core.e.d.c cVar = new com.kwad.components.core.e.d.c(this.mAdTemplate, null, this.er.getAppDownloadListener());
        this.mApkDownloadHelper = cVar;
        cVar.d(this.er.getAppDownloadListener());
        this.mApkDownloadHelper.setOnShowListener(this);
        this.mApkDownloadHelper.setOnDismissListener(this);
    }

    private void be() {
        com.kwad.components.core.n.a.a.a aVar = (com.kwad.components.core.n.a.a.a) com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.a.a.class);
        this.eE = aVar;
        if (aVar != null && aVar.oi() && com.kwad.sdk.core.response.b.a.cw(this.mAdInfo)) {
            this.eG = true;
        }
    }

    private boolean bf() {
        IAdLiveOfflineView iAdLiveOfflineView = this.eD;
        if (iAdLiveOfflineView == null || iAdLiveOfflineView.getView() == null || !this.eG) {
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
            this.eF.setAudioEnabled(this.mIsAudioEnable, false);
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
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.feed.b.c.4
            @Override // java.lang.Runnable
            public final void run() {
                c.this.c(view2);
            }
        });
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
        KSImageLoader.loadImage(this.ew, url, this.mAdTemplate, new DisplayImageOptionsCompat.Builder().setBlurRadius(50).build(), new SimpleImageLoadingListener() { // from class: com.kwad.components.ad.feed.b.c.5
            @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
            public final boolean onDecode(String str, InputStream inputStream, DecodedResult decodedResult) {
                decodedResult.mBitmap = BlurUtils.stackBlur(BitmapFactory.decodeStream(inputStream), 50, false);
                return true;
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
    public void c(final View view) {
        view.post(new Runnable() { // from class: com.kwad.components.ad.feed.b.c.6
            @Override // java.lang.Runnable
            public final void run() {
                int width = c.this.ev.getWidth();
                int height = c.this.ev.getHeight();
                if (width == 0 || height == 0) {
                    return;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (height * 0.5625f), height);
                layoutParams.addRule(13, -1);
                view.setLayoutParams(layoutParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(boolean z) {
        if (z) {
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
            this.eI = new a.b(new a.c() { // from class: com.kwad.components.ad.feed.b.c.2
                @Override // com.kwad.components.core.j.a.c
                public final void bi() {
                    if (!c.this.eG) {
                        if (c.this.ex != null) {
                            com.kwad.sdk.core.video.videoview.a aVar = c.this.ex;
                            c cVar = c.this;
                            aVar.setVideoSoundEnable(cVar.g(cVar.mIsAudioEnable));
                            return;
                        }
                        return;
                    }
                    if (c.this.eF == null) {
                        c cVar2 = c.this;
                        cVar2.eF = cVar2.bg();
                    }
                    IAdLivePlayModule iAdLivePlayModule = c.this.eF;
                    c cVar3 = c.this;
                    iAdLivePlayModule.setAudioEnabled(cVar3.g(cVar3.mIsAudioEnable), false);
                }
            });
        }
        return this.eI;
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        onClick(view);
    }

    public final void a(KsAdVideoPlayConfig ksAdVideoPlayConfig) {
        ImageView imageView;
        int i;
        this.dJ = ksAdVideoPlayConfig;
        this.mIsAudioEnable = (!(ksAdVideoPlayConfig instanceof KSAdVideoPlayConfigImpl) || ((KSAdVideoPlayConfigImpl) ksAdVideoPlayConfig).getVideoSoundValue() == 0) ? com.kwad.sdk.core.response.b.a.bH(this.mAdInfo) : ksAdVideoPlayConfig.isVideoSoundEnable();
        this.mAdTemplate.mIsAudioEnable = this.mIsAudioEnable;
        this.cr = com.kwad.sdk.core.response.b.a.bd(this.mAdInfo);
        if (this.eG) {
            return;
        }
        String url = com.kwad.sdk.core.response.b.a.bi(this.mAdInfo).getUrl();
        if (TextUtils.isEmpty(url)) {
            imageView = this.ew;
            i = 8;
        } else {
            this.ew.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.ew.setImageDrawable(null);
            KSImageLoader.loadImage(this.ew, url, this.mAdTemplate);
            imageView = this.ew;
            i = 0;
        }
        imageView.setVisibility(i);
        com.kwad.sdk.core.video.videoview.a aVar = new com.kwad.sdk.core.video.videoview.a(this.mContext);
        this.ex = aVar;
        aVar.setVisibleListener(this.ct);
        this.ex.setOnClickListener(this);
        new com.kwad.sdk.widget.f(getContext(), this.ex, this);
        this.ex.setTag(this.cr);
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
        this.ex.a(new b.a(this.mAdTemplate).cm(F).cn(com.kwad.sdk.core.response.b.f.b(com.kwad.sdk.core.response.b.d.cl(this.mAdTemplate))).a(this.mAdTemplate.mVideoPlayerStatus).b(com.kwad.sdk.contentalliance.a.a.a.as(this.mAdTemplate)).yP(), null);
        this.ex.setVideoSoundEnable(g(this.mIsAudioEnable));
        com.kwad.components.core.video.e eVar = new com.kwad.components.core.video.e(this.mContext, this.mAdTemplate, this.ex, ksAdVideoPlayConfig);
        this.ey = eVar;
        eVar.setAdClickListener(this.eC);
        this.eh = SystemClock.elapsedRealtime();
        this.ey.setVideoPlayCallback(this.eL);
        this.ex.setController(this.ey);
        if (this.ev.getTag() != null) {
            KSRelativeLayout kSRelativeLayout = this.ev;
            kSRelativeLayout.removeView((View) kSRelativeLayout.getTag());
            this.ev.setTag(null);
        }
        this.ev.addView(this.ex);
        this.ev.setTag(this.ex);
        this.ev.setClickable(true);
        this.ev.setOnClickListener(this);
        new com.kwad.sdk.widget.f(getContext(), this.ev, this);
        if (this.mIsAudioEnable) {
            com.kwad.components.core.t.a.ak(this.mContext).a(this.eK);
        }
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.h.c
    public final void aK() {
        super.aK();
        com.kwad.components.core.video.e eVar = this.ey;
        if (eVar != null) {
            eVar.setVideoPlayCallback(this.eL);
        }
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
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
        super.ab();
        com.kwad.sdk.utils.l.cD(this.mAdTemplate);
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
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate)) {
            a(this.ex, view == this.er, 153);
        }
    }

    @Override // com.kwad.components.core.widget.b
    public final void b(AdTemplate adTemplate) {
        super.b((c) adTemplate);
        this.ek.setText(com.kwad.components.ad.feed.f.c(this.mAdTemplate));
        this.mLogoView.ad(adTemplate);
        be();
        if (com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
            bc();
        } else {
            bb();
        }
        this.ek.setOnClickListener(this);
        this.ev.setOnClickListener(this);
        this.em.setOnClickListener(this);
        new com.kwad.sdk.widget.f(getContext(), this.ek, this);
        new com.kwad.sdk.widget.f(getContext(), this.ev, this);
        new com.kwad.sdk.widget.f(getContext(), this.em, this);
        setOnClickListener(this);
    }

    @Override // com.kwad.components.core.widget.b
    public final void ba() {
        this.ek = (TextView) findViewById(R.id.ksad_ad_desc);
        KSRelativeLayout kSRelativeLayout = (KSRelativeLayout) findViewById(R.id.ksad_video_container);
        this.ev = kSRelativeLayout;
        kSRelativeLayout.setRatio(0.56f);
        this.em = (ImageView) findViewById(R.id.ksad_ad_dislike);
        this.ew = (ImageView) findViewById(R.id.ksad_video_first_frame_container);
        this.mLogoView = (KsLogoView) findViewById(R.id.ksad_ad_dislike_logo);
        this.er = (DownloadProgressView) findViewById(R.id.ksad_app_download_btn);
        this.eB = (TextView) findViewById(R.id.ksad_live_end_text);
        this.eH = findViewById(R.id.ksad_live_end_bg_mantle);
    }

    @Override // com.kwad.components.core.widget.b
    public final void bd() {
        super.bd();
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.c(this.er.getAppDownloadListener());
        }
        if (this.mIsAudioEnable) {
            com.kwad.components.core.t.a.ak(this.mContext).b(this.eK);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        if (r5 == r4.ex) goto L24;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r5) {
        /*
            r4 = this;
            android.widget.ImageView r0 = r4.em
            if (r5 != r0) goto L8
            r4.sp()
            return
        L8:
            com.kwad.sdk.widget.KSRelativeLayout r0 = r4.ev
            if (r5 != r0) goto L2c
            com.kwad.sdk.core.video.videoview.a r0 = r4.ex
            if (r0 == 0) goto L2c
            boolean r0 = r0.isIdle()
            if (r0 == 0) goto L2c
            T extends com.kwad.sdk.core.response.model.AdTemplate r5 = r4.mAdTemplate
            com.kwad.sdk.utils.l.cE(r5)
            T extends com.kwad.sdk.core.response.model.AdTemplate r5 = r4.mAdTemplate
            com.kwad.sdk.contentalliance.a.a.a r5 = com.kwad.sdk.contentalliance.a.a.a.as(r5)
            com.kwad.sdk.core.video.videoview.a r0 = r4.ex
            r0.setKsPlayLogParam(r5)
            com.kwad.sdk.core.video.videoview.a r5 = r4.ex
            r5.start()
            return
        L2c:
            r0 = 35
            android.widget.TextView r1 = r4.ek
            r2 = 1
            r3 = 100
            if (r5 != r1) goto L38
            r0 = 25
            goto L6b
        L38:
            com.kwad.sdk.widget.KSRelativeLayout r1 = r4.ev
            if (r5 != r1) goto L3e
        L3c:
            r0 = r3
            goto L6b
        L3e:
            com.kwad.components.ad.widget.DownloadProgressView r1 = r4.er
            if (r5 == r1) goto L6a
            android.widget.TextView r1 = r4.dC
            if (r5 == r1) goto L6a
            android.view.View r1 = r4.eq
            if (r5 != r1) goto L4b
            goto L6a
        L4b:
            android.widget.ImageView r1 = r4.du
            if (r5 != r1) goto L52
            r0 = 13
            goto L6b
        L52:
            android.widget.TextView r1 = r4.dv
            if (r5 != r1) goto L59
            r0 = 14
            goto L6b
        L59:
            android.widget.TextView r1 = r4.eo
            if (r5 == r1) goto L67
            android.widget.TextView r1 = r4.ep
            if (r5 != r1) goto L62
            goto L67
        L62:
            com.kwad.sdk.core.video.videoview.a r1 = r4.ex
            if (r5 != r1) goto L6b
            goto L3c
        L67:
            r0 = 101(0x65, float:1.42E-43)
            goto L6b
        L6a:
            r0 = r2
        L6b:
            com.kwad.sdk.core.video.videoview.a r1 = r4.ex
            com.kwad.components.ad.widget.DownloadProgressView r3 = r4.er
            if (r5 != r3) goto L72
            goto L73
        L72:
            r2 = 0
        L73:
            r4.a(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.feed.b.c.onClick(android.view.View):void");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            IAdLiveOfflineView iAdLiveOfflineView = this.eD;
            if (iAdLiveOfflineView == null || iAdLiveOfflineView.getView() == null) {
                return;
            }
            this.eF.onPause();
        } else if (bf()) {
        } else {
            com.kwad.sdk.core.video.videoview.a aVar = this.ex;
            if (aVar != null && this.ey != null) {
                ViewGroup viewGroup = (ViewGroup) aVar.getParent();
                if (this.ex.getParent() != this.ev) {
                    viewGroup.removeView(this.ex);
                    if (this.ev.getTag() != null) {
                        KSRelativeLayout kSRelativeLayout = this.ev;
                        kSRelativeLayout.removeView((View) kSRelativeLayout.getTag());
                        this.ev.setTag(null);
                    }
                    this.ev.addView(this.ex);
                    this.ev.setTag(this.ex);
                    com.kwad.sdk.core.response.b.a.F(this.mAdInfo);
                    this.ex.setVideoSoundEnable(this.mIsAudioEnable);
                    this.mAdTemplate.mIsAudioEnable = this.mIsAudioEnable;
                    this.ey.setAdClickListener(this.eC);
                    this.ey.getAdTemplate().mAdWebVideoPageShowing = false;
                    this.ey.qY();
                    this.ey.setAutoRelease(true);
                }
            }
            AdVideoPlayerViewCache.getInstance().remove(com.kwad.sdk.core.response.b.a.F(this.mAdInfo));
        }
    }

    public void setVideoPlayConfig(KsAdVideoPlayConfig ksAdVideoPlayConfig) {
        com.kwad.components.core.video.e eVar;
        IAdLivePlayModule iAdLivePlayModule;
        this.dJ = ksAdVideoPlayConfig;
        if (ksAdVideoPlayConfig instanceof KSAdVideoPlayConfigImpl) {
            KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = (KSAdVideoPlayConfigImpl) ksAdVideoPlayConfig;
            this.mIsAudioEnable = kSAdVideoPlayConfigImpl.getVideoSoundValue() != 0 ? kSAdVideoPlayConfigImpl.isVideoSoundEnable() : com.kwad.sdk.core.response.b.a.bH(this.mAdInfo);
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
            if (kSAdVideoPlayConfigImpl.getDataFlowAutoStartValue() == 0 || (eVar = this.ey) == null) {
                return;
            }
            eVar.setDataAutoStart(kSAdVideoPlayConfigImpl.isDataFlowAutoStart());
        }
    }
}
