package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzazb;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbor;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbzp;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzcml;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzcnx;
import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzcob;
import com.google.android.gms.internal.ads.zzedy;
import com.google.android.gms.internal.ads.zzfla;
import java.util.Collections;
/* loaded from: classes.dex */
public class zzl extends zzbzp implements zzz {
    @VisibleForTesting
    public static final int zza = Color.argb(0, 0, 0, 0);
    public final Activity zzb;
    @VisibleForTesting
    public AdOverlayInfoParcel zzc;
    @VisibleForTesting
    public zzcml zzd;
    @VisibleForTesting
    public zzh zze;
    @VisibleForTesting
    public zzq zzf;
    @VisibleForTesting
    public FrameLayout zzh;
    @VisibleForTesting
    public WebChromeClient.CustomViewCallback zzi;
    @VisibleForTesting
    public zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    @VisibleForTesting
    public boolean zzg = false;
    @VisibleForTesting
    public boolean zzj = false;
    @VisibleForTesting
    public boolean zzk = false;
    @VisibleForTesting
    public boolean zzm = false;
    @VisibleForTesting
    public int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzG(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zzo = com.google.android.gms.ads.internal.zzt.zze().zzo(this.zzb, configuration);
        if ((!this.zzk || z3) && !zzo) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzaM)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z ? z2 ? 5894 : 5380 : 256);
        } else if (!z) {
            window.addFlags(ThrowableProxyConverter.BUILDER_CAPACITY);
            window.clearFlags(1024);
        } else {
            window.addFlags(1024);
            window.clearFlags(ThrowableProxyConverter.BUILDER_CAPACITY);
            if (z2) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        }
    }

    private static final void zzH(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzr().zzh(iObjectWrapper, view);
    }

    @VisibleForTesting
    public final void zzA() {
        zzcml zzcmlVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcml zzcmlVar2 = this.zzd;
        if (zzcmlVar2 != null) {
            this.zzl.removeView(zzcmlVar2.zzH());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzai(zzhVar.zzd);
                this.zzd.zzag(false);
                ViewGroup viewGroup = this.zze.zzc;
                View zzH = this.zzd.zzH();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(zzH, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzai(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbs(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcmlVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzH(zzcmlVar.zzV(), this.zzc.zzd.zzH());
    }

    public final void zzB() {
        if (this.zzm) {
            this.zzm = false;
            zzC();
        }
    }

    public final void zzC() {
        this.zzd.zzK();
    }

    public final void zzD() {
        this.zzl.zzb = true;
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzq = true;
            Runnable runnable = this.zzp;
            if (runnable != null) {
                zzfla zzflaVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzflaVar.removeCallbacks(runnable);
                zzflaVar.post(this.zzp);
            }
        }
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzf() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzZ = this.zzd.zzZ();
        if (!zzZ) {
            this.zzd.zze("onbackblocked", Collections.emptyMap());
        }
        return zzZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: zzf -> 0x00f2, TryCatch #0 {zzf -> 0x00f2, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:46:0x0097, B:47:0x009a, B:54:0x00c9, B:56:0x00cd, B:57:0x00d4, B:58:0x00d5, B:60:0x00d9, B:62:0x00e6, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:64:0x00ea, B:65:0x00f1), top: B:69:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6 A[Catch: zzf -> 0x00f2, TryCatch #0 {zzf -> 0x00f2, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:46:0x0097, B:47:0x009a, B:54:0x00c9, B:56:0x00cd, B:57:0x00d4, B:58:0x00d5, B:60:0x00d9, B:62:0x00e6, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:64:0x00ea, B:65:0x00f1), top: B:69:0x0017 }] */
    @Override // com.google.android.gms.internal.ads.zzbzq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzh(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzh(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzj() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdl)).booleanValue()) {
            zzcml zzcmlVar = this.zzd;
            if (zzcmlVar == null || zzcmlVar.zzX()) {
                zzcgt.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzk() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbr();
        }
        zzG(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdl)).booleanValue()) {
            return;
        }
        zzcml zzcmlVar = this.zzd;
        if (zzcmlVar == null || zzcmlVar.zzX()) {
            zzcgt.zzi("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzl() {
        zzo zzoVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbq();
        }
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzdl)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzm(int i2, int i3, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzn(IObjectWrapper iObjectWrapper) {
        zzG((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzp() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdl)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzq() {
        zzcml zzcmlVar = this.zzd;
        if (zzcmlVar != null) {
            try {
                this.zzl.removeView(zzcmlVar.zzH());
            } catch (NullPointerException unused) {
            }
        }
        zzz();
    }

    public final void zzr(boolean z) {
        int intValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzdn)).intValue();
        boolean z2 = ((Boolean) zzbet.zzc().zzc(zzbjl.zzaL)).booleanValue() || z;
        zzp zzpVar = new zzp();
        zzpVar.zzd = 50;
        zzpVar.zza = true != z2 ? 0 : intValue;
        zzpVar.zzb = true != z2 ? intValue : 0;
        zzpVar.zzc = intValue;
        this.zzf = new zzq(this.zzb, zzpVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzt(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzs() {
        this.zzr = true;
    }

    public final void zzt(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzbet.zzc().zzc(zzbjl.zzaJ)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzbet.zzc().zzc(zzbjl.zzaK)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbyp(this.zzd, "useCustomClose").zzf("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzq zzqVar = this.zzf;
        if (zzqVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzqVar.zza(z3);
        }
    }

    public final void zzu(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i2) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzbet.zzc().zzc(zzbjl.zzem)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzbet.zzc().zzc(zzbjl.zzen)).intValue()) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= ((Integer) zzbet.zzc().zzc(zzbjl.zzeo)).intValue()) {
                    if (i3 <= ((Integer) zzbet.zzc().zzc(zzbjl.zzep)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i2);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzg().zzl(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    public final void zzy(boolean z) throws zzf {
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window == null) {
            throw new zzf("Invalid activity, no window available.");
        }
        zzcml zzcmlVar = this.zzc.zzd;
        zzcnz zzR = zzcmlVar != null ? zzcmlVar.zzR() : null;
        boolean z2 = zzR != null && zzR.zzd();
        this.zzm = false;
        if (z2) {
            int i2 = this.zzc.zzj;
            if (i2 == 6) {
                r4 = this.zzb.getResources().getConfiguration().orientation == 1;
                this.zzm = r4;
            } else if (i2 == 7) {
                r4 = this.zzb.getResources().getConfiguration().orientation == 2;
                this.zzm = r4;
            }
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(r4);
        zzcgt.zzd(sb.toString());
        zzw(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        zzcgt.zzd("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
            this.zzl.setBackgroundColor(zza);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
        this.zzb.setContentView(this.zzl);
        this.zzr = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                Activity activity = this.zzb;
                zzcml zzcmlVar2 = this.zzc.zzd;
                zzcob zzP = zzcmlVar2 != null ? zzcmlVar2.zzP() : null;
                zzcml zzcmlVar3 = this.zzc.zzd;
                String zzQ = zzcmlVar3 != null ? zzcmlVar3.zzQ() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                zzcgz zzcgzVar = adOverlayInfoParcel.zzm;
                zzcml zzcmlVar4 = adOverlayInfoParcel.zzd;
                zzcml zza2 = zzcmx.zza(activity, zzP, zzQ, true, z2, null, null, zzcgzVar, null, null, zzcmlVar4 != null ? zzcmlVar4.zzk() : null, zzazb.zza(), null, null);
                this.zzd = zza2;
                zzcnz zzR2 = zza2.zzR();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbor zzborVar = adOverlayInfoParcel2.zzp;
                zzbot zzbotVar = adOverlayInfoParcel2.zze;
                zzv zzvVar = adOverlayInfoParcel2.zzi;
                zzcml zzcmlVar5 = adOverlayInfoParcel2.zzd;
                zzR2.zzL(null, zzborVar, null, zzbotVar, zzvVar, true, null, zzcmlVar5 != null ? zzcmlVar5.zzR().zzc() : null, null, null, null, null, null, null, null, null);
                this.zzd.zzR().zzy(new zzcnx(this) { // from class: com.google.android.gms.ads.internal.overlay.zzd
                    private final zzl zza;

                    {
                        this.zza = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcnx
                    public final void zza(boolean z3) {
                        zzcml zzcmlVar6 = this.zza.zzd;
                        if (zzcmlVar6 != null) {
                            zzcmlVar6.zzK();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                if (adOverlayInfoParcel3.zzl != null) {
                    zzcml zzcmlVar6 = this.zzd;
                } else if (adOverlayInfoParcel3.zzh == null) {
                    throw new zzf("No URL or HTML to display in ad overlay.");
                } else {
                    zzcml zzcmlVar7 = this.zzd;
                    String str = adOverlayInfoParcel3.zzf;
                }
                zzcml zzcmlVar8 = this.zzc.zzd;
                if (zzcmlVar8 != null) {
                    zzcmlVar8.zzam(this);
                }
            } catch (Exception e2) {
                zzcgt.zzg("Error obtaining webview.", e2);
                throw new zzf("Could not obtain webview for the overlay.");
            }
        } else {
            zzcml zzcmlVar9 = this.zzc.zzd;
            this.zzd = zzcmlVar9;
            zzcmlVar9.zzai(this.zzb);
        }
        this.zzd.zzae(this);
        zzcml zzcmlVar10 = this.zzc.zzd;
        if (zzcmlVar10 != null) {
            zzH(zzcmlVar10.zzV(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzd.zzH());
            }
            if (this.zzk) {
                this.zzd.zzas();
            }
            this.zzl.addView(this.zzd.zzH(), -1, -1);
        }
        if (!z && !this.zzm) {
            zzC();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
        if (adOverlayInfoParcel4.zzk == 5) {
            zzedy.zzc(this.zzb, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
            return;
        }
        zzr(z2);
        if (this.zzd.zzT()) {
            zzt(z2, true);
        }
    }

    public final void zzz() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.zzb.isFinishing() || this.zzs) {
            return;
        }
        this.zzs = true;
        zzcml zzcmlVar = this.zzd;
        if (zzcmlVar != null) {
            zzcmlVar.zzJ(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzq && this.zzd.zzaa()) {
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdj)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzd();
                    }
                    Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.ads.internal.overlay.zze
                        private final zzl zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzA();
                        }
                    };
                    this.zzp = runnable;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzbet.zzc().zzc(zzbjl.zzaI)).longValue());
                    return;
                }
            }
        }
        zzA();
    }
}
