package e.h.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import e.h.g.j1;
import e.h.g.r0;
import e.h.g.s1;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class r {

    /* loaded from: classes2.dex */
    public static class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public static Boolean f8090c;

        public a(String str, String str2) {
            this.a = str;
            this.f8091b = str2;
        }

        @Override // e.h.b.r.b
        public boolean a(Context context) {
            int i2;
            if (f8090c == null) {
                String str = this.a;
                Object obj = j1.a;
                boolean z = false;
                try {
                    i2 = context.getPackageManager().getPackageInfo(str, 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i2 = 0;
                }
                boolean z2 = true;
                if (i2 > 3260 && i2 < 10000) {
                    z = true;
                }
                if (z || i2 <= 13260) {
                    z2 = z;
                }
                f8090c = Boolean.valueOf(z2);
            }
            return f8090c.booleanValue();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public String f8091b;

        public abstract boolean a(Context context);
    }

    /* loaded from: classes2.dex */
    public static class c extends b {

        /* renamed from: c  reason: collision with root package name */
        public static Boolean f8092c;

        public c(String str, String str2) {
            this.a = str;
            this.f8091b = str2;
        }

        @Override // e.h.b.r.b
        public boolean a(Context context) {
            int i2;
            if (f8092c == null) {
                try {
                    i2 = context.getPackageManager().getPackageInfo(this.a, 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i2 = 0;
                }
                f8092c = Boolean.valueOf(i2 > 1500);
            }
            return f8092c.booleanValue();
        }
    }

    static {
        new HashSet();
    }

    public static b a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (c(context, "net.songlytics")) {
                return b("net.songlytics");
            }
            if (c(context, "spotify.music.playlist.maker")) {
                return b("spotify.music.playlist.maker");
            }
            if (c(context, "com.jrtstudio.iSyncr")) {
                return b("com.jrtstudio.iSyncr");
            }
            if (c(context, "com.jrtstudio.iSyncr4Mac")) {
                return b("com.jrtstudio.iSyncr4Mac");
            }
            if (c(context, "com.jrtstudio.iSyncrLite")) {
                return b("com.jrtstudio.iSyncrLite");
            }
            if (c(context, "iTunes.Sync.Android")) {
                return b("iTunes.Sync.Android");
            }
            return null;
        }
        throw new NetworkOnMainThreadException();
    }

    public static b b(String str) {
        if ("iTunes.Sync.Android".equals(str)) {
            return new a("iTunes.Sync.Android", "content://com.jrtstudio.iSyncr.MusicData.Dark.Free/");
        }
        if ("spotify.music.playlist.maker".equals(str)) {
            return new c("spotify.music.playlist.maker", "content://com.music.logger/");
        }
        if ("com.jrtstudio.iSyncr".equals(str)) {
            return new a("com.jrtstudio.iSyncr", "content://com.jrtstudio.iSyncr.MusicData/");
        }
        if ("com.jrtstudio.iSyncr4Mac".equals(str)) {
            return new a("com.jrtstudio.iSyncr4Mac", "content://com.jrtstudio.iSyncr.MusicData.Mac/");
        }
        if ("com.jrtstudio.iSyncrLite".equals(str)) {
            return new a("com.jrtstudio.iSyncrLite", "content://com.jrtstudio.iSyncr.MusicData.Free/");
        }
        return null;
    }

    public static boolean c(Context context, String str) {
        try {
            context.getApplicationContext().getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void d(Context context, s sVar, int i2) throws JSONException {
        boolean z;
        b a2;
        if (context == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new NetworkOnMainThreadException();
        }
        Cursor cursor = null;
        if ((sVar.has("q") ? sVar.getString("q") : null) == null) {
            throw new RuntimeException("Track needs a PackageName");
        }
        sVar.b();
        if (sVar.b().length() > 0 && !"!^!".equals(sVar.b())) {
            sVar.a();
            if (sVar.a().length() > 0 && !"!^!".equals(sVar.a())) {
                z = true;
                if (z || (a2 = a(context)) == null) {
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("track", sVar);
                String[] strArr = {"0", jSONObject.toString(), String.valueOf(i2)};
                try {
                    Uri parse = Uri.parse(a2.f8091b);
                    if (a2.a(context)) {
                        try {
                            cursor = context.getContentResolver().query(parse, new String[]{"_musicData2"}, null, strArr, null);
                            if (cursor == null) {
                                j1.o(TimeUnit.SECONDS.toMillis(2L), new r0());
                                cursor = context.getContentResolver().query(parse, new String[]{"_musicData2"}, null, strArr, null);
                            }
                        } catch (Exception e2) {
                            s1.l(e2, true);
                        }
                    }
                    if (cursor == null) {
                        cursor = context.getContentResolver().query(parse, new String[]{"_musicData"}, null, strArr, null);
                    }
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    s1.l(e3, true);
                    return;
                }
            }
        }
        z = false;
        if (z) {
        }
    }
}
