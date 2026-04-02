package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzh implements com.google.android.gms.cast.framework.media.internal.zza {
    final /* synthetic */ ExpandedControllerActivity zza;

    public zzh(ExpandedControllerActivity expandedControllerActivity) {
        this.zza = expandedControllerActivity;
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zza
    @TargetApi(ConnectionResult.API_DISABLED)
    public final void zza(Bitmap bitmap) {
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        TextView textView2;
        if (bitmap != null) {
            ExpandedControllerActivity expandedControllerActivity = this.zza;
            textView = expandedControllerActivity.zzG;
            if (textView != null) {
                textView2 = expandedControllerActivity.zzG;
                textView2.setVisibility(8);
            }
            ExpandedControllerActivity expandedControllerActivity2 = this.zza;
            imageView = expandedControllerActivity2.zzF;
            if (imageView != null) {
                imageView2 = expandedControllerActivity2.zzF;
                imageView2.setVisibility(0);
                imageView3 = this.zza.zzF;
                imageView3.setImageBitmap(bitmap);
            }
        }
    }
}
