package c.c0.d0.s;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class u implements t {
    public final c.v.f a;

    /* renamed from: b  reason: collision with root package name */
    public final c.v.b<s> f1530b;

    /* loaded from: classes.dex */
    public class a extends c.v.b<s> {
        public a(u uVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // c.v.b
        public void d(c.x.a.f.f fVar, s sVar) {
            s sVar2 = sVar;
            String str = sVar2.a;
            if (str == null) {
                fVar.a.bindNull(1);
            } else {
                fVar.a.bindString(1, str);
            }
            String str2 = sVar2.f1529b;
            if (str2 == null) {
                fVar.a.bindNull(2);
            } else {
                fVar.a.bindString(2, str2);
            }
        }
    }

    public u(c.v.f fVar) {
        this.a = fVar;
        this.f1530b = new a(this, fVar);
    }

    public List<String> a(String str) {
        c.v.h h2 = c.v.h.h("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            h2.m(1);
        } else {
            h2.r(1, str);
        }
        this.a.b();
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            h2.release();
        }
    }
}
