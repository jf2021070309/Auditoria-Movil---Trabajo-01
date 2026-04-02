package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzblu;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private boolean zzb;
    private zzbls zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private zzblu zzf;

    public MediaView(Context context) {
        super(context);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        zzblu zzbluVar = this.zzf;
        if (zzbluVar != null) {
            zzbluVar.zza(scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.zzb = true;
        this.zza = mediaContent;
        zzbls zzblsVar = this.zzc;
        if (zzblsVar != null) {
            zzblsVar.zza(mediaContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(zzbls zzblsVar) {
        this.zzc = zzblsVar;
        if (this.zzb) {
            zzblsVar.zza(this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzb(zzblu zzbluVar) {
        this.zzf = zzbluVar;
        if (this.zze) {
            zzbluVar.zza(this.zzd);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
