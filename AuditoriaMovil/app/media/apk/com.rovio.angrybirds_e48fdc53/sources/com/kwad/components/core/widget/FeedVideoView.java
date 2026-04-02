package com.kwad.components.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.t.n;
import com.kwad.components.core.video.a;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.contentalliance.a.a.b;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache;
import com.kwad.sdk.core.view.ScaleAnimSeekBar;
import com.kwad.sdk.m.l;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.bh;
import com.kwad.sdk.widget.RatioFrameLayout;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class FeedVideoView extends b<AdTemplate> implements NestedScrollingChild {
    private com.kwad.components.core.video.e OB;
    private NestedScrollingChildHelper Oj;
    private ImageView YA;
    private ImageView YB;
    private ViewGroup YC;
    private ViewGroup YD;
    private TextView YE;
    private ViewGroup YF;
    private ViewGroup YG;
    private int YH;
    private boolean YI;
    private boolean YJ;
    private long YK;
    private boolean YL;
    private KsAdVideoPlayConfig YM;
    private a YN;
    private View YO;
    private boolean YP;
    private Runnable YQ;
    private n YR;
    private RatioFrameLayout Yr;
    private TextView Ys;
    private TextView Yt;
    private TextView Yu;
    private View Yv;
    private KSCornerImageView Yw;
    private TextView Yx;
    private ScaleAnimSeekBar Yy;
    private ImageView Yz;
    private View.OnClickListener bK;
    private KsAppDownloadListener cn;
    private List<Integer> cr;
    private TextView ek;
    private ImageView ew;
    private com.kwad.sdk.core.video.videoview.a ex;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;

    /* loaded from: classes.dex */
    public interface a {
        void oK();

        void oL();
    }

    public FeedVideoView(Context context) {
        super(context);
        this.YH = 100;
        Runnable runnable = new Runnable() { // from class: com.kwad.components.core.widget.FeedVideoView.5
            @Override // java.lang.Runnable
            public final void run() {
                FeedVideoView.this.YC.setVisibility(8);
                FeedVideoView.this.YB.setVisibility(8);
                if (FeedVideoView.this.OB != null) {
                    FeedVideoView.this.OB.aJ(true);
                }
            }
        };
        this.YQ = runnable;
        this.YR = new n(runnable);
    }

    public FeedVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.YH = 100;
        Runnable runnable = new Runnable() { // from class: com.kwad.components.core.widget.FeedVideoView.5
            @Override // java.lang.Runnable
            public final void run() {
                FeedVideoView.this.YC.setVisibility(8);
                FeedVideoView.this.YB.setVisibility(8);
                if (FeedVideoView.this.OB != null) {
                    FeedVideoView.this.OB.aJ(true);
                }
            }
        };
        this.YQ = runnable;
        this.YR = new n(runnable);
    }

    public FeedVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.YH = 100;
        Runnable runnable = new Runnable() { // from class: com.kwad.components.core.widget.FeedVideoView.5
            @Override // java.lang.Runnable
            public final void run() {
                FeedVideoView.this.YC.setVisibility(8);
                FeedVideoView.this.YB.setVisibility(8);
                if (FeedVideoView.this.OB != null) {
                    FeedVideoView.this.OB.aJ(true);
                }
            }
        };
        this.YQ = runnable;
        this.YR = new n(runnable);
    }

    private void a(com.kwad.components.core.video.a aVar, final com.kwad.sdk.core.video.videoview.a aVar2) {
        this.YF.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.widget.FeedVideoView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (FeedVideoView.this.YC.getVisibility() != 8) {
                    if (FeedVideoView.this.getHandler() != null) {
                        FeedVideoView.this.getHandler().removeCallbacks(FeedVideoView.this.YQ);
                        if (FeedVideoView.this.YL) {
                            return;
                        }
                        FeedVideoView.this.getHandler().postDelayed(FeedVideoView.this.YR, 1000L);
                    }
                } else if (!FeedVideoView.this.ex.isCompleted()) {
                    FeedVideoView.this.YC.setVisibility(0);
                    FeedVideoView.this.YB.setVisibility(0);
                    if (FeedVideoView.this.OB != null) {
                        FeedVideoView.this.OB.aJ(false);
                    }
                    if (FeedVideoView.this.getHandler() != null) {
                        FeedVideoView.this.getHandler().removeCallbacks(FeedVideoView.this.YQ);
                        FeedVideoView.this.getHandler().postDelayed(FeedVideoView.this.YR, PushUIConfig.dismissTime);
                    }
                } else if (FeedVideoView.this.YH != 101) {
                    if (FeedVideoView.this.bK != null) {
                        FeedVideoView.this.bK.onClick(view);
                    }
                } else {
                    FeedVideoView.this.YC.setVisibility(0);
                    FeedVideoView.this.YB.setVisibility(8);
                    if (FeedVideoView.this.OB != null) {
                        FeedVideoView.this.OB.aJ(false);
                    }
                    if (FeedVideoView.this.getHandler() != null) {
                        FeedVideoView.this.getHandler().removeCallbacks(FeedVideoView.this.YQ);
                        FeedVideoView.this.getHandler().postDelayed(FeedVideoView.this.YR, PushUIConfig.dismissTime);
                    }
                }
            }
        });
        aVar.setVideoPlayCallback(new a.c() { // from class: com.kwad.components.core.widget.FeedVideoView.7
            private boolean cs = false;

            @Override // com.kwad.components.core.video.a.c
            public final void bj() {
                if (!FeedVideoView.this.YP) {
                    FeedVideoView.a(FeedVideoView.this, true);
                    if (com.kwad.sdk.core.response.b.a.af(FeedVideoView.this.mAdInfo) != 0) {
                        FeedVideoView.this.ex.setVideoSoundEnable(!com.kwad.sdk.core.response.b.a.ah(FeedVideoView.this.mAdInfo));
                    }
                    if (com.kwad.sdk.core.response.b.a.af(FeedVideoView.this.mAdInfo) != 0) {
                        FeedVideoView.this.ex.setLooping(com.kwad.sdk.core.response.b.a.ag(FeedVideoView.this.mAdInfo));
                    }
                }
                if (this.cs) {
                    return;
                }
                this.cs = true;
                com.kwad.components.core.p.a.pC().a(FeedVideoView.this.mAdTemplate, System.currentTimeMillis(), 1);
            }

            @Override // com.kwad.components.core.video.a.c
            public final void bk() {
                com.kwad.sdk.core.report.a.aE(FeedVideoView.this.mAdTemplate);
                FeedVideoView.this.YC.setVisibility(8);
                FeedVideoView.this.YB.setVisibility(8);
                FeedVideoView.this.Yy.setProgress(100);
                FeedVideoView.this.Yt.setText(bh.U(aVar2.getDuration()));
            }

            @Override // com.kwad.components.core.video.a.c
            public final void d(long j) {
                FeedVideoView.this.c(j);
                float duration = (((float) j) * 100.0f) / ((float) aVar2.getDuration());
                if (!FeedVideoView.this.YL) {
                    FeedVideoView.this.Yy.setProgress((int) duration);
                    FeedVideoView.this.Yt.setText(bh.U(j));
                }
                FeedVideoView.this.Ys.setText(bh.U(aVar2.getDuration()));
            }

            @Override // com.kwad.components.core.video.a.c
            public final void onVideoPlayStart() {
                if (!FeedVideoView.this.YP) {
                    FeedVideoView.a(FeedVideoView.this, true);
                    if (com.kwad.sdk.core.response.b.a.af(FeedVideoView.this.mAdInfo) != 0) {
                        FeedVideoView.this.ex.setVideoSoundEnable(true ^ com.kwad.sdk.core.response.b.a.ah(FeedVideoView.this.mAdInfo));
                    }
                    if (com.kwad.sdk.core.response.b.a.af(FeedVideoView.this.mAdInfo) != 0) {
                        FeedVideoView.this.ex.setLooping(com.kwad.sdk.core.response.b.a.ag(FeedVideoView.this.mAdInfo));
                    }
                }
                com.kwad.sdk.core.report.a.aD(FeedVideoView.this.mAdTemplate);
                FeedVideoView.this.Ys.setText(bh.U(aVar2.getDuration()));
            }
        });
        this.OB.setAdClickListener(new a.InterfaceC0212a() { // from class: com.kwad.components.core.widget.FeedVideoView.8
            @Override // com.kwad.components.core.video.a.InterfaceC0212a
            public final void a(int i, ac.a aVar3) {
                int i2 = 171;
                int i3 = 2;
                boolean z = false;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            i2 = com.kwad.sdk.core.response.b.a.af(FeedVideoView.this.mAdInfo) != 0 ? 50 : 83;
                            i3 = 1;
                            z = true;
                        } else if (com.kwad.sdk.core.response.b.a.af(FeedVideoView.this.mAdInfo) == 0) {
                            i2 = 108;
                        }
                    } else if (com.kwad.sdk.core.response.b.a.af(FeedVideoView.this.mAdInfo) == 0) {
                        i2 = 82;
                    }
                } else if (com.kwad.sdk.core.response.b.a.af(FeedVideoView.this.mAdInfo) == 0) {
                    i2 = 13;
                }
                z.b bVar = new z.b();
                bVar.jK = aVar3;
                bVar.jI = i2;
                com.kwad.components.core.e.d.a.a(new a.C0197a(FeedVideoView.this.getContext()).S(FeedVideoView.this.mAdTemplate).aq(true).b(FeedVideoView.this.mApkDownloadHelper).ao(i3).al(z).an(true).a(bVar).a(new a.b() { // from class: com.kwad.components.core.widget.FeedVideoView.8.1
                    @Override // com.kwad.components.core.e.d.a.b
                    public final void onAdClicked() {
                        FeedVideoView.this.ed();
                    }
                }));
            }
        });
        this.Yy.setOnSeekBarChangeListener(new ScaleAnimSeekBar.a() { // from class: com.kwad.components.core.widget.FeedVideoView.9
            @Override // com.kwad.sdk.core.view.ScaleAnimSeekBar.a
            public final void a(ScaleAnimSeekBar scaleAnimSeekBar) {
                FeedVideoView.this.Yy.bg(false);
                aVar2.seekTo((int) ((aVar2.getDuration() * scaleAnimSeekBar.getProgress()) / scaleAnimSeekBar.getMaxProgress()));
                if (FeedVideoView.this.getHandler() != null) {
                    FeedVideoView.this.getHandler().removeCallbacks(FeedVideoView.this.YR);
                    FeedVideoView.this.getHandler().postDelayed(FeedVideoView.this.YR, PushUIConfig.dismissTime);
                }
                FeedVideoView.this.YL = false;
            }

            @Override // com.kwad.sdk.core.view.ScaleAnimSeekBar.a
            public final void a(ScaleAnimSeekBar scaleAnimSeekBar, boolean z) {
                if (z) {
                    FeedVideoView.this.Yy.bg(true);
                    FeedVideoView.this.getHandler().removeCallbacks(FeedVideoView.this.YR);
                    FeedVideoView.this.YL = true;
                    FeedVideoView.this.Yt.setText(bh.U((int) ((aVar2.getDuration() * scaleAnimSeekBar.getProgress()) / scaleAnimSeekBar.getMaxProgress())));
                }
            }

            @Override // com.kwad.sdk.core.view.ScaleAnimSeekBar.a
            public final void sw() {
                FeedVideoView.this.Yy.bg(true);
                FeedVideoView.this.getHandler().removeCallbacks(FeedVideoView.this.YR);
                FeedVideoView.this.YL = true;
            }
        });
        this.Yz.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.widget.FeedVideoView.10
            /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r4) {
                /*
                    r3 = this;
                    com.kwad.sdk.core.video.videoview.a r4 = r2
                    boolean r4 = r4.isPaused()
                    if (r4 != 0) goto L58
                    com.kwad.sdk.core.video.videoview.a r4 = r2
                    boolean r4 = r4.isIdle()
                    if (r4 == 0) goto L11
                    goto L58
                L11:
                    com.kwad.sdk.core.video.videoview.a r4 = r2
                    boolean r4 = r4.isPlaying()
                    if (r4 == 0) goto L8b
                    com.kwad.components.core.widget.FeedVideoView r4 = com.kwad.components.core.widget.FeedVideoView.this
                    com.kwad.components.core.video.e r4 = com.kwad.components.core.widget.FeedVideoView.e(r4)
                    r4.qW()
                    com.kwad.components.core.widget.FeedVideoView r4 = com.kwad.components.core.widget.FeedVideoView.this
                    android.widget.ImageView r4 = com.kwad.components.core.widget.FeedVideoView.d(r4)
                    r0 = 0
                    r4.setVisibility(r0)
                    com.kwad.components.core.widget.FeedVideoView r4 = com.kwad.components.core.widget.FeedVideoView.this
                    android.widget.ImageView r4 = com.kwad.components.core.widget.FeedVideoView.d(r4)
                    com.kwad.components.core.widget.FeedVideoView r0 = com.kwad.components.core.widget.FeedVideoView.this
                    android.content.Context r0 = r0.getContext()
                    android.content.res.Resources r0 = r0.getResources()
                    int r1 = com.kwad.sdk.R.drawable.ksad_video_play_176
                    android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
                    r4.setImageDrawable(r0)
                    com.kwad.components.core.widget.FeedVideoView r4 = com.kwad.components.core.widget.FeedVideoView.this
                    android.widget.ImageView r4 = com.kwad.components.core.widget.FeedVideoView.p(r4)
                    com.kwad.components.core.widget.FeedVideoView r0 = com.kwad.components.core.widget.FeedVideoView.this
                    android.content.Context r0 = r0.getContext()
                    android.content.res.Resources r0 = r0.getResources()
                    int r1 = com.kwad.sdk.R.drawable.ksad_video_player_play_btn
                    goto L84
                L58:
                    com.kwad.components.core.widget.FeedVideoView r4 = com.kwad.components.core.widget.FeedVideoView.this
                    com.kwad.components.core.video.e r4 = com.kwad.components.core.widget.FeedVideoView.e(r4)
                    r4.qX()
                    com.kwad.components.core.widget.FeedVideoView r4 = com.kwad.components.core.widget.FeedVideoView.this
                    android.widget.ImageView r4 = com.kwad.components.core.widget.FeedVideoView.p(r4)
                    com.kwad.components.core.widget.FeedVideoView r0 = com.kwad.components.core.widget.FeedVideoView.this
                    android.content.res.Resources r0 = r0.getResources()
                    int r1 = com.kwad.sdk.R.drawable.ksad_video_player_pause_btn
                    android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
                    r4.setImageDrawable(r0)
                    com.kwad.components.core.widget.FeedVideoView r4 = com.kwad.components.core.widget.FeedVideoView.this
                    android.widget.ImageView r4 = com.kwad.components.core.widget.FeedVideoView.d(r4)
                    com.kwad.components.core.widget.FeedVideoView r0 = com.kwad.components.core.widget.FeedVideoView.this
                    android.content.res.Resources r0 = r0.getResources()
                    int r1 = com.kwad.sdk.R.drawable.ksad_video_player_pause_center
                L84:
                    android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
                    r4.setImageDrawable(r0)
                L8b:
                    com.kwad.components.core.widget.FeedVideoView r4 = com.kwad.components.core.widget.FeedVideoView.this
                    android.os.Handler r4 = r4.getHandler()
                    if (r4 == 0) goto Lb3
                    com.kwad.components.core.widget.FeedVideoView r4 = com.kwad.components.core.widget.FeedVideoView.this
                    android.os.Handler r4 = r4.getHandler()
                    com.kwad.components.core.widget.FeedVideoView r0 = com.kwad.components.core.widget.FeedVideoView.this
                    com.kwad.components.core.t.n r0 = com.kwad.components.core.widget.FeedVideoView.h(r0)
                    r4.removeCallbacks(r0)
                    com.kwad.components.core.widget.FeedVideoView r4 = com.kwad.components.core.widget.FeedVideoView.this
                    android.os.Handler r4 = r4.getHandler()
                    com.kwad.components.core.widget.FeedVideoView r0 = com.kwad.components.core.widget.FeedVideoView.this
                    com.kwad.components.core.t.n r0 = com.kwad.components.core.widget.FeedVideoView.h(r0)
                    r1 = 5000(0x1388, double:2.4703E-320)
                    r4.postDelayed(r0, r1)
                Lb3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.core.widget.FeedVideoView.AnonymousClass10.onClick(android.view.View):void");
            }
        });
        this.YB.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.widget.FeedVideoView.11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (FeedVideoView.this.ex.isPaused() || FeedVideoView.this.ex.isIdle()) {
                    FeedVideoView.this.pu();
                } else if (FeedVideoView.this.ex.isPlaying()) {
                    FeedVideoView.this.qC();
                }
                if (FeedVideoView.this.getHandler() != null) {
                    FeedVideoView.this.getHandler().removeCallbacks(FeedVideoView.this.YR);
                    FeedVideoView.this.getHandler().postDelayed(FeedVideoView.this.YR, PushUIConfig.dismissTime);
                }
            }
        });
        this.YD.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.widget.FeedVideoView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedVideoView.this.su();
            }
        });
        this.YA.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.widget.FeedVideoView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (FeedVideoView.this.YH == 100) {
                    FeedVideoView.this.st();
                } else if (FeedVideoView.this.YH == 101) {
                    FeedVideoView.this.su();
                }
            }
        });
    }

    static /* synthetic */ boolean a(FeedVideoView feedVideoView, boolean z) {
        feedVideoView.YP = true;
        return true;
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

    private KsAppDownloadListener getAppDownloadListener() {
        if (this.cn == null) {
            this.cn = new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.core.widget.FeedVideoView.1
                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onDownloadFailed() {
                    FeedVideoView.this.Yu.setText(com.kwad.sdk.core.response.b.a.aw(FeedVideoView.this.mAdInfo));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onDownloadFinished() {
                    FeedVideoView.this.Yu.setText(com.kwad.sdk.core.response.b.a.aQ(FeedVideoView.this.mAdTemplate));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onIdle() {
                    FeedVideoView.this.Yu.setText(com.kwad.sdk.core.response.b.a.aw(FeedVideoView.this.mAdInfo));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onInstalled() {
                    FeedVideoView.this.Yu.setText(com.kwad.sdk.core.response.b.a.U(FeedVideoView.this.mAdInfo));
                }

                @Override // com.kwad.sdk.core.download.a.a
                public final void onPaused(int i) {
                    FeedVideoView.this.Yu.setText(com.kwad.sdk.core.response.b.a.cw(i));
                }

                @Override // com.kwad.sdk.api.KsAppDownloadListener
                public final void onProgressUpdate(int i) {
                    FeedVideoView.this.Yu.setText(com.kwad.sdk.core.response.b.a.cv(i));
                }
            };
        }
        return this.cn;
    }

    private boolean ss() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = ((elapsedRealtime - this.YK) > 888L ? 1 : ((elapsedRealtime - this.YK) == 888L ? 0 : -1));
        if (i > 0) {
            this.YK = elapsedRealtime;
        }
        return i > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void st() {
        a aVar = this.YN;
        if (aVar != null) {
            aVar.oK();
        }
        if ((this.YH == 100) && ss()) {
            this.YD.setVisibility(0);
            this.YE.setText(this.mAdInfo.adBaseInfo.adDescription);
            boolean z = com.kwad.sdk.core.response.b.a.L(this.mAdInfo) > com.kwad.sdk.core.response.b.a.K(this.mAdInfo);
            this.YI = ai.cm(getContext());
            getContext();
            this.YJ = ai.IK();
            Context context = getContext();
            if (z) {
                ai.cp(context);
            } else {
                ai.co(context);
            }
            ViewGroup viewGroup = (ViewGroup) this.YF.getParent();
            this.YG = viewGroup;
            if (viewGroup != null) {
                viewGroup.removeView(this.YF);
                View view = new View(this.YF.getContext());
                this.YO = view;
                view.setLayoutParams(new ViewGroup.LayoutParams(this.YF.getWidth(), this.YF.getHeight()));
                viewGroup.addView(this.YO);
            }
            ai.b(getContext(), false);
            Activity dt = l.dt(getContext());
            if (dt != null) {
                ViewGroup viewGroup2 = (ViewGroup) dt.getWindow().getDecorView();
                this.YF.setLayoutParams(new ViewGroup.LayoutParams(viewGroup2.getWidth(), viewGroup2.getHeight()));
                if (z && viewGroup2.getWidth() != 0) {
                    this.Yr.setRatio(viewGroup2.getHeight() / viewGroup2.getWidth());
                }
                viewGroup2.addView(this.YF, new FrameLayout.LayoutParams(-1, -1));
                setUIWithStateAndMode(101);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void su() {
        if ((this.YH == 101) & ss()) {
            this.YD.setVisibility(8);
            if (this.YI) {
                ai.cm(getContext());
            } else {
                ai.cn(getContext());
            }
            if (this.YJ) {
                ai.cp(getContext());
            } else {
                ai.co(getContext());
            }
            ai.b(getContext(), true);
            ViewGroup viewGroup = (ViewGroup) this.YF.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.YF);
            }
            this.YF.setLayoutParams(new ViewGroup.LayoutParams(this.YG.getWidth(), this.YG.getHeight()));
            this.Yr.setRatio(0.5600000023841858d);
            View view = this.YO;
            if (view != null) {
                this.YG.removeView(view);
                this.YO = null;
            }
            this.YG.addView(this.YF, new FrameLayout.LayoutParams(-1, -2));
            this.YF.requestLayout();
            setUIWithStateAndMode(100);
        }
        a aVar = this.YN;
        if (aVar != null) {
            aVar.oL();
        }
    }

    public final void a(KsAdVideoPlayConfig ksAdVideoPlayConfig, com.kwad.components.core.e.d.c cVar) {
        this.mApkDownloadHelper = cVar;
        this.YP = false;
        com.kwad.sdk.core.response.model.b bi = com.kwad.sdk.core.response.b.a.bi(this.mAdInfo);
        this.YM = ksAdVideoPlayConfig;
        String url = bi.getUrl();
        if (TextUtils.isEmpty(url)) {
            this.ew.setVisibility(8);
        } else {
            this.ew.setImageDrawable(null);
            KSImageLoader.loadImage(this.ew, url, this.mAdTemplate);
            this.ew.setVisibility(0);
        }
        this.cr = com.kwad.sdk.core.response.b.a.bd(this.mAdInfo);
        String F = com.kwad.sdk.core.response.b.a.F(this.mAdInfo);
        if (TextUtils.isEmpty(F)) {
            return;
        }
        this.ex = AdVideoPlayerViewCache.getInstance().dJ(F);
        if (com.kwad.sdk.core.response.b.a.ai(this.mAdInfo)) {
            this.ek.setVisibility(8);
            View view = this.Yv;
            if (view != null) {
                view.setVisibility(0);
                this.Yu.setText(com.kwad.sdk.core.response.b.a.aw(this.mAdInfo));
                this.Yx.setText(com.kwad.sdk.core.response.b.a.bO(this.mAdInfo));
                KSImageLoader.loadAppIcon(this.Yw, com.kwad.sdk.core.response.b.a.bQ(this.mAdInfo), this.mAdTemplate, 4);
                com.kwad.components.core.e.d.c cVar2 = this.mApkDownloadHelper;
                if (cVar2 != null) {
                    cVar2.b(getAppDownloadListener());
                }
                this.Yu.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.widget.FeedVideoView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        if (FeedVideoView.this.bK != null) {
                            FeedVideoView.this.bK.onClick(view2);
                        }
                    }
                });
            }
        } else {
            View view2 = this.Yv;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            this.ek.setVisibility(0);
        }
        com.kwad.sdk.core.video.videoview.a aVar = this.ex;
        if (aVar == null) {
            this.ex = new com.kwad.sdk.core.video.videoview.a(getContext());
            com.kwad.sdk.core.response.b.a.T(this.mAdInfo);
            this.ex.a(new b.a(this.mAdTemplate).a(this.mAdTemplate.mVideoPlayerStatus).cm(com.kwad.sdk.core.response.b.d.cm(this.mAdTemplate)).cn(com.kwad.sdk.core.response.b.f.b(com.kwad.sdk.core.response.b.d.cl(this.mAdTemplate))).b(new com.kwad.sdk.contentalliance.a.a.a(this.mAdTemplate, System.currentTimeMillis())).yP(), null);
            com.kwad.components.core.video.e eVar = new com.kwad.components.core.video.e(this.mContext, this.mAdTemplate, this.ex, ksAdVideoPlayConfig);
            this.OB = eVar;
            eVar.setDataFlowAutoStart(ksAdVideoPlayConfig.isDataFlowAutoStart());
            this.ex.setController(this.OB);
            this.OB.setAutoRelease(false);
            if (com.kwad.sdk.core.config.d.yV() == 2) {
                AdVideoPlayerViewCache.getInstance().a(F, this.ex);
            }
        } else {
            if (aVar.getTag() != null) {
                try {
                    this.cr = (List) this.ex.getTag();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            com.kwad.components.core.video.e eVar2 = (com.kwad.components.core.video.e) this.ex.getController();
            this.OB = eVar2;
            eVar2.setAutoRelease(false);
            this.OB.getAdTemplate().mAdWebVideoPageShowing = true;
        }
        this.ex.setVideoSoundEnable(ksAdVideoPlayConfig.isVideoSoundEnable());
        if (this.ex.getParent() != null) {
            ((ViewGroup) this.ex.getParent()).removeView(this.ex);
            this.OB.qU();
        }
        if (this.Yr.getTag() != null) {
            RatioFrameLayout ratioFrameLayout = this.Yr;
            ratioFrameLayout.removeView((View) ratioFrameLayout.getTag());
            this.Yr.setTag(null);
        }
        this.Yr.addView(this.ex);
        this.Yr.setTag(this.ex);
        this.YC.setVisibility(8);
        this.YB.setVisibility(8);
        if (this.mAdInfo.adConversionInfo.h5Type == 1) {
            this.ek.setVisibility(8);
        } else {
            this.ek.setVisibility(0);
            this.ek.setText(this.mAdInfo.adBaseInfo.adDescription);
        }
        a(this.OB, this.ex);
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.h.c
    public final void aK() {
        super.aK();
        com.kwad.sdk.core.video.videoview.a aVar = this.ex;
        if (aVar == null || aVar.isPlaying()) {
            return;
        }
        pu();
        if (getHandler() != null) {
            getHandler().removeCallbacks(this.YR);
            getHandler().postDelayed(this.YR, PushUIConfig.dismissTime);
        }
    }

    @Override // com.kwad.components.core.widget.b, com.kwad.sdk.core.h.c
    public final void aL() {
        super.aL();
        if (this.ex != null) {
            qC();
            if (getHandler() != null) {
                getHandler().removeCallbacks(this.YR);
                getHandler().postDelayed(this.YR, PushUIConfig.dismissTime);
            }
        }
    }

    @Override // com.kwad.components.core.widget.b
    public final void b(AdTemplate adTemplate) {
        super.b((FeedVideoView) adTemplate);
    }

    @Override // com.kwad.components.core.widget.b
    protected final void ba() {
        this.Oj = new NestedScrollingChildHelper(this);
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) findViewById(R.id.ksad_video_container);
        this.Yr = ratioFrameLayout;
        ratioFrameLayout.setRatio(0.5600000023841858d);
        this.ew = (ImageView) findViewById(R.id.ksad_video_first_frame_container);
        this.ek = (TextView) findViewById(R.id.ksad_video_text_below);
        ScaleAnimSeekBar scaleAnimSeekBar = (ScaleAnimSeekBar) findViewById(R.id.ksad_web_video_seek_bar);
        this.Yy = scaleAnimSeekBar;
        scaleAnimSeekBar.setMaxProgress(100);
        this.Yy.setMinProgress(0);
        this.Yu = (TextView) findViewById(R.id.ksad_video_text_below_action_bar);
        this.Yv = findViewById(R.id.ksad_video_text_below_action_icon_layout);
        this.Yx = (TextView) findViewById(R.id.ksad_video_text_below_action_title);
        this.Yw = (KSCornerImageView) findViewById(R.id.ksad_video_text_below_action_icon);
        this.Ys = (TextView) findViewById(R.id.ksad_video_control_play_total);
        this.Yt = (TextView) findViewById(R.id.ksad_video_control_play_duration);
        this.Yz = (ImageView) findViewById(R.id.ksad_video_control_play_button);
        this.YB = (ImageView) findViewById(R.id.ksad_video_control_play_status);
        this.YA = (ImageView) findViewById(R.id.ksad_video_control_fullscreen);
        this.YC = (ViewGroup) findViewById(R.id.ksad_video_control_container);
        this.YF = (ViewGroup) findViewById(R.id.ksad_feed_video_container);
        this.YD = (ViewGroup) findViewById(R.id.ksad_video_control_fullscreen_container);
        this.YE = (TextView) findViewById(R.id.ksad_video_control_fullscreen_title);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.Oj.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.Oj.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.Oj.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.Oj.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // com.kwad.components.core.widget.b
    protected int getLayoutId() {
        return R.layout.ksad_feed_video;
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.Oj.hasNestedScrollingParent();
    }

    public final boolean isComplete() {
        com.kwad.sdk.core.video.videoview.a aVar = this.ex;
        if (aVar != null) {
            return aVar.isCompleted();
        }
        return true;
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.Oj.isNestedScrollingEnabled();
    }

    public final void pq() {
        this.OB.qU();
    }

    public final void pu() {
        this.OB.qX();
        this.OB.setVisibility(0);
        this.OB.setAlpha(1.0f);
        this.Yz.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ksad_video_player_pause_btn));
        this.YB.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ksad_video_player_pause_center));
    }

    public final void qC() {
        this.OB.qW();
        this.YB.setVisibility(0);
        this.YB.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ksad_video_play_176));
        this.Yz.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ksad_video_player_play_btn));
    }

    public final void release() {
        com.kwad.components.core.video.e eVar = this.OB;
        if (eVar != null) {
            eVar.release();
        }
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.Oj.setNestedScrollingEnabled(z);
    }

    public void setOnEndBtnClickListener(View.OnClickListener onClickListener) {
        this.bK = onClickListener;
    }

    protected void setUIWithStateAndMode(int i) {
        ImageView imageView;
        Resources resources;
        int i2;
        if (i == 101) {
            imageView = this.YA;
            resources = getContext().getResources();
            i2 = R.drawable.ksad_video_player_exit_fullscreen_btn;
        } else {
            imageView = this.YA;
            resources = getContext().getResources();
            i2 = R.drawable.ksad_video_player_fullscreen_btn;
        }
        imageView.setImageDrawable(resources.getDrawable(i2));
        this.YH = i;
    }

    public void setWindowFullScreenListener(a aVar) {
        this.YN = aVar;
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return this.Oj.startNestedScroll(i);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.Oj.stopNestedScroll();
    }

    public final boolean sv() {
        if (this.YH == 101) {
            su();
            return true;
        }
        return false;
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, com.kwad.sdk.widget.i
    public final void z(View view) {
        super.z(view);
    }
}
