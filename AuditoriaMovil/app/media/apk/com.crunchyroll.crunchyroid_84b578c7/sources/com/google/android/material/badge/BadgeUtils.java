package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.p3.a;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.q3.l;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;
@ExperimentalBadgeUtils
/* loaded from: classes3.dex */
public class BadgeUtils {
    private static final String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;

    private BadgeUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void attachBadgeContentDescription(final BadgeDrawable badgeDrawable, View view) {
        boolean z;
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT >= 29) {
            if (g0.d(view) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                accessibilityDelegate = view.getAccessibilityDelegate();
                g0.n(view, new a(accessibilityDelegate) { // from class: com.google.android.material.badge.BadgeUtils.2
                    @Override // com.amazon.aps.iva.p3.a
                    public void onInitializeAccessibilityNodeInfo(View view2, l lVar) {
                        super.onInitializeAccessibilityNodeInfo(view2, lVar);
                        lVar.k(badgeDrawable.getContentDescription());
                    }
                });
                return;
            }
        }
        g0.n(view, new a() { // from class: com.google.android.material.badge.BadgeUtils.3
            @Override // com.amazon.aps.iva.p3.a
            public void onInitializeAccessibilityNodeInfo(View view2, l lVar) {
                super.onInitializeAccessibilityNodeInfo(view2, lVar);
                lVar.k(BadgeDrawable.this.getContentDescription());
            }
        });
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
        attachBadgeDrawable(badgeDrawable, view, (FrameLayout) null);
    }

    public static SparseArray<BadgeDrawable> createBadgeDrawablesFromSavedStates(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i);
            if (state != null) {
                sparseArray.put(keyAt, BadgeDrawable.createFromSavedState(context, state));
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    public static ParcelableSparseArray createParcelableBadgeStates(SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            BadgeDrawable valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.getSavedState());
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    private static void detachBadgeContentDescription(View view) {
        boolean z;
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT >= 29) {
            if (g0.d(view) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                accessibilityDelegate = view.getAccessibilityDelegate();
                g0.n(view, new a(accessibilityDelegate) { // from class: com.google.android.material.badge.BadgeUtils.4
                    @Override // com.amazon.aps.iva.p3.a
                    public void onInitializeAccessibilityNodeInfo(View view2, l lVar) {
                        super.onInitializeAccessibilityNodeInfo(view2, lVar);
                        lVar.k(null);
                    }
                });
                return;
            }
        }
        g0.n(view, null);
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (!USE_COMPAT_PARENT && badgeDrawable.getCustomBadgeParent() == null) {
            view.getOverlay().remove(badgeDrawable);
        } else {
            badgeDrawable.getCustomBadgeParent().setForeground(null);
        }
    }

    public static void removeToolbarOffset(BadgeDrawable badgeDrawable) {
        badgeDrawable.setAdditionalHorizontalOffset(0);
        badgeDrawable.setAdditionalVerticalOffset(0);
    }

    public static void setBadgeDrawableBounds(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    public static void setToolbarOffset(BadgeDrawable badgeDrawable, Resources resources) {
        badgeDrawable.setAdditionalHorizontalOffset(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        badgeDrawable.setAdditionalVerticalOffset(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    public static void updateBadgeBounds(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
        } else if (!USE_COMPAT_PARENT) {
            view.getOverlay().add(badgeDrawable);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i) {
        ActionMenuItemView actionMenuItemView;
        if (badgeDrawable == null || (actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i)) == null) {
            return;
        }
        removeToolbarOffset(badgeDrawable);
        detachBadgeDrawable(badgeDrawable, actionMenuItemView);
        detachBadgeContentDescription(actionMenuItemView);
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i) {
        attachBadgeDrawable(badgeDrawable, toolbar, i, null);
    }

    public static void attachBadgeDrawable(final BadgeDrawable badgeDrawable, final Toolbar toolbar, final int i, final FrameLayout frameLayout) {
        toolbar.post(new Runnable() { // from class: com.google.android.material.badge.BadgeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(Toolbar.this, i);
                if (actionMenuItemView != null) {
                    BadgeUtils.setToolbarOffset(badgeDrawable, Toolbar.this.getResources());
                    BadgeUtils.attachBadgeDrawable(badgeDrawable, actionMenuItemView, frameLayout);
                    BadgeUtils.attachBadgeContentDescription(badgeDrawable, actionMenuItemView);
                }
            }
        });
    }
}
