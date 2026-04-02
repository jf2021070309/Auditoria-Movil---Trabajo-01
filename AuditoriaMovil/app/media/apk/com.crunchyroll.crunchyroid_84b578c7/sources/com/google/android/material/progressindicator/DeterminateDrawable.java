package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.amazon.aps.iva.h4.a;
import com.amazon.aps.iva.h4.b;
import com.amazon.aps.iva.h4.c;
import com.amazon.aps.iva.h4.d;
import com.amazon.aps.iva.h4.e;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private static final c<DeterminateDrawable> INDICATOR_LENGTH_IN_LEVEL = new c<DeterminateDrawable>("indicatorLevel") { // from class: com.google.android.material.progressindicator.DeterminateDrawable.1
        @Override // com.amazon.aps.iva.h4.c
        public float getValue(DeterminateDrawable determinateDrawable) {
            return determinateDrawable.getIndicatorFraction() * 10000.0f;
        }

        @Override // com.amazon.aps.iva.h4.c
        public void setValue(DeterminateDrawable determinateDrawable, float f) {
            determinateDrawable.setIndicatorFraction(f / 10000.0f);
        }
    };
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private DrawingDelegate<S> drawingDelegate;
    private float indicatorFraction;
    private boolean skipAnimationOnLevelChange;
    private final d springAnimation;
    private final e springForce;

    public DeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate<S> drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.skipAnimationOnLevelChange = false;
        setDrawingDelegate(drawingDelegate);
        e eVar = new e();
        this.springForce = eVar;
        eVar.b = 1.0f;
        eVar.c = false;
        eVar.a = Math.sqrt((double) SPRING_FORCE_STIFFNESS);
        eVar.c = false;
        d dVar = new d(this, INDICATOR_LENGTH_IN_LEVEL);
        this.springAnimation = dVar;
        dVar.r = eVar;
        setGrowFraction(1.0f);
    }

    public static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    public static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getIndicatorFraction() {
        return this.indicatorFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorFraction(float f) {
        this.indicatorFraction = f;
        invalidateSelf();
    }

    public void addSpringAnimationEndListener(b.p pVar) {
        ArrayList<b.p> arrayList = this.springAnimation.j;
        if (!arrayList.contains(pVar)) {
            arrayList.add(pVar);
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction());
            this.drawingDelegate.fillTrack(canvas, this.paint);
            this.drawingDelegate.fillIndicator(canvas, this.paint, 0.0f, getIndicatorFraction(), MaterialColors.compositeARGBWithAlpha(this.baseSpec.indicatorColors[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public DrawingDelegate<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.springAnimation.c();
        setIndicatorFraction(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.skipAnimationOnLevelChange) {
            this.springAnimation.c();
            setIndicatorFraction(i / 10000.0f);
        } else {
            d dVar = this.springAnimation;
            dVar.b = getIndicatorFraction() * 10000.0f;
            dVar.c = true;
            d dVar2 = this.springAnimation;
            float f = i;
            if (dVar2.f) {
                dVar2.s = f;
            } else {
                if (dVar2.r == null) {
                    dVar2.r = new e(f);
                }
                e eVar = dVar2.r;
                double d = f;
                eVar.i = d;
                double d2 = (float) d;
                if (d2 <= Float.MAX_VALUE) {
                    float f2 = dVar2.g;
                    if (d2 >= f2) {
                        double abs = Math.abs(dVar2.i * 0.75f);
                        eVar.d = abs;
                        eVar.e = abs * 62.5d;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            boolean z = dVar2.f;
                            if (!z && !z) {
                                dVar2.f = true;
                                if (!dVar2.c) {
                                    dVar2.b = dVar2.e.getValue(dVar2.d);
                                }
                                float f3 = dVar2.b;
                                if (f3 <= Float.MAX_VALUE && f3 >= f2) {
                                    ThreadLocal<a> threadLocal = a.f;
                                    if (threadLocal.get() == null) {
                                        threadLocal.set(new a());
                                    }
                                    a aVar = threadLocal.get();
                                    ArrayList<a.b> arrayList = aVar.b;
                                    if (arrayList.size() == 0) {
                                        if (aVar.d == null) {
                                            aVar.d = new a.d(aVar.c);
                                        }
                                        a.d dVar3 = aVar.d;
                                        dVar3.b.postFrameCallback(dVar3.c);
                                    }
                                    if (!arrayList.contains(dVar2)) {
                                        arrayList.add(dVar2);
                                    }
                                } else {
                                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                                }
                            }
                        } else {
                            throw new AndroidRuntimeException("Animations may only be started on the main thread");
                        }
                    } else {
                        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                    }
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
            }
        }
        return true;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void registerAnimationCallback(com.amazon.aps.iva.b9.b bVar) {
        super.registerAnimationCallback(bVar);
    }

    public void removeSpringAnimationEndListener(b.p pVar) {
        ArrayList<b.p> arrayList = this.springAnimation.j;
        int indexOf = arrayList.indexOf(pVar);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setDrawingDelegate(DrawingDelegate<S> drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
        drawingDelegate.registerDrawable(this);
    }

    public void setLevelByFraction(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        float systemAnimatorDurationScale = this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
        if (systemAnimatorDurationScale == 0.0f) {
            this.skipAnimationOnLevelChange = true;
        } else {
            this.skipAnimationOnLevelChange = false;
            e eVar = this.springForce;
            float f = SPRING_FORCE_STIFFNESS / systemAnimatorDurationScale;
            eVar.getClass();
            if (f > 0.0f) {
                eVar.a = Math.sqrt(f);
                eVar.c = false;
            } else {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
        }
        return visibleInternal;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(com.amazon.aps.iva.b9.b bVar) {
        return super.unregisterAnimationCallback(bVar);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }
}
