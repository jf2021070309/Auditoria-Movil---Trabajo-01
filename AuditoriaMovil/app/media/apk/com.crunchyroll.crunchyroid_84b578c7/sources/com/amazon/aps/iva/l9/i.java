package com.amazon.aps.iva.l9;

import androidx.work.impl.WorkDatabase;
import com.amazon.aps.iva.p8.g;
/* compiled from: WorkDatabase.java */
/* loaded from: classes.dex */
public final class i extends g.b {
    @Override // com.amazon.aps.iva.p8.g.b
    public final void a(com.amazon.aps.iva.v8.a aVar) {
        aVar.a();
        try {
            int i = WorkDatabase.k;
            aVar.f("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            aVar.k();
        } finally {
            aVar.c();
        }
    }
}
