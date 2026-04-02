package c.v;

import c.x.a.c;
/* loaded from: classes.dex */
public class g extends c.a {

    /* renamed from: b  reason: collision with root package name */
    public c.v.a f2785b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2786c;

    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        public abstract void a(c.x.a.b bVar);

        public abstract b b(c.x.a.b bVar);
    }

    /* loaded from: classes.dex */
    public static class b {
        public final boolean a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2787b;

        public b(boolean z, String str) {
            this.a = z;
            this.f2787b = str;
        }
    }

    public g(c.v.a aVar, a aVar2, String str, String str2) {
        super(aVar2.a);
        this.f2785b = aVar;
        this.f2786c = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
        r0 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0076 A[EDGE_INSN: B:91:0x0076->B:37:0x0076 ?: BREAK  , SYNTHETIC] */
    @Override // c.x.a.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(c.x.a.b r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.v.g.b(c.x.a.b, int, int):void");
    }

    public final void c(c.x.a.b bVar) {
        c.x.a.f.a aVar = (c.x.a.f.a) bVar;
        aVar.f2835b.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar.f2835b.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }
}
