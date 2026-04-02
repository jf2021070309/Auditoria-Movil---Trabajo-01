package com.braze.ui.support;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: AnimationUtils.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"", "fromY", "toY", "", "duration", "", "accelerate", "Landroid/view/animation/Animation;", "createVerticalAnimation", "animation", "setAnimationParams", "Landroid/view/animation/Interpolator;", "accelerateInterpolator", "Landroid/view/animation/Interpolator;", "decelerateInterpolator", "android-sdk-ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimationUtils {
    private static final Interpolator accelerateInterpolator = new AccelerateInterpolator();
    private static final Interpolator decelerateInterpolator = new DecelerateInterpolator();

    public static final Animation createVerticalAnimation(float f, float f2, long j, boolean z) {
        return setAnimationParams(new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, f, 1, f2), j, z);
    }

    public static final Animation setAnimationParams(Animation animation, long j, boolean z) {
        j.f(animation, "animation");
        animation.setDuration(j);
        if (z) {
            animation.setInterpolator(accelerateInterpolator);
        } else {
            animation.setInterpolator(decelerateInterpolator);
        }
        return animation;
    }
}
