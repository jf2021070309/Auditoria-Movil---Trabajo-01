package hm.mod.update;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class up1 implements Runnable {
    private final Context context;

    public up1(Context context) {
        this.context = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject;
        JSONArray jSONArray;
        try {
            final String packageName = this.context.getPackageName();
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(packageName, 0);
            String str = packageInfo.versionName;
            int i = packageInfo.versionCode;
            String lang = up5.getLang();
            String country = up5.getCountry();
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://pop-up.apkomega.com/202307/api/popup.php?packageName=" + packageName + "&versionName=" + str + "&versionCode=" + i + "&lang=" + lang + "&country=" + country).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setRequestMethod("GET");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            Log.e("zjx", "data: " + sb.toString());
            JSONObject jSONObject2 = new JSONObject(sb.toString());
            if (jSONObject2.optBoolean("hasNewVersion", false)) {
                final String optString = jSONObject2.optString("title");
                final String optString2 = jSONObject2.optString("icon");
                final String optString3 = jSONObject2.optString("author");
                final String optString4 = jSONObject2.optString(FirebaseAnalytics.Param.CONTENT);
                final boolean optBoolean = jSONObject2.optBoolean("canClose", true);
                final String optString5 = jSONObject2.optString(ImagesContract.URL, "https://spdn.poumod.com/HappyMod-2-9-7.apk");
                ((Activity) this.context).runOnUiThread(new Runnable() { // from class: hm.mod.update.up1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        up2.show(up1.this.context, Uri.encode(optString), Uri.encode(optString2), Uri.encode(optString3), packageName, optString4, optString5, optBoolean);
                    }
                });
            } else if (jSONObject2.has("ad_info") && (jSONObject = jSONObject2.getJSONObject("ad_info")) != null && jSONObject.has("ad_list")) {
                long optLong = jSONObject.optLong("interval", 3600L);
                int showTimes = up5.getShowTimes(this.context);
                long lastShow = up5.getLastShow(this.context);
                if ((showTimes >= 2 && (System.currentTimeMillis() / 1000) - lastShow <= optLong) || (jSONArray = jSONObject.getJSONArray("ad_list")) == null || jSONArray.length() == 0) {
                    return;
                }
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    if (!isAppInstalled(jSONObject3.optString("packageName"))) {
                        final String optString6 = jSONObject3.optString("title");
                        final String optString7 = jSONObject3.optString("icon");
                        final String optString8 = jSONObject3.optString("banner");
                        final String optString9 = jSONObject3.optString("desc");
                        final String optString10 = jSONObject3.optString(ImagesContract.URL);
                        final String optString11 = jSONObject3.optString("action", "INSTALL");
                        ((Activity) this.context).runOnUiThread(new Runnable() { // from class: hm.mod.update.up1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                up2.showAd(up1.this.context, optString6, optString7, optString8, optString9, optString10, optString11);
                                up5.setLastShow(up1.this.context);
                                up5.setShowTimes(up1.this.context);
                            }
                        });
                        return;
                    }
                }
            }
        } catch (Exception e) {
            Log.e("zjx", "update: " + e.getLocalizedMessage());
        }
    }

    private boolean isAppInstalled(String str) {
        return this.context.getPackageManager().getPackageInfo(str, 0) != null;
    }
}
