package com.kwad.components.core.video;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kwad.components.core.video.f;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.bh;
import com.kwad.sdk.widget.KSRelativeLayout;
@Deprecated
/* loaded from: classes.dex */
public class a extends com.kwad.sdk.core.video.videoview.b implements View.OnClickListener {
    private ImageView Al;
    private TextView Am;
    protected boolean RC;
    private boolean RD;
    protected boolean RE;
    private int RF;
    private int RG;
    private KSRelativeLayout RH;
    private RelativeLayout RI;
    private boolean RJ;
    private boolean RK;
    private LinearLayout RL;
    private LinearLayout RM;
    private ImageView RN;
    private ViewGroup RO;
    private TextView RP;
    private c RQ;
    private InterfaceC0212a RR;
    private final com.kwad.sdk.core.download.a.a RS;
    protected AdInfo mAdInfo;
    protected AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    protected Context mContext;
    private boolean nB;
    protected ImageView ne;
    protected TextView nf;
    private ProgressBar ny;

    /* renamed from: com.kwad.components.core.video.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0212a {
        void a(int i, ac.a aVar);
    }

    /* loaded from: classes.dex */
    public interface b extends c {
        void onVideoPlayError(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface c {
        void bj();

        void bk();

        void d(long j);

        void onVideoPlayStart();
    }

    public a(Context context, AdTemplate adTemplate, com.kwad.sdk.core.video.videoview.c cVar) {
        super(context, cVar);
        this.RD = true;
        this.RE = false;
        this.RK = false;
        this.RS = new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.core.video.a.1
            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFailed() {
                a.this.RP.setText(com.kwad.sdk.core.response.b.a.aw(a.this.mAdInfo));
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFinished() {
                a.this.RP.setText(com.kwad.sdk.core.response.b.a.aQ(a.this.mAdTemplate));
            }

            @Override // com.kwad.sdk.core.download.a.a, com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadStarted() {
                a.this.RP.setText(com.kwad.sdk.core.response.b.a.cv(0));
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onIdle() {
                a aVar = a.this;
                aVar.aD(com.kwad.sdk.core.response.b.a.aw(aVar.mAdInfo));
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onInstalled() {
                a.this.RP.setText(com.kwad.sdk.core.response.b.a.U(a.this.mAdInfo));
            }

            @Override // com.kwad.sdk.core.download.a.a
            public final void onPaused(int i) {
                a.this.RP.setText(com.kwad.sdk.core.response.b.a.Cy());
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onProgressUpdate(int i) {
                a.this.RP.setText(com.kwad.sdk.core.response.b.a.cv(i));
            }
        };
        this.mContext = context;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        init();
    }

    private void aK(int i) {
        InterfaceC0212a interfaceC0212a = this.RR;
        if (interfaceC0212a != null) {
            interfaceC0212a.a(i, this.RH.getTouchCoords());
        }
    }

    private void init() {
        ImageView imageView;
        int i;
        com.kwad.sdk.m.l.inflate(this.mContext, R.layout.ksad_feed_video_palyer_controller, this);
        this.RH = (KSRelativeLayout) findViewById(R.id.ksad_video_root_container);
        this.RI = (RelativeLayout) findViewById(R.id.ksad_data_flow_container);
        this.nf = (TextView) findViewById(R.id.ksad_data_flow_play_tip);
        ImageView imageView2 = (ImageView) findViewById(R.id.ksad_data_flow_play_btn);
        this.ne = imageView2;
        imageView2.setOnClickListener(this);
        this.RL = (LinearLayout) findViewById(R.id.ksad_video_network_unavailable);
        this.RM = (LinearLayout) findViewById(R.id.ksad_video_error_container);
        this.ny = (ProgressBar) findViewById(R.id.ksad_video_progress);
        this.RN = (ImageView) findViewById(R.id.ksad_video_thumb_image);
        String url = com.kwad.sdk.core.response.b.a.bi(this.mAdInfo).getUrl();
        if (TextUtils.isEmpty(url)) {
            imageView = this.RN;
            i = 8;
        } else {
            this.RN.setImageDrawable(null);
            KSImageLoader.loadImage(this.RN, url, this.mAdTemplate);
            imageView = this.RN;
            i = 0;
        }
        imageView.setVisibility(i);
        this.nf.setText(bh.U(com.kwad.sdk.core.response.b.a.G(this.mAdInfo) * 1000));
        qu();
    }

    private void qv() {
        ViewGroup viewGroup = this.RO;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    private void qz() {
        this.RI.setVisibility(8);
    }

    private void setTopBottomVisible(boolean z) {
        if (this.RK) {
            return;
        }
        this.ny.setVisibility(z ? 0 : 8);
        this.RJ = z;
    }

    public final void aD(String str) {
        ((TextView) findViewById(R.id.ksad_app_download)).setText(str);
    }

    public final void aJ(boolean z) {
        if (this.RK) {
            return;
        }
        if (!z) {
            this.ny.setVisibility(8);
        } else if (this.RJ) {
            this.ny.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void eR() {
        if (com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
            this.Al = (ImageView) findViewById(R.id.ksad_video_complete_app_icon);
            this.Am = (TextView) findViewById(R.id.ksad_app_name);
            this.RP = (TextView) findViewById(R.id.ksad_app_download);
            KSImageLoader.loadAppIcon(this.Al, com.kwad.sdk.core.response.b.d.cp(this.mAdTemplate), this.mAdTemplate, 12);
            this.Am.setText(com.kwad.sdk.core.response.b.a.bO(this.mAdInfo));
            this.RP.setText(com.kwad.sdk.core.response.b.a.aw(this.mAdInfo));
            this.RO = (LinearLayout) findViewById(R.id.ksad_video_complete_app_container);
            this.Al.setOnClickListener(this);
            this.Am.setOnClickListener(this);
            this.RP.setOnClickListener(this);
            com.kwad.components.core.e.d.c cVar = new com.kwad.components.core.e.d.c(this.mAdTemplate);
            this.mApkDownloadHelper = cVar;
            cVar.b(this.RS);
        } else {
            TextView textView = (TextView) findViewById(R.id.ksad_h5_open);
            this.RP = textView;
            textView.setText(com.kwad.sdk.core.response.b.a.aw(this.mAdInfo));
            this.RP.setOnClickListener(this);
            this.RO = (LinearLayout) findViewById(R.id.ksad_video_complete_h5_container);
        }
        this.RO.setOnClickListener(this);
        this.RO.setVisibility(0);
    }

    public AdTemplate getAdTemplate() {
        return this.mAdTemplate;
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    public final void m(int i, int i2) {
        this.RG = i2;
        this.RF = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.ne) {
            this.RC = true;
            this.RD = true;
            qA();
        } else if (view == this.Al) {
            aK(1);
        } else if (view == this.Am) {
            aK(2);
        } else if (view == this.RP) {
            aK(3);
        } else {
            aK(4);
        }
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    public final void onPlayStateChanged(int i) {
        com.kwad.sdk.core.e.c.d("AdVideoPlayerController", "onPlayStateChanged playState=" + i);
        if (i == -1) {
            qK();
            setTopBottomVisible(false);
            this.RL.setVisibility(8);
            this.RM.setVisibility(0);
            c cVar = this.RQ;
            if (cVar instanceof f.a) {
                ((f.a) cVar).onVideoPlayError(this.RF, this.RG);
            }
            c cVar2 = this.RQ;
            if (cVar2 instanceof b) {
                ((b) cVar2).onVideoPlayError(this.RF, this.RG);
            }
            com.kwad.components.core.p.a.pC().b(this.mAdTemplate, this.RF, this.RG);
        } else if (i == 4) {
            c cVar3 = this.RQ;
            if (cVar3 != null) {
                cVar3.bj();
            }
            this.RN.setVisibility(8);
        } else if (i == 9) {
            c cVar4 = this.RQ;
            if (cVar4 != null) {
                cVar4.bk();
            }
            qK();
            this.mAdTemplate.setmCurPlayTime(-1L);
            setTopBottomVisible(false);
            KSImageLoader.loadImage(this.RN, com.kwad.sdk.core.response.b.a.P(this.mAdInfo), this.mAdTemplate);
            this.RN.setVisibility(0);
            eR();
        } else if (i == 1) {
            qz();
            this.RL.setVisibility(8);
            this.RM.setVisibility(8);
            this.ny.setVisibility(8);
            qv();
        } else if (i != 2) {
        } else {
            c cVar5 = this.RQ;
            if (cVar5 != null) {
                cVar5.onVideoPlayStart();
            }
            setTopBottomVisible(true);
            qJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void qA() {
        if (!this.awn.isIdle()) {
            if (this.awn.isPaused() || this.awn.Dv()) {
                qB();
                this.awn.restart();
            }
        } else if (!ag.isNetworkConnected(this.mContext)) {
            qw();
        } else {
            qx();
            if (!this.RE && ((!this.RD || !ag.isWifiConnected(this.mContext)) && (!this.RD || (!this.nB && !this.RC)))) {
                qy();
                return;
            }
            qB();
            this.awn.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void qB() {
        this.awn.setKsPlayLogParam(com.kwad.sdk.contentalliance.a.a.a.as(this.mAdTemplate));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void qC() {
        this.awn.pause();
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    public final void qD() {
        long currentPosition = this.awn.getCurrentPosition();
        long duration = this.awn.getDuration();
        this.ny.setSecondaryProgress(this.awn.getBufferPercentage());
        this.mAdTemplate.setmCurPlayTime(currentPosition);
        this.ny.setProgress((int) ((((float) currentPosition) * 100.0f) / ((float) duration)));
        c cVar = this.RQ;
        if (cVar != null) {
            cVar.d(currentPosition);
        }
    }

    public final void qE() {
        this.RK = true;
        this.ny.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void qu() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void qw() {
        this.RL.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void qx() {
        this.RL.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void qy() {
        this.RI.setVisibility(0);
        this.RN.setVisibility(0);
        this.mAdTemplate.mVideoPlayerStatus.setVideoPlayerBehavior(2);
    }

    public void release() {
        this.awn.release();
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    public final void reset() {
        qK();
        this.ny.setProgress(0);
        this.ny.setSecondaryProgress(0);
        qz();
        this.RL.setVisibility(8);
        this.RM.setVisibility(8);
        this.ny.setVisibility(8);
        this.RN.setVisibility(8);
        this.RI.setVisibility(8);
        this.mAdTemplate.mVideoPlayerStatus.setVideoPlayerBehavior(1);
        qv();
    }

    public void setAdClickListener(InterfaceC0212a interfaceC0212a) {
        this.RR = interfaceC0212a;
    }

    public void setCanControlPlay(boolean z) {
        this.RE = z;
    }

    public void setDataAutoStart(boolean z) {
        this.RD = z;
    }

    public void setDataFlowAutoStart(boolean z) {
        this.nB = z;
    }

    public void setVideoPlayCallback(c cVar) {
        this.RQ = cVar;
    }
}
