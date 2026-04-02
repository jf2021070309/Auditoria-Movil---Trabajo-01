package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;
/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ b.d b;
    public final /* synthetic */ MenuItem c;
    public final /* synthetic */ f d;
    public final /* synthetic */ b.c e;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.e = cVar;
        this.b = dVar;
        this.c = hVar;
        this.d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.d dVar = this.b;
        if (dVar != null) {
            b.c cVar = this.e;
            b.this.B = true;
            dVar.b.close(false);
            b.this.B = false;
        }
        MenuItem menuItem = this.c;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.d.performItemAction(menuItem, 4);
        }
    }
}
