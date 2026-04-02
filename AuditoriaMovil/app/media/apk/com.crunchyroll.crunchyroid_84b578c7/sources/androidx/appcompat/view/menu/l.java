package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import com.amazon.aps.iva.q.k0;
import com.amazon.aps.iva.q.q0;
import com.amazon.aps.iva.q.s;
import com.crunchyroll.crunchyroid.R;
/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.p.d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context c;
    public final f d;
    public final e e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final q0 j;
    public PopupWindow.OnDismissListener m;
    public View n;
    public View o;
    public j.a p;
    public ViewTreeObserver q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean v;
    public final a k = new a();
    public final b l = new b();
    public int u = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            if (lVar.a() && !lVar.j.z) {
                View view = lVar.o;
                if (view != null && view.isShown()) {
                    lVar.j.show();
                } else {
                    lVar.dismiss();
                }
            }
        }
    }

    public l(int i, int i2, Context context, View view, f fVar, boolean z) {
        this.c = context;
        this.d = fVar;
        this.f = z;
        this.e = new e(fVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new q0(context, i, i2);
        fVar.addMenuPresenter(this, context);
    }

    @Override // com.amazon.aps.iva.p.f
    public final boolean a() {
        if (!this.r && this.j.a()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void d(View view) {
        this.n = view;
    }

    @Override // com.amazon.aps.iva.p.f
    public final void dismiss() {
        if (a()) {
            this.j.dismiss();
        }
    }

    @Override // com.amazon.aps.iva.p.d
    public final void e(boolean z) {
        this.e.d = z;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void f(int i) {
        this.u = i;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean flagActionItems() {
        return false;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void g(int i) {
        this.j.g = i;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void h(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void i(boolean z) {
        this.v = z;
    }

    @Override // com.amazon.aps.iva.p.d
    public final void j(int i) {
        this.j.h(i);
    }

    @Override // com.amazon.aps.iva.p.f
    public final k0 m() {
        return this.j.d;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void onCloseMenu(f fVar, boolean z) {
        if (fVar != this.d) {
            return;
        }
        dismiss();
        j.a aVar = this.p;
        if (aVar != null) {
            aVar.onCloseMenu(fVar, z);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.r = true;
        this.d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.m r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            android.content.Context r5 = r9.c
            android.view.View r6 = r9.o
            boolean r8 = r9.f
            int r3 = r9.h
            int r4 = r9.i
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.j$a r2 = r9.p
            r0.i = r2
            com.amazon.aps.iva.p.d r3 = r0.j
            if (r3 == 0) goto L23
            r3.setCallback(r2)
        L23:
            boolean r2 = com.amazon.aps.iva.p.d.k(r10)
            r0.h = r2
            com.amazon.aps.iva.p.d r3 = r0.j
            if (r3 == 0) goto L30
            r3.e(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.m
            r0.k = r2
            r2 = 0
            r9.m = r2
            androidx.appcompat.view.menu.f r2 = r9.d
            r2.close(r1)
            com.amazon.aps.iva.q.q0 r2 = r9.j
            int r3 = r2.g
            int r2 = r2.j()
            int r4 = r9.u
            android.view.View r5 = r9.n
            java.util.WeakHashMap<android.view.View, com.amazon.aps.iva.p3.r0> r6 = com.amazon.aps.iva.p3.g0.a
            int r5 = com.amazon.aps.iva.p3.g0.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f
            if (r4 != 0) goto L6c
            r0 = r1
            goto L70
        L6c:
            r0.d(r3, r2, r5, r5)
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.j$a r0 = r9.p
            if (r0 == 0) goto L79
            r0.a(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.onSubMenuSelected(androidx.appcompat.view.menu.m):boolean");
    }

    @Override // androidx.appcompat.view.menu.j
    public final void setCallback(j.a aVar) {
        this.p = aVar;
    }

    @Override // com.amazon.aps.iva.p.f
    public final void show() {
        View view;
        boolean z;
        Rect rect;
        boolean z2 = true;
        if (!a()) {
            if (!this.r && (view = this.n) != null) {
                this.o = view;
                q0 q0Var = this.j;
                q0Var.A.setOnDismissListener(this);
                q0Var.q = this;
                q0Var.z = true;
                s sVar = q0Var.A;
                sVar.setFocusable(true);
                View view2 = this.o;
                if (this.q == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.q = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.k);
                }
                view2.addOnAttachStateChangeListener(this.l);
                q0Var.p = view2;
                q0Var.m = this.u;
                boolean z3 = this.s;
                Context context = this.c;
                e eVar = this.e;
                if (!z3) {
                    this.t = com.amazon.aps.iva.p.d.c(eVar, context, this.g);
                    this.s = true;
                }
                q0Var.o(this.t);
                sVar.setInputMethodMode(2);
                Rect rect2 = this.b;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                q0Var.y = rect;
                q0Var.show();
                k0 k0Var = q0Var.d;
                k0Var.setOnKeyListener(this);
                if (this.v) {
                    f fVar = this.d;
                    if (fVar.getHeaderTitle() != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) k0Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(fVar.getHeaderTitle());
                        }
                        frameLayout.setEnabled(false);
                        k0Var.addHeaderView(frameLayout, null, false);
                    }
                }
                q0Var.k(eVar);
                q0Var.show();
            } else {
                z2 = false;
            }
        }
        if (z2) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.j
    public final void updateMenuView(boolean z) {
        this.s = false;
        e eVar = this.e;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.q = view.getViewTreeObserver();
                }
                lVar.q.removeGlobalOnLayoutListener(lVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // com.amazon.aps.iva.p.d
    public final void b(f fVar) {
    }

    @Override // androidx.appcompat.view.menu.j
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }
}
