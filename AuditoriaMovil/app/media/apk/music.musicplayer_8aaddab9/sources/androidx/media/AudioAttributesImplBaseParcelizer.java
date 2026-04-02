package androidx.media;

import c.b0.b;
import java.util.Objects;
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = bVar.k(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.f468b = bVar.k(audioAttributesImplBase.f468b, 2);
        audioAttributesImplBase.f469c = bVar.k(audioAttributesImplBase.f469c, 3);
        audioAttributesImplBase.f470d = bVar.k(audioAttributesImplBase.f470d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        Objects.requireNonNull(bVar);
        int i2 = audioAttributesImplBase.a;
        bVar.p(1);
        bVar.t(i2);
        int i3 = audioAttributesImplBase.f468b;
        bVar.p(2);
        bVar.t(i3);
        int i4 = audioAttributesImplBase.f469c;
        bVar.p(3);
        bVar.t(i4);
        int i5 = audioAttributesImplBase.f470d;
        bVar.p(4);
        bVar.t(i5);
    }
}
