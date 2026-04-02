package androidx.work.impl;

import android.content.Context;
import com.amazon.aps.iva.p8.h;
import com.amazon.aps.iva.r8.c;
import com.amazon.aps.iva.t9.c;
import com.amazon.aps.iva.t9.e;
import com.amazon.aps.iva.t9.f;
import com.amazon.aps.iva.t9.i;
import com.amazon.aps.iva.t9.k;
import com.amazon.aps.iva.t9.l;
import com.amazon.aps.iva.t9.n;
import com.amazon.aps.iva.t9.o;
import com.amazon.aps.iva.t9.q;
import com.amazon.aps.iva.t9.r;
import com.amazon.aps.iva.t9.t;
import com.amazon.aps.iva.t9.u;
import com.amazon.aps.iva.u8.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public static final /* synthetic */ int s = 0;
    public volatile r l;
    public volatile c m;
    public volatile u n;
    public volatile i o;
    public volatile l p;
    public volatile o q;
    public volatile f r;

    /* loaded from: classes.dex */
    public class a extends h.a {
        public a() {
        }

        @Override // com.amazon.aps.iva.p8.h.a
        public final void a(com.amazon.aps.iva.v8.a aVar) {
            aVar.f("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar.f("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar.f("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar.f("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar.f("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar.f("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar.f("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar.f("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar.f("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.f("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // com.amazon.aps.iva.p8.h.a
        public final h.b b(com.amazon.aps.iva.v8.a aVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new c.a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap.put("prerequisite_id", new c.a(2, 1, "prerequisite_id", "TEXT", null, true));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new c.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
            hashSet2.add(new c.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
            com.amazon.aps.iva.r8.c cVar = new com.amazon.aps.iva.r8.c("Dependency", hashMap, hashSet, hashSet2);
            com.amazon.aps.iva.r8.c a = com.amazon.aps.iva.r8.c.a(aVar, "Dependency");
            if (!cVar.equals(a)) {
                return new h.b("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + cVar + "\n Found:\n" + a, false);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new c.a(1, 1, "id", "TEXT", null, true));
            hashMap2.put("state", new c.a(0, 1, "state", "INTEGER", null, true));
            hashMap2.put("worker_class_name", new c.a(0, 1, "worker_class_name", "TEXT", null, true));
            hashMap2.put("input_merger_class_name", new c.a(0, 1, "input_merger_class_name", "TEXT", null, false));
            hashMap2.put("input", new c.a(0, 1, "input", "BLOB", null, true));
            hashMap2.put("output", new c.a(0, 1, "output", "BLOB", null, true));
            hashMap2.put("initial_delay", new c.a(0, 1, "initial_delay", "INTEGER", null, true));
            hashMap2.put("interval_duration", new c.a(0, 1, "interval_duration", "INTEGER", null, true));
            hashMap2.put("flex_duration", new c.a(0, 1, "flex_duration", "INTEGER", null, true));
            hashMap2.put("run_attempt_count", new c.a(0, 1, "run_attempt_count", "INTEGER", null, true));
            hashMap2.put("backoff_policy", new c.a(0, 1, "backoff_policy", "INTEGER", null, true));
            hashMap2.put("backoff_delay_duration", new c.a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
            hashMap2.put("period_start_time", new c.a(0, 1, "period_start_time", "INTEGER", null, true));
            hashMap2.put("minimum_retention_duration", new c.a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
            hashMap2.put("schedule_requested_at", new c.a(0, 1, "schedule_requested_at", "INTEGER", null, true));
            hashMap2.put("run_in_foreground", new c.a(0, 1, "run_in_foreground", "INTEGER", null, true));
            hashMap2.put("out_of_quota_policy", new c.a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
            hashMap2.put("required_network_type", new c.a(0, 1, "required_network_type", "INTEGER", null, false));
            hashMap2.put("requires_charging", new c.a(0, 1, "requires_charging", "INTEGER", null, true));
            hashMap2.put("requires_device_idle", new c.a(0, 1, "requires_device_idle", "INTEGER", null, true));
            hashMap2.put("requires_battery_not_low", new c.a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
            hashMap2.put("requires_storage_not_low", new c.a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
            hashMap2.put("trigger_content_update_delay", new c.a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
            hashMap2.put("trigger_max_content_delay", new c.a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
            hashMap2.put("content_uri_triggers", new c.a(0, 1, "content_uri_triggers", "BLOB", null, false));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new c.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
            hashSet4.add(new c.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
            com.amazon.aps.iva.r8.c cVar2 = new com.amazon.aps.iva.r8.c("WorkSpec", hashMap2, hashSet3, hashSet4);
            com.amazon.aps.iva.r8.c a2 = com.amazon.aps.iva.r8.c.a(aVar, "WorkSpec");
            if (!cVar2.equals(a2)) {
                return new h.b("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + cVar2 + "\n Found:\n" + a2, false);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new c.a(1, 1, "tag", "TEXT", null, true));
            hashMap3.put("work_spec_id", new c.a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new c.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
            com.amazon.aps.iva.r8.c cVar3 = new com.amazon.aps.iva.r8.c("WorkTag", hashMap3, hashSet5, hashSet6);
            com.amazon.aps.iva.r8.c a3 = com.amazon.aps.iva.r8.c.a(aVar, "WorkTag");
            if (!cVar3.equals(a3)) {
                return new h.b("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + cVar3 + "\n Found:\n" + a3, false);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new c.a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap4.put("system_id", new c.a(0, 1, "system_id", "INTEGER", null, true));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            com.amazon.aps.iva.r8.c cVar4 = new com.amazon.aps.iva.r8.c("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            com.amazon.aps.iva.r8.c a4 = com.amazon.aps.iva.r8.c.a(aVar, "SystemIdInfo");
            if (!cVar4.equals(a4)) {
                return new h.b("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + cVar4 + "\n Found:\n" + a4, false);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new c.a(1, 1, AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", null, true));
            hashMap5.put("work_spec_id", new c.a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new c.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
            com.amazon.aps.iva.r8.c cVar5 = new com.amazon.aps.iva.r8.c("WorkName", hashMap5, hashSet8, hashSet9);
            com.amazon.aps.iva.r8.c a5 = com.amazon.aps.iva.r8.c.a(aVar, "WorkName");
            if (!cVar5.equals(a5)) {
                return new h.b("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + cVar5 + "\n Found:\n" + a5, false);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new c.a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap6.put("progress", new c.a(0, 1, "progress", "BLOB", null, true));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            com.amazon.aps.iva.r8.c cVar6 = new com.amazon.aps.iva.r8.c("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            com.amazon.aps.iva.r8.c a6 = com.amazon.aps.iva.r8.c.a(aVar, "WorkProgress");
            if (!cVar6.equals(a6)) {
                return new h.b("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + cVar6 + "\n Found:\n" + a6, false);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new c.a(1, 1, "key", "TEXT", null, true));
            hashMap7.put("long_value", new c.a(0, 1, "long_value", "INTEGER", null, false));
            com.amazon.aps.iva.r8.c cVar7 = new com.amazon.aps.iva.r8.c("Preference", hashMap7, new HashSet(0), new HashSet(0));
            com.amazon.aps.iva.r8.c a7 = com.amazon.aps.iva.r8.c.a(aVar, "Preference");
            if (!cVar7.equals(a7)) {
                return new h.b("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + cVar7 + "\n Found:\n" + a7, false);
            }
            return new h.b(null, true);
        }
    }

    @Override // com.amazon.aps.iva.p8.g
    public final com.amazon.aps.iva.p8.f d() {
        return new com.amazon.aps.iva.p8.f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // com.amazon.aps.iva.p8.g
    public final b e(com.amazon.aps.iva.p8.a aVar) {
        h hVar = new h(aVar, new a());
        Context context = aVar.b;
        if (context != null) {
            return aVar.a.a(new b.C0760b(context, aVar.c, hVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final com.amazon.aps.iva.t9.b i() {
        com.amazon.aps.iva.t9.c cVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new com.amazon.aps.iva.t9.c(this);
            }
            cVar = this.m;
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e j() {
        f fVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new f(this);
            }
            fVar = this.r;
        }
        return fVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final com.amazon.aps.iva.t9.h k() {
        i iVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new i(this);
            }
            iVar = this.o;
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k l() {
        l lVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new l(this);
            }
            lVar = this.p;
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n m() {
        o oVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new o(this);
            }
            oVar = this.q;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q n() {
        r rVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new r(this);
            }
            rVar = this.l;
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t o() {
        u uVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new u(this);
            }
            uVar = this.n;
        }
        return uVar;
    }
}
