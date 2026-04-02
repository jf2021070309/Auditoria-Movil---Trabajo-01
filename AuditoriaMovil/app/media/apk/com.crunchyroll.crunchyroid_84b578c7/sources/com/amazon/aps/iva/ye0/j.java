package com.amazon.aps.iva.ye0;

import com.amazon.aps.iva.se0.j0;
/* compiled from: Tasks.kt */
/* loaded from: classes4.dex */
public final class j extends g {
    public final Runnable d;

    public j(Runnable runnable, long j, h hVar) {
        super(j, hVar);
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.run();
        } finally {
            this.c.a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(j0.e(runnable));
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
