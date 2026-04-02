package com.amazon.aps.iva.b40;

import android.widget.Checkable;
import android.widget.CompoundButton;
/* compiled from: CompoundButtonDecorator.kt */
/* loaded from: classes2.dex */
public final class b implements Checkable {
    public final CompoundButton b;

    public b(CompoundButton compoundButton) {
        this.b = compoundButton;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b.isChecked();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        this.b.setChecked(z);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.b.isChecked());
    }
}
