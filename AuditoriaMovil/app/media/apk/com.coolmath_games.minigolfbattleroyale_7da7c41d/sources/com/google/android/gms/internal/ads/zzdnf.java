package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzdnf extends zzbmq implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdog {
    private final WeakReference<View> zza;
    private final Map<String, WeakReference<View>> zzb = new HashMap();
    private final Map<String, WeakReference<View>> zzc = new HashMap();
    private final Map<String, WeakReference<View>> zzd = new HashMap();
    private zzdmh zze;
    private zzawe zzf;

    public zzdnf(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcht.zza(view, this);
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcht.zzb(view, this);
        this.zza = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.zzb.put(key, new WeakReference<>(value));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key) && !"3011".equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.zzc.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzawe(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdmh zzdmhVar = this.zze;
        if (zzdmhVar != null) {
            zzdmhVar.zzp(view, zzbx(), zzj(), zzk(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdmh zzdmhVar = this.zze;
        if (zzdmhVar != null) {
            zzdmhVar.zzr(zzbx(), zzj(), zzk(), zzdmh.zzC(zzbx()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdmh zzdmhVar = this.zze;
        if (zzdmhVar != null) {
            zzdmhVar.zzr(zzbx(), zzj(), zzk(), zzdmh.zzC(zzbx()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdmh zzdmhVar = this.zze;
        if (zzdmhVar != null) {
            zzdmhVar.zzq(view, motionEvent, zzbx());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdmh)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdmh zzdmhVar = this.zze;
        if (zzdmhVar != null) {
            zzdmhVar.zzk(this);
        }
        zzdmh zzdmhVar2 = (zzdmh) unwrap;
        if (zzdmhVar2.zzD()) {
            this.zze = zzdmhVar2;
            zzdmhVar2.zzj(this);
            this.zze.zzH(zzbx());
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zzf("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final FrameLayout zzbt() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final View zzbx() {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final synchronized void zzc() {
        zzdmh zzdmhVar = this.zze;
        if (zzdmhVar != null) {
            zzdmhVar.zzk(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final synchronized void zzd(IObjectWrapper iObjectWrapper) {
        if (this.zze != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof View)) {
                com.google.android.gms.ads.internal.util.zze.zzi("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zze.zzu((View) unwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final zzawe zzh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized void zzi(String str, View view, boolean z) {
        this.zzd.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized Map<String, WeakReference<View>> zzj() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized Map<String, WeakReference<View>> zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized Map<String, WeakReference<View>> zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized View zzm(String str) {
        WeakReference<View> weakReference = this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized String zzn() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized IObjectWrapper zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized JSONObject zzp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized JSONObject zzq() {
        zzdmh zzdmhVar = this.zze;
        if (zzdmhVar != null) {
            return zzdmhVar.zzt(zzbx(), zzj(), zzk());
        }
        return null;
    }
}
