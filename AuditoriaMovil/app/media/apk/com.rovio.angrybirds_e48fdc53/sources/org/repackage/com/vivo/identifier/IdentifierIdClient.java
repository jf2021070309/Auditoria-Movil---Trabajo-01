package org.repackage.com.vivo.identifier;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.appevents.AppEventsConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
/* loaded from: classes3.dex */
public class IdentifierIdClient {
    private static final String a = "VMS_IDLG_SDK_Client";
    private static final String b = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static final String c = "persist.sys.identifierid.supported";
    private static final String d = "appid";
    private static final String e = "type";
    private static final String f = "OAID";
    private static final String g = "VAID";
    private static final String h = "AAID";
    private static final int i = 0;
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 4;
    private static final int m = 11;
    private static final int n = 2000;
    private static Context o;
    private static boolean p = false;
    private static IdentifierIdObserver q = null;
    private static IdentifierIdObserver r = null;
    private static IdentifierIdObserver s = null;
    private static Object t = new Object();
    private static HandlerThread u = null;
    private static Handler v = null;
    private static String w = null;
    private static String x = null;
    private static String y = null;
    private static String z = null;
    private static String A = null;
    private static volatile IdentifierIdClient B = null;
    private static volatile DataBaseOperation C = null;

    private IdentifierIdClient() {
    }

    public static IdentifierIdClient a(Context context) {
        if (B == null) {
            synchronized (IdentifierIdClient.class) {
                o = context.getApplicationContext();
                B = new IdentifierIdClient();
            }
        }
        if (C == null) {
            synchronized (IdentifierIdClient.class) {
                o = context.getApplicationContext();
                g();
                C = new DataBaseOperation(o);
                d();
            }
        }
        return B;
    }

    private static void g() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        u = handlerThread;
        handlerThread.start();
        v = new Handler(u.getLooper()) { // from class: org.repackage.com.vivo.identifier.IdentifierIdClient.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 11) {
                    String unused = IdentifierIdClient.w = IdentifierIdClient.C.a(message.getData().getInt("type"), message.getData().getString("appid"));
                    synchronized (IdentifierIdClient.t) {
                        IdentifierIdClient.t.notify();
                    }
                    return;
                }
                Log.e(IdentifierIdClient.a, "message type valid");
            }
        };
    }

    public boolean a() {
        return p;
    }

    public String b() {
        if (a()) {
            String str = x;
            if (str != null) {
                return str;
            }
            a(0, (String) null);
            if (q == null) {
                a(o, 0, null);
            }
            return x;
        }
        return null;
    }

    public String a(String str) {
        if (!a()) {
            return null;
        }
        String str2 = y;
        if (str2 != null) {
            return str2;
        }
        a(1, str);
        if (r == null && y != null) {
            a(o, 1, str);
        }
        return y;
    }

    public String b(String str) {
        if (!a()) {
            return null;
        }
        String str2 = z;
        if (str2 != null) {
            return str2;
        }
        a(2, str);
        if (s == null && z != null) {
            a(o, 2, str);
        }
        return z;
    }

    public String c() {
        if (a()) {
            a(4, (String) null);
            return A;
        }
        return null;
    }

    public void a(int i2, String str) {
        synchronized (t) {
            b(i2, str);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                t.wait(2000L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - uptimeMillis >= 2000) {
                Log.d(a, "query timeout");
            } else if (i2 == 0) {
                x = w;
                w = null;
            } else if (i2 == 1) {
                String str2 = w;
                if (str2 != null) {
                    y = str2;
                    w = null;
                } else {
                    Log.e(a, "get vaid failed");
                }
            } else {
                if (i2 == 2) {
                    String str3 = w;
                    if (str3 != null) {
                        z = str3;
                        w = null;
                    } else {
                        Log.e(a, "get aaid failed");
                    }
                } else if (i2 != 4) {
                }
                A = w;
                w = null;
            }
        }
    }

    private void b(int i2, String str) {
        Message obtainMessage = v.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        if (i2 == 1 || i2 == 2) {
            bundle.putString("appid", str);
        }
        obtainMessage.setData(bundle);
        v.sendMessage(obtainMessage);
    }

    public static void d() {
        p = "1".equals(a(c, AppEventsConstants.EVENT_PARAM_VALUE_NO));
    }

    public static String a(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class, String.class).invoke(cls, str, "unknown");
            } catch (Exception e2) {
                e2.printStackTrace();
                return str2;
            }
        } catch (Throwable th) {
            return str2;
        }
    }

    private static void a(Context context, int i2, String str) {
        if (i2 == 0) {
            q = new IdentifierIdObserver(B, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, q);
        } else if (i2 == 1) {
            r = new IdentifierIdObserver(B, 1, str);
            ContentResolver contentResolver = context.getContentResolver();
            contentResolver.registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, r);
        } else if (i2 == 2) {
            s = new IdentifierIdObserver(B, 2, str);
            ContentResolver contentResolver2 = context.getContentResolver();
            contentResolver2.registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, s);
        }
    }
}
