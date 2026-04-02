package c.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* loaded from: classes.dex */
public class b0 extends ToggleButton implements c.i.k.y {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final y f1085b;

    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        v0.a(this, getContext());
        e eVar = new e(this);
        this.a = eVar;
        eVar.d(attributeSet, 16842827);
        y yVar = new y(this);
        this.f1085b = yVar;
        yVar.e(attributeSet, 16842827);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.a;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1085b;
        if (yVar != null) {
            yVar.b();
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

    @Override // android.widget.ToggleButton, android.view.View
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
}
