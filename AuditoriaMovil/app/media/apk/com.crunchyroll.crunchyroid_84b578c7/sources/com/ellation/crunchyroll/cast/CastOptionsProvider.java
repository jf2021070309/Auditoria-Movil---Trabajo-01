package com.ellation.crunchyroll.cast;

import android.annotation.SuppressLint;
import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.expanded.CastControllerActivity;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.images.WebImage;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CastOptionsProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastOptionsProvider;", "Lcom/google/android/gms/cast/framework/OptionsProvider;", "()V", "getAdditionalSessionProviders", "", "context", "Landroid/content/Context;", "getCastOptions", "Lcom/google/android/gms/cast/framework/CastOptions;", "CustomImagePicker", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CastOptionsProvider implements OptionsProvider {

    /* compiled from: CastOptionsProvider.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastOptionsProvider$CustomImagePicker;", "Lcom/google/android/gms/cast/framework/media/ImagePicker;", "()V", "onPickImage", "Lcom/google/android/gms/common/images/WebImage;", "mediaMetadata", "Lcom/google/android/gms/cast/MediaMetadata;", "hints", "Lcom/google/android/gms/cast/framework/media/ImageHints;", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class CustomImagePicker extends ImagePicker {
        @Override // com.google.android.gms.cast.framework.media.ImagePicker
        public WebImage onPickImage(MediaMetadata mediaMetadata, ImageHints imageHints) {
            List<WebImage> images;
            j.f(imageHints, "hints");
            int widthInPixels = imageHints.getWidthInPixels();
            int heightInPixels = imageHints.getHeightInPixels();
            Object obj = null;
            if (mediaMetadata == null || (images = mediaMetadata.getImages()) == null) {
                return null;
            }
            Iterator<T> it = images.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    WebImage webImage = (WebImage) obj;
                    int abs = Math.abs(((widthInPixels - webImage.getWidth()) + heightInPixels) - webImage.getHeight());
                    do {
                        Object next = it.next();
                        WebImage webImage2 = (WebImage) next;
                        int abs2 = Math.abs(((widthInPixels - webImage2.getWidth()) + heightInPixels) - webImage2.getHeight());
                        if (abs > abs2) {
                            obj = next;
                            abs = abs2;
                        }
                    } while (it.hasNext());
                }
            }
            return (WebImage) obj;
        }
    }

    public Void getAdditionalSessionProviders(Context context) {
        j.f(context, "context");
        return null;
    }

    @Override // com.google.android.gms.cast.framework.OptionsProvider
    @SuppressLint({"VisibleForTests"})
    public CastOptions getCastOptions(Context context) {
        j.f(context, "context");
        NotificationOptions.Builder builder = new NotificationOptions.Builder();
        String canonicalName = CastControllerActivity.class.getCanonicalName();
        j.c(canonicalName);
        NotificationOptions build = builder.setTargetActivityClassName(canonicalName).build();
        j.e(build, "Builder()\n            .s…e!!)\n            .build()");
        CastMediaOptions.Builder builder2 = new CastMediaOptions.Builder();
        String canonicalName2 = CastControllerActivity.class.getCanonicalName();
        j.c(canonicalName2);
        CastMediaOptions build2 = builder2.setExpandedControllerActivityClassName(canonicalName2).setNotificationOptions(build).setImagePicker(new CustomImagePicker()).build();
        j.e(build2, "Builder()\n            .s…r())\n            .build()");
        CastOptions build3 = new CastOptions.Builder().setReceiverApplicationId(CastFeature.Companion.getDependencies$cast_release().getCastId()).setStopReceiverApplicationWhenEndingSession(false).setCastMediaOptions(build2).setEnableReconnectionService(true).setResumeSavedSession(true).build();
        j.e(build3, "Builder()\n            .s…rue)\n            .build()");
        return build3;
    }

    @Override // com.google.android.gms.cast.framework.OptionsProvider
    /* renamed from: getAdditionalSessionProviders  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ List mo27getAdditionalSessionProviders(Context context) {
        return (List) getAdditionalSessionProviders(context);
    }
}
