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
import android.util.Log;
import com.facebook.internal.NativeProtocol;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* loaded from: classes2.dex */
public final class zzbj implements zzi {
    private final Application zza;
    private final zzbh zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzaj zzf;
    private final zzat zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(Application application, zzbh zzbhVar, Handler handler, Executor executor, zze zzeVar, zzaj zzajVar, zzat zzatVar) {
        this.zza = application;
        this.zzb = zzbhVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzajVar;
        this.zzg = zzatVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, String str, String str2) {
        this.zzg.zza(new zzk(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str) {
        String valueOf = String.valueOf(str);
        Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "Receive consent action: ".concat(valueOf) : new String("Receive consent action: "));
        Uri parse = Uri.parse(str);
        this.zze.zza(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.zzf);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzi
    public final Executor zza() {
        Handler handler = this.zzc;
        handler.getClass();
        return zzbm.zza(handler);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.consent_sdk.zzi
    public final boolean zza(String str, JSONObject jSONObject) {
        boolean z;
        char c = 65535;
        int i = 0;
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
        if (!z) {
            this.zzg.zzb();
            return true;
        } else if (!z) {
            if (!z) {
                if (!z) {
                    return false;
                }
                this.zzd.execute(new Runnable(this) { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                    private final zzbj zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                });
                return true;
            }
            String optString = jSONObject.optString("url");
            if (TextUtils.isEmpty(optString)) {
                Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
            }
            Uri parse = Uri.parse(optString);
            if (parse.getScheme() == null) {
                String valueOf = String.valueOf(optString);
                Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "Action[browser]: empty scheme: ".concat(valueOf) : new String("Action[browser]: empty scheme: "));
            }
            try {
                this.zzb.startActivity(new Intent("android.intent.action.VIEW", parse));
            } catch (ActivityNotFoundException e) {
                String valueOf2 = String.valueOf(optString);
                zzca.zza(valueOf2.length() != 0 ? "Action[browser]: can not open url: ".concat(valueOf2) : new String("Action[browser]: can not open url: "), e);
            }
            return true;
        } else {
            String optString2 = jSONObject.optString("status");
            switch (optString2.hashCode()) {
                case -954325659:
                    if (optString2.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                        c = 3;
                        break;
                    }
                    break;
                case -258041904:
                    if (optString2.equals("personalized")) {
                        c = 0;
                        break;
                    }
                    break;
                case 429411856:
                    if (optString2.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                        c = 4;
                        break;
                    }
                    break;
                case 467888915:
                    if (optString2.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1666911234:
                    if (optString2.equals("non_personalized")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0 || c == 1) {
                i = 2;
            } else if (c == 2 || c == 3) {
                i = 1;
            } else if (c != 4) {
                this.zzg.zzb(new zzk(1, "We are getting something wrong with the webview."));
                return true;
            }
            this.zzg.zza(3, i);
            return true;
        }
    }

    private static JSONObject zza(Context context) {
        String concat;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        this.zzg.zza().zza("UMP_configureFormWithAppAssets", zza(this.zza));
    }
}
