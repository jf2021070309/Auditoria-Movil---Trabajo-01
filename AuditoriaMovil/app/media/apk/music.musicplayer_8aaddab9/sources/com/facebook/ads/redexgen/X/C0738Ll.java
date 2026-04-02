package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Ll  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0738Ll {
    public static void A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, @Nullable Context context) {
        if (context == null || !(context instanceof Activity)) {
            onClickListener.onClick(null, 0);
        } else {
            new AlertDialog.Builder(context).setTitle(JQ.A0V(context)).setMessage(JQ.A0T(context)).setPositiveButton(JQ.A0U(context), new DialogInterface$OnClickListenerC0737Lk(onClickListener)).setNegativeButton(JQ.A0S(context), new DialogInterface$OnClickListenerC0736Lj(onClickListener2)).show();
        }
    }
}
