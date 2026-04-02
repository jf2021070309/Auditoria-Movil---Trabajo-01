package com.amazon.aps.iva.t9;

import android.database.Cursor;
import com.amazon.aps.iva.t9.p;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class r implements q {
    public final com.amazon.aps.iva.p8.g a;
    public final a b;
    public final b c;
    public final c d;
    public final d e;
    public final e f;
    public final f g;
    public final g h;
    public final h i;

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.p8.b<p> {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:45|(3:46|47|48)|(4:49|50|(2:51|(1:53)(1:54))|55)|56|57|58) */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x01b5, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x01cd, code lost:
            r0.printStackTrace();
         */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01dc  */
        @Override // com.amazon.aps.iva.p8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(com.amazon.aps.iva.v8.e r19, com.amazon.aps.iva.t9.p r20) {
            /*
                Method dump skipped, instructions count: 536
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t9.r.a.d(com.amazon.aps.iva.v8.e, java.lang.Object):void");
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends com.amazon.aps.iva.p8.k {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class c extends com.amazon.aps.iva.p8.k {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class d extends com.amazon.aps.iva.p8.k {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class e extends com.amazon.aps.iva.p8.k {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class f extends com.amazon.aps.iva.p8.k {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class g extends com.amazon.aps.iva.p8.k {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class h extends com.amazon.aps.iva.p8.k {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public r(com.amazon.aps.iva.p8.g gVar) {
        this.a = gVar;
        this.b = new a(gVar);
        this.c = new b(gVar);
        this.d = new c(gVar);
        this.e = new d(gVar);
        this.f = new e(gVar);
        this.g = new f(gVar);
        this.h = new g(gVar);
        this.i = new h(gVar);
        new AtomicBoolean(false);
    }

    public final void a(String str) {
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        b bVar = this.c;
        com.amazon.aps.iva.v8.e a2 = bVar.a();
        if (str == null) {
            a2.h(1);
        } else {
            a2.i(1, str);
        }
        gVar.c();
        try {
            a2.k();
            gVar.h();
        } finally {
            gVar.f();
            bVar.c(a2);
        }
    }

    public final ArrayList b() {
        com.amazon.aps.iva.p8.i iVar;
        int R;
        int R2;
        int R3;
        int R4;
        int R5;
        int R6;
        int R7;
        int R8;
        int R9;
        int R10;
        int R11;
        int R12;
        int R13;
        int R14;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        com.amazon.aps.iva.p8.i f2 = com.amazon.aps.iva.p8.i.f(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        f2.h(1, (long) MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g2 = gVar.g(f2);
        try {
            R = com.amazon.aps.iva.cq.b.R(g2, "required_network_type");
            R2 = com.amazon.aps.iva.cq.b.R(g2, "requires_charging");
            R3 = com.amazon.aps.iva.cq.b.R(g2, "requires_device_idle");
            R4 = com.amazon.aps.iva.cq.b.R(g2, "requires_battery_not_low");
            R5 = com.amazon.aps.iva.cq.b.R(g2, "requires_storage_not_low");
            R6 = com.amazon.aps.iva.cq.b.R(g2, "trigger_content_update_delay");
            R7 = com.amazon.aps.iva.cq.b.R(g2, "trigger_max_content_delay");
            R8 = com.amazon.aps.iva.cq.b.R(g2, "content_uri_triggers");
            R9 = com.amazon.aps.iva.cq.b.R(g2, "id");
            R10 = com.amazon.aps.iva.cq.b.R(g2, "state");
            R11 = com.amazon.aps.iva.cq.b.R(g2, "worker_class_name");
            R12 = com.amazon.aps.iva.cq.b.R(g2, "input_merger_class_name");
            R13 = com.amazon.aps.iva.cq.b.R(g2, "input");
            R14 = com.amazon.aps.iva.cq.b.R(g2, "output");
            iVar = f2;
        } catch (Throwable th) {
            th = th;
            iVar = f2;
        }
        try {
            int R15 = com.amazon.aps.iva.cq.b.R(g2, "initial_delay");
            int R16 = com.amazon.aps.iva.cq.b.R(g2, "interval_duration");
            int R17 = com.amazon.aps.iva.cq.b.R(g2, "flex_duration");
            int R18 = com.amazon.aps.iva.cq.b.R(g2, "run_attempt_count");
            int R19 = com.amazon.aps.iva.cq.b.R(g2, "backoff_policy");
            int R20 = com.amazon.aps.iva.cq.b.R(g2, "backoff_delay_duration");
            int R21 = com.amazon.aps.iva.cq.b.R(g2, "period_start_time");
            int R22 = com.amazon.aps.iva.cq.b.R(g2, "minimum_retention_duration");
            int R23 = com.amazon.aps.iva.cq.b.R(g2, "schedule_requested_at");
            int R24 = com.amazon.aps.iva.cq.b.R(g2, "run_in_foreground");
            int R25 = com.amazon.aps.iva.cq.b.R(g2, "out_of_quota_policy");
            int i = R14;
            ArrayList arrayList = new ArrayList(g2.getCount());
            while (g2.moveToNext()) {
                String string = g2.getString(R9);
                int i2 = R9;
                String string2 = g2.getString(R11);
                int i3 = R11;
                com.amazon.aps.iva.k9.c cVar = new com.amazon.aps.iva.k9.c();
                int i4 = R;
                cVar.a = v.c(g2.getInt(R));
                if (g2.getInt(R2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                cVar.b = z;
                if (g2.getInt(R3) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                cVar.c = z2;
                if (g2.getInt(R4) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                cVar.d = z3;
                if (g2.getInt(R5) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                cVar.e = z4;
                int i5 = R2;
                int i6 = R3;
                cVar.f = g2.getLong(R6);
                cVar.g = g2.getLong(R7);
                cVar.h = v.a(g2.getBlob(R8));
                p pVar = new p(string, string2);
                pVar.b = v.e(g2.getInt(R10));
                pVar.d = g2.getString(R12);
                pVar.e = androidx.work.b.a(g2.getBlob(R13));
                int i7 = i;
                pVar.f = androidx.work.b.a(g2.getBlob(i7));
                int i8 = R13;
                int i9 = R15;
                pVar.g = g2.getLong(i9);
                int i10 = R4;
                int i11 = R16;
                pVar.h = g2.getLong(i11);
                int i12 = R17;
                pVar.i = g2.getLong(i12);
                int i13 = R18;
                pVar.k = g2.getInt(i13);
                int i14 = R19;
                pVar.l = v.b(g2.getInt(i14));
                int i15 = R20;
                pVar.m = g2.getLong(i15);
                int i16 = R21;
                pVar.n = g2.getLong(i16);
                int i17 = R22;
                pVar.o = g2.getLong(i17);
                int i18 = R23;
                pVar.p = g2.getLong(i18);
                int i19 = R24;
                if (g2.getInt(i19) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                pVar.q = z5;
                int i20 = R25;
                pVar.r = v.d(g2.getInt(i20));
                pVar.j = cVar;
                arrayList.add(pVar);
                i = i7;
                R2 = i5;
                R15 = i9;
                R16 = i11;
                R20 = i15;
                R21 = i16;
                R24 = i19;
                R11 = i3;
                R = i4;
                R25 = i20;
                R23 = i18;
                R13 = i8;
                R9 = i2;
                R3 = i6;
                R22 = i17;
                R4 = i10;
                R17 = i12;
                R18 = i13;
                R19 = i14;
            }
            g2.close();
            iVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g2.close();
            iVar.release();
            throw th;
        }
    }

    public final ArrayList c(int i) {
        com.amazon.aps.iva.p8.i iVar;
        int R;
        int R2;
        int R3;
        int R4;
        int R5;
        int R6;
        int R7;
        int R8;
        int R9;
        int R10;
        int R11;
        int R12;
        int R13;
        int R14;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        com.amazon.aps.iva.p8.i f2 = com.amazon.aps.iva.p8.i.f(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        f2.h(1, i);
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g2 = gVar.g(f2);
        try {
            R = com.amazon.aps.iva.cq.b.R(g2, "required_network_type");
            R2 = com.amazon.aps.iva.cq.b.R(g2, "requires_charging");
            R3 = com.amazon.aps.iva.cq.b.R(g2, "requires_device_idle");
            R4 = com.amazon.aps.iva.cq.b.R(g2, "requires_battery_not_low");
            R5 = com.amazon.aps.iva.cq.b.R(g2, "requires_storage_not_low");
            R6 = com.amazon.aps.iva.cq.b.R(g2, "trigger_content_update_delay");
            R7 = com.amazon.aps.iva.cq.b.R(g2, "trigger_max_content_delay");
            R8 = com.amazon.aps.iva.cq.b.R(g2, "content_uri_triggers");
            R9 = com.amazon.aps.iva.cq.b.R(g2, "id");
            R10 = com.amazon.aps.iva.cq.b.R(g2, "state");
            R11 = com.amazon.aps.iva.cq.b.R(g2, "worker_class_name");
            R12 = com.amazon.aps.iva.cq.b.R(g2, "input_merger_class_name");
            R13 = com.amazon.aps.iva.cq.b.R(g2, "input");
            R14 = com.amazon.aps.iva.cq.b.R(g2, "output");
            iVar = f2;
        } catch (Throwable th) {
            th = th;
            iVar = f2;
        }
        try {
            int R15 = com.amazon.aps.iva.cq.b.R(g2, "initial_delay");
            int R16 = com.amazon.aps.iva.cq.b.R(g2, "interval_duration");
            int R17 = com.amazon.aps.iva.cq.b.R(g2, "flex_duration");
            int R18 = com.amazon.aps.iva.cq.b.R(g2, "run_attempt_count");
            int R19 = com.amazon.aps.iva.cq.b.R(g2, "backoff_policy");
            int R20 = com.amazon.aps.iva.cq.b.R(g2, "backoff_delay_duration");
            int R21 = com.amazon.aps.iva.cq.b.R(g2, "period_start_time");
            int R22 = com.amazon.aps.iva.cq.b.R(g2, "minimum_retention_duration");
            int R23 = com.amazon.aps.iva.cq.b.R(g2, "schedule_requested_at");
            int R24 = com.amazon.aps.iva.cq.b.R(g2, "run_in_foreground");
            int R25 = com.amazon.aps.iva.cq.b.R(g2, "out_of_quota_policy");
            int i2 = R14;
            ArrayList arrayList = new ArrayList(g2.getCount());
            while (g2.moveToNext()) {
                String string = g2.getString(R9);
                int i3 = R9;
                String string2 = g2.getString(R11);
                int i4 = R11;
                com.amazon.aps.iva.k9.c cVar = new com.amazon.aps.iva.k9.c();
                int i5 = R;
                cVar.a = v.c(g2.getInt(R));
                if (g2.getInt(R2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                cVar.b = z;
                if (g2.getInt(R3) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                cVar.c = z2;
                if (g2.getInt(R4) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                cVar.d = z3;
                if (g2.getInt(R5) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                cVar.e = z4;
                int i6 = R2;
                int i7 = R3;
                cVar.f = g2.getLong(R6);
                cVar.g = g2.getLong(R7);
                cVar.h = v.a(g2.getBlob(R8));
                p pVar = new p(string, string2);
                pVar.b = v.e(g2.getInt(R10));
                pVar.d = g2.getString(R12);
                pVar.e = androidx.work.b.a(g2.getBlob(R13));
                int i8 = i2;
                pVar.f = androidx.work.b.a(g2.getBlob(i8));
                int i9 = R15;
                int i10 = R13;
                pVar.g = g2.getLong(i9);
                int i11 = R4;
                int i12 = R16;
                pVar.h = g2.getLong(i12);
                int i13 = R17;
                pVar.i = g2.getLong(i13);
                int i14 = R18;
                pVar.k = g2.getInt(i14);
                int i15 = R19;
                pVar.l = v.b(g2.getInt(i15));
                int i16 = R20;
                pVar.m = g2.getLong(i16);
                int i17 = R21;
                pVar.n = g2.getLong(i17);
                int i18 = R22;
                pVar.o = g2.getLong(i18);
                int i19 = R23;
                pVar.p = g2.getLong(i19);
                int i20 = R24;
                if (g2.getInt(i20) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                pVar.q = z5;
                int i21 = R25;
                pVar.r = v.d(g2.getInt(i21));
                pVar.j = cVar;
                arrayList.add(pVar);
                i2 = i8;
                R2 = i6;
                R24 = i20;
                R9 = i3;
                R11 = i4;
                R = i5;
                R25 = i21;
                R13 = i10;
                R15 = i9;
                R16 = i12;
                R20 = i16;
                R21 = i17;
                R23 = i19;
                R3 = i7;
                R22 = i18;
                R4 = i11;
                R17 = i13;
                R18 = i14;
                R19 = i15;
            }
            g2.close();
            iVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g2.close();
            iVar.release();
            throw th;
        }
    }

    public final ArrayList d() {
        com.amazon.aps.iva.p8.i iVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        com.amazon.aps.iva.p8.i f2 = com.amazon.aps.iva.p8.i.f(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g2 = gVar.g(f2);
        try {
            int R = com.amazon.aps.iva.cq.b.R(g2, "required_network_type");
            int R2 = com.amazon.aps.iva.cq.b.R(g2, "requires_charging");
            int R3 = com.amazon.aps.iva.cq.b.R(g2, "requires_device_idle");
            int R4 = com.amazon.aps.iva.cq.b.R(g2, "requires_battery_not_low");
            int R5 = com.amazon.aps.iva.cq.b.R(g2, "requires_storage_not_low");
            int R6 = com.amazon.aps.iva.cq.b.R(g2, "trigger_content_update_delay");
            int R7 = com.amazon.aps.iva.cq.b.R(g2, "trigger_max_content_delay");
            int R8 = com.amazon.aps.iva.cq.b.R(g2, "content_uri_triggers");
            int R9 = com.amazon.aps.iva.cq.b.R(g2, "id");
            int R10 = com.amazon.aps.iva.cq.b.R(g2, "state");
            int R11 = com.amazon.aps.iva.cq.b.R(g2, "worker_class_name");
            int R12 = com.amazon.aps.iva.cq.b.R(g2, "input_merger_class_name");
            int R13 = com.amazon.aps.iva.cq.b.R(g2, "input");
            int R14 = com.amazon.aps.iva.cq.b.R(g2, "output");
            iVar = f2;
            try {
                int R15 = com.amazon.aps.iva.cq.b.R(g2, "initial_delay");
                int R16 = com.amazon.aps.iva.cq.b.R(g2, "interval_duration");
                int R17 = com.amazon.aps.iva.cq.b.R(g2, "flex_duration");
                int R18 = com.amazon.aps.iva.cq.b.R(g2, "run_attempt_count");
                int R19 = com.amazon.aps.iva.cq.b.R(g2, "backoff_policy");
                int R20 = com.amazon.aps.iva.cq.b.R(g2, "backoff_delay_duration");
                int R21 = com.amazon.aps.iva.cq.b.R(g2, "period_start_time");
                int R22 = com.amazon.aps.iva.cq.b.R(g2, "minimum_retention_duration");
                int R23 = com.amazon.aps.iva.cq.b.R(g2, "schedule_requested_at");
                int R24 = com.amazon.aps.iva.cq.b.R(g2, "run_in_foreground");
                int R25 = com.amazon.aps.iva.cq.b.R(g2, "out_of_quota_policy");
                int i = R14;
                ArrayList arrayList = new ArrayList(g2.getCount());
                while (g2.moveToNext()) {
                    String string = g2.getString(R9);
                    int i2 = R9;
                    String string2 = g2.getString(R11);
                    int i3 = R11;
                    com.amazon.aps.iva.k9.c cVar = new com.amazon.aps.iva.k9.c();
                    int i4 = R;
                    cVar.a = v.c(g2.getInt(R));
                    if (g2.getInt(R2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.b = z;
                    if (g2.getInt(R3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.c = z2;
                    if (g2.getInt(R4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.d = z3;
                    if (g2.getInt(R5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.e = z4;
                    int i5 = R2;
                    int i6 = R3;
                    cVar.f = g2.getLong(R6);
                    cVar.g = g2.getLong(R7);
                    cVar.h = v.a(g2.getBlob(R8));
                    p pVar = new p(string, string2);
                    pVar.b = v.e(g2.getInt(R10));
                    pVar.d = g2.getString(R12);
                    pVar.e = androidx.work.b.a(g2.getBlob(R13));
                    int i7 = i;
                    pVar.f = androidx.work.b.a(g2.getBlob(i7));
                    int i8 = R13;
                    int i9 = R15;
                    pVar.g = g2.getLong(i9);
                    int i10 = R4;
                    int i11 = R16;
                    pVar.h = g2.getLong(i11);
                    int i12 = R17;
                    pVar.i = g2.getLong(i12);
                    int i13 = R18;
                    pVar.k = g2.getInt(i13);
                    int i14 = R19;
                    pVar.l = v.b(g2.getInt(i14));
                    int i15 = R20;
                    pVar.m = g2.getLong(i15);
                    int i16 = R21;
                    pVar.n = g2.getLong(i16);
                    int i17 = R22;
                    pVar.o = g2.getLong(i17);
                    int i18 = R23;
                    pVar.p = g2.getLong(i18);
                    int i19 = R24;
                    if (g2.getInt(i19) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    pVar.q = z5;
                    int i20 = R25;
                    pVar.r = v.d(g2.getInt(i20));
                    pVar.j = cVar;
                    arrayList.add(pVar);
                    i = i7;
                    R2 = i5;
                    R15 = i9;
                    R16 = i11;
                    R20 = i15;
                    R21 = i16;
                    R24 = i19;
                    R11 = i3;
                    R = i4;
                    R25 = i20;
                    R23 = i18;
                    R13 = i8;
                    R9 = i2;
                    R3 = i6;
                    R22 = i17;
                    R4 = i10;
                    R17 = i12;
                    R18 = i13;
                    R19 = i14;
                }
                g2.close();
                iVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g2.close();
                iVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = f2;
        }
    }

    public final ArrayList e() {
        com.amazon.aps.iva.p8.i iVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        com.amazon.aps.iva.p8.i f2 = com.amazon.aps.iva.p8.i.f(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g2 = gVar.g(f2);
        try {
            int R = com.amazon.aps.iva.cq.b.R(g2, "required_network_type");
            int R2 = com.amazon.aps.iva.cq.b.R(g2, "requires_charging");
            int R3 = com.amazon.aps.iva.cq.b.R(g2, "requires_device_idle");
            int R4 = com.amazon.aps.iva.cq.b.R(g2, "requires_battery_not_low");
            int R5 = com.amazon.aps.iva.cq.b.R(g2, "requires_storage_not_low");
            int R6 = com.amazon.aps.iva.cq.b.R(g2, "trigger_content_update_delay");
            int R7 = com.amazon.aps.iva.cq.b.R(g2, "trigger_max_content_delay");
            int R8 = com.amazon.aps.iva.cq.b.R(g2, "content_uri_triggers");
            int R9 = com.amazon.aps.iva.cq.b.R(g2, "id");
            int R10 = com.amazon.aps.iva.cq.b.R(g2, "state");
            int R11 = com.amazon.aps.iva.cq.b.R(g2, "worker_class_name");
            int R12 = com.amazon.aps.iva.cq.b.R(g2, "input_merger_class_name");
            int R13 = com.amazon.aps.iva.cq.b.R(g2, "input");
            int R14 = com.amazon.aps.iva.cq.b.R(g2, "output");
            iVar = f2;
            try {
                int R15 = com.amazon.aps.iva.cq.b.R(g2, "initial_delay");
                int R16 = com.amazon.aps.iva.cq.b.R(g2, "interval_duration");
                int R17 = com.amazon.aps.iva.cq.b.R(g2, "flex_duration");
                int R18 = com.amazon.aps.iva.cq.b.R(g2, "run_attempt_count");
                int R19 = com.amazon.aps.iva.cq.b.R(g2, "backoff_policy");
                int R20 = com.amazon.aps.iva.cq.b.R(g2, "backoff_delay_duration");
                int R21 = com.amazon.aps.iva.cq.b.R(g2, "period_start_time");
                int R22 = com.amazon.aps.iva.cq.b.R(g2, "minimum_retention_duration");
                int R23 = com.amazon.aps.iva.cq.b.R(g2, "schedule_requested_at");
                int R24 = com.amazon.aps.iva.cq.b.R(g2, "run_in_foreground");
                int R25 = com.amazon.aps.iva.cq.b.R(g2, "out_of_quota_policy");
                int i = R14;
                ArrayList arrayList = new ArrayList(g2.getCount());
                while (g2.moveToNext()) {
                    String string = g2.getString(R9);
                    int i2 = R9;
                    String string2 = g2.getString(R11);
                    int i3 = R11;
                    com.amazon.aps.iva.k9.c cVar = new com.amazon.aps.iva.k9.c();
                    int i4 = R;
                    cVar.a = v.c(g2.getInt(R));
                    if (g2.getInt(R2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.b = z;
                    if (g2.getInt(R3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.c = z2;
                    if (g2.getInt(R4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.d = z3;
                    if (g2.getInt(R5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.e = z4;
                    int i5 = R2;
                    int i6 = R3;
                    cVar.f = g2.getLong(R6);
                    cVar.g = g2.getLong(R7);
                    cVar.h = v.a(g2.getBlob(R8));
                    p pVar = new p(string, string2);
                    pVar.b = v.e(g2.getInt(R10));
                    pVar.d = g2.getString(R12);
                    pVar.e = androidx.work.b.a(g2.getBlob(R13));
                    int i7 = i;
                    pVar.f = androidx.work.b.a(g2.getBlob(i7));
                    int i8 = R13;
                    int i9 = R15;
                    pVar.g = g2.getLong(i9);
                    int i10 = R4;
                    int i11 = R16;
                    pVar.h = g2.getLong(i11);
                    int i12 = R17;
                    pVar.i = g2.getLong(i12);
                    int i13 = R18;
                    pVar.k = g2.getInt(i13);
                    int i14 = R19;
                    pVar.l = v.b(g2.getInt(i14));
                    int i15 = R20;
                    pVar.m = g2.getLong(i15);
                    int i16 = R21;
                    pVar.n = g2.getLong(i16);
                    int i17 = R22;
                    pVar.o = g2.getLong(i17);
                    int i18 = R23;
                    pVar.p = g2.getLong(i18);
                    int i19 = R24;
                    if (g2.getInt(i19) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    pVar.q = z5;
                    int i20 = R25;
                    pVar.r = v.d(g2.getInt(i20));
                    pVar.j = cVar;
                    arrayList.add(pVar);
                    i = i7;
                    R2 = i5;
                    R15 = i9;
                    R16 = i11;
                    R20 = i15;
                    R21 = i16;
                    R24 = i19;
                    R11 = i3;
                    R = i4;
                    R25 = i20;
                    R23 = i18;
                    R13 = i8;
                    R9 = i2;
                    R3 = i6;
                    R22 = i17;
                    R4 = i10;
                    R17 = i12;
                    R18 = i13;
                    R19 = i14;
                }
                g2.close();
                iVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g2.close();
                iVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = f2;
        }
    }

    public final com.amazon.aps.iva.k9.t f(String str) {
        com.amazon.aps.iva.k9.t tVar;
        com.amazon.aps.iva.p8.i f2 = com.amazon.aps.iva.p8.i.f(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            f2.i(1);
        } else {
            f2.k(1, str);
        }
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g2 = gVar.g(f2);
        try {
            if (g2.moveToFirst()) {
                tVar = v.e(g2.getInt(0));
            } else {
                tVar = null;
            }
            return tVar;
        } finally {
            g2.close();
            f2.release();
        }
    }

    public final ArrayList g(String str) {
        com.amazon.aps.iva.p8.i f2 = com.amazon.aps.iva.p8.i.f(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            f2.i(1);
        } else {
            f2.k(1, str);
        }
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g2 = gVar.g(f2);
        try {
            ArrayList arrayList = new ArrayList(g2.getCount());
            while (g2.moveToNext()) {
                arrayList.add(g2.getString(0));
            }
            return arrayList;
        } finally {
            g2.close();
            f2.release();
        }
    }

    public final ArrayList h(String str) {
        com.amazon.aps.iva.p8.i f2 = com.amazon.aps.iva.p8.i.f(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            f2.i(1);
        } else {
            f2.k(1, str);
        }
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g2 = gVar.g(f2);
        try {
            ArrayList arrayList = new ArrayList(g2.getCount());
            while (g2.moveToNext()) {
                arrayList.add(g2.getString(0));
            }
            return arrayList;
        } finally {
            g2.close();
            f2.release();
        }
    }

    public final p i(String str) {
        com.amazon.aps.iva.p8.i iVar;
        p pVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        com.amazon.aps.iva.p8.i f2 = com.amazon.aps.iva.p8.i.f(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            f2.i(1);
        } else {
            f2.k(1, str);
        }
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g2 = gVar.g(f2);
        try {
            int R = com.amazon.aps.iva.cq.b.R(g2, "required_network_type");
            int R2 = com.amazon.aps.iva.cq.b.R(g2, "requires_charging");
            int R3 = com.amazon.aps.iva.cq.b.R(g2, "requires_device_idle");
            int R4 = com.amazon.aps.iva.cq.b.R(g2, "requires_battery_not_low");
            int R5 = com.amazon.aps.iva.cq.b.R(g2, "requires_storage_not_low");
            int R6 = com.amazon.aps.iva.cq.b.R(g2, "trigger_content_update_delay");
            int R7 = com.amazon.aps.iva.cq.b.R(g2, "trigger_max_content_delay");
            int R8 = com.amazon.aps.iva.cq.b.R(g2, "content_uri_triggers");
            int R9 = com.amazon.aps.iva.cq.b.R(g2, "id");
            int R10 = com.amazon.aps.iva.cq.b.R(g2, "state");
            int R11 = com.amazon.aps.iva.cq.b.R(g2, "worker_class_name");
            int R12 = com.amazon.aps.iva.cq.b.R(g2, "input_merger_class_name");
            int R13 = com.amazon.aps.iva.cq.b.R(g2, "input");
            int R14 = com.amazon.aps.iva.cq.b.R(g2, "output");
            iVar = f2;
            try {
                int R15 = com.amazon.aps.iva.cq.b.R(g2, "initial_delay");
                int R16 = com.amazon.aps.iva.cq.b.R(g2, "interval_duration");
                int R17 = com.amazon.aps.iva.cq.b.R(g2, "flex_duration");
                int R18 = com.amazon.aps.iva.cq.b.R(g2, "run_attempt_count");
                int R19 = com.amazon.aps.iva.cq.b.R(g2, "backoff_policy");
                int R20 = com.amazon.aps.iva.cq.b.R(g2, "backoff_delay_duration");
                int R21 = com.amazon.aps.iva.cq.b.R(g2, "period_start_time");
                int R22 = com.amazon.aps.iva.cq.b.R(g2, "minimum_retention_duration");
                int R23 = com.amazon.aps.iva.cq.b.R(g2, "schedule_requested_at");
                int R24 = com.amazon.aps.iva.cq.b.R(g2, "run_in_foreground");
                int R25 = com.amazon.aps.iva.cq.b.R(g2, "out_of_quota_policy");
                if (g2.moveToFirst()) {
                    String string = g2.getString(R9);
                    String string2 = g2.getString(R11);
                    com.amazon.aps.iva.k9.c cVar = new com.amazon.aps.iva.k9.c();
                    cVar.a = v.c(g2.getInt(R));
                    if (g2.getInt(R2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.b = z;
                    if (g2.getInt(R3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.c = z2;
                    if (g2.getInt(R4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.d = z3;
                    if (g2.getInt(R5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.e = z4;
                    cVar.f = g2.getLong(R6);
                    cVar.g = g2.getLong(R7);
                    cVar.h = v.a(g2.getBlob(R8));
                    pVar = new p(string, string2);
                    pVar.b = v.e(g2.getInt(R10));
                    pVar.d = g2.getString(R12);
                    pVar.e = androidx.work.b.a(g2.getBlob(R13));
                    pVar.f = androidx.work.b.a(g2.getBlob(R14));
                    pVar.g = g2.getLong(R15);
                    pVar.h = g2.getLong(R16);
                    pVar.i = g2.getLong(R17);
                    pVar.k = g2.getInt(R18);
                    pVar.l = v.b(g2.getInt(R19));
                    pVar.m = g2.getLong(R20);
                    pVar.n = g2.getLong(R21);
                    pVar.o = g2.getLong(R22);
                    pVar.p = g2.getLong(R23);
                    if (g2.getInt(R24) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    pVar.q = z5;
                    pVar.r = v.d(g2.getInt(R25));
                    pVar.j = cVar;
                } else {
                    pVar = null;
                }
                g2.close();
                iVar.release();
                return pVar;
            } catch (Throwable th) {
                th = th;
                g2.close();
                iVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = f2;
        }
    }

    public final ArrayList j(String str) {
        com.amazon.aps.iva.p8.i f2 = com.amazon.aps.iva.p8.i.f(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            f2.i(1);
        } else {
            f2.k(1, str);
        }
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g2 = gVar.g(f2);
        try {
            int R = com.amazon.aps.iva.cq.b.R(g2, "id");
            int R2 = com.amazon.aps.iva.cq.b.R(g2, "state");
            ArrayList arrayList = new ArrayList(g2.getCount());
            while (g2.moveToNext()) {
                p.a aVar = new p.a();
                aVar.a = g2.getString(R);
                aVar.b = v.e(g2.getInt(R2));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            g2.close();
            f2.release();
        }
    }

    public final int k(long j, String str) {
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        g gVar2 = this.h;
        com.amazon.aps.iva.v8.e a2 = gVar2.a();
        a2.f(1, j);
        if (str == null) {
            a2.h(2);
        } else {
            a2.i(2, str);
        }
        gVar.c();
        try {
            int k = a2.k();
            gVar.h();
            return k;
        } finally {
            gVar.f();
            gVar2.c(a2);
        }
    }

    public final void l(String str, androidx.work.b bVar) {
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        c cVar = this.d;
        com.amazon.aps.iva.v8.e a2 = cVar.a();
        byte[] b2 = androidx.work.b.b(bVar);
        if (b2 == null) {
            a2.h(1);
        } else {
            a2.a(1, b2);
        }
        if (str == null) {
            a2.h(2);
        } else {
            a2.i(2, str);
        }
        gVar.c();
        try {
            a2.k();
            gVar.h();
        } finally {
            gVar.f();
            cVar.c(a2);
        }
    }

    public final void m(long j, String str) {
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        d dVar = this.e;
        com.amazon.aps.iva.v8.e a2 = dVar.a();
        a2.f(1, j);
        if (str == null) {
            a2.h(2);
        } else {
            a2.i(2, str);
        }
        gVar.c();
        try {
            a2.k();
            gVar.h();
        } finally {
            gVar.f();
            dVar.c(a2);
        }
    }

    public final int n(com.amazon.aps.iva.k9.t tVar, String... strArr) {
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("?");
            if (i < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        gVar.a();
        gVar.b();
        com.amazon.aps.iva.v8.e eVar = new com.amazon.aps.iva.v8.e(((com.amazon.aps.iva.v8.a) gVar.c.getWritableDatabase()).b.compileStatement(sb2));
        eVar.f(1, v.f(tVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                eVar.h(i2);
            } else {
                eVar.i(i2, str);
            }
            i2++;
        }
        gVar.c();
        try {
            int k = eVar.k();
            gVar.h();
            return k;
        } finally {
            gVar.f();
        }
    }
}
