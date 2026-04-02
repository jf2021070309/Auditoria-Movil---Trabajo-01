package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import com.amazon.aps.iva.c9.b;
import com.amazon.aps.iva.c9.d;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.a;
        if (bVar.h(1)) {
            dVar = bVar.n();
        }
        remoteActionCompat.a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.b;
        if (bVar.h(2)) {
            charSequence = bVar.g();
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (bVar.h(3)) {
            charSequence2 = bVar.g();
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) bVar.l(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        if (bVar.h(5)) {
            z = bVar.e();
        }
        remoteActionCompat.e = z;
        boolean z2 = remoteActionCompat.f;
        if (bVar.h(6)) {
            z2 = bVar.e();
        }
        remoteActionCompat.f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        bVar.o(1);
        bVar.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        bVar.o(2);
        bVar.r(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        bVar.o(3);
        bVar.r(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        bVar.o(4);
        bVar.u(pendingIntent);
        boolean z = remoteActionCompat.e;
        bVar.o(5);
        bVar.p(z);
        boolean z2 = remoteActionCompat.f;
        bVar.o(6);
        bVar.p(z2);
    }
}
