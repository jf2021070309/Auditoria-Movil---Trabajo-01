package com.rovio.fusion;

import android.app.KeyguardManager;
/* loaded from: classes2.dex */
public class Updater {
    private static final boolean ENABLE_LOGGING = false;
    protected boolean mIsLandscape;
    protected final KeyguardManager mKeyguardManager = (KeyguardManager) Globals.getActivity().getSystemService("keyguard");
    protected NativeApplication mNative;

    public Updater(NativeApplication nativeApplication) {
        this.mNative = nativeApplication;
    }

    public boolean isInitialized() {
        return this.mNative.isInitialized();
    }

    public boolean readyToRender() {
        return this.mNative.isResumed() && supportedOrientation() && !this.mKeyguardManager.inKeyguardRestrictedInputMode();
    }

    public boolean setOrientation(boolean z) {
        this.mIsLandscape = z;
        return supportedOrientation();
    }

    protected boolean supportedOrientation() {
        return this.mNative.supportsOrientation(this.mIsLandscape);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Debug(String str) {
    }

    public void initialize(int i, int i2) {
    }

    public boolean onFrame() {
        return false;
    }

    public void onResize(int i, int i2) {
    }

    public void onPause() {
    }

    public void onResume() {
    }
}
