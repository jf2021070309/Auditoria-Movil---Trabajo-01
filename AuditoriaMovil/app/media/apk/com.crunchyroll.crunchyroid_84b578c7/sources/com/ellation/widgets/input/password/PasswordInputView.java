package com.ellation.widgets.input.password;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.i70.n;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.Metadata;
/* compiled from: PasswordInputView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/ellation/widgets/input/password/PasswordInputView;", "Lcom/amazon/aps/iva/i70/n;", "Lcom/amazon/aps/iva/k70/a;", "", "password", "Lcom/amazon/aps/iva/kb0/q;", "setText", "Lkotlin/Function0;", "action", "setStateChangeListener", "Landroid/widget/EditText;", "g", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "editText", "Lcom/google/android/material/internal/CheckableImageButton;", "h", "Lcom/amazon/aps/iva/bc0/b;", "getPasswordVisibilityToggle", "()Lcom/google/android/material/internal/CheckableImageButton;", "passwordVisibilityToggle", "j", "Lcom/amazon/aps/iva/xb0/a;", "getOnTextChanged", "()Lcom/amazon/aps/iva/xb0/a;", "setOnTextChanged", "(Lcom/amazon/aps/iva/xb0/a;)V", "onTextChanged", "k", "getOnFocusChange", "onFocusChange", "getPassword", "()Ljava/lang/String;", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PasswordInputView extends n implements com.amazon.aps.iva.k70.a {
    public static final /* synthetic */ l<Object>[] l = {q.a(PasswordInputView.class, "passwordVisibilityToggle", "getPasswordVisibilityToggle()Lcom/google/android/material/internal/CheckableImageButton;", 0)};
    public EditText g;
    public final v h;
    public final com.amazon.aps.iva.k70.b i;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;
    public final a k;

    /* compiled from: PasswordInputView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            boolean z;
            PasswordInputView passwordInputView = PasswordInputView.this;
            com.amazon.aps.iva.k70.b bVar = passwordInputView.i;
            String password = passwordInputView.getPassword();
            boolean isFocused = passwordInputView.getEditText().isFocused();
            bVar.getClass();
            j.f(password, "password");
            if (password.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !isFocused) {
                bVar.getView().E4();
            } else {
                bVar.getView().W3();
            }
            return com.amazon.aps.iva.kb0.q.a;
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
            PasswordInputView passwordInputView = PasswordInputView.this;
            com.amazon.aps.iva.k70.b bVar = passwordInputView.i;
            String valueOf = String.valueOf(charSequence);
            bVar.getClass();
            bVar.q6(valueOf);
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = bVar.c;
            if (aVar != null) {
                aVar.invoke();
            }
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> onTextChanged = passwordInputView.getOnTextChanged();
            if (onTextChanged != null) {
                onTextChanged.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PasswordInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final CheckableImageButton getPasswordVisibilityToggle() {
        return (CheckableImageButton) this.h.getValue(this, l[0]);
    }

    @Override // com.amazon.aps.iva.k70.a
    public final void E4() {
        getPasswordVisibilityToggle().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i70.n
    public final void G4() {
        com.amazon.aps.iva.k70.b bVar = this.i;
        bVar.q6(bVar.getView().getPassword());
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = bVar.c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.amazon.aps.iva.k70.a
    @SuppressLint({"RestrictedApi"})
    public final void Gc() {
        getPasswordVisibilityToggle().setChecked(false);
    }

    @Override // com.amazon.aps.iva.k70.a
    public final boolean Hb() {
        if (getEditText().getInputType() == 129) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.i70.n
    public final void U2() {
        View findViewById = View.inflate(getContext(), R.layout.password_input_field_layout, this).findViewById(R.id.password_field);
        j.e(findViewById, "findViewById(R.id.password_field)");
        setEditText((EditText) findViewById);
    }

    @Override // com.amazon.aps.iva.k70.a
    public final void U8() {
        if (getEditText().hasFocus()) {
            getEditText().setSelection(getEditText().getText().length());
        }
    }

    @Override // com.amazon.aps.iva.k70.a
    public final void W3() {
        getPasswordVisibilityToggle().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.k70.a
    @SuppressLint({"RestrictedApi"})
    public final void f6() {
        getPasswordVisibilityToggle().setChecked(true);
    }

    @Override // com.amazon.aps.iva.i70.n
    public EditText getEditText() {
        EditText editText = this.g;
        if (editText != null) {
            return editText;
        }
        j.m("editText");
        throw null;
    }

    @Override // com.amazon.aps.iva.i70.n
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> getOnFocusChange() {
        return this.k;
    }

    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> getOnTextChanged() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.k70.a
    public String getPassword() {
        return getEditText().getText().toString();
    }

    @Override // com.amazon.aps.iva.k70.a
    public final void ie() {
        getEditText().setInputType(129);
    }

    public void setEditText(EditText editText) {
        j.f(editText, "<set-?>");
        this.g = editText;
    }

    public final void setOnTextChanged(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.i70.n
    public void setStateChangeListener(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        j.f(aVar, "action");
        this.i.c = aVar;
    }

    public void setText(String str) {
        j.f(str, "password");
        getEditText().setText(str);
    }

    @Override // com.amazon.aps.iva.k70.a
    public final void t8() {
        getEditText().setInputType(145);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.h = g.c(R.id.hide_show_password_button, this);
        this.i = new com.amazon.aps.iva.k70.b(this);
        getPasswordVisibilityToggle().setOnClickListener(new com.amazon.aps.iva.ne.a(this, 23));
        getEditText().addTextChangedListener(new b());
        this.k = new a();
    }
}
