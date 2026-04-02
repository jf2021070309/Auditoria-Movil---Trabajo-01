package com.rovio.rcs;

import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.rovio.fusion.Globals;
import com.rovio.fusion.IActivityListener;
import com.rovio.rcs.IdentityLoginUIScreen;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes4.dex */
public class IdentityLoginUI implements IActivityListener {
    private static final String TAG = "IdentityLoginUI_Java";
    private static final boolean VERBOSE_LOGGING = true;
    private Timer a = new Timer();
    private Timer b = new Timer();
    private IdentityLoginUIScreen c = null;
    private RelativeLayout d = null;
    private long e;

    /* JADX INFO: Access modifiers changed from: private */
    public native void backButtonPressed(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void checkEmail(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void checkPassword(long j, String str);

    private native void onButtonClicked(long j, int i);

    private native void onRegisterNewAccount(long j, String str, String str2, int i, int i2, int i3, String str3, int i4);

    private native void onRequestNewPassword(long j, String str);

    private native void onSignInClicked(long j, String str, String str2);

    public IdentityLoginUI(long j) {
        this.e = 0L;
        this.e = j;
    }

    public void emailEditStarted(final String str) {
        if (this.c != null) {
            this.c.hideEmailErrorExclaims();
        }
        this.a.cancel();
        this.a = new Timer();
        this.a.schedule(new TimerTask() { // from class: com.rovio.rcs.IdentityLoginUI.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                IdentityLoginUI.this.checkEmail(IdentityLoginUI.this.e, str);
            }
        }, 2000L);
    }

    public void passwordEditStarted(final String str) {
        if (this.c != null) {
            this.c.hidePasswordErrorExclaims();
        }
        this.b.cancel();
        this.b = new Timer();
        this.b.schedule(new TimerTask() { // from class: com.rovio.rcs.IdentityLoginUI.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                IdentityLoginUI.this.checkPassword(IdentityLoginUI.this.e, str);
            }
        }, 2000L);
    }

    public void show(final int i) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.IdentityLoginUI.3
            @Override // java.lang.Runnable
            public void run() {
                if (IdentityLoginUI.this.c == null) {
                    IdentityLoginUI.this.a();
                }
                IdentityLoginUI.this.c.show_screen(IdentityLoginUIScreen.SkynestView.values()[i]);
            }
        });
    }

    public void performMessageAction(final int i, final int i2) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.IdentityLoginUI.4
            @Override // java.lang.Runnable
            public void run() {
                if (IdentityLoginUI.this.c != null) {
                    IdentityLoginUI.this.c.performMessageAction(IdentityLoginUIScreen.SkynestViewUIAction.values()[i], IdentityLoginUIScreen.SkynestUIErrorType.values()[i2]);
                }
            }
        });
    }

    public void hide() {
        this.a.cancel();
        this.b.cancel();
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.IdentityLoginUI.5
            @Override // java.lang.Runnable
            public void run() {
                if (IdentityLoginUI.this.c != null) {
                    Globals.getRootViewGroup().removeView(IdentityLoginUI.this.c);
                }
            }
        });
    }

    public void signInClicked(String str, String str2) {
        this.a.cancel();
        this.b.cancel();
        onSignInClicked(this.e, str, str2);
    }

    public void buttonClicked(IdentityLoginUIScreen.SkynestViewUIAction skynestViewUIAction) {
        this.a.cancel();
        this.b.cancel();
        onButtonClicked(this.e, skynestViewUIAction.ordinal());
    }

    public void requestNewPassword(String str) {
        this.a.cancel();
        this.b.cancel();
        onRequestNewPassword(this.e, str);
    }

    public void handleBackButtonPress() {
        this.a.cancel();
        this.b.cancel();
        backButtonPressed(this.e);
    }

    public void registerNewAccount(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        this.a.cancel();
        this.b.cancel();
        onRegisterNewAccount(this.e, str, str2, i, i2, i3, str3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.c == null) {
            this.c = new IdentityLoginUIScreen(Globals.getActivity());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.c.setHandle(this);
            layoutParams.addRule(13);
            Globals.getRootViewGroup().addView(this.c, layoutParams);
            this.c.setOnKeyListener(new View.OnKeyListener() { // from class: com.rovio.rcs.IdentityLoginUI.6
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (i == 4) {
                        if (keyEvent.getAction() == 1) {
                            IdentityLoginUI.this.backButtonPressed(IdentityLoginUI.this.e);
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    public void destroy() {
        Log.d(TAG, "destroy()");
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onPause() {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onNewIntent(Intent intent) {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onDestroy() {
    }
}
