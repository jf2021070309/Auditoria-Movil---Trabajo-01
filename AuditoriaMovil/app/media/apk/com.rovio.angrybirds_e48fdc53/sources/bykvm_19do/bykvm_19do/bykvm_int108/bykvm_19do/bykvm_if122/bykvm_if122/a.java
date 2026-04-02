package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122.bykvm_if122;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.j;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class a<T> {
    protected final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(String str) {
        this.a = str;
    }

    protected abstract ContentValues a(T t);

    protected abstract HashMap<String, String> a();

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.a);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> a = a();
            if (a != null) {
                for (String str : a.keySet()) {
                    sb.append(str);
                    sb.append(" ");
                    sb.append(a.get(str));
                    sb.append(",");
                }
                sb.delete(sb.length() - 1, sb.length());
                sb.append(")");
                sQLiteDatabase.execSQL(sb.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase, T t) {
        if (sQLiteDatabase == null || t == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.a, null, a((a<T>) t));
        } catch (Exception e) {
            j.b(e);
        }
    }
}
