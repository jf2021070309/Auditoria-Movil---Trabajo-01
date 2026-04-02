package com.adcolony.sdk;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.os.Vibrator;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.NativeProtocol;
import com.facebook.places.model.PlaceFields;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class o {
    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        a.a("System.open_store", new f() { // from class: com.adcolony.sdk.o.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.a(dVar);
            }
        });
        a.a("System.save_screenshot", new f() { // from class: com.adcolony.sdk.o.14
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.b(dVar);
            }
        });
        a.a("System.telephone", new f() { // from class: com.adcolony.sdk.o.15
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.c(dVar);
            }
        });
        a.a("System.sms", new f() { // from class: com.adcolony.sdk.o.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.d(dVar);
            }
        });
        a.a("System.vibrate", new f() { // from class: com.adcolony.sdk.o.3
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.e(dVar);
            }
        });
        a.a("System.open_browser", new f() { // from class: com.adcolony.sdk.o.4
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.f(dVar);
            }
        });
        a.a("System.mail", new f() { // from class: com.adcolony.sdk.o.5
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.g(dVar);
            }
        });
        a.a("System.launch_app", new f() { // from class: com.adcolony.sdk.o.6
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.h(dVar);
            }
        });
        a.a("System.create_calendar_event", new f() { // from class: com.adcolony.sdk.o.7
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.i(dVar);
            }
        });
        a.a("System.check_app_presence", new f() { // from class: com.adcolony.sdk.o.8
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.j(dVar);
            }
        });
        a.a("System.check_social_presence", new f() { // from class: com.adcolony.sdk.o.9
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.k(dVar);
            }
        });
        a.a("System.social_post", new f() { // from class: com.adcolony.sdk.o.10
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.l(dVar);
            }
        });
        a.a("System.make_in_app_purchase", new f() { // from class: com.adcolony.sdk.o.11
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.n(dVar);
            }
        });
        a.a("System.close", new f() { // from class: com.adcolony.sdk.o.12
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                o.this.m(dVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(d dVar) {
        String b = as.b(dVar.b(), "ad_session_id");
        Activity c = a.c();
        if (c == null || !(c instanceof t)) {
            return false;
        }
        JSONObject a = as.a();
        as.a(a, "id", b);
        new d("AdSession.on_request_close", ((t) c).h, a).a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(d dVar) {
        JSONObject b = dVar.b();
        ab j = a.a().j();
        String b2 = as.b(b, "ad_session_id");
        AdColonyInterstitial adColonyInterstitial = j.c().get(b2);
        u uVar = j.d().get(b2);
        if ((adColonyInterstitial == null || adColonyInterstitial.getListener() == null || adColonyInterstitial.d() == null) && (uVar == null || uVar.getListener() == null || uVar.getExpandedContainer() == null)) {
            return false;
        }
        if (uVar == null) {
            new d("AdUnit.make_in_app_purchase", adColonyInterstitial.d().b()).a();
        } else {
            new d("AdUnit.make_in_app_purchase", uVar.getExpandedContainer().b()).a();
        }
        b(as.b(b, "ad_session_id"));
        return true;
    }

    boolean a(d dVar) {
        JSONObject a = as.a();
        JSONObject b = dVar.b();
        String b2 = as.b(b, "product_id");
        if (b2.equals("")) {
            b2 = as.b(b, "handle");
        }
        if (q.a(new Intent("android.intent.action.VIEW", Uri.parse(b2)))) {
            as.a(a, "success", true);
            dVar.a(a).a();
            a(as.b(b, "ad_session_id"));
            b(as.b(b, "ad_session_id"));
            return true;
        }
        q.a("Unable to open.", 0);
        as.a(a, "success", false);
        dVar.a(a).a();
        return false;
    }

    boolean b(final d dVar) {
        if (a.d()) {
            b(as.b(dVar.b(), "ad_session_id"));
            final JSONObject a = as.a();
            String str = Environment.getExternalStorageDirectory().toString() + "/Pictures/AdColony_Screenshots/AdColony_Screenshot_" + System.currentTimeMillis() + ".jpg";
            View rootView = a.c().getWindow().getDecorView().getRootView();
            rootView.setDrawingCacheEnabled(true);
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
            rootView.setDrawingCacheEnabled(false);
            try {
                File file = new File(Environment.getExternalStorageDirectory().toString() + "/Pictures");
                File file2 = new File(Environment.getExternalStorageDirectory().toString() + "/Pictures/AdColony_Screenshots");
                file.mkdir();
                file2.mkdir();
            } catch (Exception e) {
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                MediaScannerConnection.scanFile(a.c(), new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.adcolony.sdk.o.13
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public void onScanCompleted(String str2, Uri uri) {
                        q.a("Screenshot saved to Gallery!", 0);
                        as.a(a, "success", true);
                        dVar.a(a).a();
                    }
                });
                return true;
            } catch (FileNotFoundException e2) {
                q.a("Error saving screenshot.", 0);
                as.a(a, "success", false);
                dVar.a(a).a();
                return false;
            } catch (IOException e3) {
                q.a("Error saving screenshot.", 0);
                as.a(a, "success", false);
                dVar.a(a).a();
                return false;
            }
        }
        return false;
    }

    boolean c(d dVar) {
        JSONObject a = as.a();
        JSONObject b = dVar.b();
        if (q.a(new Intent("android.intent.action.DIAL").setData(Uri.parse("tel:" + as.b(b, "phone_number"))))) {
            as.a(a, "success", true);
            dVar.a(a).a();
            a(as.b(b, "ad_session_id"));
            b(as.b(b, "ad_session_id"));
            return true;
        }
        q.a("Failed to dial number.", 0);
        as.a(a, "success", false);
        dVar.a(a).a();
        return false;
    }

    boolean d(d dVar) {
        JSONObject b = dVar.b();
        JSONObject a = as.a();
        JSONArray g = as.g(b, "recipients");
        String str = "";
        int i = 0;
        while (i < g.length()) {
            if (i != 0) {
                str = str + ";";
            }
            String str2 = str + as.c(g, i);
            i++;
            str = str2;
        }
        if (q.a(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + str)).putExtra("sms_body", as.b(b, "body")))) {
            as.a(a, "success", true);
            dVar.a(a).a();
            a(as.b(b, "ad_session_id"));
            b(as.b(b, "ad_session_id"));
            return true;
        }
        q.a("Failed to create sms.", 0);
        as.a(a, "success", false);
        dVar.a(a).a();
        return false;
    }

    boolean e(d dVar) {
        if (a.d()) {
            int a = as.a(dVar.b(), "length_ms", (int) TTAdConstant.SHOW_POLL_TIME_SPLASH_DEFAULT);
            JSONObject a2 = as.a();
            JSONArray v = a.a().k().v();
            boolean z = false;
            for (int i = 0; i < v.length(); i++) {
                if (as.c(v, i).equals("android.permission.VIBRATE")) {
                    z = true;
                }
            }
            if (!z) {
                au.e.b("No vibrate permission detected.");
                as.a(a2, "success", false);
                dVar.a(a2).a();
                return false;
            }
            try {
                ((Vibrator) a.c().getSystemService("vibrator")).vibrate(a);
                as.a(a2, "success", false);
                dVar.a(a2).a();
                return true;
            } catch (Exception e) {
                au.e.b("Vibrate command failed.");
                as.a(a2, "success", false);
                dVar.a(a2).a();
                return false;
            }
        }
        return false;
    }

    boolean f(d dVar) {
        JSONObject a = as.a();
        JSONObject b = dVar.b();
        String b2 = as.b(b, "url");
        if (b2.startsWith("browser")) {
            b2 = b2.replaceFirst("browser", "http");
        }
        if (b2.startsWith("safari")) {
            b2 = b2.replaceFirst("safari", "http");
        }
        if (q.a(new Intent("android.intent.action.VIEW", Uri.parse(b2)))) {
            as.a(a, "success", true);
            dVar.a(a).a();
            a(as.b(b, "ad_session_id"));
            b(as.b(b, "ad_session_id"));
            return true;
        }
        q.a("Failed to launch browser.", 0);
        as.a(a, "success", false);
        dVar.a(a).a();
        return false;
    }

    boolean g(d dVar) {
        JSONObject a = as.a();
        JSONObject b = dVar.b();
        JSONArray g = as.g(b, "recipients");
        boolean d = as.d(b, "html");
        String b2 = as.b(b, "subject");
        String b3 = as.b(b, "body");
        String[] strArr = new String[g.length()];
        for (int i = 0; i < g.length(); i++) {
            strArr[i] = as.c(g, i);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (!d) {
            intent.setType("plain/text");
        }
        intent.putExtra("android.intent.extra.SUBJECT", b2).putExtra("android.intent.extra.TEXT", b3).putExtra("android.intent.extra.EMAIL", strArr);
        if (q.a(intent)) {
            as.a(a, "success", true);
            dVar.a(a).a();
            a(as.b(b, "ad_session_id"));
            b(as.b(b, "ad_session_id"));
            return true;
        }
        q.a("Failed to send email.", 0);
        as.a(a, "success", false);
        dVar.a(a).a();
        return false;
    }

    boolean h(d dVar) {
        JSONObject a = as.a();
        JSONObject b = dVar.b();
        if (as.d(b, "deep_link")) {
            return a(dVar);
        }
        if (q.a(a.c().getPackageManager().getLaunchIntentForPackage(as.b(b, "handle")))) {
            as.a(a, "success", true);
            dVar.a(a).a();
            a(as.b(b, "ad_session_id"));
            b(as.b(b, "ad_session_id"));
            return true;
        }
        q.a("Failed to launch external application.", 0);
        as.a(a, "success", false);
        dVar.a(a).a();
        return false;
    }

    boolean i(d dVar) {
        long j;
        Intent putExtra;
        String str;
        String str2;
        String str3;
        JSONObject a = as.a();
        JSONObject b = dVar.b();
        String str4 = "";
        String str5 = "";
        JSONObject f = as.f(b, NativeProtocol.WEB_DIALOG_PARAMS);
        JSONObject f2 = as.f(f, "recurrence");
        JSONArray b2 = as.b();
        JSONArray b3 = as.b();
        JSONArray b4 = as.b();
        String b5 = as.b(f, "description");
        as.b(f, PlaceFields.LOCATION);
        String b6 = as.b(f, "start");
        String b7 = as.b(f, "end");
        String b8 = as.b(f, "summary");
        if (f2 != null && f2.length() > 0) {
            str5 = as.b(f2, "expires");
            str4 = as.b(f2, "frequency");
            b2 = as.g(f2, "daysInWeek");
            b3 = as.g(f2, "daysInMonth");
            b4 = as.g(f2, "daysInYear");
        }
        if (b8.equals("")) {
            b8 = b5;
        }
        Date g = q.g(b6);
        Date g2 = q.g(b7);
        Date g3 = q.g(str5);
        if (g == null || g2 == null) {
            q.a("Unable to create Calendar Event", 0);
            as.a(a, "success", false);
            dVar.a(a).a();
            return false;
        }
        long time = g.getTime();
        long time2 = g2.getTime();
        long j2 = 0;
        if (g3 != null) {
            j2 = (g3.getTime() - g.getTime()) / 1000;
        }
        if (str4.equals("DAILY")) {
            j = (j2 / 86400) + 1;
        } else if (str4.equals("WEEKLY")) {
            j = (j2 / 604800) + 1;
        } else if (str4.equals("MONTHLY")) {
            j = (j2 / 2629800) + 1;
        } else if (!str4.equals("YEARLY")) {
            j = 0;
        } else {
            j = (j2 / 31557600) + 1;
        }
        if (f2 != null && f2.length() > 0) {
            String str6 = "FREQ=" + str4 + ";COUNT=" + j;
            try {
                if (b2.length() != 0) {
                    str2 = str6 + ";BYDAY=" + q.a(b2);
                } else {
                    str2 = str6;
                }
                try {
                    if (b3.length() != 0) {
                        str3 = str2 + ";BYMONTHDAY=" + q.b(b3);
                    } else {
                        str3 = str2;
                    }
                    try {
                        if (b4.length() != 0) {
                            str = str3 + ";BYYEARDAY=" + q.b(b4);
                        } else {
                            str = str3;
                        }
                    } catch (JSONException e) {
                        str = str3;
                    }
                } catch (JSONException e2) {
                    str = str2;
                }
            } catch (JSONException e3) {
                str = str6;
            }
            putExtra = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", b8).putExtra("description", b5).putExtra("beginTime", time).putExtra("endTime", time2).putExtra("rrule", str);
        } else {
            putExtra = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", b8).putExtra("description", b5).putExtra("beginTime", time).putExtra("endTime", time2);
        }
        if (q.a(putExtra)) {
            as.a(a, "success", true);
            dVar.a(a).a();
            a(as.b(b, "ad_session_id"));
            b(as.b(b, "ad_session_id"));
            return true;
        }
        q.a("Unable to create Calendar Event.", 0);
        as.a(a, "success", false);
        dVar.a(a).a();
        return false;
    }

    boolean j(d dVar) {
        JSONObject a = as.a();
        String b = as.b(dVar.b(), "name");
        boolean a2 = q.a(b);
        as.a(a, "success", true);
        as.a(a, "result", a2);
        as.a(a, "name", b);
        as.a(a, "service", b);
        dVar.a(a).a();
        return true;
    }

    boolean k(d dVar) {
        return j(dVar);
    }

    boolean l(d dVar) {
        JSONObject a = as.a();
        JSONObject b = dVar.b();
        if (q.a(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", as.b(b, "text") + " " + as.b(b, "url")), true)) {
            as.a(a, "success", true);
            dVar.a(a).a();
            a(as.b(b, "ad_session_id"));
            b(as.b(b, "ad_session_id"));
            return true;
        }
        q.a("Unable to create social post.", 0);
        as.a(a, "success", false);
        dVar.a(a).a();
        return false;
    }

    void a(String str) {
        ab j = a.a().j();
        AdColonyInterstitial adColonyInterstitial = j.c().get(str);
        if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
            adColonyInterstitial.getListener().onLeftApplication(adColonyInterstitial);
            return;
        }
        u uVar = j.d().get(str);
        ac listener = uVar != null ? uVar.getListener() : null;
        if (uVar != null && listener != null && (listener instanceof AdColonyNativeAdViewListener)) {
            ((AdColonyNativeAdViewListener) listener).onLeftApplication((AdColonyNativeAdView) uVar);
        }
    }

    void b(String str) {
        ab j = a.a().j();
        AdColonyInterstitial adColonyInterstitial = j.c().get(str);
        if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
            adColonyInterstitial.getListener().onClicked(adColonyInterstitial);
            return;
        }
        u uVar = j.d().get(str);
        ac listener = uVar != null ? uVar.getListener() : null;
        if (uVar != null && listener != null && (listener instanceof AdColonyNativeAdViewListener)) {
            ((AdColonyNativeAdViewListener) listener).onClicked((AdColonyNativeAdView) uVar);
        }
    }
}
