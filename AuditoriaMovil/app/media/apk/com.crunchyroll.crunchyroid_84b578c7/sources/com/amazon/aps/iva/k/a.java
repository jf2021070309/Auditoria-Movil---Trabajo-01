package com.amazon.aps.iva.k;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.amazon.aps.iva.k.g;
/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public abstract boolean i(int i, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z);

    public abstract void m(boolean z);

    public abstract void n(boolean z);

    public abstract void o();

    public abstract void p(int i);

    public abstract void q(boolean z);

    public abstract void r(String str);

    public abstract void s(String str);

    public abstract void t(CharSequence charSequence);

    public com.amazon.aps.iva.o.a u(g.e eVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: com.amazon.aps.iva.k.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0427a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0427a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.j.a.b);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0427a() {
            super(-2, -2);
            this.a = 8388627;
        }

        public C0427a(C0427a c0427a) {
            super((ViewGroup.MarginLayoutParams) c0427a);
            this.a = 0;
            this.a = c0427a.a;
        }

        public C0427a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }

    public void h() {
    }
}
