package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.amazon.aps.iva.c8.c;
import com.amazon.aps.iva.g3.e;
import com.google.android.material.animation.AnimationUtils;
/* loaded from: classes3.dex */
public class DrawerLayoutUtils {
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    private static final int DEFAULT_SCRIM_ALPHA = Color.alpha((int) DEFAULT_SCRIM_COLOR);

    private DrawerLayoutUtils() {
    }

    public static Animator.AnimatorListener getScrimCloseAnimatorListener(final DrawerLayout drawerLayout, final View view) {
        return new AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                drawerLayout.c(view, false);
                drawerLayout.setScrimColor(DrawerLayoutUtils.DEFAULT_SCRIM_COLOR);
            }
        };
    }

    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(DrawerLayout drawerLayout) {
        return new c(drawerLayout, 1);
    }

    public static /* synthetic */ void lambda$getScrimCloseAnimatorUpdateListener$0(DrawerLayout drawerLayout, ValueAnimator valueAnimator) {
        drawerLayout.setScrimColor(e.h(DEFAULT_SCRIM_COLOR, AnimationUtils.lerp(DEFAULT_SCRIM_ALPHA, 0, valueAnimator.getAnimatedFraction())));
    }
}
