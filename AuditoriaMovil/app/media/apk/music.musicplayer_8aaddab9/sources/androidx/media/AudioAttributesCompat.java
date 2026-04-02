package androidx.media;

import android.util.SparseIntArray;
import c.b0.d;
/* loaded from: classes.dex */
public class AudioAttributesCompat implements d {
    public static final SparseIntArray a;

    /* renamed from: b  reason: collision with root package name */
    public AudioAttributesImpl f466b;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
            AudioAttributesImpl audioAttributesImpl = this.f466b;
            return audioAttributesImpl == null ? audioAttributesCompat.f466b == null : audioAttributesImpl.equals(audioAttributesCompat.f466b);
        }
        return false;
    }

    public int hashCode() {
        return this.f466b.hashCode();
    }

    public String toString() {
        return this.f466b.toString();
    }
}
