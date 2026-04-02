package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public final class zzbm implements zzg {
    private final Application zza;
    private final zzbi zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzh zze;
    private final zzak zzf;
    private final zzay zzg;
    private final zzam zzh;

    public zzbm(Application application, zzbi zzbiVar, Handler handler, Executor executor, zzh zzhVar, zzak zzakVar, zzay zzayVar, zzam zzamVar) {
        this.zza = application;
        this.zzb = zzbiVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzhVar;
        this.zzf = zzakVar;
        this.zzg = zzayVar;
        this.zzh = zzamVar;
    }

    private final void zzf(c cVar) {
        String optString = cVar.optString(ImagesContract.URL);
        TextUtils.isEmpty(optString);
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            String valueOf = String.valueOf(optString);
            if (valueOf.length() != 0) {
                "Action[browser]: empty scheme: ".concat(valueOf);
            }
        }
        try {
            this.zzb.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException unused) {
            String valueOf2 = String.valueOf(optString);
            if (valueOf2.length() != 0) {
                "Action[browser]: can not open url: ".concat(valueOf2);
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final Executor zza() {
        final Handler handler = this.zzc;
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final boolean zzb(String str, c cVar) {
        boolean z;
        char c = 65535;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        if (z) {
            if (!z) {
                if (!z) {
                    if (!z) {
                        return false;
                    }
                    this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbm.this.zzc();
                        }
                    });
                    return true;
                }
                zzf(cVar);
                return true;
            }
            String optString = cVar.optString("status");
            switch (optString.hashCode()) {
                case -954325659:
                    if (optString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                        c = 3;
                        break;
                    }
                    break;
                case -258041904:
                    if (optString.equals("personalized")) {
                        c = 0;
                        break;
                    }
                    break;
                case 429411856:
                    if (optString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                        c = 4;
                        break;
                    }
                    break;
                case 467888915:
                    if (optString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1666911234:
                    if (optString.equals("non_personalized")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c != 0 && c != 1 && c != 2 && c != 3 && c != 4) {
                this.zzg.zzd(new zzj(1, "We are getting something wrong with the webview."));
            } else {
                this.zzg.zzc(3);
            }
            return true;
        }
        this.zzg.zze();
        return true;
    }

    public final /* synthetic */ void zzc() {
        String str;
        Application application = this.zza;
        c cVar = new c();
        try {
            cVar.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                str = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                if (valueOf.length() != 0) {
                    str = "data:image/png;base64,".concat(valueOf);
                } else {
                    str = new String("data:image/png;base64,");
                }
            }
            cVar.put("app_icon", str);
            cVar.put("stored_infos_map", (Object) this.zzh.zzb());
        } catch (b unused) {
        }
        this.zzg.zza().zzb("UMP_configureFormWithAppAssets", cVar.toString());
    }

    public final void zzd(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Receive consent action: ".concat(valueOf);
        }
        Uri parse = Uri.parse(str);
        this.zze.zzb(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.zzf);
    }

    public final void zze(int i, String str, String str2) {
        this.zzg.zzf(new zzj(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }
}
