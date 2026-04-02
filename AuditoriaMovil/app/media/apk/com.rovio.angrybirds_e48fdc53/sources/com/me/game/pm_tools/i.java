package com.me.game.pm_tools;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
/* loaded from: classes5.dex */
public abstract class i<V extends View> extends AlertDialog {
    public Context a;
    public V b;
    public LayoutInflater c;
    public boolean d;
    public int e;

    public i(Context context) {
        this(context, 16974376);
    }

    public static void i(i iVar) {
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    public abstract V b();

    public void c() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public Context d() {
        return this.a;
    }

    public int e() {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i > i2) {
            return i2 - (u.f().a(13.0f) * 2);
        }
        return i - (u.f().a(13.0f) * 2);
    }

    public int f() {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        if (i > displayMetrics.heightPixels) {
            return u.f().a(360.0f);
        }
        return i - (u.f().a(13.0f) * 2);
    }

    public void g() {
    }

    public abstract void h(V v);

    public i j(DialogInterface.OnDismissListener onDismissListener) {
        setOnDismissListener(onDismissListener);
        return this;
    }

    public i k(boolean z) {
        setCancelable(z);
        return this;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = this.e;
            if (i == 0) {
                attributes.width = f();
            } else {
                attributes.width = i;
            }
            if (this.d) {
                attributes.height = e();
            }
            attributes.gravity = 17;
            window.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), 0, 0, 0, 0));
            V b = b();
            this.b = b;
            b.setLayoutParams(attributes);
            setContentView(this.b);
            h(this.b);
            g();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        v.g().b(this.a, this);
    }

    public i(Context context, int i) {
        super(context, i);
        this.d = true;
        this.a = context;
        this.c = LayoutInflater.from(context);
        setCancelable(false);
    }
}
