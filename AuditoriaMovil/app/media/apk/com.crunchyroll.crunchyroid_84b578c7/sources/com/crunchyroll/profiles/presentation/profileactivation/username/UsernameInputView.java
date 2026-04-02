package com.crunchyroll.profiles.presentation.profileactivation.username;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.amazon.aps.iva.i70.n;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.sm.b;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
/* compiled from: UsernameInputView.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016R\"\u0010\u0012\u001a\u00020\u000b8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/crunchyroll/profiles/presentation/profileactivation/username/UsernameInputView;", "Lcom/amazon/aps/iva/i70/n;", "Lcom/amazon/aps/iva/sm/a;", "", "getText", Scopes.EMAIL, "Lcom/amazon/aps/iva/kb0/q;", "setText", "Lkotlin/Function0;", "action", "setStateChangeListener", "Landroid/widget/EditText;", "g", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "editText", "text", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "username", "profiles_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UsernameInputView extends n implements com.amazon.aps.iva.sm.a {
    public EditText g;
    public final b h;

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
            UsernameInputView.this.h.r6();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UsernameInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.i70.n
    public final void G4() {
        this.h.r6();
    }

    @Override // com.amazon.aps.iva.i70.n
    public final void U2() {
        View findViewById = View.inflate(getContext(), R.layout.username_input_field_layout, this).findViewById(R.id.username_field);
        j.e(findViewById, "layout.findViewById(R.id.username_field)");
        setEditText((EditText) findViewById);
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

    @Override // com.amazon.aps.iva.sm.a
    public String getText() {
        return getEditText().getText().toString();
    }

    public final String getUsername() {
        return this.h.q6();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.onDestroy();
    }

    public void setEditText(EditText editText) {
        j.f(editText, "<set-?>");
        this.g = editText;
    }

    @Override // com.amazon.aps.iva.i70.n
    public void setStateChangeListener(com.amazon.aps.iva.xb0.a<q> aVar) {
        j.f(aVar, "action");
        this.h.c = aVar;
    }

    @Override // com.amazon.aps.iva.sm.a
    public void setText(String str) {
        j.f(str, Scopes.EMAIL);
        getEditText().setText(str);
    }

    public final void setUsername(String str) {
        j.f(str, "text");
        b bVar = this.h;
        bVar.getClass();
        bVar.getView().setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.h = new b(this);
        getEditText().addTextChangedListener(new a());
    }
}
