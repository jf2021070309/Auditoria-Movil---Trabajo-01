package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;
/* renamed from: com.facebook.ads.redexgen.X.Qi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0862Qi implements View.OnTouchListener {
    public final /* synthetic */ TextureView$SurfaceTextureListenerC0649Hx A00;

    public View$OnTouchListenerC0862Qi(TextureView$SurfaceTextureListenerC0649Hx textureView$SurfaceTextureListenerC0649Hx) {
        this.A00 = textureView$SurfaceTextureListenerC0649Hx;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        MediaController mediaController;
        MediaController mediaController2;
        MediaController mediaController3;
        MediaController mediaController4;
        z = this.A00.A0G;
        if (z) {
            return true;
        }
        mediaController = this.A00.A0A;
        if (mediaController != null && motionEvent.getAction() == 1) {
            mediaController2 = this.A00.A0A;
            if (mediaController2.isShowing()) {
                mediaController4 = this.A00.A0A;
                mediaController4.hide();
            } else {
                mediaController3 = this.A00.A0A;
                mediaController3.show();
            }
        }
        return true;
    }
}
