package com.amazon.aps.iva.c6;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
/* compiled from: AudioCapabilitiesReceiver.java */
/* loaded from: classes.dex */
public final class c {
    public final Context a;
    public final e b;
    public final Handler c;
    public final b d;
    public final d e;
    public final C0163c f;
    public com.amazon.aps.iva.c6.a g;
    public boolean h;

    /* compiled from: AudioCapabilitiesReceiver.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    /* loaded from: classes.dex */
    public final class b extends AudioDeviceCallback {
        public b() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            c cVar = c.this;
            c.a(cVar, com.amazon.aps.iva.c6.a.a(cVar.a));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            c cVar = c.this;
            c.a(cVar, com.amazon.aps.iva.c6.a.a(cVar.a));
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    /* renamed from: com.amazon.aps.iva.c6.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0163c extends ContentObserver {
        public final ContentResolver a;
        public final Uri b;

        public C0163c(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.a = contentResolver;
            this.b = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            c cVar = c.this;
            c.a(cVar, com.amazon.aps.iva.c6.a.a(cVar.a));
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    /* loaded from: classes.dex */
    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                c.a(c.this, com.amazon.aps.iva.c6.a.b(context, intent));
            }
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    /* loaded from: classes.dex */
    public interface e {
        void a(com.amazon.aps.iva.c6.a aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r4, com.amazon.aps.iva.c6.r r5) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r4 = r4.getApplicationContext()
            r3.a = r4
            r3.b = r5
            r5 = 0
            android.os.Handler r0 = com.amazon.aps.iva.t5.g0.n(r5)
            r3.c = r0
            int r1 = com.amazon.aps.iva.t5.g0.a
            r2 = 23
            if (r1 < r2) goto L1e
            com.amazon.aps.iva.c6.c$b r2 = new com.amazon.aps.iva.c6.c$b
            r2.<init>()
            goto L1f
        L1e:
            r2 = r5
        L1f:
            r3.d = r2
            r2 = 21
            if (r1 < r2) goto L2b
            com.amazon.aps.iva.c6.c$d r2 = new com.amazon.aps.iva.c6.c$d
            r2.<init>()
            goto L2c
        L2b:
            r2 = r5
        L2c:
            r3.e = r2
            com.amazon.aps.iva.c6.a r2 = com.amazon.aps.iva.c6.a.c
            r2 = 17
            if (r1 < r2) goto L48
            java.lang.String r1 = com.amazon.aps.iva.t5.g0.c
            java.lang.String r2 = "Amazon"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L46
            java.lang.String r2 = "Xiaomi"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L48
        L46:
            r1 = 1
            goto L49
        L48:
            r1 = 0
        L49:
            if (r1 == 0) goto L52
            java.lang.String r1 = "external_surround_sound_enabled"
            android.net.Uri r1 = android.provider.Settings.Global.getUriFor(r1)
            goto L53
        L52:
            r1 = r5
        L53:
            if (r1 == 0) goto L5e
            com.amazon.aps.iva.c6.c$c r5 = new com.amazon.aps.iva.c6.c$c
            android.content.ContentResolver r4 = r4.getContentResolver()
            r5.<init>(r0, r4, r1)
        L5e:
            r3.f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.c.<init>(android.content.Context, com.amazon.aps.iva.c6.r):void");
    }

    public static void a(c cVar, com.amazon.aps.iva.c6.a aVar) {
        if (cVar.h && !aVar.equals(cVar.g)) {
            cVar.g = aVar;
            cVar.b.a(aVar);
        }
    }
}
