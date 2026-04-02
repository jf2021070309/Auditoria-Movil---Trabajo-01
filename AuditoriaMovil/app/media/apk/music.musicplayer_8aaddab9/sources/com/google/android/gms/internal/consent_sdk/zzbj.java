package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbj implements zzi {
    private final Application zza;
    private final zzbh zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzaj zzf;
    private final zzat zzg;

    public zzbj(Application application, zzbh zzbhVar, Handler handler, Executor executor, zze zzeVar, zzaj zzajVar, zzat zzatVar) {
        this.zza = application;
        this.zzb = zzbhVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzajVar;
        this.zzg = zzatVar;
    }

    private static JSONObject zza(Context context) {
        String concat;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
            if (applicationIcon == null) {
                concat = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                concat = valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
            }
            jSONObject.put("app_icon", concat);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzi
    public final Executor zza() {
        Handler handler = this.zzc;
        handler.getClass();
        return zzbm.zza(handler);
    }

    public final void zza(int i2, String str, String str2) {
        this.zzg.zza(new zzk(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i2), str2, str)));
    }

    public final void zza(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Receive consent action: ".concat(valueOf);
        } else {
            new String("Receive consent action: ");
        }
        Uri parse = Uri.parse(str);
        this.zze.zza(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.zzf);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.consent_sdk.zzi
    public final boolean zza(String str, JSONObject jSONObject) {
        char c2;
        str.hashCode();
        char c3 = 65535;
        int i2 = 2;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                this.zzg.zzb();
                return true;
            case 1:
                this.zzd.execute(new Runnable(this) { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                    private final zzbj zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                });
                return true;
            case 2:
                String optString = jSONObject.optString(ImagesContract.URL);
                TextUtils.isEmpty(optString);
                Uri parse = Uri.parse(optString);
                if (parse.getScheme() == null) {
                    String valueOf = String.valueOf(optString);
                    if (valueOf.length() != 0) {
                        "Action[browser]: empty scheme: ".concat(valueOf);
                    } else {
                        new String("Action[browser]: empty scheme: ");
                    }
                }
                try {
                    this.zzb.startActivity(new Intent("android.intent.action.VIEW", parse));
                } catch (ActivityNotFoundException e2) {
                    String valueOf2 = String.valueOf(optString);
                    zzca.zza(valueOf2.length() != 0 ? "Action[browser]: can not open url: ".concat(valueOf2) : new String("Action[browser]: can not open url: "), e2);
                }
                return true;
            case 3:
                String optString2 = jSONObject.optString("status");
                optString2.hashCode();
                switch (optString2.hashCode()) {
                    case -954325659:
                        if (optString2.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case -258041904:
                        if (optString2.equals("personalized")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case 429411856:
                        if (optString2.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case 467888915:
                        if (optString2.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 1666911234:
                        if (optString2.equals("non_personalized")) {
                            c3 = 4;
                            break;
                        }
                        break;
                }
                switch (c3) {
                    case 0:
                    case 4:
                        i2 = 1;
                        this.zzg.zza(3, i2);
                        break;
                    case 1:
                    case 3:
                        this.zzg.zza(3, i2);
                        break;
                    case 2:
                        i2 = 0;
                        this.zzg.zza(3, i2);
                        break;
                    default:
                        this.zzg.zzb(new zzk(1, "We are getting something wrong with the webview."));
                        break;
                }
                return true;
            default:
                return false;
        }
    }

    public final /* synthetic */ void zzb() {
        this.zzg.zza().zza("UMP_configureFormWithAppAssets", zza(this.zza));
    }
}
