package com.iab.omid.library.applovin.walking.a;

import com.iab.omid.library.applovin.walking.a.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class c implements b.a {
    private final BlockingQueue<Runnable> a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f4837b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f4838c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f4839d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue;
        this.f4837b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f4838c.poll();
        this.f4839d = poll;
        if (poll != null) {
            poll.a(this.f4837b);
        }
    }

    @Override // com.iab.omid.library.applovin.walking.a.b.a
    public void a(b bVar) {
        this.f4839d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f4838c.add(bVar);
        if (this.f4839d == null) {
            a();
        }
    }
}
