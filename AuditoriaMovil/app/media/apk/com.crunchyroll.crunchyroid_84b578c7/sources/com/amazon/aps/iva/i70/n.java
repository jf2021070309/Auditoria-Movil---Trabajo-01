package com.amazon.aps.iva.i70;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.ui.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Set;
/* compiled from: InputWithStateLayout.kt */
@SuppressLint({"ForbiddenMethod"})
/* loaded from: classes2.dex */
public abstract class n extends com.amazon.aps.iva.wy.g implements l, i {
    public final j b;
    public final h c;
    public k d;
    public final a e;
    public n f;

    /* compiled from: InputWithStateLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: TextViewExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null) {
                charSequence.length();
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            n.this.G4();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    private final void setInputTextHint(String str) {
        ViewParent viewParent;
        ViewParent parent = getEditText().getParent();
        if (parent != null) {
            viewParent = parent.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof TextInputLayout) {
            ((TextInputLayout) viewParent).setHint(str);
        } else {
            getEditText().setHint(str);
        }
    }

    public final void B(k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "newState");
        this.b.q6(kVar);
    }

    @Override // com.amazon.aps.iva.i70.a
    public final boolean G() {
        Editable editable;
        EditText editText;
        if (this.f != null) {
            String obj = getEditText().getText().toString();
            n nVar = this.f;
            if (nVar != null && (editText = nVar.getEditText()) != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            return com.amazon.aps.iva.yb0.j.a(obj, String.valueOf(editable));
        }
        return true;
    }

    public abstract void G4();

    public abstract void U2();

    public final void b1() {
        l view = this.b.getView();
        view.clearText();
        view.clearFocus();
        view.refreshDrawableState();
    }

    @Override // android.view.ViewGroup, android.view.View, com.amazon.aps.iva.i70.l
    public final void clearFocus() {
        getEditText().clearFocus();
    }

    @Override // com.amazon.aps.iva.i70.l
    public final void clearText() {
        getEditText().getText().clear();
    }

    public final n getConfirmationInputView() {
        return this.f;
    }

    public abstract EditText getEditText();

    public com.amazon.aps.iva.xb0.a<q> getOnFocusChange() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.i70.l, com.amazon.aps.iva.i70.i
    public k getState() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.i70.i
    public final void id(int[] iArr, int[] iArr2) {
        com.amazon.aps.iva.yb0.j.f(iArr2, "additionalState");
        View.mergeDrawableStates(iArr, iArr2);
    }

    @Override // com.amazon.aps.iva.i70.l
    public final void m0() {
        getEditText().requestFocus();
    }

    @Override // com.amazon.aps.iva.i70.i
    public final boolean m6() {
        return getEditText().hasFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + g.values().length);
        h hVar = this.c;
        if (hVar != null) {
            hVar.q6(onCreateDrawableState);
        }
        com.amazon.aps.iva.yb0.j.e(onCreateDrawableState, "inputDrawableState");
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Object obj;
        Parcelable parcelable2;
        Object parcelable3;
        com.amazon.aps.iva.yb0.j.f(parcelable, "state");
        Bundle bundle = (Bundle) parcelable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            obj = bundle.getSerializable("singning_edit_text_state", k.class);
        } else {
            obj = (k) bundle.getSerializable("singning_edit_text_state");
        }
        k kVar = (k) obj;
        if (kVar == null) {
            kVar = k.DEFAULT;
        }
        boolean z = bundle.getBoolean("focus_edit_text_state", false);
        if (i >= 34) {
            parcelable3 = bundle.getParcelable("custom_view_super_state", Parcelable.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            parcelable2 = bundle.getParcelable("custom_view_super_state");
        }
        com.amazon.aps.iva.yb0.j.c(parcelable2);
        j jVar = this.b;
        jVar.getClass();
        com.amazon.aps.iva.yb0.j.f(kVar, "viewState");
        jVar.q6(kVar);
        if (z) {
            jVar.getView().m0();
        }
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return com.amazon.aps.iva.k3.e.a(new com.amazon.aps.iva.kb0.j("custom_view_super_state", super.onSaveInstanceState()), new com.amazon.aps.iva.kb0.j("singning_edit_text_state", getState()), new com.amazon.aps.iva.kb0.j("focus_edit_text_state", Boolean.valueOf(getEditText().hasFocus())));
    }

    public final void setConfirmationInputView(n nVar) {
        EditText editText;
        this.f = nVar;
        if (nVar != null && (editText = nVar.getEditText()) != null) {
            editText.addTextChangedListener(new b());
        }
    }

    @Override // com.amazon.aps.iva.i70.l
    public void setState(k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "<set-?>");
        this.d = kVar;
    }

    public abstract void setStateChangeListener(com.amazon.aps.iva.xb0.a<q> aVar);

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(this.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.b = new j(this);
        this.d = k.DEFAULT;
        this.e = a.h;
        this.c = new h(this);
        int[] iArr = R.styleable.InputWithStateLayout;
        com.amazon.aps.iva.yb0.j.e(iArr, "InputWithStateLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        com.amazon.aps.iva.yb0.j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        U2();
        getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.amazon.aps.iva.i70.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                n nVar = n.this;
                com.amazon.aps.iva.yb0.j.f(nVar, "this$0");
                nVar.b.getView().refreshDrawableState();
                nVar.getOnFocusChange().invoke();
            }
        });
        String string = obtainStyledAttributes.getResources().getString(obtainStyledAttributes.getResourceId(R.styleable.InputWithStateLayout_hint_text, R.string.empty_string));
        com.amazon.aps.iva.yb0.j.e(string, "resources.getString(\n   …          )\n            )");
        setInputTextHint(string);
        getEditText().setInputType(obtainStyledAttributes.getInteger(R.styleable.InputWithStateLayout_android_inputType, 1));
        getEditText().setNextFocusDownId(obtainStyledAttributes.getResourceId(R.styleable.InputWithStateLayout_android_nextFocusDown, 0));
        getEditText().setImeOptions(obtainStyledAttributes.getInteger(R.styleable.InputWithStateLayout_android_imeOptions, 0));
        getEditText().setTextColor(obtainStyledAttributes.getColor(R.styleable.InputWithStateLayout_android_textColor, -1));
        getEditText().setTextSize(0, obtainStyledAttributes.getDimension(R.styleable.InputWithStateLayout_android_textSize, obtainStyledAttributes.getResources().getDimension(R.dimen.input_field_text_size)));
        getEditText().setGravity(obtainStyledAttributes.getInteger(R.styleable.InputWithStateLayout_android_gravity, 8388691));
        getEditText().setId(getId() + getEditText().getId());
        getEditText().setAutofillHints(obtainStyledAttributes.getString(R.styleable.InputWithStateLayout_android_autofillHints));
        getEditText().setImportantForAutofill(obtainStyledAttributes.getInt(R.styleable.InputWithStateLayout_android_importantForAutofill, 0));
        obtainStyledAttributes.recycle();
    }
}
