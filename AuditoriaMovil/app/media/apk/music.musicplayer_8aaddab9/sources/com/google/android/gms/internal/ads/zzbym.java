package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzbym extends zzbyp {
    private final Map<String, String> zza;
    private final Context zzb;

    public zzbym(zzcml zzcmlVar, Map<String, String> map) {
        super(zzcmlVar, "storePicture");
        this.zza = map;
        this.zzb = zzcmlVar.zzj();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzf("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbiv(this.zzb).zza()) {
            zzf("Feature is not supported by the device.");
            return;
        }
        String str = this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzf("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            zzf(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            com.google.android.gms.ads.internal.zzt.zzc();
            if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                String valueOf2 = String.valueOf(lastPathSegment);
                zzf(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources zzj = com.google.android.gms.ads.internal.zzt.zzg().zzj();
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zzb);
            builder.setTitle(zzj != null ? zzj.getString(R.string.s1) : "Save image");
            builder.setMessage(zzj != null ? zzj.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
            builder.setPositiveButton(zzj != null ? zzj.getString(R.string.s3) : "Accept", new zzbyk(this, str, lastPathSegment));
            builder.setNegativeButton(zzj != null ? zzj.getString(R.string.s4) : "Decline", new zzbyl(this));
            builder.create().show();
        }
    }
}
