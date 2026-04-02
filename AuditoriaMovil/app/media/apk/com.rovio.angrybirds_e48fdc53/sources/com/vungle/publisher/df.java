package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.dp;
import com.vungle.publisher.log.Logger;
import java.io.File;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class df extends dp<Integer> {
    ej<?, ?> a;
    String b;
    Integer c;
    @Inject
    a d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: a */
    public a b_() {
        return this.d;
    }

    @Override // com.vungle.publisher.dp
    protected String c() {
        return "archive_entry";
    }

    ej<?, ?> e() {
        return this.a;
    }

    Integer h() {
        if (this.a == null) {
            return null;
        }
        return this.a.c_();
    }

    File i() {
        String n = n();
        if (n == null) {
            return null;
        }
        return new File(n);
    }

    String m() {
        return e().z();
    }

    String n() {
        return qr.a(m(), this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        return b(false);
    }

    boolean b(boolean z) {
        File i = i();
        if (this.c == null) {
            if (z) {
                r0 = i.exists();
                if (r0) {
                    Logger.v(Logger.PREPARE_TAG, i + " exists");
                } else {
                    Logger.i(Logger.PREPARE_TAG, i + " doesn't exist");
                }
            }
            Logger.w(Logger.PREPARE_TAG, i + " size is null");
            return r0;
        }
        int length = (int) i.length();
        int intValue = this.c.intValue();
        r0 = length == intValue;
        if (r0) {
            Logger.v(Logger.PREPARE_TAG, i + " size verified " + length);
            return r0;
        }
        Logger.d(Logger.PREPARE_TAG, i + " size " + length + " doesn't match expected " + intValue);
        return i.exists();
    }

    @Override // com.vungle.publisher.dp, com.vungle.publisher.gj
    public int f_() {
        if (this.u == 0) {
            Integer h = h();
            String str = this.b;
            Logger.d(Logger.DATABASE_TAG, "updating archive_entry by viewable_id " + h + ", relative_path " + str);
            int updateWithOnConflict = this.v.getWritableDatabase().updateWithOnConflict("archive_entry", a(false), "viewable_id = ? AND relative_path = ?", new String[]{String.valueOf(h), str}, 3);
            A();
            return updateWithOnConflict;
        }
        return super.f_();
    }

    @Override // com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues contentValues = new ContentValues();
        if (this.u != 0) {
            contentValues.put("id", (Integer) this.u);
        }
        contentValues.put("viewable_id", h());
        contentValues.put("relative_path", this.b);
        contentValues.put("size", this.c);
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    public StringBuilder p() {
        StringBuilder p = super.p();
        a(p, "viewable_id", h());
        a(p, "relative_path", this.b);
        a(p, "size", this.c);
        return p;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends dp.a<df, Integer> {
        @Inject
        Provider<df> a;

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ int a(List<df> list) {
            return super.a((List) list);
        }

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ List<df> a(String str, String[] strArr) {
            return super.a(str, strArr);
        }

        public df a(ej<?, ?> ejVar, File file, String str, int i) {
            df g_ = g_();
            g_.a = ejVar;
            g_.b = str;
            g_.c = Integer.valueOf(i);
            return g_;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int a(Integer num) {
            if (num == null) {
                throw new IllegalArgumentException("null viewable_id");
            }
            int delete = this.d.getWritableDatabase().delete("archive_entry", "viewable_id = ?", new String[]{String.valueOf(num)});
            Logger.d(Logger.DATABASE_TAG, "deleted " + delete + " archive_entry rows for viewable_id " + num);
            return delete;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public df[] a(ej<?, ?> ejVar) {
            Cursor cursor;
            if (ejVar == null) {
                throw new IllegalArgumentException("null archive");
            }
            Integer M = ejVar.c_();
            if (M == null) {
                throw new IllegalArgumentException("null viewable_id");
            }
            try {
                Logger.d(Logger.DATABASE_TAG, "fetching archive_entry records by viewable_id " + M);
                cursor = this.d.getReadableDatabase().query("archive_entry", null, "viewable_id = ?", new String[]{String.valueOf(M)}, null, null, null);
            } catch (Throwable th) {
                th = th;
                cursor = null;
            }
            try {
                df[] dfVarArr = new df[cursor.getCount()];
                int i = 0;
                while (cursor.moveToNext()) {
                    df a = a(g_(), ejVar, cursor);
                    dfVarArr[i] = a;
                    Logger.v(Logger.DATABASE_TAG, "fetched " + a);
                    i++;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return dfVarArr;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        df a(df dfVar, ej<?, ?> ejVar, Cursor cursor) {
            b(dfVar, cursor, false);
            dfVar.a = ejVar;
            return dfVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Type inference failed for: r0v1, types: [I, java.lang.Integer] */
        @Override // com.vungle.publisher.dp.a
        public df a(df dfVar, Cursor cursor, boolean z) {
            dfVar.u = ce.c(cursor, "id");
            dfVar.b = ce.e(cursor, "relative_path");
            dfVar.c = ce.c(cursor, "size");
            return dfVar;
        }

        @Override // com.vungle.publisher.dp.a
        protected String c() {
            return "archive_entry";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public df[] d(int i) {
            return new df[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public Integer[] b(int i) {
            return new Integer[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public df g_() {
            return this.a.get();
        }
    }
}
