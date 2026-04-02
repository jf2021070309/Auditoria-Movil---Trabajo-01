package com.rovio.fusion;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.RelativeLayout;
/* loaded from: classes2.dex */
public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {
    private SurfaceHolder a;
    private Listener b;

    /* loaded from: classes2.dex */
    public interface Listener {
        void onPreviewReady(SurfaceHolder surfaceHolder);
    }

    /* loaded from: classes2.dex */
    public static class Bounds {
        public int height;
        public int left;
        public int top;
        public int width;

        public Bounds(int i, int i2, int i3, int i4) {
            this.left = i;
            this.top = i2;
            this.width = i3;
            this.height = i4;
        }
    }

    public CameraPreview(Bounds bounds, Listener listener) {
        super(Globals.getActivity());
        this.b = listener;
        this.a = getHolder();
        this.a.addCallback(this);
        this.a.setType(3);
        setZOrderMediaOverlay(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(bounds.width, bounds.height);
        layoutParams.setMargins(bounds.left, bounds.top, 0, 0);
        setLayoutParams(layoutParams);
    }

    public void show() {
        Globals.getRootViewGroup().addView(this);
    }

    public void hide() {
        Globals.getRootViewGroup().removeView(this);
    }

    public void setBounds(Bounds bounds) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.width = bounds.width;
        layoutParams.height = bounds.height;
        layoutParams.setMargins(bounds.left, bounds.top, 0, 0);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.b != null) {
            this.b.onPreviewReady(this.a);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public SurfaceHolder getCurrentSurface() {
        return this.a;
    }
}
