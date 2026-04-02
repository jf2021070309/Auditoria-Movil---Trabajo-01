package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class BrowseFrameLayout extends FrameLayout {
    public View.OnKeyListener b;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        View.OnKeyListener onKeyListener = this.b;
        if (onKeyListener != null && !dispatchKeyEvent) {
            return onKeyListener.onKey(getRootView(), keyEvent.getKeyCode(), keyEvent);
        }
        return dispatchKeyEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        return super.focusSearch(view, i);
    }

    public a getOnChildFocusListener() {
        return null;
    }

    public b getOnFocusSearchListener() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
    }

    public void setOnDispatchKeyListener(View.OnKeyListener onKeyListener) {
        this.b = onKeyListener;
    }

    public void setOnChildFocusListener(a aVar) {
    }

    public void setOnFocusSearchListener(b bVar) {
    }
}
