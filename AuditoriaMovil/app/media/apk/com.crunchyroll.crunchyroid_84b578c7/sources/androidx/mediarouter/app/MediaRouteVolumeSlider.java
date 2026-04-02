package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.amazon.aps.iva.q.x;
/* loaded from: classes.dex */
class MediaRouteVolumeSlider extends x {
    public final float c;
    public boolean d;
    public Drawable e;
    public int f;
    public int g;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = d.d(context);
    }

    public final void a(int i, int i2) {
        if (this.f != i) {
            if (Color.alpha(i) != 255) {
                Integer.toHexString(i);
            }
            this.f = i;
        }
        if (this.g != i2) {
            if (Color.alpha(i2) != 255) {
                Integer.toHexString(i2);
            }
            this.g = i2;
        }
    }

    public final void b(boolean z) {
        Drawable drawable;
        if (this.d == z) {
            return;
        }
        this.d = z;
        if (z) {
            drawable = null;
        } else {
            drawable = this.e;
        }
        super.setThumb(drawable);
    }

    @Override // com.amazon.aps.iva.q.x, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        if (isEnabled()) {
            i = 255;
        } else {
            i = (int) (this.c * 255.0f);
        }
        this.e.setColorFilter(this.f, PorterDuff.Mode.SRC_IN);
        this.e.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.g, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.f, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.e = drawable;
        if (this.d) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
