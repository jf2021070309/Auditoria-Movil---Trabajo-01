package c.b.c;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c.b.h.a;
import c.i.k.j;
/* loaded from: classes.dex */
public class u extends Dialog implements m {
    public n a;

    /* renamed from: b  reason: collision with root package name */
    public final j.a f853b;

    /* loaded from: classes.dex */
    public class a implements j.a {
        public a() {
        }

        @Override // c.i.k.j.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return u.this.b(keyEvent);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968918(0x7f040156, float:1.7546503E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            c.b.c.u$a r2 = new c.b.c.u$a
            r2.<init>()
            r4.f853b = r2
            c.b.c.n r2 = r4.a()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r2.z(r6)
            r5 = 0
            r2.m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.c.u.<init>(android.content.Context, int):void");
    }

    public n a() {
        if (this.a == null) {
            int i2 = n.a;
            this.a = new o(getContext(), getWindow(), this, this);
        }
        return this.a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // c.b.c.m
    public void c(c.b.h.a aVar) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().n();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c.i.k.j.b(this.f853b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // c.b.c.m
    public void e(c.b.h.a aVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) a().f(i2);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().k();
    }

    @Override // c.b.c.m
    public c.b.h.a j(a.InterfaceC0018a interfaceC0018a) {
        return null;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().j();
        super.onCreate(bundle);
        a().m(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().s();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        a().v(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().w(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().x(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        a().A(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().A(charSequence);
    }
}
