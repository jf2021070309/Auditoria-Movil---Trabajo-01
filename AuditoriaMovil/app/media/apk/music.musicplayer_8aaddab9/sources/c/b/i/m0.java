package c.b.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class m0 extends k0 implements l0 {
    public static Method D;
    public l0 E;

    /* loaded from: classes.dex */
    public static class a extends f0 {

        /* renamed from: n  reason: collision with root package name */
        public final int f1209n;
        public final int o;
        public l0 p;
        public MenuItem q;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1209n = 21;
                this.o = 22;
                return;
            }
            this.f1209n = 22;
            this.o = 21;
        }

        @Override // c.b.i.f0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            c.b.h.i.f fVar;
            int pointToPosition;
            int i3;
            if (this.p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    fVar = (c.b.h.i.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                    fVar = (c.b.h.i.f) adapter;
                }
                c.b.h.i.i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < fVar.getCount()) {
                    iVar = fVar.getItem(i3);
                }
                MenuItem menuItem = this.q;
                if (menuItem != iVar) {
                    c.b.h.i.g gVar = fVar.a;
                    if (menuItem != null) {
                        this.p.c(gVar, menuItem);
                    }
                    this.q = iVar;
                    if (iVar != null) {
                        this.p.b(gVar, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.f1209n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i2 != this.o) {
                return super.onKeyDown(i2, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (c.b.h.i.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (c.b.h.i.f) adapter).a.c(false);
                return true;
            }
        }

        public void setHoverListener(l0 l0Var) {
            this.p = l0Var;
        }

        @Override // c.b.i.f0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public m0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, null, i2, i3);
    }

    @Override // c.b.i.l0
    public void b(c.b.h.i.g gVar, MenuItem menuItem) {
        l0 l0Var = this.E;
        if (l0Var != null) {
            l0Var.b(gVar, menuItem);
        }
    }

    @Override // c.b.i.l0
    public void c(c.b.h.i.g gVar, MenuItem menuItem) {
        l0 l0Var = this.E;
        if (l0Var != null) {
            l0Var.c(gVar, menuItem);
        }
    }

    @Override // c.b.i.k0
    public f0 d(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
