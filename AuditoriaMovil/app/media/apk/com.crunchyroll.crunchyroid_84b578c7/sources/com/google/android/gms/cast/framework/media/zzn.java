package com.google.android.gms.cast.framework.media;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.images.WebImage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzn {
    public final Uri zza;
    public Bitmap zzb;

    public zzn(WebImage webImage) {
        Uri url;
        if (webImage == null) {
            url = null;
        } else {
            url = webImage.getUrl();
        }
        this.zza = url;
    }
}
