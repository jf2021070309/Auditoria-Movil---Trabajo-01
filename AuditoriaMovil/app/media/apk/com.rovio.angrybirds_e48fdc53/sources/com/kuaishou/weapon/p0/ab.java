package com.kuaishou.weapon.p0;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
/* loaded from: classes.dex */
public class ab {
    public static String a() {
        String readLine;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/status"));
            while (true) {
                try {
                    readLine = bufferedReader2.readLine();
                    if (!readLine.contains("TracerPid")) {
                        if (readLine == null) {
                            readLine = "";
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e2) {
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e3) {
                        }
                    }
                    throw th;
                }
            }
            String replace = readLine.replace("\t", " ");
            try {
                bufferedReader2.close();
            } catch (Exception e4) {
            }
            return replace;
        } catch (Exception e5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 8192).flags & 2) == 1;
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean b() {
        try {
            return Boolean.valueOf(Debug.isDebuggerConnected()).booleanValue();
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean b(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 8192).flags & 2) == 1) {
                    return true;
                }
            } else if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 8192).flags & 2) == 1) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }
}
