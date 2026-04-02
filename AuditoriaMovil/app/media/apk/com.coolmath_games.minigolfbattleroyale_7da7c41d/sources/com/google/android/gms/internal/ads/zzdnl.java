package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdnl {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final zzfar zzb;
    private final zzdmr zzc;
    private final zzdmm zzd;
    private final zzdnw zze;
    private final zzdoe zzf;
    private final Executor zzg;
    private final Executor zzh;
    private final zzblv zzi;
    private final zzdmj zzj;

    public zzdnl(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfar zzfarVar, zzdmr zzdmrVar, zzdmm zzdmmVar, zzdnw zzdnwVar, zzdoe zzdoeVar, Executor executor, Executor executor2, zzdmj zzdmjVar) {
        this.zza = zzgVar;
        this.zzb = zzfarVar;
        this.zzi = zzfarVar.zzi;
        this.zzc = zzdmrVar;
        this.zzd = zzdmmVar;
        this.zze = zzdnwVar;
        this.zzf = zzdoeVar;
        this.zzg = executor;
        this.zzh = executor2;
        this.zzj = zzdmjVar;
    }

    private final boolean zzh(ViewGroup viewGroup, boolean z) {
        View zzI;
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            zzI = this.zzd.zzH();
        } else {
            zzI = this.zzd.zzI();
        }
        if (zzI == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzI.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzI.getParent()).removeView(zzI);
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzco)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzI, layoutParams);
        return true;
    }

    public final void zza(final zzdog zzdogVar) {
        this.zzg.execute(new Runnable(this, zzdogVar) { // from class: com.google.android.gms.internal.ads.zzdni
            private final zzdnl zza;
            private final zzdog zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzdogVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(this.zzb);
            }
        });
    }

    public final void zzb(zzdog zzdogVar) {
        if (zzdogVar == null || this.zze == null || zzdogVar.zzbt() == null || !this.zzc.zzb()) {
            return;
        }
        try {
            zzdogVar.zzbt().addView(this.zze.zza());
        } catch (zzcmw e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzc(zzdog zzdogVar) {
        if (zzdogVar == null) {
            return;
        }
        Context context = zzdogVar.zzbx().getContext();
        if (com.google.android.gms.ads.internal.util.zzca.zzi(context, this.zzc.zza)) {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.zze.zzd("Activity context is needed for policy validator.");
            } else if (this.zzf == null || zzdogVar.zzbt() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.zzf.zza(zzdogVar.zzbt(), windowManager), com.google.android.gms.ads.internal.util.zzca.zzj());
                } catch (zzcmw e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
                }
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzh(viewGroup, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.zzd.zzH() != null) {
            if (this.zzd.zzv() == 2 || this.zzd.zzv() == 1) {
                this.zza.zzw(this.zzb.zzf, String.valueOf(this.zzd.zzv()), z);
            } else if (this.zzd.zzv() == 6) {
                this.zza.zzw(this.zzb.zzf, "2", z);
                this.zza.zzw(this.zzb.zzf, "1", z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzdog zzdogVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbme zza;
        Drawable drawable;
        if (this.zzc.zze() || this.zzc.zzc()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzm = zzdogVar.zzm(strArr[i]);
                if (zzm != null && (zzm instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzm;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdogVar.zzbx().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.zzd.zzy() != null) {
            view = this.zzd.zzy();
            zzblv zzblvVar = this.zzi;
            if (zzblvVar != null && viewGroup == null) {
                zzg(layoutParams, zzblvVar.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (this.zzd.zzx() instanceof zzblo) {
            zzblo zzbloVar = (zzblo) this.zzd.zzx();
            if (viewGroup == null) {
                zzg(layoutParams, zzbloVar.zzi());
            }
            View zzblpVar = new zzblp(context, zzbloVar, layoutParams);
            zzblpVar.setContentDescription((CharSequence) zzbet.zzc().zzc(zzbjl.zzcm));
            view = zzblpVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdogVar.zzbx().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzbt = zzdogVar.zzbt();
                if (zzbt != null) {
                    zzbt.addView(zzaVar);
                }
            }
            zzdogVar.zzi(zzdogVar.zzn(), view, true);
        }
        zzfoj<String> zzfojVar = zzdnh.zza;
        int size = zzfojVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzm2 = zzdogVar.zzm(zzfojVar.get(i2));
            i2++;
            if (zzm2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzm2;
                break;
            }
        }
        this.zzh.execute(new Runnable(this, viewGroup2) { // from class: com.google.android.gms.internal.ads.zzdnj
            private final zzdnl zza;
            private final ViewGroup zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = viewGroup2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze(this.zzb);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzh(viewGroup2, true)) {
            if (this.zzd.zzR() != null) {
                this.zzd.zzR().zzap(new zzdnk(zzdogVar, viewGroup2));
            }
        } else if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgO)).booleanValue() && zzh(viewGroup2, false)) {
            if (this.zzd.zzS() != null) {
                this.zzd.zzS().zzap(new zzdnk(zzdogVar, viewGroup2));
            }
        } else {
            viewGroup2.removeAllViews();
            View zzbx = zzdogVar.zzbx();
            Context context2 = zzbx != null ? zzbx.getContext() : null;
            if (context2 == null || (zza = this.zzj.zza()) == null) {
                return;
            }
            try {
                IObjectWrapper zzg = zza.zzg();
                if (zzg == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzg)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                IObjectWrapper zzo = zzdogVar != null ? zzdogVar.zzo() : null;
                if (zzo != null) {
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzew)).booleanValue()) {
                        imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzo));
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.zze.zzi("Could not get main image drawable");
            }
        }
    }

    private static void zzg(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        }
    }
}
