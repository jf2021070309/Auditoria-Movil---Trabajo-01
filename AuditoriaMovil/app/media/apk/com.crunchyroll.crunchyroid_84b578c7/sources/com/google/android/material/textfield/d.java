package com.google.android.material.textfield;

import android.view.View;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ EndIconDelegate c;

    public /* synthetic */ d(EndIconDelegate endIconDelegate, int i) {
        this.b = i;
        this.c = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        EndIconDelegate endIconDelegate = this.c;
        switch (i) {
            case 0:
                ClearTextEndIconDelegate.b((ClearTextEndIconDelegate) endIconDelegate, view);
                return;
            default:
                PasswordToggleEndIconDelegate.a((PasswordToggleEndIconDelegate) endIconDelegate, view);
                return;
        }
    }
}
