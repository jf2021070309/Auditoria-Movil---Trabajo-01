package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzchg;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdyc;
import com.google.android.gms.internal.ads.zzfsn;
import e.a.d.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class zzav {
    private final Context zza;
    private final zzdyc zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzav(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzaf
            private final zzav zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzr();
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzq().zza();
        this.zzk = com.google.android.gms.ads.internal.zzt.zzq().zzb();
        this.zzb = com.google.android.gms.ads.internal.zzt.zzm().zzb();
    }

    public zzav(Context context, String str) {
        this(context);
        this.zzc = str;
    }

    private final boolean zzs(float f2, float f3, float f4, float f5) {
        return Math.abs(this.zzi.x - f2) < ((float) this.zzh) && Math.abs(this.zzi.y - f3) < ((float) this.zzh) && Math.abs(this.zzj.x - f4) < ((float) this.zzh) && Math.abs(this.zzj.y - f5) < ((float) this.zzh);
    }

    private final void zzt(Context context) {
        ArrayList arrayList = new ArrayList();
        int zzu = zzu(arrayList, "None", true);
        final int zzu2 = zzu(arrayList, "Shake", true);
        final int zzu3 = zzu(arrayList, "Flick", true);
        zzdxy zzdxyVar = zzdxy.NONE;
        int ordinal = this.zzb.zzf().ordinal();
        final int i2 = ordinal != 1 ? ordinal != 2 ? zzu : zzu3 : zzu2;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zze().zzm());
        final AtomicInteger atomicInteger = new AtomicInteger(i2);
        builder.setTitle("Setup gesture");
        builder.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i2, new DialogInterface.OnClickListener(atomicInteger) { // from class: com.google.android.gms.ads.internal.util.zzan
            private final AtomicInteger zza;

            {
                this.zza = atomicInteger;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.zza.set(i3);
            }
        });
        builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener(this) { // from class: com.google.android.gms.ads.internal.util.zzao
            private final zzav zza;

            {
                this.zza = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.zza.zzb();
            }
        });
        builder.setPositiveButton("Save", new DialogInterface.OnClickListener(this, atomicInteger, i2, zzu2, zzu3) { // from class: com.google.android.gms.ads.internal.util.zzap
            private final zzav zza;
            private final AtomicInteger zzb;
            private final int zzc;
            private final int zzd;
            private final int zze;

            {
                this.zza = this;
                this.zzb = atomicInteger;
                this.zzc = i2;
                this.zzd = zzu2;
                this.zze = zzu3;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.zza.zzp(this.zzb, this.zzc, this.zzd, this.zze, dialogInterface, i3);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: com.google.android.gms.ads.internal.util.zzaq
            private final zzav zza;

            {
                this.zza = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzb();
            }
        });
        builder.create().show();
    }

    private static final int zzu(List<String> list, String str, boolean z) {
        if (z) {
            list.add(str);
            return list.size() - 1;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder v = a.v(100, "{Dialog: ");
        v.append(this.zzc);
        v.append(",DebugSignal: ");
        v.append(this.zzf);
        v.append(",AFMA Version: ");
        v.append(this.zze);
        v.append(",Ad Unit ID: ");
        return a.r(v, this.zzd, "}");
    }

    public final void zza(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i2 = this.zzg;
        if (i2 == -1) {
            return;
        }
        if (i2 == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((Long) zzbet.zzc().zzc(zzbjl.zzdc)).longValue());
            }
        } else if (i2 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i3 = 0; i3 < historySize; i3++) {
                    z |= !zzs(motionEvent.getHistoricalX(0, i3), motionEvent.getHistoricalY(0, i3), motionEvent.getHistoricalX(1, i3), motionEvent.getHistoricalY(1, i3));
                }
                if (zzs(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzb() {
        try {
            if (!(this.zza instanceof Activity)) {
                zzcgt.zzh("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzm().zzi())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzm().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int zzu = zzu(arrayList, "Ad information", true);
            final int zzu2 = zzu(arrayList, str, true);
            final int zzu3 = zzu(arrayList, str2, true);
            boolean booleanValue = ((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue();
            final int zzu4 = zzu(arrayList, "Open ad inspector", booleanValue);
            final int zzu5 = zzu(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zza, com.google.android.gms.ads.internal.zzt.zze().zzm());
            builder.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, zzu, zzu2, zzu3, zzu4, zzu5) { // from class: com.google.android.gms.ads.internal.util.zzam
                private final zzav zza;
                private final int zzb;
                private final int zzc;
                private final int zzd;
                private final int zze;
                private final int zzf;

                {
                    this.zza = this;
                    this.zzb = zzu;
                    this.zzc = zzu2;
                    this.zzd = zzu3;
                    this.zze = zzu4;
                    this.zzf = zzu5;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dialogInterface, i2);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e2) {
            zze.zzb("", e2);
        }
    }

    public final void zzc(String str) {
        this.zzd = str;
    }

    public final void zzd(String str) {
        this.zze = str;
    }

    public final void zze(String str) {
        this.zzc = str;
    }

    public final void zzf(String str) {
        this.zzf = str;
    }

    public final /* synthetic */ void zzg() {
        zzaz zzm = com.google.android.gms.ads.internal.zzt.zzm();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zzm2 = zzm.zzm();
        zzm.zzl(zzm.zze(context, str, str2));
        if (!zzm.zzm()) {
            zzm.zzf(context, str, str2);
            return;
        }
        if (!zzm2 && !TextUtils.isEmpty(str3)) {
            zzm.zzh(context, str2, str3, str);
        }
        zzcgt.zzd("Device is linked for debug signals.");
        zzm.zzn(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public final /* synthetic */ void zzh() {
        zzaz zzm = com.google.android.gms.ads.internal.zzt.zzm();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzm.zzd(context, str, str2)) {
            zzm.zzn(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(zzm.zza)) {
            zzcgt.zzd("Creative is not pushed for this device.");
            zzm.zzn(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzm.zza)) {
            zzcgt.zzd("The app is not linked for creative preview.");
            zzm.zzf(context, str, str2);
        } else if ("0".equals(zzm.zza)) {
            zzcgt.zzd("Device is linked for in app preview.");
            zzm.zzn(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final /* synthetic */ void zzi(zzfsn zzfsnVar) {
        if (com.google.android.gms.ads.internal.zzt.zzm().zze(this.zza, this.zzd, this.zze)) {
            zzfsnVar.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzak
                private final zzav zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzm().zzf(this.zza, this.zzd, this.zze);
        }
    }

    public final /* synthetic */ void zzj() {
        zzt(this.zza);
    }

    public final /* synthetic */ void zzk() {
        zzt(this.zza);
    }

    public final /* synthetic */ void zzl(zzfsn zzfsnVar) {
        if (com.google.android.gms.ads.internal.zzt.zzm().zze(this.zza, this.zzd, this.zze)) {
            zzfsnVar.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzal
                private final zzav zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzm().zzf(this.zza, this.zzd, this.zze);
        }
    }

    public final /* synthetic */ void zzm() {
        com.google.android.gms.ads.internal.zzt.zzm().zzc(this.zza);
    }

    public final /* synthetic */ void zzn() {
        com.google.android.gms.ads.internal.zzt.zzm().zzc(this.zza);
    }

    public final /* synthetic */ void zzo(String str, DialogInterface dialogInterface, int i2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzP(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void zzp(AtomicInteger atomicInteger, int i2, int i3, int i4, DialogInterface dialogInterface, int i5) {
        if (atomicInteger.get() != i2) {
            if (atomicInteger.get() == i3) {
                this.zzb.zze(zzdxy.SHAKE);
            } else if (atomicInteger.get() == i4) {
                this.zzb.zze(zzdxy.FLICK);
            } else {
                this.zzb.zze(zzdxy.NONE);
            }
        }
        zzb();
    }

    public final /* synthetic */ void zzq(int i2, int i3, int i4, int i5, int i6, DialogInterface dialogInterface, int i7) {
        if (i7 != i2) {
            if (i7 == i3) {
                zzcgt.zzd("Debug mode [Creative Preview] selected.");
                zzchg.zza.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzai
                    private final zzav zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzh();
                    }
                });
            } else if (i7 == i4) {
                zzcgt.zzd("Debug mode [Troubleshooting] selected.");
                zzchg.zza.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzaj
                    private final zzav zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzg();
                    }
                });
            } else if (i7 == i5) {
                final zzfsn zzfsnVar = zzchg.zze;
                zzfsn zzfsnVar2 = zzchg.zza;
                if (this.zzb.zzn()) {
                    zzfsnVar.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzat
                        private final zzav zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzn();
                        }
                    });
                } else {
                    zzfsnVar2.execute(new Runnable(this, zzfsnVar) { // from class: com.google.android.gms.ads.internal.util.zzau
                        private final zzav zza;
                        private final zzfsn zzb;

                        {
                            this.zza = this;
                            this.zzb = zzfsnVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzl(this.zzb);
                        }
                    });
                }
            } else if (i7 == i6) {
                final zzfsn zzfsnVar3 = zzchg.zze;
                zzfsn zzfsnVar4 = zzchg.zza;
                if (this.zzb.zzn()) {
                    zzfsnVar3.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzag
                        private final zzav zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzk();
                        }
                    });
                } else {
                    zzfsnVar4.execute(new Runnable(this, zzfsnVar3) { // from class: com.google.android.gms.ads.internal.util.zzah
                        private final zzav zza;
                        private final zzfsn zzb;

                        {
                            this.zza = this;
                            this.zzb = zzfsnVar3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzi(this.zzb);
                        }
                    });
                }
            }
        } else if (!(this.zza instanceof Activity)) {
            zzcgt.zzh("Can not create dialog without Activity Context");
        } else {
            String str = this.zzc;
            final String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                com.google.android.gms.ads.internal.zzt.zzc();
                Map<String, String> zzR = zzs.zzR(build);
                for (String str3 : zzR.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append(zzR.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zza);
            builder.setMessage(str2);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new DialogInterface.OnClickListener(this, str2) { // from class: com.google.android.gms.ads.internal.util.zzar
                private final zzav zza;
                private final String zzb;

                {
                    this.zza = this;
                    this.zzb = str2;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i8) {
                    this.zza.zzo(this.zzb, dialogInterface2, i8);
                }
            });
            builder.setNegativeButton("Close", zzas.zza);
            builder.create().show();
        }
    }

    public final /* synthetic */ void zzr() {
        this.zzg = 4;
        zzb();
    }
}
