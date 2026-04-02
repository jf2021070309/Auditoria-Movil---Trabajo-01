package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.amazon.aps.iva.d3.a;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes3.dex */
public class ColorContrast {
    private static final float HIGH_CONTRAST_THRESHOLD = 0.6666667f;
    private static final float MEDIUM_CONTRAST_THRESHOLD = 0.33333334f;

    private ColorContrast() {
    }

    public static void applyToActivitiesIfAvailable(Application application, ColorContrastOptions colorContrastOptions) {
        if (!isContrastAvailable()) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new ColorContrastActivityLifecycleCallbacks(colorContrastOptions));
    }

    public static void applyToActivityIfAvailable(Activity activity, ColorContrastOptions colorContrastOptions) {
        int contrastThemeOverlayResourceId;
        if (isContrastAvailable() && (contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(activity, colorContrastOptions)) != 0) {
            ThemeUtils.applyThemeOverlay(activity, contrastThemeOverlayResourceId);
        }
    }

    private static int getContrastThemeOverlayResourceId(Context context, ColorContrastOptions colorContrastOptions) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (isContrastAvailable() && uiModeManager != null) {
            float contrast = uiModeManager.getContrast();
            int mediumContrastThemeOverlay = colorContrastOptions.getMediumContrastThemeOverlay();
            int highContrastThemeOverlay = colorContrastOptions.getHighContrastThemeOverlay();
            if (contrast >= HIGH_CONTRAST_THRESHOLD) {
                if (highContrastThemeOverlay != 0) {
                    return highContrastThemeOverlay;
                }
                return mediumContrastThemeOverlay;
            } else if (contrast >= MEDIUM_CONTRAST_THRESHOLD) {
                if (mediumContrastThemeOverlay == 0) {
                    return highContrastThemeOverlay;
                }
                return mediumContrastThemeOverlay;
            }
        }
        return 0;
    }

    public static boolean isContrastAvailable() {
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        return false;
    }

    public static Context wrapContextIfAvailable(Context context, ColorContrastOptions colorContrastOptions) {
        if (!isContrastAvailable()) {
            return context;
        }
        int contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(context, colorContrastOptions);
        if (contrastThemeOverlayResourceId == 0) {
            return context;
        }
        return new ContextThemeWrapper(context, contrastThemeOverlayResourceId);
    }

    /* loaded from: classes3.dex */
    public static class ColorContrastActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        private final Set<Activity> activitiesInStack = new LinkedHashSet();
        private final ColorContrastOptions colorContrastOptions;
        private UiModeManager.ContrastChangeListener contrastChangeListener;

        public ColorContrastActivityLifecycleCallbacks(ColorContrastOptions colorContrastOptions) {
            this.colorContrastOptions = colorContrastOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            this.activitiesInStack.remove(activity);
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.contrastChangeListener != null && this.activitiesInStack.isEmpty()) {
                uiModeManager.removeContrastChangeListener(this.contrastChangeListener);
                this.contrastChangeListener = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.activitiesInStack.isEmpty() && this.contrastChangeListener == null) {
                this.contrastChangeListener = new UiModeManager.ContrastChangeListener() { // from class: com.google.android.material.color.ColorContrast.ColorContrastActivityLifecycleCallbacks.1
                    public void onContrastChanged(float f) {
                        for (Activity activity2 : ColorContrastActivityLifecycleCallbacks.this.activitiesInStack) {
                            activity2.recreate();
                        }
                    }
                };
                uiModeManager.addContrastChangeListener(a.getMainExecutor(activity.getApplicationContext()), this.contrastChangeListener);
            }
            this.activitiesInStack.add(activity);
            if (uiModeManager != null) {
                ColorContrast.applyToActivityIfAvailable(activity, this.colorContrastOptions);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
