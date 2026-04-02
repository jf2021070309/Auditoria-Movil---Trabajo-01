package com.amazon.aps.iva.c6;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import com.amazon.aps.iva.t5.g0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
/* compiled from: AudioCapabilities.java */
/* loaded from: classes.dex */
public final class a {
    public static final a c = new a(new int[]{2}, 10);
    public static final ImmutableList<Integer> d = ImmutableList.of(2, 5, 6);
    public static final ImmutableMap<Integer, Integer> e = new ImmutableMap.Builder().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();
    public final int[] a;
    public final int b;

    /* compiled from: AudioCapabilities.java */
    /* renamed from: com.amazon.aps.iva.c6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0162a {
        private static final ImmutableSet<Integer> a() {
            ImmutableSet.Builder add = new ImmutableSet.Builder().add((Object[]) new Integer[]{8, 7});
            int i = g0.a;
            if (i >= 31) {
                add.add((Object[]) new Integer[]{26, 27});
            }
            if (i >= 33) {
                add.add((ImmutableSet.Builder) 30);
            }
            return add.build();
        }

        public static final boolean b(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            ImmutableSet<Integer> a = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (a.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: AudioCapabilities.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static ImmutableList<Integer> a() {
            boolean isDirectPlaybackSupported;
            ImmutableList.Builder builder = ImmutableList.builder();
            UnmodifiableIterator<Integer> it = a.e.keySet().iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (g0.a >= 34 || intValue != 30) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), a);
                    if (isDirectPlaybackSupported) {
                        builder.add((ImmutableList.Builder) Integer.valueOf(intValue));
                    }
                }
            }
            builder.add((ImmutableList.Builder) 2);
            return builder.build();
        }

        public static int b(int i, int i2) {
            boolean isDirectPlaybackSupported;
            for (int i3 = 10; i3 > 0; i3--) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(g0.q(i3)).build(), a);
                if (isDirectPlaybackSupported) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public a(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    public static a a(Context context) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r8 != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7 A[RETURN] */
    @android.annotation.SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.c6.a b(android.content.Context r8, android.content.Intent r9) {
        /*
            int r0 = com.amazon.aps.iva.t5.g0.a
            com.amazon.aps.iva.c6.a r1 = com.amazon.aps.iva.c6.a.c
            r2 = 23
            if (r0 < r2) goto Lf
            boolean r3 = com.amazon.aps.iva.c6.a.C0162a.b(r8)
            if (r3 == 0) goto Lf
            return r1
        Lf:
            com.google.common.collect.ImmutableSet$Builder r3 = new com.google.common.collect.ImmutableSet$Builder
            r3.<init>()
            r4 = 17
            r5 = 1
            r6 = 0
            if (r0 < r4) goto L2e
            java.lang.String r4 = com.amazon.aps.iva.t5.g0.c
            java.lang.String r7 = "Amazon"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L2c
            java.lang.String r7 = "Xiaomi"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L2e
        L2c:
            r4 = r5
            goto L2f
        L2e:
            r4 = r6
        L2f:
            if (r4 == 0) goto L42
            android.content.ContentResolver r4 = r8.getContentResolver()
            java.lang.String r7 = "external_surround_sound_enabled"
            int r4 = android.provider.Settings.Global.getInt(r4, r7, r6)
            if (r4 != r5) goto L42
            com.google.common.collect.ImmutableList<java.lang.Integer> r4 = com.amazon.aps.iva.c6.a.d
            r3.addAll(r4)
        L42:
            r4 = 29
            r7 = 10
            if (r0 < r4) goto L76
            boolean r4 = com.amazon.aps.iva.t5.g0.O(r8)
            if (r4 != 0) goto L61
            if (r0 < r2) goto L5e
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            java.lang.String r0 = "android.hardware.type.automotive"
            boolean r8 = r8.hasSystemFeature(r0)
            if (r8 == 0) goto L5e
            r8 = r5
            goto L5f
        L5e:
            r8 = r6
        L5f:
            if (r8 == 0) goto L76
        L61:
            com.google.common.collect.ImmutableList r8 = com.amazon.aps.iva.c6.a.b.a()
            r3.addAll(r8)
            com.amazon.aps.iva.c6.a r8 = new com.amazon.aps.iva.c6.a
            com.google.common.collect.ImmutableSet r9 = r3.build()
            int[] r9 = com.google.common.primitives.Ints.toArray(r9)
            r8.<init>(r9, r7)
            return r8
        L76:
            if (r9 == 0) goto La3
            java.lang.String r8 = "android.media.extra.AUDIO_PLUG_STATE"
            int r8 = r9.getIntExtra(r8, r6)
            if (r8 != r5) goto La3
            java.lang.String r8 = "android.media.extra.ENCODINGS"
            int[] r8 = r9.getIntArrayExtra(r8)
            if (r8 == 0) goto L8f
            java.util.List r8 = com.google.common.primitives.Ints.asList(r8)
            r3.addAll(r8)
        L8f:
            com.amazon.aps.iva.c6.a r8 = new com.amazon.aps.iva.c6.a
            com.google.common.collect.ImmutableSet r0 = r3.build()
            int[] r0 = com.google.common.primitives.Ints.toArray(r0)
            java.lang.String r1 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r9 = r9.getIntExtra(r1, r7)
            r8.<init>(r0, r9)
            return r8
        La3:
            com.google.common.collect.ImmutableSet r8 = r3.build()
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto Lb7
            com.amazon.aps.iva.c6.a r9 = new com.amazon.aps.iva.c6.a
            int[] r8 = com.google.common.primitives.Ints.toArray(r8)
            r9.<init>(r8, r7)
            return r9
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.a.b(android.content.Context, android.content.Intent):com.amazon.aps.iva.c6.a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r10 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        if (r10 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        r0 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b1, code lost:
        if (r10 != 5) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> c(com.amazon.aps.iva.q5.v r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.a.c(com.amazon.aps.iva.q5.v):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Arrays.equals(this.a, aVar.a) && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.a) + "]";
    }
}
