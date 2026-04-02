package e.c.a.m.s;
/* loaded from: classes.dex */
public abstract class k {
    public static final k a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final k f5698b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final k f5699c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final k f5700d = new d();

    /* loaded from: classes.dex */
    public class a extends k {
        @Override // e.c.a.m.s.k
        public boolean a() {
            return true;
        }

        @Override // e.c.a.m.s.k
        public boolean b() {
            return true;
        }

        @Override // e.c.a.m.s.k
        public boolean c(e.c.a.m.a aVar) {
            return aVar == e.c.a.m.a.REMOTE;
        }

        @Override // e.c.a.m.s.k
        public boolean d(boolean z, e.c.a.m.a aVar, e.c.a.m.c cVar) {
            return (aVar == e.c.a.m.a.RESOURCE_DISK_CACHE || aVar == e.c.a.m.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends k {
        @Override // e.c.a.m.s.k
        public boolean a() {
            return false;
        }

        @Override // e.c.a.m.s.k
        public boolean b() {
            return false;
        }

        @Override // e.c.a.m.s.k
        public boolean c(e.c.a.m.a aVar) {
            return false;
        }

        @Override // e.c.a.m.s.k
        public boolean d(boolean z, e.c.a.m.a aVar, e.c.a.m.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c extends k {
        @Override // e.c.a.m.s.k
        public boolean a() {
            return true;
        }

        @Override // e.c.a.m.s.k
        public boolean b() {
            return false;
        }

        @Override // e.c.a.m.s.k
        public boolean c(e.c.a.m.a aVar) {
            return (aVar == e.c.a.m.a.DATA_DISK_CACHE || aVar == e.c.a.m.a.MEMORY_CACHE) ? false : true;
        }

        @Override // e.c.a.m.s.k
        public boolean d(boolean z, e.c.a.m.a aVar, e.c.a.m.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class d extends k {
        @Override // e.c.a.m.s.k
        public boolean a() {
            return true;
        }

        @Override // e.c.a.m.s.k
        public boolean b() {
            return true;
        }

        @Override // e.c.a.m.s.k
        public boolean c(e.c.a.m.a aVar) {
            return aVar == e.c.a.m.a.REMOTE;
        }

        @Override // e.c.a.m.s.k
        public boolean d(boolean z, e.c.a.m.a aVar, e.c.a.m.c cVar) {
            return ((z && aVar == e.c.a.m.a.DATA_DISK_CACHE) || aVar == e.c.a.m.a.LOCAL) && cVar == e.c.a.m.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(e.c.a.m.a aVar);

    public abstract boolean d(boolean z, e.c.a.m.a aVar, e.c.a.m.c cVar);
}
