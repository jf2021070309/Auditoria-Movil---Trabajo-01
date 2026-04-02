package androidx.media;

import com.amazon.aps.iva.c9.b;
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = bVar.j(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = bVar.j(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = bVar.j(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = bVar.j(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.t(audioAttributesImplBase.a, 1);
        bVar.t(audioAttributesImplBase.b, 2);
        bVar.t(audioAttributesImplBase.c, 3);
        bVar.t(audioAttributesImplBase.d, 4);
    }
}
