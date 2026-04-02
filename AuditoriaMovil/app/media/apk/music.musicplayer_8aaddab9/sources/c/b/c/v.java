package c.b.c;

import android.app.Dialog;
import android.os.Bundle;
/* loaded from: classes.dex */
public class v extends c.m.b.n {
    @Override // c.m.b.n
    public Dialog onCreateDialog(Bundle bundle) {
        return new u(getContext(), getTheme());
    }

    @Override // c.m.b.n
    public void setupDialog(Dialog dialog, int i2) {
        if (!(dialog instanceof u)) {
            super.setupDialog(dialog, i2);
            return;
        }
        u uVar = (u) dialog;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        uVar.a().u(1);
    }
}
