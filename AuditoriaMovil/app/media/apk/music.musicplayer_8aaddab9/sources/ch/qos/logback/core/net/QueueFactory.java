package ch.qos.logback.core.net;

import java.util.concurrent.LinkedBlockingDeque;
/* loaded from: classes.dex */
public class QueueFactory {
    public <E> LinkedBlockingDeque<E> newLinkedBlockingDeque(int i2) {
        if (i2 < 1) {
            i2 = 1;
        }
        return new LinkedBlockingDeque<>(i2);
    }
}
