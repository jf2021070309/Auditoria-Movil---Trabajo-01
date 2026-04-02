package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.util.FileSize;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class JQ {
    public static JQ A01;
    public static byte[] A02;
    public static String[] A03 = {"lby1W0wNbQrJZLPqMH4DTOw3yxUdqdf", "kgmV30Pytio8Y45c0SmevPSfJ", "GuqAlZnTPhAyqf6xpABukX78gW1eK", "0NViSQPmvGXLcgxETt4LuQqf8msO5qX", "Lug9XUXTwCkms8e17b8k", "9KOEFfUvG6glq1MfonBkT6Lvp1EWxJyS", "tUrZTe4M4NOwFWRIXhIm4QJOvCAxV", "2InOXM9Ds0dFubkAVSo31GYyY3vE8A8q"};
    public static final String[] A04;
    public static final String[] A05;
    public final SharedPreferences A00;

    public static String A0P(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "rwxiKY1yX8M1uCycGOqUPfCL86zZ3gS";
            strArr[0] = "P38LhqS18Cw18aUWRDVsuYtPAT7MPJu";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 46);
            i5++;
        }
    }

    public static void A0a() {
        A02 = new byte[]{108, 73, 107, 100, 105, 111, 102, 82, 126, Byte.MAX_VALUE, 101, 120, Byte.MAX_VALUE, 100, 116, 3, 47, 46, 52, 41, 46, 53, 37, Byte.MAX_VALUE, 106, 92, 70, 19, 68, 90, 95, 95, 19, 81, 86, 19, 71, 82, 88, 86, 93, 19, 71, 92, 19, 82, 93, 92, 71, 91, 86, 65, 19, 87, 86, 64, 71, 90, 93, 82, 71, 90, 92, 93, 29, 6, 17, 25, 8, 112, 109, 112, 109, 0, 45, 58, 50, 35, 91, 71, 91, 71, 70, 70, 70, 43, 123, 108, 100, 117, 125, 12, 10, 121, 123, 123, 113, 124, 125, 118, 108, 121, 116, 71, 123, 116, 113, 123, 115, 107, 71, 123, 119, 118, 126, 113, Byte.MAX_VALUE, 34, 32, 32, 42, 39, 38, 45, 55, 34, 47, 28, 32, 47, 42, 32, 40, 48, 28, 32, 44, 45, 37, 42, 36, 109, 55, 52, 44, 28, 48, 55, 38, 51, 28, 32, 34, 45, 32, 38, 47, 28, 33, 54, 55, 55, 44, 45, 28, 55, 38, 59, 55, 25, 27, 27, 17, 28, 29, 22, 12, 25, 20, 39, 27, 20, 17, 27, 19, 11, 39, 27, 23, 22, 30, 17, 31, 86, 12, 15, 23, 39, 11, 12, 29, 8, 39, 27, 23, 22, 30, 17, 10, 21, 39, 26, 13, 12, 12, 23, 22, 39, 12, 29, 0, 12, 3, 1, 1, 11, 6, 7, 12, 22, 3, 14, 61, 1, 14, 11, 1, 9, 17, 61, 1, 13, 12, 4, 11, 5, 76, 22, 21, 13, 61, 17, 22, 7, 18, 61, 1, 13, 12, 4, 11, 16, 15, 3, 22, 11, 13, 12, 68, 70, 70, 76, 65, 64, 75, 81, 68, 73, 122, 70, 73, 76, 70, 78, 86, 122, 70, 74, 75, 67, 76, 66, 11, 81, 82, 74, 122, 86, 81, 64, 85, 122, 70, 74, 75, 67, 76, 87, 72, 68, 81, 76, 74, 75, 122, 71, 74, 65, 92, 30, 28, 28, 22, 27, 26, 17, 11, 30, 19, 32, 28, 19, 22, 28, 20, 12, 32, 28, 16, 17, 25, 22, 24, 81, 11, 8, 16, 32, 12, 11, 26, 15, 32, 28, 16, 17, 25, 22, 13, 18, 30, 11, 22, 16, 17, 32, 11, 22, 11, 19, 26, 100, 97, 107, 114, 90, 100, 102, 102, 96, 117, 113, 100, 103, 105, 96, 90, 118, 113, 100, 102, 110, 113, 119, 100, 102, 96, 90, 102, 106, 107, 113, 96, 125, 113, 90, 99, 108, 105, 113, 96, 119, 90, 118, 108, Byte.MAX_VALUE, 96, 23, 18, 24, 1, 41, 23, 21, 21, 19, 6, 2, 23, 20, 26, 19, 41, 5, 2, 23, 21, 29, 2, 4, 23, 21, 19, 41, 26, 19, 24, 17, 2, 30, 63, 58, 48, 41, 1, 63, 50, 50, 49, 41, 1, 61, 49, 49, 53, 55, 59, 1, 51, 63, 48, 63, 57, 59, 44, 1, 55, 48, 55, 42, 55, 63, 50, 55, 36, 63, 42, 55, 49, 48, 1, 55, 48, 1, 60, 63, 45, 59, 1, 63, 58, 1, 61, 49, 48, 42, 44, 49, 50, 50, 59, 44, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 121, 116, 116, 119, 111, 71, 116, 119, 121, 124, 71, 124, 109, 106, 113, 118, Byte.MAX_VALUE, 71, 107, 112, 119, 111, 113, 118, Byte.MAX_VALUE, 31, 26, 16, 9, 33, 31, 16, 26, 12, 17, 23, 26, 33, 31, 16, 12, 33, 26, 27, 10, 27, 29, 10, 17, 12, 33, 27, 16, 31, 28, 18, 27, 46, 43, 33, 56, 16, 46, 33, 43, 61, 32, 38, 43, 16, 46, 33, 61, 16, 43, 42, 59, 42, 44, 59, 32, 61, 16, 59, 38, 34, 42, 32, 58, 59, 16, 34, 60, 62, 59, 49, 40, 0, 62, 49, 59, 45, 48, 54, 59, 0, 61, 51, 62, 60, 52, 51, 54, 44, 43, 58, 59, 0, 54, 49, 43, 58, 49, 43, 0, 42, 45, 51, 0, 47, 45, 58, 57, 54, 39, 58, 44, 112, 117, Byte.MAX_VALUE, 102, 78, 112, Byte.MAX_VALUE, 117, 99, 126, 120, 117, 78, 115, 125, 126, 114, 122, 78, 100, Byte.MAX_VALUE, 98, 112, 119, 116, 78, 97, 125, 112, 104, 112, 115, 125, 116, 78, 118, 112, 124, 116, 98, 78, 114, 112, 114, 121, 116, 33, 36, 46, 55, 31, 33, 46, 36, 50, 47, 41, 36, 31, 35, 33, 35, 40, 37, 31, 45, 47, 36, 53, 44, 37, 31, 45, 33, 56, 31, 51, 41, 58, 37, 5, 0, 10, 19, 59, 5, 10, 0, 22, 11, 13, 0, 59, 7, 5, 7, 12, 1, 59, 9, 11, 0, 17, 8, 1, 59, 22, 1, 16, 22, 29, 59, 8, 13, 9, 13, 16, 115, 118, 124, 101, 77, 115, 124, 118, 96, 125, 123, 118, 77, 113, 115, 96, 125, 103, 97, 119, 126, 77, 101, 122, 123, 102, 119, 77, 123, 124, 102, 119, 96, 97, 102, 123, 102, 123, 115, 126, 28, 25, 19, 10, 34, 28, 19, 25, 15, 18, 20, 25, 34, 30, 18, 16, 13, 15, 24, 14, 14, 34, 20, 16, 28, 26, 24, 14, 34, 25, 8, 15, 20, 19, 26, 34, 25, 18, 10, 19, 17, 18, 28, 25, 69, 64, 74, 83, 123, 69, 74, 64, 86, 75, 77, 64, 123, 64, 65, 66, 69, 81, 72, 80, 123, 69, 87, 87, 65, 80, 123, 84, 86, 65, 72, 75, 69, 64, 123, 87, 77, 94, 65, 123, 70, 93, 80, 65, 87, 97, 100, 110, 119, 95, 97, 110, 100, 114, 111, 105, 100, 95, 100, 105, 115, 97, 98, 108, 101, 95, 112, 108, 97, 121, 97, 98, 108, 101, 95, 112, 114, 101, 99, 97, 99, 104, 101, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 67, 72, 71, 68, 74, 67, 121, 72, 71, 82, 79, 80, 67, 121, 64, 83, 72, 72, 67, 74, 126, 123, 113, 104, 64, 126, 113, 123, 109, 112, 118, 123, 64, 122, 103, 112, 64, 111, 115, 126, 102, 
        122, 109, 64, 124, 126, 124, 119, 122, 64, 114, 126, 103, 64, 108, 118, 101, 122, 125, 120, 114, 107, 67, 125, 114, 120, 110, 115, 117, 120, 67, 122, 125, 117, 112, 67, 115, 114, 67, 107, 121, 126, 106, 117, 121, 107, 67, 121, 110, 110, 115, 110, 111, 55, 50, 56, 33, 9, 55, 56, 50, 36, 57, 63, 50, 9, 48, 57, 36, 53, 51, 9, 62, 55, 36, 50, 33, 55, 36, 51, 9, 55, 53, 53, 51, 58, 51, 36, 55, 34, 63, 57, 56, 80, 85, 95, 70, 110, 80, 95, 85, 67, 94, 88, 85, 110, 89, 88, 85, 84, 110, 71, 88, 85, 84, 94, 65, 67, 94, 86, 67, 84, 66, 66, 110, 80, 95, 88, 92, 80, 69, 88, 94, 95, 12, 9, 3, 26, 50, 12, 3, 9, 31, 2, 4, 9, 50, 4, 0, 12, 10, 8, 50, 14, 12, 14, 5, 8, 50, 30, 25, 2, 31, 8, 50, 15, 20, 25, 8, 50, 14, 2, 24, 3, 25, 120, 125, 119, 110, 70, 120, 119, 125, 107, 118, 112, 125, 70, 116, 124, 116, 118, 107, 96, 70, 118, 105, 109, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 102, 121, 104, 84, 98, 102, 123, 121, 110, 120, 120, 98, 100, 101, 84, 109, 100, 121, 84, 101, 106, Byte.MAX_VALUE, 98, 125, 110, 84, 125, 98, 111, 110, 100, 84, 106, 111, 120, 84, 125, 57, 10, 15, 5, 28, 52, 10, 5, 15, 25, 4, 2, 15, 52, 5, 10, 31, 2, 29, 14, 52, 8, 10, 25, 4, 30, 24, 14, 7, 52, 14, 19, 31, 14, 5, 24, 2, 4, 5, 52, 29, 10, 25, 2, 10, 5, 31, 21, 16, 26, 3, 43, 21, 26, 16, 6, 27, 29, 16, 43, 26, 21, 0, 29, 2, 17, 43, 26, 17, 3, 43, 23, 21, 6, 27, 1, 7, 17, 24, 43, 16, 17, 7, 29, 19, 26, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 101, 110, Byte.MAX_VALUE, 124, 100, 121, 96, 84, 111, 110, 109, 106, 126, 103, Byte.MAX_VALUE, 84, 104, 100, 101, 101, 110, 104, Byte.MAX_VALUE, 98, 100, 101, 84, Byte.MAX_VALUE, 98, 102, 110, 100, 126, Byte.MAX_VALUE, 84, 102, 120, 43, 46, 36, 61, 21, 43, 36, 46, 56, 37, 35, 46, 21, 36, 47, 62, 61, 37, 56, 33, 21, 46, 47, 44, 43, 63, 38, 62, 21, 56, 47, 43, 46, 21, 62, 35, 39, 47, 37, 63, 62, 21, 39, 57, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 72, 67, 82, 81, 73, 84, 77, 121, 66, 67, 64, 71, 83, 74, 82, 121, 84, 67, 82, 84, 79, 67, 85, 121, 72, 83, 75, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 118, 125, 108, 111, 119, 106, 115, 71, 124, 125, 126, 121, 109, 116, 108, 71, 108, 112, 106, 119, 108, 108, 116, 125, 71, 108, 113, 117, 125, 119, 109, 108, 71, 117, 107, 103, 98, 104, 113, 89, 103, 104, 98, 116, 105, 111, 98, 89, 104, 99, 114, 113, 105, 116, 109, 89, 98, 99, 96, 103, 115, 106, 114, 89, 114, 111, 107, 99, 105, 115, 114, 89, 107, 117, 124, 121, 115, 106, 66, 124, 115, 121, 111, 114, 116, 121, 66, 114, 105, 110, 113, 66, 120, 115, 124, Byte.MAX_VALUE, 113, 120, 121, 56, 61, 55, 46, 6, 56, 55, 61, 43, 54, 48, 61, 6, 43, 60, 41, 54, 43, 45, 6, 41, 43, 60, 42, 60, 55, 45, 56, 45, 48, 54, 55, 6, 60, 43, 43, 54, 43, 6, 46, 49, 60, 55, 6, 55, 54, 6, 48, 52, 41, 43, 60, 42, 42, 48, 54, 55, 86, 83, 89, 64, 104, 86, 89, 83, 69, 88, 94, 83, 104, 69, 82, 71, 88, 69, 67, 104, 71, 69, 82, 68, 82, 89, 67, 86, 67, 94, 88, 89, 104, 82, 69, 69, 88, 69, 68, 104, 94, 89, 68, 67, 82, 86, 83, 104, 88, 81, 104, 94, 89, 67, 82, 69, 89, 86, 91, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 73, 82, 85, 79, 86, 94, 101, 88, 86, 85, 89, 81, 101, 73, 67, 84, 89, 101, 85, 84, 101, 88, 91, 89, 81, 93, 72, 85, 79, 84, 94, 52, 49, 59, 34, 10, 52, 59, 49, 39, 58, 60, 49, 10, 38, 61, 58, 32, 57, 49, 10, 61, 60, 49, 48, 10, 57, 58, 52, 49, 48, 39, 14, 11, 1, 24, 48, 14, 1, 11, 29, 0, 6, 11, 48, 28, 7, 0, 26, 3, 11, 48, 6, 1, 6, 27, 48, 26, 1, 28, 4, 6, 31, 31, 14, 13, 3, 10, 48, 28, 10, 12, 0, 1, 11, 28, 48, 12, 0, 2, 31, 3, 10, 27, 10, 109, 104, 98, 123, 83, 109, 98, 104, 126, 99, 101, 104, 83, Byte.MAX_VALUE, 100, 99, 121, 96, 104, 83, 126, 105, Byte.MAX_VALUE, 105, 120, 83, 106, 99, 111, 121, Byte.MAX_VALUE, 83, 99, 98, 83, 98, 109, 120, 101, 122, 105, 83, 126, 105, 124, 99, 126, 120, 101, 98, 107, 58, 63, 53, 44, 4, 58, 53, 63, 41, 52, 50, 63, 4, 46, 57, 45, 41, 56, 35, 38, 44, 53, 29, 35, 44, 38, 48, 45, 43, 38, 29, 55, 49, 39, 29, 33, 35, 33, 42, 39, 29, 47, 45, 38, 55, 46, 39, 29, 36, 45, 48, 29, 43, 47, 35, 37, 39, 49, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 79, 73, 95, 101, 73, 78, 95, 91, 87, 83, 84, 93, 101, 83, 87, 91, 93, 95, 101, 94, 95, 89, 85, 94, 83, 84, 93, 45, 40, 34, 59, 19, 45, 34, 40, 62, 35, 37, 40, 19, 59, 36, 37, 56, 41, 32, 37, 63, 56, 41, 40, 19, 37, 34, 56, 
        41, 34, 56, 19, 57, 62, 32, 19, 60, 62, 41, 42, 37, 52, 41, 63, 7, 2, 8, 17, 57, 7, 21, 21, 3, 18, 57, 0, 3, 18, 5, 14, 15, 8, 1, 57, 19, 8, 15, 0, 15, 3, 2, 41, 44, 38, 63, 23, 42, 41, 38, 38, 45, 58, 23, 38, 39, 60, 33, 46, 49, 23, 41, 44, 23, 36, 39, 41, 44, 45, 44, 23, 39, 38, 23, 41, 59, 59, 45, 60, 59, 23, 36, 39, 41, 44, 45, 44, 114, 119, 125, 100, 76, 113, 118, 125, 112, 123, 126, 114, 97, 120, 76, 97, 118, 99, 124, 97, 103, 76, 122, 125, 103, 118, 97, 101, 114, Byte.MAX_VALUE, 76, 126, 96, 122, Byte.MAX_VALUE, 117, 108, 68, 121, 119, 116, 120, 112, 68, 119, 116, 120, 112, 104, 120, 105, 126, 126, 117, 21, 16, 26, 3, 43, 23, 6, 21, 7, 28, 43, 7, 28, 29, 17, 24, 16, 43, 17, 26, 21, 22, 24, 17, 16, 91, 94, 84, 77, 101, 89, 78, 91, 101, 91, 84, 83, 87, 91, 78, 83, 85, 84, 101, 94, 95, 86, 91, 67, 101, 87, 73, 51, 54, 60, 37, 13, 49, 38, 51, 13, 63, 59, 60, 13, 33, 49, 51, 62, 55, 13, 51, 60, 59, 63, 51, 38, 59, 61, 60, 13, 34, 55, 32, 49, 55, 60, 38, 51, 53, 55, 35, 38, 44, 53, 29, 38, 45, 29, 46, 39, 49, 49, 29, 49, 54, 48, 43, 33, 54, 29, 49, 39, 33, 45, 44, 38, 29, 33, 42, 35, 44, 44, 39, 46, 29, 43, 47, 50, 26, 31, 21, 12, 36, 30, 21, 26, 25, 23, 30, 36, 26, 14, 15, 20, 36, 31, 30, 8, 15, 9, 20, 2, 36, 23, 30, 26, 16, 8, 66, 71, 77, 84, 124, 70, 77, 66, 65, 79, 70, 124, 65, 74, 71, 71, 70, 81, 124, 87, 76, 72, 70, 77, 124, 74, 77, 69, 76, 52, 49, 59, 34, 10, 48, 59, 52, 55, 57, 48, 10, 49, 48, 55, 32, 50, 10, 58, 35, 48, 39, 57, 52, 44, 37, 32, 42, 51, 27, 33, 42, 37, 38, 40, 33, 27, 33, 60, 43, 52, 40, 37, 61, 33, 54, 27, 39, 37, 39, 44, 33, 89, 92, 86, 79, 103, 93, 86, 89, 90, 84, 93, 103, 93, 64, 87, 72, 84, 89, 65, 93, 74, 103, 91, 89, 91, 80, 93, 103, 94, 87, 74, 103, 92, 75, 84, 87, 82, 88, 65, 105, 83, 88, 87, 84, 90, 83, 105, 83, 78, 89, 70, 90, 87, 79, 83, 68, 105, 64, 4, 58, 63, 53, 44, 4, 62, 53, 58, 57, 55, 62, 4, 61, 46, 53, 53, 62, 55, 47, 42, 32, 57, 17, 43, 32, 47, 44, 34, 43, 17, 39, 32, 34, 39, 32, 43, 17, 54, 17, 33, 59, 58, 17, 32, 33, 32, 17, 40, 59, 34, 34, 61, 45, 60, 43, 43, 32, 17, 33, 32, 17, 61, 42, 37, 10, 15, 5, 28, 52, 14, 5, 10, 9, 7, 14, 52, 5, 14, 31, 28, 4, 25, 0, 65, 68, 78, 87, Byte.MAX_VALUE, 69, 78, 65, 66, 76, 69, Byte.MAX_VALUE, 80, 82, 69, 76, 79, 65, 68, 94, 91, 81, 72, 96, 90, 81, 94, 93, 83, 90, 96, 77, 94, 88, 90, 96, 76, 87, 94, 84, 90, 24, 29, 23, 14, 38, 28, 23, 24, 27, 21, 28, 38, 10, 0, 23, 26, 13, 8, 2, 27, 51, 9, 20, 28, 3, 31, 9, 51, 26, 5, 8, 9, 3, 51, 27, 13, 24, 15, 4, 51, 24, 5, 1, 9, 77, 72, 66, 91, 115, 74, 69, 64, 88, 73, 94, 115, 78, 69, 72, 72, 69, 66, 75, 115, 88, 67, 71, 73, 66, 27, 30, 20, 13, 37, 28, 21, 8, 25, 31, 37, 30, 31, 12, 19, 25, 31, 37, 9, 25, 8, 31, 31, 20, 37, 27, 22, 13, 27, 3, 9, 37, 21, 20, 100, 97, 107, 114, 90, 108, 104, 117, 118, 90, 118, 96, 102, 106, 107, 97, 90, 102, 109, 100, 107, 107, 96, 105, 90, 96, 107, 100, 103, 105, 96, 97, 79, 74, 64, 89, 113, 71, 64, 90, 75, 92, 93, 90, 71, 90, 71, 79, 66, 113, 64, 75, 89, 113, 71, 67, 79, 73, 75, 113, 74, 75, 93, 71, 73, 64, 96, 101, 111, 118, 94, 109, 110, 102, 94, 98, 114, 94, 98, 108, 113, 15, 10, 0, 25, 49, 2, 1, 9, 9, 7, 0, 9, 49, 11, 0, 10, 30, 1, 7, 0, 26, 49, 30, 28, 11, 8, 7, 22, 20, 17, 27, 2, 42, 27, 20, 1, 28, 3, 16, 42, 22, 20, 7, 26, 0, 6, 16, 25, 42, 22, 26, 24, 5, 20, 22, 1, 42, 1, 29, 7, 16, 6, 29, 26, 25, 17, 117, 112, 122, 99, 75, 122, 117, 96, 125, 98, 113, 75, 98, 125, 113, 99, 75, 103, 122, 117, 100, 103, 124, 123, 96, 75, 120, 123, 115, 115, 125, 122, 115, 75, 113, 122, 117, 118, 120, 113, 112, 121, 124, 118, 111, 71, 119, 118, 124, 125, 110, 113, 123, 125, 71, 112, 113, 107, 108, 119, 106, 97, 71, 124, 121, 108, 121, 71, 125, 118, 121, 122, 116, 125, 124, 123, 126, 116, 109, 69, 117, 106, Byte.MAX_VALUE, 116, 69, 124, 120, 69, 123, 106, 106, 69, 123, 118, 109, 123, 99, 105, 43, 46, 36, 61, 21, 58, 38, 43, 51, 43, 40, 38, 47, 21, 41, 38, 35, 41, 33, 21, 39, 43, 50, 21, 46, 47, 38, 43, 51, 21, 39, 57, 56, 61, 55, 46, 6, 41, 53, 56, 32, 56, 59, 53, 60, 6, 61, 48, 42, 56, 59, 53, 60, 6, 43, 60, 52, 54, 45, 60, 6, 54, 55, 6, 55, 60, 45, 46, 54, 43, 50, 6, 53, 54, 42, 42, 109, 104, 98, 123, 83, 124, 96, 109, 117, 109, 110, 
        96, 105, Byte.MAX_VALUE, 83, 96, 99, 107, 107, 101, 98, 107, 83, 105, 98, 109, 110, 96, 105, 104, 10, 15, 5, 28, 52, 27, 7, 10, 18, 10, 9, 7, 14, 24, 52, 5, 14, 28, 52, 15, 14, 24, 2, 12, 5, 100, 97, 107, 114, 90, 117, 105, 100, 124, 100, 103, 105, 96, 118, 90, 118, 109, 106, 114, 90, 96, 107, 97, 102, 100, 119, 97, 0, 5, 15, 22, 62, 17, 19, 4, 13, 14, 0, 5, 62, 8, 15, 21, 4, 19, 18, 21, 8, 21, 8, 0, 13, 62, 5, 24, 15, 0, 12, 8, 2, 62, 22, 4, 3, 23, 8, 4, 22, 23, 18, 24, 1, 41, 6, 4, 19, 26, 25, 23, 18, 41, 24, 23, 2, 31, 0, 19, 41, 18, 15, 24, 23, 27, 31, 21, 41, 1, 19, 20, 0, 31, 19, 1, 52, 49, 59, 34, 10, 37, 39, 48, 57, 58, 52, 49, 10, 39, 35, 10, 49, 44, 59, 52, 56, 60, 54, 10, 34, 48, 55, 35, 60, 48, 34, 81, 84, 94, 71, 111, 64, 66, 85, 70, 85, 94, 68, 111, 64, 92, 81, 73, 81, 82, 92, 85, 111, 81, 69, 68, 95, 111, 83, 92, 89, 83, 91, 115, 118, 124, 101, 77, 98, 103, 96, 117, 119, 77, 125, 124, 77, 38, 35, 33, 77, 96, 119, 97, 98, 125, 124, 97, 119, 61, 56, 50, 43, 3, 46, 57, 63, 51, 49, 44, 41, 40, 57, 3, 62, 40, 3, 61, 58, 40, 57, 46, 3, 57, 36, 40, 46, 61, 47, 3, 63, 52, 61, 50, 59, 57, 71, 66, 72, 81, 121, 84, 80, 121, 68, 83, 64, 64, 67, 84, 121, 69, 78, 67, 69, 77, 121, 67, 72, 71, 68, 74, 67, 66, 99, 102, 108, 117, 93, 112, 116, 93, 114, 110, 99, 123, 96, 99, 97, 105, 93, 97, 112, 99, 113, 106, 93, 100, 99, 110, 110, 96, 99, 97, 105, 58, 63, 53, 44, 4, 40, 62, 53, 63, 4, 41, 47, 61, 4, 43, 58, 41, 58, 54, 40, 121, 124, 118, 111, 71, 107, 125, 118, 124, 113, 118, Byte.MAX_VALUE, 71, 126, 106, 125, 105, 109, 125, 118, 123, 97, 71, 123, 121, 104, 104, 113, 118, Byte.MAX_VALUE, 71, 121, 116, 116, 119, 111, 125, 124, 34, 39, 45, 52, 28, 48, 38, 55, 28, 55, 38, 59, 55, 28, 32, 44, 47, 44, 49, 28, 39, 58, 45, 34, 46, 42, 32, 34, 47, 47, 58, 25, 28, 22, 15, 39, 11, 16, 23, 13, 20, 28, 39, 25, 28, 28, 39, 29, 0, 12, 29, 22, 11, 17, 23, 22, 39, 12, 23, 39, 8, 20, 25, 1, 25, 26, 20, 29, 11, 94, 91, 81, 72, 96, 76, 87, 80, 74, 83, 91, 96, 92, 83, 90, 94, 77, 96, 89, 90, 94, 75, 74, 77, 90, 96, 92, 80, 81, 89, 86, 88, 96, 80, 81, 96, 92, 77, 94, 76, 87, 90, 76, 44, 41, 35, 58, 18, 62, 37, 34, 56, 33, 41, 18, 36, 42, 35, 34, 63, 40, 18, 41, 40, 62, 57, 63, 34, 52, 18, 46, 44, 33, 33, 32, 37, 47, 54, 30, 50, 41, 46, 52, 45, 37, 30, 40, 47, 34, 51, 36, 44, 36, 47, 53, 30, 51, 36, 53, 51, 56, 30, 34, 46, 52, 47, 53, 36, 51, 30, 46, 47, 30, 36, 44, 49, 53, 56, 30, 51, 36, 50, 49, 46, 47, 50, 36, 125, 120, 114, 107, 67, 111, 116, 115, 105, 112, 120, 67, 117, 114, 117, 104, 67, 122, 110, 115, 113, 67, Byte.MAX_VALUE, 115, 114, 104, 121, 114, 104, 67, 108, 110, 115, 106, 117, 120, 121, 110, 68, 65, 75, 82, 122, 86, 77, 74, 80, 73, 65, 122, 76, 75, 76, 81, 122, 74, 75, 122, 70, 73, 68, 86, 86, 122, 73, 74, 68, 65, 76, 75, 66, 34, 39, 45, 52, 28, 48, 43, 44, 54, 47, 39, 28, 47, 44, 36, 28, 34, 48, 48, 38, 55, 28, 54, 49, 47, 10, 15, 5, 28, 52, 24, 3, 4, 30, 7, 15, 52, 27, 25, 14, 8, 4, 6, 27, 30, 31, 14, 52, 9, 2, 15, 15, 14, 25, 52, 31, 4, 0, 14, 5, 46, 43, 33, 56, 16, 60, 36, 38, 63, 16, 57, 38, 43, 42, 32, 16, 33, 32, 33, 16, 39, 46, 61, 43, 56, 46, 61, 42, 16, 46, 44, 44, 42, 35, 42, 61, 46, 59, 42, 43, 1, 4, 14, 23, 63, 19, 20, 1, 3, 11, 20, 18, 1, 3, 5, 63, 7, 18, 15, 21, 16, 9, 14, 7, 63, 5, 14, 1, 2, 12, 5, 4, 52, 49, 59, 34, 10, 38, 44, 59, 54, 10, 52, 51, 33, 48, 39, 10, 52, 49, 10, 57, 58, 52, 49, 76, 73, 67, 90, 114, 94, 84, 67, 78, 114, 72, 67, 73, 93, 66, 68, 67, 89, 114, 93, 95, 72, 75, 68, 85, 12, 9, 3, 26, 50, 25, 4, 0, 8, 50, 25, 2, 50, 26, 12, 4, 25, 50, 11, 2, 31, 50, 27, 4, 9, 8, 2, 50, 29, 1, 12, 20, 50, 0, 30, 79, 74, 64, 89, 113, 90, 71, 67, 75, 113, 90, 65, 113, 89, 79, 71, 90, 113, 72, 65, 92, 113, 88, 71, 74, 75, 65, 113, 94, 92, 75, 94, 79, 92, 75, 74, 113, 67, 93, 55, 50, 56, 33, 9, 34, 63, 59, 51, 57, 35, 34, 9, 36, 51, 33, 55, 36, 50, 51, 50, 9, 32, 63, 50, 51, 57, 126, 123, 113, 104, 64, 107, 109, 118, 120, 120, 122, 109, 64, 113, 126, 107, 118, 105, 122, 64, 109, 122, 120, 118, 108, 107, 122, 109, 64, 105, 118, 122, 104, 64, 122, 109, 109, 112, 109, 64, 124, 126, 115, 115, 125, 126, 124, 116, 3, 6, 12, 21, 61, 23, 12, 11, 19, 23, 7, 61, 6, 0, 
        61, 12, 3, 15, 7, 61, 18, 7, 16, 61, 18, 16, 13, 1, 7, 17, 17, 121, 124, 118, 111, 71, 109, 107, 125, 71, 121, 104, 104, 71, 124, 113, Byte.MAX_VALUE, 125, 107, 108, 71, 121, 104, 113, 33, 36, 46, 55, 31, 53, 51, 37, 31, 35, 33, 35, 40, 37, 36, 31, 37, 56, 37, 35, 53, 52, 47, 50, 31, 38, 47, 50, 31, 46, 37, 52, 55, 47, 50, 43, 104, 109, 103, 126, 86, 124, 122, 108, 86, 106, 104, 106, 97, 108, 109, 86, 108, 113, 108, 106, 124, 125, 102, 123, 86, 96, 103, 86, 106, 104, 106, 97, 108, 86, 100, 104, 103, 104, 110, 108, 123, 7, 2, 8, 17, 57, 19, 21, 3, 57, 20, 15, 22, 22, 10, 3, 57, 7, 8, 15, 11, 7, 18, 15, 9, 8, 98, 103, 109, 116, 92, 117, 106, 102, 116, 98, 97, 106, 111, 106, 119, 122, 92, 96, 107, 102, 96, 104, 92, 98, 113, 102, 98, 92, 97, 98, 112, 102, 103, 123, 111, 110, 117, 104, 117, 110, 123, 110, Byte.MAX_VALUE, 69, 126, 115, 105, 123, 120, 118, Byte.MAX_VALUE, 126, 35, 55, 54, 45, 48, 45, 54, 35, 54, 39, 29, 39, 44, 35, 32, 46, 39, 38, 98, 109, 104, 98, 106, 102, 116, 96, 115, 101, 94, 117, 104, 108, 100, 94, 108, 114, 104, 100, 102, 37, 109, 106, 104, 110, 105, 100, 100, 96, 37, 106, 111, 120, 37, 77, 78, 74, 95, 94, 89, 78, 84, 72, 68, 69, 77, 66, 76, 73, 77, 74, 77, 73, 81, 73, 123, 65, 72, 69, 84, 87, 65, 64, 123, 80, 77, 73, 65, 123, 69, 66, 80, 65, 86, 123, 77, 73, 84, 86, 65, 87, 87, 77, 75, 74, 92, 71, 94, 94, 96, 119, 97, 102, 96, 123, 113, 102, 119, 118, 77, 118, 115, 102, 115, 77, 98, 96, 125, 113, 119, 97, 97, 123, 124, 117, 77, 113, 125, Byte.MAX_VALUE, 112, 123, 124, 115, 102, 123, 125, 124, 97, 111, 104, 125, Byte.MAX_VALUE, 119, 67, 104, 110, 125, Byte.MAX_VALUE, 121, 67, 111, 125, 113, 108, 112, 121, 67, 110, 125, 104, 121, 33, 62, 51, 50, 56, 8, 54, 57, 51, 8, 50, 57, 51, 52, 54, 37, 51, 8, 54, 34, 35, 56, 37, 56, 35, 54, 35, 50, 94, 94, 94};
    }

    static {
        A0a();
        A04 = new String[0];
        A05 = new String[]{A0P(86, 5, 14), A0P(65, 9, 115), A0P(74, 12, 88)};
    }

    public JQ(Context context) {
        this.A00 = context.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A0P(4230, 31, 37), context), 0);
    }

    public static float A00(Context context) {
        return A0O(context).A23(A0P(2194, 39, 124), 0.98f);
    }

    public static int A01(Context context) {
        return A0O(context).A24(A0P(417, 33, 88), 100);
    }

    public static int A02(Context context) {
        return A0O(context).A24(A0P(2088, 33, 61), 0);
    }

    public static int A03(Context context) {
        return A0O(context).A24(A0P(2167, 27, 20), -1);
    }

    public static int A04(Context context) {
        return A0O(context).A24(A0P(742, 37, 74), 3);
    }

    public static int A05(Context context) {
        return A0O(context).A24(A0P(4212, 18, 47), 0);
    }

    public static int A06(Context context) {
        return A0O(context).A24(A0P(582, 36, 97), AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }

    public static int A07(Context context) {
        return A0O(context).A24(A0P(1333, 50, 37), 30000);
    }

    public static int A08(Context context) {
        return A0O(context).A24(A0P(1427, 40, 8), 3);
    }

    public static int A09(Context context) {
        return A0O(context).A24(A0P(1383, 44, 100), 8000);
    }

    public static int A0A(Context context) {
        return A0O(context).A24(A0P(1467, 48, 54), 100);
    }

    public static int A0B(Context context) {
        return A0O(context).A24(A0P(1515, 39, 40), 60000);
    }

    public static int A0C(Context context) {
        return A0O(context).A24(A0P(2777, 38, 91), 225);
    }

    public static int A0D(Context context) {
        return A0O(context).A24(A0P(1133, 41, 67), 3145728);
    }

    public static int A0E(Context context) {
        return A0O(context).A24(A0P(4261, 37, 10), -1);
    }

    public static int A0F(Context context) {
        return A0O(context).A24(A0P(2913, 32, 100), 2000);
    }

    public static int A0G(Context context) {
        return A0O(context).A24(A0P(371, 46, 43), -1);
    }

    public static int A0H(Context context) {
        return A0O(context).A24(A0P(4341, 23, 50), 0);
    }

    public static int A0I(Context context) {
        return A0O(context).A24(A0P(3837, 35, 67), AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }

    public static int A0J(Context context) {
        return A0O(context).A24(A0P(3872, 39, 0), AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }

    public static int A0K(Context context) {
        return A0O(context).A24(A0P(1248, 46, 69), 0);
    }

    public static long A0L(Context context) {
        return A0O(context).A25(A0P(708, 34, 110), 67108864L);
    }

    public static long A0M(Context context) {
        return A0O(context).A25(A0P(863, 45, 10), FileSize.MB_COEFFICIENT);
    }

    public static long A0N(Context context) {
        return A0O(context).A25(A0P(979, 38, 49), 16777216L);
    }

    public static synchronized JQ A0O(Context context) {
        JQ jq;
        synchronized (JQ.class) {
            if (A01 == null) {
                A01 = new JQ(context);
            }
            jq = A01;
        }
        return jq;
    }

    public static String A0Q(Context context) {
        return A0O(context).A26(A0P(2749, 28, 64), A0P(4392, 3, 7));
    }

    public static String A0R(Context context) {
        return A0O(context).A26(A0P(3812, 25, 3), A0P(4392, 3, 7));
    }

    public static String A0S(Context context) {
        return A0O(context).A26(A0P(117, 52, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD), A0P(1, 6, 36));
    }

    public static String A0T(Context context) {
        return A0O(context).A26(A0P(268, 51, 11), A0P(24, 41, 29));
    }

    public static String A0U(Context context) {
        return A0O(context).A26(A0P(169, 53, 86), A0P(7, 8, 63));
    }

    public static String A0V(Context context) {
        return A0O(context).A26(A0P(319, 52, 81), A0P(15, 9, 110));
    }

    public static Set<String> A0W(Context context) {
        return A0O(context).A0Z(A0P(618, 44, 113), A04);
    }

    public static Set<String> A0X(Context context) {
        return A0O(context).A0Z(A0P(4302, 39, 60), A05);
    }

    public static Set<String> A0Y(Context context) {
        return A0O(context).A0Z(A0P(1972, 44, 98), A04);
    }

    private Set<String> A0Z(String str, String[] strArr) {
        JSONArray jSONArray;
        String A26 = A26(str, null);
        try {
            if (A26 != null) {
                jSONArray = new JSONArray(A26);
            } else {
                jSONArray = new JSONArray((Collection) Arrays.asList(strArr));
            }
            int length = jSONArray.length();
            LinkedHashSet linkedHashSet = new LinkedHashSet(length);
            for (int i2 = 0; i2 < length; i2++) {
                linkedHashSet.add(jSONArray.getString(i2));
            }
            return linkedHashSet;
        } catch (JSONException unused) {
            return new LinkedHashSet();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void A0b(Context context) {
        A0O(context).A00.edit().clear().commit();
    }

    private void A0c(@Nullable String str, @Nullable String str2) throws JSONException {
        if (str == null || str.isEmpty() || str.equals(A0P(91, 2, 121))) {
            return;
        }
        A0d(new JSONObject(str), str2);
    }

    private void A0d(JSONObject jSONObject, @Nullable String key) throws JSONException {
        SharedPreferences.Editor edit = this.A00.edit();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.equals(A0P(93, 24, 54))) {
                A0c(jSONObject.getString(next), next);
            } else {
                String str = next;
                if (key != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(key);
                    String sharedPrefKey = A0P(0, 1, 108);
                    sb.append(sharedPrefKey);
                    sb.append(str);
                    str = sb.toString();
                }
                String sharedPrefKey2 = jSONObject.getString(next);
                edit.putString(str, sharedPrefKey2);
            }
        }
        edit.apply();
    }

    public static boolean A0e(Context context) {
        return A0O(context).A26(A0P(4364, 28, 121), A0P(4175, 19, 52)).equals(A0P(4194, 18, 108));
    }

    public static boolean A0f(Context context) {
        return A0O(context).A29(A0P(AdRequest.MAX_CONTENT_URL_LENGTH, 38, 54), false);
    }

    public static boolean A0g(Context context) {
        return A0O(context).A29(A0P(3236, 37, 114), false);
    }

    public static boolean A0h(Context context) {
        return A0O(context).A29(A0P(2301, 29, 13), true);
    }

    public static boolean A0i(Context context) {
        return A0O(context).A29(A0P(3044, 27, 43), false);
    }

    public static boolean A0j(Context context) {
        return A0O(context).A29(A0P(819, 44, 83), true);
    }

    public static boolean A0k(Context context) {
        return A0O(context).A29(A0P(2142, 25, 90), true);
    }

    public static boolean A0l(Context context) {
        return A0O(context).A29(A0P(2945, 44, 119), true);
    }

    public static boolean A0m(Context context) {
        return A0O(context).A29(A0P(450, 62, SyslogConstants.LOG_ALERT), false);
    }

    public static boolean A0n(Context context) {
        return A0O(context).A29(A0P(2271, 30, 85), false);
    }

    public static boolean A0o(Context context) {
        return A0O(context).A29(A0P(946, 33, 8), true);
    }

    public static boolean A0p(Context context) {
        return A0O(context).A29(A0P(2581, 28, 66), false);
    }

    public static boolean A0q(Context context) {
        return A0O(context).A29(A0P(1017, 35, 50), false);
    }

    public static boolean A0r(Context context) {
        return A0O(context).A29(A0P(2441, 18, 117), false);
    }

    public static boolean A0s(Context context) {
        return A0O(context).A29(A0P(550, 32, 80), false);
    }

    public static boolean A0t(Context context) {
        return A0O(context).A29(A0P(2609, 25, 2), false);
    }

    public static boolean A0u(Context context) {
        if (Build.VERSION.SDK_INT >= 18) {
            JQ A0O = A0O(context);
            String A0P = A0P(2330, 25, 123);
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "eVi9wsoxiKuO8fS3Ni664QsxmOwf4Hz";
            strArr[0] = "nOcXZ0DMfofG3U9htYbEeRQSfAelmGW";
            return A0O.A29(A0P, false);
        }
        return false;
    }

    public static boolean A0v(Context context) {
        return A0O(context).A29(A0P(2856, 34, 54), false);
    }

    public static boolean A0w(Context context) {
        return A0O(context).A29(A0P(1174, 23, 55), false);
    }

    public static boolean A0x(Context context) {
        return A0O(context).A29(A0P(2815, 41, 58), false);
    }

    public static boolean A0y(Context context) {
        return A0O(context).A29(A0P(2543, 22, 17), false);
    }

    public static boolean A0z(Context context) {
        return A0O(context).A29(A0P(3273, 28, 8), true);
    }

    public static boolean A10(Context context) {
        return A0O(context).A29(A0P(3301, 31, 44), true);
    }

    public static boolean A11(Context context) {
        return A0O(context).A29(A0P(3757, 32, 78), false);
    }

    public static boolean A12(Context context) {
        return A0O(context).A29(A0P(222, 46, 76), false);
    }

    public static boolean A13(Context context) {
        return A0O(context).A29(A0P(2734, 15, 47), false);
    }

    public static boolean A14(Context context) {
        return A0O(context).A29(A0P(2233, 38, 108), false);
    }

    public static boolean A15(Context context) {
        return A0O(context).A29(A0P(2505, 19, 69), true);
    }

    public static boolean A16(Context context) {
        return A0O(context).A29(A0P(2043, 45, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH), false);
    }

    public static boolean A17(Context context) {
        return A0O(context).A29(A0P(1554, 25, 51), true);
    }

    public static boolean A18(Context context) {
        return A0O(context).A29(A0P(3071, 41, 79), true);
    }

    public static boolean A19(Context context) {
        return A0O(context).A29(A0P(2524, 19, 14), true);
    }

    public static boolean A1A(Context context) {
        return A0O(context).A29(A0P(3112, 35, 88), true);
    }

    public static boolean A1B(Context context) {
        return A0O(context).A29(A0P(3147, 31, 123), true);
    }

    public static boolean A1C(Context context) {
        return A0O(context).A29(A0P(3178, 32, 30), true);
    }

    public static boolean A1D(Context context) {
        return A0O(context).A29(A0P(1579, 57, 119), false);
    }

    public static boolean A1E(Context context) {
        return A0O(context).A29(A0P(1636, 59, 25), true);
    }

    public static boolean A1F(Context context) {
        return A0O(context).A29(A0P(2668, 32, 43), false);
    }

    public static boolean A1G(Context context) {
        return A0O(context).A29(A0P(3352, 38, 54), true);
    }

    public static boolean A1H(Context context) {
        return A0O(context).A29(A0P(3421, 38, 86), true);
    }

    public static boolean A1I(Context context) {
        return A0O(context).A29(A0P(2890, 23, 52), true);
    }

    public static boolean A1J(Context context) {
        return A0O(context).A29(A0P(2121, 21, 53), false);
    }

    public static boolean A1K(Context context) {
        return A0O(context).A29(A0P(1695, 44, 20), true);
    }

    public static boolean A1L(Context context) {
        return Build.VERSION.SDK_INT >= 16 && A0O(context).A29(A0P(662, 46, 63), false);
    }

    public static boolean A1M(Context context) {
        return A0O(context).A29(A0P(3459, 43, 17), true);
    }

    public static boolean A1N(Context context) {
        return A0O(context).A29(A0P(908, 38, 46), false);
    }

    public static boolean A1O(Context context) {
        return A0O(context).A29(A0P(2989, 30, 34), true);
    }

    public static boolean A1P(Context context) {
        return A0O(context).A29(A0P(2016, 27, 72), false);
    }

    public static boolean A1Q(Context context) {
        return A0O(context).A29(A0P(1197, 51, 37), false);
    }

    public static boolean A1R(Context context) {
        return A0O(context).A29(A0P(1052, 40, SyslogConstants.LOG_CLOCK), true);
    }

    public static boolean A1S(Context context) {
        return A0O(context).A29(A0P(1739, 31, 123), false);
    }

    public static boolean A1T(Context context) {
        return A0O(context).A29(A0P(1092, 41, 31), false);
    }

    public static boolean A1U(Context context) {
        return A0O(context).A29(A0P(3502, 31, 99), false);
    }

    public static boolean A1V(Context context) {
        return A0O(context).A29(A0P(3533, 53, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), false);
    }

    public static boolean A1W(Context context) {
        return A0O(context).A29(A0P(3586, 38, 50), true);
    }

    public static boolean A1X(Context context) {
        return A0O(context).A29(A0P(3624, 33, 11), false);
    }

    public static boolean A1Y(Context context) {
        return A0O(context).A29(A0P(1770, 53, 65), false);
    }

    public static boolean A1Z(Context context) {
        return A0O(context).A29(A0P(2634, 34, 84), false);
    }

    public static boolean A1a(Context context) {
        return A0O(context).A29(A0P(3657, 25, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD), false);
    }

    public static boolean A1b(Context context) {
        return A0O(context).A29(A0P(3682, 35, 69), false);
    }

    public static boolean A1c(Context context) {
        return A0O(context).A29(A0P(3210, 26, 60), false);
    }

    public static boolean A1d(Context context) {
        return A0O(context).A29(A0P(1823, 51, 34), true);
    }

    public static boolean A1e(Context context) {
        return A0O(context).A29(A0P(3332, 20, 117), false);
    }

    public static boolean A1f(Context context) {
        return A0O(context).A29(A0P(3390, 31, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD), false);
    }

    public static boolean A1g(Context context) {
        return A0O(context).A29(A0P(3789, 23, 123), true);
    }

    public static boolean A1h(Context context) {
        return A0O(context).A29(A0P(3911, 27, SyslogConstants.LOG_CLOCK), false);
    }

    public static boolean A1i(Context context) {
        return A0O(context).A29(A0P(4142, 33, 45), false);
    }

    public static boolean A1j(Context context) {
        return A0O(context).A29(A0P(2459, 46, 96), true);
    }

    public static boolean A1k(Context context) {
        return A0O(context).A29(A0P(2700, 34, 0), false);
    }

    public static boolean A1l(Context context) {
        return A0O(context).A29(A0P(4117, 25, 72), false);
    }

    public static boolean A1m(Context context) {
        return A0O(context).A29(A0P(3986, 31, 76), false);
    }

    public static boolean A1n(Context context) {
        return A0O(context).A29(A0P(3717, 40, 97), true);
    }

    public static boolean A1o(Context context) {
        return A0O(context).A29(A0P(2565, 16, 87), true);
    }

    public static boolean A1p(Context context) {
        return A0O(context).A29(A0P(3938, 48, 49), false);
    }

    public static boolean A1q(Context context) {
        return A0O(context).A29(A0P(4017, 23, 54), true);
    }

    public static boolean A1r(Context context) {
        return A0O(context).A29(A0P(1874, 18, 117), false);
    }

    public static boolean A1s(Context context) {
        return A0O(context).A29(A0P(1892, 40, 108), false);
    }

    public static boolean A1t(Context context) {
        return A0O(context).A29(A0P(4040, 36, 110), false);
    }

    public static boolean A1u(Context context) {
        return A0O(context).A29(A0P(4076, 41, 39), true);
    }

    public static boolean A1v(Context context) {
        return A0O(context).A29(A0P(779, 40, 60), false);
    }

    public static boolean A1w(Context context) {
        return A0O(context).A29(A0P(1294, 39, 90), false);
    }

    public static boolean A1x(Context context) {
        return A0O(context).A29(A0P(3019, 25, 69), false);
    }

    public static boolean A1y(Context context) {
        return A0O(context).A29(A0P(1932, 40, 20), true);
    }

    public static boolean A1z(Context context, boolean z) {
        return A21(context, z) && A0O(context).A29(A0P(2355, 27, 106), false);
    }

    public static boolean A20(Context context, boolean z) {
        return Build.VERSION.SDK_INT >= 21 && A1z(context, z) && A0O(context).A29(A0P(2382, 35, 22), true);
    }

    public static boolean A21(Context context, boolean z) {
        return z && Build.VERSION.SDK_INT >= 19 && A0O(context).A29(A0P(2417, 24, 24), false);
    }

    public final double A22(String str, double d2) {
        String string = this.A00.getString(str, String.valueOf(d2));
        if (string != null) {
            try {
                if (string.equals(A0P(4298, 4, 28))) {
                    return d2;
                }
                d2 = Double.parseDouble(string);
                return d2;
            } catch (NumberFormatException unused) {
                return d2;
            }
        }
        return d2;
    }

    public final float A23(String str, float f2) {
        String string = this.A00.getString(str, String.valueOf(f2));
        if (string != null) {
            try {
                if (string.equals(A0P(4298, 4, 28))) {
                    return f2;
                }
                f2 = Float.parseFloat(string);
                return f2;
            } catch (NumberFormatException unused) {
                return f2;
            }
        }
        return f2;
    }

    public final int A24(String str, int i2) {
        String string = this.A00.getString(str, String.valueOf(i2));
        if (string != null) {
            try {
                if (string.equals(A0P(4298, 4, 28))) {
                    return i2;
                }
                i2 = Integer.parseInt(string);
                return i2;
            } catch (NumberFormatException unused) {
                return i2;
            }
        }
        return i2;
    }

    public final long A25(String str, long j2) {
        String string = this.A00.getString(str, String.valueOf(j2));
        if (string != null) {
            try {
                if (string.equals(A0P(4298, 4, 28))) {
                    return j2;
                }
                j2 = Long.parseLong(string);
                return j2;
            } catch (NumberFormatException unused) {
                return j2;
            }
        }
        return j2;
    }

    public final String A26(String str, String str2) {
        String string = this.A00.getString(str, str2);
        return (string == null || string.equals(A0P(4298, 4, 28))) ? str2 : string;
    }

    public final void A27(@Nullable String str) throws JSONException {
        A0c(str, null);
    }

    public final void A28(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        A0d(jSONObject, null);
    }

    public final boolean A29(String str, boolean z) {
        String string = this.A00.getString(str, String.valueOf(z));
        if (string != null) {
            boolean equals = string.equals(A0P(4298, 4, 28));
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            A03[7] = "2ZyfpebDvRtNljKwQKDVcWpHPVLB6mST";
            return equals ? z : Boolean.parseBoolean(string);
        }
        return z;
    }
}
