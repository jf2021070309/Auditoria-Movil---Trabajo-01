package com.amazon.aps.iva.nc;
/* compiled from: DiskCacheStrategy.java */
/* loaded from: classes.dex */
public abstract class l {
    public static final a a = new a();
    public static final b b = new b();
    public static final c c = new c();
    public static final e d;

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class a extends l {
        @Override // com.amazon.aps.iva.nc.l
        public final boolean a() {
            return true;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean b() {
            return true;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean c(com.amazon.aps.iva.kc.a aVar) {
            if (aVar == com.amazon.aps.iva.kc.a.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean d(boolean z, com.amazon.aps.iva.kc.a aVar, com.amazon.aps.iva.kc.c cVar) {
            if (aVar != com.amazon.aps.iva.kc.a.RESOURCE_DISK_CACHE && aVar != com.amazon.aps.iva.kc.a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class b extends l {
        @Override // com.amazon.aps.iva.nc.l
        public final boolean a() {
            return false;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean b() {
            return false;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean c(com.amazon.aps.iva.kc.a aVar) {
            return false;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean d(boolean z, com.amazon.aps.iva.kc.a aVar, com.amazon.aps.iva.kc.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class c extends l {
        @Override // com.amazon.aps.iva.nc.l
        public final boolean a() {
            return true;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean b() {
            return false;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean c(com.amazon.aps.iva.kc.a aVar) {
            if (aVar != com.amazon.aps.iva.kc.a.DATA_DISK_CACHE && aVar != com.amazon.aps.iva.kc.a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean d(boolean z, com.amazon.aps.iva.kc.a aVar, com.amazon.aps.iva.kc.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class d extends l {
        @Override // com.amazon.aps.iva.nc.l
        public final boolean a() {
            return false;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean b() {
            return true;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean c(com.amazon.aps.iva.kc.a aVar) {
            return false;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean d(boolean z, com.amazon.aps.iva.kc.a aVar, com.amazon.aps.iva.kc.c cVar) {
            if (aVar != com.amazon.aps.iva.kc.a.RESOURCE_DISK_CACHE && aVar != com.amazon.aps.iva.kc.a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class e extends l {
        @Override // com.amazon.aps.iva.nc.l
        public final boolean a() {
            return true;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean b() {
            return true;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean c(com.amazon.aps.iva.kc.a aVar) {
            if (aVar == com.amazon.aps.iva.kc.a.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.nc.l
        public final boolean d(boolean z, com.amazon.aps.iva.kc.a aVar, com.amazon.aps.iva.kc.c cVar) {
            if (((z && aVar == com.amazon.aps.iva.kc.a.DATA_DISK_CACHE) || aVar == com.amazon.aps.iva.kc.a.LOCAL) && cVar == com.amazon.aps.iva.kc.c.TRANSFORMED) {
                return true;
            }
            return false;
        }
    }

    static {
        new d();
        d = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(com.amazon.aps.iva.kc.a aVar);

    public abstract boolean d(boolean z, com.amazon.aps.iva.kc.a aVar, com.amazon.aps.iva.kc.c cVar);
}
