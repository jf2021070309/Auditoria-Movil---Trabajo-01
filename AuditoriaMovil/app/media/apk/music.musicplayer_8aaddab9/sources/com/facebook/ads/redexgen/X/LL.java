package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: assets/audience_network.dex */
public final class LL {
    public static byte[] A00;
    public static String[] A01 = {"R2O7PMYP6nkOeNui3I4WlXx4fu7rpRKA", "y", "n9RLgUbY6qPVyxnn4C2MCNq6tOX6tKMu", "KtI8XvYnNiAs4lVQz", "VIjGruAAxxfbDEfj8", "jnPluIPOifq7BY1vqnqKLiUetY3DHsfM", "J5aiTqmsNT2689NKU", "zCaDldCe0EtEl2h3W"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C1046Xo> A06;
    public static final AtomicReference<LS> A07;
    public static final AtomicReference<LU> A08;

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-111, -92, -89, -79, -70, -62, -92, -89, -62, -78, -91, -83, -62, -84, -89, -62, -82, -88, -68, -68, -49, -46, -36, -27, -19, -35, -32, -41, -43, -41, -36, -49, -38, -19, -45, -26, -30, -32, -49, -31, 102, 121, 124, -122, -113, -105, -117, 121, -114, 125, 124, -105, -117, -116, 121, -116, 125, -105, 124, 121, -116, 121, -57, -43, -22, -39, -40, -108, -25, -24, -43, -24, -39, -108, -42, -23, -30, -40, -32, -39, -108, -35, -25, -108, -39, -31, -28, -24, -19, -107, -19, -6, -21, -17, -8, -11, -15, -6, 0, -21, 0, -5, -9, -15, -6};
    }

    static {
        A07();
        A02 = LL.class.getPackage();
        A04 = A02 + A06(40, 22, 38);
        A03 = A02 + A06(0, 19, 81);
        A05 = A02 + A06(19, 21, 124);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static Intent A00(Intent cloneIntent) {
        Intent cloneFilter = cloneIntent.cloneFilter();
        cloneFilter.setFlags(cloneIntent.getFlags());
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(cloneIntent.getExtras());
        cloneFilter.putExtra(A05, obtain.marshall());
        obtain.recycle();
        return cloneFilter;
    }

    public static Intent A01(Intent startIntent, ClassLoader classLoader) {
        Intent cloneFilter = startIntent.cloneFilter();
        cloneFilter.setFlags(startIntent.getFlags());
        Bundle bundle = new Bundle();
        Parcel obtain = Parcel.obtain();
        byte[] byteArrayExtra = startIntent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            bundle = obtain.readBundle(classLoader);
            obtain.recycle();
        }
        cloneFilter.putExtras(bundle);
        return cloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(classLoader);
            obtain.recycle();
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "08vXapB5qdF8q1e2g";
            strArr2[3] = "bPV7EQI3jYdBWJzP2";
            return readBundle;
        }
        throw new IllegalStateException(A06(62, 28, 98));
    }

    @Nullable
    public static C1046Xo A03(Intent intent) {
        String adId = intent.getStringExtra(A03);
        if (adId != null) {
            for (C1046Xo c1046Xo : A06) {
                if (adId.equals(c1046Xo.A0D().getId())) {
                    return c1046Xo;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(C1046Xo c1046Xo) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c1046Xo.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c1046Xo.A0D().getId());
        A06.add(c1046Xo);
        return adActivityIntent;
    }

    public static Class A05() {
        if (A01[1].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "4NnM5dRGBMW0KGxzs";
        strArr[3] = "N6FCbEqQMIqNBYuck";
        return AudienceNetworkActivity.class;
    }

    public static void A08(Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle2);
        bundle.putByteArray(A04, obtain.marshall());
        obtain.recycle();
    }

    public static void A09(C1046Xo c1046Xo, AdActivityIntent adActivityIntent) {
        c1046Xo.getApplicationContext().startActivity(A00(adActivityIntent));
    }

    public static boolean A0A(Intent intent, Set<String> set) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String prefix = data.toString();
        for (String url : set) {
            if (prefix.startsWith(url)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0B(C1046Xo c1046Xo, Intent intent) throws ActivityNotFoundException {
        return A0C(c1046Xo, intent, A07.get());
    }

    @VisibleForTesting
    public static boolean A0C(C1046Xo c1046Xo, Intent intent, @Nullable LS ls) throws ActivityNotFoundException {
        if (A0A(intent, JQ.A0W(c1046Xo))) {
            return false;
        }
        Activity activity = c1046Xo;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A01[1] = "W";
        Activity A0C = c1046Xo.A0C();
        if (A0C != null) {
            activity = A0C;
        } else {
            intent.addFlags(268435456);
        }
        if (ls == null || A0A(intent, JQ.A0Y(c1046Xo))) {
            activity.startActivity(intent);
            return true;
        }
        return ls.startActivity(activity, intent);
    }

    public static boolean A0D(C1046Xo c1046Xo, Uri uri, String str) throws ActivityNotFoundException {
        return A0E(c1046Xo, uri, str, A08.get());
    }

    @VisibleForTesting
    public static boolean A0E(C1046Xo c1046Xo, Uri uri, String str, @Nullable LU lu) throws ActivityNotFoundException {
        if (lu == null || c1046Xo.A0C() == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString(A06(90, 15, 122), str);
        return lu.handleUriForResult(c1046Xo, uri.toString(), bundle, null, 0, c1046Xo.A0C());
    }
}
