package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.crunchyroll.crunchyroid.R;
import java.util.WeakHashMap;
/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class i {
    public final Context a;
    public final f b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public j.a i;
    public com.amazon.aps.iva.p.d j;
    public PopupWindow.OnDismissListener k;
    public final a l;

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public i(Context context, f fVar, View view, boolean z) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, fVar, z);
    }

    public final com.amazon.aps.iva.p.d a() {
        boolean z;
        com.amazon.aps.iva.p.d lVar;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                lVar = new androidx.appcompat.view.menu.b(this.a, this.f, this.d, this.e, this.c);
            } else {
                Context context2 = this.a;
                f fVar = this.b;
                lVar = new l(this.d, this.e, context2, this.f, fVar, this.c);
            }
            lVar.b(this.b);
            lVar.h(this.l);
            lVar.d(this.f);
            lVar.setCallback(this.i);
            lVar.e(this.h);
            lVar.f(this.g);
            this.j = lVar;
        }
        return this.j;
    }

    public final boolean b() {
        com.amazon.aps.iva.p.d dVar = this.j;
        if (dVar != null && dVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        com.amazon.aps.iva.p.d a2 = a();
        a2.i(z2);
        if (z) {
            int i3 = this.g;
            View view = this.f;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if ((Gravity.getAbsoluteGravity(i3, g0.e.d(view)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            a2.g(i);
            a2.j(i2);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.b = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a2.show();
    }

    public i(int i, int i2, Context context, View view, f fVar, boolean z) {
        this.g = 8388611;
        this.l = new a();
        this.a = context;
        this.b = fVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }
}
