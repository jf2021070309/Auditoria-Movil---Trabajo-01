package c.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
/* loaded from: classes.dex */
public class r extends RadioButton implements c.i.l.i, c.i.k.y {
    public final i a;

    /* renamed from: b  reason: collision with root package name */
    public final e f1228b;

    /* renamed from: c  reason: collision with root package name */
    public final y f1229c;

    public r(Context context, AttributeSet attributeSet, int i2) {
        super(x0.a(context), attributeSet, i2);
        v0.a(this, getContext());
        i iVar = new i(this);
        this.a = iVar;
        iVar.b(attributeSet, i2);
        e eVar = new e(this);
        this.f1228b = eVar;
        eVar.d(attributeSet, i2);
        y yVar = new y(this);
        this.f1229c = yVar;
        yVar.e(attributeSet, i2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1228b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1229c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.a;
        return compoundPaddingLeft;
    }

    @Override // c.i.k.y
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1228b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.i.k.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1228b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // c.i.l.i
    public ColorStateList getSupportButtonTintList() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.f1165b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.f1166c;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1228b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1228b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(c.b.d.a.a.b(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.a;
        if (iVar != null) {
            if (iVar.f1169f) {
                iVar.f1169f = false;
                return;
            }
            iVar.f1169f = true;
            iVar.a();
        }
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1228b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1228b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // c.i.l.i
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.f1165b = colorStateList;
            iVar.f1167d = true;
            iVar.a();
        }
    }

    @Override // c.i.l.i
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.f1166c = mode;
            iVar.f1168e = true;
            iVar.a();
        }
    }
}
