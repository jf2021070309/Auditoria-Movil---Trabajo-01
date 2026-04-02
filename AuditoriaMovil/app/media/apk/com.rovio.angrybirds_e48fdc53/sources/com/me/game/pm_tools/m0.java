package com.me.game.pm_tools;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* loaded from: classes5.dex */
public class m0 extends r0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public m0(Context context) {
        super(context);
    }

    public void a(int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    public void b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void c(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public void d(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public int getCompoundHeight() {
        return 0;
    }

    public int getCompoundWidth() {
        return 0;
    }

    public void setCompoundDrawableBottom(Drawable drawable) {
    }

    public void setCompoundDrawableLeft(Drawable drawable) {
    }

    public void setCompoundDrawableRight(Drawable drawable) {
    }

    public void setCompoundDrawableTop(Drawable drawable) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.a;
        if (i5 > 0 && (i4 = this.b) > 0 && drawable != null) {
            drawable.setBounds(0, 0, i5, i4);
        }
        int i6 = this.c;
        if (i6 > 0 && (i3 = this.d) > 0 && drawable2 != null) {
            drawable2.setBounds(0, 0, i6, i3);
        }
        int i7 = this.e;
        if (i7 > 0 && (i2 = this.f) > 0 && drawable != null) {
            drawable3.setBounds(0, 0, i7, i2);
        }
        int i8 = this.g;
        if (i8 > 0 && (i = this.h) > 0 && drawable4 != null) {
            drawable4.setBounds(0, 0, i8, i);
        }
        if (getCompoundWidth() > 0 && getCompoundHeight() > 0) {
            int a = u.f().a(getCompoundWidth());
            int a2 = u.f().a(getCompoundHeight());
            if (drawable != null) {
                drawable.setBounds(0, 0, a, a2);
            } else if (drawable2 != null) {
                drawable2.setBounds(0, 0, a, a2);
            }
        }
        setCompoundDrawableLeft(drawable);
        setCompoundDrawableTop(drawable2);
        setCompoundDrawableRight(drawable3);
        setCompoundDrawableBottom(drawable4);
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.a;
        if (i5 > 0 && (i4 = this.b) > 0 && drawable != null) {
            drawable.setBounds(0, 0, i5, i4);
        }
        int i6 = this.c;
        if (i6 > 0 && (i3 = this.d) > 0 && drawable2 != null) {
            drawable2.setBounds(0, 0, i6, i3);
        }
        int i7 = this.e;
        if (i7 > 0 && (i2 = this.f) > 0 && drawable3 != null) {
            drawable3.setBounds(0, 0, i7, i2);
        }
        int i8 = this.g;
        if (i8 > 0 && (i = this.h) > 0 && drawable4 != null) {
            drawable4.setBounds(0, 0, i8, i);
        }
        if (getCompoundWidth() > 0 && getCompoundHeight() > 0) {
            int a = u.f().a(getCompoundWidth());
            int a2 = u.f().a(getCompoundHeight());
            if (drawable != null) {
                drawable.setBounds(0, 0, a, a2);
            } else if (drawable2 != null) {
                drawable2.setBounds(0, 0, a, a2);
            }
        }
        setCompoundDrawableLeft(drawable);
        setCompoundDrawableTop(drawable2);
        setCompoundDrawableRight(drawable3);
        setCompoundDrawableBottom(drawable4);
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }
}
