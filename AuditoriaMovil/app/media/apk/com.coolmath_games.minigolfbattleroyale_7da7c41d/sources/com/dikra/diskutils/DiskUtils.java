package com.dikra.diskutils;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import java.math.BigInteger;
/* loaded from: classes.dex */
public class DiskUtils {
    private static final long MEGA_BYTE = 1048576;

    public static int totalSpace(boolean z) {
        long blockCountLong;
        long blockSizeLong;
        StatFs stats = getStats(z);
        if (Build.VERSION.SDK_INT < 18) {
            blockCountLong = stats.getBlockCount();
            blockSizeLong = stats.getBlockSize();
        } else {
            blockCountLong = stats.getBlockCountLong();
            blockSizeLong = stats.getBlockSizeLong();
        }
        return BigInteger.valueOf(blockCountLong).multiply(BigInteger.valueOf(blockSizeLong)).divide(BigInteger.valueOf(1048576L)).intValue();
    }

    public static int availableSpace(boolean z) {
        long availableBlocksLong;
        long blockSizeLong;
        StatFs stats = getStats(z);
        if (Build.VERSION.SDK_INT < 18) {
            availableBlocksLong = stats.getAvailableBlocks();
            blockSizeLong = stats.getBlockSize();
        } else {
            availableBlocksLong = stats.getAvailableBlocksLong();
            blockSizeLong = stats.getBlockSizeLong();
        }
        return BigInteger.valueOf(availableBlocksLong).multiply(BigInteger.valueOf(blockSizeLong)).divide(BigInteger.valueOf(1048576L)).intValue();
    }

    public static int busySpace(boolean z) {
        BigInteger multiply;
        BigInteger multiply2;
        StatFs stats = getStats(z);
        if (Build.VERSION.SDK_INT < 18) {
            multiply = BigInteger.valueOf(stats.getBlockCount()).multiply(BigInteger.valueOf(stats.getBlockSize()));
            multiply2 = BigInteger.valueOf(stats.getFreeBlocks()).multiply(BigInteger.valueOf(stats.getBlockSize()));
        } else {
            multiply = BigInteger.valueOf(stats.getBlockCountLong()).multiply(BigInteger.valueOf(stats.getBlockSizeLong()));
            multiply2 = BigInteger.valueOf(stats.getFreeBlocksLong()).multiply(BigInteger.valueOf(stats.getBlockSizeLong()));
        }
        return multiply.subtract(multiply2).divide(BigInteger.valueOf(1048576L)).intValue();
    }

    private static StatFs getStats(boolean z) {
        String absolutePath;
        if (z) {
            absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        } else {
            absolutePath = Environment.getRootDirectory().getAbsolutePath();
        }
        return new StatFs(absolutePath);
    }
}
