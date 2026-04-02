package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AppCompatImageButton.java */
/* loaded from: classes.dex */
public class o extends ImageButton {
    private final d mBackgroundTintHelper;
    private boolean mHasLevel;
    private final p mImageHelper;

    public o(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.a();
        }
        p pVar = this.mImageHelper;
        if (pVar != null) {
            pVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        b1 b1Var;
        p pVar = this.mImageHelper;
        if (pVar == null || (b1Var = pVar.b) == null) {
            return null;
        }
        return b1Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        b1 b1Var;
        p pVar = this.mImageHelper;
        if (pVar == null || (b1Var = pVar.b) == null) {
            return null;
        }
        return b1Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if ((!(this.mImageHelper.a.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        p pVar = this.mImageHelper;
        if (pVar != null) {
            pVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        p pVar = this.mImageHelper;
        if (pVar != null && drawable != null && !this.mHasLevel) {
            pVar.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        p pVar2 = this.mImageHelper;
        if (pVar2 != null) {
            pVar2.a();
            if (!this.mHasLevel) {
                p pVar3 = this.mImageHelper;
                ImageView imageView = pVar3.a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(pVar3.c);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.mImageHelper.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        p pVar = this.mImageHelper;
        if (pVar != null) {
            pVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        p pVar = this.mImageHelper;
        if (pVar != null) {
            if (pVar.b == null) {
                pVar.b = new b1();
            }
            b1 b1Var = pVar.b;
            b1Var.a = colorStateList;
            b1Var.d = true;
            pVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        p pVar = this.mImageHelper;
        if (pVar != null) {
            if (pVar.b == null) {
                pVar.b = new b1();
            }
            b1 b1Var = pVar.b;
            b1Var.b = mode;
            b1Var.c = true;
            pVar.a();
        }
    }

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        this.mHasLevel = false;
        y0.a(getContext(), this);
        d dVar = new d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.d(attributeSet, i);
        p pVar = new p(this);
        this.mImageHelper = pVar;
        pVar.b(attributeSet, i);
    }
}
