package com.applovin.impl.communicator;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {
    private final Context a;
    private final Queue<CommunicatorMessageImpl> c = new LinkedList();
    private final Object d = new Object();
    private final ScheduledThreadPoolExecutor b = a();

    public MessagingServiceImpl(Context context) {
        this.a = context;
    }

    private Queue<CommunicatorMessageImpl> a(String str) {
        LinkedList linkedList;
        synchronized (this.d) {
            linkedList = new LinkedList();
            for (CommunicatorMessageImpl communicatorMessageImpl : this.c) {
                if (communicatorMessageImpl.a() && communicatorMessageImpl.getTopic().equals(str)) {
                    linkedList.add(communicatorMessageImpl);
                }
            }
        }
        return linkedList;
    }

    private ScheduledThreadPoolExecutor a() {
        return new ScheduledThreadPoolExecutor(4, new ThreadFactory() { // from class: com.applovin.impl.communicator.MessagingServiceImpl.2
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "AppLovinSdk:com.applovin.communicator");
                thread.setPriority(10);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    private void a(final CommunicatorMessageImpl communicatorMessageImpl) {
        this.b.execute(new Runnable() { // from class: com.applovin.impl.communicator.MessagingServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                AppLovinBroadcastManager.getInstance(MessagingServiceImpl.this.a).sendBroadcastSync(communicatorMessageImpl, null);
            }
        });
    }

    public void maybeFlushStickyMessages(String str) {
        for (CommunicatorMessageImpl communicatorMessageImpl : a(str)) {
            a(communicatorMessageImpl);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        a(appLovinCommunicatorMessage);
        synchronized (this.d) {
            this.c.add(appLovinCommunicatorMessage);
        }
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }
}
