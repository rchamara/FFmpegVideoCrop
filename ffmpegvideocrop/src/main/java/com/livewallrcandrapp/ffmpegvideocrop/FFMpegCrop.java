package com.livewallrcandrapp.ffmpegvideocrop;

import android.content.Context;

import android.util.Log;

import nl.bravobit.ffmpeg.FFmpeg;


public class FFMpegCrop {

    private static final String TAG = "FFMpegFactory";
    private FFmpeg mFFmpeg;
    private Thread mThread;
    private onLoadBinaryListener mOnLoadBinaryListener;
    private String[] cmd;

    /**
     * crop start time in milli second
     * */
    private long mStartTimeMilli;

    /**
     * crop end time in milli second
     * */
    private long mEndTimeMilli;

    /**
     * crop video url
     * */
    private String mInputVideoUrl;

    /**
     * output video url
     * */
    private String mOutputVideoUrl;

    /**
     * get application context
     */
    private Context mContext;

    /**
     * time in long
     * @param mStartTimeMilli
     */
    public void setStartTime(long mStartTimeMilli) {
        this.mStartTimeMilli = mStartTimeMilli;
    }

    /**
     * time in long
     * @param mEndTimeMilli
     */
    public void setEndTime(long mEndTimeMilli) {
        this.mEndTimeMilli = mEndTimeMilli;
    }

    /**
     * video url in string format
     * @param mInputVideoUrl
     */
    public void setInputVideo(String mInputVideoUrl) {
        this.mInputVideoUrl = mInputVideoUrl;
    }


    /**
     * video url in string format
     * @param mOutputVideoUrl
     */
    public void setOutputVideo(String mOutputVideoUrl) {
        this.mOutputVideoUrl = mOutputVideoUrl;
    }

    /**
     * application context
     * @param context
     */
    public void applicationContext(Context context) {
        this.mContext =context;
    }

    /**
     * crop the video using ffmpeg
     */
    public void Crop() {
        setCMD();
        mCropThread();
        startBackGroundWork();
    }

    /**
     * set instance of all events
     * call listener in calling methods
     * @param mOnLoadBinaryListener
     */
    public void setOnCropListener(onLoadBinaryListener mOnLoadBinaryListener) { this.mOnLoadBinaryListener = mOnLoadBinaryListener; }

    /**
     * start background thread
     */
    private void startBackGroundWork() {
        mThread.start();
    }

    /**
     * arrange the command list array
     */
    private void setCMD() {

      String startTime = TimeUtil.getTimeFormat(mStartTimeMilli);
      String endTime   = TimeUtil.getTimeFormat(mEndTimeMilli);

      Log.i(TAG, " [Start Time: ] "+startTime);
      Log.i(TAG, " [End Time: ] "+endTime);

      Log.i(TAG, "[ Input URL: ] "+mInputVideoUrl);
      Log.i(TAG, "[ Output URL: ] "+mOutputVideoUrl);
      cmd = new String[]{
              "-y",
              "-i",
              mInputVideoUrl,
              "-ss",
              startTime,
              "-to",
              endTime,
              "-async",
              "1",
              mOutputVideoUrl
      };



    }

    /**
     * create runnable thread for run in background
     */
    private void mCropThread() {
        if (FFmpeg.getInstance(mContext).isSupported()) {
            mThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Log.i(TAG," [Crop Starting...] ");
                    mFFmpeg = FFmpeg.getInstance(mContext);
                    try {
                        Log.i(TAG, "[ ffmpeg loading success ]");
                        FFmpegCommandExecute mFFmpegCommandExecute = new FFmpegCommandExecute();
                        mFFmpegCommandExecute.setExecuteListener(new onExecuteCommandListener() {
                            @Override
                            public void onExecuteStart() {
                                mOnLoadBinaryListener.onLoadBinaryStart("[Execution start]");
                            }

                            @Override
                            public void onExecuteProgress(String message) {
                                mOnLoadBinaryListener.onLoadBinaryProgress("[ command executing progress]");
                            }

                            @Override
                            public void onExecuteFailure(String message) {
                                mOnLoadBinaryListener.onLoadBinaryFailure("[command execute fail: ] "+message);
                            }

                            @Override
                            public void onExecuteSuccess(String message) {
                                mOnLoadBinaryListener.onLoadBinarySuccess("[ command execute success ] "+message);
                            }

                            @Override
                            public void onExecuteFinish() {
                                mOnLoadBinaryListener.onLoadBinaryFinish("[ command execute finished ]");
                            }
                        });
                        mFFmpegCommandExecute.executeCommand(mFFmpeg, mContext, cmd);

                    } catch (Exception exc) {
                        Log.e(TAG,"[Error :] " +exc.getMessage());
                        mOnLoadBinaryListener.onLoadBinaryFailure("[ Load binary fail: ] "+exc.getMessage());
                    }
                }
            });
        } else {

        }
    }
}
