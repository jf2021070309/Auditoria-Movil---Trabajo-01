package com.kwad.components.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.Button;
import com.kwad.sdk.R;
import com.kwad.sdk.widget.h;
/* loaded from: classes.dex */
public class KSCornerButton extends Button {
    private com.kwad.sdk.widget.h mViewRCHelper;

    public KSCornerButton(Context context) {
        super(context);
        a(context, null);
    }

    public KSCornerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public KSCornerButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public KSCornerButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        h.a aVar = new h.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_KSCornerImageView);
        aVar.bS(obtainStyledAttributes.getBoolean(R.styleable.ksad_KSCornerImageView_ksad_leftTopCorner, true));
        aVar.bT(obtainStyledAttributes.getBoolean(R.styleable.ksad_KSCornerImageView_ksad_topRightCorner, true));
        aVar.bU(obtainStyledAttributes.getBoolean(R.styleable.ksad_KSCornerImageView_ksad_rightBottomCorner, true));
        aVar.bV(obtainStyledAttributes.getBoolean(R.styleable.ksad_KSCornerImageView_ksad_bottomLeftCorner, true));
        obtainStyledAttributes.recycle();
        com.kwad.sdk.widget.h hVar = new com.kwad.sdk.widget.h(aVar);
        this.mViewRCHelper = hVar;
        hVar.initAttrs(context, attributeSet);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.mViewRCHelper.beforeDispatchDraw(canvas);
        super.dispatchDraw(canvas);
        this.mViewRCHelper.afterDispatchDraw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.mViewRCHelper.beforeDraw(canvas);
        super.draw(canvas);
        this.mViewRCHelper.afterDraw(canvas);
    }

    public h.a getCornerConf() {
        return this.mViewRCHelper.getCornerConf();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mViewRCHelper.onSizeChanged(i, i2);
    }

    public void setRadius(float f) {
        this.mViewRCHelper.setRadius(f);
        postInvalidate();
    }
}
