package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
@KeepForSdk
/* loaded from: classes4.dex */
public final class FirelogAnalyticsEvent {
    private final String zza;
    private final Intent zzb;

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
    /* loaded from: classes4.dex */
    public static final class zza {
        private final FirelogAnalyticsEvent zza;

        public zza(FirelogAnalyticsEvent firelogAnalyticsEvent) {
            this.zza = (FirelogAnalyticsEvent) Preconditions.checkNotNull(firelogAnalyticsEvent);
        }

        public final FirelogAnalyticsEvent zza() {
            return this.zza;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
    /* loaded from: classes4.dex */
    public static class zzb implements ObjectEncoder<FirelogAnalyticsEvent> {
        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            FirelogAnalyticsEvent firelogAnalyticsEvent = (FirelogAnalyticsEvent) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            Intent zza = firelogAnalyticsEvent.zza();
            objectEncoderContext2.add("ttl", zzp.zzf(zza));
            objectEncoderContext2.add("event", firelogAnalyticsEvent.zzb());
            objectEncoderContext2.add("instanceId", zzp.zzc());
            objectEncoderContext2.add("priority", zzp.zzm(zza));
            objectEncoderContext2.add("packageName", zzp.zzb());
            objectEncoderContext2.add("sdkPlatform", "ANDROID");
            objectEncoderContext2.add("messageType", zzp.zzk(zza));
            String zzj = zzp.zzj(zza);
            if (zzj != null) {
                objectEncoderContext2.add("messageId", zzj);
            }
            String zzl = zzp.zzl(zza);
            if (zzl != null) {
                objectEncoderContext2.add("topic", zzl);
            }
            String zzg = zzp.zzg(zza);
            if (zzg != null) {
                objectEncoderContext2.add("collapseKey", zzg);
            }
            if (zzp.zzi(zza) != null) {
                objectEncoderContext2.add("analyticsLabel", zzp.zzi(zza));
            }
            if (zzp.zzh(zza) != null) {
                objectEncoderContext2.add("composerLabel", zzp.zzh(zza));
            }
            String zzd = zzp.zzd();
            if (zzd != null) {
                objectEncoderContext2.add("projectNumber", zzd);
            }
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
    /* loaded from: classes4.dex */
    public static final class zzc implements ObjectEncoder<zza> {
        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("messaging_client_event", ((zza) obj).zza());
        }
    }

    public FirelogAnalyticsEvent(String str, Intent intent) {
        this.zza = Preconditions.checkNotEmpty(str, "evenType must be non-null");
        this.zzb = (Intent) Preconditions.checkNotNull(intent, "intent must be non-null");
    }

    public final Intent zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
