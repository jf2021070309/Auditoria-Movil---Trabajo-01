package com.kwad.framework.filedownloader.message;
/* loaded from: classes.dex */
public final class e {
    private volatile g aea;
    private volatile b aeb;

    /* loaded from: classes.dex */
    public static final class a {
        private static final e aec = new e();
    }

    /* loaded from: classes.dex */
    public interface b {
        void r(MessageSnapshot messageSnapshot);
    }

    public static e vj() {
        return a.aec;
    }

    public final void a(b bVar) {
        this.aeb = bVar;
        if (bVar == null) {
            this.aea = null;
        } else {
            this.aea = new g(5, bVar);
        }
    }

    public final void s(MessageSnapshot messageSnapshot) {
        if (messageSnapshot instanceof com.kwad.framework.filedownloader.message.b) {
            if (this.aeb != null) {
                this.aeb.r(messageSnapshot);
            }
        } else if (this.aea != null) {
            this.aea.u(messageSnapshot);
        }
    }
}
