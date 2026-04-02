package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbhl;
import com.google.android.gms.internal.ads.zzcgt;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {
    @NotOnlyInitialized
    public final zzbhl zza;

    public BaseAdView(@RecentlyNonNull Context context, int i2) {
        super(context);
        this.zza = new zzbhl(this, i2);
    }

    public BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        this.zza = new zzbhl(this, attributeSet, false, i2);
    }

    public BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2);
        this.zza = new zzbhl(this, attributeSet, false, i3);
    }

    public BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2, int i3, boolean z) {
        super(context, attributeSet, i2);
        this.zza = new zzbhl(this, attributeSet, z, i3);
    }

    public BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.zza = new zzbhl(this, attributeSet, z);
    }

    public void destroy() {
        this.zza.zzb();
    }

    @RecentlyNonNull
    public AdListener getAdListener() {
        return this.zza.zzc();
    }

    @RecentlyNullable
    public AdSize getAdSize() {
        return this.zza.zzd();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.zza.zzf();
    }

    @RecentlyNullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzv();
    }

    @RecentlyNullable
    public ResponseInfo getResponseInfo() {
        return this.zza.zzt();
    }

    public boolean isLoading() {
        return this.zza.zzs();
    }

    public void loadAd(@RecentlyNonNull AdRequest adRequest) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i6 = ((i4 - i2) - measuredWidth) / 2;
        int i7 = ((i5 - i3) - measuredHeight) / 2;
        childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        AdSize adSize;
        int i4;
        int i5 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e2) {
                zzcgt.zzg("Unable to retrieve ad size.", e2);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i4 = adSize.getHeightInPixels(context);
                i5 = widthInPixels;
            } else {
                i4 = 0;
            }
        } else {
            measureChild(childAt, i2, i3);
            i5 = childAt.getMeasuredWidth();
            i4 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i5, getSuggestedMinimumWidth()), i2), View.resolveSize(Math.max(i4, getSuggestedMinimumHeight()), i3));
    }

    public void pause() {
        this.zza.zzi();
    }

    public void resume() {
        this.zza.zzk();
    }

    public void setAdListener(@RecentlyNonNull AdListener adListener) {
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

    public void setAdSize(@RecentlyNonNull AdSize adSize) {
        this.zza.zzn(adSize);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        this.zza.zzp(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.zzu(onPaidEventListener);
    }
}
