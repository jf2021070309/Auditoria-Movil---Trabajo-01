package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import c.b0.b;
import c.b0.d;
import java.util.Objects;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.a;
        if (bVar.i(1)) {
            dVar = bVar.o();
        }
        remoteActionCompat.a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f341b;
        if (bVar.i(2)) {
            charSequence = bVar.h();
        }
        remoteActionCompat.f341b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f342c;
        if (bVar.i(3)) {
            charSequence2 = bVar.h();
        }
        remoteActionCompat.f342c = charSequence2;
        remoteActionCompat.f343d = (PendingIntent) bVar.m(remoteActionCompat.f343d, 4);
        boolean z = remoteActionCompat.f344e;
        if (bVar.i(5)) {
            z = bVar.f();
        }
        remoteActionCompat.f344e = z;
        boolean z2 = remoteActionCompat.f345f;
        if (bVar.i(6)) {
            z2 = bVar.f();
        }
        remoteActionCompat.f345f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        Objects.requireNonNull(bVar);
        IconCompat iconCompat = remoteActionCompat.a;
        bVar.p(1);
        bVar.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f341b;
        bVar.p(2);
        bVar.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f342c;
        bVar.p(3);
        bVar.s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f343d;
        bVar.p(4);
        bVar.u(pendingIntent);
        boolean z = remoteActionCompat.f344e;
        bVar.p(5);
        bVar.q(z);
        boolean z2 = remoteActionCompat.f345f;
        bVar.p(6);
        bVar.q(z2);
    }
}
