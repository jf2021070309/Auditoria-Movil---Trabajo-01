package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
/* compiled from: MenuPopupWindow.java */
/* loaded from: classes.dex */
public final class q0 extends o0 implements p0 {
    public static final Method E;
    public p0 D;

    /* compiled from: MenuPopupWindow.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    /* loaded from: classes.dex */
    public static class c extends k0 {
        public final int n;
        public final int o;
        public p0 p;
        public androidx.appcompat.view.menu.h q;

        /* compiled from: MenuPopupWindow.java */
        /* loaded from: classes.dex */
        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z) {
            super(context, z);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.n = 21;
                this.o = 22;
                return;
            }
            this.n = 22;
            this.o = 21;
        }

        @Override // com.amazon.aps.iva.q.k0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.e eVar;
            int i;
            androidx.appcompat.view.menu.h hVar;
            int pointToPosition;
            int i2;
            if (this.p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    eVar = (androidx.appcompat.view.menu.e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                    i = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < eVar.getCount()) {
                    hVar = eVar.getItem(i2);
                } else {
                    hVar = null;
                }
                androidx.appcompat.view.menu.h hVar2 = this.q;
                if (hVar2 != hVar) {
                    androidx.appcompat.view.menu.f fVar = eVar.b;
                    if (hVar2 != null) {
                        this.p.l(fVar, hVar2);
                    }
                    this.q = hVar;
                    if (hVar != null) {
                        this.p.d(fVar, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            androidx.appcompat.view.menu.e eVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.o) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    eVar = (androidx.appcompat.view.menu.e) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                }
                eVar.b.close(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        public void setHoverListener(p0 p0Var) {
            this.p = p0Var;
        }

        @Override // com.amazon.aps.iva.q.k0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public q0(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // com.amazon.aps.iva.q.p0
    public final void d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        p0 p0Var = this.D;
        if (p0Var != null) {
            p0Var.d(fVar, hVar);
        }
    }

    @Override // com.amazon.aps.iva.q.p0
    public final void l(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        p0 p0Var = this.D;
        if (p0Var != null) {
            p0Var.l(fVar, menuItem);
        }
    }

    @Override // com.amazon.aps.iva.q.o0
    public final k0 n(Context context, boolean z) {
        c cVar = new c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
