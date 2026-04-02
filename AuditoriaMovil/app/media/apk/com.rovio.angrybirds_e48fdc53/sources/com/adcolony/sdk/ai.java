package com.adcolony.sdk;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.facebook.share.internal.ShareConstants;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ai {
    private d a;
    private AlertDialog b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ai() {
        a.a("Alert.show", new f() { // from class: com.adcolony.sdk.ai.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (!a.d()) {
                    au.g.b("Null Activity reference, can't build AlertDialog.");
                } else if (as.d(dVar.b(), "on_resume")) {
                    ai.this.a = dVar;
                } else {
                    ai.this.a(dVar);
                }
            }
        });
    }

    void a(final d dVar) {
        if (a.d()) {
            final AlertDialog.Builder builder = a.a().k().n() >= 21 ? new AlertDialog.Builder(a.c(), 16974374) : new AlertDialog.Builder(a.c(), 16974126);
            JSONObject b = dVar.b();
            String b2 = as.b(b, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            String b3 = as.b(b, "title");
            String b4 = as.b(b, "positive");
            String b5 = as.b(b, "negative");
            builder.setMessage(b2);
            builder.setTitle(b3);
            builder.setPositiveButton(b4, new DialogInterface.OnClickListener() { // from class: com.adcolony.sdk.ai.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    ai.this.b = null;
                    dialogInterface.dismiss();
                    JSONObject a = as.a();
                    as.a(a, "positive", true);
                    ai.this.c = false;
                    dVar.a(a).a();
                }
            });
            if (!b5.equals("")) {
                builder.setNegativeButton(b5, new DialogInterface.OnClickListener() { // from class: com.adcolony.sdk.ai.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ai.this.b = null;
                        dialogInterface.dismiss();
                        JSONObject a = as.a();
                        as.a(a, "positive", false);
                        ai.this.c = false;
                        dVar.a(a).a();
                    }
                });
            }
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.adcolony.sdk.ai.4
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    ai.this.b = null;
                    ai.this.c = false;
                    JSONObject a = as.a();
                    as.a(a, "positive", false);
                    dVar.a(a).a();
                }
            });
            q.a(new Runnable() { // from class: com.adcolony.sdk.ai.5
                @Override // java.lang.Runnable
                public void run() {
                    ai.this.c = true;
                    ai.this.b = builder.show();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.a != null) {
            a(this.a);
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AlertDialog b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AlertDialog alertDialog) {
        this.b = alertDialog;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.c;
    }
}
