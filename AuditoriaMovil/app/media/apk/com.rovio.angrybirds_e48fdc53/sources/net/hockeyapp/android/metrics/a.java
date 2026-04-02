package net.hockeyapp.android.metrics;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import net.hockeyapp.android.metrics.model.Base;
import net.hockeyapp.android.metrics.model.Data;
import net.hockeyapp.android.metrics.model.Domain;
import net.hockeyapp.android.metrics.model.Envelope;
import net.hockeyapp.android.metrics.model.TelemetryData;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.Util;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class a {
    private static final Object c = new Object();
    protected final c b;
    private final b d;
    private C0336a f;
    protected final List<String> a = new LinkedList();
    private final Timer e = new Timer("HockeyApp User Metrics Sender Queue", true);

    protected static int a() {
        return Util.isDebuggerConnected() ? 5 : 50;
    }

    protected static int b() {
        return Util.isDebuggerConnected() ? 3000 : 15000;
    }

    public a(c cVar, b bVar) {
        this.b = cVar;
        this.d = bVar;
    }

    protected void a(String str) {
        if (str != null) {
            synchronized (c) {
                if (this.a.add(str)) {
                    if (this.a.size() >= a()) {
                        c();
                    } else if (this.a.size() == 1) {
                        d();
                    }
                } else {
                    HockeyLog.verbose("HockeyApp-Metrics", "Unable to add item to queue");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        if (this.f != null) {
            this.f.cancel();
        }
        String[] strArr = null;
        synchronized (c) {
            if (!this.a.isEmpty()) {
                strArr = new String[this.a.size()];
                this.a.toArray(strArr);
                this.a.clear();
            }
        }
        if (this.d != null && strArr != null) {
            this.d.a(strArr);
        }
    }

    protected Envelope a(Data<Domain> data) {
        Envelope envelope = new Envelope();
        envelope.setData(data);
        Domain baseData = data.getBaseData();
        if (baseData instanceof TelemetryData) {
            envelope.setName(((TelemetryData) baseData).getEnvelopeName());
        }
        this.b.d();
        envelope.setTime(Util.dateToISO8601(new Date()));
        envelope.setIKey(this.b.g());
        Map<String, String> f = this.b.f();
        if (f != null) {
            envelope.setTags(f);
        }
        return envelope;
    }

    protected void d() {
        this.f = new C0336a();
        this.e.schedule(this.f, b());
    }

    public void a(Base base) {
        if (base instanceof Data) {
            Envelope envelope = null;
            try {
                envelope = a((Data) base);
            } catch (ClassCastException e) {
                HockeyLog.debug("HockeyApp-Metrics", "Telemetry not enqueued, could not create envelope, must be of type ITelemetry");
            }
            if (envelope != null) {
                a(a(envelope));
                HockeyLog.debug("HockeyApp-Metrics", "enqueued telemetry: " + envelope.getName());
                return;
            }
            return;
        }
        HockeyLog.debug("HockeyApp-Metrics", "Telemetry not enqueued, must be of type ITelemetry");
    }

    protected String a(Envelope envelope) {
        String str = null;
        try {
            if (envelope != null) {
                StringWriter stringWriter = new StringWriter();
                envelope.serialize(stringWriter);
                str = stringWriter.toString();
            } else {
                HockeyLog.debug("HockeyApp-Metrics", "Envelope wasn't empty but failed to serialize anything, returning null");
            }
        } catch (IOException e) {
            HockeyLog.debug("HockeyApp-Metrics", "Failed to save data with exception: " + e.toString());
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.hockeyapp.android.metrics.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0336a extends TimerTask {
        public C0336a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.this.c();
        }
    }
}
