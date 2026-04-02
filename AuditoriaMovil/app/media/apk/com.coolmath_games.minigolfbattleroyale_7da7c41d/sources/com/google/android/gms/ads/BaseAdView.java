package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbhl;
import com.google.android.gms.internal.ads.zzcgt;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {
    @NotOnlyInitialized
    protected final zzbhl zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, int i) {
        super(context);
        this.zza = new zzbhl(this, i);
    }

    public void destroy() {
        this.zza.zzb();
    }

    public AdListener getAdListener() {
        return this.zza.zzc();
    }

    public AdSize getAdSize() {
        return this.zza.zzd();
    }

    public String getAdUnitId() {
        return this.zza.zzf();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzv();
    }

    public ResponseInfo getResponseInfo() {
        return this.zza.zzt();
    }

    public boolean isLoading() {
        return this.zza.zzs();
    }

    public void loadAd(AdRequest adRequest) {
        this.zza.zzh(adRequest.zza());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        AdSize adSize;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzcgt.zzg("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        this.zza.zzi();
    }

    public void resume() {
        this.zza.zzk();
    }

    public void setAdListener(AdListener adListener) {
        this.zza.zzl(adListener);
        if (adListener == null) {
            this.zza.zzm(null);
            return;
        }
        if (adListener instanceof zzbcv) {
            this.zza.zzm((zzbcv) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zza.zzq((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zza.zzn(adSize);
    }

    public void setAdUnitId(String str) {
        this.zza.zzp(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.zzu(onPaidEventListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zza = new zzbhl(this, attributeSet, false, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zza = new zzbhl(this, attributeSet, false, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.zza = new zzbhl(this, attributeSet, z, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.zza = new zzbhl(this, attributeSet, z);
    }
}
