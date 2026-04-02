package net.hockeyapp.android.metrics;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.internal.ServerProtocol;
import com.facebook.places.model.PlaceFields;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.metrics.model.Application;
import net.hockeyapp.android.metrics.model.Device;
import net.hockeyapp.android.metrics.model.Internal;
import net.hockeyapp.android.metrics.model.Session;
import net.hockeyapp.android.metrics.model.User;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.Util;
/* loaded from: classes4.dex */
class c {
    protected final Device a;
    protected final Session b;
    protected final User c;
    protected final Internal d;
    protected final Application e;
    protected Context f;
    private final Object g;
    private SharedPreferences h;
    private String i;
    private String j;

    private c() {
        this.g = new Object();
        this.a = new Device();
        this.b = new Session();
        this.c = new User();
        this.e = new Application();
        this.d = new Internal();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context, String str) {
        this();
        this.h = context.getSharedPreferences("HOCKEY_APP_TELEMETRY_CONTEXT", 0);
        this.f = context;
        this.i = Util.convertAppIdentifierToGuid(str);
        c();
        b();
        e();
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str) {
        b(str);
    }

    protected void b(String str) {
        HockeyLog.debug("HockeyApp-Metrics", "Configuring session context");
        g(str);
        HockeyLog.debug("HockeyApp-Metrics", "Setting the isNew-flag to true, as we only count new sessions");
        i(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        SharedPreferences.Editor edit = this.h.edit();
        if (!this.h.getBoolean("SESSION_IS_FIRST", false)) {
            edit.putBoolean("SESSION_IS_FIRST", true);
            edit.apply();
            h(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            HockeyLog.debug("HockeyApp-Metrics", "It's our first session, writing true to SharedPreferences.");
            return;
        }
        h("false");
        HockeyLog.debug("HockeyApp-Metrics", "It's not their first session, writing false to SharedPreferences.");
    }

    protected void a() {
        HockeyLog.debug("HockeyApp-Metrics", "Configuring application context");
        this.j = "";
        if (Constants.APP_PACKAGE != null) {
            this.j = Constants.APP_PACKAGE;
        }
        d(String.format("%s (%S)", Constants.APP_VERSION_NAME, Constants.APP_VERSION));
        f("android:4.1.5");
    }

    protected void b() {
        HockeyLog.debug("HockeyApp-Metrics", "Configuring user context");
        HockeyLog.debug("Using pre-supplied anonymous device identifier.");
        e(Constants.CRASH_IDENTIFIER);
    }

    protected void c() {
        HockeyLog.debug("HockeyApp-Metrics", "Configuring device context");
        j(Build.VERSION.RELEASE);
        k("Android");
        l(Build.MODEL);
        m(Build.MANUFACTURER);
        n(Locale.getDefault().toString());
        o(Locale.getDefault().getLanguage());
        d();
        p(Constants.DEVICE_IDENTIFIER);
        if (((TelephonyManager) this.f.getSystemService(PlaceFields.PHONE)).getPhoneType() != 0) {
            q("Phone");
        } else {
            q("Tablet");
        }
        if (Util.isEmulator()) {
            l("[Emulator]" + this.a.getModel());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f != null) {
            WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
            if (Build.VERSION.SDK_INT >= 17) {
                Point point = new Point();
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (defaultDisplay != null) {
                    defaultDisplay.getRealSize(point);
                    i3 = point.x;
                    i2 = point.y;
                } else {
                    i2 = 0;
                }
            } else if (Build.VERSION.SDK_INT >= 13) {
                try {
                    Method method = Display.class.getMethod("getRawWidth", new Class[0]);
                    Method method2 = Display.class.getMethod("getRawHeight", new Class[0]);
                    Display defaultDisplay2 = windowManager.getDefaultDisplay();
                    int intValue = ((Integer) method.invoke(defaultDisplay2, new Object[0])).intValue();
                    i2 = ((Integer) method2.invoke(defaultDisplay2, new Object[0])).intValue();
                    i3 = intValue;
                } catch (Exception e) {
                    Point point2 = new Point();
                    Display defaultDisplay3 = windowManager.getDefaultDisplay();
                    if (defaultDisplay3 != null) {
                        defaultDisplay3.getRealSize(point2);
                        i = point2.x;
                        i3 = point2.y;
                    } else {
                        i = 0;
                    }
                    HockeyLog.debug("HockeyApp-Metrics", "Couldn't determine screen resolution: " + e.toString());
                    int i4 = i3;
                    i3 = i;
                    i2 = i4;
                }
            } else {
                Display defaultDisplay4 = windowManager.getDefaultDisplay();
                i3 = defaultDisplay4.getWidth();
                i2 = defaultDisplay4.getHeight();
            }
            c(String.valueOf(i2) + "x" + String.valueOf(i3));
        }
    }

    protected void e() {
        f("android:4.1.5");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<String, String> f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.e) {
            this.e.addToHashMap(linkedHashMap);
        }
        synchronized (this.a) {
            this.a.addToHashMap(linkedHashMap);
        }
        synchronized (this.b) {
            this.b.addToHashMap(linkedHashMap);
        }
        synchronized (this.c) {
            this.c.addToHashMap(linkedHashMap);
        }
        synchronized (this.d) {
            this.d.addToHashMap(linkedHashMap);
        }
        return linkedHashMap;
    }

    public String g() {
        String str;
        synchronized (this.g) {
            str = this.i;
        }
        return str;
    }

    public void c(String str) {
        synchronized (this.a) {
            this.a.setScreenResolution(str);
        }
    }

    public void d(String str) {
        synchronized (this.e) {
            this.e.setVer(str);
        }
    }

    public void e(String str) {
        synchronized (this.c) {
            this.c.setId(str);
        }
    }

    public void f(String str) {
        synchronized (this.d) {
            this.d.setSdkVersion(str);
        }
    }

    public void g(String str) {
        synchronized (this.b) {
            this.b.setId(str);
        }
    }

    public void h(String str) {
        synchronized (this.b) {
            this.b.setIsFirst(str);
        }
    }

    public void i(String str) {
        synchronized (this.b) {
            this.b.setIsNew(str);
        }
    }

    public void j(String str) {
        synchronized (this.a) {
            this.a.setOsVersion(str);
        }
    }

    public void k(String str) {
        synchronized (this.a) {
            this.a.setOs(str);
        }
    }

    public void l(String str) {
        synchronized (this.a) {
            this.a.setModel(str);
        }
    }

    public void m(String str) {
        synchronized (this.a) {
            this.a.setOemName(str);
        }
    }

    public void n(String str) {
        synchronized (this.a) {
            this.a.setLocale(str);
        }
    }

    public void o(String str) {
        synchronized (this.a) {
            this.a.setLanguage(str);
        }
    }

    public void p(String str) {
        synchronized (this.a) {
            this.a.setId(str);
        }
    }

    public void q(String str) {
        synchronized (this.a) {
            this.a.setType(str);
        }
    }
}
