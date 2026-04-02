package com.me.game.pmadsdk.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.me.game.pmadsdk.resource.Colors;
import com.me.game.pmadsdk.utils.ViewUtils;
/* loaded from: classes6.dex */
public class SolidTextView extends CompoundTextView {
    boolean circle;
    ColorStateList mColorStateList;
    Paint mPaint;
    private RectF mRectF;
    private float radius;
    float strokeWidth;
    int styleType;

    public SolidTextView(Context context) {
        super(context);
        this.mPaint = new Paint(1);
        this.mRectF = new RectF();
        this.radius = 0.0f;
    }

    public void setStrokeWidth(float strokeWidth) {
        this.strokeWidth = strokeWidth;
        if (strokeWidth > 0.0f) {
            this.mPaint.setStrokeWidth(strokeWidth);
        } else {
            this.mPaint.setStyle(Paint.Style.FILL);
        }
    }

    public void setColorStateList(int color) {
        this.mColorStateList = new ColorStateList(new int[][]{new int[0]}, new int[]{color});
        setBackgroundDrawable(new RippleDrawable(Colors.RIPPLE_STATE_LIST, getShape(), null));
    }

    public void setColorStateList(ColorStateList colorStateList) {
        this.mColorStateList = colorStateList;
        setBackgroundDrawable(new RippleDrawable(Colors.RIPPLE_STATE_LIST, getShape(), null));
    }

    public void setCircle(boolean circle) {
        this.circle = circle;
    }

    public void setStyleType(int styleType) {
        this.styleType = styleType;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    private Drawable getShape() {
        ShapeDrawable mask = new ShapeDrawable(new RectShape() { // from class: com.me.game.pmadsdk.widget.SolidTextView.1
            @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
            public void draw(Canvas canvas, Paint paint) {
                RectF roundRectF = new RectF();
                roundRectF.set(SolidTextView.this.mRectF);
                if (SolidTextView.this.strokeWidth > 0.0f) {
                    if (SolidTextView.this.isSelected() && SolidTextView.this.styleType > 1) {
                        if ((SolidTextView.this.styleType & 2) == 2) {
                            SolidTextView.this.mPaint.setStyle(Paint.Style.STROKE);
                            roundRectF.inset(SolidTextView.this.strokeWidth / 2.0f, SolidTextView.this.strokeWidth / 2.0f);
                        }
                    } else if ((SolidTextView.this.styleType & 1) == 1) {
                        SolidTextView.this.mPaint.setStyle(Paint.Style.STROKE);
                        roundRectF.inset(SolidTextView.this.strokeWidth / 2.0f, SolidTextView.this.strokeWidth / 2.0f);
                    } else {
                        SolidTextView.this.mPaint.setStyle(Paint.Style.FILL);
                    }
                }
                SolidTextView.this.mPaint.setColor(SolidTextView.this.mColorStateList.getColorForState(SolidTextView.this.isSelected() ? ViewUtils.STATE_SELECTED : ViewUtils.STATE_NONE, SolidTextView.this.mColorStateList.getDefaultColor()));
                canvas.drawRoundRect(roundRectF, SolidTextView.this.radius, SolidTextView.this.radius, SolidTextView.this.mPaint);
            }
        });
        return mask;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mRectF.left = 0.0f;
        this.mRectF.top = 0.0f;
        this.mRectF.right = getWidth();
        this.mRectF.bottom = getHeight();
        if (this.circle) {
            this.radius = getHeight() / 2;
        }
    }
}
