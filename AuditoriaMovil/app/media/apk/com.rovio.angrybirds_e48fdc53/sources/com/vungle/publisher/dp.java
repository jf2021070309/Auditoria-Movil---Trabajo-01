package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.vungle.publisher.log.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
/* loaded from: classes4.dex */
public abstract class dp<I> implements gj<I> {
    Class<I> t;
    protected I u;
    @Inject
    protected ci v;

    protected abstract ContentValues a(boolean z);

    protected abstract <T extends dp<I>> a<T, I> b_();

    protected abstract String c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(StringBuilder sb, String str, Object obj) {
        a(sb, str, obj, false);
    }

    static void a(StringBuilder sb, String str, Object obj, boolean z) {
        if (!z) {
            sb.append(", ");
        }
        sb.append(str).append(": ").append(obj);
    }

    public I c_() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(I i) {
        this.u = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String h_() {
        return "id";
    }

    protected boolean i_() {
        return true;
    }

    public I d_() {
        I c_ = c_();
        if (i_() && c_ != null) {
            throw new SQLException("attempt to insert with non-auto generated id " + B());
        }
        Logger.d(Logger.DATABASE_TAG, "inserting " + this);
        long a2 = this.v.a(c(), null, a(true));
        if (this.t == null || Integer.class.equals(this.t)) {
            a((dp<I>) Integer.valueOf((int) a2));
        } else if (Long.class.equals(this.t)) {
            a((dp<I>) Long.valueOf(a2));
        }
        Logger.d(Logger.DATABASE_TAG, "inserted " + c_());
        return c_();
    }

    public void A() {
        c(false);
    }

    public void c(boolean z) {
        b_().a((a<T, I>) this, z);
    }

    public I e_() {
        if (c_() == null || b_().a((a<T, I>) c_()) == null) {
            return d_();
        }
        if (f_() != 1) {
            return null;
        }
        return c_();
    }

    @Override // com.vungle.publisher.gj
    public int f_() {
        String h_ = h_();
        I c_ = c_();
        if (c_ == null) {
            throw new IllegalArgumentException("null " + h_);
        }
        String c = c();
        String str = h_ + " " + c_;
        int a2 = this.v.a(c, a(false), h_() + " = ?", new String[]{c_.toString()}, 3);
        switch (a2) {
            case 0:
                Logger.d(Logger.DATABASE_TAG, "no " + c + " rows updated by " + str);
                break;
            case 1:
                Logger.d(Logger.DATABASE_TAG, "update successful " + B());
                break;
            default:
                Logger.w(Logger.DATABASE_TAG, "updated " + a2 + " " + c + " records for " + str);
                break;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public int q() {
        return b_().a(c_());
    }

    @Override // com.vungle.publisher.gj
    public String B() {
        return j_().append('}').toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public StringBuilder j_() {
        StringBuilder sb = new StringBuilder();
        sb.append('{').append(C()).append(":: ");
        a(sb, h_(), c_(), true);
        return sb;
    }

    protected String C() {
        return c();
    }

    public String toString() {
        return p().append('}').toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public StringBuilder p() {
        return j_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public static abstract class a<T extends dp<I>, I> {
        @Inject
        protected ci d;

        protected abstract T a(T t, Cursor cursor, boolean z);

        protected abstract I[] b(int i);

        protected abstract String c();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract T[] d(int i);

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract T g_();

        public int a(I... iArr) {
            int i = 0;
            int length = iArr == null ? 0 : iArr.length;
            if (length == 0) {
                Logger.d(Logger.DATABASE_TAG, "no " + c() + " records requested for delete");
                return 0;
            }
            T g_ = g_();
            boolean z = iArr instanceof String[];
            String[] strArr = z ? (String[]) iArr : new String[length];
            if (!z) {
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    strArr[i2] = String.valueOf(iArr[i]);
                    i++;
                    i2++;
                }
            }
            int delete = this.d.getWritableDatabase().delete(c(), g_.h_() + " IN (" + ce.a(length) + ")", strArr);
            if (delete == length) {
                Logger.d(Logger.DATABASE_TAG, "deleted " + delete + " " + c() + " records by " + g_.h_() + " in " + zk.b(iArr));
                return delete;
            }
            Logger.w(Logger.DATABASE_TAG, "deleted " + delete + " of " + length + " requested records by " + g_.h_() + " in " + zk.b(iArr));
            return delete;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int a(List<T> list) {
            return b(list == null ? null : (dp[]) list.toArray(d(list.size())));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int b(T... tArr) {
            int i = 0;
            Object[] objArr = null;
            if (tArr != null) {
                objArr = b(tArr.length);
                int length = tArr.length;
                int i2 = 0;
                while (i < length) {
                    objArr[i2] = tArr[i].c_();
                    i++;
                    i2++;
                }
            }
            return a(objArr);
        }

        public List<T> a(String str, String[] strArr) {
            return a(str, strArr, (String) null);
        }

        public T a(I i) {
            return a((a<T, I>) i, false);
        }

        public T a(I i, boolean z) {
            return a((a<T, I>) i, (String) null, (String[]) null, z);
        }

        public T a(I i, String str, String[] strArr, boolean z) {
            T g_ = g_();
            g_.a(i);
            return a((a<T, I>) g_, str, strArr, z);
        }

        protected T a(T t, boolean z) {
            return a((a<T, I>) t, (String) null, (String[]) null, z);
        }

        protected T a(T t, String str, String[] strArr, boolean z) {
            if (t == null) {
                throw new IllegalArgumentException("null model");
            }
            String h_ = t.h_();
            if (h_ == null) {
                throw new IllegalArgumentException("null id name");
            }
            Object c_ = t.c_();
            if (c_ == null) {
                throw new IllegalArgumentException("null " + h_);
            }
            StringBuilder append = new StringBuilder().append(h_).append(" = ?");
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.valueOf(c_));
            if (str != null) {
                append.append(" AND ").append(str);
                if (strArr != null) {
                    arrayList.addAll(Arrays.asList(strArr));
                }
            }
            String sb = append.toString();
            List<T> a = a(sb, (String[]) arrayList.toArray(new String[arrayList.size()]), (String) null, (String) null);
            int size = a.size();
            switch (size) {
                case 0:
                    return null;
                case 1:
                    return a.get(0);
                default:
                    throw new SQLException(size + " " + c() + " records found for query: " + sb + ", parameters: " + zk.a(arrayList));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public List<T> a(String str, String[] strArr, String str2) {
            return a(str, strArr, str2, (String) null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public List<T> a(String str, String[] strArr, String str2, String str3) {
            Cursor cursor;
            int count;
            try {
                String c = c();
                Logger.d(Logger.DATABASE_TAG, "fetching " + (str == null ? "all " + c + " records" : c + " records by " + str + " " + zk.b(strArr)));
                Cursor query = this.d.getReadableDatabase().query(c, null, str, strArr, null, null, str2, str3);
                try {
                    Logger.v(Logger.DATABASE_TAG, (query.getCount() == 0 ? "no " : "fetched " + count + " ") + c + " records by " + str + " " + zk.b(strArr));
                    List<T> b = b(query);
                    if (query != null) {
                        query.close();
                    }
                    return b;
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public boolean b(String str, String[] strArr) {
            boolean z = false;
            Cursor cursor = null;
            try {
                cursor = this.d.getWritableDatabase().rawQuery("SELECT EXISTS (SELECT 1 FROM " + c() + " WHERE " + str + " LIMIT 1)", strArr);
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) != 0) {
                        z = true;
                    }
                }
                return z;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public List<I> a(T... tArr) {
            ArrayList arrayList = new ArrayList(tArr.length);
            for (T t : tArr) {
                arrayList.add(t.d_());
            }
            return arrayList;
        }

        protected List<T> b(Cursor cursor) {
            return a(cursor, false);
        }

        protected List<T> a(Cursor cursor, boolean z) {
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                arrayList.add(b(g_(), cursor, z));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final T b(T t, Cursor cursor, boolean z) {
            a((a<T, I>) t, cursor, z);
            Logger.v(Logger.DATABASE_TAG, "fetched " + t);
            return t;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final List<T> b(List<String> list) {
            List<T> a = a("id NOT IN (" + ce.a(list.size()) + ")", (String[]) list.toArray(new String[list.size()]), (String) null);
            Logger.v(Logger.DATABASE_TAG, "getAllExcept count: " + a.size());
            return a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final List<T> c(List<String> list) {
            List<T> a = a("id IN (" + ce.a(list.size()) + ")", (String[]) list.toArray(new String[list.size()]), (String) null);
            Logger.v(Logger.DATABASE_TAG, "getAll count: " + a.size());
            return a;
        }
    }
}
