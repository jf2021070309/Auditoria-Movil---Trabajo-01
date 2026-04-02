package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook.share.internal.ShareConstants;
import com.fyber.inneractive.sdk.mraid.f;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q extends a {
    public q(Map<String, String> map, com.fyber.inneractive.sdk.m.d dVar, aj ajVar) {
        super(map, dVar, ajVar);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public final void d() {
        final String b = b(ShareConstants.MEDIA_URI);
        if (b != null && !"".equals(b)) {
            final com.fyber.inneractive.sdk.m.d dVar = this.c;
            Context v = dVar.v();
            if (!com.fyber.inneractive.sdk.util.k.l()) {
                dVar.a(f.a.STORE_PICTURE, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
                IAlog.b("Error downloading file. Please check if the Android permission is not granted, or maybe the device does not have an SD card mounted? ", new Object[0]);
                return;
            } else if (!(v instanceof Activity)) {
                dVar.d("Downloading image to Picture gallery...");
                dVar.e(b);
                return;
            } else {
                new AlertDialog.Builder(dVar.v()).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new DialogInterface.OnClickListener() { // from class: com.fyber.inneractive.sdk.m.d.6
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dVar.e(b);
                    }
                }).setCancelable(true).show();
                return;
            }
        }
        this.c.a(f.a.STORE_PICTURE, "Image can't be stored with null or empty URL");
        IAlog.b("Mraid Store Picture -Invalid URI ", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public final String a() {
        return b(ShareConstants.MEDIA_URI);
    }
}
