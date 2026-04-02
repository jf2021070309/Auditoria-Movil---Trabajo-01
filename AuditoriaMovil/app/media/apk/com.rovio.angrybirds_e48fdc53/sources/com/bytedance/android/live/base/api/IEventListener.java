package com.bytedance.android.live.base.api;

import java.util.HashMap;
/* loaded from: classes.dex */
public interface IEventListener {

    /* loaded from: classes.dex */
    public static class Event {
        public static final String KEY_OPEN_ROOM_ID = "open_room_id";
        public static final int TYPE_COMMENT = 4;
        public static final int TYPE_ENTER = 1;
        public static final int TYPE_EXIT = 2;
        public static final int TYPE_FOLLOW = 3;
        public static final int TYPE_ORDER = 5;
        public static final int TYPE_ORDER_PAYMENT_SUCCESS = 7;
        public static final int TYPE_ORDER_PAYMENT_SUCCESS_PAGE_SHOW = 6;
        public static final int TYPE_UNKNOWN = 0;
        public final HashMap<String, String> extra = new HashMap<>();
        public final long time;
        public final int type;

        public Event(int i, long j) {
            this.type = i;
            this.time = j;
        }
    }

    void onEvent(Event event);
}
