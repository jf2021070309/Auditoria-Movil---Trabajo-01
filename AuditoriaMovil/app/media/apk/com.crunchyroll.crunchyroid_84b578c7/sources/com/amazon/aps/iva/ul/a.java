package com.amazon.aps.iva.ul;

import android.text.Editable;
import android.text.TextWatcher;
import com.crunchyroll.player.settings.reportproblem.button.ReportProblemButton;
/* compiled from: TextViewExtensions.kt */
/* loaded from: classes2.dex */
public final class a implements TextWatcher {
    public final /* synthetic */ ReportProblemButton b;

    public a(ReportProblemButton reportProblemButton) {
        this.b = reportProblemButton;
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
        d presenter;
        presenter = this.b.getPresenter();
        presenter.k5(String.valueOf(charSequence));
    }
}
