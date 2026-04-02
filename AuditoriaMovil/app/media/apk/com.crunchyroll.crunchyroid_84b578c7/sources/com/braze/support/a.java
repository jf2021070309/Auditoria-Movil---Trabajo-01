package com.braze.support;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import bo.app.h3;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    /* renamed from: com.braze.support.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0940a extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0940a(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return t1.b(new StringBuilder("Unexpected system broadcast received ["), this.b, ']');
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
        }
    }

    private a() {
    }

    public static final h3 a(Intent intent, ConnectivityManager connectivityManager) {
        j.f(intent, "intent");
        j.f(connectivityManager, "connectivityManager");
        String action = intent.getAction();
        if (j.a("android.net.conn.CONNECTIVITY_CHANGE", action)) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (activeNetworkInfo != null && !booleanExtra) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type == 1 || type == 6) {
                            return h3.GREAT;
                        }
                        if (type != 9) {
                            return h3.NONE;
                        }
                        return h3.GOOD;
                    }
                    int subtype = activeNetworkInfo.getSubtype();
                    if (subtype != 3) {
                        if (subtype != 13 && subtype != 20) {
                            return h3.BAD;
                        }
                        return h3.GREAT;
                    }
                    return h3.GOOD;
                }
                return h3.NONE;
            } catch (SecurityException e) {
                BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, e, b.b);
                return h3.NONE;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, new C0940a(action), 2, (Object) null);
        return h3.NONE;
    }

    public static final h3 a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return h3.NONE;
        }
        int min = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (min > 14000) {
            return h3.GREAT;
        }
        if (min > 4000) {
            return h3.GOOD;
        }
        return h3.BAD;
    }
}
