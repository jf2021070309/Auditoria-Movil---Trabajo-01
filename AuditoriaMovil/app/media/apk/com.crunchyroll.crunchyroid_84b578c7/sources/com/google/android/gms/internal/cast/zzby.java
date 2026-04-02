package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
final class zzby implements com.google.android.gms.cast.framework.media.internal.zza {
    final /* synthetic */ zzca zza;

    public zzby(zzca zzcaVar) {
        this.zza = zzcaVar;
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zza
    public final void zza(Bitmap bitmap) {
        View view;
        ImageView imageView;
        ImageView imageView2;
        zzbz zzbzVar;
        zzbz zzbzVar2;
        View view2;
        if (bitmap != null) {
            zzca zzcaVar = this.zza;
            view = zzcaVar.zzd;
            if (view != null) {
                view2 = zzcaVar.zzd;
                view2.setVisibility(4);
            }
            imageView = this.zza.zza;
            imageView.setVisibility(0);
            imageView2 = this.zza.zza;
            imageView2.setImageBitmap(bitmap);
            zzca zzcaVar2 = this.zza;
            zzbzVar = zzcaVar2.zzf;
            if (zzbzVar != null) {
                zzbzVar2 = zzcaVar2.zzf;
                zzbzVar2.zza();
            }
        }
    }
}
