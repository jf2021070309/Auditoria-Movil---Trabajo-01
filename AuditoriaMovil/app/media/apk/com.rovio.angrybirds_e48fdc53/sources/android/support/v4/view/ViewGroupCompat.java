package android.support.v4.view;

import android.os.Build;
import android.support.compat.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* loaded from: classes.dex */
public final class ViewGroupCompat {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    /* loaded from: classes2.dex */
    static class ViewGroupCompatBaseImpl {
        ViewGroupCompatBaseImpl() {
        }

        public int getLayoutMode(ViewGroup viewGroup) {
            return 0;
        }

        public void setLayoutMode(ViewGroup viewGroup, int i) {
        }

        public void setTransitionGroup(ViewGroup viewGroup, boolean z) {
            viewGroup.setTag(R.id.tag_transition_group, Boolean.valueOf(z));
        }

        public boolean isTransitionGroup(ViewGroup viewGroup) {
            Boolean bool = (Boolean) viewGroup.getTag(R.id.tag_transition_group);
            return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && ViewCompat.getTransitionName(viewGroup) == null) ? false : true;
        }

        public int getNestedScrollAxes(ViewGroup viewGroup) {
            if (viewGroup instanceof NestedScrollingParent) {
                return ((NestedScrollingParent) viewGroup).getNestedScrollAxes();
            }
            return 0;
        }
    }

    private ViewGroupCompat() {
    }

    @Deprecated
    public static boolean onRequestSendAccessibilityEvent(ViewGroup group, View child, AccessibilityEvent event) {
        return group.onRequestSendAccessibilityEvent(child, event);
    }

    /* loaded from: classes2.dex */
    static class ViewGroupCompatApi18Impl extends ViewGroupCompatBaseImpl {
        ViewGroupCompatApi18Impl() {
        }

        @Override // android.support.v4.view.ViewGroupCompat.ViewGroupCompatBaseImpl
        public int getLayoutMode(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @Override // android.support.v4.view.ViewGroupCompat.ViewGroupCompatBaseImpl
        public void setLayoutMode(ViewGroup viewGroup, int i) {
            viewGroup.setLayoutMode(i);
        }
    }

    /* loaded from: classes2.dex */
    static class ViewGroupCompatApi21Impl extends ViewGroupCompatApi18Impl {
        ViewGroupCompatApi21Impl() {
        }

        @Override // android.support.v4.view.ViewGroupCompat.ViewGroupCompatBaseImpl
        public void setTransitionGroup(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }

        @Override // android.support.v4.view.ViewGroupCompat.ViewGroupCompatBaseImpl
        public boolean isTransitionGroup(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @Override // android.support.v4.view.ViewGroupCompat.ViewGroupCompatBaseImpl
        public int getNestedScrollAxes(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }
    }

    @Deprecated
    public static void setMotionEventSplittingEnabled(ViewGroup group, boolean split) {
        group.setMotionEventSplittingEnabled(split);
    }

    public static int getLayoutMode(ViewGroup group) {
        if (Build.VERSION.SDK_INT >= 18) {
            return group.getLayoutMode();
        }
        return 0;
    }

    public static void setLayoutMode(ViewGroup group, int mode) {
        if (Build.VERSION.SDK_INT >= 18) {
            group.setLayoutMode(mode);
        }
    }

    public static void setTransitionGroup(ViewGroup group, boolean isTransitionGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            group.setTransitionGroup(isTransitionGroup);
        } else {
            group.setTag(R.id.tag_transition_group, Boolean.valueOf(isTransitionGroup));
        }
    }

    public static boolean isTransitionGroup(ViewGroup group) {
        if (Build.VERSION.SDK_INT >= 21) {
            return group.isTransitionGroup();
        }
        Boolean explicit = (Boolean) group.getTag(R.id.tag_transition_group);
        return ((explicit == null || !explicit.booleanValue()) && group.getBackground() == null && ViewCompat.getTransitionName(group) == null) ? false : true;
    }

    public static int getNestedScrollAxes(ViewGroup group) {
        if (Build.VERSION.SDK_INT >= 21) {
            return group.getNestedScrollAxes();
        }
        if (group instanceof NestedScrollingParent) {
            return ((NestedScrollingParent) group).getNestedScrollAxes();
        }
        return 0;
    }
}
