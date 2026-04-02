package com.kwad.components.ad.splashscreen.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.components.ad.splashscreen.local.SplashSkipViewModel;
import com.kwad.sdk.R;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public class SkipView extends LinearLayout implements com.kwad.components.ad.splashscreen.widget.a {
    private a Fd;
    private Runnable Fo;
    private int GA;
    private final b Gw;
    private View Gx;
    private TextView Gy;
    private TextView Gz;
    private boolean nP;
    private boolean sC;

    /* loaded from: classes.dex */
    public interface a {
        void Z(int i);

        void kW();

        void kX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        private int Fk;
        private String GC;
        private String GD;
        private int GE;
        private boolean GF;
        private boolean GG;

        private b() {
            this.GC = "跳过";
            this.GD = "";
            this.GE = 5;
            this.Fk = 5;
            this.GF = true;
            this.GG = true;
        }

        /* synthetic */ b(byte b) {
            this();
        }

        static /* synthetic */ int d(b bVar) {
            int i = bVar.Fk;
            bVar.Fk = i - 1;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean lQ() {
            return this.GF && this.GG;
        }

        public final void af(int i) {
            this.GE = i;
            this.Fk = i;
        }

        public final void af(String str) {
            this.Fk = -1;
            this.GD = str;
        }

        public final String lO() {
            StringBuilder sb;
            int i;
            int i2 = this.Fk;
            if (i2 < 0) {
                return this.GD;
            }
            if (i2 == 0) {
                sb = new StringBuilder();
                sb.append(this.GD);
                i = 1;
            } else {
                sb = new StringBuilder();
                sb.append(this.GD);
                i = this.Fk;
            }
            sb.append(i);
            return sb.toString();
        }

        public final boolean lP() {
            return this.Fk <= 0;
        }
    }

    public SkipView(Context context) {
        this(context, null);
    }

    public SkipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkipView(Context context, AttributeSet attributeSet, int i) {
        super(l.wrapContextIfNeed(context), attributeSet, i);
        this.Gw = new b((byte) 0);
        this.GA = -1;
        this.nP = false;
        this.sC = true;
        this.Fo = new Runnable() { // from class: com.kwad.components.ad.splashscreen.widget.SkipView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (SkipView.this.nP) {
                    SkipView.this.postDelayed(this, 300L);
                    return;
                }
                SkipView skipView = SkipView.this;
                skipView.a(skipView.Gw);
                SkipView skipView2 = SkipView.this;
                skipView2.Y(skipView2.Gw.GE - SkipView.this.Gw.Fk);
                if (!SkipView.this.Gw.lP()) {
                    SkipView.this.postDelayed(this, 1000L);
                    b.d(SkipView.this.Gw);
                } else if (SkipView.this.Fd != null) {
                    SkipView.this.Fd.kX();
                }
            }
        };
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i) {
        a aVar = this.Fd;
        if (aVar != null) {
            aVar.Z(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        if (bVar == null) {
            return;
        }
        if (this.Gy != null) {
            if (bVar.GC != null) {
                this.Gy.setText(bVar.GC);
            }
            this.Gy.setVisibility(this.Gw.GF ? 0 : 8);
        }
        String lO = bVar.lO();
        TextView textView = this.Gz;
        if (textView != null) {
            if (lO != null) {
                textView.setText(lO);
            }
            this.Gz.setVisibility(this.Gw.GG ? 0 : 8);
        }
        if (this.Gx != null) {
            boolean lQ = this.Gw.lQ();
            this.Gx.setVisibility(lQ ? 0 : 8);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                if (!lQ) {
                    layoutParams.width = -2;
                    invalidate();
                    return;
                }
                int i = this.GA;
                if (i > 0) {
                    layoutParams.width = i;
                    invalidate();
                }
            }
        }
    }

    private void eZ() {
        a(this.Gw);
        post(this.Fo);
    }

    private void fa() {
        this.nP = true;
    }

    private void fb() {
        this.nP = false;
    }

    private void init() {
        setOrientation(0);
        l.inflate(getContext(), R.layout.ksad_skip_view, this);
        this.Gy = (TextView) findViewById(R.id.ksad_skip_view_skip);
        this.Gz = (TextView) findViewById(R.id.ksad_skip_view_timer);
        this.Gx = findViewById(R.id.ksad_skip_view_divider);
        setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.splashscreen.widget.SkipView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (SkipView.this.Fd != null) {
                    SkipView.this.Fd.kW();
                }
            }
        });
        setSkipBtnVisible(true);
        setTimerBtnVisible(true);
    }

    private void lN() {
        if (getVisibility() == 0) {
            return;
        }
        setVisibility(0);
        setAlpha(0.0f);
        animate().alpha(1.0f).setDuration(500L).start();
    }

    private void y(AdInfo adInfo) {
        setTimerBtnVisible(com.kwad.sdk.core.response.b.a.cj(adInfo));
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public final void a(SplashSkipViewModel splashSkipViewModel, AdInfo adInfo) {
        this.sC = com.kwad.sdk.core.response.b.a.ci(adInfo);
        setTimerPrefixText(d.a(com.kwad.components.ad.splashscreen.b.a.CC));
        setTimerSecond(splashSkipViewModel.skipSecond);
        if (!com.kwad.sdk.core.response.b.a.aU(adInfo)) {
            eZ();
        }
        setSkipText(com.kwad.sdk.core.response.b.a.bS(adInfo));
        setVisibility(8);
        y(adInfo);
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public final int ac(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = com.kwad.sdk.d.a.a.a(getContext(), 35.0f);
        int width = getWidth();
        setLayoutParams(layoutParams);
        return width;
    }

    public final void af(String str) {
        if (str == null) {
            return;
        }
        this.Gw.af(str);
        a(this.Gw);
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public final void bd() {
        if (getHandler() != null) {
            getHandler().removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.GA = layoutParams.width;
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public void setOnViewListener(a aVar) {
        this.Fd = aVar;
    }

    public void setSkipBtnVisible(boolean z) {
        this.Gw.GF = z;
        a(this.Gw);
    }

    public void setSkipText(String str) {
        this.Gw.GC = str;
        a(this.Gw);
    }

    public void setTimerBtnVisible(boolean z) {
        this.Gw.GG = z;
        a(this.Gw);
    }

    public void setTimerPrefixText(String str) {
        this.Gw.GD = str;
        a(this.Gw);
    }

    public void setTimerSecond(int i) {
        this.Gw.af(i);
        a(this.Gw);
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public final void w(AdInfo adInfo) {
        if (com.kwad.sdk.core.response.b.a.aU(adInfo)) {
            return;
        }
        fa();
    }

    @Override // com.kwad.components.ad.splashscreen.widget.a
    public final void x(AdInfo adInfo) {
        if (this.sC) {
            lN();
        }
        if (com.kwad.sdk.core.response.b.a.aU(adInfo)) {
            return;
        }
        fb();
    }
}
