package com.ellation.widgets.input.email;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.amazon.aps.iva.i70.n;
import com.amazon.aps.iva.j70.c;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.input.AdjustableTextInputLayout;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
/* compiled from: EmailInputView.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003R\"\u0010\u0014\u001a\u00020\r8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ellation/widgets/input/email/EmailInputView;", "Lcom/amazon/aps/iva/i70/n;", "Lcom/amazon/aps/iva/j70/a;", "", "getText", Scopes.EMAIL, "Lcom/amazon/aps/iva/kb0/q;", "setText", "Lkotlin/Function0;", "action", "setStateChangeListener", "hint", "setHintText", "Landroid/widget/EditText;", "g", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "editText", "text", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EmailInputView extends n implements com.amazon.aps.iva.j70.a {
    public EditText g;
    public AdjustableTextInputLayout h;
    public final c i;

    /* compiled from: TextViewExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
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
            EmailInputView.this.i.r6();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmailInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.i70.n
    public final void G4() {
        this.i.r6();
    }

    @Override // com.amazon.aps.iva.i70.n
    public final void U2() {
        View inflate = View.inflate(getContext(), R.layout.email_input_field_layout, this);
        View findViewById = inflate.findViewById(R.id.email_field);
        j.e(findViewById, "findViewById(R.id.email_field)");
        setEditText((EditText) findViewById);
        View findViewById2 = inflate.findViewById(R.id.input_layout);
        j.e(findViewById2, "findViewById(R.id.input_layout)");
        this.h = (AdjustableTextInputLayout) findViewById2;
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

    public final String getEmail() {
        return this.i.q6();
    }

    @Override // com.amazon.aps.iva.j70.a
    public String getText() {
        return getEditText().getText().toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i.onDestroy();
    }

    public void setEditText(EditText editText) {
        j.f(editText, "<set-?>");
        this.g = editText;
    }

    public final void setEmail(String str) {
        j.f(str, "text");
        c cVar = this.i;
        cVar.getClass();
        cVar.getView().setText(str);
    }

    public final void setHintText(String str) {
        j.f(str, "hint");
        AdjustableTextInputLayout adjustableTextInputLayout = this.h;
        if (adjustableTextInputLayout != null) {
            adjustableTextInputLayout.setHint(str);
        } else {
            j.m("inputLayout");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.i70.n
    public void setStateChangeListener(com.amazon.aps.iva.xb0.a<q> aVar) {
        j.f(aVar, "action");
        this.i.d = aVar;
    }

    @Override // com.amazon.aps.iva.j70.a
    public void setText(String str) {
        j.f(str, Scopes.EMAIL);
        getEditText().setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.i = new c(this, new com.amazon.aps.iva.x50.n(new Handler(Looper.getMainLooper())));
        getEditText().addTextChangedListener(new a());
    }
}
