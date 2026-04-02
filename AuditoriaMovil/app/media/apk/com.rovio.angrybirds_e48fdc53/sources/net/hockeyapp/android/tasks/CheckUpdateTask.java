package net.hockeyapp.android.tasks;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.Tracking;
import net.hockeyapp.android.UpdateActivity;
import net.hockeyapp.android.UpdateManagerListener;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.Util;
import net.hockeyapp.android.utils.VersionCache;
import net.hockeyapp.android.utils.VersionHelper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class CheckUpdateTask extends AsyncTask<Void, String, JSONArray> {
    protected static final String APK = "apk";
    private Context a;
    protected String appIdentifier;
    private long b;
    protected UpdateManagerListener listener;
    protected Boolean mandatory;
    protected String urlString;

    public CheckUpdateTask(WeakReference<? extends Context> weakReference, String str) {
        this(weakReference, str, null);
    }

    public CheckUpdateTask(WeakReference<? extends Context> weakReference, String str, String str2) {
        this(weakReference, str, str2, null);
    }

    public CheckUpdateTask(WeakReference<? extends Context> weakReference, String str, String str2, UpdateManagerListener updateManagerListener) {
        this.urlString = null;
        this.appIdentifier = null;
        this.a = null;
        this.mandatory = false;
        this.b = 0L;
        this.appIdentifier = str2;
        this.urlString = str;
        this.listener = updateManagerListener;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            this.a = context.getApplicationContext();
            this.b = Tracking.getUsageTime(context);
            Constants.loadFromContext(context);
        }
    }

    public void attach(WeakReference<? extends Context> weakReference) {
        Context context = null;
        if (weakReference != null) {
            context = weakReference.get();
        }
        if (context != null) {
            this.a = context.getApplicationContext();
            Constants.loadFromContext(context);
        }
    }

    public void detach() {
        this.a = null;
    }

    protected int getVersionCode() {
        return Integer.parseInt(Constants.APP_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006c -> B:7:0x0022). Please submit an issue!!! */
    @Override // android.os.AsyncTask
    public JSONArray doInBackground(Void... voidArr) {
        int versionCode;
        JSONArray jSONArray;
        try {
            versionCode = getVersionCode();
            jSONArray = new JSONArray(VersionCache.getVersionInfo(this.a));
        } catch (IOException | JSONException e) {
            if (this.a != null && Util.isConnectedToNetwork(this.a)) {
                HockeyLog.error("HockeyUpdate", "Could not fetch updates although connected to internet");
                e.printStackTrace();
            }
        }
        if (getCachingEnabled() && a(jSONArray, versionCode)) {
            HockeyLog.verbose("HockeyUpdate", "Returning cached JSON");
            return jSONArray;
        }
        URLConnection createConnection = createConnection(new URL(getURLString(UpdateActivity.EXTRA_JSON)));
        createConnection.connect();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(createConnection.getInputStream());
        String a = a(bufferedInputStream);
        bufferedInputStream.close();
        JSONArray jSONArray2 = new JSONArray(a);
        if (a(jSONArray2, versionCode)) {
            return a(jSONArray2);
        }
        return null;
    }

    protected URLConnection createConnection(URL url) {
        URLConnection openConnection = url.openConnection();
        openConnection.addRequestProperty("User-Agent", Constants.SDK_USER_AGENT);
        if (Build.VERSION.SDK_INT <= 9) {
            openConnection.setRequestProperty("connection", "close");
        }
        return openConnection;
    }

    private boolean a(JSONArray jSONArray, int i) {
        boolean z = false;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                boolean z2 = jSONObject.getInt("version") > i;
                boolean z3 = jSONObject.getInt("version") == i && VersionHelper.isNewerThanLastUpdateTime(this.a, jSONObject.getLong("timestamp"));
                boolean z4 = VersionHelper.compareVersionStrings(jSONObject.getString("minimum_os_version"), VersionHelper.mapGoogleVersion(Build.VERSION.RELEASE)) <= 0;
                if ((z2 || z3) && z4) {
                    if (jSONObject.has("mandatory")) {
                        this.mandatory = Boolean.valueOf(this.mandatory.booleanValue() | jSONObject.getBoolean("mandatory"));
                    }
                    z = true;
                }
            } catch (JSONException e) {
                return false;
            }
        }
        return z;
    }

    private JSONArray a(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < Math.min(jSONArray.length(), 25); i++) {
            try {
                jSONArray2.put(jSONArray.get(i));
            } catch (JSONException e) {
            }
        }
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(JSONArray jSONArray) {
        if (jSONArray != null) {
            HockeyLog.verbose("HockeyUpdate", "Received Update Info");
            if (this.listener != null) {
                this.listener.onUpdateAvailable(jSONArray, getURLString(APK));
                return;
            }
            return;
        }
        HockeyLog.verbose("HockeyUpdate", "No Update Info available");
        if (this.listener != null) {
            this.listener.onNoUpdateAvailable();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cleanUp() {
        this.urlString = null;
        this.appIdentifier = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getURLString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.urlString);
        sb.append("api/2/apps/");
        sb.append(this.appIdentifier != null ? this.appIdentifier : this.a.getPackageName());
        sb.append("?format=" + str);
        if (!TextUtils.isEmpty(Settings.Secure.getString(this.a.getContentResolver(), "android_id"))) {
            sb.append("&udid=" + a(Settings.Secure.getString(this.a.getContentResolver(), "android_id")));
        }
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("net.hockeyapp.android.login", 0);
        String string = sharedPreferences.getString("auid", null);
        if (!TextUtils.isEmpty(string)) {
            sb.append("&auid=" + a(string));
        }
        String string2 = sharedPreferences.getString("iuid", null);
        if (!TextUtils.isEmpty(string2)) {
            sb.append("&iuid=" + a(string2));
        }
        sb.append("&os=Android");
        sb.append("&os_version=" + a(Constants.ANDROID_VERSION));
        sb.append("&device=" + a(Constants.PHONE_MODEL));
        sb.append("&oem=" + a(Constants.PHONE_MANUFACTURER));
        sb.append("&app_version=" + a(Constants.APP_VERSION));
        sb.append("&sdk=" + a(Constants.SDK_NAME));
        sb.append("&sdk_version=" + a("4.1.5"));
        sb.append("&lang=" + a(Locale.getDefault().getLanguage()));
        sb.append("&usage_time=" + this.b);
        return sb.toString();
    }

    private String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean getCachingEnabled() {
        return true;
    }

    private static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine + "\n");
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } finally {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        inputStream.close();
        return sb.toString();
    }
}
