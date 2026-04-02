package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.k0;
import com.amazon.aps.iva.q.p0;
import com.amazon.aps.iva.q.q0;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.p.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener A;
    public boolean B;
    public final Context c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Handler h;
    public View p;
    public View q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean x;
    public j.a y;
    public ViewTreeObserver z;
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final a k = new a();
    public final View$OnAttachStateChangeListenerC0006b l = new View$OnAttachStateChangeListenerC0006b();
    public final c m = new c();
    public int n = 0;
    public int o = 0;
    public boolean w = false;

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            if (bVar.a()) {
                ArrayList arrayList = bVar.j;
                if (arrayList.size() > 0 && !((d) arrayList.get(0)).a.z) {
                    View view = bVar.q;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((d) it.next()).a.show();
                        }
                        return;
                    }
                    bVar.dismiss();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class c implements p0 {
        public c() {
        }

        @Override // com.amazon.aps.iva.q.p0
        public final void d(f fVar, h hVar) {
            b bVar = b.this;
            d dVar = null;
            bVar.h.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.j;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (fVar == ((d) arrayList.get(i)).b) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            if (i2 < arrayList.size()) {
                dVar = (d) arrayList.get(i2);
            }
            bVar.h.postAtTime(new androidx.appcompat.view.menu.c(this, dVar, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // com.amazon.aps.iva.q.p0
        public final void l(f fVar, MenuItem menuItem) {
            b.this.h.removeCallbacksAndMessages(fVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public static class d {
        public final q0 a;
        public final f b;
        public final int c;

        public d(q0 q0Var, f fVar, int i) {
            this.a = q0Var;
            this.b = fVar;
            this.c = i;
        }
    }

    public b(Context context, View view, int i, int i2, boolean z) {
        this.c = context;
        this.p = view;
        this.e = i;
        this.f = i2;
        this.g = z;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        this.r = g0.e.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    @Override // com.amazon.aps.iva.p.f
    public final boolean a() {
        ArrayList arrayList = this.j;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).a.a()) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void b(f fVar) {
        fVar.addMenuPresenter(this, this.c);
        if (a()) {
            l(fVar);
        } else {
            this.i.add(fVar);
        }
    }

    @Override // com.amazon.aps.iva.p.d
    public final void d(View view) {
        if (this.p != view) {
            this.p = view;
            int i = this.n;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            this.o = Gravity.getAbsoluteGravity(i, g0.e.d(view));
        }
    }

    @Override // com.amazon.aps.iva.p.f
    public final void dismiss() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    d dVar = dVarArr[size];
                    if (dVar.a.a()) {
                        dVar.a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.p.d
    public final void e(boolean z) {
        this.w = z;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void f(int i) {
        if (this.n != i) {
            this.n = i;
            View view = this.p;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            this.o = Gravity.getAbsoluteGravity(i, g0.e.d(view));
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean flagActionItems() {
        return false;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void g(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void h(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void i(boolean z) {
        this.x = z;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void j(int i) {
        this.t = true;
        this.v = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(androidx.appcompat.view.menu.f r19) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.l(androidx.appcompat.view.menu.f):void");
    }

    @Override // com.amazon.aps.iva.p.f
    public final k0 m() {
        ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).a.d;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void onCloseMenu(f fVar, boolean z) {
        int i;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (fVar == ((d) arrayList.get(i2)).b) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((d) arrayList.get(i3)).b.close(false);
        }
        d dVar = (d) arrayList.remove(i2);
        dVar.b.removeMenuPresenter(this);
        boolean z2 = this.B;
        q0 q0Var = dVar.a;
        if (z2) {
            q0.a.b(q0Var.A, null);
            q0Var.A.setAnimationStyle(0);
        }
        q0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.r = ((d) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.p;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.e.d(view) == 1) {
                i = 0;
            } else {
                i = 1;
            }
            this.r = i;
        }
        if (size2 == 0) {
            dismiss();
            j.a aVar = this.y;
            if (aVar != null) {
                aVar.onCloseMenu(fVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.z;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.z.removeGlobalOnLayoutListener(this.k);
                }
                this.z = null;
            }
            this.q.removeOnAttachStateChangeListener(this.l);
            this.A.onDismiss();
        } else if (z) {
            ((d) arrayList.get(0)).b.close(false);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                dVar = (d) arrayList.get(i);
                if (!dVar.a.a()) {
                    break;
                }
                i++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.b.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean onSubMenuSelected(m mVar) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.b) {
                dVar.a.d.requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            b(mVar);
            j.a aVar = this.y;
            if (aVar != null) {
                aVar.a(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void setCallback(j.a aVar) {
        this.y = aVar;
    }

    @Override // com.amazon.aps.iva.p.f
    public final void show() {
        boolean z;
        if (a()) {
            return;
        }
        ArrayList arrayList = this.i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l((f) it.next());
        }
        arrayList.clear();
        View view = this.p;
        this.q = view;
        if (view != null) {
            if (this.z == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.k);
            }
            this.q.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void updateMenuView(boolean z) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).a.d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0006b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0006b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.z = view.getViewTreeObserver();
                }
                bVar.z.removeGlobalOnLayoutListener(bVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }
}
