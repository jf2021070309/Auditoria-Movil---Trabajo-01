package com.ironsource.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.integrity.IntegrityManager;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.a;
import com.ironsource.environment.c;
import com.ironsource.environment.c.a;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.C0119m;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    private C0119m a = new C0119m();

    public static String a(Context context) {
        return Build.VERSION.SDK_INT >= 23 ? a(b(context), context) : e(context);
    }

    public static String a(Network network, Context context) {
        String e;
        if (context == null) {
            return IntegrityManager.INTEGRITY_TYPE_NONE;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return IntegrityManager.INTEGRITY_TYPE_NONE;
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    return e(context);
                }
                if (networkCapabilities.hasTransport(1)) {
                    e = "wifi";
                } else if (!networkCapabilities.hasTransport(0)) {
                    return e(context);
                } else {
                    e = "3g";
                }
            } else {
                e = e(context);
            }
            return e;
        } catch (Exception e2) {
            e2.printStackTrace();
            return IntegrityManager.INTEGRITY_TYPE_NONE;
        }
    }

    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 23 && network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", c(context));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static Network b(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 23 && connectivityManager != null) {
            try {
                return connectivityManager.getActiveNetwork();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (Build.VERSION.SDK_INT >= 23 && network != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "ethernet";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return "wifiAware";
                }
                if (networkCapabilities.hasTransport(6)) {
                    return "lowpan";
                }
                if (networkCapabilities.hasTransport(2)) {
                    return "bluetooth";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public static boolean c(Context context) {
        return b(context, b(context)).equals("vpn");
    }

    private static String e(Context context) {
        String a = a.AnonymousClass1.a(context);
        return TextUtils.isEmpty(a) ? IntegrityManager.INTEGRITY_TYPE_NONE : a;
    }

    public void a(String str) {
        C0119m.a("apky", str);
    }

    public void a(JSONObject jSONObject) {
        C0119m.a("md", (Object) jSONObject);
    }

    public void a(boolean z) {
        C0119m.a("cnst", Boolean.valueOf(z));
    }

    public void b(String str) {
        C0119m.a("medv", str);
    }

    public void c(String str) {
        C0119m.a("sid", str);
    }

    public void d(final Context context) {
        final com.ironsource.environment.c.a aVar = a.C0083a.a;
        ContextProvider.getInstance().postOnUIThread(new Runnable() { // from class: com.ironsource.environment.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a aVar2 = a.this;
                    Context context2 = context;
                    if (context2 != null && !aVar2.c.getAndSet(true)) {
                        aVar2.a("auid", h.z(context2));
                        aVar2.a("model", h.g());
                        aVar2.a("make", h.h());
                        aVar2.a("os", h.i());
                        String e = h.e();
                        if (e != null) {
                            aVar2.a("osv", e.replaceAll("[^0-9/.]", ""));
                            aVar2.a("osvf", e);
                        }
                        aVar2.a("apilvl", String.valueOf(h.f()));
                        String j = h.j(context2);
                        if (j != null && j.length() > 0) {
                            aVar2.a("carrier", j);
                        }
                        String d = c.d(context2);
                        if (!TextUtils.isEmpty(d)) {
                            aVar2.a("instlr", d);
                        }
                        String B = h.B(context2);
                        if (!TextUtils.isEmpty(B)) {
                            aVar2.a("dt", B);
                        }
                        aVar2.a("bid", context2.getPackageName());
                        aVar2.a("mem", String.valueOf(h.e(context2)));
                        aVar2.a("tkv", "2.0");
                        aVar2.a("tsu", Long.valueOf(c.b(context2)));
                        aVar2.a("tai", Long.valueOf(c.a(context2)));
                        aVar2.a("apv", c.c(context2));
                        aVar2.a("ptype", Integer.valueOf(a.AnonymousClass1.f(context2)));
                        aVar2.a("simop", a.AnonymousClass1.e(context2));
                    }
                    a.this.a(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    public void d(String str) {
        C0119m.a("plugin", str);
    }
}
