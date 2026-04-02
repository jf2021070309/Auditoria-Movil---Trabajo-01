package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: UMDBUtils.java */
/* loaded from: classes3.dex */
public class h {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r12, android.database.sqlite.SQLiteDatabase r13) {
        /*
            r0 = 0
            if (r12 != 0) goto L5
            return r0
        L5:
            r1 = 0
            java.lang.String r2 = "count(*)"
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            r2 = 2
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            java.lang.String r2 = "table"
            r7[r0] = r2     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            java.lang.String r12 = r12.trim()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            r2 = 1
            r7[r2] = r12     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            java.lang.String r4 = "sqlite_master"
            java.lang.String r6 = "type=? and name=?"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r3 = r13
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            boolean r12 = r1.moveToNext()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            if (r12 == 0) goto L34
            int r12 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            if (r12 <= 0) goto L34
            r0 = r2
        L34:
            if (r1 == 0) goto L45
        L36:
            r1.close()
            goto L45
        L3a:
            r12 = move-exception
            if (r1 == 0) goto L40
            r1.close()
        L40:
            throw r12
        L41:
            r12 = move-exception
            if (r1 == 0) goto L45
            goto L36
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.h.a(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File databasePath = context.getDatabasePath(e.b);
            if (databasePath != null && databasePath.exists()) {
                databasePath.delete();
            }
            f.a(context).a();
        } catch (Throwable th) {
        }
    }

    public static String b(Context context) {
        File databasePath = context.getDatabasePath(e.b);
        return databasePath.getParent() + File.separator;
    }

    public static String c(Context context) {
        return b(context) + e.a;
    }

    public static String a(List<String> list) {
        return TextUtils.join("!", list);
    }

    public static List<String> a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    public static List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : list) {
                if (Collections.frequency(arrayList, str) < 1) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r9.isClosed() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r9.isClosed() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.database.sqlite.SQLiteDatabase r10, java.lang.String r11, java.lang.String r12) {
        /*
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            java.lang.String r7 = "LIMIT 0"
            r0 = r10
            r1 = r11
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L35
            if (r9 == 0) goto L1c
            int r10 = r9.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L35
            r11 = -1
            if (r10 == r11) goto L1c
            r10 = 1
            r8 = r10
        L1c:
            if (r9 == 0) goto L3f
            boolean r10 = r9.isClosed()
            if (r10 != 0) goto L3f
        L24:
            r9.close()
            goto L3f
        L28:
            r10 = move-exception
            if (r9 == 0) goto L34
            boolean r11 = r9.isClosed()
            if (r11 != 0) goto L34
            r9.close()
        L34:
            throw r10
        L35:
            r10 = move-exception
            if (r9 == 0) goto L3f
            boolean r10 = r9.isClosed()
            if (r10 != 0) goto L3f
            goto L24
        L3f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.h.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.execSQL("alter table " + str + " add " + str2 + " " + str3);
    }
}
