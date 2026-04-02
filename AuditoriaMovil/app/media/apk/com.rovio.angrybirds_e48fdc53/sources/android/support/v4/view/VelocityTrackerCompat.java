package android.support.v4.view;

import android.view.VelocityTracker;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
@Deprecated
/* loaded from: classes.dex */
public final class VelocityTrackerCompat {
    @Deprecated
    public static float getXVelocity(VelocityTracker tracker, int pointerId) {
        return tracker.getXVelocity(pointerId);
    }

    @Deprecated
    public static float getYVelocity(VelocityTracker tracker, int pointerId) {
        return tracker.getYVelocity(pointerId);
    }

    private VelocityTrackerCompat() {
    }
}
