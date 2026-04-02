package com.rovio.fusion;

import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
/* loaded from: classes2.dex */
public class MySurfaceView extends GLSurfaceView {
    private static final boolean ENABLE_LOGGING = false;
    private NativeApplication a;
    private MyRenderer b;
    private InputDelegator c;

    public MySurfaceView(App app) {
        super(app);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(true);
        setPreserveEGLContextOnPause(true);
        this.a = new NativeApplication(this, app.getFilesDir().getAbsolutePath());
        this.c = this.a.createInputDelegate();
        setRenderer(this.a.getRenderer());
    }

    public InputDelegator getInputDelegate() {
        return this.c;
    }

    public void setRenderer(MyRenderer myRenderer) {
        this.b = myRenderer;
        super.setRenderer((GLSurfaceView.Renderer) myRenderer);
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        Debug("onPause()");
        queueEvent(new Runnable() { // from class: com.rovio.fusion.MySurfaceView.1
            @Override // java.lang.Runnable
            public void run() {
                MySurfaceView.this.b.onPause();
            }
        });
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        Debug("onResume()");
        queueEvent(new Runnable() { // from class: com.rovio.fusion.MySurfaceView.2
            @Override // java.lang.Runnable
            public void run() {
                MySurfaceView.this.b.onResume();
            }
        });
        super.onResume();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return this.c.onHoverEvent(motionEvent);
    }

    private static void Debug(String str) {
    }
}
