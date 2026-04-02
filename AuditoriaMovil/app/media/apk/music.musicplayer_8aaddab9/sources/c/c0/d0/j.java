package c.c0.d0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
/* loaded from: classes.dex */
public class j {
    public static c.v.k.a a = new a(1, 2);

    /* renamed from: b  reason: collision with root package name */
    public static c.v.k.a f1359b = new b(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static c.v.k.a f1360c = new c(4, 5);

    /* renamed from: d  reason: collision with root package name */
    public static c.v.k.a f1361d = new d(6, 7);

    /* renamed from: e  reason: collision with root package name */
    public static c.v.k.a f1362e = new e(7, 8);

    /* renamed from: f  reason: collision with root package name */
    public static c.v.k.a f1363f = new f(8, 9);

    /* renamed from: g  reason: collision with root package name */
    public static c.v.k.a f1364g = new g(11, 12);

    /* loaded from: classes.dex */
    public class a extends c.v.k.a {
        public a(int i2, int i3) {
            super(i2, i3);
        }

        @Override // c.v.k.a
        public void a(c.x.a.b bVar) {
            ((c.x.a.f.a) bVar).f2835b.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c.x.a.f.a aVar = (c.x.a.f.a) bVar;
            aVar.f2835b.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.f2835b.execSQL("DROP TABLE IF EXISTS alarmInfo");
            aVar.f2835b.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* loaded from: classes.dex */
    public class b extends c.v.k.a {
        public b(int i2, int i3) {
            super(i2, i3);
        }

        @Override // c.v.k.a
        public void a(c.x.a.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((c.x.a.f.a) bVar).f2835b.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends c.v.k.a {
        public c(int i2, int i3) {
            super(i2, i3);
        }

        @Override // c.v.k.a
        public void a(c.x.a.b bVar) {
            ((c.x.a.f.a) bVar).f2835b.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            ((c.x.a.f.a) bVar).f2835b.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* loaded from: classes.dex */
    public class d extends c.v.k.a {
        public d(int i2, int i3) {
            super(i2, i3);
        }

        @Override // c.v.k.a
        public void a(c.x.a.b bVar) {
            ((c.x.a.f.a) bVar).f2835b.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* loaded from: classes.dex */
    public class e extends c.v.k.a {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        @Override // c.v.k.a
        public void a(c.x.a.b bVar) {
            ((c.x.a.f.a) bVar).f2835b.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* loaded from: classes.dex */
    public class f extends c.v.k.a {
        public f(int i2, int i3) {
            super(i2, i3);
        }

        @Override // c.v.k.a
        public void a(c.x.a.b bVar) {
            ((c.x.a.f.a) bVar).f2835b.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public class g extends c.v.k.a {
        public g(int i2, int i3) {
            super(i2, i3);
        }

        @Override // c.v.k.a
        public void a(c.x.a.b bVar) {
            ((c.x.a.f.a) bVar).f2835b.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static class h extends c.v.k.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f1365c;

        public h(Context context, int i2, int i3) {
            super(i2, i3);
            this.f1365c = context;
        }

        @Override // c.v.k.a
        public void a(c.x.a.b bVar) {
            if (this.f2804b >= 10) {
                ((c.x.a.f.a) bVar).f2835b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f1365c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i extends c.v.k.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f1366c;

        public i(Context context) {
            super(9, 10);
            this.f1366c = context;
        }

        @Override // c.v.k.a
        public void a(c.x.a.b bVar) {
            ((c.x.a.f.a) bVar).f2835b.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.f1366c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                long j3 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                ((c.x.a.f.a) bVar).f2835b.beginTransaction();
                try {
                    ((c.x.a.f.a) bVar).f2835b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    ((c.x.a.f.a) bVar).f2835b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j3)});
                    sharedPreferences.edit().clear().apply();
                    ((c.x.a.f.a) bVar).f2835b.setTransactionSuccessful();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = this.f1366c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                ((c.x.a.f.a) bVar).f2835b.beginTransaction();
                try {
                    ((c.x.a.f.a) bVar).f2835b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                    ((c.x.a.f.a) bVar).f2835b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                    sharedPreferences2.edit().clear().apply();
                    ((c.x.a.f.a) bVar).f2835b.setTransactionSuccessful();
                } finally {
                }
            }
        }
    }
}
