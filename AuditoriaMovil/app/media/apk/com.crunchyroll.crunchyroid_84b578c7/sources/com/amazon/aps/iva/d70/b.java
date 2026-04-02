package com.amazon.aps.iva.d70;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.ellation.widgets.characterlimit.CharacterLimitTextView;
/* compiled from: TextViewExtensions.kt */
/* loaded from: classes2.dex */
public final class b implements TextWatcher {
    public int b;
    public final /* synthetic */ CharacterLimitTextView c;
    public final /* synthetic */ TextView d;

    public b(CharacterLimitTextView characterLimitTextView, EditText editText) {
        this.c = characterLimitTextView;
        this.d = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (charSequence != null) {
            i4 = charSequence.length();
        } else {
            i4 = 0;
        }
        this.b = i4;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        String str;
        int i5 = this.b;
        a aVar = this.c.b;
        if (charSequence != null) {
            i4 = charSequence.length();
        } else {
            i4 = 0;
        }
        Integer valueOf = Integer.valueOf(this.d.getSelectionStart());
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        d dVar = new d(i5, i4, valueOf, str);
        aVar.getClass();
        aVar.q6(dVar);
    }
}
