package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazon.aps.iva.k.o;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q3.l;
import com.google.android.material.R;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.sidesheet.SheetCallback;
import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class SheetDialog<C extends SheetCallback> extends o {
    private static final int COORDINATOR_LAYOUT_ID = R.id.coordinator;
    private static final int TOUCH_OUTSIDE_ID = R.id.touch_outside;
    private MaterialBackOrchestrator backOrchestrator;
    private Sheet<C> behavior;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    boolean dismissWithAnimation;
    private FrameLayout sheet;

    public SheetDialog(Context context, int i, int i2, int i3) {
        super(context, getThemeResId(context, i, i2, i3));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        supportRequestWindowFeature(1);
    }

    private void ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), getLayoutResId(), null);
            this.container = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(getDialogId());
            this.sheet = frameLayout2;
            Sheet<C> behaviorFromSheet = getBehaviorFromSheet(frameLayout2);
            this.behavior = behaviorFromSheet;
            addSheetCancelOnHideCallback(behaviorFromSheet);
            this.backOrchestrator = new MaterialBackOrchestrator(this.behavior, this.sheet);
        }
    }

    private FrameLayout getContainer() {
        if (this.container == null) {
            ensureContainerAndBehavior();
        }
        return this.container;
    }

    private FrameLayout getSheet() {
        if (this.sheet == null) {
            ensureContainerAndBehavior();
        }
        return this.sheet;
    }

    private static int getThemeResId(Context context, int i, int i2, int i3) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
                return typedValue.resourceId;
            }
            return i3;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wrapInSheet$0(View view) {
        if (this.cancelable && isShowing() && shouldWindowCloseOnTouchOutside()) {
            cancel();
        }
    }

    private void maybeUpdateWindowAnimationsBasedOnLayoutDirection() {
        FrameLayout frameLayout;
        int i;
        Window window = getWindow();
        if (window != null && (frameLayout = this.sheet) != null && (frameLayout.getLayoutParams() instanceof CoordinatorLayout.f)) {
            int i2 = ((CoordinatorLayout.f) this.sheet.getLayoutParams()).c;
            FrameLayout frameLayout2 = this.sheet;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (Gravity.getAbsoluteGravity(i2, g0.e.d(frameLayout2)) == 3) {
                i = R.style.Animation_Material3_SideSheetDialog_Left;
            } else {
                i = R.style.Animation_Material3_SideSheetDialog_Right;
            }
            window.setWindowAnimations(i);
        }
    }

    private boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    private void updateListeningForBackCallbacks() {
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.cancelable) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private View wrapInSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getContainer().findViewById(COORDINATOR_LAYOUT_ID);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout sheet = getSheet();
        sheet.removeAllViews();
        if (layoutParams == null) {
            sheet.addView(view);
        } else {
            sheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(TOUCH_OUTSIDE_ID).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SheetDialog.this.lambda$wrapInSheet$0(view2);
            }
        });
        g0.n(getSheet(), new com.amazon.aps.iva.p3.a() { // from class: com.google.android.material.sidesheet.SheetDialog.1
            @Override // com.amazon.aps.iva.p3.a
            public void onInitializeAccessibilityNodeInfo(View view2, l lVar) {
                super.onInitializeAccessibilityNodeInfo(view2, lVar);
                if (SheetDialog.this.cancelable) {
                    lVar.a(1048576);
                    lVar.a.setDismissable(true);
                    return;
                }
                lVar.a.setDismissable(false);
            }

            @Override // com.amazon.aps.iva.p3.a
            public boolean performAccessibilityAction(View view2, int i2, Bundle bundle) {
                if (i2 == 1048576) {
                    SheetDialog sheetDialog = SheetDialog.this;
                    if (sheetDialog.cancelable) {
                        sheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view2, i2, bundle);
            }
        });
        return this.container;
    }

    public abstract void addSheetCancelOnHideCallback(Sheet<C> sheet);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Sheet<C> behavior = getBehavior();
        if (this.dismissWithAnimation && behavior.getState() != 5) {
            behavior.setState(5);
        } else {
            super.cancel();
        }
    }

    public Sheet<C> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public abstract Sheet<C> getBehaviorFromSheet(FrameLayout frameLayout);

    public abstract int getDialogId();

    public abstract int getLayoutResId();

    public abstract int getStateOnStart();

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.dismissWithAnimation;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        updateListeningForBackCallbacks();
    }

    @Override // com.amazon.aps.iva.k.o, com.amazon.aps.iva.e.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // com.amazon.aps.iva.e.j, android.app.Dialog
    public void onStart() {
        super.onStart();
        Sheet<C> sheet = this.behavior;
        if (sheet != null && sheet.getState() == 5) {
            this.behavior.setState(getStateOnStart());
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
        }
        if (getWindow() != null) {
            updateListeningForBackCallbacks();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // com.amazon.aps.iva.k.o, com.amazon.aps.iva.e.j, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(wrapInSheet(i, null, null));
    }

    public void setDismissWithSheetAnimationEnabled(boolean z) {
        this.dismissWithAnimation = z;
    }

    public void setSheetEdge(int i) {
        FrameLayout frameLayout = this.sheet;
        if (frameLayout != null) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (!g0.g.c(frameLayout)) {
                ViewGroup.LayoutParams layoutParams = this.sheet.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    ((CoordinatorLayout.f) layoutParams).c = i;
                    maybeUpdateWindowAnimationsBasedOnLayoutDirection();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
        throw new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
    }

    @Override // com.amazon.aps.iva.k.o, com.amazon.aps.iva.e.j, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInSheet(0, view, null));
    }

    @Override // com.amazon.aps.iva.k.o, com.amazon.aps.iva.e.j, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInSheet(0, view, layoutParams));
    }
}
