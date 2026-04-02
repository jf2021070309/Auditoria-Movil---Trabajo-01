package c.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class o extends MultiAutoCompleteTextView implements c.i.k.y {
    public static final int[] a = {16843126};

    /* renamed from: b  reason: collision with root package name */
    public final e f1211b;

    /* renamed from: c  reason: collision with root package name */
    public final y f1212c;

    public o(Context context, AttributeSet attributeSet) {
        super(x0.a(context), attributeSet, R.attr.autoCompleteTextViewStyle);
        v0.a(this, getContext());
        a1 q = a1.q(getContext(), attributeSet, a, R.attr.autoCompleteTextViewStyle, 0);
        if (q.o(0)) {
            setDropDownBackgroundDrawable(q.g(0));
        }
        q.f1083b.recycle();
        e eVar = new e(this);
        this.f1211b = eVar;
        eVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        y yVar = new y(this);
        this.f1212c = yVar;
        yVar.e(attributeSet, R.attr.autoCompleteTextViewStyle);
        yVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1211b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1212c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // c.i.k.y
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1211b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.i.k.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1211b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        c.b.a.b(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1211b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1211b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(c.b.d.a.a.b(getContext(), i2));
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1211b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1211b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1212c;
        if (yVar != null) {
            yVar.f(context, i2);
        }
    }
}
