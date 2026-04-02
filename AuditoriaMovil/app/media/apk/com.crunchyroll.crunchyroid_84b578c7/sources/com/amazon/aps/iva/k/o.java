package com.amazon.aps.iva.k;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.k.u;
import com.amazon.aps.iva.o.a;
import com.amazon.aps.iva.p3.g;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class o extends com.amazon.aps.iva.e.j implements d {
    private f mDelegate;
    private final g.a mKeyDispatcher;

    public o(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // com.amazon.aps.iva.e.j, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().a(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().n();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return com.amazon.aps.iva.p3.g.b(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().c(i);
    }

    public f getDelegate() {
        if (this.mDelegate == null) {
            u.a aVar = f.b;
            this.mDelegate = new g(getContext(), getWindow(), this, this);
        }
        return this.mDelegate;
    }

    public a getSupportActionBar() {
        return getDelegate().h();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().j();
    }

    @Override // com.amazon.aps.iva.e.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().i();
        super.onCreate(bundle);
        getDelegate().m(bundle);
    }

    @Override // com.amazon.aps.iva.e.j, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().s();
    }

    @Override // com.amazon.aps.iva.k.d
    public com.amazon.aps.iva.o.a onWindowStartingSupportActionMode(a.InterfaceC0549a interfaceC0549a) {
        return null;
    }

    @Override // com.amazon.aps.iva.e.j, android.app.Dialog
    public void setContentView(int i) {
        getDelegate().v(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().A(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().u(i);
    }

    public o(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new g.a() { // from class: com.amazon.aps.iva.k.n
            @Override // com.amazon.aps.iva.p3.g.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return o.this.superDispatchKeyEvent(keyEvent);
            }
        };
        f delegate = getDelegate();
        delegate.z(getThemeResId(context, i));
        delegate.m(null);
    }

    @Override // com.amazon.aps.iva.e.j, android.app.Dialog
    public void setContentView(View view) {
        getDelegate().w(view);
    }

    @Override // com.amazon.aps.iva.e.j, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().x(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().A(getContext().getString(i));
    }

    public o(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new g.a() { // from class: com.amazon.aps.iva.k.n
            @Override // com.amazon.aps.iva.p3.g.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return o.this.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    @Override // com.amazon.aps.iva.k.d
    public void onSupportActionModeFinished(com.amazon.aps.iva.o.a aVar) {
    }

    @Override // com.amazon.aps.iva.k.d
    public void onSupportActionModeStarted(com.amazon.aps.iva.o.a aVar) {
    }
}
