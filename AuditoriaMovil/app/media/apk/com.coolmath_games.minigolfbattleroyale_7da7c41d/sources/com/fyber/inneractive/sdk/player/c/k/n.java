package com.fyber.inneractive.sdk.player.c.k;

import java.util.PriorityQueue;
/* loaded from: classes.dex */
public final class n {
    public final Object a;
    public final PriorityQueue<Integer> b;
    public int c;

    public final void a() {
        synchronized (this.a) {
            this.b.remove(0);
            this.c = this.b.isEmpty() ? Integer.MIN_VALUE : this.b.peek().intValue();
            this.a.notifyAll();
        }
    }
}
