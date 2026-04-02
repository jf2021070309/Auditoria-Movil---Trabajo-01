package e.b.a.a.b0.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import ch.qos.logback.classic.spi.CallerData;
/* loaded from: classes.dex */
public class c {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public String f5256b;

    /* renamed from: c  reason: collision with root package name */
    public String f5257c;

    /* renamed from: d  reason: collision with root package name */
    public String f5258d;

    /* renamed from: e  reason: collision with root package name */
    public final SQLiteDatabase f5259e;

    /* renamed from: f  reason: collision with root package name */
    public final StringBuilder f5260f = new StringBuilder();

    /* renamed from: g  reason: collision with root package name */
    public SQLiteStatement f5261g;

    /* renamed from: h  reason: collision with root package name */
    public SQLiteStatement f5262h;

    /* renamed from: i  reason: collision with root package name */
    public SQLiteStatement f5263i;

    /* renamed from: j  reason: collision with root package name */
    public SQLiteStatement f5264j;

    /* renamed from: k  reason: collision with root package name */
    public SQLiteStatement f5265k;

    /* renamed from: l  reason: collision with root package name */
    public SQLiteStatement f5266l;

    /* renamed from: m  reason: collision with root package name */
    public SQLiteStatement f5267m;

    /* renamed from: n  reason: collision with root package name */
    public SQLiteStatement f5268n;

    /* loaded from: classes.dex */
    public static class a {
        public final String a;

        public a(String str, String str2) {
            this.a = str2;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final C0106c a;

        /* renamed from: b  reason: collision with root package name */
        public final a f5269b;

        /* loaded from: classes.dex */
        public enum a {
            ASC,
            DESC
        }

        public b(C0106c c0106c, a aVar) {
            this.a = c0106c;
            this.f5269b = aVar;
        }
    }

    /* renamed from: e.b.a.a.b0.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0106c {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final a f5270b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f5271c;

        /* renamed from: d  reason: collision with root package name */
        public final String f5272d;

        /* renamed from: e  reason: collision with root package name */
        public final String f5273e;

        public C0106c(String str, String str2, int i2) {
            this.f5272d = str;
            this.f5273e = str2;
            this.a = i2;
            this.f5270b = null;
            this.f5271c = false;
        }

        public C0106c(String str, String str2, int i2, a aVar) {
            this.f5272d = str;
            this.f5273e = str2;
            this.a = i2;
            this.f5270b = aVar;
            this.f5271c = false;
        }

        public C0106c(String str, String str2, int i2, a aVar, boolean z) {
            this.f5272d = str;
            this.f5273e = str2;
            this.a = i2;
            this.f5270b = null;
            this.f5271c = z;
        }
    }

    public c(SQLiteDatabase sQLiteDatabase, String str, String str2, int i2, String str3, int i3, long j2) {
        this.f5259e = sQLiteDatabase;
        StringBuilder B = e.a.d.a.a.B("SELECT * FROM ", str, " WHERE ");
        C0106c c0106c = e.b.a.a.b0.a.a.f5243b;
        this.a = e.a.d.a.a.r(B, "_id", " = ?");
        C0106c c0106c2 = e.b.a.a.b0.a.a.f5255n;
        C0106c c0106c3 = e.b.a.a.b0.a.a.o;
        this.f5256b = "SELECT _id FROM " + str;
        this.f5257c = "SELECT tag_name FROM job_holder_tags WHERE job_id = ?";
        StringBuilder B2 = e.a.d.a.a.B("UPDATE ", str, " SET ");
        C0106c c0106c4 = e.b.a.a.b0.a.a.f5253l;
        this.f5258d = e.a.d.a.a.r(B2, "cancelled", " = 0");
    }

    public static void a(StringBuilder sb, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("cannot create placeholders for 0 items");
        }
        sb.append(CallerData.NA);
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(",?");
        }
    }

    public static String b(String str, C0106c c0106c, C0106c... c0106cArr) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(str);
        sb.append(" (");
        sb.append(c0106c.f5272d);
        sb.append(" ");
        sb.append(c0106c.f5273e);
        sb.append("  primary key ");
        for (C0106c c0106c2 : c0106cArr) {
            sb.append(", `");
            sb.append(c0106c2.f5272d);
            sb.append("` ");
            sb.append(c0106c2.f5273e);
            if (c0106c2.f5271c) {
                sb.append(" UNIQUE");
            }
        }
        for (C0106c c0106c3 : c0106cArr) {
            a aVar = c0106c3.f5270b;
            if (aVar != null) {
                sb.append(", FOREIGN KEY(`");
                sb.append(c0106c3.f5272d);
                sb.append("`) REFERENCES ");
                sb.append("job_holder");
                sb.append("(`");
                sb.append(aVar.a);
                sb.append("`) ON DELETE CASCADE");
            }
        }
        sb.append(" );");
        e.b.a.a.y.c.a.a(sb.toString(), new Object[0]);
        return sb.toString();
    }

    public String c(String str, Integer num, b... bVarArr) {
        this.f5260f.setLength(0);
        this.f5260f.append("SELECT * FROM ");
        this.f5260f.append("job_holder");
        if (str != null) {
            StringBuilder sb = this.f5260f;
            sb.append(" WHERE ");
            sb.append(str);
        }
        int length = bVarArr.length;
        boolean z = true;
        int i2 = 0;
        while (i2 < length) {
            b bVar = bVarArr[i2];
            if (z) {
                this.f5260f.append(" ORDER BY ");
            } else {
                this.f5260f.append(",");
            }
            StringBuilder sb2 = this.f5260f;
            sb2.append(bVar.a.f5272d);
            sb2.append(" ");
            sb2.append(bVar.f5269b);
            i2++;
            z = false;
        }
        if (num != null) {
            StringBuilder sb3 = this.f5260f;
            sb3.append(" LIMIT ");
            sb3.append(num);
        }
        return this.f5260f.toString();
    }

    public String d(String str, String str2, Integer num, b... bVarArr) {
        this.f5260f.setLength(0);
        e.a.d.a.a.M(this.f5260f, "SELECT ", str, " FROM ", "job_holder");
        if (str2 != null) {
            StringBuilder sb = this.f5260f;
            sb.append(" WHERE ");
            sb.append(str2);
        }
        int length = bVarArr.length;
        boolean z = true;
        int i2 = 0;
        while (i2 < length) {
            b bVar = bVarArr[i2];
            if (z) {
                this.f5260f.append(" ORDER BY ");
            } else {
                this.f5260f.append(",");
            }
            StringBuilder sb2 = this.f5260f;
            sb2.append(bVar.a.f5272d);
            sb2.append(" ");
            sb2.append(bVar.f5269b);
            i2++;
            z = false;
        }
        return this.f5260f.toString();
    }

    public SQLiteStatement e() {
        if (this.f5262h == null) {
            SQLiteDatabase sQLiteDatabase = this.f5259e;
            C0106c c0106c = e.b.a.a.b0.a.a.f5255n;
            this.f5262h = sQLiteDatabase.compileStatement("DELETE FROM job_holder_tags WHERE job_id= ?");
        }
        return this.f5262h;
    }

    public SQLiteStatement f() {
        if (this.f5263i == null) {
            this.f5263i = this.f5259e.compileStatement("DELETE FROM job_holder WHERE _id = ?");
        }
        return this.f5263i;
    }

    public SQLiteStatement g() {
        if (this.f5265k == null) {
            this.f5260f.setLength(0);
            StringBuilder sb = this.f5260f;
            sb.append("INSERT INTO ");
            sb.append("job_holder");
            this.f5260f.append(" VALUES (");
            for (int i2 = 0; i2 < 12; i2++) {
                if (i2 != 0) {
                    this.f5260f.append(",");
                }
                this.f5260f.append(CallerData.NA);
            }
            this.f5260f.append(")");
            this.f5265k = this.f5259e.compileStatement(this.f5260f.toString());
        }
        return this.f5265k;
    }
}
