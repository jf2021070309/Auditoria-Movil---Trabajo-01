package com.amazon.aps.iva.v1;

import android.view.ActionMode;
import android.view.View;
/* compiled from: AndroidTextToolbar.android.kt */
/* loaded from: classes.dex */
public final class l2 {
    public static final l2 a = new l2();

    public final void a(ActionMode actionMode) {
        com.amazon.aps.iva.yb0.j.f(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(callback, "actionModeCallback");
        return view.startActionMode(callback, i);
    }
}
