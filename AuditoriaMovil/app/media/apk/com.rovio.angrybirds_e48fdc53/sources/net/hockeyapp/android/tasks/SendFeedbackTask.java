package net.hockeyapp.android.tasks;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.analytics.pro.bg;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.R;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.HttpURLConnectionBuilder;
import net.hockeyapp.android.utils.Util;
/* loaded from: classes4.dex */
public class SendFeedbackTask extends ConnectionTask<Void, Void, HashMap<String, String>> {
    public static final String BUNDLE_FEEDBACK_RESPONSE = "feedback_response";
    public static final String BUNDLE_FEEDBACK_STATUS = "feedback_status";
    public static final String BUNDLE_REQUEST_TYPE = "request_type";
    private Context a;
    private Handler b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private List<Uri> h;
    private String i;
    private boolean j;
    private ProgressDialog k;
    private boolean l = true;
    private int m = -1;

    public SendFeedbackTask(Context context, String str, String str2, String str3, String str4, String str5, List<Uri> list, String str6, Handler handler, boolean z) {
        this.a = context;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = list;
        this.i = str6;
        this.b = handler;
        this.j = z;
        if (context != null) {
            Constants.loadFromContext(context);
        }
    }

    public void setShowProgressDialog(boolean z) {
        this.l = z;
    }

    public void setLastMessageId(int i) {
        this.m = i;
    }

    public void setHandler(Handler handler) {
        this.b = handler;
    }

    public void attach(Context context) {
        this.a = context;
        if (getStatus() == AsyncTask.Status.RUNNING) {
            if ((this.k == null || !this.k.isShowing()) && this.l) {
                this.k = ProgressDialog.show(this.a, "", d(), true, false);
            }
        }
    }

    public void detach() {
        this.a = null;
        if (this.k != null) {
            this.k.dismiss();
            this.k = null;
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        if ((this.k == null || !this.k.isShowing()) && this.l) {
            this.k = ProgressDialog.show(this.a, "", d(), true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public HashMap<String, String> doInBackground(Void... voidArr) {
        if (this.j && this.i != null) {
            return c();
        }
        if (!this.j) {
            if (this.h.isEmpty()) {
                return a();
            }
            HashMap<String, String> b = b();
            if (b != null) {
                a(b);
                return b;
            }
            return b;
        }
        return null;
    }

    private void a(HashMap<String, String> hashMap) {
        File file;
        String str = hashMap.get("status");
        if (str != null && str.startsWith("2") && this.a != null && (file = new File(this.a.getCacheDir(), "HockeyApp")) != null && file.exists()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2 != null && !Boolean.valueOf(file2.delete()).booleanValue()) {
                    HockeyLog.debug("SendFeedbackTask", "Error deleting file from temporary folder");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(HashMap<String, String> hashMap) {
        if (this.k != null) {
            try {
                this.k.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.b != null) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            if (hashMap != null) {
                bundle.putString(BUNDLE_REQUEST_TYPE, hashMap.get("type"));
                bundle.putString(BUNDLE_FEEDBACK_RESPONSE, hashMap.get("response"));
                bundle.putString(BUNDLE_FEEDBACK_STATUS, hashMap.get("status"));
            } else {
                bundle.putString(BUNDLE_REQUEST_TYPE, "unknown");
            }
            message.setData(bundle);
            this.b.sendMessage(message);
        }
    }

    private HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("type", "send");
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("name", this.d);
                hashMap2.put("email", this.e);
                hashMap2.put("subject", this.f);
                hashMap2.put("text", this.g);
                hashMap2.put("bundle_identifier", Constants.APP_PACKAGE);
                hashMap2.put("bundle_short_version", Constants.APP_VERSION_NAME);
                hashMap2.put("bundle_version", Constants.APP_VERSION);
                hashMap2.put(bg.y, Constants.ANDROID_VERSION);
                hashMap2.put("oem", Constants.PHONE_MANUFACTURER);
                hashMap2.put("model", Constants.PHONE_MODEL);
                hashMap2.put("sdk_version", "4.1.5");
                if (this.i != null) {
                    this.c += this.i + "/";
                }
                httpURLConnection = new HttpURLConnectionBuilder(this.c).setRequestMethod(this.i != null ? "PUT" : "POST").writeFormFields(hashMap2).build();
                httpURLConnection.connect();
                hashMap.put("status", String.valueOf(httpURLConnection.getResponseCode()));
                hashMap.put("response", getStringFromConnection(httpURLConnection));
            } catch (IOException e) {
                e.printStackTrace();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            return hashMap;
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    private HashMap<String, String> b() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("type", "send");
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("name", this.d);
                hashMap2.put("email", this.e);
                hashMap2.put("subject", this.f);
                hashMap2.put("text", this.g);
                hashMap2.put("bundle_identifier", Constants.APP_PACKAGE);
                hashMap2.put("bundle_short_version", Constants.APP_VERSION_NAME);
                hashMap2.put("bundle_version", Constants.APP_VERSION);
                hashMap2.put(bg.y, Constants.ANDROID_VERSION);
                hashMap2.put("oem", Constants.PHONE_MANUFACTURER);
                hashMap2.put("model", Constants.PHONE_MODEL);
                hashMap2.put("sdk_version", "4.1.5");
                if (this.i != null) {
                    this.c += this.i + "/";
                }
                httpURLConnection = new HttpURLConnectionBuilder(this.c).setRequestMethod(this.i != null ? "PUT" : "POST").writeMultipartData(hashMap2, this.a, this.h).build();
                httpURLConnection.connect();
                hashMap.put("status", String.valueOf(httpURLConnection.getResponseCode()));
                hashMap.put("response", getStringFromConnection(httpURLConnection));
            } catch (IOException e) {
                e.printStackTrace();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            return hashMap;
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    private HashMap<String, String> c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c + Util.encodeParam(this.i));
        if (this.m != -1) {
            sb.append("?last_message_id=" + this.m);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = new HttpURLConnectionBuilder(sb.toString()).build();
                hashMap.put("type", "fetch");
                httpURLConnection.connect();
                hashMap.put("status", String.valueOf(httpURLConnection.getResponseCode()));
                hashMap.put("response", getStringFromConnection(httpURLConnection));
            } catch (IOException e) {
                e.printStackTrace();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            return hashMap;
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    private String d() {
        String string = this.a.getString(R.string.hockeyapp_feedback_sending_feedback_text);
        if (this.j) {
            return this.a.getString(R.string.hockeyapp_feedback_fetching_feedback_text);
        }
        return string;
    }
}
