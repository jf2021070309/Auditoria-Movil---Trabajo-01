package android.support.v4.media.session;

import android.media.session.MediaSession;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* loaded from: classes.dex */
class MediaSessionCompatApi22 {
    public static void setRatingType(Object sessionObj, int type) {
        ((MediaSession) sessionObj).setRatingType(type);
    }

    private MediaSessionCompatApi22() {
    }
}
