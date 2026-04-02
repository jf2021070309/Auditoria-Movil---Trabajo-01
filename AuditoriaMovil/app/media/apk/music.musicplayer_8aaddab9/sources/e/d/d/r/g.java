package e.d.d.r;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes2.dex */
public class g {
    public static g a;

    /* renamed from: b  reason: collision with root package name */
    public static final SimpleDateFormat f7568b = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: c  reason: collision with root package name */
    public final SharedPreferences f7569c;

    public g(Context context) {
        this.f7569c = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    public synchronized boolean a(String str, long j2) {
        if (!this.f7569c.contains(str)) {
            this.f7569c.edit().putLong(str, j2).apply();
            return true;
        }
        Date date = new Date(this.f7569c.getLong(str, -1L));
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = f7568b;
        if (!simpleDateFormat.format(date).equals(simpleDateFormat.format(date2))) {
            this.f7569c.edit().putLong(str, j2).apply();
            return true;
        }
        return false;
    }
}
