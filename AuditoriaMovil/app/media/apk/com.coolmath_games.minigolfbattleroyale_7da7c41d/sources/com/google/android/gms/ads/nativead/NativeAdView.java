package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzcgt;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {
    @NotOnlyInitialized
    private final FrameLayout zza;
    @NotOnlyInitialized
    private final zzbml zzb;

    public NativeAdView(Context context) {
        super(context);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    private final void zzd(String str, View view) {
        zzbml zzbmlVar = this.zzb;
        if (zzbmlVar != null) {
            try {
                zzbmlVar.zzb(str, ObjectWrapper.wrap(view));
            } catch (RemoteException e) {
                zzcgt.zzg("Unable to call setAssetView on delegate", e);
            }
        }
    }

    private final FrameLayout zze(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @RequiresNonNull({"overlayFrame"})
    private final zzbml zzf() {
        if (isInEditMode()) {
            return null;
        }
        return zzber.zzb().zzm(this.zza.getContext(), this, this.zza);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzbml zzbmlVar = this.zzb;
        if (zzbmlVar != null) {
            try {
                zzbmlVar.zze();
            } catch (RemoteException e) {
                zzcgt.zzg("Unable to destroy native ad view", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbml zzbmlVar;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbY)).booleanValue() && (zzbmlVar = this.zzb) != null) {
            try {
                zzbmlVar.zzbv(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException e) {
                zzcgt.zzg("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View zza = zza("3011");
        if (zza instanceof AdChoicesView) {
            return (AdChoicesView) zza;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return zza("3005");
    }

    public final View getBodyView() {
        return zza("3004");
    }

    public final View getCallToActionView() {
        return zza("3002");
    }

    public final View getHeadlineView() {
        return zza("3001");
    }

    public final View getIconView() {
        return zza("3003");
    }

    public final View getImageView() {
        return zza("3008");
    }

    public final MediaView getMediaView() {
        View zza = zza("3010");
        if (zza instanceof MediaView) {
            return (MediaView) zza;
        }
        if (zza != null) {
            zzcgt.zzd("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    public final View getPriceView() {
        return zza("3007");
    }

    public final View getStarRatingView() {
        return zza("3009");
    }

    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbml zzbmlVar = this.zzb;
        if (zzbmlVar != null) {
            try {
                zzbmlVar.zzf(ObjectWrapper.wrap(view), i);
            } catch (RemoteException e) {
                zzcgt.zzg("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zzd("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zzd("3005", view);
    }

    public final void setBodyView(View view) {
        zzd("3004", view);
    }

    public final void setCallToActionView(View view) {
        zzd("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbml zzbmlVar = this.zzb;
        if (zzbmlVar != null) {
            try {
                zzbmlVar.zzg(ObjectWrapper.wrap(view));
            } catch (RemoteException e) {
                zzcgt.zzg("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(View view) {
        zzd("3001", view);
    }

    public final void setIconView(View view) {
        zzd("3003", view);
    }

    public final void setImageView(View view) {
        zzd("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        zzd("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzbls(this) { // from class: com.google.android.gms.ads.nativead.zzb
            private final NativeAdView zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbls
            public final void zza(MediaContent mediaContent) {
                this.zza.zzc(mediaContent);
            }
        });
        mediaView.zzb(new zzblu(this) { // from class: com.google.android.gms.ads.nativead.zzc
            private final NativeAdView zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzblu
            public final void zza(ImageView.ScaleType scaleType) {
                this.zza.zzb(scaleType);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(NativeAd nativeAd) {
        zzbml zzbmlVar = this.zzb;
        if (zzbmlVar != 0) {
            try {
                zzbmlVar.zzd(nativeAd.zza());
            } catch (RemoteException e) {
                zzcgt.zzg("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setPriceView(View view) {
        zzd("3007", view);
    }

    public final void setStarRatingView(View view) {
        zzd("3009", view);
    }

    public final void setStoreView(View view) {
        zzd("3006", view);
    }

    protected final View zza(String str) {
        zzbml zzbmlVar = this.zzb;
        if (zzbmlVar != null) {
            try {
                IObjectWrapper zzc = zzbmlVar.zzc(str);
                if (zzc != null) {
                    return (View) ObjectWrapper.unwrap(zzc);
                }
            } catch (RemoteException e) {
                zzcgt.zzg("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(ImageView.ScaleType scaleType) {
        zzbml zzbmlVar = this.zzb;
        if (zzbmlVar == null || scaleType == null) {
            return;
        }
        try {
            zzbmlVar.zzbu(ObjectWrapper.wrap(scaleType));
        } catch (RemoteException e) {
            zzcgt.zzg("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(MediaContent mediaContent) {
        zzbml zzbmlVar = this.zzb;
        if (zzbmlVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzbhw) {
                zzbmlVar.zzbw(((zzbhw) mediaContent).zza());
            } else if (mediaContent == null) {
                zzbmlVar.zzbw(null);
            } else {
                zzcgt.zzd("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzcgt.zzg("Unable to call setMediaContent on delegate", e);
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zza = zze(context);
        this.zzb = zzf();
    }
}
