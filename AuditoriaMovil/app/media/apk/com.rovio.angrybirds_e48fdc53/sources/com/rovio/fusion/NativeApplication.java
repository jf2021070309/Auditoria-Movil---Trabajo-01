package com.rovio.fusion;

import android.opengl.GLSurfaceView;
/* loaded from: classes2.dex */
public class NativeApplication {
    private static final boolean ENABLE_LOGGING = false;
    private volatile boolean a = true;
    private volatile NativeState b = NativeState.UNINITIALIZED;
    private GLSurfaceView c;
    private Updater d;
    private MyRenderer e;
    private MyInputHandler f;
    private boolean g;
    private boolean h;

    /* loaded from: classes2.dex */
    private enum NativeState {
        UNINITIALIZED,
        PAUSED,
        RENDER_READY,
        EXITING
    }

    private native void nativeConfig(String str);

    private native void nativeDeinit();

    private native int nativeGetPossibleOrientations();

    private native void nativeInit(int i, int i2);

    private native void nativePause();

    private native boolean nativeRenderThread();

    private native boolean nativeResize(int i, int i2);

    private native void nativeResume();

    private native boolean nativeUpdate();

    public native void nativeFrameClear();

    public native void nativeInterruptRender();

    public native boolean nativeRender();

    public NativeApplication(GLSurfaceView gLSurfaceView, String str) {
        this.g = false;
        this.h = false;
        this.c = gLSurfaceView;
        nativeConfig(str);
        int nativeGetPossibleOrientations = nativeGetPossibleOrientations();
        if ((nativeGetPossibleOrientations & 1) != 0 || (nativeGetPossibleOrientations & 4) != 0) {
            this.g = true;
        }
        if ((nativeGetPossibleOrientations & 2) != 0 || (nativeGetPossibleOrientations & 8) != 0) {
            this.h = true;
        }
        this.d = a();
        this.e = new MyRenderer(this.d);
        this.f = new MyInputHandler();
    }

    public InputDelegator createInputDelegate() {
        return new InputDelegator(this.f);
    }

    public MyRenderer getRenderer() {
        return this.e;
    }

    public Updater getUpdater() {
        return this.d;
    }

    public boolean isInitialized() {
        return this.b != NativeState.UNINITIALIZED;
    }

    public boolean isResumed() {
        return this.b == NativeState.RENDER_READY;
    }

    public boolean supportsOrientation(boolean z) {
        return (this.g && !z) || (this.h && z);
    }

    public void doInit(int i, int i2) {
        if (this.b == NativeState.UNINITIALIZED) {
            a("doInit");
            nativeInit(i, i2);
            if (this.a) {
                this.b = NativeState.PAUSED;
                return;
            }
            nativeResume();
            this.b = NativeState.RENDER_READY;
        }
    }

    public void doResize(int i, int i2) {
        a("doResize");
        if (this.b != NativeState.EXITING) {
            nativeResize(i, i2);
        }
    }

    public boolean doUpdate() {
        this.f.handleEvents();
        boolean nativeUpdate = nativeUpdate();
        if (!nativeUpdate) {
            this.b = NativeState.EXITING;
        }
        return nativeUpdate;
    }

    public void doShutdown() {
        a("doShutdown");
        nativeDeinit();
        Globals.getActivity().finish();
    }

    public void doPause() {
        a("doPause");
        this.a = true;
        if (this.b == NativeState.RENDER_READY) {
            nativePause();
            this.b = NativeState.PAUSED;
        }
    }

    public void doResume() {
        a("doResume");
        this.a = false;
        if (this.b == NativeState.PAUSED) {
            nativeResume();
            this.b = NativeState.RENDER_READY;
        }
    }

    public void queueGLEvent(Runnable runnable) {
        this.c.queueEvent(runnable);
    }

    private Updater a() {
        return nativeRenderThread() ? new MultiThreadWrapper(this) : new SingleThreadWrapper(this);
    }

    private void a(String str) {
    }
}
