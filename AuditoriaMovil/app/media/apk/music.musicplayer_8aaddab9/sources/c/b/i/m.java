package c.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class m {
    public final ImageView a;

    /* renamed from: b  reason: collision with root package name */
    public y0 f1207b;

    /* renamed from: c  reason: collision with root package name */
    public y0 f1208c;

    public m(ImageView imageView) {
        this.a = imageView;
    }

    public void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i2 <= 21 && i2 == 21) {
                if (this.f1208c == null) {
                    this.f1208c = new y0();
                }
                y0 y0Var = this.f1208c;
                PorterDuff.Mode mode = null;
                y0Var.a = null;
                y0Var.f1283d = false;
                y0Var.f1281b = null;
                y0Var.f1282c = false;
                ImageView imageView = this.a;
                ColorStateList imageTintList = i2 >= 21 ? imageView.getImageTintList() : imageView instanceof c.i.l.k ? ((c.i.l.k) imageView).getSupportImageTintList() : null;
                if (imageTintList != null) {
                    y0Var.f1283d = true;
                    y0Var.a = imageTintList;
                }
                ImageView imageView2 = this.a;
                if (i2 >= 21) {
                    mode = imageView2.getImageTintMode();
                } else if (imageView2 instanceof c.i.l.k) {
                    mode = ((c.i.l.k) imageView2).getSupportImageTintMode();
                }
                if (mode != null) {
                    y0Var.f1282c = true;
                    y0Var.f1281b = mode;
                }
                if (y0Var.f1283d || y0Var.f1282c) {
                    j.f(drawable, y0Var, this.a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            y0 y0Var2 = this.f1207b;
            if (y0Var2 != null) {
                j.f(drawable, y0Var2, this.a.getDrawableState());
            }
        }
    }

    public boolean b() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void c(AttributeSet attributeSet, int i2) {
        Drawable drawable;
        Drawable drawable2;
        int l2;
        Context context = this.a.getContext();
        int[] iArr = c.b.b.f775f;
        a1 q = a1.q(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.a;
        c.i.k.d0.z(imageView, imageView.getContext(), iArr, attributeSet, q.f1083b, i2, 0);
        try {
            Drawable drawable3 = this.a.getDrawable();
            if (drawable3 == null && (l2 = q.l(1, -1)) != -1 && (drawable3 = c.b.d.a.a.b(this.a.getContext(), l2)) != null) {
                this.a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                e0.b(drawable3);
            }
            if (q.o(2)) {
                ImageView imageView2 = this.a;
                ColorStateList c2 = q.c(2);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 21) {
                    imageView2.setImageTintList(c2);
                    if (i3 == 21 && (drawable2 = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable2);
                    }
                } else if (imageView2 instanceof c.i.l.k) {
                    ((c.i.l.k) imageView2).setSupportImageTintList(c2);
                }
            }
            if (q.o(3)) {
                ImageView imageView3 = this.a;
                PorterDuff.Mode d2 = e0.d(q.j(3, -1), null);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 21) {
                    imageView3.setImageTintMode(d2);
                    if (i4 == 21 && (drawable = imageView3.getDrawable()) != null && imageView3.getImageTintList() != null) {
                        if (drawable.isStateful()) {
                            drawable.setState(imageView3.getDrawableState());
                        }
                        imageView3.setImageDrawable(drawable);
                    }
                } else if (imageView3 instanceof c.i.l.k) {
                    ((c.i.l.k) imageView3).setSupportImageTintMode(d2);
                }
            }
            q.f1083b.recycle();
        } catch (Throwable th) {
            q.f1083b.recycle();
            throw th;
        }
    }

    public void d(int i2) {
        if (i2 != 0) {
            Drawable b2 = c.b.d.a.a.b(this.a.getContext(), i2);
            if (b2 != null) {
                e0.b(b2);
            }
            this.a.setImageDrawable(b2);
        } else {
            this.a.setImageDrawable(null);
        }
        a();
    }

    public void e(ColorStateList colorStateList) {
        if (this.f1207b == null) {
            this.f1207b = new y0();
        }
        y0 y0Var = this.f1207b;
        y0Var.a = colorStateList;
        y0Var.f1283d = true;
        a();
    }

    public void f(PorterDuff.Mode mode) {
        if (this.f1207b == null) {
            this.f1207b = new y0();
        }
        y0 y0Var = this.f1207b;
        y0Var.f1281b = mode;
        y0Var.f1282c = true;
        a();
    }
}
