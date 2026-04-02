package com.amazon.aps.iva.jo;

import android.view.View;
import android.view.WindowInsets;
import com.amazon.aps.iva.xw.t0;
import com.crunchyroll.usermigration.verification.CrOwnershipVerificationActivity;
import com.ellation.crunchyroll.presentation.forgotpassword.ForgotPasswordActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                CrOwnershipVerificationActivity.a aVar = CrOwnershipVerificationActivity.o;
                com.amazon.aps.iva.yb0.j.f(view, "v");
                com.amazon.aps.iva.yb0.j.f(windowInsets, "insets");
                t0.j(view, null, Integer.valueOf(t0.l(windowInsets)), null, null, 13);
                return windowInsets;
            default:
                ForgotPasswordActivity.a aVar2 = ForgotPasswordActivity.t;
                com.amazon.aps.iva.yb0.j.f(view, "v");
                com.amazon.aps.iva.yb0.j.f(windowInsets, "insets");
                t0.j(view, null, Integer.valueOf(t0.l(windowInsets)), null, null, 13);
                return windowInsets;
        }
    }
}
