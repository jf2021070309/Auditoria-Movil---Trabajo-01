package net.hockeyapp.android.metrics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.PrivateEventManager;
import net.hockeyapp.android.metrics.model.Base;
import net.hockeyapp.android.metrics.model.Data;
import net.hockeyapp.android.metrics.model.Domain;
import net.hockeyapp.android.metrics.model.EventData;
import net.hockeyapp.android.metrics.model.SessionState;
import net.hockeyapp.android.metrics.model.SessionStateData;
import net.hockeyapp.android.metrics.model.TelemetryData;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.Util;
/* loaded from: classes4.dex */
public class MetricsManager {
    private static volatile MetricsManager d;
    private static WeakReference<Application> e;
    private static Sender f;
    private static net.hockeyapp.android.metrics.a g;
    private static c h;
    private volatile boolean i;
    private a j;
    private static boolean a = true;
    protected static final AtomicInteger ACTIVITY_COUNT = new AtomicInteger(0);
    protected static final AtomicLong LAST_BACKGROUND = new AtomicLong(f());
    private static final Integer b = 20000;
    private static final Object c = new Object();

    static /* synthetic */ long b() {
        return f();
    }

    protected MetricsManager(Context context, c cVar, Sender sender, b bVar, net.hockeyapp.android.metrics.a aVar) {
        h = cVar;
        sender = sender == null ? new Sender() : sender;
        f = sender;
        if (bVar == null) {
            bVar = new b(context, sender);
        } else {
            bVar.a(sender);
        }
        f.setPersistence(bVar);
        if (aVar == null) {
            g = new net.hockeyapp.android.metrics.a(h, bVar);
        } else {
            g = aVar;
        }
        if (bVar.a()) {
            bVar.e().triggerSending();
        }
    }

    public static void register(Application application) {
        String appIdentifier = Util.getAppIdentifier(application.getApplicationContext());
        if (appIdentifier == null || appIdentifier.length() == 0) {
            throw new IllegalArgumentException("HockeyApp app identifier was not configured correctly in manifest or build configuration.");
        }
        register(application, appIdentifier);
    }

    public static void register(Application application, String str) {
        register(application, str, null, null, null);
    }

    @Deprecated
    public static void register(Context context, Application application) {
        String appIdentifier = Util.getAppIdentifier(context);
        if (appIdentifier == null || appIdentifier.length() == 0) {
            throw new IllegalArgumentException("HockeyApp app identifier was not configured correctly in manifest or build configuration.");
        }
        register(context, application, appIdentifier);
    }

    @Deprecated
    public static void register(Context context, Application application, String str) {
        register(application, str, null, null, null);
    }

    protected static void register(Application application, String str, Sender sender, b bVar, net.hockeyapp.android.metrics.a aVar) {
        MetricsManager metricsManager;
        if (d == null) {
            synchronized (c) {
                MetricsManager metricsManager2 = d;
                if (metricsManager2 == null) {
                    Constants.loadFromContext(application.getApplicationContext());
                    MetricsManager metricsManager3 = new MetricsManager(application.getApplicationContext(), new c(application.getApplicationContext(), str), sender, bVar, aVar);
                    e = new WeakReference<>(application);
                    metricsManager = metricsManager3;
                } else {
                    metricsManager = metricsManager2;
                }
                metricsManager.i = !Util.sessionTrackingSupported();
                d = metricsManager;
                if (!metricsManager.i) {
                    setSessionTrackingDisabled(false);
                }
            }
            PrivateEventManager.addEventListener(new PrivateEventManager.HockeyEventListener() { // from class: net.hockeyapp.android.metrics.MetricsManager.1
                @Override // net.hockeyapp.android.PrivateEventManager.HockeyEventListener
                public void onHockeyEvent(PrivateEventManager.Event event) {
                    if (event.getType() == 1) {
                        MetricsManager.g.c();
                    }
                }
            });
        }
    }

    public static void disableUserMetrics() {
        a(false);
    }

    public static void enableUserMetrics() {
        a(true);
    }

    public static boolean isUserMetricsEnabled() {
        return a;
    }

    private static void a(boolean z) {
        a = z;
        if (a) {
            d.c();
        } else {
            d.d();
        }
    }

    public static boolean sessionTrackingEnabled() {
        return isUserMetricsEnabled() && !d.i;
    }

    public static void setSessionTrackingDisabled(Boolean bool) {
        if (d == null || !isUserMetricsEnabled()) {
            HockeyLog.warn("HA-MetricsManager", "MetricsManager hasn't been registered or User Metrics has been disabled. No User Metrics will be collected!");
            return;
        }
        synchronized (c) {
            if (Util.sessionTrackingSupported()) {
                d.i = bool.booleanValue();
                if (!bool.booleanValue()) {
                    d.c();
                }
            } else {
                d.i = true;
                d.d();
            }
        }
    }

    private void c() {
        if (this.j == null) {
            this.j = new a();
        }
        e().registerActivityLifecycleCallbacks(this.j);
    }

    private void d() {
        if (this.j != null) {
            e().unregisterActivityLifecycleCallbacks(this.j);
            this.j = null;
        }
    }

    public static void setCustomServerURL(String str) {
        if (f != null) {
            f.setCustomServerURL(str);
        } else {
            HockeyLog.warn("HA-MetricsManager", "HockeyApp couldn't set the custom server url. Please register(...) the MetricsManager before setting the server URL.");
        }
    }

    private static Application e() {
        if (e == null) {
            return null;
        }
        return e.get();
    }

    private static long f() {
        return new Date().getTime();
    }

    protected static net.hockeyapp.android.metrics.a getChannel() {
        return g;
    }

    protected void setChannel(net.hockeyapp.android.metrics.a aVar) {
        g = aVar;
    }

    protected static Sender getSender() {
        return f;
    }

    protected static void setSender(Sender sender) {
        f = sender;
    }

    protected static MetricsManager getInstance() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (ACTIVITY_COUNT.getAndIncrement() == 0) {
            if (sessionTrackingEnabled()) {
                HockeyLog.debug("HA-MetricsManager", "Starting & tracking session");
                renewSession();
                return;
            }
            HockeyLog.debug("HA-MetricsManager", "Session management disabled by the developer");
            return;
        }
        long f2 = f();
        long andSet = LAST_BACKGROUND.getAndSet(f());
        boolean z = f2 - andSet >= ((long) b.intValue());
        HockeyLog.debug("HA-MetricsManager", "Checking if we have to renew a session, time difference is: " + (f2 - andSet));
        if (z && sessionTrackingEnabled()) {
            HockeyLog.debug("HA-MetricsManager", "Renewing session");
            renewSession();
        }
    }

    protected void renewSession() {
        h.a(UUID.randomUUID().toString());
        a(SessionState.START);
    }

    private void a(final SessionState sessionState) {
        try {
            AsyncTaskUtils.execute(new AsyncTask<Void, Void, Void>() { // from class: net.hockeyapp.android.metrics.MetricsManager.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                /* renamed from: a */
                public Void doInBackground(Void... voidArr) {
                    SessionStateData sessionStateData = new SessionStateData();
                    sessionStateData.setState(sessionState);
                    MetricsManager.g.a((Base) MetricsManager.createData(sessionStateData));
                    return null;
                }
            });
        } catch (RejectedExecutionException e2) {
            HockeyLog.error("Could not track session state. Executor rejected async task.", e2);
        }
    }

    protected static Data<Domain> createData(TelemetryData telemetryData) {
        Data<Domain> data = new Data<>();
        data.setBaseData(telemetryData);
        data.setBaseType(telemetryData.getBaseType());
        data.QualifiedName = telemetryData.getEnvelopeName();
        return data;
    }

    public static void trackEvent(String str) {
        trackEvent(str, null);
    }

    public static void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, null);
    }

    public static void trackEvent(String str, Map<String, String> map, Map<String, Double> map2) {
        if (!TextUtils.isEmpty(str)) {
            if (d == null) {
                Log.w("HA-MetricsManager", "MetricsManager hasn't been registered or User Metrics has been disabled. No User Metrics will be collected!");
            } else if (!isUserMetricsEnabled()) {
                HockeyLog.warn("User Metrics is disabled. Will not track event.");
            } else {
                final EventData eventData = new EventData();
                eventData.setName(str);
                if (map != null) {
                    eventData.setProperties(map);
                }
                if (map2 != null) {
                    eventData.setMeasurements(map2);
                }
                try {
                    AsyncTaskUtils.execute(new AsyncTask<Void, Void, Void>() { // from class: net.hockeyapp.android.metrics.MetricsManager.3
                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // android.os.AsyncTask
                        /* renamed from: a */
                        public Void doInBackground(Void... voidArr) {
                            MetricsManager.g.a((Base) MetricsManager.createData(EventData.this));
                            return null;
                        }
                    });
                } catch (RejectedExecutionException e2) {
                    HockeyLog.error("Could not track custom event. Executor rejected async task.", e2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        private final long b;
        private Timer c;
        private TimerTask d;

        private a() {
            this.b = 2000L;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            MetricsManager.this.g();
            if (this.d != null) {
                this.d.cancel();
                this.d = null;
            }
            if (this.c != null) {
                this.c.cancel();
                this.c = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            MetricsManager.LAST_BACKGROUND.set(MetricsManager.b());
            this.c = new Timer();
            this.d = new TimerTask() { // from class: net.hockeyapp.android.metrics.MetricsManager.a.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    HockeyLog.debug("HA-MetricsManager", "Application goes into the background. Sending logs.");
                    MetricsManager.g.c();
                }
            };
            this.c.schedule(this.d, 2000L);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }
    }
}
