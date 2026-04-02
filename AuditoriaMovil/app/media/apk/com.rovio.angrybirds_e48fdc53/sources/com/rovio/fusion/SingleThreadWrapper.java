package com.rovio.fusion;
/* loaded from: classes2.dex */
public class SingleThreadWrapper extends Updater {
    public SingleThreadWrapper(NativeApplication nativeApplication) {
        super(nativeApplication);
    }

    @Override // com.rovio.fusion.Updater
    public void initialize(int i, int i2) {
        this.mNative.doInit(i, i2);
        onResize(i, i2);
    }

    @Override // com.rovio.fusion.Updater
    public boolean onFrame() {
        if (readyToRender()) {
            if (!this.mNative.doUpdate()) {
                a();
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.rovio.fusion.Updater
    public void onResize(int i, int i2) {
        this.mNative.doResize(i, i2);
    }

    @Override // com.rovio.fusion.Updater
    public void onPause() {
        this.mNative.doPause();
    }

    @Override // com.rovio.fusion.Updater
    public void onResume() {
        this.mNative.doResume();
    }

    private void a() {
        this.mNative.doShutdown();
    }
}
