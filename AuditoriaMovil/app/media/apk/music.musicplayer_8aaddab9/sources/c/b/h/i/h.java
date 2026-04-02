package c.b.h.i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import c.b.h.i.e;
import c.b.h.i.m;
/* loaded from: classes.dex */
public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {
    public g a;

    /* renamed from: b  reason: collision with root package name */
    public c.b.c.i f1013b;

    /* renamed from: c  reason: collision with root package name */
    public e f1014c;

    public h(g gVar) {
        this.a = gVar;
    }

    @Override // c.b.h.i.m.a
    public void b(g gVar, boolean z) {
        c.b.c.i iVar;
        if ((z || gVar == this.a) && (iVar = this.f1013b) != null) {
            iVar.dismiss();
        }
    }

    @Override // c.b.h.i.m.a
    public boolean c(g gVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.a.r(((e.a) this.f1014c.a()).getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        e eVar = this.f1014c;
        g gVar = this.a;
        m.a aVar = eVar.f992e;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1013b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1013b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.a.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.a.performShortcut(i2, keyEvent, 0);
    }
}
