package c.c0.d0.s;

import android.database.Cursor;
import c.c0.d0.s.p;
import c.c0.y;
import ch.qos.logback.classic.spi.CallerData;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class r implements q {
    public final c.v.f a;

    /* renamed from: b  reason: collision with root package name */
    public final c.v.b<p> f1521b;

    /* renamed from: c  reason: collision with root package name */
    public final c.v.j f1522c;

    /* renamed from: d  reason: collision with root package name */
    public final c.v.j f1523d;

    /* renamed from: e  reason: collision with root package name */
    public final c.v.j f1524e;

    /* renamed from: f  reason: collision with root package name */
    public final c.v.j f1525f;

    /* renamed from: g  reason: collision with root package name */
    public final c.v.j f1526g;

    /* renamed from: h  reason: collision with root package name */
    public final c.v.j f1527h;

    /* renamed from: i  reason: collision with root package name */
    public final c.v.j f1528i;

    /* loaded from: classes.dex */
    public class a extends c.v.b<p> {
        public a(r rVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:45|(3:46|47|48)|(4:50|51|(2:52|(1:54)(1:55))|56)|57|58|59) */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01f7, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01f8, code lost:
            r0.printStackTrace();
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x020a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01ef -> B:103:0x01f3). Please submit an issue!!! */
        @Override // c.v.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void d(c.x.a.f.f r17, c.c0.d0.s.p r18) {
            /*
                Method dump skipped, instructions count: 598
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c.c0.d0.s.r.a.d(c.x.a.f.f, java.lang.Object):void");
        }
    }

    /* loaded from: classes.dex */
    public class b extends c.v.j {
        public b(r rVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends c.v.j {
        public c(r rVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class d extends c.v.j {
        public d(r rVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class e extends c.v.j {
        public e(r rVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class f extends c.v.j {
        public f(r rVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class g extends c.v.j {
        public g(r rVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class h extends c.v.j {
        public h(r rVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public r(c.v.f fVar) {
        this.a = fVar;
        this.f1521b = new a(this, fVar);
        this.f1522c = new b(this, fVar);
        this.f1523d = new c(this, fVar);
        this.f1524e = new d(this, fVar);
        this.f1525f = new e(this, fVar);
        this.f1526g = new f(this, fVar);
        this.f1527h = new g(this, fVar);
        this.f1528i = new h(this, fVar);
        new AtomicBoolean(false);
    }

    public void a(String str) {
        this.a.b();
        c.x.a.f.f a2 = this.f1522c.a();
        if (str == null) {
            a2.a.bindNull(1);
        } else {
            a2.a.bindString(1, str);
        }
        this.a.c();
        try {
            a2.a();
            this.a.k();
            this.a.g();
            c.v.j jVar = this.f1522c;
            if (a2 == jVar.f2803c) {
                jVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.f1522c.c(a2);
            throw th;
        }
    }

    public List<p> b(int i2) {
        c.v.h hVar;
        c.v.h h2 = c.v.h.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        h2.i(1, i2);
        this.a.b();
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            int i3 = c.t.m.i(a2, "required_network_type");
            int i4 = c.t.m.i(a2, "requires_charging");
            int i5 = c.t.m.i(a2, "requires_device_idle");
            int i6 = c.t.m.i(a2, "requires_battery_not_low");
            int i7 = c.t.m.i(a2, "requires_storage_not_low");
            int i8 = c.t.m.i(a2, "trigger_content_update_delay");
            int i9 = c.t.m.i(a2, "trigger_max_content_delay");
            int i10 = c.t.m.i(a2, "content_uri_triggers");
            int i11 = c.t.m.i(a2, FacebookAdapter.KEY_ID);
            int i12 = c.t.m.i(a2, "state");
            int i13 = c.t.m.i(a2, "worker_class_name");
            int i14 = c.t.m.i(a2, "input_merger_class_name");
            int i15 = c.t.m.i(a2, "input");
            int i16 = c.t.m.i(a2, "output");
            hVar = h2;
            try {
                int i17 = c.t.m.i(a2, "initial_delay");
                int i18 = c.t.m.i(a2, "interval_duration");
                int i19 = c.t.m.i(a2, "flex_duration");
                int i20 = c.t.m.i(a2, "run_attempt_count");
                int i21 = c.t.m.i(a2, "backoff_policy");
                int i22 = c.t.m.i(a2, "backoff_delay_duration");
                int i23 = c.t.m.i(a2, "period_start_time");
                int i24 = c.t.m.i(a2, "minimum_retention_duration");
                int i25 = c.t.m.i(a2, "schedule_requested_at");
                int i26 = c.t.m.i(a2, "run_in_foreground");
                int i27 = c.t.m.i(a2, "out_of_quota_policy");
                int i28 = i16;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(i11);
                    int i29 = i11;
                    String string2 = a2.getString(i13);
                    int i30 = i13;
                    c.c0.d dVar = new c.c0.d();
                    int i31 = i3;
                    dVar.f1324b = c.t.m.q(a2.getInt(i3));
                    dVar.f1325c = a2.getInt(i4) != 0;
                    dVar.f1326d = a2.getInt(i5) != 0;
                    dVar.f1327e = a2.getInt(i6) != 0;
                    dVar.f1328f = a2.getInt(i7) != 0;
                    int i32 = i4;
                    int i33 = i5;
                    dVar.f1329g = a2.getLong(i8);
                    dVar.f1330h = a2.getLong(i9);
                    dVar.f1331i = c.t.m.a(a2.getBlob(i10));
                    p pVar = new p(string, string2);
                    pVar.f1507b = c.t.m.s(a2.getInt(i12));
                    pVar.f1509d = a2.getString(i14);
                    pVar.f1510e = c.c0.f.a(a2.getBlob(i15));
                    int i34 = i28;
                    pVar.f1511f = c.c0.f.a(a2.getBlob(i34));
                    i28 = i34;
                    int i35 = i17;
                    pVar.f1512g = a2.getLong(i35);
                    int i36 = i14;
                    int i37 = i18;
                    pVar.f1513h = a2.getLong(i37);
                    int i38 = i6;
                    int i39 = i19;
                    pVar.f1514i = a2.getLong(i39);
                    int i40 = i20;
                    pVar.f1516k = a2.getInt(i40);
                    int i41 = i21;
                    pVar.f1517l = c.t.m.p(a2.getInt(i41));
                    i19 = i39;
                    int i42 = i22;
                    pVar.f1518m = a2.getLong(i42);
                    int i43 = i23;
                    pVar.f1519n = a2.getLong(i43);
                    i23 = i43;
                    int i44 = i24;
                    pVar.o = a2.getLong(i44);
                    int i45 = i25;
                    pVar.p = a2.getLong(i45);
                    int i46 = i26;
                    pVar.q = a2.getInt(i46) != 0;
                    int i47 = i27;
                    pVar.r = c.t.m.r(a2.getInt(i47));
                    pVar.f1515j = dVar;
                    arrayList.add(pVar);
                    i27 = i47;
                    i4 = i32;
                    i14 = i36;
                    i17 = i35;
                    i18 = i37;
                    i20 = i40;
                    i25 = i45;
                    i11 = i29;
                    i13 = i30;
                    i3 = i31;
                    i26 = i46;
                    i24 = i44;
                    i5 = i33;
                    i22 = i42;
                    i6 = i38;
                    i21 = i41;
                }
                a2.close();
                hVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                hVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = h2;
        }
    }

    public List<p> c(int i2) {
        c.v.h hVar;
        c.v.h h2 = c.v.h.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        h2.i(1, i2);
        this.a.b();
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            int i3 = c.t.m.i(a2, "required_network_type");
            int i4 = c.t.m.i(a2, "requires_charging");
            int i5 = c.t.m.i(a2, "requires_device_idle");
            int i6 = c.t.m.i(a2, "requires_battery_not_low");
            int i7 = c.t.m.i(a2, "requires_storage_not_low");
            int i8 = c.t.m.i(a2, "trigger_content_update_delay");
            int i9 = c.t.m.i(a2, "trigger_max_content_delay");
            int i10 = c.t.m.i(a2, "content_uri_triggers");
            int i11 = c.t.m.i(a2, FacebookAdapter.KEY_ID);
            int i12 = c.t.m.i(a2, "state");
            int i13 = c.t.m.i(a2, "worker_class_name");
            int i14 = c.t.m.i(a2, "input_merger_class_name");
            int i15 = c.t.m.i(a2, "input");
            int i16 = c.t.m.i(a2, "output");
            hVar = h2;
            try {
                int i17 = c.t.m.i(a2, "initial_delay");
                int i18 = c.t.m.i(a2, "interval_duration");
                int i19 = c.t.m.i(a2, "flex_duration");
                int i20 = c.t.m.i(a2, "run_attempt_count");
                int i21 = c.t.m.i(a2, "backoff_policy");
                int i22 = c.t.m.i(a2, "backoff_delay_duration");
                int i23 = c.t.m.i(a2, "period_start_time");
                int i24 = c.t.m.i(a2, "minimum_retention_duration");
                int i25 = c.t.m.i(a2, "schedule_requested_at");
                int i26 = c.t.m.i(a2, "run_in_foreground");
                int i27 = c.t.m.i(a2, "out_of_quota_policy");
                int i28 = i16;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(i11);
                    int i29 = i11;
                    String string2 = a2.getString(i13);
                    int i30 = i13;
                    c.c0.d dVar = new c.c0.d();
                    int i31 = i3;
                    dVar.f1324b = c.t.m.q(a2.getInt(i3));
                    dVar.f1325c = a2.getInt(i4) != 0;
                    dVar.f1326d = a2.getInt(i5) != 0;
                    dVar.f1327e = a2.getInt(i6) != 0;
                    dVar.f1328f = a2.getInt(i7) != 0;
                    int i32 = i4;
                    int i33 = i5;
                    dVar.f1329g = a2.getLong(i8);
                    dVar.f1330h = a2.getLong(i9);
                    dVar.f1331i = c.t.m.a(a2.getBlob(i10));
                    p pVar = new p(string, string2);
                    pVar.f1507b = c.t.m.s(a2.getInt(i12));
                    pVar.f1509d = a2.getString(i14);
                    pVar.f1510e = c.c0.f.a(a2.getBlob(i15));
                    int i34 = i28;
                    pVar.f1511f = c.c0.f.a(a2.getBlob(i34));
                    i28 = i34;
                    int i35 = i17;
                    pVar.f1512g = a2.getLong(i35);
                    int i36 = i14;
                    int i37 = i18;
                    pVar.f1513h = a2.getLong(i37);
                    int i38 = i6;
                    int i39 = i19;
                    pVar.f1514i = a2.getLong(i39);
                    int i40 = i20;
                    pVar.f1516k = a2.getInt(i40);
                    int i41 = i21;
                    pVar.f1517l = c.t.m.p(a2.getInt(i41));
                    i19 = i39;
                    int i42 = i22;
                    pVar.f1518m = a2.getLong(i42);
                    int i43 = i23;
                    pVar.f1519n = a2.getLong(i43);
                    i23 = i43;
                    int i44 = i24;
                    pVar.o = a2.getLong(i44);
                    int i45 = i25;
                    pVar.p = a2.getLong(i45);
                    int i46 = i26;
                    pVar.q = a2.getInt(i46) != 0;
                    int i47 = i27;
                    pVar.r = c.t.m.r(a2.getInt(i47));
                    pVar.f1515j = dVar;
                    arrayList.add(pVar);
                    i27 = i47;
                    i4 = i32;
                    i14 = i36;
                    i17 = i35;
                    i18 = i37;
                    i20 = i40;
                    i25 = i45;
                    i11 = i29;
                    i13 = i30;
                    i3 = i31;
                    i26 = i46;
                    i24 = i44;
                    i5 = i33;
                    i22 = i42;
                    i6 = i38;
                    i21 = i41;
                }
                a2.close();
                hVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                hVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = h2;
        }
    }

    public List<p> d() {
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
        c.v.h h2 = c.v.h.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            i2 = c.t.m.i(a2, "required_network_type");
            i3 = c.t.m.i(a2, "requires_charging");
            i4 = c.t.m.i(a2, "requires_device_idle");
            i5 = c.t.m.i(a2, "requires_battery_not_low");
            i6 = c.t.m.i(a2, "requires_storage_not_low");
            i7 = c.t.m.i(a2, "trigger_content_update_delay");
            i8 = c.t.m.i(a2, "trigger_max_content_delay");
            i9 = c.t.m.i(a2, "content_uri_triggers");
            i10 = c.t.m.i(a2, FacebookAdapter.KEY_ID);
            i11 = c.t.m.i(a2, "state");
            i12 = c.t.m.i(a2, "worker_class_name");
            i13 = c.t.m.i(a2, "input_merger_class_name");
            i14 = c.t.m.i(a2, "input");
            i15 = c.t.m.i(a2, "output");
            hVar = h2;
        } catch (Throwable th) {
            th = th;
            hVar = h2;
        }
        try {
            int i16 = c.t.m.i(a2, "initial_delay");
            int i17 = c.t.m.i(a2, "interval_duration");
            int i18 = c.t.m.i(a2, "flex_duration");
            int i19 = c.t.m.i(a2, "run_attempt_count");
            int i20 = c.t.m.i(a2, "backoff_policy");
            int i21 = c.t.m.i(a2, "backoff_delay_duration");
            int i22 = c.t.m.i(a2, "period_start_time");
            int i23 = c.t.m.i(a2, "minimum_retention_duration");
            int i24 = c.t.m.i(a2, "schedule_requested_at");
            int i25 = c.t.m.i(a2, "run_in_foreground");
            int i26 = c.t.m.i(a2, "out_of_quota_policy");
            int i27 = i15;
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                String string = a2.getString(i10);
                int i28 = i10;
                String string2 = a2.getString(i12);
                int i29 = i12;
                c.c0.d dVar = new c.c0.d();
                int i30 = i2;
                dVar.f1324b = c.t.m.q(a2.getInt(i2));
                dVar.f1325c = a2.getInt(i3) != 0;
                dVar.f1326d = a2.getInt(i4) != 0;
                dVar.f1327e = a2.getInt(i5) != 0;
                dVar.f1328f = a2.getInt(i6) != 0;
                int i31 = i3;
                int i32 = i4;
                dVar.f1329g = a2.getLong(i7);
                dVar.f1330h = a2.getLong(i8);
                dVar.f1331i = c.t.m.a(a2.getBlob(i9));
                p pVar = new p(string, string2);
                pVar.f1507b = c.t.m.s(a2.getInt(i11));
                pVar.f1509d = a2.getString(i13);
                pVar.f1510e = c.c0.f.a(a2.getBlob(i14));
                int i33 = i27;
                pVar.f1511f = c.c0.f.a(a2.getBlob(i33));
                i27 = i33;
                int i34 = i16;
                pVar.f1512g = a2.getLong(i34);
                int i35 = i14;
                int i36 = i17;
                pVar.f1513h = a2.getLong(i36);
                int i37 = i5;
                int i38 = i18;
                pVar.f1514i = a2.getLong(i38);
                int i39 = i19;
                pVar.f1516k = a2.getInt(i39);
                int i40 = i20;
                pVar.f1517l = c.t.m.p(a2.getInt(i40));
                i18 = i38;
                int i41 = i21;
                pVar.f1518m = a2.getLong(i41);
                int i42 = i22;
                pVar.f1519n = a2.getLong(i42);
                i22 = i42;
                int i43 = i23;
                pVar.o = a2.getLong(i43);
                int i44 = i24;
                pVar.p = a2.getLong(i44);
                int i45 = i25;
                pVar.q = a2.getInt(i45) != 0;
                int i46 = i26;
                pVar.r = c.t.m.r(a2.getInt(i46));
                pVar.f1515j = dVar;
                arrayList.add(pVar);
                i26 = i46;
                i3 = i31;
                i14 = i35;
                i16 = i34;
                i17 = i36;
                i19 = i39;
                i24 = i44;
                i10 = i28;
                i12 = i29;
                i2 = i30;
                i25 = i45;
                i23 = i43;
                i4 = i32;
                i21 = i41;
                i5 = i37;
                i20 = i40;
            }
            a2.close();
            hVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            a2.close();
            hVar.release();
            throw th;
        }
    }

    public List<p> e() {
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
        c.v.h h2 = c.v.h.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            i2 = c.t.m.i(a2, "required_network_type");
            i3 = c.t.m.i(a2, "requires_charging");
            i4 = c.t.m.i(a2, "requires_device_idle");
            i5 = c.t.m.i(a2, "requires_battery_not_low");
            i6 = c.t.m.i(a2, "requires_storage_not_low");
            i7 = c.t.m.i(a2, "trigger_content_update_delay");
            i8 = c.t.m.i(a2, "trigger_max_content_delay");
            i9 = c.t.m.i(a2, "content_uri_triggers");
            i10 = c.t.m.i(a2, FacebookAdapter.KEY_ID);
            i11 = c.t.m.i(a2, "state");
            i12 = c.t.m.i(a2, "worker_class_name");
            i13 = c.t.m.i(a2, "input_merger_class_name");
            i14 = c.t.m.i(a2, "input");
            i15 = c.t.m.i(a2, "output");
            hVar = h2;
        } catch (Throwable th) {
            th = th;
            hVar = h2;
        }
        try {
            int i16 = c.t.m.i(a2, "initial_delay");
            int i17 = c.t.m.i(a2, "interval_duration");
            int i18 = c.t.m.i(a2, "flex_duration");
            int i19 = c.t.m.i(a2, "run_attempt_count");
            int i20 = c.t.m.i(a2, "backoff_policy");
            int i21 = c.t.m.i(a2, "backoff_delay_duration");
            int i22 = c.t.m.i(a2, "period_start_time");
            int i23 = c.t.m.i(a2, "minimum_retention_duration");
            int i24 = c.t.m.i(a2, "schedule_requested_at");
            int i25 = c.t.m.i(a2, "run_in_foreground");
            int i26 = c.t.m.i(a2, "out_of_quota_policy");
            int i27 = i15;
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                String string = a2.getString(i10);
                int i28 = i10;
                String string2 = a2.getString(i12);
                int i29 = i12;
                c.c0.d dVar = new c.c0.d();
                int i30 = i2;
                dVar.f1324b = c.t.m.q(a2.getInt(i2));
                dVar.f1325c = a2.getInt(i3) != 0;
                dVar.f1326d = a2.getInt(i4) != 0;
                dVar.f1327e = a2.getInt(i5) != 0;
                dVar.f1328f = a2.getInt(i6) != 0;
                int i31 = i3;
                int i32 = i4;
                dVar.f1329g = a2.getLong(i7);
                dVar.f1330h = a2.getLong(i8);
                dVar.f1331i = c.t.m.a(a2.getBlob(i9));
                p pVar = new p(string, string2);
                pVar.f1507b = c.t.m.s(a2.getInt(i11));
                pVar.f1509d = a2.getString(i13);
                pVar.f1510e = c.c0.f.a(a2.getBlob(i14));
                int i33 = i27;
                pVar.f1511f = c.c0.f.a(a2.getBlob(i33));
                i27 = i33;
                int i34 = i16;
                pVar.f1512g = a2.getLong(i34);
                int i35 = i14;
                int i36 = i17;
                pVar.f1513h = a2.getLong(i36);
                int i37 = i5;
                int i38 = i18;
                pVar.f1514i = a2.getLong(i38);
                int i39 = i19;
                pVar.f1516k = a2.getInt(i39);
                int i40 = i20;
                pVar.f1517l = c.t.m.p(a2.getInt(i40));
                i18 = i38;
                int i41 = i21;
                pVar.f1518m = a2.getLong(i41);
                int i42 = i22;
                pVar.f1519n = a2.getLong(i42);
                i22 = i42;
                int i43 = i23;
                pVar.o = a2.getLong(i43);
                int i44 = i24;
                pVar.p = a2.getLong(i44);
                int i45 = i25;
                pVar.q = a2.getInt(i45) != 0;
                int i46 = i26;
                pVar.r = c.t.m.r(a2.getInt(i46));
                pVar.f1515j = dVar;
                arrayList.add(pVar);
                i26 = i46;
                i3 = i31;
                i14 = i35;
                i16 = i34;
                i17 = i36;
                i19 = i39;
                i24 = i44;
                i10 = i28;
                i12 = i29;
                i2 = i30;
                i25 = i45;
                i23 = i43;
                i4 = i32;
                i21 = i41;
                i5 = i37;
                i20 = i40;
            }
            a2.close();
            hVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            a2.close();
            hVar.release();
            throw th;
        }
    }

    public y f(String str) {
        c.v.h h2 = c.v.h.h("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            h2.m(1);
        } else {
            h2.r(1, str);
        }
        this.a.b();
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            return a2.moveToFirst() ? c.t.m.s(a2.getInt(0)) : null;
        } finally {
            a2.close();
            h2.release();
        }
    }

    public List<String> g(String str) {
        c.v.h h2 = c.v.h.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
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

    public List<String> h(String str) {
        c.v.h h2 = c.v.h.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
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

    public p i(String str) {
        c.v.h hVar;
        p pVar;
        c.v.h h2 = c.v.h.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            h2.m(1);
        } else {
            h2.r(1, str);
        }
        this.a.b();
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            int i2 = c.t.m.i(a2, "required_network_type");
            int i3 = c.t.m.i(a2, "requires_charging");
            int i4 = c.t.m.i(a2, "requires_device_idle");
            int i5 = c.t.m.i(a2, "requires_battery_not_low");
            int i6 = c.t.m.i(a2, "requires_storage_not_low");
            int i7 = c.t.m.i(a2, "trigger_content_update_delay");
            int i8 = c.t.m.i(a2, "trigger_max_content_delay");
            int i9 = c.t.m.i(a2, "content_uri_triggers");
            int i10 = c.t.m.i(a2, FacebookAdapter.KEY_ID);
            int i11 = c.t.m.i(a2, "state");
            int i12 = c.t.m.i(a2, "worker_class_name");
            int i13 = c.t.m.i(a2, "input_merger_class_name");
            int i14 = c.t.m.i(a2, "input");
            int i15 = c.t.m.i(a2, "output");
            hVar = h2;
            try {
                int i16 = c.t.m.i(a2, "initial_delay");
                int i17 = c.t.m.i(a2, "interval_duration");
                int i18 = c.t.m.i(a2, "flex_duration");
                int i19 = c.t.m.i(a2, "run_attempt_count");
                int i20 = c.t.m.i(a2, "backoff_policy");
                int i21 = c.t.m.i(a2, "backoff_delay_duration");
                int i22 = c.t.m.i(a2, "period_start_time");
                int i23 = c.t.m.i(a2, "minimum_retention_duration");
                int i24 = c.t.m.i(a2, "schedule_requested_at");
                int i25 = c.t.m.i(a2, "run_in_foreground");
                int i26 = c.t.m.i(a2, "out_of_quota_policy");
                if (a2.moveToFirst()) {
                    String string = a2.getString(i10);
                    String string2 = a2.getString(i12);
                    c.c0.d dVar = new c.c0.d();
                    dVar.f1324b = c.t.m.q(a2.getInt(i2));
                    dVar.f1325c = a2.getInt(i3) != 0;
                    dVar.f1326d = a2.getInt(i4) != 0;
                    dVar.f1327e = a2.getInt(i5) != 0;
                    dVar.f1328f = a2.getInt(i6) != 0;
                    dVar.f1329g = a2.getLong(i7);
                    dVar.f1330h = a2.getLong(i8);
                    dVar.f1331i = c.t.m.a(a2.getBlob(i9));
                    p pVar2 = new p(string, string2);
                    pVar2.f1507b = c.t.m.s(a2.getInt(i11));
                    pVar2.f1509d = a2.getString(i13);
                    pVar2.f1510e = c.c0.f.a(a2.getBlob(i14));
                    pVar2.f1511f = c.c0.f.a(a2.getBlob(i15));
                    pVar2.f1512g = a2.getLong(i16);
                    pVar2.f1513h = a2.getLong(i17);
                    pVar2.f1514i = a2.getLong(i18);
                    pVar2.f1516k = a2.getInt(i19);
                    pVar2.f1517l = c.t.m.p(a2.getInt(i20));
                    pVar2.f1518m = a2.getLong(i21);
                    pVar2.f1519n = a2.getLong(i22);
                    pVar2.o = a2.getLong(i23);
                    pVar2.p = a2.getLong(i24);
                    pVar2.q = a2.getInt(i25) != 0;
                    pVar2.r = c.t.m.r(a2.getInt(i26));
                    pVar2.f1515j = dVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                a2.close();
                hVar.release();
                return pVar;
            } catch (Throwable th) {
                th = th;
                a2.close();
                hVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = h2;
        }
    }

    public List<p.a> j(String str) {
        c.v.h h2 = c.v.h.h("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            h2.m(1);
        } else {
            h2.r(1, str);
        }
        this.a.b();
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            int i2 = c.t.m.i(a2, FacebookAdapter.KEY_ID);
            int i3 = c.t.m.i(a2, "state");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                p.a aVar = new p.a();
                aVar.a = a2.getString(i2);
                aVar.f1520b = c.t.m.s(a2.getInt(i3));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a2.close();
            h2.release();
        }
    }

    public int k(String str) {
        this.a.b();
        c.x.a.f.f a2 = this.f1525f.a();
        if (str == null) {
            a2.a.bindNull(1);
        } else {
            a2.a.bindString(1, str);
        }
        this.a.c();
        try {
            int a3 = a2.a();
            this.a.k();
            this.a.g();
            c.v.j jVar = this.f1525f;
            if (a2 == jVar.f2803c) {
                jVar.a.set(false);
            }
            return a3;
        } catch (Throwable th) {
            this.a.g();
            this.f1525f.c(a2);
            throw th;
        }
    }

    public int l(String str, long j2) {
        this.a.b();
        c.x.a.f.f a2 = this.f1527h.a();
        a2.a.bindLong(1, j2);
        if (str == null) {
            a2.a.bindNull(2);
        } else {
            a2.a.bindString(2, str);
        }
        this.a.c();
        try {
            int a3 = a2.a();
            this.a.k();
            return a3;
        } finally {
            this.a.g();
            c.v.j jVar = this.f1527h;
            if (a2 == jVar.f2803c) {
                jVar.a.set(false);
            }
        }
    }

    public int m(String str) {
        this.a.b();
        c.x.a.f.f a2 = this.f1526g.a();
        if (str == null) {
            a2.a.bindNull(1);
        } else {
            a2.a.bindString(1, str);
        }
        this.a.c();
        try {
            int a3 = a2.a();
            this.a.k();
            this.a.g();
            c.v.j jVar = this.f1526g;
            if (a2 == jVar.f2803c) {
                jVar.a.set(false);
            }
            return a3;
        } catch (Throwable th) {
            this.a.g();
            this.f1526g.c(a2);
            throw th;
        }
    }

    public void n(String str, c.c0.f fVar) {
        this.a.b();
        c.x.a.f.f a2 = this.f1523d.a();
        byte[] c2 = c.c0.f.c(fVar);
        if (c2 == null) {
            a2.a.bindNull(1);
        } else {
            a2.a.bindBlob(1, c2);
        }
        if (str == null) {
            a2.a.bindNull(2);
        } else {
            a2.a.bindString(2, str);
        }
        this.a.c();
        try {
            a2.a();
            this.a.k();
            this.a.g();
            c.v.j jVar = this.f1523d;
            if (a2 == jVar.f2803c) {
                jVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.f1523d.c(a2);
            throw th;
        }
    }

    public void o(String str, long j2) {
        this.a.b();
        c.x.a.f.f a2 = this.f1524e.a();
        a2.a.bindLong(1, j2);
        if (str == null) {
            a2.a.bindNull(2);
        } else {
            a2.a.bindString(2, str);
        }
        this.a.c();
        try {
            a2.a();
            this.a.k();
        } finally {
            this.a.g();
            c.v.j jVar = this.f1524e;
            if (a2 == jVar.f2803c) {
                jVar.a.set(false);
            }
        }
    }

    public int p(y yVar, String... strArr) {
        this.a.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append(CallerData.NA);
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(CallerData.NA);
            if (i2 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        c.x.a.f.f d2 = this.a.d(sb.toString());
        d2.a.bindLong(1, c.t.m.D(yVar));
        int i3 = 2;
        for (String str : strArr) {
            if (str == null) {
                d2.a.bindNull(i3);
            } else {
                d2.a.bindString(i3, str);
            }
            i3++;
        }
        this.a.c();
        try {
            int a2 = d2.a();
            this.a.k();
            return a2;
        } finally {
            this.a.g();
        }
    }
}
