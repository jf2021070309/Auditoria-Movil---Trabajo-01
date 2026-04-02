package com.applovin.impl.adview;

import android.os.Handler;
import ch.qos.logback.core.CoreConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class j {
    private final com.applovin.impl.sdk.v a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3224b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<b> f3225c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f3226d = new AtomicInteger();

    /* loaded from: classes.dex */
    public interface a {
        void a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b {
        private final String a;

        /* renamed from: b  reason: collision with root package name */
        private final a f3229b;

        /* renamed from: c  reason: collision with root package name */
        private final long f3230c;

        private b(String str, long j2, a aVar) {
            this.a = str;
            this.f3230c = j2;
            this.f3229b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f3230c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a c() {
            return this.f3229b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                String str = this.a;
                String str2 = ((b) obj).a;
                return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
            }
            return false;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("CountdownProxy{identifier='");
            e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", countdownStepMillis=");
            y.append(this.f3230c);
            y.append('}');
            return y.toString();
        }
    }

    public j(Handler handler, com.applovin.impl.sdk.m mVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f3224b = handler;
        this.a = mVar.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final b bVar, final int i2) {
        this.f3224b.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.j.1
            @Override // java.lang.Runnable
            public void run() {
                a c2 = bVar.c();
                if (!c2.b()) {
                    com.applovin.impl.sdk.v vVar = j.this.a;
                    StringBuilder y = e.a.d.a.a.y("Ending countdown for ");
                    y.append(bVar.a());
                    vVar.b("CountdownManager", y.toString());
                } else if (j.this.f3226d.get() != i2) {
                    com.applovin.impl.sdk.v vVar2 = j.this.a;
                    StringBuilder y2 = e.a.d.a.a.y("Killing duplicate countdown from previous generation: ");
                    y2.append(bVar.a());
                    vVar2.d("CountdownManager", y2.toString());
                } else {
                    try {
                        c2.a();
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.v vVar3 = j.this.a;
                        StringBuilder y3 = e.a.d.a.a.y("Encountered error on countdown step for: ");
                        y3.append(bVar.a());
                        vVar3.b("CountdownManager", y3.toString(), th);
                    }
                    j.this.a(bVar, i2);
                }
            }
        }, bVar.b());
    }

    public void a() {
        HashSet hashSet = new HashSet(this.f3225c);
        com.applovin.impl.sdk.v vVar = this.a;
        StringBuilder y = e.a.d.a.a.y("Starting ");
        y.append(hashSet.size());
        y.append(" countdowns...");
        vVar.b("CountdownManager", y.toString());
        int incrementAndGet = this.f3226d.incrementAndGet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            com.applovin.impl.sdk.v vVar2 = this.a;
            StringBuilder y2 = e.a.d.a.a.y("Starting countdown: ");
            y2.append(bVar.a());
            y2.append(" for generation ");
            y2.append(incrementAndGet);
            y2.append("...");
            vVar2.b("CountdownManager", y2.toString());
            a(bVar, incrementAndGet);
        }
    }

    public void a(String str, long j2, a aVar) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        }
        if (this.f3224b == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        com.applovin.impl.sdk.v vVar = this.a;
        vVar.b("CountdownManager", "Adding countdown: " + str);
        this.f3225c.add(new b(str, j2, aVar));
    }

    public void b() {
        this.a.b("CountdownManager", "Removing all countdowns...");
        c();
        this.f3225c.clear();
    }

    public void c() {
        this.a.b("CountdownManager", "Stopping countdowns...");
        this.f3226d.incrementAndGet();
        this.f3224b.removeCallbacksAndMessages(null);
    }
}
