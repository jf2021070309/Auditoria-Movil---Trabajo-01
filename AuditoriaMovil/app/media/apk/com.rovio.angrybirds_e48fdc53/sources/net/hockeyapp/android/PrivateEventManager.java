package net.hockeyapp.android;

import java.util.LinkedList;
import java.util.List;
/* loaded from: classes4.dex */
public final class PrivateEventManager {
    public static final int EVENT_TYPE_UNCAUGHT_EXCEPTION = 1;
    private static List<HockeyEventListener> a = new LinkedList();

    /* loaded from: classes4.dex */
    public interface HockeyEventListener {
        void onHockeyEvent(Event event);
    }

    public static void addEventListener(HockeyEventListener hockeyEventListener) {
        a.add(hockeyEventListener);
    }

    /* loaded from: classes4.dex */
    public static final class Event {
        private final int a;

        protected Event(int i) {
            this.a = i;
        }

        public int getType() {
            return this.a;
        }
    }
}
