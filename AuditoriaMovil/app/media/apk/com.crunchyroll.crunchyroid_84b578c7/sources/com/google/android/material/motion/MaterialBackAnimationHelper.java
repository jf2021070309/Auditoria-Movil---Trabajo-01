package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import com.amazon.aps.iva.e.b;
import com.amazon.aps.iva.r3.a;
import com.google.android.material.R;
/* loaded from: classes3.dex */
public abstract class MaterialBackAnimationHelper<V extends View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final String TAG = "MaterialBackHelper";
    private b backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;
    private final TimeInterpolator progressInterpolator;
    protected final V view;

    public MaterialBackAnimationHelper(V v) {
        this.view = v;
        Context context = v.getContext();
        this.progressInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium2, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort3, HIDE_DURATION_MIN_DEFAULT);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort2, 100);
    }

    public float interpolateProgress(float f) {
        return this.progressInterpolator.getInterpolation(f);
    }

    public b onCancelBackProgress() {
        b bVar = this.backEvent;
        this.backEvent = null;
        return bVar;
    }

    public b onHandleBackInvoked() {
        b bVar = this.backEvent;
        this.backEvent = null;
        return bVar;
    }

    public void onStartBackProgress(b bVar) {
        this.backEvent = bVar;
    }

    public b onUpdateBackProgress(b bVar) {
        b bVar2 = this.backEvent;
        this.backEvent = bVar;
        return bVar2;
    }
}
