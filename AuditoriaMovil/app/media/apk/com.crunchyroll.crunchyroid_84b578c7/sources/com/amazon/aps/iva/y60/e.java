package com.amazon.aps.iva.y60;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WindowCallbackInterceptor.kt */
/* loaded from: classes2.dex */
public final class e implements Window.Callback {
    public final Window.Callback b;
    public com.amazon.aps.iva.p3.e c;

    public e(Window.Callback callback, com.amazon.aps.iva.p3.e eVar) {
        this.b = callback;
        this.c = eVar;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.b;
        if (callback == null || !callback.dispatchGenericMotionEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.b;
        if (callback == null || !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.b;
        if (callback == null || !callback.dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.b;
        if (callback == null || !callback.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.amazon.aps.iva.p3.e eVar = this.c;
        if (eVar != null) {
            eVar.a(motionEvent);
        }
        Window.Callback callback = this.b;
        if (callback == null || !callback.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.b;
        if (callback == null || !callback.dispatchTrackballEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        Window.Callback callback = this.b;
        if (callback != null) {
            callback.onActionModeFinished(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        Window.Callback callback = this.b;
        if (callback != null) {
            callback.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        Window.Callback callback = this.b;
        if (callback != null) {
            callback.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Window.Callback callback = this.b;
        if (callback != null) {
            callback.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        j.f(menu, "menu");
        Window.Callback callback = this.b;
        if (callback == null || !callback.onCreatePanelMenu(i, menu)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        Window.Callback callback = this.b;
        if (callback != null) {
            return callback.onCreatePanelView(i);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        Window.Callback callback = this.b;
        if (callback != null) {
            callback.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        j.f(menuItem, "item");
        Window.Callback callback = this.b;
        if (callback == null || !callback.onMenuItemSelected(i, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        j.f(menu, "menu");
        Window.Callback callback = this.b;
        if (callback == null || !callback.onMenuOpened(i, menu)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        j.f(menu, "menu");
        Window.Callback callback = this.b;
        if (callback != null) {
            callback.onPanelClosed(i, menu);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        j.f(menu, "menu");
        Window.Callback callback = this.b;
        if (callback == null || !callback.onPreparePanel(i, view, menu)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        Window.Callback callback = this.b;
        return callback != null && callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.b;
        if (callback != null) {
            callback.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        Window.Callback callback = this.b;
        if (callback != null) {
            callback.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.b;
        if (callback2 != null) {
            return callback2.onWindowStartingActionMode(callback);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback = this.b;
        return callback != null && callback.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Window.Callback callback2 = this.b;
        if (callback2 != null) {
            return callback2.onWindowStartingActionMode(callback, i);
        }
        return null;
    }
}
