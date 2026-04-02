package com.ironsource.mediationsdk.utils;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractC0108b;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public final class e {
    d b;
    private String f;
    private Timer g = null;
    public Map<String, Integer> a = new HashMap();
    private Map<String, Integer> d = new HashMap();
    private Map<String, String> e = new HashMap();
    public IronSourceLoggerManager c = IronSourceLoggerManager.getLogger();

    public e(String str, d dVar) {
        this.f = str;
        this.b = dVar;
        a();
    }

    private void a(String str, int i) {
        this.d.put(str, Integer.valueOf(i));
        this.e.put(str, c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), e(str), i);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), f(str), c());
    }

    private int b(String str) {
        if (!c().equalsIgnoreCase(c(str))) {
            a(str);
        }
        return d(str);
    }

    private static Date b() {
        Random random = new Random();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, random.nextInt(10));
        gregorianCalendar.set(13, random.nextInt(60));
        gregorianCalendar.set(14, random.nextInt(1000));
        gregorianCalendar.add(5, 1);
        return gregorianCalendar.getTime();
    }

    private static String c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    private String c(String str) {
        if (this.e.containsKey(str)) {
            return this.e.get(str);
        }
        String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), f(str), c());
        this.e.put(str, stringFromSharedPrefs);
        return stringFromSharedPrefs;
    }

    private int d(String str) {
        if (this.d.containsKey(str)) {
            return this.d.get(str).intValue();
        }
        int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), e(str), 0);
        this.d.put(str, Integer.valueOf(intFromSharedPrefs));
        return intFromSharedPrefs;
    }

    private static String e(String str) {
        return str + "_counter";
    }

    private static String f(String str) {
        return str + "_day";
    }

    void a() {
        Timer timer = this.g;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.g = timer2;
        timer2.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.utils.e.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                synchronized (eVar) {
                    try {
                        for (String str : eVar.a.keySet()) {
                            eVar.a(str);
                        }
                        eVar.b.g();
                        eVar.a();
                    } catch (Exception e) {
                        eVar.c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "onTimerTick", e);
                    }
                }
            }
        }, b());
    }

    public final void a(AbstractC0108b abstractC0108b) {
        String d;
        synchronized (this) {
            try {
                d = d(abstractC0108b);
            } catch (Exception e) {
                this.c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "increaseShowCounter", e);
            }
            if (this.a.containsKey(d)) {
                a(d, b(d) + 1);
            }
        }
    }

    void a(String str) {
        this.d.put(str, 0);
        this.e.put(str, c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), e(str), 0);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), f(str), c());
    }

    public final boolean b(AbstractC0108b abstractC0108b) {
        synchronized (this) {
            try {
                try {
                    String d = d(abstractC0108b);
                    if (this.a.containsKey(d)) {
                        if (c().equalsIgnoreCase(c(d))) {
                            return false;
                        }
                        return this.a.get(d).intValue() <= d(d);
                    }
                    return false;
                } catch (Exception e) {
                    this.c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "shouldSendCapReleasedEvent", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(AbstractC0108b abstractC0108b) {
        synchronized (this) {
            try {
                try {
                    String d = d(abstractC0108b);
                    if (this.a.containsKey(d)) {
                        return this.a.get(d).intValue() <= b(d);
                    }
                    return false;
                } catch (Exception e) {
                    this.c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "isCapped", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d(AbstractC0108b abstractC0108b) {
        return this.f + "_" + abstractC0108b.f + "_" + abstractC0108b.j();
    }
}
