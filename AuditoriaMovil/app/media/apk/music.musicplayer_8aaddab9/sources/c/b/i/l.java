package c.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class l extends ImageButton implements c.i.k.y, c.i.l.k {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final m f1206b;

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public l(Context context, AttributeSet attributeSet, int i2) {
        super(x0.a(context), attributeSet, i2);
        v0.a(this, getContext());
        e eVar = new e(this);
        this.a = eVar;
        eVar.d(attributeSet, i2);
        m mVar = new m(this);
        this.f1206b = mVar;
        mVar.c(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.a;
        if (eVar != null) {
            eVar.a();
        }
        m mVar = this.f1206b;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // c.i.k.y
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.i.k.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // c.i.l.k
    public ColorStateList getSupportImageTintList() {
        y0 y0Var;
        m mVar = this.f1206b;
        if (mVar == null || (y0Var = mVar.f1207b) == null) {
            return null;
        }
        return y0Var.a;
    }

    @Override // c.i.l.k
    public PorterDuff.Mode getSupportImageTintMode() {
        y0 y0Var;
        m mVar = this.f1206b;
        if (mVar == null || (y0Var = mVar.f1207b) == null) {
            return null;
        }
        return y0Var.f1281b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1206b.b() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.a;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m mVar = this.f1206b;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m mVar = this.f1206b;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.f1206b.d(i2);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m mVar = this.f1206b;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // c.i.l.k
    public void setSupportImageTintList(ColorStateList colorStateList) {
        m mVar = this.f1206b;
        if (mVar != null) {
            mVar.e(colorStateList);
        }
    }

    @Override // c.i.l.k
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        m mVar = this.f1206b;
        if (mVar != null) {
            mVar.f(mode);
        }
    }
}
