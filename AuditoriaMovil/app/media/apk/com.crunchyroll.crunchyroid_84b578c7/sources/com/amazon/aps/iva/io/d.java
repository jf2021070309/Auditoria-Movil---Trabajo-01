package com.amazon.aps.iva.io;

import android.view.KeyEvent;
import android.widget.CompoundButton;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.usermigration.terms.AcceptTermsAndPrivacyPolicyActivity;
import com.google.android.material.chip.Chip;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ d(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                AcceptTermsAndPrivacyPolicyActivity acceptTermsAndPrivacyPolicyActivity = (AcceptTermsAndPrivacyPolicyActivity) callback;
                int i2 = AcceptTermsAndPrivacyPolicyActivity.n;
                j.f(acceptTermsAndPrivacyPolicyActivity, "this$0");
                acceptTermsAndPrivacyPolicyActivity.mi().getPresenter().Y1(z);
                return;
            default:
                Chip.a((Chip) callback, compoundButton, z);
                return;
        }
    }
}
