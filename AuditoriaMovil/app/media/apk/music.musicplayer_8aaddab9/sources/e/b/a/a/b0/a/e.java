package e.b.a.a.b0.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import e.b.a.a.b0.a.c;
/* loaded from: classes.dex */
public class e {
    public static final String a = Long.toString(Long.MIN_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final String f5281b = Long.toString(Long.MAX_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public final String[] f5282c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5283d;

    /* renamed from: e  reason: collision with root package name */
    public SQLiteStatement f5284e;

    /* renamed from: f  reason: collision with root package name */
    public String f5285f;

    /* renamed from: g  reason: collision with root package name */
    public SQLiteStatement f5286g;

    /* renamed from: h  reason: collision with root package name */
    public String f5287h;

    public e(long j2, String str, String[] strArr) {
        this.f5283d = str;
        this.f5282c = strArr;
    }

    public SQLiteStatement a(SQLiteDatabase sQLiteDatabase, StringBuilder sb) {
        SQLiteStatement sQLiteStatement = this.f5284e;
        if (sQLiteStatement == null) {
            sb.setLength(0);
            sb.append("SELECT SUM(case WHEN ");
            c.C0106c c0106c = a.f5245d;
            e.a.d.a.a.M(sb, "group_id", " is null then group_cnt else 1 end) from (", "SELECT count(*) group_cnt, ", "group_id");
            e.a.d.a.a.L(sb, " FROM ", "job_holder", " WHERE ");
            this.f5284e = sQLiteDatabase.compileStatement(e.a.d.a.a.t(sb, this.f5283d, " GROUP BY ", "group_id", ")"));
        } else {
            sQLiteStatement.clearBindings();
        }
        int i2 = 1;
        while (true) {
            String[] strArr = this.f5282c;
            if (i2 > strArr.length) {
                return this.f5284e;
            }
            this.f5284e.bindString(i2, strArr[i2 - 1]);
            i2++;
        }
    }

    public SQLiteStatement b(SQLiteDatabase sQLiteDatabase, c cVar) {
        SQLiteStatement sQLiteStatement = this.f5286g;
        if (sQLiteStatement == null) {
            c.C0106c c0106c = a.f5251j;
            String d2 = cVar.d("deadline", this.f5283d, null, new c.b[0]);
            c.C0106c c0106c2 = a.f5248g;
            String d3 = cVar.d("delay_until_ns", this.f5283d, null, new c.b[0]);
            StringBuilder sb = cVar.f5260f;
            sb.setLength(0);
            sb.append("SELECT * FROM (");
            sb.append(d2);
            sb.append(" ORDER BY 1 ASC LIMIT 1");
            this.f5286g = sQLiteDatabase.compileStatement(e.a.d.a.a.t(sb, ") UNION SELECT * FROM (", d3, " ORDER BY 1 ASC LIMIT 1", ") ORDER BY 1 ASC LIMIT 1"));
        } else {
            sQLiteStatement.clearBindings();
        }
        int i2 = 1;
        while (true) {
            String[] strArr = this.f5282c;
            if (i2 > strArr.length) {
                this.f5286g.bindString(1, f5281b);
                this.f5286g.bindString(this.f5282c.length + 1, a);
                return this.f5286g;
            }
            int i3 = i2 - 1;
            this.f5286g.bindString(i2, strArr[i3]);
            SQLiteStatement sQLiteStatement2 = this.f5286g;
            String[] strArr2 = this.f5282c;
            sQLiteStatement2.bindString(strArr2.length + i2, strArr2[i3]);
            i2++;
        }
    }
}
