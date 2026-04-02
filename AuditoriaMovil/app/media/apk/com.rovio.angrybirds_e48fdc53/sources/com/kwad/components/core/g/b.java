package com.kwad.components.core.g;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kwad.sdk.core.imageloader.ImageLoaderProxy;
import com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public final class b extends KSFrameLayout {
    private ImageView Ky;

    public b(Context context) {
        super(context);
    }

    private ImageView nZ() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    public final void a(String str, ImageLoadingListener imageLoadingListener) {
        if (this.Ky != null) {
            ImageLoaderProxy.INSTANCE.load(this.Ky, str, imageLoadingListener);
        }
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void init(Context context, AttributeSet attributeSet) {
        super.init(context, attributeSet);
        this.Ky = nZ();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.Ky, layoutParams);
    }

    public final void setImageGravity(int i) {
        FrameLayout.LayoutParams layoutParams;
        ImageView imageView = this.Ky;
        if (imageView == null || (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.gravity = i;
        this.Ky.setLayoutParams(layoutParams);
    }

    public final void setImageScaleType(ImageView.ScaleType scaleType) {
        ImageView imageView = this.Ky;
        if (imageView == null || scaleType == null) {
            return;
        }
        imageView.setScaleType(scaleType);
    }
}
