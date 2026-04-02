package com.braze.ui.inappmessage.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.inappmessage.CropType;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
/* compiled from: InAppMessageImageView.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0014J\u001e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017R\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,8\u0006@BX\u0086.¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00102R\u001c\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0013\u00103\u0012\u0004\b4\u00105¨\u0006<"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "Landroid/widget/ImageView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "Lcom/amazon/aps/iva/kb0/q;", "setCornersRadiiPx", "cornersRadius", "setCornersRadiusPx", "Lcom/braze/enums/inappmessage/CropType;", "cropType", "setInAppMessageImageCropType", "aspectRatio", "setAspectRatio", "", "setToHalfHeight", "setToHalfParentHeight", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "widthPx", "heightPx", "clipCanvasToPath", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "getClipPath", "()Landroid/graphics/Path;", "setClipPath", "(Landroid/graphics/Path;)V", "Landroid/graphics/RectF;", "rectf", "Landroid/graphics/RectF;", "getRectf", "()Landroid/graphics/RectF;", "setRectf", "(Landroid/graphics/RectF;)V", "", "<set-?>", "inAppRadii", "[F", "getInAppRadii", "()[F", "F", "Z", "getSetToHalfParentHeight$annotations", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class InAppMessageImageView extends ImageView implements IInAppMessageImageView {
    private float aspectRatio;
    private Path clipPath;
    private float[] inAppRadii;
    private RectF rectf;
    private boolean setToHalfParentHeight;

    public InAppMessageImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clipPath = new Path();
        this.rectf = new RectF();
        this.aspectRatio = -1.0f;
        setAdjustViewBounds(true);
    }

    public final boolean clipCanvasToPath(Canvas canvas, int i, int i2) {
        j.f(canvas, "canvas");
        if (this.inAppRadii == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageImageView$clipCanvasToPath$2.INSTANCE, 3, (Object) null);
            return false;
        }
        try {
            this.clipPath.reset();
            this.rectf.set(0.0f, 0.0f, i, i2);
            this.clipPath.addRoundRect(this.rectf, getInAppRadii(), Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            return true;
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, InAppMessageImageView$clipCanvasToPath$3.INSTANCE);
            return false;
        }
    }

    public final Path getClipPath() {
        return this.clipPath;
    }

    public final float[] getInAppRadii() {
        float[] fArr = this.inAppRadii;
        if (fArr != null) {
            return fArr;
        }
        j.m("inAppRadii");
        throw null;
    }

    public final RectF getRectf() {
        return this.rectf;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        j.f(canvas, "canvas");
        clipCanvasToPath(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        ViewParent parent;
        super.onMeasure(i, i2);
        if (this.aspectRatio == -1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z && getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, Math.min(getMeasuredHeight(), (int) (measuredWidth / this.aspectRatio)) + 1);
        } else {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.setToHalfParentHeight) {
            j.d(getParent(), "null cannot be cast to non-null type android.view.View");
            setMeasuredDimension(getMeasuredWidth(), (int) (((View) parent).getHeight() * 0.5d));
        }
    }

    public void setAspectRatio(float f) {
        this.aspectRatio = f;
        requestLayout();
    }

    public final void setClipPath(Path path) {
        j.f(path, "<set-?>");
        this.clipPath = path;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setCornersRadiiPx(float f, float f2, float f3, float f4) {
        this.inAppRadii = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setCornersRadiusPx(float f) {
        setCornersRadiiPx(f, f, f, f);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setInAppMessageImageCropType(CropType cropType) {
        if (cropType == CropType.FIT_CENTER) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (cropType == CropType.CENTER_CROP) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public final void setRectf(RectF rectF) {
        j.f(rectF, "<set-?>");
        this.rectf = rectF;
    }

    public void setToHalfParentHeight(boolean z) {
        this.setToHalfParentHeight = z;
        requestLayout();
    }

    private static /* synthetic */ void getSetToHalfParentHeight$annotations() {
    }
}
