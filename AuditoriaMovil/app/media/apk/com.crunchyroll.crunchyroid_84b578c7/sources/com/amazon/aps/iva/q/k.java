package com.amazon.aps.iva.q;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.amazon.aps.iva.p3.c;
import com.amazon.aps.iva.q.b0;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AppCompatEditText.java */
/* loaded from: classes.dex */
public class k extends EditText implements com.amazon.aps.iva.p3.w {
    private final l mAppCompatEmojiEditTextHelper;
    private final d mBackgroundTintHelper;
    private final com.amazon.aps.iva.t3.l mDefaultOnReceiveContentListener;
    private a mSuperCaller;
    private final b0 mTextClassifierHelper;
    private final d0 mTextHelper;

    /* compiled from: AppCompatEditText.java */
    /* loaded from: classes.dex */
    public class a {
        public a() {
        }
    }

    public k(Context context) {
        this(context, null);
    }

    private a getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new a();
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.a();
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.amazon.aps.iva.t3.k.e(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = b0Var.b;
        if (textClassifier == null) {
            return b0.a.a(b0Var.a);
        }
        return textClassifier;
    }

    public void initEmojiKeyListener(l lVar) {
        KeyListener keyListener = getKeyListener();
        lVar.getClass();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a2 = lVar.a(keyListener);
            if (a2 == keyListener) {
                return;
            }
            super.setKeyListener(a2);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.b.a.b.e;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            com.amazon.aps.iva.s3.a.a(editorInfo, getText());
        }
        com.amazon.aps.iva.ff0.b.A(this, editorInfo, onCreateInputConnection);
        if (onCreateInputConnection != null && i <= 30 && (g = com.amazon.aps.iva.p3.g0.g(this)) != null) {
            editorInfo.contentMimeTypes = g;
            onCreateInputConnection = new com.amazon.aps.iva.s3.b(onCreateInputConnection, new com.amazon.aps.iva.f1.d0(this, 2));
        }
        return this.mAppCompatEmojiEditTextHelper.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && com.amazon.aps.iva.p3.g0.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = w.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // com.amazon.aps.iva.p3.w
    public com.amazon.aps.iva.p3.c onReceiveContent(com.amazon.aps.iva.p3.c cVar) {
        return this.mDefaultOnReceiveContentListener.a(this, cVar);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        c.b c0599c;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 < 31 && com.amazon.aps.iva.p3.g0.g(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i2 >= 31) {
                    c0599c = new c.a(primaryClip, 1);
                } else {
                    c0599c = new c.C0599c(primaryClip, 1);
                }
                if (i != 16908322) {
                    i3 = 1;
                }
                c0599c.b(i3);
                com.amazon.aps.iva.p3.g0.j(this, c0599c.build());
            }
            i3 = 1;
        }
        if (i3 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.amazon.aps.iva.t3.k.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.g(i, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b0Var.b = textClassifier;
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        y0.a(getContext(), this);
        d dVar = new d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.d(attributeSet, i);
        d0 d0Var = new d0(this);
        this.mTextHelper = d0Var;
        d0Var.f(attributeSet, i);
        d0Var.b();
        this.mTextClassifierHelper = new b0(this);
        this.mDefaultOnReceiveContentListener = new com.amazon.aps.iva.t3.l();
        l lVar = new l(this);
        this.mAppCompatEmojiEditTextHelper = lVar;
        lVar.b(attributeSet, i);
        initEmojiKeyListener(lVar);
    }
}
