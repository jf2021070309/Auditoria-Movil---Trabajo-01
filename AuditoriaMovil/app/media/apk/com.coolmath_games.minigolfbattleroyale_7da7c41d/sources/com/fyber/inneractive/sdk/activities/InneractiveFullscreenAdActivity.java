package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.a.a.b;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.e.c;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.m;
/* loaded from: classes.dex */
public class InneractiveFullscreenAdActivity extends Activity implements c.a {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    private ViewGroup b;
    private View c;
    private View d;
    private View e;
    private InneractiveAdSpot f;
    private c g;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    boolean a = false;

    /* loaded from: classes.dex */
    public interface FullScreenRendererProvider {
        c getFullscreenRenderer();
    }

    /* loaded from: classes.dex */
    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (Build.VERSION.SDK_INT >= 19) {
            View decorView = getWindow().getDecorView();
            if ((decorView.getSystemUiVisibility() & 2) == 0) {
                decorView.setSystemUiVisibility(2818);
            }
            decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.3
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i) {
                    if ((i & 2) == 0) {
                        m.a().postDelayed(new Runnable() { // from class: com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (InneractiveFullscreenAdActivity.this.isFinishing()) {
                                    return;
                                }
                                InneractiveFullscreenAdActivity.this.a();
                            }
                        }, 3000L);
                    }
                }
            });
        }
    }

    protected void initWindowFeatures(c cVar) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().addFlags(2);
        }
        if (cVar != null && cVar.q()) {
            setTheme(16973831);
            if (Build.VERSION.SDK_INT >= 19) {
                requestWindowFeature(67108864);
                requestWindowFeature(134217728);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                requestWindowFeature(Integer.MIN_VALUE);
            }
        }
        a();
        u h = this.f.getAdContent().h();
        if (h.g() != null) {
            Orientation d = h.g().d();
            setActivityOrientation(d.allowOrientationChange, d);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            a();
        }
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public void setActivityOrientation(boolean z, Orientation orientation) {
        if (z && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
        } else if (z && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
        } else if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
        } else if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
        } else {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                setRequestedOrientation(7);
            } else if (i == 2) {
                setRequestedOrientation(6);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public boolean isCloseButtonDisplay() {
        return this.c.getVisibility() == 0;
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public void destroy() {
        if (isFinishing() || this.b == null) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.b = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot != null ? inneractiveAdSpot.getSelectedUnitController() : null;
        if (selectedUnitController != null && (selectedUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        b();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            b();
            return;
        }
        c cVar = this.g;
        if (cVar != null) {
            cVar.w();
        }
    }

    private void b() {
        c cVar = this.g;
        if (cVar != null) {
            cVar.j();
            this.g.destroy();
            this.g = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public boolean wasDismissedByUser() {
        return this.a;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        c cVar = this.g;
        if (cVar != null) {
            cVar.x();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.g != null) {
            if (configuration.orientation != this.h) {
                this.h = configuration.orientation;
                this.g.k();
            } else if (this.i == configuration.screenHeightDp && this.j == configuration.screenWidthDp) {
            } else {
                this.i = configuration.screenHeightDp;
                this.j = configuration.screenWidthDp;
                this.g.k();
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c cVar = this.g;
        if (cVar == null || !cVar.i()) {
            super.onBackPressed();
        }
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public ViewGroup getLayout() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public void dismissAd(boolean z) {
        this.a = z;
        finish();
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public void showCloseButton(boolean z, boolean z2) {
        if (z) {
            this.c.setAlpha(0.0f);
        }
        this.d.setBackgroundResource(R.drawable.ia_round_overlay_bg_with_close);
        if (z2) {
            double a = ((b) this.f.getAdContent().i().a(b.class)).a("close_btn_padding", 0.0d);
            int intrinsicWidth = ((GradientDrawable) ((LayerDrawable) getResources().getDrawable(R.drawable.ia_round_overlay_bg_with_close)).findDrawableByLayerId(R.id.ia_close_button_background_item)).getIntrinsicWidth();
            int i = ((int) ((intrinsicWidth * a) / 100.0d)) / 2;
            IAlog.b("%s: closeButton original width: %sdp, padding perc: %s, padding: %sdp", IAlog.a((Object) this), Integer.valueOf(l.a(intrinsicWidth)), Double.valueOf(a), Integer.valueOf(l.a(i)));
            this.c.setPadding(i, 0, 0, i);
        }
        ((TextView) this.d).setText("");
        this.c.setEnabled(true);
        this.c.setVisibility(0);
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public void showAdditionalCloseButton() {
        this.e.setAlpha(0.0f);
        this.e.setEnabled(true);
        this.e.setVisibility(0);
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public void updateCloseCountdown(int i) {
        if (i > 0) {
            ((TextView) this.d).setText(Integer.toString(i));
        }
    }

    @Override // com.fyber.inneractive.sdk.e.c.a
    public void showCloseCountdown() {
        this.d.setBackgroundResource(R.drawable.ia_round_overlay_bg);
        this.c.setEnabled(false);
        this.c.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r1.getAdContent() != null) goto L5;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.onCreate(android.os.Bundle):void");
    }
}
