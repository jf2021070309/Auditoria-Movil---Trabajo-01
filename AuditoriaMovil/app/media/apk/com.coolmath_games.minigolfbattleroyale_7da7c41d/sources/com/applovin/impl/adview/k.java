package com.applovin.impl.adview;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class k {
    private final com.applovin.impl.sdk.r a;
    private final Handler b;
    private final Set<b> c = new HashSet();
    private final AtomicInteger d = new AtomicInteger();

    /* loaded from: classes.dex */
    public interface a {
        void a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        private final String a;
        private final a b;
        private final long c;

        private b(String str, long j, a aVar) {
            this.a = str;
            this.c = j;
            this.b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a c() {
            return this.b;
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
            return "CountdownProxy{identifier='" + this.a + "', countdownStepMillis=" + this.c + '}';
        }
    }

    public k(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.b = handler;
        this.a = kVar.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final b bVar, final int i) {
        this.b.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.k.1
            @Override // java.lang.Runnable
            public void run() {
                a c = bVar.c();
                if (!c.b()) {
                    com.applovin.impl.sdk.r rVar = k.this.a;
                    rVar.b("CountdownManager", "Ending countdown for " + bVar.a());
                } else if (k.this.d.get() != i) {
                    com.applovin.impl.sdk.r rVar2 = k.this.a;
                    rVar2.d("CountdownManager", "Killing duplicate countdown from previous generation: " + bVar.a());
                } else {
                    try {
                        c.a();
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.r rVar3 = k.this.a;
                        rVar3.b("CountdownManager", "Encountered error on countdown step for: " + bVar.a(), th);
                    }
                    k.this.a(bVar, i);
                }
            }
        }, bVar.b());
    }

    public void a() {
        HashSet<b> hashSet = new HashSet(this.c);
        com.applovin.impl.sdk.r rVar = this.a;
        rVar.b("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        int incrementAndGet = this.d.incrementAndGet();
        for (b bVar : hashSet) {
            com.applovin.impl.sdk.r rVar2 = this.a;
            rVar2.b("CountdownManager", "Starting countdown: " + bVar.a() + " for generation " + incrementAndGet + "...");
            a(bVar, incrementAndGet);
        }
    }

    public void a(String str, long j, a aVar) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        }
        if (this.b == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        com.applovin.impl.sdk.r rVar = this.a;
        rVar.b("CountdownManager", "Adding countdown: " + str);
        this.c.add(new b(str, j, aVar));
    }

    public void b() {
        this.a.b("CountdownManager", "Removing all countdowns...");
        c();
        this.c.clear();
    }

    public void c() {
        this.a.b("CountdownManager", "Stopping countdowns...");
        this.d.incrementAndGet();
        this.b.removeCallbacksAndMessages(null);
    }
}
