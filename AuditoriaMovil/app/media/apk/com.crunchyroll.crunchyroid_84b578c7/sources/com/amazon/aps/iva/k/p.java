package com.amazon.aps.iva.k;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: AppCompatDialogFragment.java */
/* loaded from: classes.dex */
public class p extends androidx.fragment.app.g {
    public p() {
    }

    @Override // androidx.fragment.app.g
    public Dialog onCreateDialog(Bundle bundle) {
        return new o(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.g
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof o) {
            o oVar = (o) dialog;
            if (i != 1 && i != 2) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            oVar.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }

    public p(int i) {
        super(i);
    }
}
