package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
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
public final class zzbx extends UIController {
    private final ImageView zza;
    private final ImageHints zzb;
    private final Bitmap zzc;
    private final ImagePicker zzd;
    private final com.google.android.gms.cast.framework.media.internal.zzb zze;

    public zzbx(ImageView imageView, Context context, ImageHints imageHints, int i) {
        CastMediaOptions castMediaOptions;
        com.google.android.gms.cast.framework.media.internal.zzb zzbVar = new com.google.android.gms.cast.framework.media.internal.zzb(context.getApplicationContext());
        this.zza = imageView;
        this.zzb = imageHints;
        this.zzc = BitmapFactory.decodeResource(context.getResources(), i);
        CastContext zza = CastContext.zza(context);
        ImagePicker imagePicker = null;
        if (zza != null && (castMediaOptions = zza.getCastOptions().getCastMediaOptions()) != null) {
            imagePicker = castMediaOptions.getImagePicker();
        }
        this.zzd = imagePicker;
        this.zze = zzbVar;
    }

    private final void zzb() {
        MediaInfo media;
        WebImage onPickImage;
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            MediaQueueItem preloadedItem = remoteMediaClient.getPreloadedItem();
            Uri uri = null;
            if (preloadedItem != null && (media = preloadedItem.getMedia()) != null) {
                ImagePicker imagePicker = this.zzd;
                MediaMetadata metadata = media.getMetadata();
                uri = (imagePicker == null || metadata == null || (onPickImage = this.zzd.onPickImage(metadata, this.zzb)) == null || onPickImage.getUrl() == null) ? MediaUtils.getImageUri(media, 0) : onPickImage.getUrl();
            }
            if (uri == null) {
                this.zza.setImageBitmap(this.zzc);
                return;
            } else {
                this.zze.zzd(uri);
                return;
            }
        }
        this.zza.setImageBitmap(this.zzc);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zzb();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        super.onSessionConnected(castSession);
        this.zze.zzc(new zzbw(this));
        this.zza.setImageBitmap(this.zzc);
        zzb();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        this.zze.zza();
        this.zza.setImageBitmap(this.zzc);
        super.onSessionEnded();
    }
}
