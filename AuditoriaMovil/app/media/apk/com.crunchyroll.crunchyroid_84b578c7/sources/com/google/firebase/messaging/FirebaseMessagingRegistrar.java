package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
@Keep
@KeepForSdk
/* loaded from: classes4.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
    /* loaded from: classes4.dex */
    public static class zzb implements TransportFactory {
        @Override // com.google.android.datatransport.TransportFactory
        public final <T> Transport<T> getTransport(String str, Class<T> cls, Transformer<T, byte[]> transformer) {
            return new zza();
        }

        @Override // com.google.android.datatransport.TransportFactory
        public final <T> Transport<T> getTransport(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer) {
            return new zza();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebaseMessaging.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(FirebaseInstanceId.class)).add(Dependency.required(UserAgentPublisher.class)).add(Dependency.required(HeartBeatInfo.class)).add(Dependency.optional(TransportFactory.class)).add(Dependency.required(FirebaseInstallationsApi.class)).factory(zzl.zza).alwaysEager().build(), LibraryVersionComponent.create("fire-fcm", "20.1.6"));
    }

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
    /* loaded from: classes4.dex */
    public static class zza<T> implements Transport<T> {
        private zza() {
        }

        @Override // com.google.android.datatransport.Transport
        public final void schedule(Event<T> event, TransportScheduleCallback transportScheduleCallback) {
            transportScheduleCallback.onSchedule(null);
        }

        @Override // com.google.android.datatransport.Transport
        public final void send(Event<T> event) {
        }
    }
}
