package com.livewallrcandrapp.ffmpegvideocrop;

import android.content.Context;
import android.util.Log;

import com.github.hiteshsondhi88.libffmpeg.ExecuteBinaryResponseHandler;
import com.github.hiteshsondhi88.libffmpeg.FFmpeg;
import com.github.hiteshsondhi88.libffmpeg.exceptions.FFmpegCommandAlreadyRunningException;

public class FFmpegCommandExecute {

    private static final String TAG = "FFmpegCommandExecute";

    /**
     * mFFmpeg is instance of FFmpeg
     */
    private  FFmpeg mFFmpeg;

    /**
     * command array collection
     */
    private  String[] cmd;

    /**
     * application context
     */
    private Context mContext;

    /**
     * command listener interface instance
     */
    private onExecuteCommandListener mOnExecuteCommandListener;


    /**
     * command execute
     * @param fFmpeg
     * @param context
     */
    public void executeCommand(FFmpeg fFmpeg, Context context) {
        this.mFFmpeg = fFmpeg;
        this.mContext = context;
        Log.i(TAG, "[ execute command ]");
        Log.i(TAG, "[ FFmpeg: ] "+fFmpeg);
        Log.i(TAG, "[ context: ] "+context);
        execute();
    }

    /**
     * command execute
     * @param fFmpeg
     * @param context
     * @param cmd
     */
    public void executeCommand(FFmpeg fFmpeg, Context context, String[] cmd) {
            this.mFFmpeg = fFmpeg;
            this.mContext = context;
            this.cmd = cmd;
        Log.i(TAG, "[ execute command ]");
        Log.i(TAG, "[ FFmpeg: ] "+fFmpeg);
        Log.i(TAG, "[ context: ] "+context);
        Log.i(TAG, "[ cmd: ] "+cmd.length);

        execute();
    }

    /**
     * set all listener
     * @param mOnExecuteCommandListener
     */
    public void setExecuteListener(onExecuteCommandListener mOnExecuteCommandListener) {
        this.mOnExecuteCommandListener = mOnExecuteCommandListener;
    }

    /**
     * execute starter
     * call all on call listener in events fire
     */
    private void execute() {
        if (mFFmpeg == null) {
            Log.i(TAG, "[ FFmpeg is null ]");
            mFFmpeg = FFmpeg.getInstance(mContext);
        }

        try {
            mFFmpeg.execute(cmd, new ExecuteBinaryResponseHandler() {

                @Override
                public void onStart() {
                    Log.i(TAG, " [ execute onStart ] ");
                    mOnExecuteCommandListener.onExecuteStart();
                }

                @Override
                public void onProgress(String message) {
                    Log.i(TAG, " [ execute onProgress ] "+message);
                    mOnExecuteCommandListener.onExecuteProgress(message);
                }

                @Override
                public void onFailure(String message) {
                    Log.i(TAG, " [ execute onFailure ] "+message);
                    mOnExecuteCommandListener.onExecuteFailure(message);
                }

                @Override
                public void onSuccess(String message) {
                    Log.i(TAG, " [ execute onSuccess ] " +message);
                    mOnExecuteCommandListener.onExecuteSuccess(message);
                }

                @Override
                public void onFinish() {
                    Log.i(TAG, " [ execute onFinish ] ");
                    mOnExecuteCommandListener.onExecuteFinish();
                }
            });
        } catch (FFmpegCommandAlreadyRunningException exe) {
            Log.i(TAG, " [ execute exception ] "+exe.getMessage());
            mOnExecuteCommandListener.onExecuteFailure("Exception: "+exe.getMessage());
        }
    }

}
