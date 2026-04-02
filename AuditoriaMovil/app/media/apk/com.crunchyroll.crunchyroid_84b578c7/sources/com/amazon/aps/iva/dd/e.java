package com.amazon.aps.iva.dd;
/* compiled from: RequestCoordinator.java */
/* loaded from: classes.dex */
public interface e {

    /* compiled from: RequestCoordinator.java */
    /* loaded from: classes.dex */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        a(boolean z) {
            this.isComplete = z;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a();

    void b(d dVar);

    void e(d dVar);

    boolean g(d dVar);

    e getRoot();

    boolean h(d dVar);

    boolean i(d dVar);
}
