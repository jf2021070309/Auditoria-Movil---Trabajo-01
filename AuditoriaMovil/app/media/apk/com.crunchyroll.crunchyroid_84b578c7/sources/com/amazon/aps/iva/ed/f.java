package com.amazon.aps.iva.ed;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.amazon.aps.iva.fd.d;
/* compiled from: ImageViewTarget.java */
/* loaded from: classes.dex */
public abstract class f<Z> extends i<ImageView, Z> implements d.a {
    private Animatable animatable;

    public f(ImageView imageView) {
        super(imageView);
    }

    private void maybeUpdateAnimatable(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.animatable = animatable;
            animatable.start();
            return;
        }
        this.animatable = null;
    }

    private void setResourceInternal(Z z) {
        setResource(z);
        maybeUpdateAnimatable(z);
    }

    @Override // com.amazon.aps.iva.fd.d.a
    public Drawable getCurrentDrawable() {
        return ((ImageView) this.view).getDrawable();
    }

    @Override // com.amazon.aps.iva.ed.i, com.amazon.aps.iva.ed.a, com.amazon.aps.iva.ed.h
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.amazon.aps.iva.ed.a, com.amazon.aps.iva.ed.h
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.amazon.aps.iva.ed.i, com.amazon.aps.iva.ed.a, com.amazon.aps.iva.ed.h
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.amazon.aps.iva.ed.h
    public void onResourceReady(Z z, com.amazon.aps.iva.fd.d<? super Z> dVar) {
        if (dVar != null && dVar.a(z, this)) {
            maybeUpdateAnimatable(z);
        } else {
            setResourceInternal(z);
        }
    }

    @Override // com.amazon.aps.iva.ed.a, com.amazon.aps.iva.ad.h
    public void onStart() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.amazon.aps.iva.ed.a, com.amazon.aps.iva.ad.h
    public void onStop() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.amazon.aps.iva.fd.d.a
    public void setDrawable(Drawable drawable) {
        ((ImageView) this.view).setImageDrawable(drawable);
    }

    public abstract void setResource(Z z);

    @Deprecated
    public f(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
