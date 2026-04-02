package android.support.v4.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* loaded from: classes.dex */
public final class ViewParentCompat {
    private static final String TAG = "ViewParentCompat";

    /* loaded from: classes2.dex */
    static class ViewParentCompatBaseImpl {
        ViewParentCompatBaseImpl() {
        }

        public boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof NestedScrollingParent) {
                return ((NestedScrollingParent) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }

        public void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }

        public void onStopNestedScroll(ViewParent viewParent, View view) {
            if (viewParent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) viewParent).onStopNestedScroll(view);
            }
        }

        public void onNestedScroll(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        public void onNestedPreScroll(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        public boolean onNestedFling(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof NestedScrollingParent) {
                return ((NestedScrollingParent) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        public boolean onNestedPreFling(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof NestedScrollingParent) {
                return ((NestedScrollingParent) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }

        public void notifySubtreeAccessibilityStateChanged(ViewParent viewParent, View view, View view2, int i) {
        }
    }

    private ViewParentCompat() {
    }

    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent parent, View child, AccessibilityEvent event) {
        return parent.requestSendAccessibilityEvent(child, event);
    }

    public static boolean onStartNestedScroll(ViewParent parent, View child, View target, int nestedScrollAxes) {
        return onStartNestedScroll(parent, child, target, nestedScrollAxes, 0);
    }

    /* loaded from: classes2.dex */
    static class ViewParentCompatApi19Impl extends ViewParentCompatBaseImpl {
        ViewParentCompatApi19Impl() {
        }

        @Override // android.support.v4.view.ViewParentCompat.ViewParentCompatBaseImpl
        public void notifySubtreeAccessibilityStateChanged(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }
    }

    public static void onNestedScrollAccepted(ViewParent parent, View child, View target, int nestedScrollAxes) {
        onNestedScrollAccepted(parent, child, target, nestedScrollAxes, 0);
    }

    /* loaded from: classes2.dex */
    static class ViewParentCompatApi21Impl extends ViewParentCompatApi19Impl {
        ViewParentCompatApi21Impl() {
        }

        @Override // android.support.v4.view.ViewParentCompat.ViewParentCompatBaseImpl
        public boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        }

        @Override // android.support.v4.view.ViewParentCompat.ViewParentCompatBaseImpl
        public void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }

        @Override // android.support.v4.view.ViewParentCompat.ViewParentCompatBaseImpl
        public void onStopNestedScroll(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }

        @Override // android.support.v4.view.ViewParentCompat.ViewParentCompatBaseImpl
        public void onNestedScroll(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }

        @Override // android.support.v4.view.ViewParentCompat.ViewParentCompatBaseImpl
        public void onNestedPreScroll(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }

        @Override // android.support.v4.view.ViewParentCompat.ViewParentCompatBaseImpl
        public boolean onNestedFling(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
                return false;
            }
        }

        @Override // android.support.v4.view.ViewParentCompat.ViewParentCompatBaseImpl
        public boolean onNestedPreFling(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        }
    }

    public static void onStopNestedScroll(ViewParent parent, View target) {
        onStopNestedScroll(parent, target, 0);
    }

    public static void onNestedScroll(ViewParent parent, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        onNestedScroll(parent, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, 0);
    }

    public static void onNestedPreScroll(ViewParent parent, View target, int dx, int dy, int[] consumed) {
        onNestedPreScroll(parent, target, dx, dy, consumed, 0);
    }

    public static boolean onStartNestedScroll(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2) parent).onStartNestedScroll(child, target, nestedScrollAxes, type);
        }
        if (type == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    return parent.onStartNestedScroll(child, target, nestedScrollAxes);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                    return false;
                }
            } else if (parent instanceof NestedScrollingParent) {
                return ((NestedScrollingParent) parent).onStartNestedScroll(child, target, nestedScrollAxes);
            } else {
                return false;
            }
        }
        return false;
    }

    public static void onNestedScrollAccepted(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) parent).onNestedScrollAccepted(child, target, nestedScrollAxes, type);
        } else if (type == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedScrollAccepted(child, target, nestedScrollAxes);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e);
                }
            } else if (parent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) parent).onNestedScrollAccepted(child, target, nestedScrollAxes);
            }
        }
    }

    public static void onStopNestedScroll(ViewParent parent, View target, int type) {
        if (parent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) parent).onStopNestedScroll(target, type);
        } else if (type == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onStopNestedScroll(target);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStopNestedScroll", e);
                }
            } else if (parent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) parent).onStopNestedScroll(target);
            }
        }
    }

    public static void onNestedScroll(ViewParent parent, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (parent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) parent).onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
        } else if (type == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScroll", e);
                }
            } else if (parent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) parent).onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
            }
        }
    }

    public static void onNestedPreScroll(ViewParent parent, View target, int dx, int dy, int[] consumed, int type) {
        if (parent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) parent).onNestedPreScroll(target, dx, dy, consumed, type);
        } else if (type == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    parent.onNestedPreScroll(target, dx, dy, consumed);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedPreScroll", e);
                }
            } else if (parent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) parent).onNestedPreScroll(target, dx, dy, consumed);
            }
        }
    }

    public static boolean onNestedFling(ViewParent parent, View target, float velocityX, float velocityY, boolean consumed) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onNestedFling(target, velocityX, velocityY, consumed);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedFling", e);
                return false;
            }
        } else if (parent instanceof NestedScrollingParent) {
            return ((NestedScrollingParent) parent).onNestedFling(target, velocityX, velocityY, consumed);
        } else {
            return false;
        }
    }

    public static boolean onNestedPreFling(ViewParent parent, View target, float velocityX, float velocityY) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return parent.onNestedPreFling(target, velocityX, velocityY);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        } else if (parent instanceof NestedScrollingParent) {
            return ((NestedScrollingParent) parent).onNestedPreFling(target, velocityX, velocityY);
        } else {
            return false;
        }
    }

    public static void notifySubtreeAccessibilityStateChanged(ViewParent parent, View child, View source, int changeType) {
        if (Build.VERSION.SDK_INT >= 19) {
            parent.notifySubtreeAccessibilityStateChanged(child, source, changeType);
        }
    }
}
