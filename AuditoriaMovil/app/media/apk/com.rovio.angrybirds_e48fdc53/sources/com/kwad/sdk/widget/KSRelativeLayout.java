package com.kwad.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.ac;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public class KSRelativeLayout extends RelativeLayout implements i {
    private final AtomicBoolean SO;
    private g aLY;
    private i aLZ;
    private final ac.a axl;
    private float mRatio;
    private h mViewRCHelper;

    public KSRelativeLayout(Context context) {
        super(context);
        this.SO = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.axl = new ac.a();
        init(context, null);
    }

    public KSRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.SO = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.axl = new ac.a();
        init(context, attributeSet);
    }

    public KSRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.SO = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.axl = new ac.a();
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            int i = R.attr.ksad_ratio;
            int[] iArr = {i};
            Arrays.sort(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            this.mRatio = obtainStyledAttributes.getFloat(Arrays.binarySearch(iArr, i), 0.0f);
            obtainStyledAttributes.recycle();
        }
        g gVar = new g(this, this);
        this.aLY = gVar;
        gVar.bR(true);
        h hVar = new h();
        this.mViewRCHelper = hVar;
        hVar.initAttrs(context, attributeSet);
    }

    private void sq() {
        if (this.SO.getAndSet(false)) {
            com.kwad.sdk.core.e.c.i("KSRelativeLayout", "onViewAttached");
            aa();
        }
    }

    private void sr() {
        if (this.SO.getAndSet(true)) {
            return;
        }
        com.kwad.sdk.core.e.c.i("KSRelativeLayout", "onViewDetached");
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

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
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

    public ac.a getTouchCoords() {
        return this.axl;
    }

    public float getVisiblePercent() {
        return this.aLY.getVisiblePercent();
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        sq();
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sr();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        sq();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mRatio != 0.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.mRatio), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
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

    public void setRadius(float f) {
        this.mViewRCHelper.setRadius(f);
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

    @Override // com.kwad.sdk.widget.i
    public final void z(View view) {
        i iVar = this.aLZ;
        if (iVar != null) {
            iVar.z(view);
        }
    }
}
