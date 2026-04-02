package c.r;

import android.media.session.MediaSessionManager;
/* loaded from: classes.dex */
public final class b extends c {
    public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public b(String str, int i2, int i3) {
        super(str, i2, i3);
        new MediaSessionManager.RemoteUserInfo(str, i2, i3);
    }
}
