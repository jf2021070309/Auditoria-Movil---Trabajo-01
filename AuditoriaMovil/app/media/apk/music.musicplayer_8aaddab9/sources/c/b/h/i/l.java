package c.b.h.i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import c.b.h.i.m;
import c.i.k.d0;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class l {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final g f1035b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1036c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1037d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1038e;

    /* renamed from: f  reason: collision with root package name */
    public View f1039f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1041h;

    /* renamed from: i  reason: collision with root package name */
    public m.a f1042i;

    /* renamed from: j  reason: collision with root package name */
    public k f1043j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1044k;

    /* renamed from: g  reason: collision with root package name */
    public int f1040g = 8388611;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f1045l = new a();

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.c();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.a = context;
        this.f1035b = gVar;
        this.f1039f = view;
        this.f1036c = z;
        this.f1037d = i2;
        this.f1038e = i3;
    }

    public k a() {
        if (this.f1043j == null) {
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            k dVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new d(this.a, this.f1039f, this.f1037d, this.f1038e, this.f1036c) : new q(this.a, this.f1035b, this.f1039f, this.f1037d, this.f1038e, this.f1036c);
            dVar.k(this.f1035b);
            dVar.q(this.f1045l);
            dVar.m(this.f1039f);
            dVar.g(this.f1042i);
            dVar.n(this.f1041h);
            dVar.o(this.f1040g);
            this.f1043j = dVar;
        }
        return this.f1043j;
    }

    public boolean b() {
        k kVar = this.f1043j;
        return kVar != null && kVar.a();
    }

    public void c() {
        this.f1043j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1044k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(m.a aVar) {
        this.f1042i = aVar;
        k kVar = this.f1043j;
        if (kVar != null) {
            kVar.g(aVar);
        }
    }

    public final void e(int i2, int i3, boolean z, boolean z2) {
        k a2 = a();
        a2.r(z2);
        if (z) {
            int i4 = this.f1040g;
            View view = this.f1039f;
            AtomicInteger atomicInteger = d0.a;
            if ((Gravity.getAbsoluteGravity(i4, d0.d.d(view)) & 7) == 5) {
                i2 -= this.f1039f.getWidth();
            }
            a2.p(i2);
            a2.s(i3);
            int i5 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.a = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.show();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f1039f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
