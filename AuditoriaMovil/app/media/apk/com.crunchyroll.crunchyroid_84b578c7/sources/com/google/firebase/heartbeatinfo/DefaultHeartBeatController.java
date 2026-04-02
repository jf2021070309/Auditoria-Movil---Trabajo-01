package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import com.amazon.aps.iva.b8.g2;
import com.amazon.aps.iva.k3.n;
import com.amazon.aps.iva.r90.a;
import com.amazon.aps.iva.r90.c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.codec.binary.Hex;
/* loaded from: classes4.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {
    private static final ThreadFactory THREAD_FACTORY = new a();
    private final Context applicationContext;
    private final Executor backgroundExecutor;
    private final Set<HeartBeatConsumer> consumers;
    private final Provider<HeartBeatInfoStorage> storageProvider;
    private final Provider<UserAgentPublisher> userAgentProvider;

    private DefaultHeartBeatController(final Context context, final String str, Set<HeartBeatConsumer> set, Provider<UserAgentPublisher> provider) {
        this(new Provider() { // from class: com.amazon.aps.iva.r90.d
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                HeartBeatInfoStorage lambda$new$3;
                lambda$new$3 = DefaultHeartBeatController.lambda$new$3(context, str);
                return lambda$new$3;
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), THREAD_FACTORY), provider, context);
    }

    public static Component<DefaultHeartBeatController> component() {
        return Component.builder(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).add(Dependency.required(Context.class)).add(Dependency.required(FirebaseApp.class)).add(Dependency.setOf(HeartBeatConsumer.class)).add(Dependency.requiredProvider(UserAgentPublisher.class)).factory(new c()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DefaultHeartBeatController lambda$component$4(ComponentContainer componentContainer) {
        return new DefaultHeartBeatController((Context) componentContainer.get(Context.class), ((FirebaseApp) componentContainer.get(FirebaseApp.class)).getPersistenceKey(), componentContainer.setOf(HeartBeatConsumer.class), componentContainer.getProvider(UserAgentPublisher.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$getHeartBeatsHeader$2() throws Exception {
        String byteArrayOutputStream;
        synchronized (this) {
            HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
            List<HeartBeatResult> allHeartBeats = heartBeatInfoStorage.getAllHeartBeats();
            heartBeatInfoStorage.deleteAllHeartBeats();
            com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
            for (int i = 0; i < allHeartBeats.size(); i++) {
                HeartBeatResult heartBeatResult = allHeartBeats.get(i);
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
                cVar.put("agent", heartBeatResult.getUserAgent());
                cVar.put("dates", new com.amazon.aps.iva.if0.a((Collection<?>) heartBeatResult.getUsedDates()));
                aVar.put(cVar);
            }
            com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
            cVar2.put("heartbeats", aVar);
            cVar2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(cVar2.toString().getBytes(Hex.DEFAULT_CHARSET_NAME));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString(Hex.DEFAULT_CHARSET_NAME);
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HeartBeatInfoStorage lambda$new$3(Context context, String str) {
        return new HeartBeatInfoStorage(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$registerHeartBeat$1() throws Exception {
        synchronized (this) {
            this.storageProvider.get().storeHeartBeat(System.currentTimeMillis(), this.userAgentProvider.get().getUserAgent());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$static$0(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public synchronized HeartBeatInfo.HeartBeat getHeartBeatCode(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
        if (heartBeatInfoStorage.shouldSendGlobalHeartBeat(currentTimeMillis)) {
            heartBeatInfoStorage.postHeartBeatCleanUp();
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public Task<String> getHeartBeatsHeader() {
        if (!n.a(this.applicationContext)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.backgroundExecutor, new g2(this, 2));
    }

    public Task<Void> registerHeartBeat() {
        if (this.consumers.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!n.a(this.applicationContext)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.backgroundExecutor, new Callable() { // from class: com.amazon.aps.iva.r90.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$registerHeartBeat$1;
                lambda$registerHeartBeat$1 = DefaultHeartBeatController.this.lambda$registerHeartBeat$1();
                return lambda$registerHeartBeat$1;
            }
        });
    }

    public DefaultHeartBeatController(Provider<HeartBeatInfoStorage> provider, Set<HeartBeatConsumer> set, Executor executor, Provider<UserAgentPublisher> provider2, Context context) {
        this.storageProvider = provider;
        this.consumers = set;
        this.backgroundExecutor = executor;
        this.userAgentProvider = provider2;
        this.applicationContext = context;
    }
}
