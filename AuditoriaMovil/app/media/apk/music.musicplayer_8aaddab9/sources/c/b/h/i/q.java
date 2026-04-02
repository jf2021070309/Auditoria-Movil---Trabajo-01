package c.b.h.i;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import c.b.h.i.m;
import c.b.i.m0;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    /* renamed from: b  reason: collision with root package name */
    public final Context f1047b;

    /* renamed from: c  reason: collision with root package name */
    public final g f1048c;

    /* renamed from: d  reason: collision with root package name */
    public final f f1049d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1050e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1051f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1052g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1053h;

    /* renamed from: i  reason: collision with root package name */
    public final m0 f1054i;

    /* renamed from: l  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1057l;

    /* renamed from: m  reason: collision with root package name */
    public View f1058m;

    /* renamed from: n  reason: collision with root package name */
    public View f1059n;
    public m.a o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean u;

    /* renamed from: j  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1055j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f1056k = new b();
    public int t = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (q.this.a()) {
                q qVar = q.this;
                if (qVar.f1054i.B) {
                    return;
                }
                View view = qVar.f1059n;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.f1054i.show();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.p = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.p.removeGlobalOnLayoutListener(qVar.f1055j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.f1047b = context;
        this.f1048c = gVar;
        this.f1050e = z;
        this.f1049d = new f(gVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f1052g = i2;
        this.f1053h = i3;
        Resources resources = context.getResources();
        this.f1051f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1058m = view;
        this.f1054i = new m0(context, null, i2, i3);
        gVar.b(this, context);
    }

    @Override // c.b.h.i.p
    public boolean a() {
        return !this.q && this.f1054i.a();
    }

    @Override // c.b.h.i.m
    public void b(g gVar, boolean z) {
        if (gVar != this.f1048c) {
            return;
        }
        dismiss();
        m.a aVar = this.o;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // c.b.h.i.m
    public void c(boolean z) {
        this.r = false;
        f fVar = this.f1049d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // c.b.h.i.m
    public boolean d() {
        return false;
    }

    @Override // c.b.h.i.p
    public void dismiss() {
        if (a()) {
            this.f1054i.dismiss();
        }
    }

    @Override // c.b.h.i.m
    public void g(m.a aVar) {
        this.o = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // c.b.h.i.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(c.b.h.i.r r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L78
            c.b.h.i.l r0 = new c.b.h.i.l
            android.content.Context r3 = r9.f1047b
            android.view.View r5 = r9.f1059n
            boolean r6 = r9.f1050e
            int r7 = r9.f1052g
            int r8 = r9.f1053h
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            c.b.h.i.m$a r2 = r9.o
            r0.d(r2)
            boolean r2 = c.b.h.i.k.t(r10)
            r0.f1041h = r2
            c.b.h.i.k r3 = r0.f1043j
            if (r3 == 0) goto L2a
            r3.n(r2)
        L2a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f1057l
            r0.f1044k = r2
            r2 = 0
            r9.f1057l = r2
            c.b.h.i.g r2 = r9.f1048c
            r2.c(r1)
            c.b.i.m0 r2 = r9.f1054i
            int r3 = r2.f1200i
            boolean r4 = r2.f1203l
            if (r4 != 0) goto L40
            r2 = 0
            goto L42
        L40:
            int r2 = r2.f1201j
        L42:
            int r4 = r9.t
            android.view.View r5 = r9.f1058m
            java.util.concurrent.atomic.AtomicInteger r6 = c.i.k.d0.a
            int r5 = c.i.k.d0.d.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5c
            android.view.View r4 = r9.f1058m
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L64
            goto L6d
        L64:
            android.view.View r4 = r0.f1039f
            if (r4 != 0) goto L6a
            r0 = 0
            goto L6e
        L6a:
            r0.e(r3, r2, r5, r5)
        L6d:
            r0 = 1
        L6e:
            if (r0 == 0) goto L78
            c.b.h.i.m$a r0 = r9.o
            if (r0 == 0) goto L77
            r0.c(r10)
        L77:
            return r5
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.h.i.q.i(c.b.h.i.r):boolean");
    }

    @Override // c.b.h.i.p
    public ListView j() {
        return this.f1054i.f1197f;
    }

    @Override // c.b.h.i.k
    public void k(g gVar) {
    }

    @Override // c.b.h.i.k
    public void m(View view) {
        this.f1058m = view;
    }

    @Override // c.b.h.i.k
    public void n(boolean z) {
        this.f1049d.f996c = z;
    }

    @Override // c.b.h.i.k
    public void o(int i2) {
        this.t = i2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.q = true;
        this.f1048c.c(true);
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.f1059n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.f1055j);
            this.p = null;
        }
        this.f1059n.removeOnAttachStateChangeListener(this.f1056k);
        PopupWindow.OnDismissListener onDismissListener = this.f1057l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i2 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // c.b.h.i.k
    public void p(int i2) {
        this.f1054i.f1200i = i2;
    }

    @Override // c.b.h.i.k
    public void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f1057l = onDismissListener;
    }

    @Override // c.b.h.i.k
    public void r(boolean z) {
        this.u = z;
    }

    @Override // c.b.h.i.k
    public void s(int i2) {
        m0 m0Var = this.f1054i;
        m0Var.f1201j = i2;
        m0Var.f1203l = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    @Override // c.b.h.i.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void show() {
        /*
            r7 = this;
            boolean r0 = r7.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lb
        L8:
            r1 = 1
            goto Lc7
        Lb:
            boolean r0 = r7.q
            if (r0 != 0) goto Lc7
            android.view.View r0 = r7.f1058m
            if (r0 != 0) goto L15
            goto Lc7
        L15:
            r7.f1059n = r0
            c.b.i.m0 r0 = r7.f1054i
            android.widget.PopupWindow r0 = r0.C
            r0.setOnDismissListener(r7)
            c.b.i.m0 r0 = r7.f1054i
            r0.t = r7
            r0.r(r2)
            android.view.View r0 = r7.f1059n
            android.view.ViewTreeObserver r3 = r7.p
            if (r3 != 0) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.p = r4
            if (r3 == 0) goto L3b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.f1055j
            r4.addOnGlobalLayoutListener(r3)
        L3b:
            android.view.View$OnAttachStateChangeListener r3 = r7.f1056k
            r0.addOnAttachStateChangeListener(r3)
            c.b.i.m0 r3 = r7.f1054i
            r3.s = r0
            int r0 = r7.t
            r3.o = r0
            boolean r0 = r7.r
            r3 = 0
            if (r0 != 0) goto L5b
            c.b.h.i.f r0 = r7.f1049d
            android.content.Context r4 = r7.f1047b
            int r5 = r7.f1051f
            int r0 = c.b.h.i.k.l(r0, r3, r4, r5)
            r7.s = r0
            r7.r = r2
        L5b:
            c.b.i.m0 r0 = r7.f1054i
            int r4 = r7.s
            r0.q(r4)
            c.b.i.m0 r0 = r7.f1054i
            r4 = 2
            android.widget.PopupWindow r0 = r0.C
            r0.setInputMethodMode(r4)
            c.b.i.m0 r0 = r7.f1054i
            android.graphics.Rect r4 = r7.a
            java.util.Objects.requireNonNull(r0)
            if (r4 == 0) goto L79
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L7a
        L79:
            r5 = r3
        L7a:
            r0.A = r5
            c.b.i.m0 r0 = r7.f1054i
            r0.show()
            c.b.i.m0 r0 = r7.f1054i
            c.b.i.f0 r0 = r0.f1197f
            r0.setOnKeyListener(r7)
            boolean r4 = r7.u
            if (r4 == 0) goto Lb9
            c.b.h.i.g r4 = r7.f1048c
            java.lang.CharSequence r4 = r4.f1012n
            if (r4 == 0) goto Lb9
            android.content.Context r4 = r7.f1047b
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131492882(0x7f0c0012, float:1.8609228E38)
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto Lb3
            c.b.h.i.g r6 = r7.f1048c
            java.lang.CharSequence r6 = r6.f1012n
            r5.setText(r6)
        Lb3:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        Lb9:
            c.b.i.m0 r0 = r7.f1054i
            c.b.h.i.f r1 = r7.f1049d
            r0.p(r1)
            c.b.i.m0 r0 = r7.f1054i
            r0.show()
            goto L8
        Lc7:
            if (r1 == 0) goto Lca
            return
        Lca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            goto Ld3
        Ld2:
            throw r0
        Ld3:
            goto Ld2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.h.i.q.show():void");
    }
}
