package c.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import c.i.k.d0;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class v extends q {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1248d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1249e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1250f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1251g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1252h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1253i;

    public v(SeekBar seekBar) {
        super(seekBar);
        this.f1250f = null;
        this.f1251g = null;
        this.f1252h = false;
        this.f1253i = false;
        this.f1248d = seekBar;
    }

    @Override // c.b.i.q
    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        Context context = this.f1248d.getContext();
        int[] iArr = c.b.b.f776g;
        a1 q = a1.q(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f1248d;
        c.i.k.d0.z(seekBar, seekBar.getContext(), iArr, attributeSet, q.f1083b, i2, 0);
        Drawable h2 = q.h(0);
        if (h2 != null) {
            this.f1248d.setThumb(h2);
        }
        Drawable g2 = q.g(1);
        Drawable drawable = this.f1249e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1249e = g2;
        if (g2 != null) {
            g2.setCallback(this.f1248d);
            SeekBar seekBar2 = this.f1248d;
            AtomicInteger atomicInteger = c.i.k.d0.a;
            c.i.a.d0(g2, d0.d.d(seekBar2));
            if (g2.isStateful()) {
                g2.setState(this.f1248d.getDrawableState());
            }
            c();
        }
        this.f1248d.invalidate();
        if (q.o(3)) {
            this.f1251g = e0.d(q.j(3, -1), this.f1251g);
            this.f1253i = true;
        }
        if (q.o(2)) {
            this.f1250f = q.c(2);
            this.f1252h = true;
        }
        q.f1083b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1249e;
        if (drawable != null) {
            if (this.f1252h || this.f1253i) {
                Drawable q0 = c.i.a.q0(drawable.mutate());
                this.f1249e = q0;
                if (this.f1252h) {
                    c.i.a.j0(q0, this.f1250f);
                }
                if (this.f1253i) {
                    c.i.a.k0(this.f1249e, this.f1251g);
                }
                if (this.f1249e.isStateful()) {
                    this.f1249e.setState(this.f1248d.getDrawableState());
                }
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.f1249e != null) {
            int max = this.f1248d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1249e.getIntrinsicWidth();
                int intrinsicHeight = this.f1249e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1249e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f1248d.getWidth() - this.f1248d.getPaddingLeft()) - this.f1248d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1248d.getPaddingLeft(), this.f1248d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1249e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
