package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.Keep;
import com.amazon.aps.iva.g3.e;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzep;
import com.google.android.gms.internal.cast.zzeq;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public class OuterHighlightDrawable extends Drawable {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final Rect zzd = new Rect();
    private final Rect zze = new Rect();
    private final Paint zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    public OuterHighlightDrawable(Context context) {
        int color;
        Paint paint = new Paint();
        this.zzf = paint;
        this.zzh = 1.0f;
        this.zzk = 0.0f;
        this.zzl = 0.0f;
        this.zzm = 244;
        if (PlatformVersion.isAtLeastLollipop()) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843827, typedValue, true);
            color = e.h(typedValue.data, 244);
        } else {
            color = context.getResources().getColor(R.color.cast_libraries_material_featurehighlight_outer_highlight_default_color);
        }
        paint.setColor(color);
        this.zzm = paint.getAlpha();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Resources resources = context.getResources();
        this.zza = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_center_threshold);
        this.zzb = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_center_horizontal_offset);
        this.zzc = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_outer_padding);
    }

    private static final float zzh(float f, float f2, Rect rect) {
        float f3 = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        float zza = zzeq.zza(f, f2, f3, f4);
        float zza2 = zzeq.zza(f, f2, f5, f4);
        int i = (zza > zza2 ? 1 : (zza == zza2 ? 0 : -1));
        float zza3 = zzeq.zza(f, f2, f5, f6);
        float zza4 = zzeq.zza(f, f2, f3, f6);
        if (i <= 0 || zza <= zza3 || zza <= zza4) {
            if (zza2 > zza3 && zza2 > zza4) {
                zza = zza2;
            } else if (zza3 <= zza4) {
                zza = zza4;
            } else {
                zza = zza3;
            }
        }
        return (float) Math.ceil(zza);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.zzi + this.zzk, this.zzj + this.zzl, this.zzg * this.zzh, this.zzf);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.zzf.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.zzf.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.zzf.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.zzh = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f) {
        this.zzk = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f) {
        this.zzl = f;
        invalidateSelf();
    }

    public final float zza() {
        return this.zzi;
    }

    public final float zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzf.getColor();
    }

    public final Animator zzd(float f, float f2) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationX", f, 0.0f), PropertyValuesHolder.ofFloat("translationY", f2, 0.0f), PropertyValuesHolder.ofInt("alpha", 0, this.zzm));
        ofPropertyValuesHolder.setInterpolator(zzep.zzc());
        return ofPropertyValuesHolder.setDuration(350L);
    }

    public final void zze(int i) {
        this.zzf.setColor(i);
        this.zzm = this.zzf.getAlpha();
        invalidateSelf();
    }

    public final void zzf(Rect rect, Rect rect2) {
        float exactCenterX;
        this.zzd.set(rect);
        this.zze.set(rect2);
        float exactCenterX2 = rect.exactCenterX();
        float exactCenterY = rect.exactCenterY();
        Rect bounds = getBounds();
        if (Math.min(exactCenterY - bounds.top, bounds.bottom - exactCenterY) < this.zza) {
            this.zzi = exactCenterX2;
            this.zzj = exactCenterY;
        } else {
            if (exactCenterX2 <= bounds.exactCenterX()) {
                exactCenterX = rect2.exactCenterX() + this.zzb;
            } else {
                exactCenterX = rect2.exactCenterX() - this.zzb;
            }
            this.zzi = exactCenterX;
            exactCenterY = rect2.exactCenterY();
            this.zzj = exactCenterY;
        }
        int i = this.zzc;
        this.zzg = i + Math.max(zzh(this.zzi, exactCenterY, rect), zzh(this.zzi, this.zzj, rect2));
        invalidateSelf();
    }

    public final boolean zzg(float f, float f2) {
        if (zzeq.zza(f, f2, this.zzi, this.zzj) < this.zzg) {
            return true;
        }
        return false;
    }
}
