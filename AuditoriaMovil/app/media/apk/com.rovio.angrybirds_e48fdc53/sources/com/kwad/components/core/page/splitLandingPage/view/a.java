package com.kwad.components.core.page.splitLandingPage.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kwad.components.core.t.m;
import com.kwad.components.core.video.a;
import com.kwad.components.core.video.e;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.contentalliance.a.a.b;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.b.f;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache;
import com.kwad.sdk.m.l;
import java.io.PrintStream;
/* loaded from: classes.dex */
public final class a {
    private ImageView Ii;
    private FrameLayout OA;
    private e OB;
    private final WindowManager.LayoutParams OC = new WindowManager.LayoutParams();
    private InterfaceC0208a OD;
    private WindowManager Ox;
    private com.kwad.components.core.page.splitLandingPage.a.a Oy;
    private FrameLayout Oz;
    private ImageView ew;
    private com.kwad.sdk.core.video.videoview.a ex;
    private Context mContext;
    private ViewGroup yZ;

    /* renamed from: com.kwad.components.core.page.splitLandingPage.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0208a {
        boolean pr();
    }

    public a(Context context, com.kwad.components.core.page.splitLandingPage.a.a aVar) {
        if (context == null) {
            return;
        }
        Context wrapContextIfNeed = l.wrapContextIfNeed(context);
        this.mContext = wrapContextIfNeed;
        this.Oy = aVar;
        WindowManager windowManager = (WindowManager) wrapContextIfNeed.getSystemService("window");
        this.Ox = windowManager;
        if (windowManager == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.mContext).inflate(R.layout.ksad_split_mini_video, (ViewGroup) null);
        this.yZ = viewGroup;
        this.Oz = (FrameLayout) viewGroup.findViewById(R.id.ksad_split_texture);
        this.OA = (FrameLayout) this.yZ.findViewById(R.id.ksad_video_container);
        this.ew = (ImageView) this.yZ.findViewById(R.id.ksad_video_first_frame_container);
        this.Ii = (ImageView) this.yZ.findViewById(R.id.ksad_split_mini_close_btn);
        this.Oz.setOnTouchListener(new View.OnTouchListener() { // from class: com.kwad.components.core.page.splitLandingPage.view.a.1
            float OE = 0.0f;
            float OF = 0.0f;
            float top = 0.0f;
            float left = 0.0f;
            long OG = 0;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (a.this.OC == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.OE = motionEvent.getRawX();
                    this.OF = motionEvent.getRawY();
                    this.left = a.this.OC.x;
                    this.top = a.this.OC.y;
                    this.OG = SystemClock.elapsedRealtime();
                    PrintStream printStream = System.out;
                    printStream.println(" actionDownX " + this.OE + " actionDownX " + this.OE);
                } else if (motionEvent.getActionMasked() == 2) {
                    float rawX = motionEvent.getRawX() - this.OE;
                    float rawY = motionEvent.getRawY() - this.OF;
                    if (Math.sqrt((rawX * rawX) + (rawY * rawY)) > 15.0d) {
                        a.this.OC.x = (int) (this.left + rawX);
                        a.this.OC.y = (int) (this.top + rawY);
                        if (a.this.Ox != null) {
                            try {
                                a.this.Ox.updateViewLayout(a.this.yZ, a.this.OC);
                            } catch (Exception e) {
                                com.kwad.components.core.d.a.b(e);
                                c.printStackTraceOnly(e);
                            }
                        }
                    }
                    return true;
                } else if (motionEvent.getActionMasked() == 1) {
                    float rawX2 = motionEvent.getRawX() - this.OE;
                    float rawY2 = motionEvent.getRawY() - this.OF;
                    float elapsedRealtime = (float) (SystemClock.elapsedRealtime() - this.OG);
                    if (Math.sqrt((rawX2 * rawX2) + (rawY2 * rawY2)) < 15.0d && elapsedRealtime > 30.0f && elapsedRealtime < 300.0f && a.this.OD != null && a.this.Oy != null && com.kwad.sdk.core.response.b.a.ax(d.ck(a.this.Oy.getAdTemplate()))) {
                        a.this.OD.pr();
                    }
                }
                return true;
            }
        });
    }

    private void b(KsAdVideoPlayConfig ksAdVideoPlayConfig) {
        AdTemplate adTemplate = this.Oy.getAdTemplate();
        AdInfo ck = d.ck(adTemplate);
        String url = com.kwad.sdk.core.response.b.a.bi(ck).getUrl();
        if (TextUtils.isEmpty(url)) {
            this.ew.setVisibility(8);
        } else {
            this.ew.setImageDrawable(null);
            KSImageLoader.loadImage(this.ew, url, adTemplate);
            this.ew.setVisibility(0);
        }
        String F = com.kwad.sdk.core.response.b.a.F(ck);
        if (TextUtils.isEmpty(F)) {
            return;
        }
        com.kwad.sdk.core.video.videoview.a dJ = AdVideoPlayerViewCache.getInstance().dJ(F);
        this.ex = dJ;
        if (dJ == null) {
            this.ex = new com.kwad.sdk.core.video.videoview.a(this.mContext);
            com.kwad.sdk.core.response.b.a.T(ck);
            this.ex.a(new b.a(adTemplate).a(adTemplate.mVideoPlayerStatus).cm(d.cm(adTemplate)).cn(f.b(d.cl(adTemplate))).b(new com.kwad.sdk.contentalliance.a.a.a(adTemplate, System.currentTimeMillis())).yP(), null);
            this.ex.setVideoSoundEnable(ksAdVideoPlayConfig.isVideoSoundEnable());
            e eVar = new e(this.mContext, adTemplate, this.ex, ksAdVideoPlayConfig);
            this.OB = eVar;
            eVar.setDataFlowAutoStart(ksAdVideoPlayConfig.isDataFlowAutoStart());
            this.ex.setController(this.OB);
            this.OB.setAutoRelease(false);
        } else {
            e eVar2 = (e) dJ.getController();
            this.OB = eVar2;
            eVar2.setAutoRelease(false);
            this.OB.getAdTemplate().mAdWebVideoPageShowing = true;
        }
        this.ex.setVideoSoundEnable(ksAdVideoPlayConfig.isVideoSoundEnable());
        if (this.ex.getParent() != null) {
            ((ViewGroup) this.ex.getParent()).removeView(this.ex);
        }
        if (this.OA.getTag() != null) {
            FrameLayout frameLayout = this.OA;
            frameLayout.removeView((View) frameLayout.getTag());
            this.OA.setTag(null);
        }
        this.OA.addView(this.ex);
        this.OA.setTag(this.ex);
        this.OB.setAlpha(0.01f);
        this.OB.setVideoPlayCallback(new a.c() { // from class: com.kwad.components.core.page.splitLandingPage.view.a.3
            @Override // com.kwad.components.core.video.a.c
            public final void bj() {
            }

            @Override // com.kwad.components.core.video.a.c
            public final void bk() {
                a.this.pq();
                a.this.aB(false).start();
            }

            @Override // com.kwad.components.core.video.a.c
            public final void d(long j) {
            }

            @Override // com.kwad.components.core.video.a.c
            public final void onVideoPlayStart() {
            }
        });
    }

    public final void a(InterfaceC0208a interfaceC0208a) {
        this.OD = interfaceC0208a;
    }

    public final Animator aB(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m.h(this.yZ, z), m.h(this.ew, z));
        return animatorSet;
    }

    public final boolean isVisible() {
        return this.yZ.getAlpha() > 0.0f;
    }

    public final void pq() {
        this.OB.ab();
    }

    public final boolean pt() {
        int i;
        int a;
        if (this.Oy == null || this.Ox == null) {
            return false;
        }
        b(new KsAdVideoPlayConfig.Builder().videoSoundEnable(this.Oy.getAdTemplate().mIsAudioEnable).build());
        AdInfo ck = d.ck(this.Oy.getAdTemplate());
        int L = com.kwad.sdk.core.response.b.a.L(ck);
        int K = com.kwad.sdk.core.response.b.a.K(ck);
        Rect rect = new Rect();
        DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        if (L > K) {
            rect.right = displayMetrics.widthPixels;
            rect.left = rect.right - com.kwad.sdk.d.a.a.a(this.mContext, 86.0f);
            rect.bottom = displayMetrics.heightPixels - com.kwad.sdk.d.a.a.a(this.mContext, 252.0f);
            i = rect.bottom;
            a = com.kwad.sdk.d.a.a.a(this.mContext, 154.0f);
        } else {
            rect.right = displayMetrics.widthPixels;
            rect.left = rect.right - com.kwad.sdk.d.a.a.a(this.mContext, 154.0f);
            rect.bottom = displayMetrics.heightPixels - com.kwad.sdk.d.a.a.a(this.mContext, 252.0f);
            i = rect.bottom;
            a = com.kwad.sdk.d.a.a.a(this.mContext, 86.0f);
        }
        rect.top = i - a;
        rect.left -= com.kwad.sdk.d.a.a.a(this.mContext, 12.0f);
        rect.right -= com.kwad.sdk.d.a.a.a(this.mContext, 12.0f);
        this.OC.type = 1003;
        this.OC.flags = 8;
        this.OC.gravity = 51;
        this.OC.format = 1;
        this.OC.width = displayMetrics.widthPixels;
        this.OC.height = displayMetrics.heightPixels;
        this.OC.x = rect.left;
        this.OC.y = rect.top;
        this.OC.width = (rect.right - rect.left) + com.kwad.sdk.d.a.a.a(this.mContext, 12.0f);
        this.OC.height = (rect.bottom - rect.top) + com.kwad.sdk.d.a.a.a(this.mContext, 12.0f);
        this.yZ.setPivotX((rect.left * displayMetrics.widthPixels) / ((rect.left + displayMetrics.widthPixels) - rect.right));
        this.yZ.setPivotY((rect.top * displayMetrics.heightPixels) / ((rect.top + displayMetrics.heightPixels) - rect.bottom));
        this.yZ.setAlpha(0.0f);
        if (this.Ox != null) {
            try {
                if (this.yZ.getWindowToken() == null) {
                    this.Ox.addView(this.yZ, this.OC);
                }
            } catch (Exception e) {
                com.kwad.components.core.d.a.b(e);
                c.printStackTraceOnly(e);
            }
        }
        this.Ii.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.splitLandingPage.view.a.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.pq();
                a.this.aB(false).start();
            }
        });
        return true;
    }

    public final void pu() {
        com.kwad.sdk.core.video.videoview.a aVar = this.ex;
        if (aVar == null || aVar.isPlaying()) {
            return;
        }
        this.OB.qX();
    }
}
