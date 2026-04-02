package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
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
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzdnh extends zzbmk implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdog {
    public static final zzfoj<String> zza = zzfoj.zzl("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzfsn zzf;
    private View zzg;
    @GuardedBy("this")
    private zzdmh zzi;
    private zzawe zzj;
    private zzbme zzl;
    private boolean zzm;
    @GuardedBy("this")
    private Map<String, WeakReference<View>> zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = 213806000;

    public zzdnh(FrameLayout frameLayout, FrameLayout frameLayout2, int i2) {
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcht.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcht.zzb(frameLayout, this);
        this.zzf = zzchg.zze;
        this.zzj = new zzawe(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzs() {
        this.zzf.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdng
            private final zzdnh zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzr();
            }
        });
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e2) {
                    zzcgt.zzj("Encountered invalid base64 watermark.", e2);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdmh zzdmhVar = this.zzi;
        if (zzdmhVar != null) {
            zzdmhVar.zzw();
            this.zzi.zzp(view, this.zzd, zzj(), zzk(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdmh zzdmhVar = this.zzi;
        if (zzdmhVar != null) {
            zzdmhVar.zzr(this.zzd, zzj(), zzk(), zzdmh.zzC(this.zzd));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdmh zzdmhVar = this.zzi;
        if (zzdmhVar != null) {
            zzdmhVar.zzr(this.zzd, zzj(), zzk(), zzdmh.zzC(this.zzd));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdmh zzdmhVar = this.zzi;
        if (zzdmhVar != null) {
            zzdmhVar.zzq(view, motionEvent, this.zzd);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zzi(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final FrameLayout zzbt() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final synchronized void zzbu(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final void zzbv(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final synchronized void zzbw(zzbme zzbmeVar) {
        if (this.zzn) {
            return;
        }
        this.zzm = true;
        this.zzl = zzbmeVar;
        zzdmh zzdmhVar = this.zzi;
        if (zzdmhVar != null) {
            zzdmhVar.zzJ().zzb(zzbmeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final /* bridge */ /* synthetic */ View zzbx() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final synchronized IObjectWrapper zzc(String str) {
        return ObjectWrapper.wrap(zzm(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final synchronized void zzd(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdmh)) {
            zzcgt.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdmh zzdmhVar = this.zzi;
        if (zzdmhVar != null) {
            zzdmhVar.zzk(this);
        }
        zzs();
        zzdmh zzdmhVar2 = (zzdmh) unwrap;
        this.zzi = zzdmhVar2;
        zzdmhVar2.zzj(this);
        this.zzi.zzH(this.zzd);
        this.zzi.zzI(this.zze);
        if (this.zzm) {
            this.zzi.zzJ().zzb(this.zzl);
        }
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcr)).booleanValue() || TextUtils.isEmpty(this.zzi.zzE())) {
            return;
        }
        zzt(this.zzi.zzE());
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final synchronized void zze() {
        if (this.zzn) {
            return;
        }
        zzdmh zzdmhVar = this.zzi;
        if (zzdmhVar != null) {
            zzdmhVar.zzk(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) {
        this.zzi.zzu((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final zzawe zzh() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized void zzi(String str, View view, boolean z) {
        if (this.zzn) {
            return;
        }
        if (view == null) {
            this.zzc.remove(str);
            return;
        }
        this.zzc.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (com.google.android.gms.ads.internal.util.zzca.zza(this.zzh)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized Map<String, WeakReference<View>> zzj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized Map<String, WeakReference<View>> zzk() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized Map<String, WeakReference<View>> zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized View zzm(String str) {
        if (this.zzn) {
            return null;
        }
        WeakReference<View> weakReference = this.zzc.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized String zzn() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final IObjectWrapper zzo() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized JSONObject zzp() {
        zzdmh zzdmhVar = this.zzi;
        if (zzdmhVar != null) {
            return zzdmhVar.zzs(this.zzd, zzj(), zzk());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdog
    public final synchronized JSONObject zzq() {
        zzdmh zzdmhVar = this.zzi;
        if (zzdmhVar != null) {
            return zzdmhVar.zzt(this.zzd, zzj(), zzk());
        }
        return null;
    }

    public final /* synthetic */ void zzr() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
