package net.hockeyapp.android.tasks;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.Map;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.utils.HttpURLConnectionBuilder;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class LoginTask extends ConnectionTask<Void, Void, Boolean> {
    public static final String BUNDLE_SUCCESS = "success";
    private final int a;
    private final String b;
    private final Map<String, String> c;
    private Context d;
    private Handler e;
    private ProgressDialog f;
    private boolean g = true;

    public LoginTask(Context context, Handler handler, String str, int i, Map<String, String> map) {
        this.d = context;
        this.e = handler;
        this.b = str;
        this.a = i;
        this.c = map;
        if (context != null) {
            Constants.loadFromContext(context);
        }
    }

    public void setShowProgressDialog(boolean z) {
        this.g = z;
    }

    public void attach(Context context, Handler handler) {
        this.d = context;
        this.e = handler;
    }

    public void detach() {
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        if ((this.f == null || !this.f.isShowing()) && this.g) {
            this.f = ProgressDialog.show(this.d, "", "Please wait...", true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Boolean doInBackground(Void... voidArr) {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = a(this.a, this.c);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    String stringFromConnection = getStringFromConnection(httpURLConnection);
                    if (!TextUtils.isEmpty(stringFromConnection)) {
                        Boolean valueOf = Boolean.valueOf(a(stringFromConnection));
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            return false;
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean bool) {
        if (this.f != null) {
            try {
                this.f.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.e != null) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putBoolean("success", bool.booleanValue());
            message.setData(bundle);
            this.e.sendMessage(message);
        }
    }

    private HttpURLConnection a(int i, Map<String, String> map) {
        if (i == 1) {
            return new HttpURLConnectionBuilder(this.b).setRequestMethod("POST").writeFormFields(map).build();
        }
        if (i == 2) {
            return new HttpURLConnectionBuilder(this.b).setRequestMethod("POST").setBasicAuthorization(map.get("email"), map.get("password")).build();
        }
        if (i == 3) {
            return new HttpURLConnectionBuilder(this.b + "?" + map.get("type") + "=" + map.get("id")).build();
        }
        throw new IllegalArgumentException("Login mode " + i + " not supported.");
    }

    private boolean a(String str) {
        SharedPreferences sharedPreferences = this.d.getSharedPreferences("net.hockeyapp.android.login", 0);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("status");
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            if (this.a == 1) {
                if (string.equals("identified")) {
                    String string2 = jSONObject.getString("iuid");
                    if (!TextUtils.isEmpty(string2)) {
                        sharedPreferences.edit().putString("iuid", string2).putString("email", this.c.get("email")).apply();
                        return true;
                    }
                }
            } else if (this.a == 2) {
                if (string.equals("authorized")) {
                    String string3 = jSONObject.getString("auid");
                    if (!TextUtils.isEmpty(string3)) {
                        sharedPreferences.edit().putString("auid", string3).putString("email", this.c.get("email")).apply();
                        return true;
                    }
                }
            } else if (this.a == 3) {
                if (string.equals("validated")) {
                    return true;
                }
                sharedPreferences.edit().remove("iuid").remove("auid").remove("email").apply();
            } else {
                throw new IllegalArgumentException("Login mode " + this.a + " not supported.");
            }
            return false;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
