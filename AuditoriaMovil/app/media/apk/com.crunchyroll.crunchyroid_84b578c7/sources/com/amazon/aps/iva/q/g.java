package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* compiled from: AppCompatCheckedTextView.java */
/* loaded from: classes.dex */
public final class g extends CheckedTextView {
    public final h b;
    public final d c;
    public final d0 d;
    public m e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:3:0x0047, B:5:0x004e, B:7:0x0054, B:11:0x0063, B:13:0x0069, B:15:0x006f, B:16:0x007a, B:18:0x0081, B:19:0x0088, B:21:0x008f), top: B:28:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:3:0x0047, B:5:0x004e, B:7:0x0054, B:11:0x0063, B:13:0x0069, B:15:0x006f, B:16:0x007a, B:18:0x0081, B:19:0x0088, B:21:0x008f), top: B:28:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            com.amazon.aps.iva.q.a1.a(r8)
            r0 = 2130968871(0x7f040127, float:1.7546408E38)
            r7.<init>(r8, r9, r0)
            android.content.Context r8 = r7.getContext()
            com.amazon.aps.iva.q.y0.a(r8, r7)
            com.amazon.aps.iva.q.d0 r8 = new com.amazon.aps.iva.q.d0
            r8.<init>(r7)
            r7.d = r8
            r8.f(r9, r0)
            r8.b()
            com.amazon.aps.iva.q.d r8 = new com.amazon.aps.iva.q.d
            r8.<init>(r7)
            r7.c = r8
            r8.d(r9, r0)
            com.amazon.aps.iva.q.h r8 = new com.amazon.aps.iva.q.h
            r8.<init>(r7)
            r7.b = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = com.amazon.aps.iva.j.a.l
            com.amazon.aps.iva.q.d1 r8 = com.amazon.aps.iva.q.d1.m(r8, r9, r3, r0)
            android.content.Context r2 = r7.getContext()
            android.content.res.TypedArray r5 = r8.b
            r6 = 2130968871(0x7f040127, float:1.7546408E38)
            r1 = r7
            r4 = r9
            com.amazon.aps.iva.p3.g0.m(r1, r2, r3, r4, r5, r6)
            r1 = 1
            boolean r2 = r8.l(r1)     // Catch: java.lang.Throwable -> La7
            r3 = 0
            if (r2 == 0) goto L60
            int r2 = r8.i(r1, r3)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L60
            android.content.Context r4 = r7.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            android.graphics.drawable.Drawable r2 = com.amazon.aps.iva.l.a.a(r4, r2)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            r7.setCheckMarkDrawable(r2)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            goto L61
        L60:
            r1 = r3
        L61:
            if (r1 != 0) goto L7a
            boolean r1 = r8.l(r3)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L7a
            int r1 = r8.i(r3, r3)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L7a
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> La7
            android.graphics.drawable.Drawable r1 = com.amazon.aps.iva.l.a.a(r2, r1)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkDrawable(r1)     // Catch: java.lang.Throwable -> La7
        L7a:
            r1 = 2
            boolean r2 = r8.l(r1)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L88
            android.content.res.ColorStateList r1 = r8.b(r1)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkTintList(r1)     // Catch: java.lang.Throwable -> La7
        L88:
            r1 = 3
            boolean r2 = r8.l(r1)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L9c
            r2 = -1
            int r1 = r8.h(r1, r2)     // Catch: java.lang.Throwable -> La7
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = com.amazon.aps.iva.q.j0.c(r1, r2)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkTintMode(r1)     // Catch: java.lang.Throwable -> La7
        L9c:
            r8.n()
            com.amazon.aps.iva.q.m r8 = r7.getEmojiTextViewHelper()
            r8.c(r9, r0)
            return
        La7:
            r9 = move-exception
            r8.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q.g.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private m getEmojiTextViewHelper() {
        if (this.e == null) {
            this.e = new m(this);
        }
        return this.e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.d;
        if (d0Var != null) {
            d0Var.b();
        }
        d dVar = this.c;
        if (dVar != null) {
            dVar.a();
        }
        h hVar = this.b;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.amazon.aps.iva.t3.k.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.c;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.d.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.amazon.aps.iva.ff0.b.A(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.c;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.c;
        if (dVar != null) {
            dVar.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h hVar = this.b;
        if (hVar != null) {
            if (hVar.f) {
                hVar.f = false;
                return;
            }
            hVar.f = true;
            hVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.d;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.d;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.amazon.aps.iva.t3.k.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.c;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.c;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.b = colorStateList;
            hVar.d = true;
            hVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.c = mode;
            hVar.e = true;
            hVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        d0 d0Var = this.d;
        d0Var.k(colorStateList);
        d0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        d0 d0Var = this.d;
        d0Var.l(mode);
        d0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.d;
        if (d0Var != null) {
            d0Var.g(i, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(com.amazon.aps.iva.l.a.a(getContext(), i));
    }
}
