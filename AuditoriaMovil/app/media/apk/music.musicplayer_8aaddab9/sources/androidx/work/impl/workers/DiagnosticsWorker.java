package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import c.c0.d;
import c.c0.d0.s.g;
import c.c0.d0.s.h;
import c.c0.d0.s.i;
import c.c0.d0.s.k;
import c.c0.d0.s.l;
import c.c0.d0.s.p;
import c.c0.d0.s.q;
import c.c0.d0.s.t;
import c.c0.d0.s.u;
import c.c0.f;
import c.c0.r;
import c.t.m;
import c.v.l.b;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String a = r.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (p pVar : list) {
            g a2 = ((i) hVar).a(pVar.a);
            Integer valueOf = a2 != null ? Integer.valueOf(a2.f1498b) : null;
            String str = pVar.a;
            l lVar = (l) kVar;
            Objects.requireNonNull(lVar);
            c.v.h h2 = c.v.h.h("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                h2.m(1);
            } else {
                h2.r(1, str);
            }
            lVar.a.b();
            Cursor a3 = b.a(lVar.a, h2, false, null);
            try {
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    arrayList.add(a3.getString(0));
                }
                a3.close();
                h2.release();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.a, pVar.f1508c, valueOf, pVar.f1507b.name(), TextUtils.join(",", arrayList), TextUtils.join(",", ((u) tVar).a(pVar.a))));
            } catch (Throwable th) {
                a3.close();
                h2.release();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        c.v.h hVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        h hVar2;
        k kVar;
        t tVar;
        int i16;
        WorkDatabase workDatabase = c.c0.d0.l.c(getApplicationContext()).f1372f;
        q q = workDatabase.q();
        k o = workDatabase.o();
        t r = workDatabase.r();
        h n2 = workDatabase.n();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        c.c0.d0.s.r rVar = (c.c0.d0.s.r) q;
        Objects.requireNonNull(rVar);
        c.v.h h2 = c.v.h.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        h2.i(1, currentTimeMillis);
        rVar.a.b();
        Cursor a2 = b.a(rVar.a, h2, false, null);
        try {
            i2 = m.i(a2, "required_network_type");
            i3 = m.i(a2, "requires_charging");
            i4 = m.i(a2, "requires_device_idle");
            i5 = m.i(a2, "requires_battery_not_low");
            i6 = m.i(a2, "requires_storage_not_low");
            i7 = m.i(a2, "trigger_content_update_delay");
            i8 = m.i(a2, "trigger_max_content_delay");
            i9 = m.i(a2, "content_uri_triggers");
            i10 = m.i(a2, FacebookAdapter.KEY_ID);
            i11 = m.i(a2, "state");
            i12 = m.i(a2, "worker_class_name");
            i13 = m.i(a2, "input_merger_class_name");
            i14 = m.i(a2, "input");
            i15 = m.i(a2, "output");
            hVar = h2;
        } catch (Throwable th) {
            th = th;
            hVar = h2;
        }
        try {
            int i17 = m.i(a2, "initial_delay");
            int i18 = m.i(a2, "interval_duration");
            int i19 = m.i(a2, "flex_duration");
            int i20 = m.i(a2, "run_attempt_count");
            int i21 = m.i(a2, "backoff_policy");
            int i22 = m.i(a2, "backoff_delay_duration");
            int i23 = m.i(a2, "period_start_time");
            int i24 = m.i(a2, "minimum_retention_duration");
            int i25 = m.i(a2, "schedule_requested_at");
            int i26 = m.i(a2, "run_in_foreground");
            int i27 = m.i(a2, "out_of_quota_policy");
            int i28 = i15;
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                String string = a2.getString(i10);
                int i29 = i10;
                String string2 = a2.getString(i12);
                int i30 = i12;
                d dVar = new d();
                int i31 = i2;
                dVar.f1324b = m.q(a2.getInt(i2));
                dVar.f1325c = a2.getInt(i3) != 0;
                dVar.f1326d = a2.getInt(i4) != 0;
                dVar.f1327e = a2.getInt(i5) != 0;
                dVar.f1328f = a2.getInt(i6) != 0;
                int i32 = i3;
                int i33 = i4;
                dVar.f1329g = a2.getLong(i7);
                dVar.f1330h = a2.getLong(i8);
                dVar.f1331i = m.a(a2.getBlob(i9));
                p pVar = new p(string, string2);
                pVar.f1507b = m.s(a2.getInt(i11));
                pVar.f1509d = a2.getString(i13);
                pVar.f1510e = f.a(a2.getBlob(i14));
                int i34 = i28;
                pVar.f1511f = f.a(a2.getBlob(i34));
                i28 = i34;
                int i35 = i13;
                int i36 = i17;
                pVar.f1512g = a2.getLong(i36);
                int i37 = i14;
                int i38 = i18;
                pVar.f1513h = a2.getLong(i38);
                int i39 = i11;
                int i40 = i19;
                pVar.f1514i = a2.getLong(i40);
                int i41 = i20;
                pVar.f1516k = a2.getInt(i41);
                int i42 = i21;
                pVar.f1517l = m.p(a2.getInt(i42));
                i19 = i40;
                int i43 = i22;
                pVar.f1518m = a2.getLong(i43);
                int i44 = i23;
                pVar.f1519n = a2.getLong(i44);
                i23 = i44;
                int i45 = i24;
                pVar.o = a2.getLong(i45);
                int i46 = i25;
                pVar.p = a2.getLong(i46);
                int i47 = i26;
                pVar.q = a2.getInt(i47) != 0;
                int i48 = i27;
                pVar.r = m.r(a2.getInt(i48));
                pVar.f1515j = dVar;
                arrayList.add(pVar);
                i27 = i48;
                i14 = i37;
                i3 = i32;
                i18 = i38;
                i20 = i41;
                i25 = i46;
                i12 = i30;
                i26 = i47;
                i24 = i45;
                i17 = i36;
                i13 = i35;
                i10 = i29;
                i4 = i33;
                i2 = i31;
                i22 = i43;
                i11 = i39;
                i21 = i42;
            }
            a2.close();
            hVar.release();
            c.c0.d0.s.r rVar2 = (c.c0.d0.s.r) q;
            List<p> d2 = rVar2.d();
            List<p> b2 = rVar2.b(200);
            if (arrayList.isEmpty()) {
                hVar2 = n2;
                kVar = o;
                tVar = r;
                i16 = 0;
            } else {
                r c2 = r.c();
                String str = a;
                i16 = 0;
                c2.d(str, "Recently completed work:\n\n", new Throwable[0]);
                hVar2 = n2;
                kVar = o;
                tVar = r;
                r.c().d(str, a(kVar, tVar, hVar2, arrayList), new Throwable[0]);
            }
            if (!((ArrayList) d2).isEmpty()) {
                r c3 = r.c();
                String str2 = a;
                c3.d(str2, "Running work:\n\n", new Throwable[i16]);
                r.c().d(str2, a(kVar, tVar, hVar2, d2), new Throwable[i16]);
            }
            if (!((ArrayList) b2).isEmpty()) {
                r c4 = r.c();
                String str3 = a;
                c4.d(str3, "Enqueued work:\n\n", new Throwable[i16]);
                r.c().d(str3, a(kVar, tVar, hVar2, b2), new Throwable[i16]);
            }
            return new ListenableWorker.a.c();
        } catch (Throwable th2) {
            th = th2;
            a2.close();
            hVar.release();
            throw th;
        }
    }
}
