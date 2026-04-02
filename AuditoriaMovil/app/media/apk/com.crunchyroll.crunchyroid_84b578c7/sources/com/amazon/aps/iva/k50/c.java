package com.amazon.aps.iva.k50;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
/* compiled from: ExternalUriRouter.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final Context b;
    public final String c;

    public c(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "fallbackTitle");
        this.b = context;
        this.c = str;
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2) {
        TextView textView = (TextView) new MaterialAlertDialogBuilder(this.b).setTitle(charSequence).setMessage(charSequence2).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) new com.amazon.aps.iva.b40.e(1)).setCancelable(true).show().findViewById(16908299);
        if (textView != null) {
            textView.setTextIsSelectable(true);
        }
    }

    @Override // com.amazon.aps.iva.k50.b
    public final void r1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        s1(str, "", this.c);
    }

    @Override // com.amazon.aps.iva.k50.b
    public final void s1(String str, String str2, String str3) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        com.amazon.aps.iva.yb0.j.f(str3, "title");
        try {
            com.amazon.aps.iva.d3.a.startActivity(this.b, new Intent("android.intent.action.VIEW", Uri.parse(str)), null);
        } catch (ActivityNotFoundException unused) {
            c(str3, str2);
        } catch (SecurityException unused2) {
            c(str3, str2);
        }
    }
}
