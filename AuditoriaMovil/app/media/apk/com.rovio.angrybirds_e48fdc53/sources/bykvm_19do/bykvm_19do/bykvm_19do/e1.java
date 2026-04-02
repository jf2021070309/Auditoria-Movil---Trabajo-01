package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.os.SystemProperties;
import android.util.Base64;
import android.util.Log;
import bykvm_19do.bykvm_19do.bykvm_19do.a1;
import com.bytedance.mapplog_dr.VivoIdentifier;
import com.facebook.appevents.AppEventsConstants;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e1 implements a1 {
    private static final String b = a("cGVyc2lzdC5zeXMuaWRlbnRpZmllcmlkLnN1cHBvcnRlZA==");
    private static final o0<Boolean> c = new a();
    private VivoIdentifier a;

    /* loaded from: classes.dex */
    static final class a extends o0<Boolean> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // bykvm_19do.bykvm_19do.bykvm_19do.o0
        /* renamed from: c */
        public Boolean a(Object... objArr) {
            return Boolean.valueOf("1".equals(e1.b(e1.b, AppEventsConstants.EVENT_PARAM_VALUE_NO)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(Context context) {
        try {
            l1.a(context);
        } catch (Throwable th) {
        }
        try {
            VivoIdentifier vivoIdentifier = new VivoIdentifier();
            this.a = vivoIdentifier;
            vivoIdentifier.preloadOaid(context);
        } catch (Throwable th2) {
            t0.b("OaidVivo", Log.getStackTraceString(th2));
        }
    }

    public static String a(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return c.b(new Object[0]).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, String str2) {
        try {
            return SystemProperties.get(str, str2);
        } catch (Throwable th) {
            return str2;
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.a1
    public boolean a(Context context) {
        return a();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.a1
    public a1.a b(Context context) {
        VivoIdentifier vivoIdentifier = this.a;
        if (vivoIdentifier == null) {
            return null;
        }
        return vivoIdentifier.getOaid(context);
    }
}
