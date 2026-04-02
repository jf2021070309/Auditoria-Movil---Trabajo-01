package com.amazon.aps.iva.b9;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
/* compiled from: Animatable2Compat.java */
/* loaded from: classes.dex */
public abstract class b {
    Animatable2.AnimationCallback mPlatformCallback;

    /* compiled from: Animatable2Compat.java */
    /* loaded from: classes.dex */
    public class a extends Animatable2.AnimationCallback {
        public a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            b.this.onAnimationEnd(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public final void onAnimationStart(Drawable drawable) {
            b.this.onAnimationStart(drawable);
        }
    }

    public Animatable2.AnimationCallback getPlatformCallback() {
        if (this.mPlatformCallback == null) {
            this.mPlatformCallback = new a();
        }
        return this.mPlatformCallback;
    }

    public void onAnimationEnd(Drawable drawable) {
    }

    public void onAnimationStart(Drawable drawable) {
    }
}
