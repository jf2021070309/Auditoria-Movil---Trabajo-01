package com.amazon.aps.iva.q;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.p3.c;
/* compiled from: AppCompatReceiveContentHelper.java */
/* loaded from: classes.dex */
public final class w {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        c.b c0599c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0599c = new c.a(clipData, 3);
            } else {
                c0599c = new c.C0599c(clipData, 3);
            }
            com.amazon.aps.iva.p3.g0.j(textView, c0599c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        c.b c0599c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0599c = new c.a(clipData, 3);
        } else {
            c0599c = new c.C0599c(clipData, 3);
        }
        com.amazon.aps.iva.p3.g0.j(view, c0599c.build());
        return true;
    }
}
