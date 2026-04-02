package e.b.a.a.b0.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import e.b.a.a.b0.a.c;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class a extends SQLiteOpenHelper {
    public static final c.C0106c a = new c.C0106c("insertionOrder", "integer", 0);

    /* renamed from: b  reason: collision with root package name */
    public static final c.C0106c f5243b;

    /* renamed from: c  reason: collision with root package name */
    public static final c.C0106c f5244c;

    /* renamed from: d  reason: collision with root package name */
    public static final c.C0106c f5245d;

    /* renamed from: e  reason: collision with root package name */
    public static final c.C0106c f5246e;

    /* renamed from: f  reason: collision with root package name */
    public static final c.C0106c f5247f;

    /* renamed from: g  reason: collision with root package name */
    public static final c.C0106c f5248g;

    /* renamed from: h  reason: collision with root package name */
    public static final c.C0106c f5249h;

    /* renamed from: i  reason: collision with root package name */
    public static final c.C0106c f5250i;

    /* renamed from: j  reason: collision with root package name */
    public static final c.C0106c f5251j;

    /* renamed from: k  reason: collision with root package name */
    public static final c.C0106c f5252k;

    /* renamed from: l  reason: collision with root package name */
    public static final c.C0106c f5253l;

    /* renamed from: m  reason: collision with root package name */
    public static final c.C0106c f5254m;

    /* renamed from: n  reason: collision with root package name */
    public static final c.C0106c f5255n;
    public static final c.C0106c o;
    public static final HashMap<String, a> p;

    static {
        c.C0106c c0106c = new c.C0106c("_id", "text", 1, null, true);
        f5243b = c0106c;
        f5244c = new c.C0106c("priority", "integer", 2);
        f5245d = new c.C0106c("group_id", "text", 3);
        f5246e = new c.C0106c("run_count", "integer", 4);
        f5247f = new c.C0106c("created_ns", "long", 5);
        f5248g = new c.C0106c("delay_until_ns", "long", 6);
        f5249h = new c.C0106c("running_session_id", "long", 7);
        f5250i = new c.C0106c("network_type", "integer", 8);
        f5251j = new c.C0106c("deadline", "integer", 9);
        f5252k = new c.C0106c("cancel_on_deadline", "integer", 10);
        f5253l = new c.C0106c("cancelled", "integer", 11);
        f5254m = new c.C0106c("_id", "integer", 0);
        f5255n = new c.C0106c("job_id", "text", 1, new c.a("job_holder", c0106c.f5272d));
        o = new c.C0106c("tag_name", "text", 2);
        p = new HashMap<>();
    }

    public a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 12);
        new AtomicInteger();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(c.b("job_holder", a, f5243b, f5244c, f5245d, f5246e, f5247f, f5248g, f5249h, f5250i, f5251j, f5252k, f5253l));
        sQLiteDatabase.execSQL(c.b("job_holder_tags", f5254m, f5255n, o));
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS TAG_NAME_INDEX ON job_holder_tags(tag_name)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        onUpgrade(sQLiteDatabase, i2, i3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 == 11) {
            sQLiteDatabase.execSQL("ALTER TABLE job_holder ADD COLUMN cancelled integer");
            return;
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS job_holder");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS job_holder_tags");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS TAG_NAME_INDEX");
        onCreate(sQLiteDatabase);
    }
}
