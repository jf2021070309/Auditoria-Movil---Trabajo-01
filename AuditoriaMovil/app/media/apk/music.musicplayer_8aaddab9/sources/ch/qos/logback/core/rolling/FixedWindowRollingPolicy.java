package ch.qos.logback.core.rolling;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.RenameUtil;
import e.a.d.a.a;
import java.io.File;
import java.util.Date;
/* loaded from: classes.dex */
public class FixedWindowRollingPolicy extends RollingPolicyBase {
    public static final String FNP_NOT_SET = "The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. ";
    private static int MAX_WINDOW_SIZE = 20;
    public static final String PRUDENT_MODE_UNSUPPORTED = "See also http://logback.qos.ch/codes.html#tbr_fnp_prudent_unsupported";
    public static final String SEE_PARENT_FN_NOT_SET = "Please refer to http://logback.qos.ch/codes.html#fwrp_parentFileName_not_set";
    public static final String ZIP_ENTRY_DATE_PATTERN = "yyyy-MM-dd_HHmm";
    public Compressor compressor;
    public RenameUtil util = new RenameUtil();
    public int minIndex = 1;
    public int maxIndex = 7;

    private String transformFileNamePatternFromInt2Date(String str) {
        return FileFilterUtil.afterLastSlash(FileFilterUtil.slashify(str)).replace("%i", "%d{yyyy-MM-dd_HHmm}");
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public String getActiveFileName() {
        return getParentsRawFileProperty();
    }

    public int getMaxIndex() {
        return this.maxIndex;
    }

    public int getMaxWindowSize() {
        return MAX_WINDOW_SIZE;
    }

    public int getMinIndex() {
        return this.minIndex;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public void rollover() throws RolloverFailure {
        Compressor compressor;
        String activeFileName;
        String convertInt;
        String str;
        if (this.maxIndex >= 0) {
            File file = new File(this.fileNamePattern.convertInt(this.maxIndex));
            if (file.exists()) {
                file.delete();
            }
            for (int i2 = this.maxIndex - 1; i2 >= this.minIndex; i2--) {
                String convertInt2 = this.fileNamePattern.convertInt(i2);
                if (new File(convertInt2).exists()) {
                    this.util.rename(convertInt2, this.fileNamePattern.convertInt(i2 + 1));
                } else {
                    addInfo("Skipping roll-over for inexistent file " + convertInt2);
                }
            }
            int ordinal = this.compressionMode.ordinal();
            if (ordinal == 0) {
                this.util.rename(getActiveFileName(), this.fileNamePattern.convertInt(this.minIndex));
                return;
            }
            if (ordinal == 1) {
                compressor = this.compressor;
                activeFileName = getActiveFileName();
                convertInt = this.fileNamePattern.convertInt(this.minIndex);
                str = null;
            } else if (ordinal != 2) {
                return;
            } else {
                compressor = this.compressor;
                activeFileName = getActiveFileName();
                convertInt = this.fileNamePattern.convertInt(this.minIndex);
                str = this.zipEntryFileNamePattern.convert(new Date());
            }
            compressor.compress(activeFileName, convertInt, str);
        }
    }

    public void setMaxIndex(int i2) {
        this.maxIndex = i2;
    }

    public void setMinIndex(int i2) {
        this.minIndex = i2;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.util.setContext(this.context);
        if (this.fileNamePatternStr == null) {
            addError(FNP_NOT_SET);
            addError(CoreConstants.SEE_FNP_NOT_SET);
            throw new IllegalStateException("The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
        }
        this.fileNamePattern = new FileNamePattern(this.fileNamePatternStr, this.context);
        determineCompressionMode();
        if (isParentPrudent()) {
            addError("Prudent mode is not supported with FixedWindowRollingPolicy.");
            addError(PRUDENT_MODE_UNSUPPORTED);
            throw new IllegalStateException("Prudent mode is not supported.");
        } else if (getParentsRawFileProperty() == null) {
            addError("The File name property must be set before using this rolling policy.");
            addError(SEE_PARENT_FN_NOT_SET);
            throw new IllegalStateException("The \"File\" option must be set.");
        } else {
            if (this.maxIndex < this.minIndex) {
                StringBuilder y = a.y("MaxIndex (");
                y.append(this.maxIndex);
                y.append(") cannot be smaller than MinIndex (");
                y.append(this.minIndex);
                y.append(").");
                addWarn(y.toString());
                addWarn("Setting maxIndex to equal minIndex.");
                this.maxIndex = this.minIndex;
            }
            int maxWindowSize = getMaxWindowSize();
            if (this.maxIndex - this.minIndex > maxWindowSize) {
                addWarn("Large window sizes are not allowed.");
                this.maxIndex = this.minIndex + maxWindowSize;
                StringBuilder y2 = a.y("MaxIndex reduced to ");
                y2.append(this.maxIndex);
                addWarn(y2.toString());
            }
            if (this.fileNamePattern.getIntegerTokenConverter() == null) {
                StringBuilder y3 = a.y("FileNamePattern [");
                y3.append(this.fileNamePattern.getPattern());
                y3.append("] does not contain a valid IntegerToken");
                throw new IllegalStateException(y3.toString());
            }
            if (this.compressionMode == CompressionMode.ZIP) {
                this.zipEntryFileNamePattern = new FileNamePattern(transformFileNamePatternFromInt2Date(this.fileNamePatternStr), this.context);
            }
            Compressor compressor = new Compressor(this.compressionMode);
            this.compressor = compressor;
            compressor.setContext(this.context);
            super.start();
        }
    }
}
