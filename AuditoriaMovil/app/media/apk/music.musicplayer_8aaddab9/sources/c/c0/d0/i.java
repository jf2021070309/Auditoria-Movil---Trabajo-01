package c.c0.d0;

import androidx.work.impl.WorkDatabase;
import c.v.f;
/* loaded from: classes.dex */
public class i extends f.b {
    @Override // c.v.f.b
    public void a(c.x.a.b bVar) {
        ((c.x.a.f.a) bVar).f2835b.beginTransaction();
        try {
            int i2 = WorkDatabase.f654k;
            ((c.x.a.f.a) bVar).f2835b.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f653j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            ((c.x.a.f.a) bVar).f2835b.setTransactionSuccessful();
        } finally {
            ((c.x.a.f.a) bVar).f2835b.endTransaction();
        }
    }
}
