package com.amazon.aps.iva.t3;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.p3.c;
import com.amazon.aps.iva.p3.v;
import java.util.Objects;
/* compiled from: TextViewOnReceiveContentListener.java */
/* loaded from: classes.dex */
public final class l implements v {
    @Override // com.amazon.aps.iva.p3.v
    public final com.amazon.aps.iva.p3.c a(View view, com.amazon.aps.iva.p3.c cVar) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(cVar);
        }
        if (cVar.a.g() == 2) {
            return cVar;
        }
        c.e eVar = cVar.a;
        ClipData a = eVar.a();
        int m = eVar.m();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < a.getItemCount(); i++) {
            ClipData.Item itemAt = a.getItemAt(i);
            if ((m & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                }
            }
        }
        return null;
    }
}
