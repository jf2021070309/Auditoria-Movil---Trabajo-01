package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Lifecycle.kt */
/* loaded from: classes.dex */
public abstract class g {
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>();

    /* compiled from: Lifecycle.kt */
    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        public static final C0034a Companion = new C0034a();

        /* compiled from: Lifecycle.kt */
        /* renamed from: androidx.lifecycle.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0034a {

            /* compiled from: Lifecycle.kt */
            /* renamed from: androidx.lifecycle.g$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0035a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    a = iArr;
                }
            }

            public static a a(b bVar) {
                com.amazon.aps.iva.yb0.j.f(bVar, "state");
                int i = C0035a.a[bVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return a.ON_PAUSE;
                    }
                    return a.ON_STOP;
                }
                return a.ON_DESTROY;
            }

            public static a b(b bVar) {
                com.amazon.aps.iva.yb0.j.f(bVar, "state");
                int i = C0035a.a[bVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 5) {
                            return null;
                        }
                        return a.ON_CREATE;
                    }
                    return a.ON_RESUME;
                }
                return a.ON_START;
            }

            public static a c(b bVar) {
                com.amazon.aps.iva.yb0.j.f(bVar, "state");
                int i = C0035a.a[bVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return a.ON_RESUME;
                    }
                    return a.ON_START;
                }
                return a.ON_CREATE;
            }
        }

        /* compiled from: Lifecycle.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                a = iArr;
            }
        }

        public static final a downFrom(b bVar) {
            Companion.getClass();
            return C0034a.a(bVar);
        }

        public static final a downTo(b bVar) {
            Companion.getClass();
            com.amazon.aps.iva.yb0.j.f(bVar, "state");
            int i = C0034a.C0035a.a[bVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return null;
                    }
                    return ON_DESTROY;
                }
                return ON_PAUSE;
            }
            return ON_STOP;
        }

        public static final a upFrom(b bVar) {
            Companion.getClass();
            return C0034a.b(bVar);
        }

        public static final a upTo(b bVar) {
            Companion.getClass();
            return C0034a.c(bVar);
        }

        public final b getTargetState() {
            switch (b.a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.kt */
    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "state");
            if (compareTo(bVar) >= 0) {
                return true;
            }
            return false;
        }
    }

    public abstract void addObserver(com.amazon.aps.iva.i5.n nVar);

    public abstract b getCurrentState();

    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public abstract void removeObserver(com.amazon.aps.iva.i5.n nVar);

    public final void setInternalScopeRef(AtomicReference<Object> atomicReference) {
        com.amazon.aps.iva.yb0.j.f(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
