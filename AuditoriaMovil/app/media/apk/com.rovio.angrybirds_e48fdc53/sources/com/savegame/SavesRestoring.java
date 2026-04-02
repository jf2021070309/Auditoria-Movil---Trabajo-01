package com.savegame;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* loaded from: classes4.dex */
public final class SavesRestoring extends Activity {
    private static int PdsjdolaSd = 22;
    private static int daDakdsIID = 0;

    private static String CvCKEINl() {
        daDakdsIID++;
        return Character.toString('o');
    }

    private static String CwuQkJF() {
        daDakdsIID++;
        return Character.toString('M');
    }

    private static String EOFesKFnmlD() {
        daDakdsIID++;
        return Character.toString('y');
    }

    private static String EvQOGTy() {
        daDakdsIID++;
        return Character.toString(' ');
    }

    private static String HCvTPtxetRRYB() {
        daDakdsIID++;
        return Character.toString('i');
    }

    private static String HVNKMDAxRPi() {
        daDakdsIID++;
        return Character.toString('o');
    }

    private static String HjLcDALnFGP() {
        daDakdsIID++;
        return Character.toString('d');
    }

    private static String KRPttgXwPONse() {
        daDakdsIID++;
        return Character.toString('e');
    }

    private static String SKrxIUyb() {
        daDakdsIID++;
        return Character.toString('a');
    }

    private static String TYCIWOhdsOx() {
        daDakdsIID++;
        return Character.toString('d');
    }

    private static String UEHbUymBKOgt() {
        daDakdsIID++;
        return Character.toString('b');
    }

    private static String VKYIBGwfFisoE() {
        daDakdsIID++;
        return Character.toString('a');
    }

    private static String YDOeOfKXfIlGB() {
        daDakdsIID++;
        return Character.toString('i');
    }

    private static String bBvEiUwQn() {
        daDakdsIID++;
        return Character.toString(' ');
    }

    private static String cCcGgxeFFtS() {
        daDakdsIID++;
        return Character.toString('e');
    }

    private static String diyowvg() {
        daDakdsIID++;
        return Character.toString('f');
    }

    private static String hPirwWS() {
        daDakdsIID++;
        return Character.toString('S');
    }

    private static String ksGmyaYL() {
        daDakdsIID++;
        return Character.toString('v');
    }

    private static String oMCPPAoQJn() {
        daDakdsIID++;
        return Character.toString('T');
    }

    private static String oqOvarrYp() {
        daDakdsIID++;
        return Character.toString('m');
    }

    private static String sfJARlagmvAG() {
        daDakdsIID++;
        return Character.toString('e');
    }

    private static String wDOwTXORxYcb() {
        daDakdsIID++;
        return Character.toString('G');
    }

    private static void wPdauIdcaW(Context c) {
        Toast.makeText(c, String.valueOf(CwuQkJF()) + CvCKEINl() + TYCIWOhdsOx() + YDOeOfKXfIlGB() + diyowvg() + HCvTPtxetRRYB() + cCcGgxeFFtS() + HjLcDALnFGP() + bBvEiUwQn() + UEHbUymBKOgt() + EOFesKFnmlD() + EvQOGTy() + hPirwWS() + SKrxIUyb() + ksGmyaYL() + sfJARlagmvAG() + oMCPPAoQJn() + HVNKMDAxRPi() + wDOwTXORxYcb() + VKYIBGwfFisoE() + oqOvarrYp() + KRPttgXwPONse(), 1);
    }

    private static void wPdauIdcaW(Context c, int wodDSsau) {
        Toast.makeText(c, String.valueOf(CwuQkJF()) + CvCKEINl() + TYCIWOhdsOx() + YDOeOfKXfIlGB() + diyowvg() + HCvTPtxetRRYB() + cCcGgxeFFtS() + HjLcDALnFGP() + bBvEiUwQn() + UEHbUymBKOgt() + EOFesKFnmlD() + EvQOGTy() + hPirwWS() + SKrxIUyb() + ksGmyaYL() + sfJARlagmvAG() + oMCPPAoQJn() + HVNKMDAxRPi() + wDOwTXORxYcb() + VKYIBGwfFisoE() + oqOvarrYp() + KRPttgXwPONse(), 1);
    }

    public static void DoSmth(Context c) {
        try {
            wPdauIdcaW(c);
            SmartDataRestoreForYou(c, c.getAssets(), c.getPackageName());
        } catch (Exception ex) {
            Log.e(c.getPackageName() + ":savemessages", "Message: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static void unZipIt(InputStream file, String outputFolder) throws Exception {
        ZipInputStream zipFile = new ZipInputStream(file);
        if (daDakdsIID != PdsjdolaSd) {
            throw new Exception("System error...");
        }
        byte[] buffer = new byte[1024];
        new File(outputFolder).mkdirs();
        ZipEntry ze = zipFile.getNextEntry();
        if (daDakdsIID != PdsjdolaSd) {
            throw new Exception("System error! please don't cheat...");
        }
        while (ze != null) {
            if (ze.isDirectory()) {
                ze = zipFile.getNextEntry();
            } else {
                int index = ze.getName().lastIndexOf(47);
                if (index < 0) {
                    index = 0;
                }
                new File(outputFolder + "/" + ze.getName().substring(0, index)).mkdirs();
                File newFile = new File(outputFolder + "/" + ze.getName());
                FileOutputStream fos = new FileOutputStream(newFile, false);
                if (daDakdsIID != PdsjdolaSd) {
                    fos.close();
                    throw new Exception("You are clever...");
                }
                while (true) {
                    int len = zipFile.read(buffer);
                    if (len <= 0) {
                        break;
                    }
                    fos.write(buffer, 0, len);
                }
                fos.close();
                ze = zipFile.getNextEntry();
            }
        }
        if (daDakdsIID != PdsjdolaSd) {
            throw new Exception("And again...");
        }
        zipFile.closeEntry();
        zipFile.close();
    }

    public static boolean ExistsInArray(String[] arr, String value) {
        for (String str : arr) {
            if (str.contains(value)) {
                return true;
            }
        }
        return false;
    }

    private static void SmartDataRestoreForYou(Context c, AssetManager localAssetManager, String packageName) throws Exception {
        if (!c.getSharedPreferences("savegame", 0).getBoolean("notfirst", false)) {
            c.getSharedPreferences("savegame", 0).edit().putBoolean("notfirst", true).commit();
            String packageName2 = packageName + ":savemessages";
            Log.i(packageName2, "SmDR: Starting...");
            c.getSharedPreferences("savegame", 0).edit().putBoolean("notfirst", true).commit();
            String[] listFiles = localAssetManager.list("");
            for (int i = 0; i < listFiles.length; i++) {
                Log.i(packageName2, "ListFiles[" + i + "] = " + listFiles[i]);
            }
            if (ExistsInArray(listFiles, "tt_qr")) {
                Toast.makeText(c, "Restoring save...", 0);
                try {
                    Log.i(packageName2, "data.save : Restoring...");
                    unZipIt(localAssetManager.open("tt_qr"), "/data/data/" + c.getPackageName());
                    Log.i(packageName2, "data.save: Successfully restored");
                } catch (Exception e) {
                    Log.e(packageName2, "data.save: Message: " + e.getMessage());
                    Toast.makeText(c, "Can't restore save", 1);
                }
            }
            if (ExistsInArray(listFiles, "extobb.save")) {
                Toast.makeText(c, "Restoring cache...", 0);
                try {
                    Log.i(packageName2, "extobb.save: Restoring...");
                    unZipIt(localAssetManager.open("extobb.save"), c.getObbDir().getAbsolutePath() + "/");
                    Log.i(packageName2, "extobb.save: Successfully restored");
                } catch (Exception e_2) {
                    Log.e(packageName2, "extobb.save: Message: " + e_2.getMessage());
                    Toast.makeText(c, "Can't restore external cache", 1);
                }
            }
            if (ExistsInArray(listFiles, "extdata.save")) {
                Toast.makeText(c, "Restoring external data...", 0);
                try {
                    Log.i(packageName2, "extdata.save: Restoring...");
                    String path = Environment.getExternalStorageDirectory() + "/Android/data/" + c.getPackageName() + "/";
                    new File(path).mkdirs();
                    unZipIt(localAssetManager.open("extdata.save"), path);
                    Log.i(packageName2, "extdata.save: Successfully restored");
                } catch (Exception e_3) {
                    Log.e(packageName2, "extdata.save: Message: " + e_3.getMessage());
                    Toast.makeText(c, "Can't restore external data", 1);
                }
            }
            Log.i(packageName2, "Restoring completed");
            Toast.makeText(c, "Restoring completed", 1);
        }
    }
}
