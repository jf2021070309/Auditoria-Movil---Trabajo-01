package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.j;
/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {
    public final f b;
    public androidx.appcompat.app.e c;
    public d d;

    public g(f fVar) {
        this.b = fVar;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final boolean a(f fVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        d dVar = this.d;
        if (dVar.g == null) {
            dVar.g = new d.a();
        }
        this.b.performItemAction(dVar.g.getItem(i), 0);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final void onCloseMenu(f fVar, boolean z) {
        androidx.appcompat.app.e eVar;
        if ((z || fVar == this.b) && (eVar = this.c) != null) {
            eVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.d.onCloseMenu(this.b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        f fVar = this.b;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                fVar.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return fVar.performShortcut(i, keyEvent, 0);
    }
}
