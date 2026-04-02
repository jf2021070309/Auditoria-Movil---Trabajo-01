package com.amazon.aps.iva.zq;

import android.annotation.NonNull;
import android.annotation.Nullable;
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
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.gr.l;
import com.amazon.aps.iva.gr.p;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.o0.n3;
import com.amazon.aps.iva.yb0.j;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
/* compiled from: WindowCallbackWrapper.kt */
/* loaded from: classes2.dex */
public final class f implements Window.Callback {
    public final Window.Callback b;
    public final n3 c;
    public final l d;
    public final com.amazon.aps.iva.xb0.l<MotionEvent, MotionEvent> e;
    public final p[] f;
    public final WeakReference<Window> g;

    public f() {
        throw null;
    }

    public f(Window window, Window.Callback callback, n3 n3Var, l lVar, p[] pVarArr) {
        j.f(window, "window");
        j.f(lVar, "interactionPredicate");
        e eVar = e.h;
        j.f(eVar, "copyEvent");
        j.f(pVarArr, "targetAttributesProviders");
        this.b = callback;
        this.c = n3Var;
        this.d = lVar;
        this.e = eVar;
        this.f = pVarArr;
        this.g = new WeakReference<>(window);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window window;
        View currentFocus;
        if (keyEvent == null) {
            l1.z(com.amazon.aps.iva.dq.c.a, "Received KeyEvent=null", null, 6);
        } else {
            int keyCode = keyEvent.getKeyCode();
            l lVar = this.d;
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                lVar.p(keyEvent);
                com.amazon.aps.iva.sq.c.c.d(com.amazon.aps.iva.sq.d.BACK, "back", a0.b);
            } else if (keyEvent.getKeyCode() == 23 && keyEvent.getAction() == 1 && (window = this.g.get()) != null && (currentFocus = window.getCurrentFocus()) != null) {
                LinkedHashMap V = i0.V(new com.amazon.aps.iva.kb0.j("action.target.classname", x.h0(currentFocus)), new com.amazon.aps.iva.kb0.j("action.target.resource_id", x.e0(currentFocus.getId())));
                p[] pVarArr = this.f;
                int length = pVarArr.length;
                int i = 0;
                while (i < length) {
                    p pVar = pVarArr[i];
                    i++;
                    pVar.a(currentFocus, V);
                }
                x.d0(lVar, currentFocus);
                com.amazon.aps.iva.sq.c.c.d(com.amazon.aps.iva.sq.d.CLICK, "", V);
            }
        }
        try {
            return this.b.dispatchKeyEvent(keyEvent);
        } catch (Exception e) {
            l1.z(com.amazon.aps.iva.dq.c.a, "Wrapped callback failed processing KeyEvent", e, 4);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.b.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            MotionEvent invoke = this.e.invoke(motionEvent);
            try {
                try {
                    this.c.d(invoke);
                } finally {
                    invoke.recycle();
                }
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Error processing MotionEvent", e, 4);
            }
        } else {
            l1.z(com.amazon.aps.iva.dq.c.a, "Received MotionEvent=null", null, 6);
        }
        try {
            return this.b.dispatchTouchEvent(motionEvent);
        } catch (Exception e2) {
            l1.z(com.amazon.aps.iva.dq.c.a, "Wrapped callback failed processing MotionEvent", e2, 4);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.b.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        j.f(menu, "p1");
        return this.b.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final View onCreatePanelView(int i) {
        return this.b.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        j.f(menuItem, "item");
        LinkedHashMap V = i0.V(new com.amazon.aps.iva.kb0.j("action.target.classname", menuItem.getClass().getCanonicalName()), new com.amazon.aps.iva.kb0.j("action.target.resource_id", x.e0(menuItem.getItemId())), new com.amazon.aps.iva.kb0.j("action.target.title", menuItem.getTitle()));
        com.amazon.aps.iva.sq.f fVar = com.amazon.aps.iva.sq.c.c;
        com.amazon.aps.iva.sq.d dVar = com.amazon.aps.iva.sq.d.TAP;
        x.d0(this.d, menuItem);
        fVar.d(dVar, "", V);
        try {
            return this.b.onMenuItemSelected(i, menuItem);
        } catch (Exception e) {
            l1.z(com.amazon.aps.iva.dq.c.a, "Wrapped callback failed processing MenuItem selection", e, 4);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, @NonNull Menu menu) {
        j.f(menu, "p1");
        return this.b.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, @NonNull Menu menu) {
        j.f(menu, "p1");
        this.b.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        j.f(menu, "p2");
        return this.b.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.b.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.b.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.b.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.b.onWindowStartingActionMode(callback, i);
    }
}
