package com.rovio.fusion;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
/* loaded from: classes2.dex */
public class MyRenderer implements GLSurfaceView.Renderer {
    private static final boolean ENABLE_LOGGING = false;
    private Updater a;
    private volatile RendererState b = RendererState.PAUSED;

    /* loaded from: classes2.dex */
    private enum RendererState {
        PAUSED,
        RESUMED
    }

    public MyRenderer(Updater updater) {
        this.a = updater;
    }

    public void onPause() {
        a("onPause");
        this.a.onPause();
    }

    public void onResume() {
        a("onResume");
        this.a.onResume();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        a("onSurfaceCreated");
        Thread.currentThread().setName("GraphicsThread");
        EGLWrapper.init(eGLConfig);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        a("onSurfaceChanged " + i + " x " + i2);
        if (!this.a.setOrientation(i > i2)) {
            a("Unsupported surface orientation " + i + "x" + i2);
        } else if (!this.a.isInitialized()) {
            this.a.initialize(i, i2);
        } else {
            this.a.onResize(i, i2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (!this.a.onFrame()) {
            GL11 gl11 = (GL11) gl10;
            float[] fArr = new float[4];
            gl11.glGetFloatv(3106, fArr, 0);
            gl11.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            gl11.glClear(16384);
            gl11.glClearColor(fArr[0], fArr[1], fArr[2], 1.0f);
        }
    }

    private void a(String str) {
    }
}
