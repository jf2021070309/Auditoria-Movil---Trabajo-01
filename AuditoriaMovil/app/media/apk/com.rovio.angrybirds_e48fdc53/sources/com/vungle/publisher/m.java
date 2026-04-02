package com.vungle.publisher;

import android.database.Cursor;
import com.vungle.publisher.log.Logger;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public enum m {
    vungle_local,
    vungle_streaming,
    vungle_mraid,
    third_party_mraid;

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        public m a(String str) {
            m[] values;
            if (str == null) {
                return null;
            }
            for (m mVar : m.values()) {
                if (mVar.toString().equals(str)) {
                    return mVar;
                }
            }
            Logger.e(Logger.PROTOCOL_TAG, "unknown AdType: " + str, new RuntimeException());
            return null;
        }

        public m a(Cursor cursor, String str) {
            if (cursor != null && cursor.getCount() == 1 && cursor.moveToFirst()) {
                return a(ce.e(cursor, str));
            }
            Logger.e(Logger.PROTOCOL_TAG, "AdType not found", new RuntimeException());
            return null;
        }

        public m[] a() {
            return new m[]{m.vungle_local, m.vungle_mraid, m.third_party_mraid};
        }
    }
}
