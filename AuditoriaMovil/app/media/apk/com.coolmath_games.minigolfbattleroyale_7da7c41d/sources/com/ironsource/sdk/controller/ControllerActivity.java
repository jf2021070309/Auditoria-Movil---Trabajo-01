package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.sdk.controller.w;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
/* loaded from: classes2.dex */
public class ControllerActivity extends Activity implements v, com.ironsource.sdk.j.g {
    private static final String a = ControllerActivity.class.getSimpleName();
    private static String b = "removeWebViewContainerView | mContainer is null";
    private static String c = "removeWebViewContainerView | view is null";
    private String d;
    private w e;
    private RelativeLayout f;
    private FrameLayout g;
    private String i;
    private com.ironsource.sdk.g.b m;
    private boolean n;
    private boolean o;
    public int currentRequestedRotation = -1;
    private boolean h = false;
    private Handler j = new Handler();
    private final Runnable k = new Runnable() { // from class: com.ironsource.sdk.controller.ControllerActivity.1
        @Override // java.lang.Runnable
        public final void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.h));
        }
    };
    private RelativeLayout.LayoutParams l = new RelativeLayout.LayoutParams(-1, -1);

    private void a() {
        Logger.i(a, "clearWebviewController");
        w wVar = this.e;
        if (wVar == null) {
            Logger.i(a, "clearWebviewController, null");
            return;
        }
        wVar.j = w.g.Gone;
        this.e.n = null;
        this.e.x = null;
        this.e.a(this.i, "onDestroy");
    }

    private void a(String str) {
        if (str != null) {
            if ("landscape".equalsIgnoreCase(str)) {
                b();
            } else if ("portrait".equalsIgnoreCase(str)) {
                c();
            } else if ("device".equalsIgnoreCase(str)) {
                if (com.ironsource.environment.h.r(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    private void b() {
        int l = com.ironsource.environment.h.l(this);
        Logger.i(a, "setInitiateLandscapeOrientation");
        if (l == 0) {
            Logger.i(a, "ROTATION_0");
            setRequestedOrientation(0);
        } else if (l == 2) {
            Logger.i(a, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (l == 3) {
            Logger.i(a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (l != 1) {
            Logger.i(a, "No Rotation");
        } else {
            Logger.i(a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    private void c() {
        int l = com.ironsource.environment.h.l(this);
        Logger.i(a, "setInitiatePortraitOrientation");
        if (l == 0) {
            Logger.i(a, "ROTATION_0");
            setRequestedOrientation(1);
        } else if (l == 2) {
            Logger.i(a, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (l == 1) {
            Logger.i(a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (l != 3) {
            Logger.i(a, "No Rotation");
        } else {
            Logger.i(a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.ironsource.sdk.j.g
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(a, "onBackPressed");
        new com.ironsource.sdk.i.a();
        if (com.ironsource.sdk.i.a.a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.sdk.j.g
    public void onCloseRequested() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Logger.i(a, "onCreate");
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            w wVar = (w) com.ironsource.sdk.d.b.a((Context) this).a.a;
            this.e = wVar;
            wVar.i.setId(1);
            this.e.x = this;
            this.e.n = this;
            Intent intent = getIntent();
            this.i = intent.getStringExtra("productType");
            this.h = intent.getBooleanExtra("immersive", false);
            this.d = intent.getStringExtra("adViewId");
            this.n = false;
            this.o = intent.getBooleanExtra("ctrWVPauseResume", false);
            if (this.h) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.ironsource.sdk.controller.ControllerActivity.2
                    @Override // android.view.View.OnSystemUiVisibilityChangeListener
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                            ControllerActivity.this.j.removeCallbacks(ControllerActivity.this.k);
                            ControllerActivity.this.j.postDelayed(ControllerActivity.this.k, 500L);
                        }
                    }
                });
                runOnUiThread(this.k);
            }
            if (!TextUtils.isEmpty(this.i) && d.e.OfferWall.toString().equalsIgnoreCase(this.i)) {
                if (bundle != null) {
                    com.ironsource.sdk.g.b bVar = (com.ironsource.sdk.g.b) bundle.getParcelable("state");
                    if (bVar != null) {
                        this.m = bVar;
                        this.e.a(bVar);
                    }
                    finish();
                } else {
                    this.m = this.e.o;
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f = relativeLayout;
            setContentView(relativeLayout, this.l);
            String str = this.d;
            this.g = !(!TextUtils.isEmpty(str) && !str.equals(Integer.toString(1))) ? this.e.i : com.ironsource.sdk.utils.d.a(getApplicationContext(), com.ironsource.sdk.c.d.a().a(str));
            if (this.f.findViewById(1) == null && this.g.getParent() != null) {
                finish();
            }
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("orientation_set_flag");
            intent2.getIntExtra("rotation_set_flag", 0);
            a(stringExtra);
            this.f.addView(this.g, this.l);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Logger.i(a, "onDestroy");
        try {
        } catch (Exception e) {
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.q, new com.ironsource.sdk.a.a().a("callfailreason", e.getMessage()).a);
            String str = a;
            Logger.i(str, "removeWebViewContainerView fail " + e.getMessage());
        }
        if (this.f == null) {
            throw new Exception(b);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.g.getParent();
        View findViewById = this.d == null ? viewGroup2.findViewById(1) : com.ironsource.sdk.c.d.a().a(this.d);
        if (findViewById == null) {
            throw new Exception(c);
        }
        if (isFinishing() && (viewGroup = (ViewGroup) findViewById.getParent()) != null) {
            viewGroup.removeView(findViewById);
        }
        viewGroup2.removeView(this.g);
        if (this.n) {
            return;
        }
        Logger.i(a, "onDestroy | destroyedFromBackground");
        a();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.e.h != null) {
                this.e.g.onHideCustomView();
                return true;
            }
        }
        if (this.h && (i == 25 || i == 24)) {
            this.j.removeCallbacks(this.k);
            this.j.postDelayed(this.k, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.ironsource.sdk.j.g
    public void onOrientationChanged(String str, int i) {
        a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        String str = a;
        Logger.i(str, "onPause, isFinishing=" + isFinishing());
        try {
            ((AudioManager) getSystemService("audio")).abandonAudioFocus(null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        w wVar = this.e;
        if (wVar != null) {
            wVar.b(this);
            if (!this.o) {
                this.e.i();
            }
            this.e.a(false, "main");
            this.e.a(this.i, "onPause");
        }
        if (isFinishing()) {
            this.n = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(a, "onResume");
        w wVar = this.e;
        if (wVar != null) {
            wVar.a(this);
            if (!this.o) {
                this.e.j();
            }
            this.e.a(true, "main");
            this.e.a(this.i, "onResume");
        }
        ((AudioManager) getSystemService("audio")).requestAudioFocus(null, 3, 2);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (TextUtils.isEmpty(this.i) || !d.e.OfferWall.toString().equalsIgnoreCase(this.i)) {
            return;
        }
        this.m.d = true;
        bundle.putParcelable("state", this.m);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Logger.i(a, "onStart");
        w wVar = this.e;
        if (wVar != null) {
            wVar.a(this.i, "onStart");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Logger.i(a, "onStop");
        w wVar = this.e;
        if (wVar != null) {
            wVar.a(this.i, "onStop");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(a, "onUserLeaveHint");
        w wVar = this.e;
        if (wVar != null) {
            wVar.a(this.i, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.sdk.controller.v
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.sdk.controller.v
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.sdk.controller.v
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.sdk.controller.v
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.sdk.controller.v
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.h && z) {
            runOnUiThread(this.k);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            String str = a;
            Logger.i(str, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        runOnUiThread(z ? new Runnable() { // from class: com.ironsource.sdk.controller.ControllerActivity.3
            @Override // java.lang.Runnable
            public final void run() {
                ControllerActivity.this.getWindow().addFlags(128);
            }
        } : new Runnable() { // from class: com.ironsource.sdk.controller.ControllerActivity.4
            @Override // java.lang.Runnable
            public final void run() {
                ControllerActivity.this.getWindow().clearFlags(128);
            }
        });
    }
}
