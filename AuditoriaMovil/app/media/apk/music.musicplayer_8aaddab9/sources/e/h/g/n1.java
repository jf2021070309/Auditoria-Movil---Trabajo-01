package e.h.g;

import android.content.Context;
/* loaded from: classes.dex */
public class n1 {
    public static final String[] a = {"com.jrtstudio.AnotherMusicPlayer", "com.jrtstudio.AnotherMusicPlayer.Unlocker", "com.jrtstudio.iSyncr", "com.jrtstudio.iSyncr4Mac", "com.jrtstudio.iSyncr4MacLite", "com.jrtstudio.iSyncrLite", "com.jrtstudio.music", "jrtstudio.music.ad.blocker", "music.musicplayer", "music.musicplayer.blue", "iTunes.Sync.Android", "ringtone.maker", "ringtone.maker.pro", "music.musica.musicplayer", "com.jukebox.music.player"};

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f8339b;

    public static boolean a(Context context, String str) {
        if (f8339b == null) {
            f8339b = Boolean.FALSE;
            String[] strArr = a;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str2 = strArr[i2];
                if (!str2.equals(str) && j1.d(context, str2, false)) {
                    f8339b = Boolean.TRUE;
                    break;
                }
                i2++;
            }
        }
        return f8339b.booleanValue();
    }

    public static boolean b(Context context) {
        return j1.d(context, "ringtone.maker", false);
    }
}
