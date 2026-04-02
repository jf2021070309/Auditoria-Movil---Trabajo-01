package com.ellation.crunchyroll.ui;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: KeyboardAwareLayoutListener.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/ui/KeyboardAwareLayoutListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lcom/amazon/aps/iva/kb0/q;", "onGlobalLayout", "onLayoutChange", "Landroid/view/View;", "adjustableView", "Landroid/view/View;", "", "allowViewClipping", "Z", "Lcom/ellation/crunchyroll/ui/KeyboardEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ellation/crunchyroll/ui/KeyboardEventListener;", "", "oldVisibleFrameBottom", "I", "visibleWindowFrameBottom", "softKeyboardEstimatedMinHeight", "<init>", "(Landroid/view/View;ZLcom/ellation/crunchyroll/ui/KeyboardEventListener;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class KeyboardAwareLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int $stable = 8;
    private final View adjustableView;
    private final boolean allowViewClipping;
    private final KeyboardEventListener listener;
    private int oldVisibleFrameBottom;
    private int softKeyboardEstimatedMinHeight;
    private int visibleWindowFrameBottom;

    public KeyboardAwareLayoutListener(View view, boolean z, KeyboardEventListener keyboardEventListener) {
        j.f(view, "adjustableView");
        this.adjustableView = view;
        this.allowViewClipping = z;
        this.listener = keyboardEventListener;
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom;
        this.visibleWindowFrameBottom = i;
        this.softKeyboardEstimatedMinHeight = i / 4;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        onLayoutChange();
    }

    public final void onLayoutChange() {
        ObjectAnimator ofFloat;
        boolean z;
        View view = this.adjustableView;
        j.f(view, "<this>");
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int i = this.oldVisibleFrameBottom - rect.bottom;
        int abs = Math.abs(i);
        int i2 = this.softKeyboardEstimatedMinHeight;
        if (abs > i2) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            int bottom = this.adjustableView.getBottom();
            int i3 = rect.bottom;
            int i4 = bottom - i3;
            if (z && i3 < this.adjustableView.getBottom()) {
                if (!this.allowViewClipping && i4 > this.adjustableView.getY()) {
                    i4 = (int) this.adjustableView.getY();
                }
                ofFloat = ObjectAnimator.ofFloat(this.adjustableView, "translationY", -i4);
                KeyboardEventListener keyboardEventListener = this.listener;
                if (keyboardEventListener != null) {
                    keyboardEventListener.onKeyboardUp();
                }
            } else {
                int abs2 = Math.abs(i);
                ViewGroup.LayoutParams layoutParams = this.adjustableView.getLayoutParams();
                j.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                if (abs2 > ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) {
                    ofFloat = ObjectAnimator.ofFloat(this.adjustableView, "translationY", 0.0f);
                    KeyboardEventListener keyboardEventListener2 = this.listener;
                    if (keyboardEventListener2 != null) {
                        keyboardEventListener2.onKeyboardDown();
                    }
                }
                ofFloat = null;
            }
        } else {
            if (this.visibleWindowFrameBottom - rect.bottom > i2 && i != 0) {
                View view2 = this.adjustableView;
                ofFloat = ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY() + (-i));
            }
            ofFloat = null;
        }
        if (ofFloat != null) {
            ofFloat.start();
        }
        this.oldVisibleFrameBottom = rect.bottom;
    }

    public /* synthetic */ KeyboardAwareLayoutListener(View view, boolean z, KeyboardEventListener keyboardEventListener, int i, e eVar) {
        this(view, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : keyboardEventListener);
    }
}
