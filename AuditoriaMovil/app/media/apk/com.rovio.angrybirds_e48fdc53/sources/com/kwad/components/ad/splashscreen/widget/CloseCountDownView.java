package com.kwad.components.ad.splashscreen.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public class CloseCountDownView extends LinearLayout {
    private a Ev;
    private String Fj;
    private int Fk;
    private TextView Fl;
    private TextView Fm;
    private ImageView Fn;
    private Runnable Fo;
    private boolean nP;

    /* loaded from: classes.dex */
    public interface a {
        void dL();

        void kX();
    }

    public CloseCountDownView(Context context) {
        super(context);
        this.Fj = "%ss";
        this.Fk = 5;
        this.nP = false;
        this.Fo = new Runnable() { // from class: com.kwad.components.ad.splashscreen.widget.CloseCountDownView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (CloseCountDownView.this.nP) {
                    CloseCountDownView.this.postDelayed(this, 300L);
                } else if (CloseCountDownView.this.Fk <= 0) {
                    if (CloseCountDownView.this.Ev != null) {
                        CloseCountDownView.this.Ev.kX();
                    }
                } else {
                    CloseCountDownView.this.postDelayed(this, 1000L);
                    CloseCountDownView closeCountDownView = CloseCountDownView.this;
                    closeCountDownView.ad(closeCountDownView.Fk);
                    CloseCountDownView.d(CloseCountDownView.this);
                }
            }
        };
        Z(context);
    }

    public CloseCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Fj = "%ss";
        this.Fk = 5;
        this.nP = false;
        this.Fo = new Runnable() { // from class: com.kwad.components.ad.splashscreen.widget.CloseCountDownView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (CloseCountDownView.this.nP) {
                    CloseCountDownView.this.postDelayed(this, 300L);
                } else if (CloseCountDownView.this.Fk <= 0) {
                    if (CloseCountDownView.this.Ev != null) {
                        CloseCountDownView.this.Ev.kX();
                    }
                } else {
                    CloseCountDownView.this.postDelayed(this, 1000L);
                    CloseCountDownView closeCountDownView = CloseCountDownView.this;
                    closeCountDownView.ad(closeCountDownView.Fk);
                    CloseCountDownView.d(CloseCountDownView.this);
                }
            }
        };
        Z(context);
    }

    public CloseCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Fj = "%ss";
        this.Fk = 5;
        this.nP = false;
        this.Fo = new Runnable() { // from class: com.kwad.components.ad.splashscreen.widget.CloseCountDownView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (CloseCountDownView.this.nP) {
                    CloseCountDownView.this.postDelayed(this, 300L);
                } else if (CloseCountDownView.this.Fk <= 0) {
                    if (CloseCountDownView.this.Ev != null) {
                        CloseCountDownView.this.Ev.kX();
                    }
                } else {
                    CloseCountDownView.this.postDelayed(this, 1000L);
                    CloseCountDownView closeCountDownView = CloseCountDownView.this;
                    closeCountDownView.ad(closeCountDownView.Fk);
                    CloseCountDownView.d(CloseCountDownView.this);
                }
            }
        };
        Z(context);
    }

    public CloseCountDownView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Fj = "%ss";
        this.Fk = 5;
        this.nP = false;
        this.Fo = new Runnable() { // from class: com.kwad.components.ad.splashscreen.widget.CloseCountDownView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (CloseCountDownView.this.nP) {
                    CloseCountDownView.this.postDelayed(this, 300L);
                } else if (CloseCountDownView.this.Fk <= 0) {
                    if (CloseCountDownView.this.Ev != null) {
                        CloseCountDownView.this.Ev.kX();
                    }
                } else {
                    CloseCountDownView.this.postDelayed(this, 1000L);
                    CloseCountDownView closeCountDownView = CloseCountDownView.this;
                    closeCountDownView.ad(closeCountDownView.Fk);
                    CloseCountDownView.d(CloseCountDownView.this);
                }
            }
        };
        Z(context);
    }

    private void Z(Context context) {
        setOrientation(0);
        l.inflate(context, R.layout.ksad_endcard_close_view, this);
        this.Fl = (TextView) findViewById(R.id.ksad_ad_endcard_second);
        this.Fm = (TextView) findViewById(R.id.ksad_ad_endcard_line);
        ImageView imageView = (ImageView) findViewById(R.id.ksad_splash_endcard_close_img);
        this.Fn = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.splashscreen.widget.CloseCountDownView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (CloseCountDownView.this.Ev != null) {
                    CloseCountDownView.this.Ev.dL();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad(int i) {
        this.Fl.setText(String.format(this.Fj, Integer.valueOf(i)));
    }

    static /* synthetic */ int d(CloseCountDownView closeCountDownView) {
        int i = closeCountDownView.Fk;
        closeCountDownView.Fk = i - 1;
        return i;
    }

    private void eZ() {
        post(this.Fo);
    }

    private void fa() {
        this.nP = true;
    }

    private void fb() {
        this.nP = false;
    }

    public final void a(AdInfo adInfo) {
        Context context;
        float f;
        boolean bV = com.kwad.sdk.core.response.b.a.bV(adInfo);
        this.Fk = com.kwad.sdk.core.response.b.a.bU(adInfo);
        if (bV) {
            this.Fl.setVisibility(0);
            this.Fm.setVisibility(0);
            ad(this.Fk);
            context = getContext();
            f = 12.0f;
        } else {
            context = getContext();
            f = 4.0f;
        }
        setPadding(com.kwad.sdk.d.a.a.a(context, f), 0, com.kwad.sdk.d.a.a.a(getContext(), f), 0);
        eZ();
    }

    public final void aK() {
        fb();
    }

    public final void aL() {
        fa();
    }

    public final void bd() {
        if (getHandler() != null) {
            getHandler().removeCallbacksAndMessages(null);
        }
    }

    public void setOnViewClickListener(a aVar) {
        this.Ev = aVar;
    }
}
