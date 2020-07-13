package com.livewallrcandrapp.ffmpegvideocrop;

import android.util.Log;

public class FFMpegCommandBuild {

    private static final String TAG = "FFMpegCommandBuild";

    /**
     * device sdk version
     */
    private int mSdkVersion;

    /**
     * codec need or not
     */
    private boolean isCodecNeed = false;

    /**
     * command array
     */
    private String[] cmd;


    /**
     * set sdk version
     * @param mSdkVersion
     */
    public void setMSdkVersion(int mSdkVersion) { this.mSdkVersion = mSdkVersion; }

    /**
     * is codec need
     * @param isCodecNeed
     */
    public void setIsCodecNeed(boolean isCodecNeed) { this.isCodecNeed = isCodecNeed; }

    /**
     * build command array
     * @return
     */
    public String[] getCommand(String startTime, String endTime, String input, String outPut) {

        String videoCodec;
        String threadNumber;
        String presetValue;
        String strictValue;
        String vfValue;
        String[] cmd = null;

        if (mSdkVersion > 15) {
            switch (mSdkVersion) {
                case 16:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 17:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 18:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 19:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 20:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 21:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 22:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 23:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 24:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 25:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 26:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 27:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 28:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 29:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
                case 30:
                    if (isCodecNeed) {
                        videoCodec = "vp9";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        vfValue = "crop=640:256:0:400";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue,
                                vfValue);
                    } else {
                        videoCodec = "copy";
                        threadNumber = "5";
                        presetValue = "ultrafast";
                        strictValue = "-2";
                        cmd = buildCMDString(
                                startTime,
                                endTime,
                                input,
                                outPut,
                                videoCodec,
                                threadNumber,
                                presetValue,
                                strictValue);
                    }
                    break;
            }
        } else {
            Log.e(TAG, "[getCommand] sdk version is not valid");
        }
        return cmd;
    }

    /**
     * build command string array
     * @param startTime
     * @param endTime
     * @param input
     * @param output
     * @param videoCodec
     * @param threadNumber
     * @param presetValue
     * @param strictValue
     * @param vfValue
     * @return
     */
    private String[] buildCMDString(String startTime,
                                    String endTime,
                                    String input,
                                    String output,
                                    String videoCodec,
                                    String threadNumber,
                                    String presetValue,
                                    String strictValue,
                                    String vfValue) {
        String[] cmd = new String[] {
                "-y",
                "-i",
                input,
                "-ss",
                startTime,
                "-to",
                endTime,
                "-c:v",
                videoCodec,
                "-vf",
                vfValue,
                "-threads",
                threadNumber,
                "-preset",
                presetValue,
                "-strict",
                strictValue,
                "-async",
                "1",
                output
        };
        return cmd;

    }

    /**
     * build command string array
     * @param startTime
     * @param endTime
     * @param input
     * @param output
     * @param videoCodec
     * @param threadNumber
     * @param presetValue
     * @param strictValue
     * @return
     */
    private String[] buildCMDString(String startTime,
                                    String endTime,
                                    String input,
                                    String output,
                                    String videoCodec,
                                    String threadNumber,
                                    String presetValue,
                                    String strictValue) {
        String[] cmd = new String[] {
                "-y",
                "-i",
                input,
                "-ss",
                startTime,
                "-to",
                endTime,
                "-c:v",
                videoCodec,
                "-threads",
                threadNumber,
                "-preset",
                presetValue,
                "-strict",
                strictValue,
                "-async",
                "1",
                output
        };
        return cmd;

    }


}

