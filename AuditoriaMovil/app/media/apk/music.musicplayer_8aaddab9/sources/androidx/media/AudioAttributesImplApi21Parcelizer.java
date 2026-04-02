package androidx.media;

import android.media.AudioAttributes;
import c.b0.b;
import java.util.Objects;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) bVar.m(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.f467b = bVar.k(audioAttributesImplApi21.f467b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, b bVar) {
        Objects.requireNonNull(bVar);
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        bVar.p(1);
        bVar.u(audioAttributes);
        int i2 = audioAttributesImplApi21.f467b;
        bVar.p(2);
        bVar.t(i2);
    }
}
