package e.b.a.a.b0.a;

import android.database.sqlite.SQLiteStatement;
import android.util.LruCache;
/* loaded from: classes.dex */
public class f {
    public final LruCache<Long, e> a = new a(this, 15);

    /* renamed from: b  reason: collision with root package name */
    public final String f5288b;

    /* loaded from: classes.dex */
    public class a extends LruCache<Long, e> {
        public a(f fVar, int i2) {
            super(i2);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z, Long l2, e eVar, e eVar2) {
            e eVar3 = eVar;
            SQLiteStatement sQLiteStatement = eVar3.f5284e;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
                eVar3.f5284e = null;
            }
            SQLiteStatement sQLiteStatement2 = eVar3.f5286g;
            if (sQLiteStatement2 != null) {
                sQLiteStatement2.close();
                eVar3.f5286g = null;
            }
        }
    }

    public f(long j2) {
        this.f5288b = Long.toString(j2);
    }
}
