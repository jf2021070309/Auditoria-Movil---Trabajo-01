package com.me.game.pmupdatesdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.flurry.android.Constants;
import com.me.game.pmupdatesdk.PMUpdateSDK;
import com.me.game.pmupdatesdk.utils.HandlerUtils;
import com.me.game.pmupdatesdk.utils.LoggerUtils;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.umeng.analytics.pro.bg;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes7.dex */
public class RequestBase {
    protected static final String API_KEY = "SmkLzjwj87vr4s7jHBcXndXyFxDfWFus";
    protected static final String API_SECRET = "7dUmoccZg1DkCvbn74PnvDNxlJANWCsI";
    public static final String ONLINE_API = "https://www.playmods.live/app/%s";
    public static final String SDK_EVENT_API = "https://www.playmods.live/%s";
    protected String ACTION_NAME;
    protected String mChannel;
    protected Context mContext;
    protected String mPackageName;
    protected SharedPreferences mPreferences;
    protected String mToken;
    protected int mVersionCode;
    protected String mVersionName;
    protected final String PARAM_PACKAGE_NAME = DBDefinition.PACKAGE_NAME;
    protected final String PARAM_VERSION_NAME = "versionName";
    protected final String PARAM_VERSION_CODE = "versionCode";
    protected final String PARAM_REAL_PACKAGE_NAME = "realPackageName";
    protected final String PARAM_EVENT_CODE = "eventCode";
    protected String BASE_URL = "https://www.playmods.live/app/%s";
    protected Handler mHandler = new Handler(Looper.getMainLooper());

    public void init(Context application) {
        if (this.mContext != null) {
            return;
        }
        this.mContext = application;
        this.mPreferences = PreferenceManager.getDefaultSharedPreferences(application);
        if (application instanceof PMUpdateSDK) {
            this.mPackageName = ((PMUpdateSDK) application).getRealPackageName();
            this.mVersionCode = ((PMUpdateSDK) application).getVersionCode();
            this.mVersionName = ((PMUpdateSDK) application).getVersionName();
            return;
        }
        PackageManager pm = application.getPackageManager();
        try {
            String packageName = application.getPackageName();
            this.mPackageName = packageName;
            PackageInfo pi = pm.getPackageInfo(packageName, 0);
            this.mVersionCode = pi.versionCode;
            this.mVersionName = pi.versionName;
        } catch (Exception e) {
        }
    }

    protected String setStringParams() {
        StringBuilder builder = new StringBuilder();
        try {
            TreeMap<String, Object> kvMap = new TreeMap<>();
            setKvMap(kvMap);
            for (Map.Entry<String, Object> entry : kvMap.entrySet()) {
                entry.getKey();
                Object value = entry.getValue();
                if (!(value instanceof String) || !TextUtils.isEmpty(value.toString())) {
                    builder.append(entry.getKey());
                    builder.append("=");
                    builder.append(entry.getValue());
                    builder.append("&");
                }
            }
            builder.append(API_SECRET);
        } catch (Exception e) {
        }
        return builder.toString();
    }

    protected void setKvMap(TreeMap<String, Object> kvMap) {
    }

    public static String md5(String inStr) {
        try {
            byte[] byteArray = inStr.getBytes();
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] md5Bytes = md5.digest(byteArray);
            StringBuffer hexValue = new StringBuffer();
            for (byte b : md5Bytes) {
                int val = b & Constants.UNKNOWN;
                if (val < 16) {
                    hexValue.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                hexValue.append(Integer.toHexString(val));
            }
            return hexValue.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void postRequest() {
        String paramObj = setStringParams();
        postRequest(paramObj);
    }

    protected void postRequest(final String paramObj) {
        final String realUrl = String.format(this.BASE_URL, this.ACTION_NAME);
        LoggerUtils.e("jjjjj", "realUrl = " + realUrl);
        new Thread(new Runnable() { // from class: com.me.game.pmupdatesdk.network.RequestBase.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    URL httpUrl = new URL(realUrl);
                    HttpURLConnection http = (HttpURLConnection) httpUrl.openConnection();
                    HttpURLConnection.setFollowRedirects(true);
                    http.setConnectTimeout(10000);
                    http.setReadTimeout(12000);
                    http.setRequestMethod("POST");
                    http.setRequestProperty("Accept", "image/gif, image/jpeg, image/pjpeg, image/pjpeg, application/x-shockwave-flash, application/xaml+xml, application/vnd.ms-xpsdocument, application/x-ms-xbap, application/x-ms-application, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
                    http.setRequestProperty("Accept-Language", "zh-CN");
                    http.setRequestProperty("Referer", realUrl);
                    http.setRequestProperty("Charset", "UTF-8");
                    http.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2; Trident/4.0; .NET CLR 1.1.4322; .NET CLR 2.0.50727; .NET CLR 3.0.04506.30; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729)");
                    http.setRequestProperty("Connection", "Keep-Alive");
                    http.setRequestProperty(bg.y, Build.VERSION.SDK_INT + "");
                    http.setRequestProperty("client_package_name", RequestBase.this.mPackageName);
                    http.setRequestProperty("client_version_name", RequestBase.this.mVersionName);
                    http.setRequestProperty("client_version_code", RequestBase.this.mVersionCode + "");
                    http.setRequestProperty(bg.N, Locale.getDefault().getLanguage());
                    http.setRequestProperty("android_id", PMUpdateSDK.mPMUpdateSDK.getAndroidId());
                    http.setRequestProperty("update_key", PMUpdateSDK.mPMUpdateSDK.modsSign());
                    StringBuilder builder = new StringBuilder();
                    builder.append(paramObj);
                    LoggerUtils.e("jjjjj", "buildToken : " + builder.toString());
                    http.getOutputStream().write(builder.toString().getBytes());
                    InputStream inStream = http.getInputStream();
                    final StringBuilder response = new StringBuilder();
                    InputStreamReader inputReader = new InputStreamReader(inStream);
                    BufferedReader bufReader = new BufferedReader(inputReader);
                    while (true) {
                        String line = bufReader.readLine();
                        if (line != null) {
                            response.append(line.trim());
                        } else {
                            HandlerUtils.post(RequestBase.this.mHandler, new Runnable() { // from class: com.me.game.pmupdatesdk.network.RequestBase.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    RequestBase.this.onSuccess(response.toString());
                                }
                            });
                            inStream.close();
                            return;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    HandlerUtils.post(RequestBase.this.mHandler, new Runnable() { // from class: com.me.game.pmupdatesdk.network.RequestBase.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            RequestBase.this.onFailure(e.getMessage());
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onSuccess(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onFailure(String msg) {
    }

    public static void initApplication(Context context) {
        ProtocolUpdateNotice.getIns().init(context);
        ProtocolEventReported.getIns().init(context);
    }
}
