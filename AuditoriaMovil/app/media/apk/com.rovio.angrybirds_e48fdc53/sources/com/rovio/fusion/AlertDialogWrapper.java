package com.rovio.fusion;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;
/* loaded from: classes2.dex */
public class AlertDialogWrapper implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    private final long a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private long h;
    private AlertDialog i = null;
    private int j = -1;

    public native void showAlertResultCallback(long j, long j2, int i, int i2);

    public AlertDialogWrapper(long j, long j2, int i, String str, String str2, String str3, String str4, String str5) {
        this.a = j;
        this.h = j2;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public void show() {
        final Activity activity = Globals.getActivity();
        activity.runOnUiThread(new Runnable() { // from class: com.rovio.fusion.AlertDialogWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                TextView textView;
                AlertDialogWrapper.this.i = new AlertDialog.Builder(activity).create();
                AlertDialogWrapper.this.i.setTitle(AlertDialogWrapper.this.c);
                AlertDialogWrapper.this.i.setMessage(AlertDialogWrapper.this.d);
                if (AlertDialogWrapper.this.e != null) {
                    AlertDialogWrapper.this.i.setButton(-1, AlertDialogWrapper.this.e, this);
                }
                if (AlertDialogWrapper.this.f != null) {
                    AlertDialogWrapper.this.i.setButton(-3, AlertDialogWrapper.this.f, this);
                }
                if (AlertDialogWrapper.this.g != null) {
                    AlertDialogWrapper.this.i.setButton(-2, AlertDialogWrapper.this.g, this);
                }
                AlertDialogWrapper.this.i.setCancelable(false);
                AlertDialogWrapper.this.i.setOnDismissListener(this);
                AlertDialogWrapper.this.i.show();
                int identifier = activity.getResources().getIdentifier("alertTitle", "id", "android");
                if (identifier > 0 && (textView = (TextView) AlertDialogWrapper.this.i.findViewById(identifier)) != null) {
                    textView.setMaxLines(4);
                    textView.setSingleLine(false);
                }
            }
        });
    }

    public void dismiss() {
        this.h = 0L;
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.fusion.AlertDialogWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                if (AlertDialogWrapper.this.i != null) {
                    AlertDialogWrapper.this.i.dismiss();
                    AlertDialogWrapper.this.i = null;
                }
            }
        });
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.j = 0;
        } else if (i == -3) {
            this.j = 1;
        } else if (i == -2) {
            this.j = 2;
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.i = null;
        if (this.h != 0) {
            Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.AlertDialogWrapper.3
                @Override // java.lang.Runnable
                public void run() {
                    if (AlertDialogWrapper.this.h != 0) {
                        AlertDialogWrapper.this.showAlertResultCallback(AlertDialogWrapper.this.a, AlertDialogWrapper.this.h, AlertDialogWrapper.this.b, AlertDialogWrapper.this.j);
                    }
                }
            });
        }
    }
}
