package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.MediaUtils;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.common.images.WebImage;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzca extends UIController {
    private final ImageView zza;
    private final ImageHints zzb;
    private final Bitmap zzc;
    private final View zzd;
    private final ImagePicker zze;
    private final zzbz zzf;
    private final com.google.android.gms.cast.framework.media.internal.zzb zzg;

    public zzca(ImageView imageView, Context context, ImageHints imageHints, int i, View view, zzbz zzbzVar) {
        Bitmap bitmap;
        CastMediaOptions castMediaOptions;
        this.zza = imageView;
        this.zzb = imageHints;
        this.zzf = zzbzVar;
        ImagePicker imagePicker = null;
        if (i != 0) {
            bitmap = BitmapFactory.decodeResource(context.getResources(), i);
        } else {
            bitmap = null;
        }
        this.zzc = bitmap;
        this.zzd = view;
        CastContext zza = CastContext.zza(context);
        if (zza != null && (castMediaOptions = zza.getCastOptions().getCastMediaOptions()) != null) {
            imagePicker = castMediaOptions.getImagePicker();
        }
        this.zze = imagePicker;
        this.zzg = new com.google.android.gms.cast.framework.media.internal.zzb(context.getApplicationContext());
    }

    private final void zzd() {
        View view = this.zzd;
        if (view != null) {
            view.setVisibility(0);
            this.zza.setVisibility(4);
        }
        Bitmap bitmap = this.zzc;
        if (bitmap != null) {
            this.zza.setImageBitmap(bitmap);
        }
    }

    private final void zze() {
        Uri imageUri;
        WebImage onPickImage;
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            MediaInfo mediaInfo = remoteMediaClient.getMediaInfo();
            if (mediaInfo == null) {
                imageUri = null;
            } else {
                ImagePicker imagePicker = this.zze;
                MediaMetadata metadata = mediaInfo.getMetadata();
                if (imagePicker != null && metadata != null && (onPickImage = this.zze.onPickImage(metadata, this.zzb)) != null && onPickImage.getUrl() != null) {
                    imageUri = onPickImage.getUrl();
                } else {
                    imageUri = MediaUtils.getImageUri(mediaInfo, 0);
                }
            }
            if (imageUri == null) {
                zzd();
                return;
            } else {
                this.zzg.zzd(imageUri);
                return;
            }
        }
        zzd();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zze();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        super.onSessionConnected(castSession);
        this.zzg.zzc(new zzby(this));
        zzd();
        zze();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        this.zzg.zza();
        zzd();
        super.onSessionEnded();
    }
}
