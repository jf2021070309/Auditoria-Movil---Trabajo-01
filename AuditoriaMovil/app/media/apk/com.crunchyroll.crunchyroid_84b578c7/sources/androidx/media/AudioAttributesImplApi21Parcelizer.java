package androidx.media;

import android.media.AudioAttributes;
import com.amazon.aps.iva.c9.b;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) bVar.l(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = bVar.j(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, b bVar) {
        bVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        bVar.o(1);
        bVar.u(audioAttributes);
        bVar.t(audioAttributesImplApi21.b, 2);
    }
}
