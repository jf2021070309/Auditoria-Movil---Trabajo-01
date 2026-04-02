package e.a.c;

import e.h.g.j0;
/* loaded from: classes.dex */
public final /* synthetic */ class q implements j0.b {
    public static final /* synthetic */ q a = new q();

    @Override // e.h.g.j0.b
    public final void a() {
        synchronized (n6.a) {
            e.h.e.g.g("Heartbeat");
            if (!g7.a("bb", false) && e.h.e.g.j("FHeartbeat")) {
                g7.j("bb", true);
            }
        }
    }
}
