package com.kwad.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.ac;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public class KSFrameLayout extends FrameLayout implements e, i {
    private final AtomicBoolean SO;
    private g aLY;
    private i aLZ;
    private View aMa;
    private final ac.a axl;
    private float mRatio;
    private h mViewRCHelper;
    private boolean widthBasedRatio;

    public KSFrameLayout(Context context) {
        super(context);
        this.SO = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.axl = new ac.a();
        this.widthBasedRatio = true;
        init(context, null);
    }

    public KSFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.SO = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.axl = new ac.a();
        this.widthBasedRatio = true;
        init(context, attributeSet);
    }

    public KSFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.SO = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.axl = new ac.a();
        this.widthBasedRatio = true;
        init(context, attributeSet);
    }

    public KSFrameLayout(Context context, View view) {
        super(context);
        this.SO = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.axl = new ac.a();
        this.widthBasedRatio = true;
        this.aMa = view;
        init(context, null);
    }

    private View getPvView() {
        View view = this.aMa;
        return view == null ? this : view;
    }

    private static float[] getRadius(float f, float f2, float f3, float f4) {
        return new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    private void sq() {
        if (this.SO.getAndSet(false)) {
            com.kwad.sdk.core.e.c.i("KSFrameLayout", "onViewAttached");
            aa();
        }
    }

    private void sr() {
        if (this.SO.getAndSet(true)) {
            return;
        }
        com.kwad.sdk.core.e.c.i("KSFrameLayout", "onViewDetached");
        ab();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aa() {
        this.aLY.onAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ab() {
        this.aLY.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.mViewRCHelper.beforeDispatchDraw(canvas);
        super.dispatchDraw(canvas);
        this.mViewRCHelper.afterDispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.axl.x(getWidth(), getHeight());
            this.axl.f(motionEvent.getX(), motionEvent.getY());
        } else if (action == 1) {
            this.axl.g(motionEvent.getX(), motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.mViewRCHelper.beforeDraw(canvas);
        super.draw(canvas);
        this.mViewRCHelper.afterDraw(canvas);
    }

    @Override // com.kwad.sdk.widget.e
    public ac.a getTouchCoords() {
        return this.axl;
    }

    public float getVisiblePercent() {
        return this.aLY.getVisiblePercent();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            int i = R.attr.ksad_ratio;
            int[] iArr = {i};
            Arrays.sort(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            this.mRatio = obtainStyledAttributes.getFloat(Arrays.binarySearch(iArr, i), 0.0f);
            obtainStyledAttributes.recycle();
        }
        g gVar = new g(getPvView(), this);
        this.aLY = gVar;
        gVar.bR(true);
        h hVar = new h();
        this.mViewRCHelper = hVar;
        hVar.initAttrs(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        sq();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sr();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        sq();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mRatio != 0.0f) {
            if (this.widthBasedRatio) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.mRatio), 1073741824);
            } else {
                i = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) / this.mRatio), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.aLY.b(i, i2, i3, i4);
        super.onSizeChanged(i, i2, i3, i4);
        this.aLY.KD();
        this.mViewRCHelper.onSizeChanged(i, i2);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        sr();
    }

    public void setAllCorner(boolean z) {
        this.mViewRCHelper.getCornerConf().setAllCorner(z);
    }

    public void setRadius(float f) {
        this.mViewRCHelper.setRadius(f);
        postInvalidate();
    }

    public final void setRadius(float f, float f2, float f3, float f4) {
        this.mViewRCHelper.setRadius(getRadius(f, f2, f3, f4));
        postInvalidate();
    }

    public void setRatio(float f) {
        this.mRatio = f;
    }

    public void setViewVisibleListener(i iVar) {
        this.aLZ = iVar;
    }

    public void setVisiblePercent(float f) {
        this.aLY.setVisiblePercent(f);
    }

    public void setWidthBasedRatio(boolean z) {
        this.widthBasedRatio = z;
    }

    public void z(View view) {
        i iVar = this.aLZ;
        if (iVar != null) {
            iVar.z(view);
        }
    }
}
