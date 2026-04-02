package com.amazon.aps.iva.nk;

import com.amazon.aps.iva.ee0.f1;
import java.util.NoSuchElementException;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: PlaybackState.kt */
/* loaded from: classes.dex */
public enum e {
    IDLE(1),
    BUFFERING(2),
    READY(3),
    ENDED(4),
    END_OF_MEDIA_ITEM(5),
    VIDEO_SETTING_CHANGE(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
    
    public static final a Companion = new a();
    private final int value;

    /* compiled from: PlaybackState.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static e a(int i) {
            e[] values;
            boolean z;
            for (e eVar : e.values()) {
                if (eVar.getValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return eVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    e(int i) {
        this.value = i;
    }

    public final boolean getHasPlaybackEnded() {
        return f1.K(4, 5).contains(Integer.valueOf(this.value));
    }

    public final int getValue() {
        return this.value;
    }
}
