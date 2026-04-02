package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import android.widget.ImageView;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
final class zzbw implements com.google.android.gms.cast.framework.media.internal.zza {
    final /* synthetic */ zzbx zza;

    public zzbw(zzbx zzbxVar) {
        this.zza = zzbxVar;
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zza
    public final void zza(Bitmap bitmap) {
        ImageView imageView;
        if (bitmap != null) {
            imageView = this.zza.zza;
            imageView.setImageBitmap(bitmap);
        }
    }
}
