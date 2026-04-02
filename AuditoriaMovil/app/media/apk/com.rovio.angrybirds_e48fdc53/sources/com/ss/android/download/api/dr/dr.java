package com.ss.android.download.api.dr;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.ss.android.download.api.config.yk;
import com.ss.android.download.api.download.DownloadModel;
/* loaded from: classes3.dex */
public class dr implements yk {
    @Override // com.ss.android.download.api.config.yk
    public void dr(int i, Context context, DownloadModel downloadModel, String str, Drawable drawable, int i2) {
        Toast.makeText(context, str, 0).show();
    }

    @Override // com.ss.android.download.api.config.yk
    public Dialog ge(com.ss.android.download.api.model.ge geVar) {
        return dr(geVar);
    }

    private static Dialog dr(final com.ss.android.download.api.model.ge geVar) {
        if (geVar == null) {
            return null;
        }
        AlertDialog show = new AlertDialog.Builder(geVar.dr).setTitle(geVar.ge).setMessage(geVar.o).setPositiveButton(geVar.g, new DialogInterface.OnClickListener() { // from class: com.ss.android.download.api.dr.dr.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (com.ss.android.download.api.model.ge.this.xu != null) {
                    com.ss.android.download.api.model.ge.this.xu.dr(dialogInterface);
                }
            }
        }).setNegativeButton(geVar.q, new DialogInterface.OnClickListener() { // from class: com.ss.android.download.api.dr.dr.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (com.ss.android.download.api.model.ge.this.xu != null) {
                    com.ss.android.download.api.model.ge.this.xu.ge(dialogInterface);
                }
            }
        }).show();
        show.setCanceledOnTouchOutside(geVar.bn);
        show.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.ss.android.download.api.dr.dr.3
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (com.ss.android.download.api.model.ge.this.xu != null) {
                    com.ss.android.download.api.model.ge.this.xu.o(dialogInterface);
                }
            }
        });
        if (geVar.rb != null) {
            show.setIcon(geVar.rb);
        }
        return show;
    }
}
