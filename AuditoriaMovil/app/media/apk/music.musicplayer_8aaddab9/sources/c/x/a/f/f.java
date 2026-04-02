package c.x.a.f;

import android.database.sqlite.SQLiteStatement;
/* loaded from: classes.dex */
public class f extends e implements c.x.a.d {

    /* renamed from: b  reason: collision with root package name */
    public final SQLiteStatement f2845b;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2845b = sQLiteStatement;
    }

    public int a() {
        return this.f2845b.executeUpdateDelete();
    }
}
