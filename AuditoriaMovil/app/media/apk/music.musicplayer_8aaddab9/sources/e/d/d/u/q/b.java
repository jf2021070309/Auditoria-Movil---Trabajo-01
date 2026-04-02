package e.d.d.u.q;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.slf4j.Marker;
/* loaded from: classes2.dex */
public class b {
    public static final String[] a = {Marker.ANY_MARKER, "FCM", CodePackage.GCM, ""};

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f7606b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7607c;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r0.isEmpty() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(e.d.d.g r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            android.content.Context r0 = r4.f7040d
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.f7606b = r0
            r4.a()
            e.d.d.i r0 = r4.f7042f
            java.lang.String r0 = r0.f7052e
            if (r0 == 0) goto L1b
            goto L49
        L1b:
            r4.a()
            e.d.d.i r4 = r4.f7042f
            java.lang.String r0 = r4.f7049b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            goto L49
        L33:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3f
            goto L48
        L3f:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L49
        L48:
            r0 = r2
        L49:
            r3.f7607c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.d.u.q.b.<init>(e.d.d.g):void");
    }

    public final String a() {
        PublicKey publicKey;
        synchronized (this.f7606b) {
            String str = null;
            String string = this.f7606b.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
                Log.w("ContentValues", "Invalid key stored " + e2);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + SyslogConstants.LOG_ALERT) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
