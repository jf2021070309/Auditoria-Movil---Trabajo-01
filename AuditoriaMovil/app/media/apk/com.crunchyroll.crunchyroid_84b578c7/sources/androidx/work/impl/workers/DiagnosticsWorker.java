package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.amazon.aps.iva.cq.b;
import com.amazon.aps.iva.k9.c;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.t9.g;
import com.amazon.aps.iva.t9.h;
import com.amazon.aps.iva.t9.i;
import com.amazon.aps.iva.t9.k;
import com.amazon.aps.iva.t9.l;
import com.amazon.aps.iva.t9.p;
import com.amazon.aps.iva.t9.q;
import com.amazon.aps.iva.t9.r;
import com.amazon.aps.iva.t9.t;
import com.amazon.aps.iva.t9.u;
import com.amazon.aps.iva.t9.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    static {
        m.e("DiagnosticsWrkr");
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(k kVar, t tVar, h hVar, ArrayList arrayList) {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g a = ((i) hVar).a(pVar.a);
            if (a != null) {
                num = Integer.valueOf(a.b);
            } else {
                num = null;
            }
            Integer num2 = num;
            String str = pVar.a;
            l lVar = (l) kVar;
            lVar.getClass();
            com.amazon.aps.iva.p8.i f = com.amazon.aps.iva.p8.i.f(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                f.i(1);
            } else {
                f.k(1, str);
            }
            com.amazon.aps.iva.p8.g gVar = lVar.a;
            gVar.b();
            Cursor g = gVar.g(f);
            try {
                ArrayList arrayList2 = new ArrayList(g.getCount());
                while (g.moveToNext()) {
                    arrayList2.add(g.getString(0));
                }
                g.close();
                f.release();
                ArrayList a2 = ((u) tVar).a(pVar.a);
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.a, pVar.c, num2, pVar.b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", a2)));
            } catch (Throwable th) {
                g.close();
                f.release();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        com.amazon.aps.iva.p8.i iVar;
        ArrayList arrayList;
        h hVar;
        k kVar;
        t tVar;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        WorkDatabase workDatabase = com.amazon.aps.iva.l9.k.c(getApplicationContext()).c;
        q n = workDatabase.n();
        k l = workDatabase.l();
        t o = workDatabase.o();
        h k = workDatabase.k();
        r rVar = (r) n;
        rVar.getClass();
        com.amazon.aps.iva.p8.i f = com.amazon.aps.iva.p8.i.f(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        f.h(1, System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        com.amazon.aps.iva.p8.g gVar = rVar.a;
        gVar.b();
        Cursor g = gVar.g(f);
        try {
            int R = b.R(g, "required_network_type");
            int R2 = b.R(g, "requires_charging");
            int R3 = b.R(g, "requires_device_idle");
            int R4 = b.R(g, "requires_battery_not_low");
            int R5 = b.R(g, "requires_storage_not_low");
            int R6 = b.R(g, "trigger_content_update_delay");
            int R7 = b.R(g, "trigger_max_content_delay");
            int R8 = b.R(g, "content_uri_triggers");
            int R9 = b.R(g, "id");
            int R10 = b.R(g, "state");
            int R11 = b.R(g, "worker_class_name");
            int R12 = b.R(g, "input_merger_class_name");
            int R13 = b.R(g, "input");
            int R14 = b.R(g, "output");
            iVar = f;
            try {
                int R15 = b.R(g, "initial_delay");
                int R16 = b.R(g, "interval_duration");
                int R17 = b.R(g, "flex_duration");
                int R18 = b.R(g, "run_attempt_count");
                int R19 = b.R(g, "backoff_policy");
                int R20 = b.R(g, "backoff_delay_duration");
                int R21 = b.R(g, "period_start_time");
                int R22 = b.R(g, "minimum_retention_duration");
                int R23 = b.R(g, "schedule_requested_at");
                int R24 = b.R(g, "run_in_foreground");
                int R25 = b.R(g, "out_of_quota_policy");
                int i2 = R14;
                ArrayList arrayList2 = new ArrayList(g.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!g.moveToNext()) {
                        break;
                    }
                    String string = g.getString(R9);
                    String string2 = g.getString(R11);
                    int i3 = R11;
                    c cVar = new c();
                    int i4 = R;
                    cVar.a = v.c(g.getInt(R));
                    if (g.getInt(R2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.b = z;
                    if (g.getInt(R3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.c = z2;
                    if (g.getInt(R4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.d = z3;
                    if (g.getInt(R5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.e = z4;
                    int i5 = R2;
                    int i6 = R3;
                    cVar.f = g.getLong(R6);
                    cVar.g = g.getLong(R7);
                    cVar.h = v.a(g.getBlob(R8));
                    p pVar = new p(string, string2);
                    pVar.b = v.e(g.getInt(R10));
                    pVar.d = g.getString(R12);
                    pVar.e = androidx.work.b.a(g.getBlob(R13));
                    int i7 = i2;
                    pVar.f = androidx.work.b.a(g.getBlob(i7));
                    i2 = i7;
                    int i8 = R12;
                    int i9 = R15;
                    pVar.g = g.getLong(i9);
                    int i10 = R13;
                    int i11 = R16;
                    pVar.h = g.getLong(i11);
                    int i12 = R10;
                    int i13 = R17;
                    pVar.i = g.getLong(i13);
                    int i14 = R18;
                    pVar.k = g.getInt(i14);
                    int i15 = R19;
                    pVar.l = v.b(g.getInt(i15));
                    R17 = i13;
                    int i16 = R20;
                    pVar.m = g.getLong(i16);
                    int i17 = R21;
                    pVar.n = g.getLong(i17);
                    R21 = i17;
                    int i18 = R22;
                    pVar.o = g.getLong(i18);
                    int i19 = R23;
                    pVar.p = g.getLong(i19);
                    int i20 = R24;
                    if (g.getInt(i20) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    pVar.q = z5;
                    int i21 = R25;
                    pVar.r = v.d(g.getInt(i21));
                    pVar.j = cVar;
                    arrayList.add(pVar);
                    R25 = i21;
                    R13 = i10;
                    R2 = i5;
                    R16 = i11;
                    R18 = i14;
                    R23 = i19;
                    R24 = i20;
                    R22 = i18;
                    R15 = i9;
                    R12 = i8;
                    R3 = i6;
                    R = i4;
                    arrayList2 = arrayList;
                    R11 = i3;
                    R20 = i16;
                    R10 = i12;
                    R19 = i15;
                }
                g.close();
                iVar.release();
                ArrayList d = rVar.d();
                ArrayList b = rVar.b();
                if (!arrayList.isEmpty()) {
                    i = 0;
                    m.c().d(new Throwable[0]);
                    m c = m.c();
                    hVar = k;
                    kVar = l;
                    tVar = o;
                    a(kVar, tVar, hVar, arrayList);
                    c.d(new Throwable[0]);
                } else {
                    hVar = k;
                    kVar = l;
                    tVar = o;
                    i = 0;
                }
                if (!d.isEmpty()) {
                    m.c().d(new Throwable[i]);
                    m c2 = m.c();
                    a(kVar, tVar, hVar, d);
                    c2.d(new Throwable[i]);
                }
                if (!b.isEmpty()) {
                    m.c().d(new Throwable[i]);
                    m c3 = m.c();
                    a(kVar, tVar, hVar, b);
                    c3.d(new Throwable[i]);
                }
                return new ListenableWorker.a.c();
            } catch (Throwable th) {
                th = th;
                g.close();
                iVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = f;
        }
    }
}
