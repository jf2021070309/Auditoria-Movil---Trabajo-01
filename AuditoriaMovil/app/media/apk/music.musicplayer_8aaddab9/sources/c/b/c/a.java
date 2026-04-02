package c.b.c;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import c.b.h.a;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c.b.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0014a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0014a(int i2, int i3) {
            super(i2, i3);
            this.a = 0;
            this.a = 8388627;
        }

        public C0014a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.b.f771b);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0014a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public C0014a(C0014a c0014a) {
            super((ViewGroup.MarginLayoutParams) c0014a);
            this.a = 0;
            this.a = c0014a.a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z);

    public abstract int d();

    public abstract Context e();

    public abstract void f();

    public boolean g() {
        return false;
    }

    public abstract void h(Configuration configuration);

    public void i() {
    }

    public abstract boolean j(int i2, KeyEvent keyEvent);

    public boolean k(KeyEvent keyEvent) {
        return false;
    }

    public boolean l() {
        return false;
    }

    public abstract void m(Drawable drawable);

    public abstract void n(boolean z);

    public abstract void o(boolean z);

    public abstract void p(boolean z);

    public abstract void q(CharSequence charSequence);

    public abstract void r(CharSequence charSequence);

    public c.b.h.a s(a.InterfaceC0018a interfaceC0018a) {
        return null;
    }
}
