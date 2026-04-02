package c.b.i;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class p0 {
    public final c.b.h.i.g a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1214b;

    /* renamed from: c  reason: collision with root package name */
    public final c.b.h.i.l f1215c;

    /* renamed from: d  reason: collision with root package name */
    public a f1216d;

    /* loaded from: classes.dex */
    public interface a {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public p0(Context context, View view) {
        this.f1214b = view;
        c.b.h.i.g gVar = new c.b.h.i.g(context);
        this.a = gVar;
        gVar.f1004f = new n0(this);
        c.b.h.i.l lVar = new c.b.h.i.l(context, gVar, view, false, R.attr.popupMenuStyle, 0);
        this.f1215c = lVar;
        lVar.f1040g = 0;
        lVar.f1044k = new o0(this);
    }

    public void a() {
        if (!this.f1215c.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
