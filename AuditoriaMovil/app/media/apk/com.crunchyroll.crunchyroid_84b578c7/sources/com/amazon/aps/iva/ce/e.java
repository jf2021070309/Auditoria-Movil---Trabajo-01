package com.amazon.aps.iva.ce;

import android.content.ClipData;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.crunchyroll.auth.otpview.OtpTextLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: OtpTextLayout.kt */
/* loaded from: classes.dex */
public final class e implements ActionMode.Callback {
    public final /* synthetic */ OtpTextLayout a;

    public e(OtpTextLayout otpTextLayout) {
        this.a = otpTextLayout;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        boolean z;
        ClipData.Item itemAt;
        CharSequence text;
        int i = 0;
        if (menuItem != null && menuItem.getItemId() == 16908322) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            OtpTextLayout otpTextLayout = this.a;
            ClipData primaryClip = otpTextLayout.e.getPrimaryClip();
            if (primaryClip != null && primaryClip.getDescription().hasMimeType("text/plain") && (itemAt = primaryClip.getItemAt(0)) != null && (text = itemAt.getText()) != null) {
                j jVar = otpTextLayout.c;
                jVar.getClass();
                Pattern compile = Pattern.compile("\\d{6}");
                com.amazon.aps.iva.yb0.j.e(compile, "compile(pattern)");
                Matcher matcher = compile.matcher(text);
                com.amazon.aps.iva.yb0.j.e(matcher, "nativePattern.matcher(input)");
                com.amazon.aps.iva.oe0.e h = com.amazon.aps.iva.a60.b.h(matcher, 0, text);
                if (h != null) {
                    String value = h.getValue();
                    int i2 = 0;
                    while (i < value.length()) {
                        jVar.getView().Na(i2, String.valueOf(value.charAt(i)));
                        jVar.getView().Je(i2);
                        i++;
                        i2++;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
