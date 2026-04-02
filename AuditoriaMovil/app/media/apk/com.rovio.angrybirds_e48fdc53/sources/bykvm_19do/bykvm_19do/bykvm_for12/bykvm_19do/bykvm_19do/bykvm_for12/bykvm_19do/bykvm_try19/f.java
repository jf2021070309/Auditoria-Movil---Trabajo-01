package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_try19;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class f implements e {
    private Context a;

    public f(Context context) {
        this.a = context;
    }

    public static String b() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_try19.e
    public List<d> a() {
        LinkedList linkedList;
        synchronized (this) {
            linkedList = new LinkedList();
            Cursor a = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.c.a(this.a, "trackurl", null, null, null, null, null, null);
            if (a != null) {
                while (a.moveToNext()) {
                    linkedList.add(new d(a.getString(a.getColumnIndex("id")), a.getString(a.getColumnIndex("url")), a.getInt(a.getColumnIndex("replaceholder")) > 0, a.getInt(a.getColumnIndex("retry"))));
                }
                if (a != null) {
                    a.close();
                }
            }
        }
        return linkedList;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_try19.e
    public void a(d dVar) {
        synchronized (this) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", dVar.a());
            contentValues.put("url", dVar.c());
            contentValues.put("replaceholder", Integer.valueOf(dVar.d() ? 1 : 0));
            contentValues.put("retry", Integer.valueOf(dVar.b()));
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.c.a(this.a, "trackurl", contentValues);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_try19.e
    public void b(d dVar) {
        synchronized (this) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.c.a(this.a, "trackurl", "id=?", new String[]{dVar.a()});
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_try19.e
    public void c(d dVar) {
        synchronized (this) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", dVar.a());
            contentValues.put("url", dVar.c());
            contentValues.put("replaceholder", Integer.valueOf(dVar.d() ? 1 : 0));
            contentValues.put("retry", Integer.valueOf(dVar.b()));
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.c.a(this.a, "trackurl", contentValues, "id=?", new String[]{dVar.a()});
        }
    }
}
