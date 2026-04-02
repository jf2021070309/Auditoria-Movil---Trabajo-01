package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import e.a.d.a.a;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcip extends FrameLayout implements zzcih {
    private final zzcjb zza;
    private final FrameLayout zzb;
    private final View zzc;
    private final zzbka zzd;
    private final zzcjd zze;
    private final long zzf;
    private final zzcii zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcip(Context context, zzcjb zzcjbVar, int i2, boolean z, zzbka zzbkaVar, zzcja zzcjaVar) {
        super(context);
        zzcii zzcjsVar;
        this.zza = zzcjbVar;
        this.zzd = zzbkaVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzb = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcjbVar.zzk());
        zzcij zzcijVar = zzcjbVar.zzk().zza;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            zzcjsVar = i2 == 2 ? new zzcjs(context, new zzcjc(context, zzcjbVar.zzt(), zzcjbVar.zzm(), zzbkaVar, zzcjbVar.zzi()), zzcjbVar, z, zzcij.zza(zzcjbVar), zzcjaVar) : new zzcig(context, zzcjbVar, z, zzcij.zza(zzcjbVar), zzcjaVar, new zzcjc(context, zzcjbVar.zzt(), zzcjbVar.zzm(), zzbkaVar, zzcjbVar.zzi()));
        } else {
            zzcjsVar = null;
        }
        this.zzg = zzcjsVar;
        View view = new View(context);
        this.zzc = view;
        view.setBackgroundColor(0);
        if (zzcjsVar != null) {
            frameLayout.addView(zzcjsVar, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzA)).booleanValue()) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(view);
            }
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzx)).booleanValue()) {
                zzC();
            }
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) zzbet.zzc().zzc(zzbjl.zzC)).longValue();
        boolean booleanValue = ((Boolean) zzbet.zzc().zzc(zzbjl.zzz)).booleanValue();
        this.zzk = booleanValue;
        if (zzbkaVar != null) {
            zzbkaVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zze = new zzcjd(this);
        if (zzcjsVar != null) {
            zzcjsVar.zze(this);
        }
        if (zzcjsVar == null) {
            zzf("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    private final boolean zzH() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzI(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zza.zze("onVideoEvent", hashMap);
    }

    private final void zzJ() {
        if (this.zza.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zza.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zze.zza();
            zzcii zzciiVar = this.zzg;
            if (zzciiVar != null) {
                zzchg.zze.execute(zzcik.zza(zzciiVar));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zze.zzb();
        } else {
            this.zze.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzcil
            private final zzcip zza;
            private final boolean zzb;

            {
                this.zza = this;
                this.zzb = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(this.zzb);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcih
    public final void onWindowVisibilityChanged(int i2) {
        boolean z;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.zze.zzb();
            z = true;
        } else {
            this.zze.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcio(this, z));
    }

    public final void zzA(int i2) {
        this.zzg.zzB(i2);
    }

    @TargetApi(14)
    public final void zzB(MotionEvent motionEvent) {
        zzcii zzciiVar = this.zzg;
        if (zzciiVar == null) {
            return;
        }
        zzciiVar.dispatchTouchEvent(motionEvent);
    }

    @TargetApi(14)
    public final void zzC() {
        zzcii zzciiVar = this.zzg;
        if (zzciiVar == null) {
            return;
        }
        TextView textView = new TextView(zzciiVar.getContext());
        String valueOf = String.valueOf(this.zzg.zzd());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzb.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzb.bringChildToFront(textView);
    }

    public final void zzD() {
        this.zze.zza();
        zzcii zzciiVar = this.zzg;
        if (zzciiVar != null) {
            zzciiVar.zzg();
        }
        zzJ();
    }

    public final void zzE() {
        zzcii zzciiVar = this.zzg;
        if (zzciiVar == null) {
            return;
        }
        long zzk = zzciiVar.zzk();
        if (this.zzl == zzk || zzk <= 0) {
            return;
        }
        float f2 = ((float) zzk) / 1000.0f;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue()) {
            zzI("timeupdate", "time", String.valueOf(f2), "totalBytes", String.valueOf(this.zzg.zzr()), "qoeCachedBytes", String.valueOf(this.zzg.zzq()), "qoeLoadedBytes", String.valueOf(this.zzg.zzp()), "droppedFrames", String.valueOf(this.zzg.zzs()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f2));
        }
        this.zzl = zzk;
    }

    public final /* synthetic */ void zzG(boolean z) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.zzcih
    public final void zza() {
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcim(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcih
    public final void zzb() {
        zzcii zzciiVar = this.zzg;
        if (zzciiVar != null && this.zzm == 0) {
            zzI("canplaythrough", "duration", String.valueOf(zzciiVar.zzj() / 1000.0f), "videoWidth", String.valueOf(this.zzg.zzn()), "videoHeight", String.valueOf(this.zzg.zzo()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcih
    public final void zzc() {
        if (this.zza.zzj() != null && !this.zzi) {
            boolean z = (this.zza.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zza.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcih
    public final void zzd() {
        zzI("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcih
    public final void zze() {
        zzI("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcih
    public final void zzf(String str, String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcih
    public final void zzg(String str, String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcih
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzH()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzb.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzb.bringChildToFront(this.zzq);
        }
        this.zze.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcin(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcih
    public final void zzi() {
        if (this.zzh && zzH()) {
            this.zzb.removeView(this.zzq);
        }
        if (this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Spinner frame grab took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (elapsedRealtime2 > this.zzf) {
            zzcgt.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbka zzbkaVar = this.zzd;
            if (zzbkaVar != null) {
                zzbkaVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcih
    public final void zzj(int i2, int i3) {
        if (this.zzk) {
            zzbjd<Integer> zzbjdVar = zzbjl.zzB;
            int max = Math.max(i2 / ((Integer) zzbet.zzc().zzc(zzbjdVar)).intValue(), 1);
            int max2 = Math.max(i3 / ((Integer) zzbet.zzc().zzc(zzbjdVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcih
    public final void zzk() {
        this.zzc.setVisibility(4);
    }

    public final void zzl(int i2) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzA)).booleanValue()) {
            this.zzb.setBackgroundColor(i2);
            this.zzc.setBackgroundColor(i2);
        }
    }

    public final void zzm(int i2, int i3, int i4, int i5) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder w = a.w(75, "Set video bounds to x:", i2, ";y:", i3);
            w.append(";w:");
            w.append(i4);
            w.append(";h:");
            w.append(i5);
            com.google.android.gms.ads.internal.util.zze.zza(w.toString());
        }
        if (i4 == 0 || i5 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.setMargins(i2, i3, 0, 0);
        this.zzb.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzn(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzo(float f2, float f3) {
        zzcii zzciiVar = this.zzg;
        if (zzciiVar != null) {
            zzciiVar.zzm(f2, f3);
        }
    }

    public final void zzp() {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            this.zzg.zzw(this.zzn, this.zzo);
        }
    }

    public final void zzq() {
        zzcii zzciiVar = this.zzg;
        if (zzciiVar == null) {
            return;
        }
        zzciiVar.zzi();
    }

    public final void zzr() {
        zzcii zzciiVar = this.zzg;
        if (zzciiVar == null) {
            return;
        }
        zzciiVar.zzh();
    }

    public final void zzs(int i2) {
        zzcii zzciiVar = this.zzg;
        if (zzciiVar == null) {
            return;
        }
        zzciiVar.zzl(i2);
    }

    public final void zzt() {
        zzcii zzciiVar = this.zzg;
        if (zzciiVar == null) {
            return;
        }
        zzciiVar.zzb.zza(true);
        zzciiVar.zzt();
    }

    public final void zzu() {
        zzcii zzciiVar = this.zzg;
        if (zzciiVar == null) {
            return;
        }
        zzciiVar.zzb.zza(false);
        zzciiVar.zzt();
    }

    public final void zzv(float f2) {
        zzcii zzciiVar = this.zzg;
        if (zzciiVar == null) {
            return;
        }
        zzciiVar.zzb.zzb(f2);
        zzciiVar.zzt();
    }

    public final void zzw(int i2) {
        this.zzg.zzx(i2);
    }

    public final void zzx(int i2) {
        this.zzg.zzy(i2);
    }

    public final void zzy(int i2) {
        this.zzg.zzz(i2);
    }

    public final void zzz(int i2) {
        this.zzg.zzA(i2);
    }
}
